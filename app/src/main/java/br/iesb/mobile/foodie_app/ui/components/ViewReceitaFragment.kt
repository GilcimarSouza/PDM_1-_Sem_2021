package br.iesb.mobile.foodie_app.ui.components

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.foodie_app.R
import br.iesb.mobile.foodie_app.ui.adapter.CurrentFragmentAdapter
import kotlinx.android.synthetic.main.fragment_view_receita.*


class ViewReceitaFragment : Fragment() {

    private lateinit var temp : String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_receita, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        temp=CurrentFragmentAdapter.getCurrentFragment()


        iv_pao.setOnClickListener {
            if(temp.equals("home")) {
                findNavController().navigate(R.id.action_homeFragment_to_fullRecipeFragment)
            }
            if(temp.equals("profile")){
                findNavController().navigate(R.id.action_profileFragment_to_fullRecipeFragment)
            }
            if(temp.equals("top")) {
                findNavController().navigate(R.id.action_topRecipesFragment_to_fullRecipeFragment)
            }

        }

    }
}