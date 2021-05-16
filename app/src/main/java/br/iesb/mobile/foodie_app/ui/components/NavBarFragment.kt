package br.iesb.mobile.foodie_app.ui.components

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.foodie_app.R
import br.iesb.mobile.foodie_app.ui.fragment.apprunning.HomeFragment
import br.iesb.mobile.foodie_app.ui.fragment.apprunning.TopRecipesFragment
import kotlinx.android.synthetic.main.fragment_nav_bar.*

class NavBarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_bar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        icon_top_recipes.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_topRecipesFragment)
        }
    }

}