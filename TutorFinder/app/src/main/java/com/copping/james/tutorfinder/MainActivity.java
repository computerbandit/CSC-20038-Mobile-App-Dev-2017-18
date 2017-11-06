package com.copping.james.tutorfinder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnSpinnerItemSelection();
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public void addListenerOnButton(){
        btnSubmit = (Button) findViewById(R.id.button);
        btnSubmit.addOnAttachStateChangeListener(new SearchBottonListener());
    }

    //Called when the user presses the search/go button.
    public void onClick() {
        //DO something when the button is pressed.

        //Insert Code Here.

    }

}
