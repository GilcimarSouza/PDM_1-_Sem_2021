package br.iesb.mobile.foodie_app.ui.components

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.foodie_app.R
import kotlinx.android.synthetic.main.fragment_nav_bar_bot.*
import kotlinx.android.synthetic.main.fragment_nav_bar_top.*
import kotlinx.android.synthetic.main.fragment_nav_bar_top.icon_profile_top

class NavBarBotFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_bar_bot, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        icon_profile_bot.setOnClickListener {
            findNavController().navigate(R.id.action_chatBotFragment_to_profileFragment)
        }

        icon_timeline_bot.setOnClickListener {
            findNavController().navigate(R.id.action_chatBotFragment_to_homeFragment)
        }

        icon_top_recipes_bot.setOnClickListener {
            findNavController().navigate(R.id.action_chatBotFragment_to_topRecipesFragment)
        }

    }

}