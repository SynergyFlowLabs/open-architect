package com.android.volley.toolbox;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class c0 {
    private c0() {
    }

    static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
    }
}
