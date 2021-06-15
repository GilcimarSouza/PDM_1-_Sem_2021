package br.iesb.mobile.foodie_app.ui.fragment.apprunning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.iesb.mobile.foodie_app.R
import br.iesb.mobile.foodie_app.databinding.FragmentNewRecipeBinding
import br.iesb.mobile.foodie_app.databinding.FragmentTopRecipesBinding

class NewRecipeFragment : Fragment() {

    private lateinit var binding:FragmentNewRecipeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentNewRecipeBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}