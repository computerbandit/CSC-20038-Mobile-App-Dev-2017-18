package com.csc_20038.peanuts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class Custom_array_adapter extends ArrayAdapter<PeanutsCharacter> {

    public Custom_array_adapter(Context context, PeanutsCharacter[] characters) {
        super(context, 0, characters);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        PeanutsCharacter character = (PeanutsCharacter) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_custom_listview_item_2, parent, false);
        }
        // Lookup view for data population
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        // Populate the data into the template view using the data object
        imageView.setImageResource(character.getImageResourceId());
        textView.setText(character.getName());
        // Return the completed view to render on screen
        return convertView;
    }
}
