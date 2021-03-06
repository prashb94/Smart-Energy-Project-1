package ch.ethz.vs.se.team7.carbonfootprintmonitor.Storage;

/**
 * Created by Prashanth on 10/23/2017
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ch.ethz.vs.se.team7.carbonfootprintmonitor.Storage.Contract.ActivityRecordedEntry;

import static ch.ethz.vs.se.team7.carbonfootprintmonitor.Storage.SQLQueries.CREATE_TABLE_QUERY;


public class DbHandler extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "recordedActivities.db";
    private static final int DATABASE_VERSION = 1;

    public DbHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        onCreate(sqLiteDatabase);
    }
}
