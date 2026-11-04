package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements com.google.android.gms.auth.api.signin.b {
    private static final GoogleSignInOptions f(com.google.android.gms.common.api.l lVar) {
        return ((h) lVar.o(com.google.android.gms.auth.api.a.f105081f)).w0();
    }

    @Override // com.google.android.gms.auth.api.signin.b
    public final com.google.android.gms.common.api.o<com.google.android.gms.auth.api.signin.e> a(com.google.android.gms.common.api.l lVar) {
        return p.e(lVar, lVar.q(), f(lVar), false);
    }

    @Override // com.google.android.gms.auth.api.signin.b
    public final Intent b(com.google.android.gms.common.api.l lVar) {
        return p.c(lVar.q(), f(lVar));
    }

    @Override // com.google.android.gms.auth.api.signin.b
    @p0
    public final com.google.android.gms.auth.api.signin.e c(Intent intent) {
        return p.d(intent);
    }

    @Override // com.google.android.gms.auth.api.signin.b
    public final com.google.android.gms.common.api.p<Status> d(com.google.android.gms.common.api.l lVar) {
        return p.f(lVar, lVar.q(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.b
    public final com.google.android.gms.common.api.p<Status> e(com.google.android.gms.common.api.l lVar) {
        return p.g(lVar, lVar.q(), false);
    }
}
