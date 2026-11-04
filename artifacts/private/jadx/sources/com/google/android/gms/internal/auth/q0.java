package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements com.google.android.gms.auth.api.proxy.b {
    @Override // com.google.android.gms.auth.api.proxy.b
    public final com.google.android.gms.common.api.p<com.google.android.gms.auth.api.proxy.b.a> a(com.google.android.gms.common.api.l lVar, ProxyRequest proxyRequest) {
        com.google.android.gms.common.internal.w.r(lVar);
        com.google.android.gms.common.internal.w.r(proxyRequest);
        return lVar.m(new n0(this, lVar, proxyRequest));
    }

    @Override // com.google.android.gms.auth.api.proxy.b
    public final com.google.android.gms.common.api.p<com.google.android.gms.auth.api.proxy.b.InterfaceC0962b> b(com.google.android.gms.common.api.l lVar) {
        com.google.android.gms.common.internal.w.r(lVar);
        return lVar.m(new p0(this, lVar));
    }
}
