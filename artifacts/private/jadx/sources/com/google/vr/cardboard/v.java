package com.google.vr.cardboard;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes5.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f126919a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            f126919a.post(runnable);
        }
    }

    public static boolean b() {
        return f126919a.getLooper() == Looper.myLooper();
    }
}
