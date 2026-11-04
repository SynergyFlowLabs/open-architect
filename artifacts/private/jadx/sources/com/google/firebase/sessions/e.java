package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.settings.SessionConfigs;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.a
public final class e {

    private static final class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f124986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CoroutineContext f124987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CoroutineContext f124988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.firebase.h f124989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.firebase.installations.k f124990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private z8.b<com.google.android.datatransport.m> f124991f;

        private b() {
        }

        @Override // com.google.firebase.sessions.o.a
        public o build() {
            com.google.firebase.sessions.dagger.internal.e.a(this.f124986a, Context.class);
            com.google.firebase.sessions.dagger.internal.e.a(this.f124987b, CoroutineContext.class);
            com.google.firebase.sessions.dagger.internal.e.a(this.f124988c, CoroutineContext.class);
            com.google.firebase.sessions.dagger.internal.e.a(this.f124989d, com.google.firebase.h.class);
            com.google.firebase.sessions.dagger.internal.e.a(this.f124990e, com.google.firebase.installations.k.class);
            com.google.firebase.sessions.dagger.internal.e.a(this.f124991f, z8.b.class);
            return new c(this.f124986a, this.f124987b, this.f124988c, this.f124989d, this.f124990e, this.f124991f);
        }

        @Override // com.google.firebase.sessions.o.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b b(Context context) {
            this.f124986a = (Context) com.google.firebase.sessions.dagger.internal.e.b(context);
            return this;
        }

        @Override // com.google.firebase.sessions.o.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b d(CoroutineContext coroutineContext) {
            this.f124987b = (CoroutineContext) com.google.firebase.sessions.dagger.internal.e.b(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.o.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b f(CoroutineContext coroutineContext) {
            this.f124988c = (CoroutineContext) com.google.firebase.sessions.dagger.internal.e.b(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.o.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b a(com.google.firebase.h hVar) {
            this.f124989d = (com.google.firebase.h) com.google.firebase.sessions.dagger.internal.e.b(hVar);
            return this;
        }

        @Override // com.google.firebase.sessions.o.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b c(com.google.firebase.installations.k kVar) {
            this.f124990e = (com.google.firebase.installations.k) com.google.firebase.sessions.dagger.internal.e.b(kVar);
            return this;
        }

        @Override // com.google.firebase.sessions.o.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b e(z8.b<com.google.android.datatransport.m> bVar) {
            this.f124991f = (z8.b) com.google.firebase.sessions.dagger.internal.e.b(bVar);
            return this;
        }
    }

    private static final class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f124992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<com.google.firebase.h> f124993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<Context> f124994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<com.google.firebase.sessions.settings.b> f124995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<d1> f124996e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<com.google.firebase.installations.k> f124997f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<com.google.firebase.sessions.b> f124998g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<CoroutineContext> f124999h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<com.google.firebase.sessions.settings.e> f125000i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<CoroutineContext> f125001j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<androidx.datastore.core.l<SessionConfigs>> f125002k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<com.google.firebase.sessions.settings.l> f125003l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<com.google.firebase.sessions.settings.d> f125004m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<com.google.firebase.sessions.settings.i> f125005n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<f1> f125006o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<v0> f125007p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<z8.b<com.google.android.datatransport.m>> f125008q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<i> f125009r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<t0> f125010s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<o0> f125011t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<androidx.datastore.core.l<SessionData>> f125012u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<i0> f125013v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<b1> f125014w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<y0> f125015x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.f<n> f125016y;

        private void f(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, com.google.firebase.h hVar, com.google.firebase.installations.k kVar, z8.b<com.google.android.datatransport.m> bVar) {
            this.f124993b = com.google.firebase.sessions.dagger.internal.d.a(hVar);
            com.google.firebase.sessions.dagger.internal.c cVarA = com.google.firebase.sessions.dagger.internal.d.a(context);
            this.f124994c = cVarA;
            this.f124995d = com.google.firebase.sessions.dagger.internal.b.c(com.google.firebase.sessions.settings.c.a(cVarA));
            this.f124996e = com.google.firebase.sessions.dagger.internal.b.c(w.a());
            this.f124997f = com.google.firebase.sessions.dagger.internal.d.a(kVar);
            this.f124998g = com.google.firebase.sessions.dagger.internal.b.c(t.b(this.f124993b));
            com.google.firebase.sessions.dagger.internal.c cVarA2 = com.google.firebase.sessions.dagger.internal.d.a(coroutineContext2);
            this.f124999h = cVarA2;
            this.f125000i = com.google.firebase.sessions.dagger.internal.b.c(com.google.firebase.sessions.settings.f.a(this.f124998g, cVarA2));
            this.f125001j = com.google.firebase.sessions.dagger.internal.d.a(coroutineContext);
            com.google.firebase.sessions.dagger.internal.f<androidx.datastore.core.l<SessionConfigs>> fVarC = com.google.firebase.sessions.dagger.internal.b.c(u.a(this.f124994c, this.f124999h));
            this.f125002k = fVarC;
            com.google.firebase.sessions.dagger.internal.f<com.google.firebase.sessions.settings.l> fVarC2 = com.google.firebase.sessions.dagger.internal.b.c(com.google.firebase.sessions.settings.m.a(this.f125001j, this.f124996e, fVarC));
            this.f125003l = fVarC2;
            com.google.firebase.sessions.dagger.internal.f<com.google.firebase.sessions.settings.d> fVarC3 = com.google.firebase.sessions.dagger.internal.b.c(com.google.firebase.sessions.settings.g.a(this.f124996e, this.f124997f, this.f124998g, this.f125000i, fVarC2));
            this.f125004m = fVarC3;
            this.f125005n = com.google.firebase.sessions.dagger.internal.b.c(com.google.firebase.sessions.settings.j.a(this.f124995d, fVarC3));
            com.google.firebase.sessions.dagger.internal.f<f1> fVarC4 = com.google.firebase.sessions.dagger.internal.b.c(x.a());
            this.f125006o = fVarC4;
            this.f125007p = com.google.firebase.sessions.dagger.internal.b.c(w0.a(this.f124996e, fVarC4));
            com.google.firebase.sessions.dagger.internal.c cVarA3 = com.google.firebase.sessions.dagger.internal.d.a(bVar);
            this.f125008q = cVarA3;
            com.google.firebase.sessions.dagger.internal.f<i> fVarC5 = com.google.firebase.sessions.dagger.internal.b.c(k.a(cVarA3));
            this.f125009r = fVarC5;
            this.f125010s = com.google.firebase.sessions.dagger.internal.b.c(u0.a(this.f124993b, this.f124997f, this.f125005n, fVarC5, this.f125001j));
            com.google.firebase.sessions.dagger.internal.f<o0> fVarC6 = com.google.firebase.sessions.dagger.internal.b.c(p0.a(this.f125007p));
            this.f125011t = fVarC6;
            this.f125012u = com.google.firebase.sessions.dagger.internal.b.c(v.a(this.f124994c, this.f124999h, fVarC6));
            com.google.firebase.sessions.dagger.internal.f<i0> fVarC7 = com.google.firebase.sessions.dagger.internal.b.c(j0.a(this.f124994c, this.f125006o));
            this.f125013v = fVarC7;
            com.google.firebase.sessions.dagger.internal.f<b1> fVarC8 = com.google.firebase.sessions.dagger.internal.b.c(c1.a(this.f125005n, this.f125007p, this.f125010s, this.f124996e, this.f125012u, fVarC7, this.f125001j));
            this.f125014w = fVarC8;
            com.google.firebase.sessions.dagger.internal.f<y0> fVarC9 = com.google.firebase.sessions.dagger.internal.b.c(z0.a(fVarC8));
            this.f125015x = fVarC9;
            this.f125016y = com.google.firebase.sessions.dagger.internal.b.c(a0.a(this.f124993b, this.f125005n, this.f125001j, fVarC9));
        }

        @Override // com.google.firebase.sessions.o
        public com.google.firebase.sessions.settings.i a() {
            return this.f125005n.get();
        }

        @Override // com.google.firebase.sessions.o
        public n b() {
            return this.f125016y.get();
        }

        @Override // com.google.firebase.sessions.o
        public v0 c() {
            return this.f125007p.get();
        }

        @Override // com.google.firebase.sessions.o
        public a1 d() {
            return this.f125014w.get();
        }

        @Override // com.google.firebase.sessions.o
        public s0 e() {
            return this.f125010s.get();
        }

        private c(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, com.google.firebase.h hVar, com.google.firebase.installations.k kVar, z8.b<com.google.android.datatransport.m> bVar) {
            this.f124992a = this;
            f(context, coroutineContext, coroutineContext2, hVar, kVar, bVar);
        }
    }

    private e() {
    }

    public static o.a a() {
        return new b();
    }
}
