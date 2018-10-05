package com.example.amanagarwal.assignment1_ui_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class CoffeeSelectionActivity extends AppCompatActivity {

    private int selection;
    private Button letsGoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffee_selection_activity);

        selection = -1;
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton)view).isChecked();
        letsGoButton = (Button)findViewById(R.id.letsGoButton);

        switch (view.getId()) {

            case R.id.espresso:
                if (checked)
                    letsGoButton.setEnabled(true);
                selection = 1;
                break;

            case R.id.latte:
                if (checked)
                    letsGoButton.setEnabled(true);
                selection = 2;
                break;

            case R.id.cappuccino:
                if (checked)
                    letsGoButton.setEnabled(true);
                selection = 3;
                break;
        }
    }

    public void onLetsGoButtonClicked(View view) {
        Intent intent = new Intent(this, CoffeeDetailsActivity.class);
        intent.putExtra("selection", selection);
        startActivity(intent);
    }
}
