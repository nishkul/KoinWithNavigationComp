package com.example.myapplicationblank.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplicationblank.R
import kotlinx.android.synthetic.main.fragment_aboutus.*
import kotlinx.android.synthetic.main.fragment_profile.*
import org.koin.android.viewmodel.ext.android.viewModel

class ProfileFragment : Fragment() {

    val myViewModel: ProfileViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(">>>>>>>>> profileView "," calling from profile ")
        myViewModel.respository.createRepo()
        myViewModel.netWorkCall.createNetork()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        profileBtn.setOnClickListener {

            Toast.makeText(activity, " I am here in Profile ", Toast.LENGTH_SHORT).show()

            it.findNavController()
                .navigate(R.id.action_profileFragment_to_homeFragment)
        }


    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        var screen = ProfileFragmentDirections.actionProfileFragmentToHomeFragment()
//            .arguments.getString("screen")
//        Log.v("screeen profile >>>", screen)
//
//    }
}