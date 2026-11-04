package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements com.google.android.gms.auth.api.proxy.b.InterfaceC0962b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f107791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107792b;

    public s0(@fj.g Status status) {
        this.f107791a = (Status) com.google.android.gms.common.internal.w.r(status);
        this.f107792b = "";
    }

    @Override // com.google.android.gms.auth.api.proxy.b.InterfaceC0962b
    public final String m() {
        return this.f107792b;
    }

    @Override // com.google.android.gms.common.api.v
    public final Status t() {
        return this.f107791a;
    }

    public s0(@fj.g String str) {
        this.f107792b = (String) com.google.android.gms.common.internal.w.r(str);
        this.f107791a = Status.f105886f;
    }
}
