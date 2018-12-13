package com.example.shakoor.retrofitfetchdata;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Contacts> contacts;
    public RecyclerAdapter(List<Contacts> contacts)
    {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {

        viewHolder.Name.setText(contacts.get(i).getName());
        viewHolder.Email.setText(contacts.get(i).getEmail());
    }

    @Override
    public int getItemCount() {
        return  contacts.size();
    }

    public  class  MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView Name, Email;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Name = (TextView)itemView.findViewById(R.id.name);
            Email = (TextView)itemView.findViewById(R.id.email);
        }
    }
}
