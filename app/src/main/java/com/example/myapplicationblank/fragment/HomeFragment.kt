package com.example.myapplicationblank.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplicationblank.R
import kotlinx.android.synthetic.main.fragment_home.*
class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var view = inflater.inflate(R.layout.fragment_home, container, false)
//        val controller = Navigation.findNavController(view)
//        controller.popBackStack()
        return view


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var bundle=bundleOf("screen" to "Home screen")


        homeBtn.setOnClickListener {

            Toast.makeText(activity, " I am here in home ", Toast.LENGTH_SHORT).show()
            it.findNavController()
                .navigate(R.id.action_homeFragment_to_detailsFragment,bundle)
        }
    }



}