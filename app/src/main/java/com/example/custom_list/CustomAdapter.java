package com.example.custom_list;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] Title;
    private final String[] subtitle;
    private final int[] drawableIds;

    public CustomAdapter(Activity context, String[] Title, String[] subtitle, int[] drawableIds) {
        super(context, R.layout.row, Title);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.Title = Title;
        this.subtitle=subtitle;
        this.drawableIds=drawableIds;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.row, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.txtTitle);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgIcon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.txtTitle1);

        titleText.setText(Title[position]);
        imageView.setImageResource(drawableIds[position]);
        subtitleText.setText(subtitle[position]);

        return rowView;

    };
}
