<template>
  <div class="Dashboard">
    <div class="item">
      <div class="maps">
        <Maps/>
        <Simbologia/>
      </div>
      <div class="perfil">
        <Perfil/>
      </div>
    </div>
  </div>
</template>

<script>
  //conexion
import db from './../components/firebaseInit' //firebase db
import firebase from './../components/firebaseConfig' //firebase object
  //Componentes
import Maps from './../components/Maps.vue'
import Perfil from './../components/Perfil.vue'
import Simbologia from './../components/Simbologia.vue'
export default {
  name: 'dashboard',
  components: {
    Maps,
    Perfil, Simbologia
  },
  data(){
    return{
      event_data:[],
      users_data:[],
      servicios:[],
      cat:'rescue',
      id:'',
      photo:'https://firebasestorage.googleapis.com/v0/b/rescueme-90ae8.appspot.com/o/logo.png?alt=media&token=0d083888-bdce-4b0a-8a17-2eecb365594b',
      //Personal
      nombre:'',
      nickname:'',
      edad:'',
      sangre:'',
    }
  },
  created(){
    db.collection("event") //get event data
      .where("estado","==","Activo")
      .get()
      .then(querySnapshot => { //create object
        querySnapshot.forEach(doc => { //iterate object
        const modelo_data = { //define object and insert data
          id: doc.id,
          tipo: doc.data().tipo,
          latitud: doc.data().latitud,
          longitud: doc.data().longitud,
          date: doc.data().date,
          estatus: doc.data().estatus,
          distancia_focal: doc.data().distancia_focal
        };
        this.event_data.push(modelo_data); //add modelo_data to user
        })
      });

      db.collection("user_data") //get personal data
      .get()
      .then(querySnapshot => { //create object
        querySnapshot.forEach(doc => { //iterate object
        const modelo_data = { //define object and insert data
          id: doc.id,
          nombre: doc.data().nombre,
          nickname: doc.data().nickname,
          edad: doc.data().edad,
          sangre: doc.data().sagre,
          photo: doc.data().photo
        };
        this.users_data.push(modelo_data); //add modelo_data to user
        })
      });

      db.collection("servicios") //get servicios data
      .get()
      .then(querySnapshot => { //create object
        querySnapshot.forEach(doc => { //iterate object
        const modelo_data = { //define object and insert data
          id: doc.id,
          nombre: doc.data().nombre,
          ubicacion: doc.data().ubicacion,
          categoria: doc.data().categoria,
          telefono: doc.data().telefono
        };
        this.servicios.push(modelo_data); //add modelo_data to user
        })
      });
    }
}
</script>

<style>

.item{
  padding: 2%;
}

.maps{
  display: inline-block;
  padding: 0%;
  width: 75%;
  text-align: center;
  background-color: green;
  margin:15px;
}

.perfil{
  display: inline-block;
  padding: 0%;
  width: 20%;
  text-align: center;
  margin:15px;
  vertical-align: top;
  border: 2px solid gray;
  border-radius: 8%;
}

.simbologia{
  display: inline-block;
  width: 95%;
  margin-left: 3%;
  margin-right: 5%;
  margin-top: 2%;
  padding: 0%;
}
</style>
