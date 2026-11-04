package com.rabbitmq.client.impl;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d extends m1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final org.slf4j.c f265159m = org.slf4j.e.k(d.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final int f265160n = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f265162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f265163f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final int f265167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f265168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.rabbitmq.client.g2 f265169l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Object f265161d = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f265164g = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k1 f265165h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected volatile boolean f265166i = false;

    public interface b {
        boolean a(e eVar);

        void b(e eVar);

        void c(com.rabbitmq.client.l1 l1Var);
    }

    public static class c extends a<e> {
        public c() {
        }

        @Override // com.rabbitmq.client.impl.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public e g(e eVar) {
            return eVar;
        }

        public c(com.rabbitmq.client.o0 o0Var) {
            super(o0Var);
        }
    }

    public d(i iVar, int i10) {
        this.f265162e = iVar;
        this.f265163f = i10;
        if (iVar.B0() < 0) {
            throw new IllegalArgumentException("Continuation timeout on RPC calls cannot be less than 0");
        }
        this.f265167j = iVar.B0();
        this.f265168k = iVar.f2();
        this.f265169l = iVar.Q0();
    }

    public static IOException T0(com.rabbitmq.client.l1 l1Var) {
        return U0(l1Var, null);
    }

    public static IOException U0(com.rabbitmq.client.l1 l1Var, String str) {
        IOException iOException = new IOException(str);
        iOException.initCause(l1Var);
        return iOException;
    }

    private CompletableFuture<com.rabbitmq.client.m> g0(com.rabbitmq.client.o0 o0Var) throws IOException, com.rabbitmq.client.l1 {
        CompletableFuture<com.rabbitmq.client.m> completableFuture = new CompletableFuture<>();
        q(o0Var, completableFuture);
        return completableFuture;
    }

    private e j0(com.rabbitmq.client.o0 o0Var) throws IOException, com.rabbitmq.client.l1 {
        c cVar = new c(o0Var);
        O0(o0Var, cVar);
        int i10 = this.f265167j;
        if (i10 == 0) {
            return cVar.d();
        }
        try {
            return cVar.e(i10);
        } catch (TimeoutException e10) {
            throw b1(o0Var, e10);
        }
    }

    private e k0(com.rabbitmq.client.o0 o0Var, int i10) throws TimeoutException, IOException, com.rabbitmq.client.l1 {
        c cVar = new c(o0Var);
        O0(o0Var, cVar);
        try {
            return cVar.e(i10);
        } catch (TimeoutException e10) {
            r();
            throw e10;
        }
    }

    public static /* synthetic */ k1 m(b bVar) {
        return new j1(bVar);
    }

    public static /* synthetic */ k1 o(com.rabbitmq.client.o0 o0Var, CompletableFuture completableFuture) {
        return new x(o0Var, completableFuture);
    }

    private void r() {
        try {
            d0();
            Y();
        } catch (Exception e10) {
            f265159m.w("Error while cleaning timed out channel RPC: {}", e10.getMessage());
        }
    }

    private void t(Supplier<k1> supplier) {
        synchronized (this.f265161d) {
            boolean z10 = false;
            while (this.f265165h != null) {
                try {
                    try {
                        this.f265161d.wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.f265165h = supplier.get();
        }
    }

    public void B0(e eVar) throws IOException {
        synchronized (this.f265161d) {
            try {
                if (eVar.getMethod().Y()) {
                    while (this.f265166i) {
                        try {
                            this.f265161d.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                        E();
                    }
                }
                this.f265169l.a(eVar);
                eVar.j(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E() throws com.rabbitmq.client.d {
        if (!isOpen()) {
            throw new com.rabbitmq.client.d(g());
        }
    }

    public CompletableFuture<com.rabbitmq.client.m> H(com.rabbitmq.client.o0 o0Var) throws IOException {
        try {
            return g0(o0Var);
        } catch (com.rabbitmq.client.d e10) {
            throw e10;
        } catch (com.rabbitmq.client.l1 e11) {
            throw T0(e11);
        }
    }

    public e H0(com.rabbitmq.client.o0 o0Var) throws IOException, com.rabbitmq.client.l1 {
        return j0(o0Var);
    }

    public e I(com.rabbitmq.client.o0 o0Var) throws IOException {
        try {
            return j0(o0Var);
        } catch (com.rabbitmq.client.d e10) {
            throw e10;
        } catch (com.rabbitmq.client.l1 e11) {
            throw T0(e11);
        }
    }

    public e M0(com.rabbitmq.client.o0 o0Var, int i10) throws TimeoutException, IOException, com.rabbitmq.client.l1 {
        return k0(o0Var, i10);
    }

    public i N() {
        return this.f265162e;
    }

    public void O0(com.rabbitmq.client.o0 o0Var, b bVar) throws IOException {
        synchronized (this.f265161d) {
            E();
            x0(o0Var, bVar);
        }
    }

    public void Q0(com.rabbitmq.client.o0 o0Var) throws IOException {
        synchronized (this.f265161d) {
            R0(new e(o0Var));
        }
    }

    public void R(e eVar) throws IOException {
        this.f265169l.b(eVar);
        if (o0(eVar)) {
            return;
        }
        if (this.f265168k) {
            synchronized (this.f265161d) {
                try {
                    k1 k1Var = this.f265165h;
                    if (k1Var != null && !k1Var.a(eVar)) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        k1 k1VarD0 = d0();
        if (k1VarD0 != null) {
            k1VarD0.c(eVar);
            Y();
        }
    }

    public void R0(e eVar) throws IOException {
        synchronized (this.f265161d) {
            E();
            B0(eVar);
        }
    }

    public void T(s0 s0Var) throws IOException {
        e eVar = this.f265164g;
        if (eVar.h(s0Var)) {
            this.f265164g = new e();
            R(eVar);
        }
    }

    public int V8() {
        return this.f265163f;
    }

    public boolean X() {
        boolean z10;
        synchronized (this.f265161d) {
            z10 = this.f265165h != null;
        }
        return z10;
    }

    protected void Y() {
    }

    protected com.rabbitmq.client.l b1(com.rabbitmq.client.o0 o0Var, TimeoutException timeoutException) {
        r();
        return new com.rabbitmq.client.l(timeoutException, this, this.f265163f, o0Var);
    }

    public k1 d0() {
        k1 k1Var;
        synchronized (this.f265161d) {
            try {
                k1Var = this.f265165h;
                this.f265165h = null;
                this.f265161d.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k1Var;
    }

    public void f0(com.rabbitmq.client.l1 l1Var) {
        k1 k1VarD0 = d0();
        if (k1VarD0 != null) {
            k1VarD0.b(l1Var);
        }
    }

    public abstract boolean o0(com.rabbitmq.client.m mVar) throws IOException;

    public void q(com.rabbitmq.client.o0 o0Var, CompletableFuture<com.rabbitmq.client.m> completableFuture) throws IOException {
        synchronized (this.f265161d) {
            E();
            w0(o0Var, completableFuture);
        }
    }

    public void r0(com.rabbitmq.client.l1 l1Var, boolean z10, boolean z11) {
        try {
            synchronized (this.f265161d) {
                try {
                    if (!d(l1Var) && !z10) {
                        throw new com.rabbitmq.client.d(g());
                    }
                    this.f265161d.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                f0(l1Var);
            }
        } catch (Throwable th3) {
            if (z11) {
                f0(l1Var);
            }
            throw th3;
        }
    }

    public String toString() {
        return "AMQChannel(" + this.f265162e + "," + this.f265163f + ")";
    }

    public void w0(com.rabbitmq.client.o0 o0Var, CompletableFuture<com.rabbitmq.client.m> completableFuture) throws IOException {
        synchronized (this.f265161d) {
            x(o0Var, completableFuture);
            y0(o0Var);
        }
    }

    public void x(final com.rabbitmq.client.o0 o0Var, final CompletableFuture<com.rabbitmq.client.m> completableFuture) {
        t(new Supplier() { // from class: com.rabbitmq.client.impl.b
            @Override // java.util.function.Supplier
            public final Object get() {
                return d.o(o0Var, completableFuture);
            }
        });
    }

    public void x0(com.rabbitmq.client.o0 o0Var, b bVar) throws IOException {
        synchronized (this.f265161d) {
            y(bVar);
            y0(o0Var);
        }
    }

    public void y(final b bVar) {
        t(new Supplier() { // from class: com.rabbitmq.client.impl.c
            @Override // java.util.function.Supplier
            public final Object get() {
                return d.m(bVar);
            }
        });
    }

    public void y0(com.rabbitmq.client.o0 o0Var) throws IOException {
        synchronized (this.f265161d) {
            B0(new e(o0Var));
        }
    }

    public static abstract class a<T> implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.rabbitmq.utility.b<T, com.rabbitmq.client.l1> f265170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final com.rabbitmq.client.o0 f265171b;

        public a() {
            this.f265170a = new com.rabbitmq.utility.b<>();
            this.f265171b = null;
        }

        public static boolean f(com.rabbitmq.client.o0 o0Var, com.rabbitmq.client.o0 o0Var2) {
            if (o0Var != null) {
                if (o0Var instanceof com.rabbitmq.client.a.b.l) {
                    return o0Var2 instanceof com.rabbitmq.client.a.b.m;
                }
                if (o0Var instanceof com.rabbitmq.client.a.b.g) {
                    return (o0Var2 instanceof com.rabbitmq.client.a.b.i) || (o0Var2 instanceof com.rabbitmq.client.a.b.h);
                }
                if (o0Var instanceof com.rabbitmq.client.a.b.d) {
                    if (!(o0Var2 instanceof com.rabbitmq.client.a.b.e)) {
                        return false;
                    }
                    String strH = ((com.rabbitmq.client.a.b.d) o0Var).h();
                    return strH == null || strH.equals("") || strH.equals(((com.rabbitmq.client.a.b.e) o0Var2).h());
                }
                if (o0Var instanceof com.rabbitmq.client.a.b.InterfaceC1759b) {
                    if (o0Var2 instanceof com.rabbitmq.client.a.b.c) {
                        return ((com.rabbitmq.client.a.b.InterfaceC1759b) o0Var).h().equals(((com.rabbitmq.client.a.b.c) o0Var2).h());
                    }
                    return false;
                }
                if (o0Var instanceof com.rabbitmq.client.a.b.n) {
                    return o0Var2 instanceof com.rabbitmq.client.a.b.p;
                }
                if (o0Var instanceof com.rabbitmq.client.a.g.c) {
                    return o0Var2 instanceof com.rabbitmq.client.a.g.d;
                }
                if (o0Var instanceof com.rabbitmq.client.a.g.e) {
                    return o0Var2 instanceof com.rabbitmq.client.a.g.f;
                }
                if (o0Var instanceof com.rabbitmq.client.a.g.InterfaceC1805a) {
                    return o0Var2 instanceof com.rabbitmq.client.a.g.b;
                }
                if (o0Var instanceof com.rabbitmq.client.a.g.InterfaceC1812g) {
                    return o0Var2 instanceof com.rabbitmq.client.a.g.h;
                }
                if (o0Var instanceof com.rabbitmq.client.a.i.c) {
                    return o0Var2 instanceof com.rabbitmq.client.a.i.d;
                }
                if (o0Var instanceof com.rabbitmq.client.a.i.e) {
                    return o0Var2 instanceof com.rabbitmq.client.a.i.f;
                }
                if (o0Var instanceof com.rabbitmq.client.a.i.InterfaceC1815a) {
                    return o0Var2 instanceof com.rabbitmq.client.a.i.b;
                }
                if (o0Var instanceof com.rabbitmq.client.a.i.InterfaceC1824i) {
                    return o0Var2 instanceof com.rabbitmq.client.a.i.j;
                }
                if (o0Var instanceof com.rabbitmq.client.a.i.g) {
                    return o0Var2 instanceof com.rabbitmq.client.a.i.h;
                }
                if (o0Var instanceof com.rabbitmq.client.a.j.e) {
                    return o0Var2 instanceof com.rabbitmq.client.a.j.f;
                }
                if (o0Var instanceof com.rabbitmq.client.a.j.InterfaceC1827a) {
                    return o0Var2 instanceof com.rabbitmq.client.a.j.b;
                }
                if (o0Var instanceof com.rabbitmq.client.a.j.c) {
                    return o0Var2 instanceof com.rabbitmq.client.a.j.d;
                }
                if (o0Var instanceof com.rabbitmq.client.a.e.InterfaceC1786a) {
                    return o0Var2 instanceof com.rabbitmq.client.a.e.b;
                }
            }
            return true;
        }

        @Override // com.rabbitmq.client.impl.d.b
        public boolean a(e eVar) {
            return f(this.f265171b, eVar.getMethod());
        }

        @Override // com.rabbitmq.client.impl.d.b
        public void b(e eVar) {
            this.f265170a.h(g(eVar));
        }

        @Override // com.rabbitmq.client.impl.d.b
        public void c(com.rabbitmq.client.l1 l1Var) {
            this.f265170a.g(l1Var);
        }

        public T d() throws com.rabbitmq.client.l1 {
            return this.f265170a.i();
        }

        public T e(int i10) throws TimeoutException, com.rabbitmq.client.l1 {
            return this.f265170a.j(i10);
        }

        public abstract T g(e eVar);

        public a(com.rabbitmq.client.o0 o0Var) {
            this.f265170a = new com.rabbitmq.utility.b<>();
            this.f265171b = o0Var;
        }
    }
}
