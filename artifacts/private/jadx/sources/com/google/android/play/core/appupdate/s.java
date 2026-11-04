package com.google.android.play.core.appupdate;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class s extends com.google.android.play.core.appupdate.internal.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f114879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f114880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f114881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(w wVar, com.google.android.gms.tasks.l lVar, com.google.android.gms.tasks.l lVar2, String str) {
        super(lVar);
        this.f114881d = wVar;
        this.f114879b = lVar2;
        this.f114880c = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.appupdate.internal.l] */
    @Override // com.google.android.play.core.appupdate.internal.t
    protected final void a() {
        try {
            this.f114881d.f114889a.e().Y7(this.f114881d.f114890b, w.i(), new u(this.f114881d, this.f114879b));
        } catch (RemoteException e10) {
            w.f114887e.c(e10, "completeUpdate(%s)", this.f114880c);
            this.f114879b.d(new RuntimeException(e10));
        }
    }
}
