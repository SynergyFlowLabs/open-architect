package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class k2 extends n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f108137a;

    k2(com.google.android.gms.tasks.l lVar) {
        this.f108137a = lVar;
    }

    @Override // com.google.android.gms.internal.location.o4
    public final void J4(int i10, PendingIntent pendingIntent) {
        com.google.android.gms.common.api.internal.c0.a(new Status(com.google.android.gms.location.i.b(i10)), this.f108137a);
    }

    @Override // com.google.android.gms.internal.location.o4
    public final void f9(int i10, String[] strArr) {
        com.google.android.gms.common.api.internal.c0.a(new Status(com.google.android.gms.location.i.b(i10)), this.f108137a);
    }

    @Override // com.google.android.gms.internal.location.o4
    public final void vf(int i10, String[] strArr) {
        com.google.android.gms.common.api.internal.c0.a(new Status(com.google.android.gms.location.i.b(i10)), this.f108137a);
    }
}
