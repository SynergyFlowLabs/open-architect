package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.q;
import com.google.api.client.http.b0;
import com.google.api.client.http.w;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class c extends com.google.api.client.auth.oauth2.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f115314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f115315p;

    public c(b0 b0Var, com.google.api.client.json.d dVar, String str, String str2, Collection<String> collection) {
        this(new a(b0Var, dVar, str, str2, collection));
    }

    public final String t() {
        return this.f115315p;
    }

    public final String u() {
        return this.f115314o;
    }

    @Override // com.google.api.client.auth.oauth2.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public d q() {
        return new d(b(), d(), "", l()).q0(this.f115315p).r0(this.f115314o);
    }

    @Override // com.google.api.client.auth.oauth2.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public e s(String str) {
        return new e(o(), h(), n(), "", "", str, "").s(c()).u(k()).v(l());
    }

    public static class a extends com.google.api.client.auth.oauth2.a.C1009a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f115316o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f115317p;

        public a(b0 b0Var, com.google.api.client.json.d dVar, String str, String str2, Collection<String> collection) {
            super(com.google.api.client.auth.oauth2.f.a(), b0Var, dVar, new com.google.api.client.http.j(k.f115348b), new com.google.api.client.auth.oauth2.i(str, str2), str, k.f115347a);
            C(collection);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public a a(com.google.api.client.auth.oauth2.k kVar) {
            return (a) super.a(kVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c(this);
        }

        public final String H() {
            return this.f115317p;
        }

        public final String I() {
            return this.f115316o;
        }

        public a J(String str) {
            this.f115317p = str;
            return this;
        }

        public a K(String str) {
            this.f115316o = str;
            return this;
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public a q(String str) {
            return (a) super.q(str);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public a r(com.google.api.client.http.p pVar) {
            return (a) super.r(pVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public a s(String str) {
            return (a) super.s(str);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public a t(com.google.api.client.util.l lVar) {
            return (a) super.t(lVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public a u(com.google.api.client.auth.oauth2.a.b bVar) {
            return (a) super.u(bVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public a v(com.google.api.client.util.store.d<q> dVar) {
            return (a) super.v(dVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        @com.google.api.client.util.f
        @Deprecated
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public a w(com.google.api.client.auth.oauth2.l lVar) {
            return (a) super.w(lVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public a x(com.google.api.client.util.store.e eVar) throws IOException {
            return (a) super.x(eVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public a y(com.google.api.client.json.d dVar) {
            return (a) super.y(dVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public a z(com.google.api.client.auth.oauth2.j.a aVar) {
            return (a) super.z(aVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public a A(Collection<com.google.api.client.auth.oauth2.k> collection) {
            return (a) super.A(collection);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public a B(w wVar) {
            return (a) super.B(wVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public a C(Collection<String> collection) {
            h0.g(!collection.isEmpty());
            return (a) super.C(collection);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public a D(com.google.api.client.http.j jVar) {
            return (a) super.D(jVar);
        }

        @Override // com.google.api.client.auth.oauth2.a.C1009a
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public a E(b0 b0Var) {
            return (a) super.E(b0Var);
        }

        public a(b0 b0Var, com.google.api.client.json.d dVar, g gVar, Collection<String> collection) {
            super(com.google.api.client.auth.oauth2.f.a(), b0Var, dVar, new com.google.api.client.http.j(k.f115348b), new com.google.api.client.auth.oauth2.i(gVar.n().o(), gVar.n().p()), gVar.n().o(), k.f115347a);
            C(collection);
        }
    }

    protected c(a aVar) {
        super(aVar);
        this.f115315p = aVar.f115317p;
        this.f115314o = aVar.f115316o;
    }
}
