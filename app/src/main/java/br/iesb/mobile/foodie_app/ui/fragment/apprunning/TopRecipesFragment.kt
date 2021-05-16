package br.iesb.mobile.foodie_app.ui.fragment.apprunning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.iesb.mobile.foodie_app.R
import br.iesb.mobile.foodie_app.databinding.FragmentTopRecipesBinding

class TopRecipesFragment : Fragment() {

    private lateinit var binding: FragmentTopRecipesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentTopRecipesBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        // Inflate the layout for this fragment
        return binding.root
    }


}