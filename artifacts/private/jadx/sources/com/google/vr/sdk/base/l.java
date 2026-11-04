package com.google.vr.sdk.base;

import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes5.dex */
public class l {
    public static boolean a(Context context) {
        return b(context, "android.permission.CAMERA");
    }

    public static boolean b(Context context, String str) {
        if (context != null && str != null && context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        return b(context, "android.permission.READ_EXTERNAL_STORAGE") && b(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
