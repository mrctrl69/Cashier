package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Desert1Activity extends AppCompatActivity {

    Button addAnother;
    Button back;
    Button checkout;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert1);

        addAnother = findViewById(R.id.btnAddDesert1);
        back = findViewById(R.id.btnBackDesert1);
        ok = findViewById(R.id.btnOkDesert1);
    }

    public void showIntentMain(View view) {
        Intent impl = new Intent(Desert1Activity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Home");
    }

    public void showIntentDeserts(View view) {
        Intent impl = new Intent(Desert1Activity.this,DesertsActivty.class);
        startActivity(impl);

        displayToast("Deserts");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
