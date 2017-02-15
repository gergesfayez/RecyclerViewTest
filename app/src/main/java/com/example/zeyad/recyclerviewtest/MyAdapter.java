package com.example.zeyad.recyclerviewtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by zeyad on 06/02/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    //define class variables
    Context context;
    ArrayList<News> items;

    /**
     * The class constructor passes the context and the array list of objects to the adapter
     * from the activity which creates this adapter.
     * You can use the context and the arraylist in your adapter
     * @param context to use the context in your adapter
     * @param items to use the array list.
     */
    public MyAdapter(Context context, ArrayList<News> items){
        //assign the passed context to the class variable context to use it in the class.
        this.context = context;
        //assign the passed arraylist to the class variable items to use it in the class.
        this.items = items;
    }

    /**
     * This method called after context by the parent class.
     * creates new View holder.
     * In our example we creates our custom view holder defined as inner class.
     * @param parent this is the parent view created by the parent class
     * @param viewType no usage so far, but we use it if we have a different types of views
     * @return view holder to pass it to onBindonBindViewHolder
     */
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate a layout defined in a xml file by us.
        View view = LayoutInflater.from(context).inflate(R.layout.news_recycler_view_list_item, parent,false);
        //creates new custom view holder defined by us as innner class
        ViewHolder viewHolder = new ViewHolder(view);
        //return the view holder to pass it to onBindViewHolder()
        return viewHolder;
    }

    /**
     * This method called by the parent class to bind the data from array list item to each view holder.
     * @param holder passed from onCreateViewHolder method.
     * @param position the position of the view holder in the list.
     */
    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.title.setText(items.get(position).getTitle());
        holder.date.setText(items.get(position).getDate());
        Picasso.with(context).load(items.get(position).getImageURL()).into(holder.imageView);
    }

    /**
     * This method called by the parent class to know hoe much items should the list hold
     * @return integer represents the number of items.
     */
    @Override
    public int getItemCount() {
        return items.size();
    }


    /**
     * This is innner class extends RecyclerView.ViewHolder
     * It should define the inner views in the layout to use them in onBindViewHolder method.
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView date;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            date = (TextView) itemView.findViewById(R.id.date);
            imageView = (ImageView)itemView.findViewById(R.id.news_image);

        }
    }
}
