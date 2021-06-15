package br.iesb.mobile.foodie_app.ui.components

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.foodie_app.R
import kotlinx.android.synthetic.main.fragment_nav_bar.*
import kotlinx.android.synthetic.main.fragment_nav_bar_new.*

class NavBarNewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_bar_new, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        icon_profile_new.setOnClickListener {
            findNavController().navigate(R.id.action_newRecipeFragment_to_profileFragment)
        }

        icon_timeline_new.setOnClickListener {
            findNavController().navigate(R.id.action_newRecipeFragment_to_homeFragment)
        }

        icon_bot_new.setOnClickListener {
            findNavController().navigate(R.id.action_newRecipeFragment_to_chatBotFragment)
        }

        icon_top_recipes_new.setOnClickListener {
            findNavController().navigate(R.id.action_newRecipeFragment_to_topRecipesFragment)
        }
    }

}