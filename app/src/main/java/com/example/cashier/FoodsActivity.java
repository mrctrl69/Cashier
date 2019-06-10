package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FoodsActivity extends AppCompatActivity {

    Button btnChoose;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);

        btnChoose = findViewById(R.id.btnChooseDesert);
        btnBack = findViewById(R.id.btnBackDesert);
    }

    public void showIntentFoods(View view) {
        Intent impl = new Intent(FoodsActivity.this,MainActivity.class);
        startActivity(impl);

        displayToast(getString(R.string.intentFoods));
    }

    public void showIntentFood1(View view) {
        Intent impl = new Intent(FoodsActivity.this,Food1Activity.class);
        startActivity(impl);

        displayToast("Chicken");
    }

    public void showIntentFood2(View view) {
        Intent impl = new Intent(FoodsActivity.this,Food2Activity.class);
        startActivity(impl);

        displayToast("Just Chicken");
    }

    public void showIntentFood3(View view) {
        Intent impl = new Intent(FoodsActivity.this,Food3Activity.class);
        startActivity(impl);

        displayToast("Maybe Chicken");
    }

    public void showIntentFood4(View view) {
        Intent impl = new Intent(FoodsActivity.this,Food4Activity.class);
        startActivity(impl);

        displayToast("Another Chicken");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show(); }
}
