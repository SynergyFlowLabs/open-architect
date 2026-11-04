package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class c0 {
    @g6.a
    public static void a(@NonNull Status status, @NonNull com.google.android.gms.tasks.l<Void> lVar) {
        b(status, null, lVar);
    }

    @g6.a
    public static <ResultT> void b(@NonNull Status status, @androidx.annotation.p0 ResultT resultt, @NonNull com.google.android.gms.tasks.l<ResultT> lVar) {
        if (status.q2()) {
            lVar.c(resultt);
        } else {
            lVar.b(com.google.android.gms.common.internal.c.a(status));
        }
    }

    @g6.a
    public static <ResultT> void c(@NonNull Status status, @androidx.annotation.p0 ResultT resultt, @NonNull com.google.android.gms.tasks.l<ResultT> lVar, @androidx.annotation.p0 ApiMetadata apiMetadata) {
        b(status, resultt, lVar);
    }

    @NonNull
    @g6.a
    @Deprecated
    public static Task<Void> d(@NonNull Task<Boolean> task) {
        return task.l(new b3());
    }

    @g6.a
    public static <ResultT> boolean e(@NonNull Status status, @androidx.annotation.p0 ResultT resultt, @NonNull com.google.android.gms.tasks.l<ResultT> lVar) {
        return status.q2() ? lVar.e(resultt) : lVar.d(com.google.android.gms.common.internal.c.a(status));
    }

    @g6.a
    public static <ResultT> boolean f(@NonNull Status status, @androidx.annotation.p0 ResultT resultt, @NonNull com.google.android.gms.tasks.l<ResultT> lVar, @androidx.annotation.p0 ApiMetadata apiMetadata) {
        return e(status, resultt, lVar);
    }
}
