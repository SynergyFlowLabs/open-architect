package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 extends Handler {
    public q1() {
        Looper.getMainLooper();
    }

    public q1(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
