<template>
    <div class="Perfil">
        <div class="photo">
            <img v-bind:src="this.$parent.photo" alt="image" class="image">
        </div>
        <div v-if="this.$parent.cat=='servicio'" class="servicio">

        </div>
        <div v-if="this.$parent.cat=='rescue'" class="rescue">
            <p>Selecciona cualquier icono dentro del mapa para interactuar</p>
        </div>
        <div v-if="this.$parent.cat=='personal'" class="person">
            <div class="personal_info">
                <div v-if="nickname!=''" class="item">
                    <h3>{{nickname}}</h3>
                </div>
                <div v-if="nickname==''" class="item">
                    <h3>{{nombre}}</h3>
                </div>
                <div class="ite">
                    <div class="mitad">
                        {{edad}}
                    </div>
                    <div class="mitad">
                        {{sangre}}
                    </div>
                </div>
            </div>
            <div class="medica">
                <div class="medio">
                    
                </div>
                
            </div>
            <div class="referencia">

            </div>
        </div>
    </div>
</template>

<script>

//conexion
import db from './../components/firebaseInit' //firebase db
import firebase from './../components/firebaseConfig' //firebase object

export default {
    name: "perfil",
    created(){
    
    }
}
</script>

<style>

.image{
    width: 200px;
    height: 200px;
    margin: 30px;
    vertical-align: middle;
    border-radius: 50%;
}

</style>