<template>
  <div class="searchform">
    <h4> <font-awesome-icon icon="user" /> Find by Age</h4>
    <div class="form-group">
      <input type="number" class="form-control" id="age" required v-model="age" name="age">
    </div>

    <div class="btn-group">
      <button v-on:click="searchCustomers" class="btn btn-success"> <font-awesome-icon icon="search" />
 Search</button>
    </div>

    <ul class="search-result">
      <ol v-for="(customer, index) in customers" :key="index">
        <h6><i class="fa fa-user" aria-hidden="true"></i> {{customer.name}} ({{customer.age}})</h6>
      </ol>
    </ul>
  </div>
</template>

<script>
import http from "../http-common";

export default {
  name: "search-customer",
  data() {
    return {
      age: 0,
      customers: []
    };
  },
  methods: {
    /* eslint-disable no-console */
    searchCustomers() {
      http
        .get("/customers/age/" + this.age)
        .then(response => {
          this.customers = response.data; // JSON are parsed automatically.
          console.log(response.data);
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

.searchform {
  max-width: 300px;
  margin: auto;
}
.search-result {
  margin-top: 20px;
  text-align: left;
}
</style>
