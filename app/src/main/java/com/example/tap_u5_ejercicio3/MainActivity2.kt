package com.example.tap_u5_ejercicio3

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //PREGUNTO SI YA EXISTE EL PERMISO OTORGADO
        val permiso = ActivityCompat.checkSelfPermission(this, android.Manifest.permission.SEND_SMS)
        if(permiso == PackageManager.PERMISSION_DENIED){
            //EJECUTAR VENTANA DE PERMISOS
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS), 0)

        }

    }
}