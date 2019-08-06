package xyz.computingabc.mycompletekotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xyz.computingabc.mycompletekotlinapp.ui.navigationjetpack.NavigationJetPackFragment

class NavigationJetPack : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navigation_jet_pack_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, NavigationJetPackFragment.newInstance())
                .commitNow()
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(applicationContext,Home::class.java))
        finish()
    }
}