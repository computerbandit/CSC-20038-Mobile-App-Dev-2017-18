package com.copping.james.tutorfinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        TextView module_info_textView = (TextView) findViewById(R.id.detailed_info_textView);
        String module_code = intent.getStringExtra("module");
        module_info_textView.setText(TutorFinder.getDetailedInfo(module_code));
    }
}
