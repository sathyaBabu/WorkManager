package com.sathya.workmanager;

import android.content.Context;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyPeriodicWork extends Worker {

    private static final String TAB = "tag";//MyPeriodicWork.class.getSimpleName();

    public MyPeriodicWork(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }


    @NonNull
    @Override
    public Result doWork() {

        Log.d(TAB,"PeriodicWork in BackGround");

        return Result.success();
    }
}
