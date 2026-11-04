package com.google.vr.cardboard;

import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public class n {
    public static boolean a() {
        String str = Build.HARDWARE;
        return "goldfish".equals(str) || "ranchu".equals(str);
    }
}
