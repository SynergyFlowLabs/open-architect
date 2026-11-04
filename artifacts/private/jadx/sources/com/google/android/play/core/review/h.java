package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.l;
import com.google.android.play.core.review.internal.t;

/* JADX INFO: loaded from: classes4.dex */
class h extends com.google.android.play.core.review.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.core.review.internal.i f114941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l f114942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f114943c;

    h(j jVar, com.google.android.play.core.review.internal.i iVar, l lVar) {
        this.f114943c = jVar;
        this.f114941a = iVar;
        this.f114942b = lVar;
    }

    @Override // com.google.android.play.core.review.internal.h
    public void r(Bundle bundle) throws RemoteException {
        t tVar = this.f114943c.f114976a;
        if (tVar != null) {
            tVar.u(this.f114942b);
        }
        this.f114941a.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
