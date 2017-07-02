package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by WanChing on 2/7/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter (Activity context, ArrayList<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView tvMagnitude = (TextView)listItemView.findViewById(R.id.magnitude);
        TextView tvLocation = (TextView)listItemView.findViewById(R.id.location);
        TextView tvTime = (TextView)listItemView.findViewById(R.id.time);

        tvMagnitude.setText(currentEarthquake.getMagnitude());
        tvLocation.setText(currentEarthquake.getLocation());
        tvTime.setText(currentEarthquake.getTime());

        return listItemView;
    }

}
