package ch.ethz.vs.se.team7.carbonfootprintmonitor.Storage;

/**
 * Created by Prashanth on 11/2/2017.
 */

public interface SQLQueries {
    String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS "
            + Contract.ActivityRecordedEntry.TABLE_NAME + " ("
            + Contract.ActivityRecordedEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Contract.ActivityRecordedEntry.COL_ACTIVITY_RECORDED + " TEXT NOT NULL, "
            + Contract.ActivityRecordedEntry.COL_CONFIDENCE + " DOUBLE NOT NULL, "
            + Contract.ActivityRecordedEntry.COL_SPEED + " DOUBLE NOT NULL, "
            + Contract.ActivityRecordedEntry.COL_LOCATION + " TEXT NOT NULL, "
            + Contract.ActivityRecordedEntry.COL_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" + ");";
}