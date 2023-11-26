package com.example.listas.adapter

import android.app.AlertDialog
import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.listas.EditarPelicula
import com.example.listas.Info
import com.example.listas.MainActivity
import com.example.listas.R

open class ActividadConMenus : AppCompatActivity() {
    companion object {
        var actividadActual = 0;
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        //relacionamos la clase con el layout del menú que hennos creado
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)

        //desactivar la opción de la actividad en la que estamos
        for (i in 0 until  menu.size()){
            if (i == actividadActual) menu.getItem(i).isEnabled = false
            else menu.getItem(i).isEnabled = true
        }

        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.anyadir -> {
                val intent = Intent(this, EditarPelicula::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 1;
                startActivity(intent)
                true
            }

            R.id.peliculas -> {
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 0;
                startActivity(intent)
                true
            }

            R.id.datosApp -> {
                val intent = Intent(this, Info::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 2;
                startActivity(intent)
                true
            }

            R.id.buscar -> {
                //hacer que se pueda hacer una búsqueda solo en la actividad de la lista de películas
                if (parentActivityIntent == Intent(this, MainActivity::class.java)){
                    //tendría que hacer que el edit text fuera visible
                }
                true
            }

            R.id.salir -> {
                //debería mostrar un cuadro de diálogo preguntado al usuario si quiere salir de la aplicación
                var aviso = AlertDialog.Builder(this)
                aviso.setTitle("Confirmación")
                aviso.setMessage("¿Salir de la aplicación?")
                    .setPositiveButton(android.R.string.ok, {
                            dialog, which -> Toast.makeText(this, "Se va a salir de la aplicación", Toast.LENGTH_LONG).show()
                    })
                    .setNegativeButton(android.R.string.cancel,
                        {dialog, which -> Toast.makeText(this, "No se va a sarlir de la aplicación", Toast.LENGTH_LONG).show()
                        })
                true
            }

            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}