package com.google.firebase;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
@u7.d
public abstract class v {
    @NonNull
    public static v a(long j10, long j11, long j12) {
        return new a(j10, j11, j12);
    }

    @NonNull
    public static v e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
