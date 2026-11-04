package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class m extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f107517a;

    m(q qVar, l lVar) {
        this.f107517a = lVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.g0
    public final void t9(Status status, BeginSignInResult beginSignInResult) throws RemoteException {
        c0.b(status, beginSignInResult, this.f107517a);
    }
}
