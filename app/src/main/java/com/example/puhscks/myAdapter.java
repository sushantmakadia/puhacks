package com.example.puhscks;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.Viewholder> {
    List<list_Item>listItems;
    private Context context;

    public myAdapter(List<list_Item> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }



    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
list_Item listItem= listItems.get(position);
holder.th.setText(listItem.getH());
holder.td.setText(listItem.getD());
        holder.tq.setText(listItem.getQ());




    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView th;
        TextView td;
        TextView tq;

        public Viewholder(final View itemView) {
            super(itemView);
            th=itemView.findViewById(R.id.th);
            td=itemView.findViewById(R.id.td);
            tq=itemView.findViewById(R.id.tq);







        }
    }
}
