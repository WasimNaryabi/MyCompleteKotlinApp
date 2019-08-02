package xyz.computingabc.mycompletekotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnLogin:Button = findViewById(R.id.loginBtn)

        btnLogin.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext,LoginScreen::class.java)
            startActivity(intent)
            finish()
        })
    }
}
