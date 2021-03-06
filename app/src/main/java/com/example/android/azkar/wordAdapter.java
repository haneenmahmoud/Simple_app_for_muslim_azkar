package com.example.android.azkar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {


        public wordAdapter(Context context, ArrayList<word>words){
            super(context,0,words);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }
                word currentWord = getItem(position);

                TextView azkarTextView = (TextView) listItemView.findViewById(R.id.azkarText);
                azkarTextView.setText(currentWord.getWord());


            return listItemView;
        }
    }

