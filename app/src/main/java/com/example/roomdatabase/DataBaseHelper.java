package com.example.roomdatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Expense.class},exportSchema = false, version = 1)
public abstract class DataBaseHelper extends RoomDatabase {
    private static final String DB_Name = "expensedb";
    private static DataBaseHelper instance = null;

    public static DataBaseHelper getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            DataBaseHelper.class, DB_Name)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    public abstract ExpenseDAO expenseDAO();
}
