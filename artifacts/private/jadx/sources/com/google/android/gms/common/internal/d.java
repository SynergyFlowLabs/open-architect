package com.google.android.gms.common.internal;

import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class d {
    private d() {
        throw new AssertionError("Uninstantiable");
    }

    @g6.a
    public static void a(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String.valueOf(Thread.currentThread());
        String.valueOf(Looper.getMainLooper().getThread());
        throw new IllegalStateException(str);
    }

    @g6.a
    public static void b(@NonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String.valueOf(Thread.currentThread());
        String.valueOf(Looper.getMainLooper().getThread());
        throw new IllegalStateException(str);
    }

    @g6.a
    public static void c(@fj.h Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @g6.a
    public static void d(@fj.h Object obj, @NonNull Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @g6.a
    public static void e(@fj.h Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @g6.a
    public static void f(@fj.h Object obj, @NonNull Object obj2) {
        if (obj != null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @g6.a
    public static void g(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @g6.a
    public static void h(boolean z10, @NonNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
