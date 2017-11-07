package com.copping.james.tutorfinder;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void onClickGo(View view) {
        TextView tutor_info_textView = (TextView) findViewById(R.id.tutor_info_textView);
        Spinner module_spinner = (Spinner) findViewById(R.id.module_spinner);
        String module_selected = String.valueOf(module_spinner.getSelectedItem());
        String tutor_information = TutorFinder.getInfo(module_selected);
        tutor_info_textView.setText(tutor_information);
    }
}
