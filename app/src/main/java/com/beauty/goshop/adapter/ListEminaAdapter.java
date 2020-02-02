package com.beauty.goshop.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.beauty.goshop.R;
import com.beauty.goshop.model.Emina;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListEminaAdapter extends RecyclerView.Adapter<ListEminaAdapter.ListViewHolder> {
    private ArrayList<Emina> listEmina;
    private OnItemClickCallback onItemClickCallback;

    public ListEminaAdapter(ArrayList<Emina> list) {
        this.listEmina = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_emina, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Emina emina = listEmina.get(position);
        Glide.with(holder.itemView.getContext())
                .load(emina.getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgImage);
        holder.tvProduct.setText(emina.getProduct());
        holder.tvDetail.setText(emina.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listEmina.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listEmina.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(Emina data);
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgImage;
        TextView tvProduct, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgImage = itemView.findViewById(R.id.img_item_image);
            tvProduct = itemView.findViewById(R.id.tv_item_product);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

        }
    }
}
