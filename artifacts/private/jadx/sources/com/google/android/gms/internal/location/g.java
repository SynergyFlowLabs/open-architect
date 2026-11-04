package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements com.google.android.gms.location.b {
    @Override // com.google.android.gms.location.b
    public final com.google.android.gms.common.api.p<Status> a(com.google.android.gms.common.api.l lVar, PendingIntent pendingIntent) {
        return lVar.m(new e(this, lVar, pendingIntent));
    }

    @Override // com.google.android.gms.location.b
    public final com.google.android.gms.common.api.p<Status> b(com.google.android.gms.common.api.l lVar, long j10, PendingIntent pendingIntent) {
        return lVar.m(new d(this, lVar, j10, pendingIntent));
    }
}
