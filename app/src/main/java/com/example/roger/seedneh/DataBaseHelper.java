package com.example.roger.seedneh;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Roger on 4/26/2016.
 */
public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Se'edne.db";
    public static final String TABLE_NAME = "elderly_table";
    public static final String COL_1 = "ElderlyID";
    public static final String COL_2 = "FullName";
    public static final String COL_3 = "Gender";
    public static final String COL_4 = "Phone1";
    public static final String COL_5 = "Phone2";
    public static final String COL_6 = "Address";
    public static final String TABLE_NAME1 = "caretacker_table";
    public static final String COL_7 = "CaretakerID";
    public static final String COL_8 = "ElderlyID";
    public static final String COL_9 = "Username";
    public static final String COL_10 = "Password";
    public static final String COL_11 = "FullName";
    public static final String COL_12 = "Gender";
    public static final String COL_13 = "Phone1";
    public static final String COL_14 = "Phone2";
    public static final String COL_15 = "Address";
    public static final String COL_16 = "RelatedToElderly";


    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ElderlyID INTEGER PRIMARY KEY AUTOINCREMENT, FullName TEXT, Gender TEXT , Phone1 NUMBER , Phone2 NUMBER , Address TEXT )");
        db.execSQL("create table " + TABLE_NAME1 + "(CaretakerID INTEGER PRIMARY KEY AUTOINCREMENT, ElderlyID INTEGER FOREIGN KEY , Username TEXT, Password TEXT,FullName TEXT, Gender TEXT , Phone1 NUMBER , Phone2 NUMBER , Address TEXT , RelatedToElderly TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME1);
        onCreate(db);

    }

    public boolean insertData(String fullname, String gender, String phone1, String phone2, String address) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, fullname);
        contentValues.put(COL_3, gender);
        contentValues.put(COL_4, phone1);
        contentValues.put(COL_5, phone2);
        contentValues.put(COL_6, address);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;

    }


    public static String saveBitmap(Context context, Bitmap bitmap) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 10, bos);
        String fileName = "Picture" + System.currentTimeMillis() + ".jpg";
        FileOutputStream fos = context.openFileOutput(fileName, Context.MODE_PRIVATE);
        fos.write(bos.toByteArray(), 0, bos.size());
        fos.flush();
        fos.close();
        return fileName;
    }
}