package com.edu.studentcourseguide;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.edu.studentcourseguide.R;

public class Event_view extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.event_view, menu);
        return true;
    }

}
