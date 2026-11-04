package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.auth.m;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public class c extends k<com.google.android.gms.common.api.a.d.C0969d> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f105075n;

    c(@NonNull Activity activity) {
        super(activity, a.f105071a, com.google.android.gms.common.api.a.d.N1, k.a.f106306c);
        this.f105075n = new m();
    }

    @NonNull
    public Task<Account> K0(@NonNull String str) {
        return v.b(this.f105075n.b(l0(), str), new j(this));
    }

    @NonNull
    public Task<Void> L0(@NonNull Account account) {
        return v.c(this.f105075n.d(l0(), account));
    }

    @NonNull
    public Task<Void> M0(boolean z10) {
        return v.c(this.f105075n.c(l0(), z10));
    }

    c(@NonNull Context context) {
        super(context, a.f105071a, com.google.android.gms.common.api.a.d.N1, k.a.f106306c);
        this.f105075n = new m();
    }
}
