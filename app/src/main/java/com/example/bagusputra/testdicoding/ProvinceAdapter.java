package com.example.bagusputra.testdicoding;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ProvinceAdapter extends RecyclerView.Adapter<ProvinceAdapter.ListViewHolder> {

    private ArrayList<Province> listProvince;

    public ProvinceAdapter(ArrayList<Province> list) {
        this.listProvince = list;
    }

//    private OnItemClickCallback onItemClickCallback;
//    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
//        this.onItemClickCallback = onItemClickCallback;
//    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_province, viewGroup, false);
        return new ListViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, int i) {
        final Province province = listProvince.get(i);
        Glide.with(listViewHolder.itemView.getContext())
                .load(province.getPhotoprovince())
                .apply(new RequestOptions().override(55, 55))
                .into(listViewHolder.imgProvince);
        listViewHolder.nmProvince.setText(province.getNameprovince());
        listViewHolder.dtProvince.setText(province.getDetailprovince());

        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Toast.makeText(listViewHolder.itemView.getContext(), "Kamu memilih " + listProvince.get(listViewHolder.getAdapterPosition()).getNameprovince(), Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(context,DetailProvinceActivity.class);
                pindah.putExtra("provincename",listProvince.get(listViewHolder.getAdapterPosition()).getNameprovince());
                pindah.putExtra("provincenamedetail",listProvince.get(listViewHolder.getAdapterPosition()).getDetailprovince());
                pindah.putExtra("logo",listProvince.get(listViewHolder.getAdapterPosition()).getPhotoprovince());
                pindah.putExtra("url",listProvince.get(listViewHolder.getAdapterPosition()).getSourceurl());
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listProvince.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgProvince;
        TextView nmProvince, dtProvince;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProvince = itemView.findViewById(R.id.imageprovince);
            nmProvince = itemView.findViewById(R.id.nameprovince);
            dtProvince = itemView.findViewById(R.id.detailprovince);
//            srProvince = itemView.findViewById(R.id.sourceurl);
        }
    }
}