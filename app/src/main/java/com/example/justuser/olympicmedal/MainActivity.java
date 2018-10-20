package com.example.justuser.olympicmedal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TableLayout medalTable;
    TableRow newRow;
    TextView mCountry,mGold,mSilver,mBronze,mTotal;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        medalTable = findViewById(R.id.table_Id);
        addButton = findViewById(R.id.add_btn);
        addNewRow();

    }

   private void addNewRow () {
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TableRow.LayoutParams lp = new TableRow.LayoutParams();
                lp.span = 5;
                lp.weight =1;

                newRow = new TableRow(getApplicationContext());

                mCountry = new TextView(getApplicationContext());
                mGold = new TextView(getApplicationContext());
                mSilver = new TextView(getApplicationContext());
                mBronze = new TextView(getApplicationContext());
                mTotal = new TextView(getApplicationContext());

                TableRow.LayoutParams item_layout = new TableRow.LayoutParams(0, TableLayout.LayoutParams.MATCH_PARENT, 0.30f);
                TableRow.LayoutParams delete_layout = new TableRow.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 0.2f);
                item_layout.height = 60;


                newRow.setLayoutParams(lp);
                mCountry.setText("country");
                mCountry.setTextSize(16);
                mCountry.setGravity(Gravity.CENTER);
                mCountry.setLayoutParams(item_layout);

                //String.valueOf(dd + "%")
                mGold.setText("gold");
                mGold.setTextSize(16);
                mGold.setGravity(Gravity.CENTER);
                mGold.setLayoutParams(item_layout);

                //String.valueOf(amount) + "gm"
                mSilver.setText("silver");
                mSilver.setTextSize(16);
                mSilver.setGravity(Gravity.CENTER);
                mSilver.setLayoutParams(item_layout);

                mBronze.setText("bronze");
                mBronze.setTextSize(16);
                mBronze.setGravity(Gravity.CENTER);
                mBronze.setLayoutParams(item_layout);


                mTotal.setText("total");
                mTotal.setTextSize(16);
                mTotal.setGravity(Gravity.CENTER);
                mTotal.setLayoutParams(item_layout);


                newRow.addView(mCountry);
                newRow.addView(mGold);
                newRow.addView(mSilver);
                newRow.addView(mBronze);
                newRow.addView(mTotal);

                medalTable.addView(newRow);
            }
        });
    }



}
