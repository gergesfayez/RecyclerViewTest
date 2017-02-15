package com.example.zeyad.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Declare all class variables
    RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //link the recycler view in the layout with your activity variable
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        //creating new linear layout manager to make the recycler view as a list view
        layoutManager = new LinearLayoutManager(this);
        //pass the layout manager to recycler view
        recyclerView.setLayoutManager(layoutManager);
        //creating new object from my custom adapter
        adapter =  new MyAdapter(this, getData());
        //pass the adapter to the recycler view
        recyclerView.setAdapter(adapter);

    }

    /**
     * creating dummy object to test the recycler view.
     * @return arraylist of news object
     */
    private ArrayList<News> getData(){
        ArrayList<News> items = new ArrayList<>();
        News news1 = new News();
        news1.setTitle(" رمضان جانا");
        news1.setDate("1-1-2001");
        news1.setImageURL("http://www.dreamjordan.com/photo/2015/92261dreamjordan.com.jpg");

        items.add(news1);

        News news2 = new News();
        news2.setTitle("انت جيت يا رمضان؟");
        news2.setDate("1-1-2001");
        news2.setImageURL("http://www.i2symbol.com/templates/e/b/0/a/eb0a8c2a47a9d222631611d835f3c35c/canvas.jpg");

        items.add(news2);

        return items;
    }
}
