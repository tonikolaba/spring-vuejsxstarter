<template>
  <div v-if="this.customer">
    <h4>Customer</h4>
    <div>
      <label> <font-awesome-icon icon="user" /> Name:</label> {{this.customer.name}}
    </div>
    <div>
      <label> <font-awesome-icon icon="ellipsis-v" /> Age: </label> {{this.customer.age}}
    </div>
    <div>
      <label> <font-awesome-icon icon="times" />
 Active: </label> {{this.customer.active}}
    </div>

    <button v-if="this.customer.active"
      v-on:click="updateActive(false)"
      class="button is-small btn-primary"> <font-awesome-icon icon="user-minus" />
 Inactive</button>
    <button v-else
      v-on:click="updateActive(true)"
      class="button is-small btn-primary"> <font-awesome-icon icon="user-plus" />
 Active</button>

    <button class="button is-small btn-danger" v-on:click="deleteCustomer()"> <font-awesome-icon icon="trash-alt" />
 Delete</button>
  </div>
  <div v-else>
    <br/>
    <p>Please click on a Customer...</p>
  </div>
</template>

<script>
import http from "../http-common";

export default {
  name: "customer",
  props: ["customer"],
  methods: {
    /* eslint-disable no-console */
    updateActive(status) {
      var data = {
        id: this.customer.id,
        name: this.customer.name,
        age: this.customer.age,
        active: status
      };

      http
        .put("/customer/" + this.customer.id, data)
        .then(response => {
          this.customer.active = response.data.active;
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    },
    deleteCustomer() {
      http
        .delete("/customer/" + this.customer.id)
        .then(response => {
          console.log(response.data);
          this.$emit("refreshData");
          this.$router.push('/');
        })
        .catch(e => {
          console.log(e);
        });
    }
    /* eslint-enable no-console */
  }
};
</script>

<style>

</style>
