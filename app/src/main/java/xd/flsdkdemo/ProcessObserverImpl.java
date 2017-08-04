package xd.flsdkdemo;

import android.app.ActivityManager;
import android.app.IProcessObserver;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;

import java.util.Iterator;
import java.util.List;

import static android.content.Context.ACTIVITY_SERVICE;

/**
 * Created by Karma on 2017/7/27.
 */

public class ProcessObserverImpl extends IProcessObserver.Stub {

    @Override
    public void onForegroundActivitiesChanged(int pid, int uid, boolean foregroundActivities) throws RemoteException {
//        Log.i("llj", "onForegroundActivitiesChanged: pid--->> " + pid + "----uid--->> " + uid);
        Log.i("llj", " ");
        Log.i("llj", " ");
        Log.i("llj", "onForegroundActivitiesChanged: pid--->>" + pid + "   进程名称---->>>" + getAppName(pid) + "---foregroundActivities-->>>" + foregroundActivities);
    }

    @Override
    public void onProcessStateChanged(int pid, int uid, int procState) throws RemoteException {
        Log.i("llj", "onProcessStateChanged: pid---->>>" + pid + "  进程名称---->>>" + getAppName(pid) + "----procState---->>>" + procState);
    }

    @Override
    public void onProcessDied(int pid, int uid) throws RemoteException {
        Log.i("llj", "onProcessDied: pid---->>" + pid + "  进程名称---->>>" + getAppName(pid));
    }


    private String getAppName(int pID) {
        String processName = "";
        ActivityManager am = (ActivityManager) DemoApplication.instance.getSystemService(ACTIVITY_SERVICE);
        List l = am.getRunningAppProcesses();
        Iterator i = l.iterator();
        PackageManager pm = DemoApplication.instance.getPackageManager();
        while (i.hasNext()) {
            ActivityManager.RunningAppProcessInfo info = (ActivityManager.RunningAppProcessInfo) (i.next());
            try {
                if (info.pid == pID) {
                    CharSequence c = pm.getApplicationLabel(pm.getApplicationInfo(info.processName, PackageManager.GET_META_DATA));
                    //Log.d("Process", "Id: "+ info.pid +" ProcessName: "+ info.processName +"  Label: "+c.toString());
                    //processName = c.toString();
                    processName = info.processName;
                }
            } catch (Exception e) {
                //Log.d("Process", "Error>> :"+ e.toString());
            }
        }
        return processName;
    }
}
