package com.example.canvasdrawing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val mycanvas = MyCanvasView(this)
        mycanvas.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        mycanvas.contentDescription = getString(R.string.canvasContent)
        setContentView(mycanvas)
    }
}