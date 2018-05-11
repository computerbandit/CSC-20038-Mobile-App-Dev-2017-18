package com.csc_20038.practical_5_solution;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_button_register(View view) {

        EditText editText_name = (EditText)findViewById(R.id.editText_name);
        String name = editText_name.getText().toString();
        boolean validName = (name.split(" ")).length >= 2;

        EditText editText_dateOfBirth = (EditText)findViewById(R.id.editText_dateOfBirth);
        String dob = editText_dateOfBirth.getText().toString();
        // Check date of birth for validity here...
        boolean validDOB = false;  // Switch to test code.

        EditText editText_eMail = (EditText)findViewById(R.id.editText_eMail);
        String email = editText_eMail.getText().toString();
        // Check email for validity here...
        boolean validEmail = true;  // Switch to test code.

        EditText editText_phone = (EditText)findViewById(R.id.editText_phone);
        String phone = editText_phone.getText().toString();
        // Check phone number for validity here...
        boolean validPhone = true;  // Switch to test code.

        EditText editText_address = (EditText)findViewById(R.id.editText_address);
        String address = editText_address.getText().toString();
        // Check address for validity here...
        boolean validaddress = true;  // Switch to test code.

        if(!validName) {
            Toast.makeText(this, "Invalid name. Please enter full name", Toast.LENGTH_SHORT).show();
            editText_name.selectAll();
            editText_name.requestFocus();
        } else if (!validDOB) {
            Toast.makeText(this, "Invalid date of birth", Toast.LENGTH_SHORT).show();
            editText_dateOfBirth.selectAll();
            editText_dateOfBirth.requestFocus();
        } else if (!validEmail) {
            Toast.makeText(this, "Invalid E-mail", Toast.LENGTH_SHORT).show();
            editText_eMail.selectAll();
            editText_eMail.requestFocus();
        } else if (!validPhone) {
            Toast.makeText(this, "Invalid phone number", Toast.LENGTH_SHORT).show();
            editText_phone.selectAll();
            editText_phone.requestFocus();
        } else if (!validaddress) {
            Toast.makeText(this, "Invalid addressh", Toast.LENGTH_SHORT).show();
            editText_address.selectAll();
            editText_address.requestFocus();
        } else {
            // Email form.
        }

    }
}
