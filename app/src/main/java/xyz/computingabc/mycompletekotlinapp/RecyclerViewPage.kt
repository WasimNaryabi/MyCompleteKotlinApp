package xyz.computingabc.mycompletekotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RecyclerViewPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_page)
    }

    override fun onBackPressed() {
        startActivity(Intent(applicationContext,Home::class.java))
        finish()
    }
}
