package xyz.computingabc.mycompletekotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AndroidUIcontroll : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_uicontroll)
    }

    override fun onBackPressed() {
        startActivity(Intent(applicationContext,Home::class.java))
        finish()
    }
}
