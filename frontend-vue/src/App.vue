<template>
    <div id="app" class="container-fluid">
    <a href="https://github.com/tonikolaba/spring-vuejsxstarter" target="_blank" rel="noopener noreferrer" aria-label="View source on GitHub" class="github-corner"><svg width="80" height="80" viewBox="0 0 250 250" aria-hidden="true" style="fill: rgb(21, 21, 19); color: rgb(255, 255, 255); position: absolute; border: 0px none; top: 0px; right: 0px;"><path d="M0,0 L115,115 L130,115 L142,142 L250,250 L250,0 Z"></path> <path d="M128.3,109.0 C113.8,99.7 119.0,89.6 119.0,89.6 C122.0,82.7 120.5,78.6 120.5,78.6 C119.2,72.0 123.4,76.3 123.4,76.3 C127.3,80.9 125.5,87.3 125.5,87.3 C122.9,97.6 130.6,101.9 134.4,103.2" fill="currentColor" class="octo-arm" style="transform-origin: 130px 106px 0px;"></path> <path d="M115.0,115.0 C114.9,115.1 118.7,116.5 119.8,115.4 L133.7,101.6 C136.9,99.2 139.9,98.4 142.2,98.6 C133.8,88.0 127.5,74.4 143.8,58.0 C148.5,53.4 154.0,51.2 159.7,51.0 C160.3,49.4 163.2,43.6 171.4,40.1 C171.4,40.1 176.1,42.5 178.8,56.2 C183.1,58.6 187.2,61.8 190.9,65.4 C194.5,69.0 197.7,73.2 200.1,77.6 C213.8,80.2 216.3,84.9 216.3,84.9 C212.7,93.1 206.9,96.0 205.4,96.6 C205.1,102.4 203.0,107.8 198.3,112.5 C181.9,128.9 168.3,122.5 157.7,114.1 C157.9,116.9 156.7,120.9 152.7,124.9 L141.0,136.5 C139.8,137.7 141.6,141.9 141.8,141.8 Z" fill="currentColor" class="octo-body"></path></svg></a>

    </a>
        <div class="site-info">
            <img src="./assets/logo.png">
            <h3 class="titulli1"> <font-awesome-icon icon="file-code" />
  Spring Boot <font-awesome-icon icon="plus" /> Vue.js <font-awesome-icon icon="hand-point-right" /> <a class="titulli1" href="https://github.com/tonikolaba/spring-vuejsxstarter.git"> Starter </a></h3>
            <br/>
        </div>
        <hr class="hr"/>
        <nav class="btn btn-group">
            <router-link class="btn btn-primary" to="/"><font-awesome-icon icon="users" />
Customers</router-link>
            <router-link class="btn btn-primary" to="/add"> <font-awesome-icon icon="user-plus" />
 Add</router-link>
            <router-link class="btn btn-primary" to="/search"> <font-awesome-icon icon="search" />
 Search</router-link>
        </nav>
       <hr class="hr"/>
        <br/>
        <router-view/>
        <hr class="hr"/>
          <div>
               <span class="btn-group btn-group-justified">
            		<gh-btns-watch slug="tonikolaba/spring-vuejsxstarter" show-count></gh-btns-watch>
            		<gh-btns-star slug="tonikolaba/spring-vuejsxstarter" show-count></gh-btns-star>
            		<gh-btns-fork slug="tonikolaba/spring-vuejsxstarter" show-count></gh-btns-fork>
            		<gh-btns-follow user="tonikolaba" show-count></gh-btns-follow>
              </span>

             <font-awesome-icon icon="code" /> with <font-awesome-icon icon="heart" />
by: <a href="https://github.com/tonikolaba">@tonikolaba</a>
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

body {
  padding-top: 20px;
}

.titulli1 {
  text-transform: capitalize;
  color:#fff;
  }

.hr {
     background-color:#11B7D9;
  }

.site-info {
  color: #3b5998;
  margin-bottom: 20px;
  background-color: #416be1;
  background-image: linear-gradient(to right, #007bff, #3385ff, #4c8fff, #5f99fe, #71a3fd, #7eaafc, #8ab2fc, #96b9fb, #a1c0fb, #acc7fb, #b6cefb, #c1d5fb);
  border-bottom: 1px solid #87B0FB;
}

.btn-primary {
  margin-right: 5px;
  max-width: 100%;
  height: auto;
  width: auto\9; /* ie8 */
}

img {
    max-width: 100%;
    height: auto;
    width: auto\9; /* ie8 */
}

.btn-info {
  margin-right: 10px;
}
.container-fluid {
  text-align: center;
}
</style>
