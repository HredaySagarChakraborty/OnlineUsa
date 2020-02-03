package hreday.chakr.onlineusa.Pharmacy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import hreday.chakr.onlineusa.R;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class PharmacyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter11 myAdapter;


    int images11[] = {R.drawable.mei,
            R.drawable.caremark,
            R.drawable.contacts,
            R.drawable.cvs,
            R.drawable.swan,

            R.drawable.puritan,
            R.drawable.qvc,
            R.drawable.target,
            R.drawable.vitacost,
            R.drawable.vitaminworld,



    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Pharmacy");


        country = getResources().getStringArray(R.array.country_pharmacy);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter11(this, images11, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid=new GridLayoutManager(PharmacyActivity.this,2, GridLayoutManager.VERTICAL,true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter11.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(PharmacyActivity.this, Meijer.class);
                    Toast.makeText(PharmacyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(PharmacyActivity.this, Caremark.class);
                    Toast.makeText(PharmacyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(PharmacyActivity.this,Contacts.class);
                    Toast.makeText(PharmacyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(PharmacyActivity.this, Cvs.class);
                    Toast.makeText(PharmacyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(PharmacyActivity.this, Menshealth.class);
                    Toast.makeText(PharmacyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }



                if (position == 5) {
                    Intent intent = new Intent(PharmacyActivity.this, Puritan.class);
                    Toast.makeText(PharmacyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(PharmacyActivity.this, Qvc.class);
                    Toast.makeText(PharmacyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(PharmacyActivity.this, Riteaid.class);
                    Toast.makeText(PharmacyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(PharmacyActivity.this,Vitacost.class);
                    Toast.makeText(PharmacyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 9) {
                    Intent intent = new Intent(PharmacyActivity.this, Vitaminshop.class);
                    Toast.makeText(PharmacyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }




            }
        });

    }

}
