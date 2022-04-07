package com.example.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.view.R;

public class MyPayings extends RecyclerView.Adapter<MyPayings.ViewHolder> {
    Context context;
    String[] payingValueList=new String[]{"18.00 ₼","25.00 ₼","14.00 ₼"};
    String[] payingDateList=new String[]{"22 fev | 16:40","18 fev | 16:40","11 fev | 16:40"};
    String[] payingDateMothList=new String[]{"22 February","18 February","11 February"};
    public MyPayings(Context context){
        this.context=context;
    }
    @NonNull
    @Override
    public MyPayings.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.paying_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyPayings.ViewHolder holder, int position) {
            holder.payingValue.setText(payingValueList[position]);
            holder.dateMonth.setText(payingDateMothList[position]);
            holder.dateOfPaying.setText(payingDateList[position]);

            if (position==(payingDateList.length-1))
                holder.dottedLine.setVisibility(View.GONE);

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView payingValue,dateMonth,dateOfPaying;
        View dottedLine;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            payingValue=itemView.findViewById(R.id.paying_value);
            dateMonth=itemView.findViewById(R.id.date_month);
            dateOfPaying=itemView.findViewById(R.id.paying_date);
            dottedLine=itemView.findViewById(R.id.dotted_line);


        }
    }
}
