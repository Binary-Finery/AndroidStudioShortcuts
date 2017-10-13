package com.spencerstudios.androidstudioshortcuts;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ShortCutAdapter extends BaseAdapter {

    private List<Data> data;
    private LayoutInflater layoutInflater;
    private boolean windowsSelected = true;

    public ShortCutAdapter(Context context, List<Data> data, boolean windowsSelected) {
        this.data = data;
        this.windowsSelected = windowsSelected;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder {
        TextView tvInfo;
        TextView tvShortcut;
        LinearLayout container;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {

            holder = new ViewHolder();

            convertView = layoutInflater.inflate(R.layout.shortcut_item, null);

            holder.tvInfo = (TextView) convertView.findViewById(R.id.tv_info);
            holder.tvShortcut = (TextView) convertView.findViewById(R.id.tv_shortcut);
            holder.container = (LinearLayout)convertView.findViewById(R.id.item_container);
            convertView.setTag(holder);
        } else holder = (ViewHolder) convertView.getTag();

        if (data.get(position).getShortcut().length()>0) {
            holder.container.setBackgroundColor(Color.WHITE);
            holder.tvShortcut.setTextColor(Color.parseColor("#424242"));
            holder.tvShortcut.setTypeface(Typeface.create("monospace", Typeface.BOLD));
            holder.tvInfo.setVisibility(View.VISIBLE);
            holder.tvInfo.setText(data.get(position).getShortcut());
            holder.tvShortcut.setText(windowsSelected ? data.get(position).getWindows() : data.get(position).getMac());
        }else{
            holder.container.setBackgroundColor(Color.parseColor("#424242"));
            holder.tvShortcut.setTypeface(Typeface.create("sans-serif-light", Typeface.NORMAL));
            holder.tvShortcut.setTextColor(Color.WHITE);
            holder.tvInfo.setVisibility(View.GONE);
            holder.tvShortcut.setText(data.get(position).getWindows());
        }

        return convertView;
    }
}
