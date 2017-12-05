package com.team11.personalfood;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.EditText;

import java.util.List;

public class ListActivity extends AppCompatActivity implements OnFoodLoadListener{

    private RecyclerView foodListRecyclerView;
    private EditText searchEditText;
    private FoodListRecyclerAdapter adapter;
    private FoodModel foodModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Toolbar toolbar = findViewById(R.id.list_toolbar);
        toolbar.setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.colorAccent));
        setSupportActionBar(toolbar);

        foodListRecyclerView = findViewById(R.id.foodList_recyclerView);
        searchEditText = findViewById(R.id.search_editText);

        setUpFoodListView();
        foodModel = new FoodModel();
        foodModel.setOnFoodLoadListener(this);
        foodModel.fetchFood();

//        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);


        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.leftarrow);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.list_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    private void setUpFoodListView(){
        LinearLayoutManager manager = new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false);
        foodListRecyclerView.setLayoutManager(manager);

        adapter = new FoodListRecyclerAdapter();
        foodListRecyclerView.setAdapter(adapter);


    }

    @Override
    public void onFetchFood(List<Food> foodList) {
        adapter.setItems(foodList);
        adapter.notifyDataSetChanged();
    }
}