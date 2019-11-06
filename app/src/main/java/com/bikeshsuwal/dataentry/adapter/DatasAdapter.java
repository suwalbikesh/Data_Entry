package com.bikeshsuwal.dataentry.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bikeshsuwal.dataentry.R;
import com.bikeshsuwal.dataentry.model.Datas;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DatasAdapter extends RecyclerView.Adapter<DatasAdapter.DatasViewHolder>{
    Context mContext;
    List<Datas> datasList;

    public DatasAdapter(Context mContext, List<Datas> datasList) {
        this.mContext = mContext;
        this.datasList = datasList;
    }

    @NonNull
    @Override
    public DatasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_data,parent,false);
        return new DatasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DatasViewHolder holder, int position) {
        final Datas datas = datasList.get(position);
        holder.circleimgdata.setImageResource(datas.getImageId());
        holder.txtName.setText(datas.getName());
        holder.txtAge.setText(datas.getAge());
        holder.txtGender.setText(datas.getGender());

    }

    @Override
    public int getItemCount() {
        return datasList.size();
    }


    public class DatasViewHolder extends RecyclerView.ViewHolder{
        CircleImageView circleimgdata;
        TextView txtName, txtAge, txtGender;
        ImageButton btnDelete;

        public DatasViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtAge = itemView.findViewById(R.id.txtAge);
            txtGender = itemView.findViewById(R.id.txtGender);
            circleimgdata = itemView.findViewById(R.id.circledataimg);
            btnDelete = itemView.findViewById(R.id.btndelete);
        }
    }
}
