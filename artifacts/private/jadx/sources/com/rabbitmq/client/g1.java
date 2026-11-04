package com.rabbitmq.client;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes13.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f265088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f265089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f265090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f265091d;

    private static class a extends x implements b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c0 f265092f = new c0(null, null, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BlockingQueue<c0> f265093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile l1 f265094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile u f265095e;

        public a(k kVar) {
            this(kVar, new LinkedBlockingQueue());
        }

        private void j() {
            if (this.f265094d != null) {
                throw ((l1) com.rabbitmq.utility.e.c(this.f265094d));
            }
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0012  */
        /* JADX WARN: Code duplicated, block: B:14:0x0015  */
        /* JADX WARN: Code duplicated, block: B:23:0x0034  */
        /* JADX WARN: Code duplicated, block: B:27:0x003a  */
        /* JADX WARN: Code duplicated, block: B:29:0x0043  */
        private c0 k(c0 c0Var) {
            c0 c0Var2 = f265092f;
            if (c0Var == c0Var2) {
                if (c0Var == c0Var2) {
                    this.f265093c.add(c0Var2);
                    if (this.f265094d == null && this.f265095e == null) {
                        throw new IllegalStateException("POISON in queue, but null _shutdown and null _cancelled. This should never happen, please report as a BUG");
                    }
                }
                if (this.f265094d == null) {
                    throw ((l1) com.rabbitmq.utility.e.c(this.f265094d));
                }
                if (this.f265095e != null) {
                    throw ((u) com.rabbitmq.utility.e.c(this.f265095e));
                }
            } else {
                if (c0Var != null) {
                    return c0Var;
                }
                if (this.f265094d != null || this.f265095e != null) {
                    if (c0Var == c0Var2) {
                        this.f265093c.add(c0Var2);
                        if (this.f265094d == null) {
                            throw new IllegalStateException("POISON in queue, but null _shutdown and null _cancelled. This should never happen, please report as a BUG");
                        }
                    }
                    if (this.f265094d == null) {
                        throw ((l1) com.rabbitmq.utility.e.c(this.f265094d));
                    }
                    if (this.f265095e != null) {
                        throw ((u) com.rabbitmq.utility.e.c(this.f265095e));
                    }
                }
            }
            return c0Var;
        }

        @Override // com.rabbitmq.client.x, com.rabbitmq.client.t
        public void a(String str, l1 l1Var) {
            this.f265094d = l1Var;
            this.f265093c.add(f265092f);
        }

        @Override // com.rabbitmq.client.x, com.rabbitmq.client.t
        public void c(String str, f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
            j();
            this.f265093c.add(new c0(f0Var, cVar, bArr));
        }

        @Override // com.rabbitmq.client.x, com.rabbitmq.client.t
        public void f(String str) throws IOException {
            this.f265095e = new u();
            this.f265093c.add(f265092f);
        }

        @Override // com.rabbitmq.client.g1.b
        public c0 g() throws InterruptedException, u, l1 {
            return k(this.f265093c.take());
        }

        public a(k kVar, BlockingQueue<c0> blockingQueue) {
            super(kVar);
            this.f265093c = blockingQueue;
        }
    }

    public interface b extends t {
        c0 g() throws InterruptedException, u, l1;

        String h();
    }

    public g1(k kVar) throws IOException {
        this(kVar, null);
    }

    public void a() throws IOException {
        b bVar = this.f265091d;
        if (bVar != null) {
            this.f265088a.d5(bVar.h());
            this.f265091d = null;
        }
        o();
    }

    public k b() {
        return this.f265088a;
    }

    public String c() {
        return this.f265089b;
    }

    public byte[] d(com.rabbitmq.client.a.c cVar, byte[] bArr, com.rabbitmq.client.a.c cVar2) {
        return f(bArr, cVar2);
    }

    public byte[] e(c0 c0Var, com.rabbitmq.client.a.c cVar) {
        return d(c0Var.c(), c0Var.a(), cVar);
    }

    public byte[] f(byte[] bArr, com.rabbitmq.client.a.c cVar) {
        return new byte[0];
    }

    public void g(com.rabbitmq.client.a.c cVar, byte[] bArr) {
        i(bArr);
    }

    public void h(c0 c0Var) {
        g(c0Var.c(), c0Var.a());
    }

    public void i(byte[] bArr) {
    }

    public l1 j() throws IOException {
        while (this.f265090c) {
            try {
                try {
                    c0 c0VarG = this.f265091d.g();
                    m(c0VarG);
                    this.f265088a.z6(c0VarG.b().a(), false);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f265090c = false;
                }
            } catch (l1 e10) {
                return e10;
            }
        }
        return null;
    }

    protected com.rabbitmq.client.a.c k(c0 c0Var, com.rabbitmq.client.a.c.C1777a c1777a) {
        return c1777a.b();
    }

    protected com.rabbitmq.client.a.c l(c0 c0Var, com.rabbitmq.client.a.c.C1777a c1777a) {
        return c1777a.b();
    }

    public void m(c0 c0Var) throws IOException {
        com.rabbitmq.client.a.c cVarC = c0Var.c();
        String strF = cVarC.f();
        String strA = cVarC.a();
        if (strF == null || strA == null) {
            h(c0Var);
            return;
        }
        com.rabbitmq.client.a.c cVarL = l(c0Var, new com.rabbitmq.client.a.c.C1777a().f(strF));
        byte[] bArrE = e(c0Var, cVarL);
        this.f265088a.le("", strA, k(c0Var, cVarL.l()), bArrE);
    }

    protected b n() throws IOException {
        a aVar = new a(this.f265088a);
        this.f265088a.o5(this.f265089b, aVar);
        return aVar;
    }

    public void o() {
        this.f265090c = false;
    }

    public g1(k kVar, String str) throws IOException {
        this.f265090c = true;
        this.f265088a = kVar;
        if (str == null || str.equals("")) {
            this.f265089b = kVar.k6().e();
        } else {
            this.f265089b = str;
        }
        this.f265091d = n();
    }
}
