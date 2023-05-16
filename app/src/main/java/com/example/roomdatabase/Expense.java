package com.example.roomdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "exp")
class Expense
{
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private String amount;
    @ColumnInfo
    private String title;

    public Expense(int id,String title,String amount)
    {
        this.id = id;
        this.amount = amount;
        this.title = title;
    }

    @Ignore
    public Expense(String title,String amount)
    {
        this.amount = amount;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
