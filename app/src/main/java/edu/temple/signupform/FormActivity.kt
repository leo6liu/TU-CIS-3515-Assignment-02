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

        // on save button click, display a welcome toast if all fields are entered and passwords match
        saveButton.setOnClickListener {
            var allFieldsEntered = true
            var passwordsMatch = true

            // check for blank inputs
            if (enterName.text.isBlank()) { // disallow only whitespace names
                allFieldsEntered = false
                enterName.error = "name is required"
            }
            if (enterEmail.text.isBlank()) { // disallow only whitespace emails
                allFieldsEntered = false
                enterEmail.error = "email is required"
            }
            if (enterPassword.text.isEmpty()) { // allow only whitespace passwords
                allFieldsEntered = false
                enterPassword.error = "password is required"
            }
            if (enterPasswordConfirm.text.isEmpty()) { // allow only whitespace passwords
                allFieldsEntered = false
                enterPasswordConfirm.error = "re-enter password"
            }

            // check for mismatching passwords
            if (enterPassword.text.toString() != enterPasswordConfirm.text.toString()) {
                passwordsMatch = false
                enterPasswordConfirm.error = "passwords do not match"
            }

            // make welcome toast if all fields were entered and passwords match
            if (allFieldsEntered && passwordsMatch) {
                val toastMessage = "Welcome, ${enterName.text}, to the SignUpForm App!"
                Toast.makeText(this@FormActivity, toastMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}