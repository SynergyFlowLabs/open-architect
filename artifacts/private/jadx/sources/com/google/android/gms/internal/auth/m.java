package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements com.google.android.gms.auth.account.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Status f107706a = new Status(13);

    @Override // com.google.android.gms.auth.account.b
    public final void a(com.google.android.gms.common.api.l lVar, boolean z10) {
        c(lVar, z10);
    }

    @Override // com.google.android.gms.auth.account.b
    public final com.google.android.gms.common.api.p<com.google.android.gms.auth.account.b.a> b(com.google.android.gms.common.api.l lVar, String str) {
        return lVar.m(new f(this, com.google.android.gms.auth.account.a.f105071a, lVar, str));
    }

    @Override // com.google.android.gms.auth.account.b
    public final com.google.android.gms.common.api.p<com.google.android.gms.common.api.v> c(com.google.android.gms.common.api.l lVar, boolean z10) {
        return lVar.m(new d(this, com.google.android.gms.auth.account.a.f105071a, lVar, z10));
    }

    @Override // com.google.android.gms.auth.account.b
    public final com.google.android.gms.common.api.p<com.google.android.gms.common.api.v> d(com.google.android.gms.common.api.l lVar, Account account) {
        return lVar.m(new h(this, com.google.android.gms.auth.account.a.f105071a, lVar, account));
    }
}
