package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class n extends k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f107518a;

    n(q qVar, l lVar) {
        this.f107518a = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final void s6(Status status) throws RemoteException {
        c0.a(status, this.f107518a);
    }
}
