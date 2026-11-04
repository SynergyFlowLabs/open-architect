package com.google.android.gms.internal.cloudmessaging;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f107957a;

    public f() {
        this.f107957a = Looper.getMainLooper();
    }

    public f(Looper looper) {
        super(looper);
        this.f107957a = Looper.getMainLooper();
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f107957a = Looper.getMainLooper();
    }
}
