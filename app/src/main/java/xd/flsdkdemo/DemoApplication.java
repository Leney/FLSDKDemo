package xd.flsdkdemo;

import android.app.Application;

import vest.xlib.main.XMain;

/**
 * Created by llj on 2017/7/25.
 */

public class DemoApplication extends Application {

    private static final int NUM_BUTTONS = 8;
    private static final int MAX_RECENT_TASKS = NUM_BUTTONS * 2;

    private int recentTasks_No = 0;

    public static DemoApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        XMain.init(getApplicationContext());
    }




}
