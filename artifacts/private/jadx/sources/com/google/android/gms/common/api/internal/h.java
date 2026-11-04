package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class h implements com.google.android.gms.common.api.v, com.google.android.gms.common.api.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @g6.a
    protected final Status f106038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @g6.a
    protected final DataHolder f106039b;

    @g6.a
    protected h(@NonNull DataHolder dataHolder, @NonNull Status status) {
        this.f106038a = status;
        this.f106039b = dataHolder;
    }

    @Override // com.google.android.gms.common.api.r
    @g6.a
    public void release() {
        DataHolder dataHolder = this.f106039b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.api.v
    @NonNull
    @g6.a
    public Status t() {
        return this.f106038a;
    }

    @g6.a
    protected h(@NonNull DataHolder dataHolder) {
        this(dataHolder, new Status(dataHolder.p2()));
    }
}
