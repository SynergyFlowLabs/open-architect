package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class o2 extends t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f108162a;

    o2(com.google.android.gms.tasks.l lVar) {
        this.f108162a = lVar;
    }

    @Override // com.google.android.gms.internal.location.u4
    public final void l9(Status status, Location location) {
        com.google.android.gms.common.api.internal.c0.b(status, location, this.f108162a);
    }
}
