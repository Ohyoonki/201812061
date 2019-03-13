package com.example.user.a20181206;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<item> data;
    Context context;

    public CustomAdapter(Context c, List<item> d) {
        context = c;
        data = d;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View View, ViewGroup parent) {
        if (View == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View = inflater.inflate(R.layout.item_layout, parent, false);

        }
        final TextView name = (TextView) View.findViewById(R.id.name) ;
        TextView phone = (TextView) View.findViewById(R.id.phon) ;

        name.setText(data.get(position).getName());
        phone.setText(data.get(position).getPhone());

        return View;
    }

}

