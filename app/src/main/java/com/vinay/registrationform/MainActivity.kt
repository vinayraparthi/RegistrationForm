package com.vinay.registrationform

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vinay.registrationform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setUpSpinner()
        setUPButton()


    }

    private fun setUPButton() {

        var buttonCreateAccount = binding.buttonCreateAccount
        buttonCreateAccount.setOnClickListener {
            createAccount()

        }

    }

    private fun createAccount() {

    }

    private fun setUpSpinner() {
        val titles = arrayOf("Miss","Mrs","Ms","Mr","Mx","Dr","Prof")
        val titileAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,titles)

    }

}