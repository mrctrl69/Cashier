package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Beverage2Activity extends AppCompatActivity {

    Button addAnother;
    Button back;
    Button checkout;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage2);

        addAnother = findViewById(R.id.btnAddBeverage2);
        back = findViewById(R.id.btnBackBeverage2);
        ok = findViewById(R.id.btnOkBeverage2);
    }

    public void showIntentMain(View view) {
        Intent impl = new Intent(Beverage2Activity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Home");
    }

    public void showIntentBeverage(View view) {
        Intent impl = new Intent(Beverage2Activity.this,BeveragesActivity.class);
        startActivity(impl);

        displayToast("Beverages");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
