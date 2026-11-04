package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes4.dex */
final class i2 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f108122a;

    i2(com.google.android.gms.tasks.l lVar) {
        this.f108122a = lVar;
    }

    @Override // com.google.android.gms.internal.location.c
    public final void z2(LocationSettingsResult locationSettingsResult) {
        com.google.android.gms.common.api.internal.c0.b(locationSettingsResult.t(), new com.google.android.gms.location.q(locationSettingsResult), this.f108122a);
    }
}
