package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
@Deprecated
public class c {
    @NonNull
    @g6.a
    public static String a(@NonNull PowerManager.WakeLock wakeLock, @NonNull String str) {
        String strValueOf = String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock)));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(strValueOf).concat(String.valueOf(str));
    }
}
