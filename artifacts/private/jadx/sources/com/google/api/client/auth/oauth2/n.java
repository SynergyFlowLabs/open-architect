package com.google.api.client.auth.oauth2;

import com.google.api.client.util.h0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public final class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.api.client.util.store.d<q> f115224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f115225b;

    public n(String str, com.google.api.client.util.store.e eVar) throws IOException {
        this(str, q.b(eVar));
    }

    @Override // com.google.api.client.auth.oauth2.k
    public void a(j jVar, r rVar) throws IOException {
        d(jVar);
    }

    @Override // com.google.api.client.auth.oauth2.k
    public void b(j jVar, t tVar) throws IOException {
        d(jVar);
    }

    public com.google.api.client.util.store.d<q> c() {
        return this.f115224a;
    }

    public void d(j jVar) throws IOException {
        this.f115224a.b(this.f115225b, new q(jVar));
    }

    public n(String str, com.google.api.client.util.store.d<q> dVar) {
        this.f115225b = (String) h0.d(str);
        this.f115224a = (com.google.api.client.util.store.d) h0.d(dVar);
    }
}
