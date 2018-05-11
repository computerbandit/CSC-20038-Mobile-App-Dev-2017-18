package com.csc_20038.peanuts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity_character_category extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_character_category);

        // Three different options
        ArrayAdapter<PeanutsCharacter> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, PeanutsCharacter.characters);
        //ArrayAdapter<PeanutsCharacter> listAdapter = new ArrayAdapter<>(this, R.layout.layout_custom_listview_item_1, PeanutsCharacter.characters);
        //Custom_array_adapter listAdapter = new Custom_array_adapter(this, PeanutsCharacter.characters);

        ListView listView = (ListView) findViewById(R.id.listView_character_category_options);
        listView.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the option the user clicks on to character activity.
                        Intent intent = new Intent(Activity_character_category.this, Activity_character.class);
                        intent.putExtra(Activity_character.EXTRA_CHARACTER_ID, (int) id);
                        startActivity(intent);
                    }
                };

        //Assign the listener to the list view
        listView.setOnItemClickListener(itemClickListener);
    }
}
