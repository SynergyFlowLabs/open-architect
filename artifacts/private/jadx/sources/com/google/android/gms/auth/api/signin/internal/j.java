package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class j extends o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Context f105682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f105683u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(com.google.android.gms.common.api.l lVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(lVar);
        this.f105682t = context;
        this.f105683u = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.v k(Status status) {
        return new com.google.android.gms.auth.api.signin.e(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((v) ((h) bVar).M()).s(new i(this, this.f105682t, this.f105683u), this.f105683u);
    }
}
