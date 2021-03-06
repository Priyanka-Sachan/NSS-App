package com.example.nss_iitpatna.ui.events

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.nss_iitpatna.R

class EventsFragment : Fragment() {

    private lateinit var viewModel: EventsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel=ViewModelProvider(this).get(EventsViewModel::class.java)
        return inflater.inflate(R.layout.fragment_events, container, false)
    }
}