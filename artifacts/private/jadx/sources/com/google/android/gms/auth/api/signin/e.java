package com.google.android.gms.auth.api.signin;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.v;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class e implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f105652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final GoogleSignInAccount f105653b;

    public e(@p0 GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.f105653b = googleSignInAccount;
        this.f105652a = status;
    }

    @p0
    public GoogleSignInAccount a() {
        return this.f105653b;
    }

    public boolean b() {
        return this.f105652a.q2();
    }

    @Override // com.google.android.gms.common.api.v
    @NonNull
    public Status t() {
        return this.f105652a;
    }
}
