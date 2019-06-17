package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Food1Activity extends AppCompatActivity {

    Button addAnother;
    Button back;
    Button checkout;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food1);

        addAnother = findViewById(R.id.btnAddFood1);
        back = findViewById(R.id.btnBackFood1);
        ok = findViewById(R.id.btnOkFood1);

    }
    public void showIntentFood1(View view) {
        Intent impl = new Intent(Food1Activity.this,Food1Activity.class);
        startActivity(impl);

        displayToast(getString(R.string.intentFood1));
    }

    public void showIntentFoods(View view) {
        Intent impl = new Intent(Food1Activity.this,FoodsActivity.class);
        startActivity(impl);

        displayToast("Foods");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show(); }
}
