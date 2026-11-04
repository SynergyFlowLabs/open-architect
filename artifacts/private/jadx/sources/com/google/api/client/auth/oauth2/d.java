package com.google.api.client.auth.oauth2;

import com.facebook.internal.z0;
import com.google.api.client.http.b0;
import com.google.api.client.http.w;
import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class d extends s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @v
    private String f115189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @v(z0.f100292w)
    private String f115190k;

    public d(b0 b0Var, com.google.api.client.json.d dVar, com.google.api.client.http.j jVar, String str) {
        super(b0Var, dVar, jVar, net.openid.appauth.q.f333116a);
        C(str);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public d q(String str, Object obj) {
        return (d) super.q(str, obj);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public d s(com.google.api.client.http.p pVar) {
        return (d) super.s(pVar);
    }

    public d C(String str) {
        this.f115189j = (String) h0.d(str);
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public d t(String str) {
        return (d) super.t(str);
    }

    public d E(String str) {
        this.f115190k = str;
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public d u(w wVar) {
        return (d) super.u(wVar);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public d v(Collection<String> collection) {
        return (d) super.v(collection);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public d w(com.google.api.client.http.j jVar) {
        return (d) super.w(jVar);
    }

    public final String x() {
        return this.f115189j;
    }

    public final String z() {
        return this.f115190k;
    }
}
