package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public class x extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f107997a;

    public x() {
        this.f107997a = Looper.getMainLooper();
    }

    public x(Looper looper) {
        super(looper);
        this.f107997a = Looper.getMainLooper();
    }

    public x(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f107997a = Looper.getMainLooper();
    }
}
