package com.example.uts_progmob.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_progmob.Model.DataDosen;
import com.example.uts_progmob.Model.DataKelas;
import com.example.uts_progmob.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataDosenAdapter extends RecyclerView.Adapter<DataDosenAdapter.ViewHolder> {
    ArrayList <DataDosen> dataDosenArrayList;

    public DataDosenAdapter (ArrayList<DataDosen> dataDosenArrayList){
        this.dataDosenArrayList = dataDosenArrayList;
    }

    @NonNull
    @Override
    public DataDosenAdapter.ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_dosen,parent, false);
        context = parent.getContext();
        return new DataDosenAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataDosenAdapter.ViewHolder holder, int position){
        holder.txtNidn.setText(dataDosenArrayList.get(position).getNidn());
        holder.txtGelar.setText(dataDosenArrayList.get(position).getGelar());
        holder.txtAlamat.setText(dataDosenArrayList.get(position).getAlamat());
        holder.txtEmail.setText(dataDosenArrayList.get(position).getEmail());
        holder.imgViewDosen.getLayoutParams().width = 100;
        holder.imgViewDosen.getLayoutParams().height = 100;
        if (dataDosenArrayList.get(position).getFoto() != null)
            Picasso.with(this.context).load(dataDosenArrayList.get(position).getFoto()).into(holder.imgViewDosen);
    }

    @Override
    public int getItemCount(){
        return(dataDosenArrayList != null) ? dataDosenArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNidn, txtGelar, txtAlamat, txtEmail, txtNama, imgViewDosen;

        public ViewHolder (View view) {
            super(view);
            txtNidn = view.findViewById(R.id.txtNidn);
            txtGelar = view.findViewById(R.id.txtGelar);
            txtEmail = view.findViewById(R.id.txtEmailD);
            txtAlamat = view.findViewById(R.id.txtAlamatD);
            txtNama = view.findViewById(R.id.txtNama);
            imgViewDosen = view.findViewById(R.id.imgViewDosen);
        }
    }



}
