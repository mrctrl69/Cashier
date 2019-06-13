package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BeveragesActivity extends AppCompatActivity {

    Button btnBack;
    Button btnChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo);

        btnChoose = findViewById(R.id.btnChooseBeverage);
        btnBack = findViewById(R.id.btnBackBeverage);
    }

    public void showIntentBeverage1(View view) {
        Intent impl = new Intent(BeveragesActivity.this,Beverage1Activity.class);
        startActivity(impl);

        displayToast("Beverage");
    }

    public void showIntentBeverage2(View view) {
        Intent impl = new Intent(BeveragesActivity.this,Beverage2Activity.class);
        startActivity(impl);

        displayToast("Beverage 2");
    }

    public void showIntentBeverage3(View view) {
        Intent impl = new Intent(BeveragesActivity.this,Beverage3Activity.class);
        startActivity(impl);

        displayToast("Beverage 3");
    }

    public void showIntentBeverage4(View view) {
        Intent impl = new Intent(BeveragesActivity.this,Beverage4Activity.class);
        startActivity(impl);

        displayToast("Beverage 4");
    }

    public void showIntentBeverage(View view) {
        Intent impl = new Intent(BeveragesActivity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Beverage");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show(); }
}
