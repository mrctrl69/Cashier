package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class BeveragesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
    }

    public void openCombosMenu() {
        Intent intent =  new Intent(this, CombosActivity.class);
        startActivity(intent);
    }

    public void openBeveragesMenu() {
        Intent intent =  new Intent(this, BeveragesActivity.class);
        startActivity(intent);
    }

    public void showIntentCombos(View view) {
        displayToast(getString(R.string.intentCombos));
    }

    public void showIntentFoods(View view) {
        displayToast(getString(R.string.intentFoods));
    }

    public void showIntentBeverages(View view) {
        displayToast(getString(R.string.intentBeverages));
    }

    public void showIntentDesert(View view) {
        displayToast(getString(R.string.intentDeserts));
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

}