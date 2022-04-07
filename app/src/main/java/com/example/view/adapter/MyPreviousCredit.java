package com.example.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.view.R;

public class MyPreviousCredit extends RecyclerView.Adapter<MyPreviousCredit.ViewHolder>{
       Context context;
       String[] valueofcredit_list= new String[]{"113 AZN", "90 AZN", "85 AZN"};

    public MyPreviousCredit(Context context){
           this.context=context;
       }
    @NonNull
    @Override
    public MyPreviousCredit.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           View view=LayoutInflater.from(context).inflate(R.layout.previous_credit,parent,false);
           return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyPreviousCredit.ViewHolder holder, int position) {
            holder.valueofCredit.setText(valueofcredit_list[position]);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView valueofCredit;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            valueofCredit=itemView.findViewById(R.id.credit_value);
        }
    }
}
