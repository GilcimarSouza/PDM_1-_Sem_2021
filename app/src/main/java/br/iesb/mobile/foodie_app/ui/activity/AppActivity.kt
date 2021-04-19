package br.iesb.mobile.foodie_app.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.iesb.mobile.foodie_app.R

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
    }
}