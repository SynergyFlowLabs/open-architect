package com.google.api.client.auth.oauth2;

import com.google.api.client.util.h0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
@Deprecated
public final class m implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f115222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f115223b;

    public m(String str, l lVar) {
        this.f115223b = (String) h0.d(str);
        this.f115222a = (l) h0.d(lVar);
    }

    @Override // com.google.api.client.auth.oauth2.k
    public void a(j jVar, r rVar) throws IOException {
        d(jVar);
    }

    @Override // com.google.api.client.auth.oauth2.k
    public void b(j jVar, t tVar) throws IOException {
        d(jVar);
    }

    public l c() {
        return this.f115222a;
    }

    public void d(j jVar) throws IOException {
        this.f115222a.b(this.f115223b, jVar);
    }
}
