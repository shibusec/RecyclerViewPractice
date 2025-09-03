package com.shibu.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {
    Context context;
    ArrayList<ContactModel> arraContacts;
    public RecyclerContactAdapter(Context context, ArrayList<ContactModel> arraContacts) {
        this.context = context;
        this.arraContacts = arraContacts;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageContact.setImageResource(arraContacts.get(position).img);
        holder.TxtName.setText(arraContacts.get(position).name);
        holder.TxtNumber.setText(arraContacts.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arraContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView TxtName, TxtNumber;
        ImageView imageContact;

        public ViewHolder(@NonNull View itemView) {// Constractor Create korsi
            super(itemView);
            TxtName = itemView.findViewById(R.id.textView);
            TxtNumber = itemView.findViewById(R.id.textView2);
            imageContact = itemView.findViewById(R.id.imageView);
        }
    }
 }
