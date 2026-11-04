package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b1 f106657a = new x0();

    @g6.a
    public interface a<R extends com.google.android.gms.common.api.v, T> {
        @androidx.annotation.p0
        @g6.a
        T a(@NonNull R r10);
    }

    @NonNull
    @g6.a
    public static <R extends com.google.android.gms.common.api.v, T extends com.google.android.gms.common.api.u<R>> Task<T> a(@NonNull com.google.android.gms.common.api.p<R> pVar, @NonNull T t10) {
        return b(pVar, new z0(t10));
    }

    @NonNull
    @g6.a
    public static <R extends com.google.android.gms.common.api.v, T> Task<T> b(@NonNull com.google.android.gms.common.api.p<R> pVar, @NonNull a<R, T> aVar) {
        b1 b1Var = f106657a;
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        pVar.c(new y0(pVar, lVar, aVar, b1Var));
        return lVar.a();
    }

    @NonNull
    @g6.a
    public static <R extends com.google.android.gms.common.api.v> Task<Void> c(@NonNull com.google.android.gms.common.api.p<R> pVar) {
        return b(pVar, new a1());
    }
}
