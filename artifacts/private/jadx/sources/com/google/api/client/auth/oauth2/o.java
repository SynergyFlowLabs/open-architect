package com.google.api.client.auth.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.http.w;
import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class o extends s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @v
    private String f115226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @v
    private String f115227k;

    public o(b0 b0Var, com.google.api.client.json.d dVar, com.google.api.client.http.j jVar, String str, String str2) {
        super(b0Var, dVar, jVar, "password");
        H(str);
        D(str2);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public o q(String str, Object obj) {
        return (o) super.q(str, obj);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public o s(com.google.api.client.http.p pVar) {
        return (o) super.s(pVar);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public o t(String str) {
        return (o) super.t(str);
    }

    public o D(String str) {
        this.f115227k = (String) h0.d(str);
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public o u(w wVar) {
        return (o) super.u(wVar);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public o v(Collection<String> collection) {
        return (o) super.v(collection);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public o w(com.google.api.client.http.j jVar) {
        return (o) super.w(jVar);
    }

    public o H(String str) {
        this.f115226j = (String) h0.d(str);
        return this;
    }

    public final String x() {
        return this.f115227k;
    }

    public final String z() {
        return this.f115226j;
    }
}
