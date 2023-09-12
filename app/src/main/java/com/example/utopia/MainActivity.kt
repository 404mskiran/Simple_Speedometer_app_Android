package com.example.utopia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import android.widget.ImageView
import android.widget.TextView
import com.example.utopia.databinding.ActivityMainBinding

private lateinit var binidng : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binidng = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binidng.root)
        val actionBar = supportActionBar
        actionBar?.hide()

        val imageView : ImageView = findViewById(R.id.imageView)
        val textView : TextView = findViewById(R.id.textview)
        var ti : Float=8f
        var tf : Float

        binidng.button.setOnClickListener {
            tf=textView.text.toString().toFloat()
            tf= (tf*.84).toFloat()
            textView.text=""
            startImageRotation(imageView,ti,tf)
            ti=tf
        }

        binidng.bt10.setOnClickListener {
            tf= 10F
            tf= (tf*.84).toFloat()
            startImageRotation(imageView,ti,tf)
            ti=tf }
        binidng.bt40.setOnClickListener {
            tf= 40F
            tf= (tf*.84).toFloat()
            startImageRotation(imageView,ti,tf)
            ti=tf
        }
        binidng.bt80.setOnClickListener {
            tf= 80F
            tf= (tf*.84).toFloat()
            startImageRotation(imageView,ti,tf)
            ti=tf
        }
        binidng.bt120.setOnClickListener {
            tf= 120F
            tf= (tf*.84).toFloat()
            startImageRotation(imageView,ti,tf)
            ti=tf
        }
        binidng.bt220.setOnClickListener {
            tf= 220F
            tf= (tf*.84).toFloat()
            startImageRotation(imageView,ti,tf)
            ti=tf
        }
        binidng.bt300.setOnClickListener {
            tf= 300F
            tf= (tf*.84).toFloat()
            startImageRotation(imageView,ti,tf)
            ti=tf
        }
    }
}
private fun startImageRotation(imageView:ImageView, initial : Float, final : Float) {
    val rotateAnimation = RotateAnimation(
        initial, final,
        Animation.RELATIVE_TO_SELF, 0.5f,
        Animation.RELATIVE_TO_SELF, 0.5f
    )
    rotateAnimation.interpolator = LinearInterpolator()
    rotateAnimation.duration = 1000 // Duration for each rotation (in milliseconds)
    rotateAnimation.fillAfter=true
    imageView.startAnimation(rotateAnimation)
}
