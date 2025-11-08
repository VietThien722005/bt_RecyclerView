package com.example.bt_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Food> foodList;
    FoodAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        // Dữ liệu mẫu
        foodList = new ArrayList<>();
        foodList.add(new Food("Phở Bò", "Đặc sản Hà Nội", R.drawable.img1));
        foodList.add(new Food("Bánh Mì", "Ổ bánh Việt Nam", R.drawable.img2));
        foodList.add(new Food("Trà Sữa", "Món uống quốc dân", R.drawable.img3));
        foodList.add(new Food("Gỏi Cuốn", "Thanh mát ngày hè", R.drawable.img4));
        foodList.add(new Food("Bánh Tráng Nướng", "Pizza Việt Nam", R.drawable.img5));
        foodList.add(new Food("Lẩu Thái", "Chua cay đậm đà", R.drawable.img6));
        foodList.add(new Food("Bún Riêu", "Món nước truyền thống", R.drawable.img7));
        foodList.add(new Food("Chè Thái", "Tráng miệng mát lạnh", R.drawable.img8));


        adapter = new FoodAdapter(this, foodList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
