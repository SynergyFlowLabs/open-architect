package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes4.dex */
final class p2 extends r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f108168a;

    p2(com.google.android.gms.tasks.l lVar) {
        this.f108168a = lVar;
    }

    @Override // com.google.android.gms.internal.location.s4
    public final void u9(Status status, LocationAvailability locationAvailability) {
        com.google.android.gms.common.api.internal.c0.b(status, locationAvailability, this.f108168a);
    }
}
