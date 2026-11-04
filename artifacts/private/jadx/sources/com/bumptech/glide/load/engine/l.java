package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class l<R> implements h.b<R>, com.bumptech.glide.util.pool.a.f {
    private static final c H1 = new c();
    q X;
    private boolean Y;
    p<?> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e f96652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f96653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p.a f96654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.util.s.a<l<?>> f96655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f96656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f96657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f96658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f96659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f96660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f96661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f96662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.bumptech.glide.load.g f96663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f96664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f96665n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f96666o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private h<R> f96667p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private volatile boolean f96668p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f96669s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private v<?> f96670t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    com.bumptech.glide.load.a f96671v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f96672w;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.request.i f96673a;

        a(com.bumptech.glide.request.i iVar) {
            this.f96673a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f96673a.e()) {
                try {
                    synchronized (l.this) {
                        try {
                            if (l.this.f96652a.d(this.f96673a)) {
                                l.this.e(this.f96673a);
                            }
                            l.this.h();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.request.i f96675a;

        b(com.bumptech.glide.request.i iVar) {
            this.f96675a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f96675a.e()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f96652a.d(this.f96675a)) {
                            l.this.Z.c();
                            l.this.f(this.f96675a);
                            l.this.s(this.f96675a);
                        }
                        l.this.h();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    @l1
    static class c {
        c() {
        }

        public <R> p<R> a(v<R> vVar, boolean z10, com.bumptech.glide.load.g gVar, p.a aVar) {
            return new p<>(vVar, z10, true, gVar, aVar);
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.request.i f96677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f96678b;

        d(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f96677a = iVar;
            this.f96678b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f96677a.equals(((d) obj).f96677a);
            }
            return false;
        }

        public int hashCode() {
            return this.f96677a.hashCode();
        }
    }

    static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d> f96679a;

        e() {
            this(new ArrayList(2));
        }

        private static d k(com.bumptech.glide.request.i iVar) {
            return new d(iVar, com.bumptech.glide.util.e.a());
        }

        void c(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f96679a.add(new d(iVar, executor));
        }

        void clear() {
            this.f96679a.clear();
        }

        boolean d(com.bumptech.glide.request.i iVar) {
            return this.f96679a.contains(k(iVar));
        }

        e i() {
            return new e(new ArrayList(this.f96679a));
        }

        boolean isEmpty() {
            return this.f96679a.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.f96679a.iterator();
        }

        void l(com.bumptech.glide.request.i iVar) {
            this.f96679a.remove(k(iVar));
        }

        int size() {
            return this.f96679a.size();
        }

        e(List<d> list) {
            this.f96679a = list;
        }
    }

    l(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5, androidx.core.util.s.a<l<?>> aVar6) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, aVar6, H1);
    }

    private com.bumptech.glide.load.engine.executor.a i() {
        if (this.f96665n) {
            return this.f96660i;
        }
        return this.f96666o ? this.f96661j : this.f96659h;
    }

    private boolean n() {
        return this.Y || this.f96672w || this.f96668p1;
    }

    private synchronized void r() {
        try {
            if (this.f96663l == null) {
                throw new IllegalArgumentException();
            }
            this.f96652a.clear();
            this.f96663l = null;
            this.Z = null;
            this.f96670t = null;
            this.Y = false;
            this.f96668p1 = false;
            this.f96672w = false;
            this.f96667p0.R(false);
            this.f96667p0 = null;
            this.X = null;
            this.f96671v = null;
            this.f96655d.a(this);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a(com.bumptech.glide.request.i iVar, Executor executor) {
        try {
            this.f96653b.c();
            this.f96652a.c(iVar, executor);
            if (this.f96672w) {
                j(1);
                executor.execute(new b(iVar));
            } else if (this.Y) {
                j(1);
                executor.execute(new a(iVar));
            } else {
                com.bumptech.glide.util.k.a(!this.f96668p1, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void b(q qVar) {
        synchronized (this) {
            this.X = qVar;
        }
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void c(v<R> vVar, com.bumptech.glide.load.a aVar) {
        synchronized (this) {
            try {
                this.f96670t = vVar;
                this.f96671v = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void d(h<?> hVar) {
        i().execute(hVar);
    }

    @b0("this")
    void e(com.bumptech.glide.request.i iVar) {
        try {
            iVar.b(this.X);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    @b0("this")
    void f(com.bumptech.glide.request.i iVar) {
        try {
            iVar.c(this.Z, this.f96671v);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void g() {
        if (n()) {
            return;
        }
        this.f96668p1 = true;
        this.f96667p0.o();
        this.f96657f.b(this, this.f96663l);
    }

    void h() {
        p<?> pVar;
        synchronized (this) {
            try {
                this.f96653b.c();
                com.bumptech.glide.util.k.a(n(), "Not yet complete!");
                int iDecrementAndGet = this.f96662k.decrementAndGet();
                com.bumptech.glide.util.k.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    pVar = this.Z;
                    r();
                } else {
                    pVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pVar != null) {
            pVar.f();
        }
    }

    synchronized void j(int i10) {
        p<?> pVar;
        com.bumptech.glide.util.k.a(n(), "Not yet complete!");
        if (this.f96662k.getAndAdd(i10) == 0 && (pVar = this.Z) != null) {
            pVar.c();
        }
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @NonNull
    public com.bumptech.glide.util.pool.c k() {
        return this.f96653b;
    }

    @l1
    synchronized l<R> l(com.bumptech.glide.load.g gVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f96663l = gVar;
        this.f96664m = z10;
        this.f96665n = z11;
        this.f96666o = z12;
        this.f96669s = z13;
        return this;
    }

    synchronized boolean m() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f96668p1;
    }

    void o() {
        synchronized (this) {
            try {
                this.f96653b.c();
                if (this.f96668p1) {
                    r();
                    return;
                }
                if (this.f96652a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.Y) {
                    throw new IllegalStateException("Already failed once");
                }
                this.Y = true;
                com.bumptech.glide.load.g gVar = this.f96663l;
                e eVarI = this.f96652a.i();
                j(eVarI.size() + 1);
                this.f96657f.a(this, gVar, null);
                for (d dVar : eVarI) {
                    dVar.f96678b.execute(new a(dVar.f96677a));
                }
                h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void p() {
        synchronized (this) {
            try {
                this.f96653b.c();
                if (this.f96668p1) {
                    this.f96670t.a();
                    r();
                    return;
                }
                if (this.f96652a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f96672w) {
                    throw new IllegalStateException("Already have resource");
                }
                this.Z = this.f96656e.a(this.f96670t, this.f96664m, this.f96663l, this.f96654c);
                int i10 = 0 << 1;
                this.f96672w = true;
                e eVarI = this.f96652a.i();
                j(eVarI.size() + 1);
                this.f96657f.a(this, this.f96663l, this.Z);
                for (d dVar : eVarI) {
                    dVar.f96678b.execute(new b(dVar.f96677a));
                }
                h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean q() {
        return this.f96669s;
    }

    synchronized void s(com.bumptech.glide.request.i iVar) {
        try {
            this.f96653b.c();
            this.f96652a.l(iVar);
            if (this.f96652a.isEmpty()) {
                g();
                if (this.f96672w || this.Y) {
                    if (this.f96662k.get() == 0) {
                        r();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(h<R> hVar) {
        try {
            this.f96667p0 = hVar;
            (hVar.X() ? this.f96658g : i()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    l(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5, androidx.core.util.s.a<l<?>> aVar6, c cVar) {
        this.f96652a = new e();
        this.f96653b = com.bumptech.glide.util.pool.c.a();
        this.f96662k = new AtomicInteger();
        this.f96658g = aVar;
        this.f96659h = aVar2;
        this.f96660i = aVar3;
        this.f96661j = aVar4;
        this.f96657f = mVar;
        this.f96654c = aVar5;
        this.f96655d = aVar6;
        this.f96656e = cVar;
    }
}
