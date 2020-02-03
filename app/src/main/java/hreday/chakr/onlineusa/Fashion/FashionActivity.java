package hreday.chakr.onlineusa.Fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hreday.chakr.onlineusa.R;
//package hreday.sagar.hredaymehediusa.Fashion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//import hreday.sagar.hredaymehediusa.R;

public class FashionActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter2 myAdapter;


    int images1[] = {R.drawable.bluenile,
            R.drawable.armani,
            R.drawable.asos,
            R.drawable.ross,
            R.drawable.kay,
            R.drawable.saksfifthavenue,
            R.drawable.elle,
            R.drawable.gilt,
            R.drawable.gap,
            R.drawable.macys,
            R.drawable.jared,
            R.drawable.kohls,
            R.drawable.victoria,
            R.drawable.nordstorm


    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Fashion");


        country = getResources().getStringArray(R.array.country_fashion);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter2(this, images1, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid=new GridLayoutManager(FashionActivity.this,2, GridLayoutManager.VERTICAL,true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter2.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(FashionActivity.this, Bluenile.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(FashionActivity.this, Armani.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(FashionActivity.this,Asos.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(FashionActivity.this, RossSymons.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(FashionActivity.this, Kay.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(FashionActivity.this, Saksfifthavenue.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(FashionActivity.this, Elle.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(FashionActivity.this, Gilt.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(FashionActivity.this, Gap.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 9) {
                    Intent intent = new Intent(FashionActivity.this, Macys.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 10) {
                    Intent intent = new Intent(FashionActivity.this, Jared.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 11) {
                    Intent intent = new Intent(FashionActivity.this, Kohls.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 12) {
                    Intent intent = new Intent(FashionActivity.this, Victoria.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 13) {
                    Intent intent = new Intent(FashionActivity.this, Nordstorm.class);
                    Toast.makeText(FashionActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }




            }
        });

    }

}
