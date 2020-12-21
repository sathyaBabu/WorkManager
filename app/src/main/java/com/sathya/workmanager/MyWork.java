package com.sathya.workmanager;

import android.content.Context;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWork extends Worker {

    private static final String TAB =  "tag";//MyWork.class.getSimpleName();

    public MyWork(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Log.d(TAB,"Working in BackGround");
//                    for(int i = 0;i <= 10000;i++){
//                        for(int ii = 0;ii <= 10000;ii++){
//
//                        }
//                        Log.e(TAB,"i = "+i);
//
//                    }


        return Result.success();
    }
}
