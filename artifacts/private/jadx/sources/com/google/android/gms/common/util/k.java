package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class k implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f106941a = new k();

    private k() {
    }

    @NonNull
    @g6.a
    public static g d() {
        return f106941a;
    }

    @Override // com.google.android.gms.common.util.g
    public final long a() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.g
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.g
    public final long c() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // com.google.android.gms.common.util.g
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
