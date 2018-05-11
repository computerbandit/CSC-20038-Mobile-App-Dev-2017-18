package com.csc_20038.peanuts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Activity_main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        //Create an OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(Activity_main.this,
                                    Activity_character_category.class);
                            startActivity(intent);
                        }
                    }
                };

        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.listView_main_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
