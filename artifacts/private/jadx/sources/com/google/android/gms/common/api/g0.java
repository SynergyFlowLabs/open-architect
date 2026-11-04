package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.v;

/* JADX INFO: loaded from: classes4.dex */
final class g0<R extends v> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final v f105919r;

    public g0(v vVar) {
        super(Looper.getMainLooper());
        this.f105919r = vVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R k(Status status) {
        if (status.b2() == this.f105919r.t().b2()) {
            return (R) this.f105919r;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
