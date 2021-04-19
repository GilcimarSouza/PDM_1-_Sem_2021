    package br.iesb.mobile.foodie_app.ui.fragment.onboarding

    import android.os.Bundle
    import androidx.fragment.app.Fragment
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import androidx.fragment.app.FragmentManager
    import androidx.lifecycle.Lifecycle
    import androidx.viewpager2.adapter.FragmentStateAdapter
    import br.iesb.mobile.foodie_app.databinding.FragmentOnBoardingBinding
    import br.iesb.mobile.foodie_app.ui.fragment.onboarding.screen.OnboardingFirstFragment
    import br.iesb.mobile.foodie_app.ui.fragment.onboarding.screen.OnboardingSecondFragment


    class OnBoardingFragment : Fragment() {

        private lateinit var binding: FragmentOnBoardingBinding

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
            binding.lifecycleOwner = this

            //CRIAR A FONTE DE DADOS

            val listaFragmentos = listOf(
                    OnboardingFirstFragment(),
                    OnboardingSecondFragment()
            )

            //CRIAR O ADAPTDADOR
            val adaptador = AdapatadorParaConversarComVP(listaFragmentos,
                requireActivity().supportFragmentManager,
                lifecycle
                )


            binding.vpOnboarding

            return binding.root
        }

        fun start() {

        }

    }


    class AdapatadorParaConversarComVP (
        val listaFragmentos: List<Fragment>,
        fragmentManager: FragmentManager,
        lifecycle: Lifecycle
    ) : FragmentStateAdapter(FragmentManager, Lifecycle) {
        override fun getItemCount(): Int {
            return listaFragmentos.size
        }

        override fun createFragment(position: Int): Fragment {
            return listaFragmentos[position]
        }
    }