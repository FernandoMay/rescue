<template>
  <div class="nav-wrap"> <!-- container nav -->
    <div class="container"> <!-- container -->
      <img alt="Rescue me logo" src="../assets/logo.png" class="icon_user"> <!-- icon -->
    </div>
    <div class="container"> 
      <h5>Rescue me!</h5> <!-- title -->
    </div>
    <div class="container">
      <button class="btn">Cerrar Sesion</button> <!-- btn with function -->
    </div>
  </div>
</template>

<script>
    //imports
  //conextion
import db from "./../components/firebaseInit"; //db from firebase
import firebase from 'firebase'; //firebase object

export default { //default
    name: 'Navbar',
}
</script>

<style>

.nav-wrap{
  display: flex;
  text-align: center;
  background-color: #78909c;
}
.container{
  display: block;
  background: #42a5f5;
}

h6{
  display: inline;
  margin: 15px;
}

.icon_function{
  width: 40px;
  height: 40px;
  margin-left: 40px;;
  vertical-align: middle;
}

.icon_user{
  width: 40px;
  height: 40px;
  margin-left: 10px;
  vertical-align: middle;
  margin-top: 10px;
}

.btn{
  background-color: rgba(255, 255, 255, 0.651);
  color:black;
  vertical-align: middle;
  margin-top: 10px;
}

.special_btn{
  margin: 10px;
}

.subcontainer{
  display: inline-block;
  margin-left: 10%;;
}

</style>
