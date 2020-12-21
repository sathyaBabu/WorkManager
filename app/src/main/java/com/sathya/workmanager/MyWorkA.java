package com.sathya.workmanager;

import android.content.Context;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorkA extends Worker {

    private static final String TAB =  "tag";//MyWorkA.class.getSimpleName();

    public MyWorkA(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Log.d(TAB,"My WorkA");

        return Result.success();
    }
}
