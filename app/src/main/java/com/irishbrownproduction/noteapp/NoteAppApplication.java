package com.irishbrownproduction.noteapp;

import android.app.Application;

/**
 * Created by IrishBrownProduction on 3/27/2015.
 */
public class NoteAppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "FY193M2BxW34RubxbPDlM9W7NmCAjy1miO8V4Zvd", "9H9BtJUATGh6QAawSwJZh5WxaH33WOVNGxo2Bqzx");
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveIn  Background();
    }
}
