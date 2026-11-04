package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class e extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f107504a;

    e(g gVar, l lVar) {
        this.f107504a = lVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.n0
    public final void L2(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) throws RemoteException {
        if (status.q2()) {
            this.f107504a.c(saveAccountLinkingTokenResult);
        } else {
            this.f107504a.b(c.a(status));
        }
    }
}
