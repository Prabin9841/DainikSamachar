package com.example.dainiksamachar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    static int version =1;
    public static final String DATABASE_NAME ="database";





    public DatabaseHelper
            (@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, 1 );

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//        SQLiteDatabase.execSQL("");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
