    package br.iesb.mobile.foodie_app.ui.fragment.onboarding

    import android.os.Bundle
    import androidx.fragment.app.Fragment
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import androidx.navigation.fragment.findNavController
    import br.iesb.mobile.foodie_app.R
    import br.iesb.mobile.foodie_app.databinding.FragmentOnBoardingBinding
    import br.iesb.mobile.foodie_app.ui.fragment.onboarding.screen.OnboardingFirstFragment
    import br.iesb.mobile.foodie_app.ui.fragment.onboarding.screen.OnboardingSecondFragment
    import br.iesb.mobile.foodie_app.ui.fragment.onboarding.screen.OnboardingThirdFragment
    import br.iesb.mobile.netflics.ui.adapter.OnboardingAdapter
    import kotlinx.android.synthetic.main.fragment_on_boarding.*


    class OnBoardingFragment : Fragment() {

        private lateinit var binding: FragmentOnBoardingBinding

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {

            binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
            binding.fragment = this
            binding.lifecycleOwner = this

            //CRIAR A FONTE DE DADOS

            val listaFragmentos = arrayListOf(
                    OnboardingFirstFragment(),
                    OnboardingSecondFragment(),
                    OnboardingThirdFragment()
            )

//            //CRIAR O ADAPTDADOR
//            val adaptador = AdapatadorParaConversarComVP(listaFragmentos,
//                requireActivity().supportFragmentManager,
//                lifecycle
//                )

            binding.vpOnboarding.adapter = OnboardingAdapter(
                    listaFragmentos,
                    requireActivity().supportFragmentManager,
                    lifecycle
            )

            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            bt_onboarding.setOnClickListener {
                findNavController().navigate(R.id.action_onBoardingFragment_to_loginFragment)
            }

        }

        fun start(v: View) {

        }

    }

