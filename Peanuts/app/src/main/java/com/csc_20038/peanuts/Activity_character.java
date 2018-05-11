package com.csc_20038.peanuts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_character extends Activity {

    public static final String EXTRA_CHARACTER_ID = "character_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_character);

        //Get the character id from the intent
        int id = (Integer)getIntent().getExtras().get(EXTRA_CHARACTER_ID);
        PeanutsCharacter character = PeanutsCharacter.characters[id];


        // Initialise the layout components

        TextView textView_name = (TextView)findViewById(R.id.textView_name);
        textView_name.setText(character.getName());

        TextView textView_description = (TextView)findViewById(R.id.textView_description);
        textView_description.setText(character.getDescription());

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(character.getImageResourceId());
        imageView.setContentDescription(character.getName());
    }
}
