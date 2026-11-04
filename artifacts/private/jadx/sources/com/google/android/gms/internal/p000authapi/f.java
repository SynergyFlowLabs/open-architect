package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class f extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f107505a;

    f(g gVar, l lVar) {
        this.f107505a = lVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.p0
    public final void j8(Status status, SavePasswordResult savePasswordResult) throws RemoteException {
        c0.b(status, savePasswordResult, this.f107505a);
    }
}
