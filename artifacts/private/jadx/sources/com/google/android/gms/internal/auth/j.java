package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class j implements com.google.android.gms.auth.account.b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Account f107662c = new Account("DUMMY_NAME", "com.google");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f107663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Account f107664b;

    public j(Status status, @androidx.annotation.p0 Account account) {
        this.f107663a = status;
        this.f107664b = account == null ? f107662c : account;
    }

    @Override // com.google.android.gms.auth.account.b.a
    public final Account r() {
        return this.f107664b;
    }

    @Override // com.google.android.gms.common.api.v
    public final Status t() {
        return this.f107663a;
    }
}
