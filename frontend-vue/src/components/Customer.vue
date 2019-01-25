<template>
  <div v-if="this.customer">
    <h4>Customer</h4>
    <div>
      <label> <i class="fa fa-user-o" aria-hidden="true"></i> Name:</label> {{this.customer.name}}
    </div>
    <div>
      <label> <i class="fa fa-arrow-down" aria-hidden="true"></i> Age: </label> {{this.customer.age}}
    </div>
    <div>
      <label> <i class="fa fa-star-half-o" aria-hidden="true"></i>
 Active: </label> {{this.customer.active}}
    </div>

    <button v-if="this.customer.active"
      v-on:click="updateActive(false)"
      class="button is-small btn-primary"> <i class="fa fa-user-times" aria-hidden="true"></i>
 Inactive</button>
    <button v-else
      v-on:click="updateActive(true)"
      class="button is-small btn-primary"> <i class="fa fa-user-plus" aria-hidden="true"></i>
 Active</button>

    <button class="button is-small btn-danger" v-on:click="deleteCustomer()"> <i class="fa fa-user-times" aria-hidden="true"></i>
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
@import url("https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css");
</style>
