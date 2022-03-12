package sv.edu.udb.dsm.guia3.examenpractico;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import androidx.annotation.Nullable;
import android.database.Cursor;


public class DBHelper extends SQLiteOpenHelper {
    public static final String DBNAME="login.db";
    public DBHelper(Context context) {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users(usuario TEXT primary key, contra TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists users");
    }


    public Boolean insertData(String usuario, String contra) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        db.execSQL("insert into users(usuario, contra) values ('Jaime_Merino', 'MG170788')");

        long result = db.insert("users", null, values);
        if(result==-1) return false;
        else
            return true;
    }

    public Boolean checkusername(String usuario) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery( "select * from users where usuario=?", new String[] {usuario});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public Boolean checkusernamepassword(String usuario, String contra) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery( "select * from users where usuario=? and contra=?", new String[] {usuario, contra});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}


