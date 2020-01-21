package com.example.myapplicationblank.fragment

import MyPresenter
import Repository
import Utils
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplicationblank.R
import kotlinx.android.synthetic.main.fragment_details.*
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject
import org.koin.android.scope.bindScope
import org.koin.android.scope.currentScope
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope

class DetailsFragment : Fragment() {
    private var myScopeInstance: Scope? = null
    val presenter: MyPresenter by inject()
    val utilsPresenter: Utils by currentScope.inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.showPresenter()
        Log.v(">>>>>>>> object ", presenter.toString())

//        presenter.createRepo()
        detailsbtn
            .setOnClickListener {
                Toast.makeText(activity, " I am here in Details ", Toast.LENGTH_SHORT).show()
                it.findNavController()
                    .navigate(R.id.action_detailsFragment_to_aboutUsFragment)
            }

//       var  navController = Navigation.findNavController(view);
//
//        requireActivity().addOnBackPressedCallback(getViewLifecycleOwner(), () -> {
//            navController.popBackStack(R.id.homeFragment, false);
//        });
//        return true;
//    });
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var agument = arguments?.getString("screen")
        Log.v(" screeen details  >>>", agument)

        // retrieve instance from scope
        utilsPresenter?.createUtils()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}