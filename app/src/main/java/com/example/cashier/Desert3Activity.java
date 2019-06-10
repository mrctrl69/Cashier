package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Desert3Activity extends AppCompatActivity {

    Button addAnother;
    Button back;
    Button checkout;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert3);

        addAnother = findViewById(R.id.btnAddDesert3);
        back = findViewById(R.id.btnBackDesert3);
        checkout = findViewById(R.id.btnCheckoutDesert3);
        ok = findViewById(R.id.btnOkDesert3);
    }

    public void showIntentMain(View view) {
        Intent impl = new Intent(Desert3Activity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Home");
    }

    public void showIntentDeserts(View view) {
        Intent impl = new Intent(Desert3Activity.this,DesertsActivty.class);
        startActivity(impl);

        displayToast("Deserts");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
