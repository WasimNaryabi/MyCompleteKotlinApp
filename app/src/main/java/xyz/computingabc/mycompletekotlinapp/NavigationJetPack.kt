package xyz.computingabc.mycompletekotlinapp

import android.support.v7.app.AppCompatActivity
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

}
