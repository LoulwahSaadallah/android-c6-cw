package com.example.day6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Items> {
    List<Items> itemsListAdapter;
    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsListAdapter = objects;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.itemslist, parent , false);
        Items currentItem = itemsListAdapter.get(position);
        ImageView itemcheese = view.findViewById(R.id.itemImage);
        TextView cheesename = view.findViewById(R.id.itemName);
        TextView pricename = view.findViewById(R.id.itemPrice);
        itemcheese.setImageResource(currentItem.getItemImage());
        cheesename.setText(currentItem.getItemName());
        pricename.setText(currentItem.getItemPrice() + "");

        return view;

    }
}
