package com.google.android.play.core.appupdate;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class r extends com.google.android.play.core.appupdate.internal.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f114876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f114877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f114878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(w wVar, com.google.android.gms.tasks.l lVar, String str, com.google.android.gms.tasks.l lVar2) {
        super(lVar);
        this.f114878d = wVar;
        this.f114876b = str;
        this.f114877c = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.appupdate.internal.l] */
    @Override // com.google.android.play.core.appupdate.internal.t
    protected final void a() {
        try {
            ?? E = this.f114878d.f114889a.e();
            w wVar = this.f114878d;
            E.B8(wVar.f114890b, w.b(wVar, this.f114876b), new v(this.f114878d, this.f114877c, this.f114876b));
        } catch (RemoteException e10) {
            w.f114887e.c(e10, "requestUpdateInfo(%s)", this.f114876b);
            this.f114877c.d(new RuntimeException(e10));
        }
    }
}
