package com.example.splashscreen

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.splashscreen.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)



        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        /**
         *  Adding a downloaded free font style
         *  Link: https://www.1001fonts.com/carbon-font.html
         */
        val typeFace: Typeface = Typeface.createFromAsset(assets,"carbon bl.otf")
        binding.tvAppName.typeface = typeFace
    }
}