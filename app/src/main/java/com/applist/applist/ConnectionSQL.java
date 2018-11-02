package com.applist.applist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.applist.applist.Utilities.Utilities;

// SQLiteOpenHelper is the connection class whit the database

public class ConnectionSQL extends SQLiteOpenHelper {

    public ConnectionSQL(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    // To generate the databases scripts
    // The table is created in Utilities class
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilities.CREATE_TABLE_ITEM);
    }

    // Verify, every time that open or install the app, if exist some database version
    // If exist delete and create a new one
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS items");
        onCreate(db);
    }
}
