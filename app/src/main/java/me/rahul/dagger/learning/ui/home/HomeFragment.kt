package me.rahul.dagger.learning.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import me.rahul.dagger.learning.MyApplication
import me.rahul.dagger.learning.R
import me.rahul.dagger.learning.di.component.ApplicationComponent
import me.rahul.dagger.learning.di.component.DaggerFragmentComponent
import javax.inject.Inject

class HomeFragment : Fragment() {
    companion object {
        const val TAG = "HomeFragment"
        fun newInstance(): HomeFragment {
            val args = Bundle()
            val fragment = HomeFragment()
            fragment.arguments = args
            return fragment
        }
    }

    @Inject
    lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
    }

    private fun getDependencies() {
        DaggerFragmentComponent.builder()
            .applicationComponent((requireContext().applicationContext as MyApplication).applicationComponent)
            .build().inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv_message = view.findViewById<TextView>(R.id.tv_message)
        tv_message.text = viewModel.getSomeData()
    }
}