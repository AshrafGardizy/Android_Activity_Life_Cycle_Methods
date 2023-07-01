package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,
        "onCreate() Method is called.",Toast.LENGTH_LONG).show()
    }
    //onStart()
    override fun onStart() {
        super.onStart()
        Toast.makeText(this,
            "onStart() Method is called.",Toast.LENGTH_LONG).show()
    }
    //onResume()
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,
            "onResume() Method is called.",Toast.LENGTH_LONG).show()
    }
    //onPause()
    override fun onPause() {
        super.onPause()
        Toast.makeText(this,
            "onPause() Method is called.",Toast.LENGTH_LONG).show()
    }
    //onRestart()
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,
            "onRestart() Method is called.",Toast.LENGTH_LONG).show()
    }
    //onStop()
    override fun onStop() {
        super.onStop()
        Toast.makeText(this,
            "onStop() Method is called.",Toast.LENGTH_LONG).show()
    }
    //onDestroy()
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,
            "onDestroy() Method is called.",Toast.LENGTH_LONG).show()
    }
}