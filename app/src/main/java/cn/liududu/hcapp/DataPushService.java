package cn.liududu.hcapp;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

public class DataPushService extends JobService {
    public static String TAG = "DataPushService";
    public static int i = 0;
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d(TAG, "onStartJob: the job has been started " + i);
        i++;
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Log.d(TAG, "onStopJob: the job has been stopped");
        return false;
    }
}
