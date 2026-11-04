package com.google.api.client.googleapis.compute;

import com.google.api.client.auth.oauth2.j;
import com.google.api.client.auth.oauth2.k;
import com.google.api.client.auth.oauth2.t;
import com.google.api.client.googleapis.auth.oauth2.o;
import com.google.api.client.http.b0;
import com.google.api.client.http.p;
import com.google.api.client.http.u;
import com.google.api.client.http.w;
import com.google.api.client.json.d;
import com.google.api.client.util.f;
import com.google.api.client.util.h0;
import com.google.api.client.util.l;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
@f
public class a extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f115409n = o.b() + "/computeMetadata/v1/instance/service-accounts/default/token";

    /* JADX INFO: renamed from: com.google.api.client.googleapis.compute.a$a, reason: collision with other inner class name */
    @f
    public static class C1016a extends j.b {
        public C1016a(b0 b0Var, d dVar) {
            super(com.google.api.client.auth.oauth2.f.a());
            r(b0Var);
            m(dVar);
            p(a.f115409n);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C1016a q(com.google.api.client.http.j jVar) {
            return (C1016a) super.q((com.google.api.client.http.j) h0.d(jVar));
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public C1016a r(b0 b0Var) {
            return (C1016a) super.r((b0) h0.d(b0Var));
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public C1016a a(k kVar) {
            return (C1016a) super.a(kVar);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a(this);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public C1016a k(p pVar) {
            h0.a(pVar == null);
            return this;
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public C1016a l(l lVar) {
            return (C1016a) super.l(lVar);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public C1016a m(d dVar) {
            return (C1016a) super.m((d) h0.d(dVar));
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public C1016a n(Collection<k> collection) {
            return (C1016a) super.n(collection);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public C1016a o(w wVar) {
            return (C1016a) super.o(wVar);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public C1016a p(String str) {
            return (C1016a) super.p((String) h0.d(str));
        }
    }

    public a(b0 b0Var, d dVar) {
        this(new C1016a(b0Var, dVar));
    }

    @Override // com.google.api.client.auth.oauth2.j
    protected t d() throws IOException {
        u uVarB = p().c().b(new com.google.api.client.http.j(o()));
        uVarB.O(new com.google.api.client.json.f(j()));
        uVarB.j().p("Metadata-Flavor", "Google");
        return (t) uVarB.a().r(t.class);
    }

    protected a(C1016a c1016a) {
        super(c1016a);
    }
}
