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

public class MainActivity extends AppCompatActivity {

    ImageView nn;
    ImageButton mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mm = findViewById(R.id.comboView);
        nn = findViewById(R.id.foodsView);
    }

    public void showIntentCombo(View view) {
        Intent impl = new Intent(MainActivity.this,ComboActivity.class);
        startActivity(impl);

        displayToast(getString(R.string.intentCombos));
    }

    public void showIntentFoods(View view) {
        Intent impl = new Intent(MainActivity.this,FoodsActivity.class);
        startActivity(impl);

        displayToast(getString(R.string.intentFoods));
    }

    public void showIntentDeserts(View view) {
        Intent impl = new Intent(MainActivity.this,DesertsActivty.class);
        startActivity(impl);

        displayToast(getString(R.string.intentDeserts));
    }

    public void showIntentBeverage(View view) {
        Intent impl = new Intent(MainActivity.this,BeveragesActivity.class);
        startActivity(impl);

        displayToast(getString(R.string.intentBeverage));
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}