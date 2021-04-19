package br.iesb.mobile.foodie_app.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.iesb.mobile.foodie_app.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_cadastrar.setOnClickListener {
            startActivity(Intent(this, CadastroActivity::class.java))
        }

        bt_enter.setOnClickListener {
            val email = tv_login.text.toString()
            val password = tv_password.text.toString()

            if (email.isBlank() || password.isBlank()) {
                Toast.makeText(activity, "Erro ao efetuar login!", Toast.LENGTH_LONG).show()
            } else {
                val auth = FirebaseAuth.getInstance()

                val taskDeLogin = auth.signInWithEmailAndPassword(email, password)

                taskDeLogin.addOnCompleteListener() { resultado ->
                    if (resultado.isSuccessful) {
                        startActivity(Intent(this, HomeActivity::class.java))
                    } else {
                        Toast.makeText(activity, "Erro ao efetuar login!", Toast.LENGTH_LONG).show()
                    }
                }
            }

        }

        bt_forgot_password.setOnClickListener {
            startActivity(Intent(this, ResetpasswordActivity::class.java))
        }
    }


}