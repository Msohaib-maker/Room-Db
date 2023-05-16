package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText amount = findViewById(R.id.editTextTextPersonName); // amount
        EditText title = findViewById(R.id.editTextTextPersonName2); // title
        Button btn = findViewById(R.id.button);

        DataBaseHelper db = DataBaseHelper.getInstance(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = title.getText().toString();
                String A = amount.getText().toString();

                db.expenseDAO().InsertData(new Expense(t,A));

                List<Expense> expenseList = db.expenseDAO().getExpenses();

                if(expenseList != null)
                {
                    Expense e = expenseList.get(0);
                    Log.d("Data",e.getAmount() + " " + e.getTitle());
                }
            }
        });


    }
}