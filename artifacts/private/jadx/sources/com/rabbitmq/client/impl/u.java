package com.rabbitmq.client.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public class u extends com.rabbitmq.client.impl.d implements com.rabbitmq.client.k {
    private static final int H1 = 65535;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final org.slf4j.c f265826g3 = org.slf4j.e.k(u.class);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f265827p2 = "";
    private final z X;
    private volatile CountDownLatch Y;
    private final SortedSet<Long> Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map<String, com.rabbitmq.client.t> f265828o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private volatile boolean f265829p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected final com.rabbitmq.client.p0 f265830p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Collection<com.rabbitmq.client.b1> f265831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Collection<com.rabbitmq.client.o> f265832t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f265833v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile com.rabbitmq.client.t f265834w;

    class a implements com.rabbitmq.client.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.n f265835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.n f265836b;

        a(com.rabbitmq.client.n nVar, com.rabbitmq.client.n nVar2) {
            this.f265835a = nVar;
            this.f265836b = nVar2;
        }

        @Override // com.rabbitmq.client.o
        public void a(long j10, boolean z10) throws IOException {
            this.f265835a.a(j10, z10);
        }

        @Override // com.rabbitmq.client.o
        public void b(long j10, boolean z10) throws IOException {
            this.f265836b.a(j10, z10);
        }
    }

    class b extends com.rabbitmq.client.impl.d.a<com.rabbitmq.client.impl.e> {
        b() {
        }

        @Override // com.rabbitmq.client.impl.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public com.rabbitmq.client.impl.e g(com.rabbitmq.client.impl.e eVar) {
            u.this.D2();
            return eVar;
        }
    }

    class c extends com.rabbitmq.client.impl.d.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.t f265839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f265840d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.rabbitmq.client.o0 o0Var, com.rabbitmq.client.t tVar, boolean z10) {
            super(o0Var);
            this.f265839c = tVar;
            this.f265840d = z10;
        }

        @Override // com.rabbitmq.client.impl.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public String g(com.rabbitmq.client.impl.e eVar) {
            String strH = ((k.b.e) eVar.getMethod()).h();
            u.this.f265828o.put(strH, this.f265839c);
            u uVar = u.this;
            uVar.f265830p1.d(uVar, strH, this.f265840d);
            u.this.X.k(this.f265839c, strH);
            return strH;
        }
    }

    class d implements com.rabbitmq.client.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.j f265842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.b0 f265843b;

        d(com.rabbitmq.client.j jVar, com.rabbitmq.client.b0 b0Var) {
            this.f265842a = jVar;
            this.f265843b = b0Var;
        }

        @Override // com.rabbitmq.client.t
        public void a(String str, com.rabbitmq.client.l1 l1Var) {
        }

        @Override // com.rabbitmq.client.t
        public void b(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void c(String str, com.rabbitmq.client.f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
            this.f265843b.a(str, new com.rabbitmq.client.c0(f0Var, cVar, bArr));
        }

        @Override // com.rabbitmq.client.t
        public void d(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void e(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void f(String str) throws IOException {
            this.f265842a.a(str);
        }
    }

    class e implements com.rabbitmq.client.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.v f265845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.b0 f265846b;

        e(com.rabbitmq.client.v vVar, com.rabbitmq.client.b0 b0Var) {
            this.f265845a = vVar;
            this.f265846b = b0Var;
        }

        @Override // com.rabbitmq.client.t
        public void a(String str, com.rabbitmq.client.l1 l1Var) {
            this.f265845a.a(str, l1Var);
        }

        @Override // com.rabbitmq.client.t
        public void b(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void c(String str, com.rabbitmq.client.f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
            this.f265846b.a(str, new com.rabbitmq.client.c0(f0Var, cVar, bArr));
        }

        @Override // com.rabbitmq.client.t
        public void d(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void e(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void f(String str) throws IOException {
        }
    }

    class f implements com.rabbitmq.client.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.j f265848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.v f265849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.b0 f265850c;

        f(com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar, com.rabbitmq.client.b0 b0Var) {
            this.f265848a = jVar;
            this.f265849b = vVar;
            this.f265850c = b0Var;
        }

        @Override // com.rabbitmq.client.t
        public void a(String str, com.rabbitmq.client.l1 l1Var) {
            this.f265849b.a(str, l1Var);
        }

        @Override // com.rabbitmq.client.t
        public void b(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void c(String str, com.rabbitmq.client.f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
            this.f265850c.a(str, new com.rabbitmq.client.c0(f0Var, cVar, bArr));
        }

        @Override // com.rabbitmq.client.t
        public void d(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void e(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void f(String str) throws IOException {
            this.f265848a.a(str);
        }
    }

    class g extends com.rabbitmq.client.impl.d.a<com.rabbitmq.client.t> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f265852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.t f265853d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.rabbitmq.client.o0 o0Var, String str, com.rabbitmq.client.t tVar) {
            super(o0Var);
            this.f265852c = str;
            this.f265853d = tVar;
        }

        @Override // com.rabbitmq.client.impl.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public com.rabbitmq.client.t g(com.rabbitmq.client.impl.e eVar) {
            if (!(eVar.getMethod() instanceof k.b.c)) {
                u.f265826g3.w("Received reply {} was not of expected method Basic.CancelOk", eVar.getMethod());
            }
            u.this.f265828o.remove(this.f265852c);
            u.this.X.j(this.f265853d, this.f265852c);
            return this.f265853d;
        }
    }

    public u(i iVar, int i10, a0 a0Var) {
        this(iVar, i10, a0Var, new com.rabbitmq.client.r0());
    }

    private void B1(com.rabbitmq.client.m mVar, k.b.r rVar) {
        try {
            Iterator<com.rabbitmq.client.b1> it = this.f265831s.iterator();
            while (it.hasNext()) {
                it.next().a(rVar.n(), rVar.m(), rVar.f(), rVar.g(), (com.rabbitmq.client.a.c) mVar.a(), mVar.b());
            }
        } catch (Throwable th2) {
            try {
                N().getExceptionHandler().a(this, th2);
            } finally {
                this.f265830p1.l(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D2() {
        this.X.q();
        s1(g());
        synchronized (this.Z) {
            try {
                this.Z.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void G2(long j10, boolean z10, boolean z11) {
        if (z10) {
            this.Z.headSet(Long.valueOf(j10 + 1)).clear();
        } else {
            this.Z.remove(Long.valueOf(j10));
        }
        synchronized (this.Z) {
            try {
                this.f265829p0 = this.f265829p0 && !z11;
                if (this.Z.isEmpty()) {
                    this.Z.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private com.rabbitmq.client.t O1(com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) {
        return new d(jVar, b0Var);
    }

    private com.rabbitmq.client.t T1(com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) {
        return new f(jVar, vVar, b0Var);
    }

    private void Z2() {
        N().r0(this);
    }

    private void a3(com.rabbitmq.client.l1 l1Var, boolean z10, boolean z11) {
        super.r0(l1Var, z10, z11);
    }

    private com.rabbitmq.client.t b2(com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) {
        return new e(vVar, b0Var);
    }

    private static void k3(String str) {
        if (str.length() > 255) {
            throw new IllegalArgumentException("queue name must be no more than 255 characters long");
        }
    }

    private void l1(com.rabbitmq.client.m mVar) throws IOException {
        com.rabbitmq.client.l1 l1Var = new com.rabbitmq.client.l1(false, false, mVar.getMethod(), this);
        synchronized (this.f265161d) {
            try {
                try {
                    r0(l1Var, true, false);
                    y0(new k.c.b());
                    Z2();
                    f0(l1Var);
                } catch (Throwable th2) {
                    Z2();
                    f0(l1Var);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        l();
    }

    private void s1(com.rabbitmq.client.l1 l1Var) {
        this.Y = this.X.n(com.rabbitmq.utility.e.b(this.f265828o), l1Var);
    }

    private void u1(com.rabbitmq.client.m mVar, k.b.a aVar) {
        try {
            Iterator<com.rabbitmq.client.o> it = this.f265832t.iterator();
            while (it.hasNext()) {
                it.next().a(aVar.i(), aVar.w());
            }
        } catch (Throwable th2) {
            try {
                N().getExceptionHandler().f(this, th2);
            } catch (Throwable th3) {
                this.f265830p1.c(this, aVar.i(), aVar.w());
                throw th3;
            }
        }
        this.f265830p1.c(this, aVar.i(), aVar.w());
    }

    private void w1(com.rabbitmq.client.m mVar, k.b.j jVar) {
        try {
            Iterator<com.rabbitmq.client.o> it = this.f265832t.iterator();
            while (it.hasNext()) {
                it.next().b(jVar.i(), jVar.w());
            }
        } catch (Throwable th2) {
            try {
                N().getExceptionHandler().f(this, th2);
            } finally {
                this.f265830p1.a(this, jVar.i(), jVar.w());
            }
        }
        com.rabbitmq.client.p0 p0Var = this.f265830p1;
        long jI = jVar.i();
    }

    @Override // com.rabbitmq.client.k
    public String A7(String str, boolean z10, String str2, com.rabbitmq.client.t tVar) throws IOException {
        return p3(str, z10, str2, false, false, null, tVar);
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: B2, reason: merged with bridge method [inline-methods] */
    public k.g.h qc(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        return (k.g.h) I(new com.rabbitmq.client.a.g.InterfaceC1812g.C1813a().c(str).g(str2).f(str3).a(map).b()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public String B6(String str, boolean z10, Map<String, Object> map, com.rabbitmq.client.t tVar) throws IOException {
        return p3(str, z10, "", false, false, map, tVar);
    }

    @Override // com.rabbitmq.client.k
    public void Be(com.rabbitmq.client.b1 b1Var) {
        this.f265831s.add(b1Var);
    }

    @Override // com.rabbitmq.client.k
    public /* bridge */ /* synthetic */ com.rabbitmq.client.p C0() {
        return super.N();
    }

    @Override // com.rabbitmq.client.k
    public boolean C2(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        if (this.f265833v == 0) {
            throw new IllegalStateException("Confirms not selected");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.Z) {
            while (g() == null) {
                try {
                    if (this.Z.isEmpty()) {
                        z10 = this.f265829p0;
                        this.f265829p0 = true;
                    } else if (j10 == 0) {
                        this.Z.wait();
                    } else {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (j10 <= jCurrentTimeMillis2) {
                            throw new TimeoutException();
                        }
                        this.Z.wait(j10 - jCurrentTimeMillis2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            throw ((com.rabbitmq.client.l1) com.rabbitmq.utility.e.c(g()));
        }
        return z10;
    }

    @Override // com.rabbitmq.client.k
    public String D7(String str, boolean z10, String str2, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, str2, false, false, null, T1(b0Var, jVar, vVar));
    }

    public void D9(long j10, boolean z10) throws IOException {
        Q0(new k.b.q(j10, z10));
        this.f265830p1.n(this, j10);
    }

    @Override // com.rabbitmq.client.k
    public void Db(com.rabbitmq.client.o oVar) {
        this.f265832t.add(oVar);
    }

    protected void E1(int i10, String str, boolean z10, Throwable th2, boolean z11) throws Throwable {
        boolean z12 = false;
        com.rabbitmq.client.o0 aVar = new k.c.a(i10, str, 0, 0);
        com.rabbitmq.client.l1 l1Var = new com.rabbitmq.client.l1(false, z10, aVar, this);
        if (th2 != null) {
            l1Var.initCause(th2);
        }
        b bVar = new b();
        try {
            try {
                synchronized (this.f265161d) {
                    try {
                        a3(l1Var, !z10, true);
                        x0(aVar, bVar);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                try {
                    bVar.e(10000);
                    Z2();
                    l();
                } catch (com.rabbitmq.client.l1 e10) {
                    e = e10;
                    z12 = true;
                    if (!z11) {
                        throw e;
                    }
                    if (!z11 && !z12) {
                        return;
                    }
                    Z2();
                    l();
                } catch (IOException e11) {
                    e = e11;
                    z12 = true;
                    if (!z11) {
                        throw e;
                    }
                    if (!z11 && !z12) {
                        return;
                    }
                    Z2();
                    l();
                } catch (TimeoutException e12) {
                    e = e12;
                    z12 = true;
                    if (!z11) {
                        throw e;
                    }
                    if (!z11 && !z12) {
                        return;
                    }
                    Z2();
                    l();
                } catch (Throwable th4) {
                    th = th4;
                    z12 = true;
                    if (z11 || z12) {
                        Z2();
                        l();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (com.rabbitmq.client.l1 e13) {
            e = e13;
        } catch (IOException e14) {
            e = e14;
        } catch (TimeoutException e15) {
            e = e15;
        }
    }

    CountDownLatch E2() {
        return this.Y;
    }

    @Override // com.rabbitmq.client.k
    public void E8(String str, boolean z10, boolean z11) throws IOException {
        k3(str);
        R0(new com.rabbitmq.client.impl.e(new com.rabbitmq.client.a.i.e.C1820a().h(str).e(z10).c(z11).g(true).a()));
    }

    @Override // com.rabbitmq.client.k
    public long F4(String str) throws IOException {
        return b3(str).Q();
    }

    @Override // com.rabbitmq.client.k
    public void Gd() throws InterruptedException, IOException {
        try {
            tc(0L);
        } catch (TimeoutException unused) {
        }
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public com.rabbitmq.client.impl.e G5(com.rabbitmq.client.o0 o0Var) throws IOException {
        return I(o0Var);
    }

    @Override // com.rabbitmq.client.k
    public void I5(int i10) throws IOException {
        R1(0, i10, false);
    }

    @Override // com.rabbitmq.client.k
    public void Ie(String str, com.rabbitmq.client.i iVar, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        Xb(str, iVar.k(), z10, z11, z12, map);
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public k.d.b D8() throws IOException {
        if (this.f265833v == 0) {
            this.f265833v = 1L;
        }
        return (k.d.b) I(new k.d.a(false)).getMethod();
    }

    public void J2() throws IOException {
        I(new k.c.e(""));
    }

    @Override // com.rabbitmq.client.k
    public String K2(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, str2, z11, z12, map, T1(b0Var, jVar, vVar));
    }

    protected void L2(com.rabbitmq.client.m mVar, k.b.f fVar) {
        com.rabbitmq.client.t tVar = this.f265828o.get(fVar.h());
        if (tVar == null) {
            if (this.f265834w == null) {
                throw new IllegalStateException("Unsolicited delivery - see Channel.setDefaultConsumer to handle this case.");
            }
            tVar = this.f265834w;
        }
        com.rabbitmq.client.t tVar2 = tVar;
        com.rabbitmq.client.f0 f0Var = new com.rabbitmq.client.f0(fVar.i(), fVar.s(), fVar.f(), fVar.g());
        try {
            this.f265830p1.i(this, fVar.i(), fVar.h());
            this.X.l(tVar2, fVar.h(), f0Var, (com.rabbitmq.client.a.c) mVar.a(), mVar.b());
        } catch (q2 e10) {
            throw e10;
        } catch (Throwable th2) {
            N().getExceptionHandler().h(this, th2, tVar2, fVar.h(), "handleDelivery");
        }
    }

    @Override // com.rabbitmq.client.k
    public void M5(String str, String str2, boolean z10, boolean z11, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
        if (this.f265833v > 0) {
            this.Z.add(Long.valueOf(vd()));
            this.f265833v++;
        }
        if (cVar == null) {
            cVar = com.rabbitmq.client.n0.f265971a;
        }
        try {
            R0(new com.rabbitmq.client.impl.e(new com.rabbitmq.client.a.b.k.C1769a().b(str).g(str2).f(z10).d(z11).a(), cVar, bArr));
            this.f265830p1.j(this);
        } catch (IOException e10) {
            this.f265830p1.o(this, e10);
            throw e10;
        }
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: N2, reason: merged with bridge method [inline-methods] */
    public k.i.b vb(String str, String str2, String str3) throws IOException {
        return V2(str, str2, str3, null);
    }

    @Override // com.rabbitmq.client.k
    public void Ne() {
        this.f265831s.clear();
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: O2, reason: merged with bridge method [inline-methods] */
    public k.i.b V2(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        k3(str);
        return (k.i.b) I(new com.rabbitmq.client.a.i.InterfaceC1815a.C1816a().f(str).c(str2).g(str3).a(map).b()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public boolean O3() throws InterruptedException {
        try {
            return C2(0L);
        } catch (TimeoutException unused) {
            return false;
        }
    }

    @Override // com.rabbitmq.client.k
    public void O9(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        R0(new com.rabbitmq.client.impl.e(new com.rabbitmq.client.a.g.InterfaceC1805a.C1806a().c(str).g(str2).f(str3).a(map).e(true).b()));
    }

    @Override // com.rabbitmq.client.k
    public void Pa(int i10, boolean z10) throws IOException {
        R1(0, i10, z10);
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: Q2, reason: merged with bridge method [inline-methods] */
    public k.i.d L7(String str, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        k3(str);
        return (k.i.d) I(new com.rabbitmq.client.a.i.c.C1818a().m(str).f(z10).h(z11).c(z12).a(map).d()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public void Qc(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        R0(new com.rabbitmq.client.impl.e(new com.rabbitmq.client.a.g.InterfaceC1812g.C1813a().c(str).g(str2).f(str3).a(map).e(true).b()));
    }

    @Override // com.rabbitmq.client.k
    public void Qe() {
        this.f265832t.clear();
    }

    @Override // com.rabbitmq.client.k
    public void R1(int i10, int i11, boolean z10) throws IOException {
        int iJ = com.rabbitmq.client.r.j(i11);
        if (iJ != i11) {
            f265826g3.b("Prefetch count must be between 0 and {}, value has been set to {} instead of {}", 65535, Integer.valueOf(iJ), Integer.valueOf(i11));
        }
        I(new k.b.l(i10, iJ, z10));
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: R2, reason: merged with bridge method [inline-methods] */
    public k.i.d b3(String str) throws IOException {
        k3(str);
        return (k.i.d) I(new com.rabbitmq.client.a.i.c.C1818a().m(str).k().g().b().d()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: T2, reason: merged with bridge method [inline-methods] */
    public k.i.f gc(String str) throws IOException {
        return lc(str, false, false);
    }

    @Override // com.rabbitmq.client.k
    public void Tc(com.rabbitmq.client.t tVar) {
        this.f265834w = tVar;
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: U2, reason: merged with bridge method [inline-methods] */
    public k.i.f lc(String str, boolean z10, boolean z11) throws IOException {
        k3(str);
        return (k.i.f) I(new com.rabbitmq.client.a.i.e.C1820a().h(str).e(z10).c(z11).a()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public void U4(String str, boolean z10) throws IOException {
        R0(new com.rabbitmq.client.impl.e(new com.rabbitmq.client.a.g.e.C1810a().b(str).d(z10).f(true).a()));
    }

    @Override // com.rabbitmq.client.k
    public String Ua(String str, boolean z10, String str2, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) throws IOException {
        return p3(str, z10, str2, false, false, null, O1(b0Var, jVar));
    }

    @Override // com.rabbitmq.client.k
    public boolean Ub(com.rabbitmq.client.b1 b1Var) {
        return this.f265831s.remove(b1Var);
    }

    @Override // com.rabbitmq.client.k
    public String V7(String str, boolean z10, String str2, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, str2, false, false, null, b2(b0Var, vVar));
    }

    @Override // com.rabbitmq.client.k
    public void W1(String str, String str2, boolean z10, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
        M5(str, str2, z10, false, cVar, bArr);
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: W2, reason: merged with bridge method [inline-methods] */
    public k.i.h gb(String str) throws IOException {
        k3(str);
        return (k.i.h) I(new com.rabbitmq.client.a.i.g.C1822a().d(str).a()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public String Wb(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, str2, z11, z12, map, b2(b0Var, vVar));
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: X2, reason: merged with bridge method [inline-methods] */
    public k.i.j bc(String str, String str2, String str3) throws IOException {
        return Zd(str, str2, str3, null);
    }

    @Override // com.rabbitmq.client.k
    public void Xb(String str, String str2, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        R0(new com.rabbitmq.client.impl.e(new com.rabbitmq.client.a.g.c.C1808a().g(str).o(str2).f(z10).c(z11).i(z12).a(map).m(false).k(true).d()));
    }

    @Override // com.rabbitmq.client.impl.d
    protected void Y() {
        synchronized (this.f265161d) {
            try {
                this.X.r(false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: Y2, reason: merged with bridge method [inline-methods] */
    public k.i.j Zd(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        k3(str);
        return (k.i.j) I(new com.rabbitmq.client.a.i.InterfaceC1824i.C1825a().d(str).c(str2).e(str3).a(map).b()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public void Z1(com.rabbitmq.client.o0 o0Var) throws IOException {
        Q0(o0Var);
    }

    @Override // com.rabbitmq.client.k
    public String Z9(String str, boolean z10, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) throws IOException {
        return A7(str, z10, "", T1(b0Var, jVar, vVar));
    }

    @Override // com.rabbitmq.client.k
    public void abort() throws IOException {
        r1(200, "OK");
    }

    @Override // com.rabbitmq.client.k
    public String ad(String str, boolean z10, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, "", false, false, map, b2(b0Var, vVar));
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public k.g.b R3(String str, String str2, String str3) throws IOException {
        return q9(str, str2, str3, null);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.h0 ca(String str, boolean z10) throws IOException {
        k3(str);
        com.rabbitmq.client.impl.e eVarI = I(new com.rabbitmq.client.a.b.g.C1765a().d(str).c(z10).a());
        y0 method = eVarI.getMethod();
        if (!(method instanceof k.b.i)) {
            if (method instanceof k.b.h) {
                return null;
            }
            throw new com.rabbitmq.client.k2(method);
        }
        k.b.i iVar = (k.b.i) method;
        com.rabbitmq.client.f0 f0Var = new com.rabbitmq.client.f0(iVar.i(), iVar.s(), iVar.f(), iVar.g());
        com.rabbitmq.client.a.c cVar = (com.rabbitmq.client.a.c) eVarI.a();
        byte[] bArrB = eVarI.b();
        int iK = iVar.k();
        this.f265830p1.k(this, iVar.i(), z10);
        return new com.rabbitmq.client.h0(f0Var, cVar, bArrB, iK);
    }

    @Override // com.rabbitmq.client.k, java.lang.AutoCloseable
    public void close() throws Throwable {
        close(200, "OK");
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public k.g.b q9(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        return (k.g.b) I(new com.rabbitmq.client.a.g.InterfaceC1805a.C1806a().c(str).g(str2).f(str3).a(map).b()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public String d3(String str, boolean z10, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, "", false, false, map, T1(b0Var, jVar, vVar));
    }

    @Override // com.rabbitmq.client.k
    public void d5(String str) throws IOException {
        com.rabbitmq.client.t tVar = this.f265828o.get(str);
        if (tVar == null) {
            throw new IOException("Unknown consumerTag");
        }
        com.rabbitmq.client.o0 c1836b = new k.b.C1836b(str, false);
        g gVar = new g(c1836b, str, tVar);
        O0(c1836b, gVar);
        try {
            int i10 = this.f265167j;
            if (i10 == 0) {
                gVar.d();
            } else {
                try {
                    gVar.e(i10);
                } catch (TimeoutException e10) {
                    throw b1(c1836b, e10);
                }
            }
            this.f265830p1.m(this, str);
        } catch (com.rabbitmq.client.l1 e11) {
            throw com.rabbitmq.client.impl.d.T0(e11);
        }
    }

    @Override // com.rabbitmq.client.k
    public void d6(String str, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        k3(str);
        R0(new com.rabbitmq.client.impl.e(new com.rabbitmq.client.a.i.c.C1818a().m(str).f(z10).h(z11).c(z12).a(map).l(false).j(true).d()));
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public k.g.d a2(String str, com.rabbitmq.client.i iVar) throws IOException {
        return c3(str, iVar.k());
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public k.j.b a8() throws IOException {
        return (k.j.b) I(new k.j.a()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.o e4(com.rabbitmq.client.n nVar, com.rabbitmq.client.n nVar2) {
        a aVar = new a(nVar, nVar2);
        Db(aVar);
        return aVar;
    }

    @Override // com.rabbitmq.client.k
    public String ec(String str, boolean z10, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) throws IOException {
        return p3(str, z10, "", false, false, map, O1(b0Var, jVar));
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: f2, reason: merged with bridge method [inline-methods] */
    public k.g.d P1(String str, com.rabbitmq.client.i iVar, boolean z10) throws IOException {
        return X7(str, iVar.k(), z10);
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public k.j.d id() throws IOException {
        return (k.j.d) I(new k.j.c()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public long gf(String str) throws IOException {
        return b3(str).k();
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public k.j.f ac() throws IOException {
        return (k.j.f) I(new k.j.e()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public CompletableFuture<com.rabbitmq.client.m> j6(com.rabbitmq.client.o0 o0Var) throws IOException {
        return H(o0Var);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.d k6() throws IOException {
        return L7("", false, true, true, null);
    }

    @Override // com.rabbitmq.client.k
    public String l4(String str, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) throws IOException {
        return o5(str, O1(b0Var, jVar));
    }

    @Override // com.rabbitmq.client.k
    public void le(String str, String str2, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
        W1(str, str2, false, cVar, bArr);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.b1 me(final com.rabbitmq.client.a1 a1Var) {
        com.rabbitmq.client.b1 b1Var = new com.rabbitmq.client.b1() { // from class: com.rabbitmq.client.impl.t
            @Override // com.rabbitmq.client.b1
            public final void a(int i10, String str, String str2, String str3, com.rabbitmq.client.a.c cVar, byte[] bArr) {
                a1Var.a(new com.rabbitmq.client.z0(i10, str, str2, str3, cVar, bArr));
            }
        };
        Be(b1Var);
        return b1Var;
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: n2, reason: merged with bridge method [inline-methods] */
    public k.g.d Cb(String str, com.rabbitmq.client.i iVar, boolean z10, boolean z11, Map<String, Object> map) throws IOException {
        return g9(str, iVar.k(), z10, z11, map);
    }

    @Override // com.rabbitmq.client.impl.d
    public boolean o0(com.rabbitmq.client.m mVar) throws IOException {
        com.rabbitmq.client.o0 method = mVar.getMethod();
        if (method instanceof k.c.a) {
            l1(mVar);
            return true;
        }
        if (!isOpen()) {
            return !(method instanceof k.c.b);
        }
        if (method instanceof k.b.f) {
            L2(mVar, (k.b.f) method);
            return true;
        }
        if (method instanceof k.b.r) {
            B1(mVar, (k.b.r) method);
            return true;
        }
        if (method instanceof k.c.C1838c) {
            k.c.C1838c c1838c = (k.c.C1838c) method;
            synchronized (this.f265161d) {
                try {
                    this.f265166i = !c1838c.l();
                    Q0(new k.c.d(!this.f265166i));
                    this.f265161d.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        if (method instanceof k.b.a) {
            k.b.a aVar = (k.b.a) method;
            u1(mVar, aVar);
            G2(aVar.i(), aVar.w(), false);
            return true;
        }
        if (method instanceof k.b.j) {
            k.b.j jVar = (k.b.j) method;
            w1(mVar, jVar);
            G2(jVar.i(), jVar.w(), true);
            return true;
        }
        if (method instanceof k.b.p) {
            for (Map.Entry entry : com.rabbitmq.utility.e.b(this.f265828o).entrySet()) {
                this.X.m((com.rabbitmq.client.t) entry.getValue(), (String) entry.getKey());
            }
            return false;
        }
        if (!(method instanceof k.b.C1836b)) {
            return false;
        }
        String strH = ((k.b.C1836b) method).h();
        com.rabbitmq.client.t tVarRemove = this.f265828o.remove(strH);
        if (tVarRemove == null) {
            tVarRemove = this.f265834w;
        }
        com.rabbitmq.client.t tVar = tVarRemove;
        if (tVar != null) {
            try {
                this.X.i(tVar, strH);
            } catch (q2 e10) {
                throw e10;
            } catch (Throwable th3) {
                N().getExceptionHandler().h(this, th3, tVar, strH, "handleCancel");
            }
        } else {
            f265826g3.w("Could not cancel consumer with unknown tag {}", strH);
        }
        return true;
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public k.b.p L4() throws IOException {
        return Fc(true);
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: o2, reason: merged with bridge method [inline-methods] */
    public k.g.d m9(String str, com.rabbitmq.client.i iVar, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        return fc(str, iVar.k(), z10, z11, z12, map);
    }

    @Override // com.rabbitmq.client.k
    public String o5(String str, com.rabbitmq.client.t tVar) throws IOException {
        return we(str, false, tVar);
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public k.b.p Fc(boolean z10) throws IOException {
        return (k.b.p) I(new k.b.n(z10)).getMethod();
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: p2, reason: merged with bridge method [inline-methods] */
    public k.g.d c3(String str, String str2) throws IOException {
        return g9(str, str2, false, false, null);
    }

    @Override // com.rabbitmq.client.k
    public String p3(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, com.rabbitmq.client.t tVar) throws IOException {
        com.rabbitmq.client.o0 o0VarB = new com.rabbitmq.client.a.b.d.C1762a().l(str).c(str2).i(z11).g(z10).e(z12).a(map).b();
        c cVar = new c(o0VarB, tVar, z10);
        O0(o0VarB, cVar);
        try {
            int i10 = this.f265167j;
            if (i10 == 0) {
                return cVar.d();
            }
            try {
                return cVar.e(i10);
            } catch (TimeoutException e10) {
                throw b1(o0VarB, e10);
            }
        } catch (com.rabbitmq.client.l1 e11) {
            throw com.rabbitmq.client.impl.d.T0(e11);
        }
    }

    @Override // com.rabbitmq.client.k
    public String pc(String str, boolean z10, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) throws IOException {
        return A7(str, z10, "", b2(b0Var, vVar));
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: q2, reason: merged with bridge method [inline-methods] */
    public k.g.d X7(String str, String str2, boolean z10) throws IOException {
        return g9(str, str2, z10, false, null);
    }

    public void q3(long j10, boolean z10, boolean z11) throws IOException {
        Q0(new k.b.j(j10, z10, z11));
        this.f265830p1.f(this, j10);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.t q4() {
        return this.f265834w;
    }

    @Override // com.rabbitmq.client.k
    public boolean qb(com.rabbitmq.client.o oVar) {
        return this.f265832t.remove(oVar);
    }

    @Override // com.rabbitmq.client.impl.d
    public void r0(com.rabbitmq.client.l1 l1Var, boolean z10, boolean z11) {
        a3(l1Var, z10, z11);
        D2();
    }

    @Override // com.rabbitmq.client.k
    public void r1(int i10, String str) throws IOException {
        try {
            E1(i10, str, true, null, true);
        } catch (IOException | TimeoutException unused) {
        }
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: s2, reason: merged with bridge method [inline-methods] */
    public k.g.d g9(String str, String str2, boolean z10, boolean z11, Map<String, Object> map) throws IOException {
        return fc(str, str2, z10, z11, false, map);
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: t2, reason: merged with bridge method [inline-methods] */
    public k.g.d fc(String str, String str2, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        return (k.g.d) I(new com.rabbitmq.client.a.g.c.C1808a().g(str).o(str2).f(z10).c(z11).i(z12).a(map).d()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public String t6(String str, boolean z10, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) throws IOException {
        return A7(str, z10, "", O1(b0Var, jVar));
    }

    @Override // com.rabbitmq.client.k
    public String t8(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) throws IOException {
        return p3(str, z10, str2, z11, z12, map, O1(b0Var, jVar));
    }

    @Override // com.rabbitmq.client.k
    public void tc(long j10) throws InterruptedException, TimeoutException, IOException {
        u uVar;
        try {
            if (C2(j10)) {
                return;
            }
            uVar = this;
            try {
                uVar.E1(200, "NACKS RECEIVED", true, null, false);
                throw new IOException("nacks received");
            } catch (TimeoutException e10) {
                e = e10;
                TimeoutException timeoutException = e;
                uVar.close(com.rabbitmq.client.a.f264843n, "TIMEOUT WAITING FOR ACK");
                throw timeoutException;
            }
        } catch (TimeoutException e11) {
            e = e11;
            uVar = this;
        }
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: u2, reason: merged with bridge method [inline-methods] */
    public k.g.d A4(String str) throws IOException {
        return (k.g.d) I(new com.rabbitmq.client.a.g.c.C1808a().g(str).o("").l().d()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public long vd() {
        return this.f265833v;
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: w2, reason: merged with bridge method [inline-methods] */
    public k.g.f ve(String str) throws IOException {
        return Le(str, false);
    }

    @Override // com.rabbitmq.client.k
    public String we(String str, boolean z10, com.rabbitmq.client.t tVar) throws IOException {
        return A7(str, z10, "", tVar);
    }

    @Override // com.rabbitmq.client.k
    public String xe(String str, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) throws IOException {
        return o5(str, b2(b0Var, vVar));
    }

    @Override // com.rabbitmq.client.impl.d
    public void y(com.rabbitmq.client.impl.d.b bVar) {
        synchronized (this.f265161d) {
            super.y(bVar);
            this.X.r(true);
        }
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: y2, reason: merged with bridge method [inline-methods] */
    public k.g.f Le(String str, boolean z10) throws IOException {
        return (k.g.f) I(new com.rabbitmq.client.a.g.e.C1810a().b(str).d(z10).a()).getMethod();
    }

    @Override // com.rabbitmq.client.k
    public String yc(String str, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) throws IOException {
        return o5(str, T1(b0Var, jVar, vVar));
    }

    @Override // com.rabbitmq.client.k
    /* JADX INFO: renamed from: z2, reason: merged with bridge method [inline-methods] */
    public k.g.h De(String str, String str2, String str3) throws IOException {
        return qc(str, str2, str3, null);
    }

    public void z6(long j10, boolean z10) throws IOException {
        Q0(new k.b.a(j10, z10));
        this.f265830p1.b(this, j10, z10);
    }

    @Override // com.rabbitmq.client.k
    public void zb(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        k3(str);
        R0(new com.rabbitmq.client.impl.e(new com.rabbitmq.client.a.i.InterfaceC1815a.C1816a().f(str).c(str2).g(str3).a(map).e(true).b()));
    }

    public u(i iVar, int i10, a0 a0Var, com.rabbitmq.client.p0 p0Var) {
        super(iVar, i10);
        this.f265828o = Collections.synchronizedMap(new HashMap());
        this.f265831s = new CopyOnWriteArrayList();
        this.f265832t = new CopyOnWriteArrayList();
        this.f265833v = 0L;
        this.f265834w = null;
        this.Y = null;
        this.Z = Collections.synchronizedSortedSet(new TreeSet());
        this.f265829p0 = true;
        this.X = new z(iVar, this, a0Var);
        this.f265830p1 = p0Var;
    }

    @Override // com.rabbitmq.client.k
    public void close(int i10, String str) throws Throwable {
        E1(i10, str, true, null, false);
    }
}
