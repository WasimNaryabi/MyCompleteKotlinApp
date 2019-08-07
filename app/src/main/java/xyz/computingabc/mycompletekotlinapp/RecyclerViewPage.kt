package xyz.computingabc.mycompletekotlinapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view_page.*
import xyz.computingabc.mycompletekotlinapp.Adopter.LanguageAdopter
import java.util.function.Supplier

class RecyclerViewPage : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_page)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        list.layoutManager = layoutManager
        val adapter = LanguageAdopter(this,xyz.computingabc.mycompletekotlinapp.Modle.Supplier.language)
        list.adapter=adapter
    }

    override fun onBackPressed() {
        startActivity(Intent(applicationContext,Home::class.java))
        finish()
    }
}
