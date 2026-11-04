package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f107624a;

    e(f fVar) {
        this.f107624a = fVar;
    }

    @Override // com.google.android.gms.internal.auth.i, com.google.android.gms.auth.account.e
    public final void Q4(@androidx.annotation.p0 Account account) {
        this.f107624a.o(new j(account != null ? Status.f105886f : m.f107706a, account));
    }
}
