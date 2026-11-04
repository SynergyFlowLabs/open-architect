package androidx.lifecycle;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w0<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f52572k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Object f52573l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f52574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.arch.core.internal.b<d1<? super T>, w0<T>.d> f52575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f52576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f52577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f52578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f52579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f52581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f52582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f52583j;

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (w0.this.f52574a) {
                try {
                    obj = w0.this.f52579f;
                    w0.this.f52579f = w0.f52573l;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            w0.this.r(obj);
        }
    }

    private class b extends w0<T>.d {
        b(d1<? super T> d1Var) {
            super(d1Var);
        }

        @Override // androidx.lifecycle.w0.d
        boolean d() {
            return true;
        }
    }

    class c extends w0<T>.d implements j0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final o0 f52586e;

        c(o0 o0Var, d1<? super T> d1Var) {
            super(d1Var);
            this.f52586e = o0Var;
        }

        @Override // androidx.lifecycle.w0.d
        void b() {
            this.f52586e.getLifecycle().g(this);
        }

        @Override // androidx.lifecycle.w0.d
        boolean c(o0 o0Var) {
            return this.f52586e == o0Var;
        }

        @Override // androidx.lifecycle.w0.d
        boolean d() {
            return this.f52586e.getLifecycle().d().n(c0.b.STARTED);
        }

        @Override // androidx.lifecycle.j0
        public void e(o0 o0Var, c0.a aVar) {
            c0.b bVarD = this.f52586e.getLifecycle().d();
            if (bVarD == c0.b.DESTROYED) {
                w0.this.p(this.f52588a);
                return;
            }
            c0.b bVar = null;
            while (bVar != bVarD) {
                a(d());
                bVar = bVarD;
                bVarD = this.f52586e.getLifecycle().d();
            }
        }
    }

    private abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d1<? super T> f52588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f52589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f52590c = -1;

        d(d1<? super T> d1Var) {
            this.f52588a = d1Var;
        }

        void a(boolean z10) {
            int i10;
            if (z10 == this.f52589b) {
                return;
            }
            this.f52589b = z10;
            w0 w0Var = w0.this;
            if (z10) {
                i10 = 1;
                int i11 = 3 & 1;
            } else {
                i10 = -1;
            }
            w0Var.c(i10);
            if (this.f52589b) {
                w0.this.e(this);
            }
        }

        void b() {
        }

        boolean c(o0 o0Var) {
            return false;
        }

        abstract boolean d();
    }

    public w0(T t10) {
        this.f52574a = new Object();
        this.f52575b = new androidx.arch.core.internal.b<>();
        this.f52576c = 0;
        this.f52579f = f52573l;
        this.f52583j = new a();
        this.f52578e = t10;
        this.f52580g = 0;
    }

    static void b(String str) {
        if (androidx.arch.core.executor.c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(w0<T>.d dVar) {
        if (dVar.f52589b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f52590c;
            int i11 = this.f52580g;
            if (i10 >= i11) {
                return;
            }
            dVar.f52590c = i11;
            dVar.f52588a.c((Object) this.f52578e);
        }
    }

    @androidx.annotation.l0
    void c(int i10) {
        int i11 = this.f52576c;
        this.f52576c = i10 + i11;
        if (this.f52577d) {
            return;
        }
        this.f52577d = true;
        while (true) {
            try {
                int i12 = this.f52576c;
                if (i11 == i12) {
                    this.f52577d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    m();
                } else if (z11) {
                    n();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f52577d = false;
                throw th2;
            }
        }
    }

    void e(w0<T>.d dVar) {
        if (this.f52581h) {
            this.f52582i = true;
            return;
        }
        this.f52581h = true;
        do {
            this.f52582i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                androidx.arch.core.internal.b<d1<? super T>, w0<T>.d>.d dVarI = this.f52575b.i();
                while (dVarI.hasNext()) {
                    d((d) dVarI.next().getValue());
                    if (this.f52582i) {
                        break;
                    }
                }
            }
        } while (this.f52582i);
        this.f52581h = false;
    }

    public T f() {
        T t10 = (T) this.f52578e;
        if (t10 != f52573l) {
            return t10;
        }
        return null;
    }

    int g() {
        return this.f52580g;
    }

    public boolean h() {
        return this.f52576c > 0;
    }

    public boolean i() {
        return this.f52575b.size() > 0;
    }

    public boolean j() {
        return this.f52578e != f52573l;
    }

    @androidx.annotation.l0
    public void k(o0 o0Var, d1<? super T> d1Var) {
        b("observe");
        if (o0Var.getLifecycle().d() == c0.b.DESTROYED) {
            return;
        }
        c cVar = new c(o0Var, d1Var);
        w0<T>.d dVarM = this.f52575b.m(d1Var, cVar);
        if (dVarM != null && !dVarM.c(o0Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarM != null) {
            return;
        }
        o0Var.getLifecycle().c(cVar);
    }

    @androidx.annotation.l0
    public void l(d1<? super T> d1Var) {
        b("observeForever");
        b bVar = new b(d1Var);
        w0<T>.d dVarM = this.f52575b.m(d1Var, bVar);
        if (dVarM instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarM != null) {
            return;
        }
        bVar.a(true);
    }

    protected void m() {
    }

    protected void n() {
    }

    protected void o(T t10) {
        boolean z10;
        synchronized (this.f52574a) {
            try {
                z10 = this.f52579f == f52573l;
                this.f52579f = t10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            androidx.arch.core.executor.c.h().d(this.f52583j);
        }
    }

    @androidx.annotation.l0
    public void p(d1<? super T> d1Var) {
        b("removeObserver");
        w0<T>.d dVarN = this.f52575b.n(d1Var);
        if (dVarN == null) {
            return;
        }
        dVarN.b();
        dVarN.a(false);
    }

    @androidx.annotation.l0
    public void q(o0 o0Var) {
        b("removeObservers");
        for (Map.Entry<d1<? super T>, w0<T>.d> entry : this.f52575b) {
            if (entry.getValue().c(o0Var)) {
                p(entry.getKey());
            }
        }
    }

    @androidx.annotation.l0
    protected void r(T t10) {
        b("setValue");
        this.f52580g++;
        this.f52578e = t10;
        e(null);
    }

    public w0() {
        this.f52574a = new Object();
        this.f52575b = new androidx.arch.core.internal.b<>();
        this.f52576c = 0;
        Object obj = f52573l;
        this.f52579f = obj;
        this.f52583j = new a();
        this.f52578e = obj;
        this.f52580g = -1;
    }
}
