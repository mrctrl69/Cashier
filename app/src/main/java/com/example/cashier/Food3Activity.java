package com.example.cashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Food3Activity extends AppCompatActivity {

    Button addAnother;
    Button back;
    Button checkout;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food3);

        addAnother = findViewById(R.id.btnAddFood3);
        back = findViewById(R.id.btnBackFood3);
        ok = findViewById(R.id.btnOkFood3);
    }

    public void showIntentMain(View view) {
        Intent impl = new Intent(Food3Activity.this,MainActivity.class);
        startActivity(impl);

        displayToast("Home");
    }

    public void showIntentFoods(View view) {
        Intent impl = new Intent(Food3Activity.this,FoodsActivity.class);
        startActivity(impl);

        displayToast("Foods");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
