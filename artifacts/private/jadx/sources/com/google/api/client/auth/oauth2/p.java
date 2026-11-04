package com.google.api.client.auth.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.http.w;
import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class p extends s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @v(net.openid.appauth.q.f333118c)
    private String f115228j;

    public p(b0 b0Var, com.google.api.client.json.d dVar, com.google.api.client.http.j jVar, String str) {
        super(b0Var, dVar, jVar, net.openid.appauth.q.f333118c);
        C(str);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public p s(com.google.api.client.http.p pVar) {
        return (p) super.s(pVar);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public p t(String str) {
        return (p) super.t(str);
    }

    public p C(String str) {
        this.f115228j = (String) h0.d(str);
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public p u(w wVar) {
        return (p) super.u(wVar);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public p v(Collection<String> collection) {
        return (p) super.v(collection);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public p w(com.google.api.client.http.j jVar) {
        return (p) super.w(jVar);
    }

    public final String x() {
        return this.f115228j;
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public p q(String str, Object obj) {
        return (p) super.q(str, obj);
    }
}
