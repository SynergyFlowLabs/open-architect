package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class o0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p0 f107719a;

    o0(p0 p0Var) {
        this.f107719a = p0Var;
    }

    @Override // com.google.android.gms.internal.auth.a0, com.google.android.gms.internal.auth.d0
    public final void v5(String str) {
        p0 p0Var = this.f107719a;
        if (str != null) {
            p0Var.o(new s0(str));
        } else {
            p0Var.o(new s0(new Status(com.google.android.gms.auth.api.proxy.a.f105602z)));
        }
    }
}
