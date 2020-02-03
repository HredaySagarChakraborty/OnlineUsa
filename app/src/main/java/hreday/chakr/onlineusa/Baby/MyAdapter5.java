package hreday.chakr.onlineusa.Baby;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import hreday.chakr.onlineusa.R;

//import hreday.sagar.hredaymehediusa.R;

//import android.support.v7.widget.RecyclerView;

public class MyAdapter5 extends RecyclerView.Adapter<MyAdapter5.MyViewHolder> {

    private static ClickListener clickListener;


    Context context;
    int[] images5;
    String[] country;

    public MyAdapter5(Context context, int[] images4, String[] country) {
        this.context = context;
        this.images5 = images4;
        this.country = country;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.babysample, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText(country[position]);
        // holder.title2.setText(desc[position]);
        holder.img.setImageResource(images5[position]);

    }

    @Override
    public int getItemCount() {
        return country.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title;
        ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);


            title = itemView.findViewById(R.id.bookId);
            // title2 = itemView.findViewById(R.id.textView2Id);


            img = itemView.findViewById(R.id.image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            clickListener.onItemClick(getAdapterPosition(), v);

        }
    }

    public interface ClickListener {

        void onItemClick(int position, View v);

    }

    public void setOnItemClickListener(ClickListener clickListener) {


        MyAdapter5.clickListener = clickListener;
    }
}