package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.internal.c3;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.analytics.connector.a f122777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m8.d f122778b;

    public k(z8.a<com.google.firebase.analytics.connector.a> aVar, m8.d dVar) {
        this.f122777a = new c3(aVar);
        this.f122778b = dVar;
    }

    @q8.e
    @ij.f
    com.google.firebase.analytics.connector.a a() {
        return this.f122777a;
    }

    @q8.e
    @ij.f
    m8.d b() {
        return this.f122778b;
    }
}
