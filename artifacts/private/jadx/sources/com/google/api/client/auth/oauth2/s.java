package com.google.api.client.auth.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.http.i0;
import com.google.api.client.http.w;
import com.google.api.client.http.x;
import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class s extends com.google.api.client.util.s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    w f115238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.api.client.http.p f115239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f115240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.api.client.json.d f115241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.api.client.http.j f115242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @v("scope")
    private String f115243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @v("grant_type")
    private String f115244i;

    class a implements w {

        /* JADX INFO: renamed from: com.google.api.client.auth.oauth2.s$a$a, reason: collision with other inner class name */
        class C1010a implements com.google.api.client.http.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.google.api.client.http.p f115246a;

            C1010a(com.google.api.client.http.p pVar) {
                this.f115246a = pVar;
            }

            @Override // com.google.api.client.http.p
            public void a(com.google.api.client.http.u uVar) throws IOException {
                com.google.api.client.http.p pVar = this.f115246a;
                if (pVar != null) {
                    pVar.a(uVar);
                }
                com.google.api.client.http.p pVar2 = s.this.f115239d;
                if (pVar2 != null) {
                    pVar2.a(uVar);
                }
            }
        }

        a() {
        }

        @Override // com.google.api.client.http.w
        public void b(com.google.api.client.http.u uVar) throws IOException {
            w wVar = s.this.f115238c;
            if (wVar != null) {
                wVar.b(uVar);
            }
            uVar.L(new C1010a(uVar.l()));
        }
    }

    public s(b0 b0Var, com.google.api.client.json.d dVar, com.google.api.client.http.j jVar, String str) {
        this.f115240e = (b0) h0.d(b0Var);
        this.f115241f = (com.google.api.client.json.d) h0.d(dVar);
        w(jVar);
        t(str);
    }

    public t g() throws IOException {
        return (t) h().r(t.class);
    }

    public final x h() throws IOException {
        com.google.api.client.http.u uVarE = this.f115240e.d(new a()).e(this.f115242g, new i0(this));
        uVarE.O(new com.google.api.client.json.f(this.f115241f));
        uVarE.W(false);
        x xVarA = uVarE.a();
        if (xVarA.q()) {
            return xVarA;
        }
        throw u.g(this.f115241f, xVarA);
    }

    public final com.google.api.client.http.p i() {
        return this.f115239d;
    }

    public final String j() {
        return this.f115244i;
    }

    public final com.google.api.client.json.d k() {
        return this.f115241f;
    }

    public final w l() {
        return this.f115238c;
    }

    public final String n() {
        return this.f115243h;
    }

    public final com.google.api.client.http.j o() {
        return this.f115242g;
    }

    public final b0 p() {
        return this.f115240e;
    }

    @Override // com.google.api.client.util.s
    public s j0(String str, Object obj) {
        return (s) super.j0(str, obj);
    }

    public s s(com.google.api.client.http.p pVar) {
        this.f115239d = pVar;
        return this;
    }

    public s t(String str) {
        this.f115244i = (String) h0.d(str);
        return this;
    }

    public s u(w wVar) {
        this.f115238c = wVar;
        return this;
    }

    public s v(Collection<String> collection) {
        this.f115243h = collection == null ? null : com.google.api.client.util.u.b(' ').a(collection);
        return this;
    }

    public s w(com.google.api.client.http.j jVar) {
        this.f115242g = jVar;
        h0.a(jVar.s() == null);
        return this;
    }
}
