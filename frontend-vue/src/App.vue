<template>
    <div id="app" class="container-fluid">
        <div class="site-info">
            <img src="./assets/logo.png">
            <h3 class="titulli"> <i class="fa fa-file-code-o" aria-hidden="true"></i>
 <a class="titulli1" href="https://spring.io/projects/spring-boot">Spring Boot</a> <i class="fa fa-plus-square-o" aria-hidden="true"></i>
 <a class="titulli1" href="https://vuejs.org/">Vue.js</a> <i class="fa fa-times" aria-hidden="true"></i> Starter</h3>
            <br/>
        </div>
        <nav>
        <hr class="hr"/>
            <router-link class="btn btn-primary" to="/"><i class="fa fa-user" aria-hidden="true"></i>
Customers</router-link>
            <router-link class="btn btn-primary" to="/add"> <i class="fa fa-user-plus" aria-hidden="true"></i>

 Add</router-link>
            <router-link class="btn btn-primary" to="/search"> <i class="fa fa-search" aria-hidden="true"></i>
 Search</router-link>
        <hr class="hr"/>
        </nav>
        <br/>
        <router-view/>
        <hr class="hr"/>
          <div>
             <i class="fa fa-code" aria-hidden="true"></i> <i class="fa fa-heart" aria-hidden="true"></i>
by: <a href="#">@tonikolaba</a>
          </div>
        <hr class="hr"/>
    </div>
</template>


<script>

export default {
  name: "app",

};
</script>

<style>



@import url("https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css");

body {
  padding-top: 85px;
}

.titulli {
  text-transform: uppercase;
  color:#fff;
  }
.titulli1 {
  text-transform: capitalize;
  }
.titulli2 {
  color: #007bff;
  }

  /*
  background-color: #3b5998;
  background-image: linear-gradient(#4e69a2 100%, #3b5998 50%);
  border-bottom: 1px solid #133783;
  */

.hr {
     background-color:#11B7D9;
  }

.site-info {
  color:#757575;
  margin-bottom: 20px;
  background-color: #63a4ff;
  background-image: linear-gradient(315deg, #83eaf1 0%, #63a4ff 74%);

}

.btn-primary {
  margin-right: 5px;
}

.container-fluid {
  text-align: center;
}
</style>
