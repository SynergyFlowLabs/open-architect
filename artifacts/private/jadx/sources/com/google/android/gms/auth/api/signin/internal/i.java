package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class i extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f105679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f105680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f105681c;

    i(j jVar, Context context, GoogleSignInOptions googleSignInOptions) {
        this.f105679a = context;
        this.f105680b = googleSignInOptions;
        this.f105681c = jVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.d, com.google.android.gms.auth.api.signin.internal.u
    public final void va(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        if (googleSignInAccount != null) {
            Context context = this.f105679a;
            q.c(context).e(this.f105680b, googleSignInAccount);
        }
        this.f105681c.o(new com.google.android.gms.auth.api.signin.e(googleSignInAccount, status));
    }
}
