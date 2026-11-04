package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class q {
    private q() {
    }

    @NonNull
    public static p<Status> a() {
        com.google.android.gms.common.api.internal.a0 a0Var = new com.google.android.gms.common.api.internal.a0(Looper.getMainLooper());
        a0Var.f();
        return a0Var;
    }

    @NonNull
    public static <R extends v> p<R> b(@NonNull R r10) {
        com.google.android.gms.common.internal.w.s(r10, "Result must not be null");
        com.google.android.gms.common.internal.w.b(r10.t().b2() == 16, "Status code must be CommonStatusCodes.CANCELED");
        g0 g0Var = new g0(r10);
        g0Var.f();
        return g0Var;
    }

    @NonNull
    @g6.a
    public static <R extends v> p<R> c(@NonNull R r10, @NonNull l lVar) {
        com.google.android.gms.common.internal.w.s(r10, "Result must not be null");
        com.google.android.gms.common.internal.w.b(!r10.t().q2(), "Status code must not be SUCCESS");
        h0 h0Var = new h0(lVar, r10);
        h0Var.o(r10);
        return h0Var;
    }

    @NonNull
    public static <R extends v> o<R> d(@NonNull R r10) {
        com.google.android.gms.common.internal.w.s(r10, "Result must not be null");
        i0 i0Var = new i0(null);
        i0Var.o(r10);
        return new com.google.android.gms.common.api.internal.s(i0Var);
    }

    @NonNull
    @g6.a
    public static <R extends v> o<R> e(@NonNull R r10, @NonNull l lVar) {
        com.google.android.gms.common.internal.w.s(r10, "Result must not be null");
        i0 i0Var = new i0(lVar);
        i0Var.o(r10);
        return new com.google.android.gms.common.api.internal.s(i0Var);
    }

    @NonNull
    public static p<Status> f(@NonNull Status status) {
        com.google.android.gms.common.internal.w.s(status, "Result must not be null");
        com.google.android.gms.common.api.internal.a0 a0Var = new com.google.android.gms.common.api.internal.a0(Looper.getMainLooper());
        a0Var.o(status);
        return a0Var;
    }

    @NonNull
    @g6.a
    public static p<Status> g(@NonNull Status status, @NonNull l lVar) {
        com.google.android.gms.common.internal.w.s(status, "Result must not be null");
        com.google.android.gms.common.api.internal.a0 a0Var = new com.google.android.gms.common.api.internal.a0(lVar);
        a0Var.o(status);
        return a0Var;
    }
}
