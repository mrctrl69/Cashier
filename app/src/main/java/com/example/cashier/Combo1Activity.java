package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Combo1Activity extends AppCompatActivity {

    Button addAnother;
    Button back;
    Button checkout;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo1);

        addAnother = findViewById(R.id.btnAddCombo1);
        back = findViewById(R.id.btnBackCombo1);
        checkout = findViewById(R.id.btnCheckoutCombo1);
        ok = findViewById(R.id.btnOkCombo1);
    }

    public void showIntentMain(View view) {
        Intent impl = new Intent(Combo1Activity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Home");
    }

    public void showIntentCombos(View view) {
        Intent impl = new Intent(Combo1Activity.this,ComboActivity.class);
        startActivity(impl);

        displayToast("Combos");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
