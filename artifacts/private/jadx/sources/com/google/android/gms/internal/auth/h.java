package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class h extends com.google.android.gms.common.api.internal.e.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Account f107643t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(m mVar, com.google.android.gms.common.api.a aVar, com.google.android.gms.common.api.l lVar, Account account) {
        super((com.google.android.gms.common.api.a<?>) aVar, lVar);
        this.f107643t = account;
    }

    @Override // com.google.android.gms.common.api.internal.e.a, com.google.android.gms.common.api.internal.e.b
    @g6.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.o((com.google.android.gms.common.api.v) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final com.google.android.gms.common.api.v k(Status status) {
        return new l(status);
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((com.google.android.gms.auth.account.h) ((n) bVar).M()).Oe(new g(this), this.f107643t);
    }
}
