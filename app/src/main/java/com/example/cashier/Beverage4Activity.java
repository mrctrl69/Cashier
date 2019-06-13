package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Beverage4Activity extends AppCompatActivity {

    Button addAnother;
    Button back;
    Button checkout;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage4);

        addAnother = findViewById(R.id.btnAddBeverage4);
        back = findViewById(R.id.btnBackBeverage4);
        checkout = findViewById(R.id.btnCheckoutBeverage4);
        ok = findViewById(R.id.btnOkBeverage4);
    }

    public void showIntentMain(View view) {
        Intent impl = new Intent(Beverage4Activity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Home");
    }

    public void showIntentBeverage(View view) {
        Intent impl = new Intent(Beverage4Activity.this,BeveragesActivity.class);
        startActivity(impl);

        displayToast("Beverages");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
