package com.sathya.workmanager;

import android.content.Context;
//import android.support.annotation.NonNull;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;


public class MyWorkC extends Worker {

    private static final String TAB =  "tag";//MyWorkC.class.getSimpleName();

    public MyWorkC(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Log.d(TAB,"My WorkC");

        return Result.success();
    }
}
