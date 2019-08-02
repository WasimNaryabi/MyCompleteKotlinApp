package xyz.computingabc.mycompletekotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class LoginScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val home = Intent(applicationContext,Home::class.java)
        startActivity(home)
        finish()
    }
}
