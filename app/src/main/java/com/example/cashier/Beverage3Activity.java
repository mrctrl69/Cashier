package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Beverage3Activity extends AppCompatActivity {

    Button addAnother;
    Button back;
    Button checkout;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage3);

        addAnother = findViewById(R.id.btnAddBeverage3);
        back = findViewById(R.id.btnBackBeverage3);
        ok = findViewById(R.id.btnOkBeverage3);
    }

    public void showIntentMain(View view) {
        Intent impl = new Intent(Beverage3Activity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Home");
    }

    public void showIntentBeverage(View view) {
        Intent impl = new Intent(Beverage3Activity.this,BeveragesActivity.class);
        startActivity(impl);

        displayToast("Beverages");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
