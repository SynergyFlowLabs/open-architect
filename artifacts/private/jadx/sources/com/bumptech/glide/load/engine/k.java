package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class k implements m, com.bumptech.glide.load.engine.cache.j.a, p.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f96625j = 150;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f96627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f96628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.cache.j f96629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f96630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f96631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f96632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f96633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f96634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f96624i = "Engine";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f96626k = Log.isLoggable(f96624i, 2);

    @l1
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h.e f96635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.core.util.s.a<h<?>> f96636b = com.bumptech.glide.util.pool.a.e(150, new C0861a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f96637c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.k$a$a, reason: collision with other inner class name */
        class C0861a implements com.bumptech.glide.util.pool.a.d<h<?>> {
            C0861a() {
            }

            @Override // com.bumptech.glide.util.pool.a.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h<?> k() {
                a aVar = a.this;
                return new h<>(aVar.f96635a, aVar.f96636b);
            }
        }

        a(h.e eVar) {
            this.f96635a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, n nVar, com.bumptech.glide.load.g gVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, com.bumptech.glide.load.n<?>> map, boolean z10, boolean z11, boolean z12, com.bumptech.glide.load.j jVar2, h.b<R> bVar) {
            h hVar2 = (h) com.bumptech.glide.util.k.d(this.f96636b.acquire());
            int i12 = this.f96637c;
            this.f96637c = i12 + 1;
            return hVar2.z(dVar, obj, nVar, gVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z12, jVar2, bVar, i12);
        }
    }

    @l1
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f96639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f96640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f96641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f96642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final m f96643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final p.a f96644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final androidx.core.util.s.a<l<?>> f96645g = com.bumptech.glide.util.pool.a.e(150, new a());

        class a implements com.bumptech.glide.util.pool.a.d<l<?>> {
            a() {
            }

            @Override // com.bumptech.glide.util.pool.a.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l<?> k() {
                b bVar = b.this;
                return new l<>(bVar.f96639a, bVar.f96640b, bVar.f96641c, bVar.f96642d, bVar.f96643e, bVar.f96644f, bVar.f96645g);
            }
        }

        b(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5) {
            this.f96639a = aVar;
            this.f96640b = aVar2;
            this.f96641c = aVar3;
            this.f96642d = aVar4;
            this.f96643e = mVar;
            this.f96644f = aVar5;
        }

        <R> l<R> a(com.bumptech.glide.load.g gVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) com.bumptech.glide.util.k.d(this.f96645g.acquire())).l(gVar, z10, z11, z12, z13);
        }

        @l1
        void b() {
            com.bumptech.glide.util.e.c(this.f96639a);
            com.bumptech.glide.util.e.c(this.f96640b);
            com.bumptech.glide.util.e.c(this.f96641c);
            com.bumptech.glide.util.e.c(this.f96642d);
        }
    }

    private static class c implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.cache.a.InterfaceC0855a f96647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile com.bumptech.glide.load.engine.cache.a f96648b;

        c(com.bumptech.glide.load.engine.cache.a.InterfaceC0855a interfaceC0855a) {
            this.f96647a = interfaceC0855a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public com.bumptech.glide.load.engine.cache.a a() {
            if (this.f96648b == null) {
                synchronized (this) {
                    try {
                        if (this.f96648b == null) {
                            this.f96648b = this.f96647a.build();
                        }
                        if (this.f96648b == null) {
                            this.f96648b = new com.bumptech.glide.load.engine.cache.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f96648b;
        }

        @l1
        synchronized void b() {
            try {
                if (this.f96648b == null) {
                    return;
                }
                this.f96648b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l<?> f96649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.i f96650b;

        d(com.bumptech.glide.request.i iVar, l<?> lVar) {
            this.f96650b = iVar;
            this.f96649a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f96649a.s(this.f96650b);
            }
        }
    }

    public k(com.bumptech.glide.load.engine.cache.j jVar, com.bumptech.glide.load.engine.cache.a.InterfaceC0855a interfaceC0855a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, boolean z10) {
        this(jVar, interfaceC0855a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    private p<?> f(com.bumptech.glide.load.g gVar) {
        v<?> vVarG = this.f96629c.g(gVar);
        if (vVarG == null) {
            return null;
        }
        return vVarG instanceof p ? (p) vVarG : new p<>(vVarG, true, true, gVar, this);
    }

    @p0
    private p<?> h(com.bumptech.glide.load.g gVar) {
        p<?> pVarE = this.f96634h.e(gVar);
        if (pVarE != null) {
            pVarE.c();
        }
        return pVarE;
    }

    private p<?> i(com.bumptech.glide.load.g gVar) {
        p<?> pVarF = f(gVar);
        if (pVarF != null) {
            pVarF.c();
            this.f96634h.a(gVar, pVarF);
        }
        return pVarF;
    }

    @p0
    private p<?> j(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p<?> pVarH = h(nVar);
        if (pVarH != null) {
            if (f96626k) {
                k("Loaded resource from active resources", j10, nVar);
            }
            return pVarH;
        }
        p<?> pVarI = i(nVar);
        if (pVarI == null) {
            return null;
        }
        if (f96626k) {
            k("Loaded resource from cache", j10, nVar);
        }
        return pVarI;
    }

    private static void k(String str, long j10, com.bumptech.glide.load.g gVar) {
        com.bumptech.glide.util.g.a(j10);
        Objects.toString(gVar);
    }

    private <R> d n(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.g gVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, com.bumptech.glide.load.n<?>> map, boolean z10, boolean z11, com.bumptech.glide.load.j jVar2, boolean z12, boolean z13, boolean z14, boolean z15, com.bumptech.glide.request.i iVar, Executor executor, n nVar, long j10) {
        l<?> lVarA = this.f96627a.a(nVar, z15);
        if (lVarA != null) {
            lVarA.a(iVar, executor);
            if (f96626k) {
                k("Added to existing load", j10, nVar);
            }
            return new d(iVar, lVarA);
        }
        l<R> lVarA2 = this.f96630d.a(nVar, z12, z13, z14, z15);
        h<R> hVarA = this.f96633g.a(dVar, obj, nVar, gVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z15, jVar2, lVarA2);
        this.f96627a.d(nVar, lVarA2);
        lVarA2.a(iVar, executor);
        lVarA2.t(hVarA);
        if (f96626k) {
            k("Started new load", j10, nVar);
        }
        return new d(iVar, lVarA2);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void a(l<?> lVar, com.bumptech.glide.load.g gVar, p<?> pVar) {
        if (pVar != null) {
            try {
                if (pVar.e()) {
                    this.f96634h.a(gVar, pVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f96627a.e(gVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void b(l<?> lVar, com.bumptech.glide.load.g gVar) {
        this.f96627a.e(gVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.p.a
    public void c(com.bumptech.glide.load.g gVar, p<?> pVar) {
        this.f96634h.d(gVar);
        if (pVar.e()) {
            this.f96629c.f(gVar, pVar);
        } else {
            this.f96631e.a(pVar, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.j.a
    public void d(@NonNull v<?> vVar) {
        this.f96631e.a(vVar, true);
    }

    public void e() {
        this.f96632f.a().clear();
    }

    public <R> d g(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.g gVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, com.bumptech.glide.load.n<?>> map, boolean z10, boolean z11, com.bumptech.glide.load.j jVar2, boolean z12, boolean z13, boolean z14, boolean z15, com.bumptech.glide.request.i iVar, Executor executor) {
        long jB = f96626k ? com.bumptech.glide.util.g.b() : 0L;
        n nVarA = this.f96628b.a(obj, gVar, i10, i11, map, cls, cls2, jVar2);
        synchronized (this) {
            try {
                p<?> pVarJ = j(nVarA, z12, jB);
                if (pVarJ == null) {
                    return n(dVar, obj, gVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, jVar2, z12, z13, z14, z15, iVar, executor, nVarA, jB);
                }
                iVar.c(pVarJ, com.bumptech.glide.load.a.MEMORY_CACHE);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(v<?> vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).f();
    }

    @l1
    public void m() {
        this.f96630d.b();
        this.f96632f.b();
        this.f96634h.h();
    }

    @l1
    k(com.bumptech.glide.load.engine.cache.j jVar, com.bumptech.glide.load.engine.cache.a.InterfaceC0855a interfaceC0855a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, s sVar, o oVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, y yVar, boolean z10) {
        this.f96629c = jVar;
        c cVar = new c(interfaceC0855a);
        this.f96632f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z10) : aVar5;
        this.f96634h = aVar7;
        aVar7.g(this);
        this.f96628b = oVar == null ? new o() : oVar;
        this.f96627a = sVar == null ? new s() : sVar;
        this.f96630d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f96633g = aVar6 == null ? new a(cVar) : aVar6;
        this.f96631e = yVar == null ? new y() : yVar;
        jVar.h(this);
    }
}
