package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DesertsActivty extends AppCompatActivity {

    Button btnBack;
    Button btnChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deserts);

        btnChoose = findViewById(R.id.btnChooseDesert);
        btnBack = findViewById(R.id.btnBackDesert);
    }

    public void showIntentDesert1(View view) {
        Intent impl = new Intent(DesertsActivty.this,Desert1Activity.class);
        startActivity(impl);

        displayToast("Desert");
    }

    public void showIntentDesert2(View view) {
        Intent impl = new Intent(DesertsActivty.this,Desert2Activity.class);
        startActivity(impl);

        displayToast("Just Desert");
    }

    public void showIntentDesert3(View view) {
        Intent impl = new Intent(DesertsActivty.this,Desert3Activity.class);
        startActivity(impl);

        displayToast("Maybe Desert");
    }

    public void showIntentDesert4(View view) {
        Intent impl = new Intent(DesertsActivty.this,Desert4Activity.class);
        startActivity(impl);

        displayToast("Another Desert");
    }

    public void showIntentDeserts(View view) {
        Intent impl = new Intent(DesertsActivty.this,MainActivity.class);
        startActivity(impl);

        displayToast("Deserts");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show(); }
}
