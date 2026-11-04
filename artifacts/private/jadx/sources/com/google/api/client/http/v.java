package com.google.api.client.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f115739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f115740b;

    v(b0 b0Var, w wVar) {
        this.f115739a = b0Var;
        this.f115740b = wVar;
    }

    public u a(j jVar) throws IOException {
        return g("DELETE", jVar, null);
    }

    public u b(j jVar) throws IOException {
        return g("GET", jVar, null);
    }

    public u c(j jVar) throws IOException {
        return g("HEAD", jVar, null);
    }

    public u d(j jVar, m mVar) throws IOException {
        return g("PATCH", jVar, mVar);
    }

    public u e(j jVar, m mVar) throws IOException {
        return g("POST", jVar, mVar);
    }

    public u f(j jVar, m mVar) throws IOException {
        return g("PUT", jVar, mVar);
    }

    public u g(String str, j jVar, m mVar) throws IOException {
        u uVarA = this.f115739a.a();
        w wVar = this.f115740b;
        if (wVar != null) {
            wVar.b(uVarA);
        }
        uVarA.Q(str);
        if (jVar != null) {
            uVarA.Y(jVar);
        }
        if (mVar != null) {
            uVarA.E(mVar);
        }
        return uVarA;
    }

    public w h() {
        return this.f115740b;
    }

    public b0 i() {
        return this.f115739a;
    }
}
