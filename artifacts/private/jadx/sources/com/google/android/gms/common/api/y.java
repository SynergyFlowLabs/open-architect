package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.google.android.gms.common.api.internal.t2;
import com.google.android.gms.common.api.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y<R extends v, S extends v> {
    @NonNull
    public final p<S> a(@NonNull Status status) {
        return new t2(status);
    }

    @NonNull
    public Status b(@NonNull Status status) {
        return status;
    }

    @m1
    @p0
    public abstract p<S> c(@NonNull R r10);
}
