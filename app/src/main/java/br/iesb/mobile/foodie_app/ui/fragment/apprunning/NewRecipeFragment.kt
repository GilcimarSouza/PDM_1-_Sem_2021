package br.iesb.mobile.foodie_app.ui.fragment.apprunning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isEmpty
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.foodie_app.R
import br.iesb.mobile.foodie_app.databinding.FragmentNewRecipeBinding
import br.iesb.mobile.foodie_app.databinding.FragmentTopRecipesBinding
import br.iesb.mobile.foodie_app.ui.adapter.CurrentFragmentAdapter
import kotlinx.android.synthetic.main.fragment_new_recipe.*

class NewRecipeFragment : Fragment() {

    private lateinit var binding:FragmentNewRecipeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        CurrentFragmentAdapter.setCurrentFragment("new")
        binding = FragmentNewRecipeBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_ok_new_recipe.setOnClickListener {
            if(textInputLayout.isEmpty() || textInputLayout3.isEmpty() || textInputLayout4.isEmpty()) {
                Toast.makeText(activity, "Você deixou algum campo em branco!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(activity, "Você Publicou uma nova receita!", Toast.LENGTH_LONG).show()
                findNavController().navigate(R.id.action_newRecipeFragment_to_profileFragment)
            }
        }

    }

    override fun onResume() {
        super.onResume()
        CurrentFragmentAdapter.setCurrentFragment("new")
    }

}