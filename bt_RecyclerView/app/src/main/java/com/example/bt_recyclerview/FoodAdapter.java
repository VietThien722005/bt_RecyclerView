package com.example.bt_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private Context context;
    private List<Food> foodList;

    public FoodAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food = foodList.get(position);
        holder.tvTitle.setText(food.getTitle());
        holder.tvDesc.setText(food.getDesc());
        holder.imgFood.setImageResource(food.getImageResId());

        // Click event
        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(context, "Bạn chọn: " + food.getTitle(), Toast.LENGTH_SHORT).show();
        });

        // ✅ Màu nền khác nhau cho từng item (so le)
        int bgColor = (position % 2 == 0) ?
                Color.parseColor("#FFF3E0") :  // Lẻ - vàng nhạt
                Color.parseColor("#FFFFFF");   // Chẵn - trắng

        holder.itemView.setBackgroundColor(bgColor);
    }


    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFood;
        TextView tvTitle, tvDesc;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imgFood);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDesc = itemView.findViewById(R.id.tvDesc);
        }
    }
}
