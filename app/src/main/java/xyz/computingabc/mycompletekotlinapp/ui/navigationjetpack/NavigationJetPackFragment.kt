package xyz.computingabc.mycompletekotlinapp.ui.navigationjetpack

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import xyz.computingabc.mycompletekotlinapp.R

class NavigationJetPackFragment : Fragment() {

    companion object {
        fun newInstance() = NavigationJetPackFragment()
    }

    private lateinit var viewModel: NavigationJetPackViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.navigation_jet_pack_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NavigationJetPackViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
