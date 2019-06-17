package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Combo2Activity extends AppCompatActivity {

    Button addAnother;
    Button back;
    Button checkout;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo2);

        addAnother = findViewById(R.id.btnAddCombo2);
        back = findViewById(R.id.btnBackCombo2);
        ok = findViewById(R.id.btnOkCombo2);
    }

    public void showIntentMain(View view) {
        Intent impl = new Intent(Combo2Activity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Home");
    }

    public void showIntentCombos(View view) {
        Intent impl = new Intent(Combo2Activity.this,ComboActivity.class);
        startActivity(impl);

        displayToast("Combos");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
