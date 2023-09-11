package com.BeyondTheWired.voterx.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.BeyondTheWired.voterx.util.NavigationConstants
import com.BeyondTheWired.voterx.util.OnClick

class MainViewModel : ViewModel(), OnClick {

    val screenNavigation = MutableLiveData<String> ()

    override fun onClick(model: Any?, tag: String)
    {
        when (tag)
        {
            NavigationConstants.BALLOT_INFORMATION->{}
            NavigationConstants.RESEARCH_CANDIDATES->{}
            NavigationConstants.VOTER_INFORMATION->{}
            NavigationConstants.USER_SETTINGS -> {}
            NavigationConstants.PROFILE_INFORMATION->{}
        }
    }
}