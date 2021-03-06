package br.iesb.mobile.foodie_app.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.foodie_app.R
import br.iesb.mobile.foodie_app.databinding.FragmentForgotBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_forgot.*

class ForgotFragment : Fragment() {

    private lateinit var binding: FragmentForgotBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentForgotBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_send_reset.setOnClickListener {
            sendReset()
        }

        bt_voltar_reset.setOnClickListener {
            findNavController().navigate(R.id.action_forgotFragment_to_loginFragment)
        }
    }
    private fun sendReset() {
        val email = tv_email_reset.text.toString()

        if(email.isBlank()) {
            Toast.makeText(activity, "Digite um e-mail válido!", Toast.LENGTH_LONG).show()
            return
        }
        val auth = FirebaseAuth.getInstance()
        auth.sendPasswordResetEmail(email)
        Toast.makeText(activity, "Email com reset de senha enviado!", Toast.LENGTH_LONG).show()
        activity?.finish()
    }

}