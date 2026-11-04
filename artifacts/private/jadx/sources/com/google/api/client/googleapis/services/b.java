package com.google.api.client.googleapis.services;

import com.google.api.client.http.f;
import com.google.api.client.http.i;
import com.google.api.client.http.j;
import com.google.api.client.http.m;
import com.google.api.client.http.q;
import com.google.api.client.http.u;
import com.google.api.client.http.v;
import com.google.api.client.http.x;
import com.google.api.client.http.y;
import com.google.api.client.http.z;
import com.google.api.client.util.h0;
import com.google.api.client.util.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<T> extends s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f115504o = "Google-API-Java-Client";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.api.client.googleapis.services.a f115505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f115506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f115507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f115508f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f115510h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f115512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f115513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Class<T> f115514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.api.client.googleapis.media.c f115515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.api.client.googleapis.media.a f115516n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f115509g = new q();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f115511i = -1;

    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f115517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f115518b;

        a(z zVar, u uVar) {
            this.f115517a = zVar;
            this.f115518b = uVar;
        }

        @Override // com.google.api.client.http.z
        public void a(x xVar) throws IOException {
            z zVar = this.f115517a;
            if (zVar != null) {
                zVar.a(xVar);
            }
            if (!xVar.q() && this.f115518b.v()) {
                throw b.this.L(xVar);
            }
        }
    }

    protected b(com.google.api.client.googleapis.services.a aVar, String str, String str2, m mVar, Class<T> cls) {
        this.f115514l = (Class) h0.d(cls);
        this.f115505c = (com.google.api.client.googleapis.services.a) h0.d(aVar);
        this.f115506d = (String) h0.d(str);
        this.f115507e = (String) h0.d(str2);
        this.f115508f = mVar;
        String strC = aVar.c();
        if (strC == null) {
            this.f115509g.F0(f115504o);
            return;
        }
        this.f115509g.F0(strC + " " + f115504o);
    }

    private u h(boolean z10) throws IOException {
        h0.a(this.f115515m == null);
        h0.a(!z10 || this.f115506d.equals("GET"));
        u uVarG = w().g().g(z10 ? "HEAD" : this.f115506d, i(), this.f115508f);
        new com.google.api.client.googleapis.b().a(uVarG);
        uVarG.O(w().f());
        if (this.f115508f == null && (this.f115506d.equals("POST") || this.f115506d.equals("PUT") || this.f115506d.equals("PATCH"))) {
            uVarG.E(new f());
        }
        uVarG.j().putAll(this.f115509g);
        if (!this.f115513k) {
            uVarG.H(new i());
        }
        uVarG.S(new a(uVarG.r(), uVarG));
        return uVarG;
    }

    private x u(boolean z10) throws IOException {
        x xVarG;
        if (this.f115515m == null) {
            xVarG = h(z10).a();
        } else {
            j jVarI = i();
            boolean zV = w().g().g(this.f115506d, jVarI, this.f115508f).v();
            xVarG = this.f115515m.A(this.f115509g).z(this.f115513k).G(jVarI);
            xVarG.j().O(w().f());
            if (zV && !xVarG.q()) {
                throw L(xVarG);
            }
        }
        this.f115510h = xVarG.h();
        this.f115511i = xVarG.k();
        this.f115512j = xVarG.l();
        return xVarG;
    }

    public final q A() {
        return this.f115510h;
    }

    public final int B() {
        return this.f115511i;
    }

    public final String C() {
        return this.f115512j;
    }

    public final com.google.api.client.googleapis.media.a D() {
        return this.f115516n;
    }

    public final com.google.api.client.googleapis.media.c E() {
        return this.f115515m;
    }

    public final q F() {
        return this.f115509g;
    }

    public final String G() {
        return this.f115506d;
    }

    public final Class<T> H() {
        return this.f115514l;
    }

    public final String I() {
        return this.f115507e;
    }

    protected final void J() {
        v vVarG = this.f115505c.g();
        this.f115516n = new com.google.api.client.googleapis.media.a(vVarG.i(), vVarG.h());
    }

    protected final void K(com.google.api.client.http.b bVar) {
        v vVarG = this.f115505c.g();
        com.google.api.client.googleapis.media.c cVar = new com.google.api.client.googleapis.media.c(bVar, vVarG.i(), vVarG.h());
        this.f115515m = cVar;
        cVar.B(this.f115506d);
        m mVar = this.f115508f;
        if (mVar != null) {
            this.f115515m.C(mVar);
        }
    }

    protected IOException L(x xVar) {
        return new y(xVar);
    }

    public final <E> void M(com.google.api.client.googleapis.batch.b bVar, Class<E> cls, com.google.api.client.googleapis.batch.a<T, E> aVar) throws IOException {
        h0.b(this.f115515m == null, "Batching media requests is not supported");
        bVar.d(g(), H(), cls, aVar);
    }

    @Override // com.google.api.client.util.s
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public b<T> p(String str, Object obj) {
        return (b) super.p(str, obj);
    }

    public b<T> P(boolean z10) {
        this.f115513k = z10;
        return this;
    }

    public b<T> Q(q qVar) {
        this.f115509g = qVar;
        return this;
    }

    public u g() throws IOException {
        return h(false);
    }

    public j i() {
        return new j(com.google.api.client.http.h0.b(this.f115505c.d(), this.f115507e, this, true));
    }

    protected u j() throws IOException {
        return h(true);
    }

    protected final void k(Object obj, String str) {
        h0.c(this.f115505c.k() || obj != null, "Required parameter %s must be specified", str);
    }

    public T l() throws IOException {
        return (T) t().r(this.f115514l);
    }

    public void n(OutputStream outputStream) throws IOException {
        t().b(outputStream);
    }

    public InputStream o() throws IOException {
        return t().c();
    }

    protected x p() throws IOException {
        j0("alt", "media");
        return t();
    }

    protected void q(OutputStream outputStream) throws IOException {
        com.google.api.client.googleapis.media.a aVar = this.f115516n;
        if (aVar == null) {
            p().b(outputStream);
        } else {
            aVar.a(i(), this.f115509g, outputStream);
        }
    }

    protected InputStream s() throws IOException {
        return p().c();
    }

    public x t() throws IOException {
        return u(false);
    }

    protected x v() throws IOException {
        h0.a(this.f115515m == null);
        x xVarU = u(true);
        xVarU.o();
        return xVarU;
    }

    public com.google.api.client.googleapis.services.a w() {
        return this.f115505c;
    }

    public final boolean x() {
        return this.f115513k;
    }

    public final m z() {
        return this.f115508f;
    }
}
