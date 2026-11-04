package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class p extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f107520a;

    p(q qVar, l lVar) {
        this.f107520a = lVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.j0
    public final void y0(Status status, PendingIntent pendingIntent) {
        c0.b(status, pendingIntent, this.f107520a);
    }
}
