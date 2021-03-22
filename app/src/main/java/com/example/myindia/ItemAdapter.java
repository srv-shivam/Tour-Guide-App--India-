package com.example.myindia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    private int mBackgroundColor;

    public ItemAdapter(Context context, ArrayList<Item> objects, int backgroundColor) {
        super(context, 0, objects);
        this.mBackgroundColor = backgroundColor;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view_sample_layout, parent, false);
        }

        Item currentItem = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.display_image);

        if (currentItem.hasImage()) {
            imageView.setImageResource(currentItem.getItemImages());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        TextView textView = listItemView.findViewById(R.id.display_item_name);
        textView.setText(currentItem.getItemName());

        View container = (LinearLayout) listItemView.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        container.setBackgroundColor(color);

        return listItemView;
    }
}
