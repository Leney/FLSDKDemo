package xd.flsdkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        moniterAppProcess();


//        ActivityManager result = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
//        ArrayList<ActivityManager.RecentTaskInfo> apps = (ArrayList<ActivityManager.RecentTaskInfo>) result.getRecentTasks(10, ActivityManager.RECENT_WITH_EXCLUDED);
//        Log.i("llj","apps.size---->>>"+apps.size());
//        apps.clear();
//        ArrayList<ActivityManager.RecentTaskInfo> apps2 = (ArrayList<ActivityManager.RecentTaskInfo>) result.getRecentTasks(10, ActivityManager.RECENT_WITH_EXCLUDED);
//        Log.i("llj","apps2.size---->>>"+apps2.size());
    }


//    public void moniterAppProcess() {
//        try {
//            Class<?> activityManagerNative = Class.forName("android.app.ActivityManagerNative");
//            Method getDefaultMethod = activityManagerNative.getMethod("getDefault");
//            Object iActivityManager = getDefaultMethod.invoke((Object[]) null, (Object[]) null);
//            if (iActivityManager != null) {
//                Method registerMethod = activityManagerNative.getMethod("registerProcessObserver", new Class[]{IProcessObserver.class});
//                registerMethod.invoke(iActivityManager, new ProcessObserverImpl());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
