package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.v;

/* JADX INFO: loaded from: classes4.dex */
final class h0<R extends v> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final v f105939r;

    public h0(l lVar, v vVar) {
        super(lVar);
        this.f105939r = vVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R k(Status status) {
        return (R) this.f105939r;
    }
}
