package br.iesb.mobile.foodie_app.ui.fragment.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.iesb.mobile.foodie_app.databinding.FragmentOnboardingSecondBinding

class OnboardingSecondFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentOnboardingSecondBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        return binding.root
    }

}