package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.http.w;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class m extends com.google.api.client.auth.oauth2.p {
    public m(b0 b0Var, com.google.api.client.json.d dVar, String str, String str2, String str3) {
        super(b0Var, dVar, new com.google.api.client.http.j(k.f115348b), str);
        s(new com.google.api.client.auth.oauth2.i(str2, str3));
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public n g() throws IOException {
        return (n) h().r(n.class);
    }

    @Override // com.google.api.client.auth.oauth2.p
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m p(String str, Object obj) {
        return (m) super.p(str, obj);
    }

    @Override // com.google.api.client.auth.oauth2.p, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public m s(com.google.api.client.http.p pVar) {
        return (m) super.s(pVar);
    }

    @Override // com.google.api.client.auth.oauth2.p, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public m t(String str) {
        return (m) super.t(str);
    }

    @Override // com.google.api.client.auth.oauth2.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public m C(String str) {
        return (m) super.C(str);
    }

    @Override // com.google.api.client.auth.oauth2.p, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public m u(w wVar) {
        return (m) super.u(wVar);
    }

    @Override // com.google.api.client.auth.oauth2.p, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public m v(Collection<String> collection) {
        return (m) super.v(collection);
    }

    @Override // com.google.api.client.auth.oauth2.p, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public m w(com.google.api.client.http.j jVar) {
        return (m) super.w(jVar);
    }
}
