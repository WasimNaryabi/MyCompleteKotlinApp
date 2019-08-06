package xyz.computingabc.mycompletekotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val UiBtn:Button = findViewById(R.id.uiBtn)
        val NaviBtn:Button = findViewById(R.id.navigation)

        UiBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext,AndroidUIcontroll::class.java)
            startActivity(intent)
            finish()
        })
        NaviBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext,NavigationJetPack::class.java)
            startActivity(intent)
            finish()
        })
    }
}
