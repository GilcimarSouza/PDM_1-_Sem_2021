package br.iesb.mobile.foodie_app.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.foodie_app.R
import br.iesb.mobile.foodie_app.databinding.FragmentLoginBinding
import br.iesb.mobile.foodie_app.ui.activity.AppActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    private lateinit var binding:FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_cadastrar.setOnClickListener {
            //startActivity(Intent(this, CadastroActivity::class.java))
            findNavController().navigate(R.id.action_loginFragment_to_cadastroFragment)
        }

        bt_enter.setOnClickListener {
            val email = tv_login.text.toString()
            val password = tv_password.text.toString()

            if (email.isBlank() || password.isBlank()) {
                Toast.makeText(activity, "Há campos em branco!", Toast.LENGTH_LONG).show()
            } else {
                val auth = FirebaseAuth.getInstance()

                val taskDeLogin = auth.signInWithEmailAndPassword(email, password)

                taskDeLogin.addOnCompleteListener() { resultado ->
                    if (resultado.isSuccessful) {
                        startActivity(Intent(activity, AppActivity::class.java))
                        //activity?.finish()
                    } else {
                        Toast.makeText(activity, "Usuário ou senha incorretos!", Toast.LENGTH_LONG).show()
                    }
                }
            }

        }

        bt_forgot_password.setOnClickListener {
            //startActivity(Intent(this, ResetpasswordActivity::class.java))
            findNavController().navigate(R.id.action_loginFragment_to_forgotFragment)
        }
    }


}