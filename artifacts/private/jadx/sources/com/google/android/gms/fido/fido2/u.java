package com.google.android.gms.fido.fido2;

import android.app.PendingIntent;
import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.internal.fido.w0;

/* JADX INFO: loaded from: classes4.dex */
final class u extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f107348a;

    u(c cVar, com.google.android.gms.tasks.l lVar) {
        this.f107348a = lVar;
    }

    @Override // com.google.android.gms.internal.fido.x0
    public final void t(Status status, @p0 PendingIntent pendingIntent) {
        c0.b(status, pendingIntent, this.f107348a);
    }
}
