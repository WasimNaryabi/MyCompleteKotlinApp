package xyz.computingabc.mycompletekotlinapp

import android.content.Intent
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.widget.ImageView

class WelcomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

         val logo:ImageView = findViewById(R.id.logo)
        logo.animate().apply {
            duration = 3000

            alpha(0.5f)
            start()
        }

        val timer = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(4000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    val openMenu = Intent(applicationContext,LoginScreen::class.java)
                    startActivity(openMenu)
                    finish()
                }
            }
        }
        timer.start()
    }


}
