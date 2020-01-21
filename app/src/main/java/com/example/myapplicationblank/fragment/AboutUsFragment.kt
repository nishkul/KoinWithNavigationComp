package com.example.myapplicationblank.fragment

import MyPresenter
import Utils
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myapplicationblank.R
import kotlinx.android.synthetic.main.fragment_aboutus.*
import org.koin.android.ext.android.get
import org.koin.android.scope.currentScope

class AboutUsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val presenter: MyPresenter = get()
Log.v(">>>>>>>> object ",presenter.toString())
        presenter.showPresenter()
        return inflater.inflate(R.layout.fragment_aboutus, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        aboutusBtn.setOnClickListener {
            //            Toast.makeText(activity, " I am here in About Us ", Toast.LENGTH_SHORT).show()

//            var navigation =
//                AboutUsFragmentDirections.actionAboutUsFragmentToProfileFragment()

//            it.findNavController()
//                .navigate(navigation)


//            var bundle = bundleOf("screen" to "About us screen")


            var action = AboutUsFragmentDirections.actionAboutUsFragmentToProfileFragment()


            it.findNavController()
                .navigate(R.id.action_aboutUsFragment_to_profileFragment)


        }


    }


}