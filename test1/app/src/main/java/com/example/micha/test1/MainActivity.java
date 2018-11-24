package com.example.micha.test1;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SimpleCursorAdapter;

import java.sql.SQLException;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TaskListDataBase db = new TaskListDataBase(this);
        try {
            db.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        long val = db.insertTask("Clean fridge", "Scatter all shelves of waste", "0");
        long val2 = db.insertTask("Clean room", "Brush and remove stray clothes", "1");
        long val3 = db.insertTask("Sweep front garden", "A bunch of leaves Vs. broom", "0");

        Cursor dbCursor = db.getAllTasks();
        dbCursor.moveToFirst();

        String[] columns = {"_id", "task_name", "task_desc", "status"};
        //String[] columns = {"task_name"};
        int[] rowIDs = {R.id.taskid, R.id.taskName, R.id.taskDes, R.id.taskStatus};
        //int[] rowIDs = {R.id.taskName};

        SimpleCursorAdapter mAdapter = (new SimpleCursorAdapter(this,
                R.layout.row, dbCursor, columns, rowIDs));

        setListAdapter(mAdapter);
        db.close();
    }
}
