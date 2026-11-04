package com.google.firebase.inappmessaging.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@x8.a
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e f122903a;

    @ij.a
    p0(com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e eVar) {
        this.f122903a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.google.internal.firebase.inappmessaging.v1.sdkserving.i a(com.google.internal.firebase.inappmessaging.v1.sdkserving.g gVar) {
        return ((com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e) this.f122903a.j(30000L, TimeUnit.MILLISECONDS)).r(gVar);
    }
}
