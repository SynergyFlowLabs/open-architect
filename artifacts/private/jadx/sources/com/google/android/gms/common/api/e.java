package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f105914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p[] f105915b;

    e(Status status, p[] pVarArr) {
        this.f105914a = status;
        this.f105915b = pVarArr;
    }

    @NonNull
    public <R extends v> R a(@NonNull f<R> fVar) {
        com.google.android.gms.common.internal.w.b(fVar.f105916a < this.f105915b.length, "The result token does not belong to this batch");
        return (R) this.f105915b[fVar.f105916a].e(0L, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.common.api.v
    @NonNull
    public Status t() {
        return this.f105914a;
    }
}
