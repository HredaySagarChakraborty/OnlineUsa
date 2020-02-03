package hreday.chakr.onlineusa.Books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hreday.chakr.onlineusa.R;


import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;



public class BooksActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter12 myAdapter;


    int images12[] = {R.drawable.audible,
            R.drawable.bookdepository,
            R.drawable.barnesandnoble,
            R.drawable.chegg,
            R.drawable.christianbook,

            R.drawable.goodreads,

            R.drawable.kobo,
            R.drawable.penguinrandomhouse,
            R.drawable.powells,
            R.drawable.thriftbooks


    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Books");


        country = getResources().getStringArray(R.array.country_book);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter12(this, images12, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid = new GridLayoutManager(BooksActivity.this, 2, GridLayoutManager.VERTICAL, true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter12.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(BooksActivity.this, Audible.class);
                    Toast.makeText(BooksActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 1) {
                    Intent intent = new Intent(BooksActivity.this, Bookdepository.class);
                    Toast.makeText(BooksActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(BooksActivity.this, Burnandnoble.class);
                    Toast.makeText(BooksActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 3) {
                    Intent intent = new Intent(BooksActivity.this, Chegg.class);
                    Toast.makeText(BooksActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(BooksActivity.this, ChristianBook.class);
                    Toast.makeText(BooksActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 5) {
                    Intent intent = new Intent(BooksActivity.this,Goodreads.class);
                    Toast.makeText(BooksActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(BooksActivity.this, Kobo.class);
                    Toast.makeText(BooksActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 7) {
                    Intent intent = new Intent(BooksActivity.this,Penguin.class);
                    Toast.makeText(BooksActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                if (position == 8) {
                    Intent intent = new Intent(BooksActivity.this, Powel.class);
                    Toast.makeText(BooksActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 9) {
                    Intent intent = new Intent(BooksActivity.this,Thift.class);
                    Toast.makeText(BooksActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }



            }
        });

    }

}
