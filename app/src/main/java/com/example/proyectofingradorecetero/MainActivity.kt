package com.example.proyectofingradorecetero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }






    //Para crear el menú de la actividad principal
    override fun onCreateOptionsMenu(miMenu: Menu?):Boolean{
        menuInflater.inflate(R.menu.menu_principal,miMenu)
        return true
    }

    override fun onOptionsItemSelected(opcionMenu:MenuItem): Boolean {

        //Transormo el item recibido a un número id
        var id= opcionMenu.itemId

        //A continuación comparo esta variable con los id de los items para realizar
        // una acción dependiendo de qué item se haya elegido
        when(id){
            R.id.salir -> finish()
            R.id.info -> eleccion_actividad(intencion=Intent(this,Informacion::class.java))
        }

        return super.onOptionsItemSelected(opcionMenu)
    }

    //Función para ahorrar código en la estructura when anterior
    fun eleccion_actividad(intencion: Intent){
        startActivity(intencion)
    }




}