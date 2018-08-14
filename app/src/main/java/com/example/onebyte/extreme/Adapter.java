package com.example.onebyte.extreme;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<String> reviewList;
    Context context;

    public Adapter(List<String> reviewList, Context context) {
        this.reviewList = reviewList;
        this.context = context;
    }


    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.tv_recyclerview_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

           if (position==reviewList.size()-1){
               holder.ivLike.setPadding(20,20,20,20);
               holder.ivLike.setImageDrawable(context.getResources().getDrawable(R.drawable.like));
               holder.tvNotifName.setVisibility(View.GONE);

           }
           else {
               holder.tvNotifName.setText(reviewList.get(position));
             //  holder.tvNotifName.setPadding(20,20,20,20);
           }
    }

    @Override
    public int getItemCount() {
        return reviewList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvNotifName;
        ImageView ivLike;
        public ViewHolder(View itemView) {
            super(itemView);
            tvNotifName = (TextView)itemView.findViewById(R.id.tvItems);
            ivLike = (ImageView) itemView.findViewById(R.id.ivLike);
        }
    }
}

