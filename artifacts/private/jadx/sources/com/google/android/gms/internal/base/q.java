package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public class q extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f107951a;

    public q() {
        this.f107951a = Looper.getMainLooper();
    }

    public q(Looper looper) {
        super(looper);
        this.f107951a = Looper.getMainLooper();
    }

    public q(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f107951a = Looper.getMainLooper();
    }
}
