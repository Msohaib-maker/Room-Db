package com.example.roomdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ExpenseDAO {

    @Query("select * from exp")
    List<Expense> getExpenses();

    @Insert
    void InsertData(Expense e);

    @Delete
    void DeleteData(Expense e);

    @Update
    void UpdateData(Expense e);
}
