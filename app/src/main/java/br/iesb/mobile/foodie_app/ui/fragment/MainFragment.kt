package br.iesb.mobile.foodie_app.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.foodie_app.R
import br.iesb.mobile.foodie_app.databinding.FragmentMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Exception

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        GlobalScope.launch(context = Dispatchers.Main) {
            delay(2000)

            try {
                findNavController().navigate(R.id.action_mainFragment_to_onBoardingFragment)
            } catch(e: Exception){
                Toast.makeText(activity, "EROOOOOU", Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }

}