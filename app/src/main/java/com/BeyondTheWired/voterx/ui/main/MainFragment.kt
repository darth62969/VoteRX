package com.BeyondTheWired.voterx.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.BeyondTheWired.voterx.R
import com.BeyondTheWired.voterx.util.NavigationConstants

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        observerScreenNav()
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
    fun observerScreenNav()
    {
        viewModel.screenNavigation.observe(viewLifecycleOwner, Observer {
            when(it)
            {
                NavigationConstants.BALLOT_INFORMATION->{}
                NavigationConstants.RESEARCH_CANDIDATES->{}
                NavigationConstants.VOTER_INFORMATION->{}
                NavigationConstants.USER_SETTINGS -> {}
                NavigationConstants.PROFILE_INFORMATION->{}
            }
        })
    }

}