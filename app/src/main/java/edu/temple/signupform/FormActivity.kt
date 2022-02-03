package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get views from activity
        val enterName = findViewById<EditText>(R.id.editTextName)
        val enterEmail = findViewById<EditText>(R.id.editTextEmailAddress)
        val enterPassword = findViewById<EditText>(R.id.editTextPassword)
        val enterPasswordConfirm = findViewById<EditText>(R.id.editTextPasswordConfirm)
        val saveButton = findViewById<Button>(R.id.submitFormButton)

        // define save button click behavior
        saveButton.setOnClickListener {
            Toast.makeText(this@FormActivity, "Making a toast!", Toast.LENGTH_SHORT).show()
        }
    }
}