package com.google.android.gms.common.api;

import androidx.annotation.p0;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.v;

/* JADX INFO: loaded from: classes4.dex */
final class i0<R extends v> extends BasePendingResult<R> {
    public i0(@p0 l lVar) {
        super(lVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R k(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
