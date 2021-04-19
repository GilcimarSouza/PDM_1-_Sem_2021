package br.iesb.mobile.foodie_app.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.iesb.mobile.foodie_app.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cadastro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_cadastro_confirm.setOnClickListener {
            cadastar()
        }

        bt_cadastro_voltar.setOnClickListener {
            activity?.finish()
        }
    }

    private fun cadastar () {
        val email = tv_email_cadastro.text.toString()
        val password = tv_password_cadastro.text.toString()
        val retype = tv_retype_cadastro.text.toString()

        if(email.isBlank() || password.isBlank() || retype.isBlank()) {
            Toast.makeText(activity, "Há dados faltando!", Toast.LENGTH_LONG).show()
            return
        }

        if(!password.equals(retype)) {
            Toast.makeText(activity, "Senhas não conferem!", Toast.LENGTH_LONG).show()
            return
        }

        val auth = FirebaseAuth.getInstance()
        val taskDeCadastro = auth.createUserWithEmailAndPassword(email, password)

        taskDeCadastro.addOnCompleteListener { resultado ->
            if (resultado.isSuccessful) {
                activity?.finish()
            } else {
                Toast.makeText(activity, "Erro ao efetuar cadastro!", Toast.LENGTH_LONG).show()
            }
        }

    }

}