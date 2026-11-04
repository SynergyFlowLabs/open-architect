package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class r0 implements com.google.android.gms.auth.api.proxy.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f107781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ProxyResponse f107782b;

    public r0(Status status) {
        this.f107781a = status;
    }

    @Override // com.google.android.gms.auth.api.proxy.b.a
    public final ProxyResponse N() {
        return this.f107782b;
    }

    @Override // com.google.android.gms.common.api.v
    public final Status t() {
        return this.f107781a;
    }

    public r0(ProxyResponse proxyResponse) {
        this.f107782b = proxyResponse;
        this.f107781a = Status.f105886f;
    }
}
