package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
@e.b(24)
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private static final Method f108593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private static final Method f108594b;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        f108593a = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
        }
        f108594b = declaredMethod2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    public static int a(Context context, JobInfo jobInfo, String str, String str2) {
        int iIntValue;
        JobScheduler jobScheduler = (JobScheduler) com.google.common.base.j0.E((JobScheduler) context.getSystemService("jobscheduler"));
        if (f108593a == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        Method method = f108594b;
        int iIntValue2 = 0;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, null);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        } else {
            iIntValue = 0;
        }
        Method method2 = f108593a;
        if (method2 != null) {
            try {
                Integer num2 = (Integer) method2.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(iIntValue), "UploadAlarm");
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                iIntValue2 = jobScheduler.schedule(jobInfo);
            }
        } else {
            iIntValue2 = jobScheduler.schedule(jobInfo);
        }
        return iIntValue2;
    }
}
