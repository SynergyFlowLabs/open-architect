package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.v;

/* JADX INFO: loaded from: classes4.dex */
abstract class g extends h {
    public g(com.google.android.gms.common.api.l lVar) {
        super(lVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ v k(Status status) {
        return status;
    }
}
