package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Combo4Activity extends AppCompatActivity {

    Button addAnother;
    Button back;
    Button checkout;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo4);

        addAnother = findViewById(R.id.btnAddCombo4);
        back = findViewById(R.id.btnBackCombo4);
        checkout = findViewById(R.id.btnCheckoutCombo4);
        ok = findViewById(R.id.btnOkCombo4);
    }

    public void showIntentMain(View view) {
        Intent impl = new Intent(Combo4Activity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Home");
    }

    public void showIntentCombos(View view) {
        Intent impl = new Intent(Combo4Activity.this,ComboActivity.class);
        startActivity(impl);

        displayToast("Combos");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
