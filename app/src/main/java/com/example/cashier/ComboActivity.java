package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ComboActivity extends AppCompatActivity {

    Button btnBack;
    Button btnChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo);

        btnChoose = findViewById(R.id.btnChooseCombo);
        btnBack = findViewById(R.id.btnBackCombo);
    }

    public void showIntentCombo1(View view) {
        Intent impl = new Intent(ComboActivity.this,Combo1Activity.class);
        startActivity(impl);

        displayToast("Combo 1");
    }

    public void showIntentCombo2(View view) {
        Intent impl = new Intent(ComboActivity.this,Combo2Activity.class);
        startActivity(impl);

        displayToast("Combo 2");
    }

    public void showIntentCombo3(View view) {
        Intent impl = new Intent(ComboActivity.this,Combo3Activity.class);
        startActivity(impl);

        displayToast("Combo 3");
    }

    public void showIntentCombo4(View view) {
        Intent impl = new Intent(ComboActivity.this,Combo4Activity.class);
        startActivity(impl);

        displayToast("Combo 4");
    }

    public void showIntentCombo(View view) {
        Intent impl = new Intent(ComboActivity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Combos");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show(); }
}
