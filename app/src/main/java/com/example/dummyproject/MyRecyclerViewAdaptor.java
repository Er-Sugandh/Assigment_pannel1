package com.example.dummyproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerViewAdaptor extends RecyclerView.Adapter<MyRecyclerViewAdaptor.MyViewHolder> {

    private final Context context;
    private final ArrayList<ModelClass> modelClassList;

    public MyRecyclerViewAdaptor(Context context, ArrayList<ModelClass> modelClassArrayList){
      this.context = context;
      this.modelClassList = modelClassArrayList;
  }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ModelClass modelClass = modelClassList.get(position);
        holder.mTittleTV.setText(modelClass.getTitle());
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView mTittleTV;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
           mTittleTV = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
