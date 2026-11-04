package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class f extends com.google.android.gms.common.api.internal.e.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ String f107628t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(m mVar, com.google.android.gms.common.api.a aVar, com.google.android.gms.common.api.l lVar, String str) {
        super((com.google.android.gms.common.api.a<?>) aVar, lVar);
        this.f107628t = str;
    }

    @Override // com.google.android.gms.common.api.internal.e.a, com.google.android.gms.common.api.internal.e.b
    @g6.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.o((com.google.android.gms.common.api.v) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.v k(Status status) {
        return new j(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((com.google.android.gms.auth.account.h) ((n) bVar).M()).Me(new e(this), this.f107628t);
    }
}
