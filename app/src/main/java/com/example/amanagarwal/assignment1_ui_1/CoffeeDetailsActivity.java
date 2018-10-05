package com.example.amanagarwal.assignment1_ui_1;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CoffeeDetailsActivity extends AppCompatActivity {
    private TextView mCoffeeType;
    private ImageView mCoffeeImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.coffee_detail_activity);

        mCoffeeType = (TextView)findViewById(R.id.coffeeType);
        mCoffeeImage = (ImageView)findViewById(R.id.coffeeImage);

        int selection = getIntent().getIntExtra("selection", -1);
        processIntent(selection);
    }

    private void processIntent(int selection) {

         switch (selection) {
             case 1:
                 mCoffeeType.setText(R.string.espresso);
                 mCoffeeImage.setImageResource(R.drawable.espresso);
                 break;
             case 2:
                 mCoffeeType.setText(R.string.latte);
                 mCoffeeImage.setImageResource(R.drawable.latte);
                 break;
             case 3:
                 mCoffeeType.setText(R.string.cappuccino);
                 mCoffeeImage.setImageResource(R.drawable.cappuccino);
                 break;
             default:
                 break;
         }
    }

    public void onDoneButtonClicked(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
