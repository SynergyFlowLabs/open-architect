package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
abstract class c0 extends com.google.android.gms.common.api.internal.e.a {
    public c0(com.google.android.gms.common.api.l lVar) {
        super((com.google.android.gms.common.api.a<?>) k0.f108133o, lVar);
    }

    @Override // com.google.android.gms.common.api.internal.e.a, com.google.android.gms.common.api.internal.e.b
    @g6.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.o((com.google.android.gms.common.api.v) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.v k(Status status) {
        return status;
    }
}
