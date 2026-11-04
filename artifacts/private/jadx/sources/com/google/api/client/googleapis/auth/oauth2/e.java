package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.http.w;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class e extends com.google.api.client.auth.oauth2.d {
    public e(b0 b0Var, com.google.api.client.json.d dVar, String str, String str2, String str3, String str4) {
        this(b0Var, dVar, k.f115348b, str, str2, str3, str4);
    }

    @Override // com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public n g() throws IOException {
        return (n) h().r(n.class);
    }

    @Override // com.google.api.client.auth.oauth2.d, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public e q(String str, Object obj) {
        return (e) super.q(str, obj);
    }

    @Override // com.google.api.client.auth.oauth2.d, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public e s(com.google.api.client.http.p pVar) {
        h0.d(pVar);
        return (e) super.s(pVar);
    }

    @Override // com.google.api.client.auth.oauth2.d
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public e C(String str) {
        return (e) super.C(str);
    }

    @Override // com.google.api.client.auth.oauth2.d, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public e t(String str) {
        return (e) super.t(str);
    }

    @Override // com.google.api.client.auth.oauth2.d
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public e E(String str) {
        h0.d(str);
        return (e) super.E(str);
    }

    @Override // com.google.api.client.auth.oauth2.d, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public e u(w wVar) {
        return (e) super.u(wVar);
    }

    @Override // com.google.api.client.auth.oauth2.d, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public e v(Collection<String> collection) {
        return (e) super.v(collection);
    }

    @Override // com.google.api.client.auth.oauth2.d, com.google.api.client.auth.oauth2.s
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public e w(com.google.api.client.http.j jVar) {
        return (e) super.w(jVar);
    }

    public e(b0 b0Var, com.google.api.client.json.d dVar, String str, String str2, String str3, String str4, String str5) {
        super(b0Var, dVar, new com.google.api.client.http.j(str), str4);
        s(new com.google.api.client.auth.oauth2.i(str2, str3));
        E(str5);
    }
}
