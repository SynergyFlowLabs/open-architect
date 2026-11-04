package com.rabbitmq.client.impl.recovery;

import com.rabbitmq.client.f2;
import com.rabbitmq.client.i2;
import com.rabbitmq.client.impl.d1;
import com.rabbitmq.client.j1;
import com.rabbitmq.client.l1;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes13.dex */
public class m implements com.rabbitmq.client.w0, d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f265734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, c> f265735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.rabbitmq.client.impl.y f265736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile a0 f265737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<j1> f265738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<com.rabbitmq.client.y0> f265739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<com.rabbitmq.client.h> f265740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, y> f265741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<s> f265742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, v> f265743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, t> f265744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<o> f265745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<r> f265746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i0 f265747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f265748o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f265749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Predicate<l1> f265750t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final g0 f265751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Predicate<l1> f265733w = new Predicate() { // from class: com.rabbitmq.client.impl.recovery.e
        @Override // java.util.function.Predicate
        public final boolean test(Object obj) {
            return m.H((l1) obj);
        }
    };
    private static final org.slf4j.c X = org.slf4j.e.k(m.class);

    class a implements i0 {
        a() {
        }
    }

    class b implements com.rabbitmq.client.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.g f265753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2 f265754b;

        b(com.rabbitmq.client.g gVar, i2 i2Var) {
            this.f265753a = gVar;
            this.f265754b = i2Var;
        }

        @Override // com.rabbitmq.client.h
        public void a() throws IOException {
            this.f265754b.a();
        }

        @Override // com.rabbitmq.client.h
        public void b(String str) throws IOException {
            this.f265753a.a(str);
        }
    }

    public m(com.rabbitmq.client.impl.y yVar, com.rabbitmq.client.impl.u0 u0Var, List<com.rabbitmq.client.b> list) {
        this(yVar, u0Var, new com.rabbitmq.client.j0(list));
    }

    private a0 B1() throws InterruptedException {
        int i10 = 0;
        while (!this.f265748o) {
            i10++;
            try {
                a0 a0VarC = this.f265734a.c();
                synchronized (this.f265749s) {
                    try {
                        if (!this.f265748o) {
                            return a0VarC;
                        }
                        a0VarC.abort();
                        return null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                Thread.sleep(this.f265736c.m().b(i10));
                getExceptionHandler().c(this, e10);
            }
        }
        return null;
    }

    public static /* synthetic */ void E(Lock lock, ThreadFactory threadFactory, final com.rabbitmq.client.p pVar, final IOException iOException) throws IOException {
        if (!lock.tryLock()) {
            throw iOException;
        }
        try {
            Thread threadNewThread = threadFactory.newThread(new Runnable() { // from class: com.rabbitmq.client.impl.recovery.k
                @Override // java.lang.Runnable
                public final void run() {
                    ((com.rabbitmq.client.impl.i) pVar).b1(iOException);
                }
            });
            threadNewThread.setName("RabbitMQ Error On Write Thread");
            threadNewThread.start();
            lock.unlock();
            throw iOException;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public static /* synthetic */ boolean H(l1 l1Var) {
        if (l1Var.e() && !(l1Var.getCause() instanceof com.rabbitmq.client.q0)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object I(y yVar) throws IOException {
        yVar.k();
        return null;
    }

    private void J1(ExecutorService executorService, Collection<? extends u> collection) throws InterruptedException {
        for (Future future : executorService.invokeAll(y0(collection))) {
            if (future.isDone()) {
                try {
                    future.get(1L, TimeUnit.MILLISECONDS);
                } catch (Exception e10) {
                    X.p("Recovery task is done but returned an exception", e10);
                }
            } else {
                X.w("Recovery task should be done {}", future);
            }
        }
    }

    private void N(final a0 a0Var) {
        e0 e0Var = new e0() { // from class: com.rabbitmq.client.impl.recovery.d
            @Override // com.rabbitmq.client.impl.recovery.e0
            public final void a(l1 l1Var) {
                m.y(this.f265713a, this, a0Var, l1Var);
            }
        };
        synchronized (this) {
            try {
                a0Var.T(e0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private i0 O0() {
        return new a();
    }

    private void O1(final v vVar, boolean z10) {
        try {
            if (this.f265747n.a(vVar)) {
                if (z10) {
                    vVar = (v) t2(vVar, new Callable() { // from class: com.rabbitmq.client.impl.recovery.i
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return m.t(vVar);
                        }
                    }).a();
                } else {
                    vVar.h();
                }
                X.D("{} has recovered", vVar);
            }
        } catch (Exception e10) {
            getExceptionHandler().b(this.f265737d, vVar.b(), new f2("Caught an exception while recovering exchange " + vVar.c() + ": " + e10.getMessage(), e10));
        }
    }

    private void T0() {
        Iterator it = com.rabbitmq.utility.e.a(this.f265739f).iterator();
        while (it.hasNext()) {
            ((com.rabbitmq.client.y0) it.next()).b(this);
        }
    }

    private void U0() {
        Iterator it = com.rabbitmq.utility.e.a(this.f265739f).iterator();
        while (it.hasNext()) {
            ((com.rabbitmq.client.y0) it.next()).a(this);
        }
    }

    private synchronized void X() throws InterruptedException {
        try {
            wait(this.f265736c.m().b(0));
            U0();
            a0 a0VarB1 = B1();
            if (a0VarB1 == null) {
                return;
            }
            X.D("Connection {} has recovered", a0VarB1);
            N(a0VarB1);
            b2(a0VarB1);
            s1(a0VarB1);
            w1(a0VarB1);
            this.f265737d = a0VarB1;
            if (this.f265736c.A()) {
                c2(this.f265736c.u());
            }
            T0();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void b1(String str, String str2) {
        for (s sVar : com.rabbitmq.utility.e.a(this.f265742i)) {
            if (sVar.f().equals(str)) {
                sVar.k(str2);
            }
        }
    }

    private void b2(a0 a0Var) {
        Iterator it = com.rabbitmq.utility.e.a(this.f265738e).iterator();
        while (it.hasNext()) {
            a0Var.h((j1) it.next());
        }
    }

    private void c2(ExecutorService executorService) throws IOException {
        if (executorService != null) {
            try {
                J1(executorService, com.rabbitmq.utility.e.b(this.f265743j).values());
                J1(executorService, com.rabbitmq.utility.e.b(this.f265741h).values());
                J1(executorService, com.rabbitmq.utility.e.a(this.f265742i));
                J1(executorService, com.rabbitmq.utility.e.b(this.f265744k).values());
                return;
            } catch (Exception e10) {
                getExceptionHandler().b(this.f265737d, null, new f2("Caught an exception while recovering topology: " + e10.getMessage(), e10));
                return;
            }
        }
        Iterator it = com.rabbitmq.utility.e.b(this.f265743j).values().iterator();
        while (it.hasNext()) {
            O1((v) it.next(), true);
        }
        for (Map.Entry entry : com.rabbitmq.utility.e.b(this.f265741h).entrySet()) {
            T1((String) entry.getKey(), (y) entry.getValue(), true);
        }
        Iterator it2 = com.rabbitmq.utility.e.a(this.f265742i).iterator();
        while (it2.hasNext()) {
            p1((s) it2.next(), true);
        }
        for (Map.Entry entry2 : com.rabbitmq.utility.e.b(this.f265744k).entrySet()) {
            E1((String) entry2.getKey(), (t) entry2.getValue(), true);
        }
    }

    private void d1(String str, String str2) {
        for (t tVar : com.rabbitmq.utility.e.b(this.f265744k).values()) {
            if (tVar.i().equals(str)) {
                tVar.k(str2);
            }
        }
    }

    public static /* synthetic */ Object o(s sVar) throws IOException {
        sVar.i();
        return null;
    }

    private void o2() {
        final ThreadFactory threadFactoryT = this.f265736c.t();
        final ReentrantLock reentrantLock = new ReentrantLock();
        this.f265736c.I(new com.rabbitmq.client.impl.p0() { // from class: com.rabbitmq.client.impl.recovery.g
            @Override // com.rabbitmq.client.impl.p0
            public final void a(com.rabbitmq.client.p pVar, IOException iOException) throws IOException {
                m.E(reentrantLock, threadFactoryT, pVar, iOException);
            }
        });
    }

    private void p1(final s sVar, boolean z10) {
        try {
            if (this.f265747n.d(sVar)) {
                if (z10) {
                    sVar = (s) t2(sVar, new Callable() { // from class: com.rabbitmq.client.impl.recovery.j
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return m.o(sVar);
                        }
                    }).a();
                } else {
                    sVar.i();
                }
                X.D("{} has recovered", sVar);
            }
        } catch (Exception e10) {
            getExceptionHandler().b(this.f265737d, sVar.b(), new f2("Caught an exception while recovering binding between " + sVar.h() + " and " + sVar.f() + ": " + e10.getMessage(), e10));
        }
    }

    public static /* synthetic */ void r(m mVar, List list) throws IOException {
        mVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (uVar instanceof v) {
                mVar.O1((v) uVar, true);
            } else if (uVar instanceof y) {
                y yVar = (y) uVar;
                mVar.T1(yVar.c(), yVar, true);
            } else if (uVar instanceof s) {
                mVar.p1((s) uVar, true);
            } else if (uVar instanceof t) {
                t tVar = (t) uVar;
                mVar.E1(tVar.h(), tVar, true);
            }
        }
    }

    private void s1(a0 a0Var) {
        Iterator it = com.rabbitmq.utility.e.a(this.f265740g).iterator();
        while (it.hasNext()) {
            a0Var.Te((com.rabbitmq.client.h) it.next());
        }
    }

    private com.rabbitmq.client.k s2(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        c cVar = new c(this, d0Var);
        d2(cVar);
        return cVar;
    }

    public static /* synthetic */ Object t(v vVar) throws IOException {
        vVar.h();
        return null;
    }

    private <T> h0 t2(u uVar, Callable<T> callable) throws Exception {
        if (this.f265751v == null) {
            return new h0(uVar, callable.call());
        }
        try {
            return new h0(uVar, callable.call());
        } catch (Exception e10) {
            f0 f0Var = new f0(uVar, e10, this);
            if (uVar instanceof y) {
                return this.f265751v.a(f0Var);
            }
            if (uVar instanceof v) {
                return this.f265751v.d(f0Var);
            }
            if (uVar instanceof s) {
                return this.f265751v.c(f0Var);
            }
            if (uVar instanceof t) {
                return this.f265751v.b(f0Var);
            }
            throw new IllegalArgumentException("Unknown type of recorded entity: " + uVar);
        }
    }

    private void w1(a0 a0Var) {
        for (c cVar : this.f265735b.values()) {
            try {
                cVar.c(this, a0Var);
                X.D("Channel {} has recovered", cVar);
            } catch (Throwable th2) {
                a0Var.getExceptionHandler().g(cVar, th2);
            }
        }
    }

    public static /* synthetic */ void y(m mVar, m mVar2, a0 a0Var, l1 l1Var) {
        mVar.getClass();
        try {
            if (mVar.p2(l1Var)) {
                mVar2.X();
            }
        } catch (Exception e10) {
            a0Var.getExceptionHandler().c(mVar2, e10);
        }
    }

    private <E extends u> List<Callable<Object>> y0(Collection<E> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (E e10 : collection) {
            c cVarA = e10.a();
            List arrayList = (List) linkedHashMap.get(cVarA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVarA, arrayList);
            }
            arrayList.add(e10);
        }
        ArrayList arrayList2 = new ArrayList();
        for (final List list : linkedHashMap.values()) {
            arrayList2.add(Executors.callable(new Runnable() { // from class: com.rabbitmq.client.impl.recovery.l
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    m.r(this.f265731a, list);
                }
            }));
        }
        return arrayList2;
    }

    @Override // com.rabbitmq.client.p
    public com.rabbitmq.client.k Ae(int i10) throws IOException {
        return this.f265737d.Ae(i10);
    }

    boolean B0(Collection<t> collection, String str) {
        Iterator<t> it = collection.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().i())) {
                return true;
            }
        }
        return false;
    }

    public void E1(String str, final t tVar, boolean z10) throws IOException {
        t tVar2;
        Exception e10;
        String strJ;
        try {
            if (this.f265747n.c(tVar)) {
                X.D("Recovering {}", tVar);
                if (z10) {
                    h0 h0VarT2 = t2(tVar, new Callable() { // from class: com.rabbitmq.client.impl.recovery.f
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return tVar.j();
                        }
                    });
                    tVar2 = (t) h0VarT2.a();
                    try {
                        strJ = (String) h0VarT2.b();
                    } catch (Exception e11) {
                        e10 = e11;
                        getExceptionHandler().b(this.f265737d, tVar2.b(), new f2("Caught an exception while recovering consumer " + str + ": " + e10.getMessage(), e10));
                        return;
                    }
                } else {
                    tVar2 = tVar;
                    strJ = tVar.j();
                }
                if (str != null && !str.equals(strJ)) {
                    synchronized (this.f265744k) {
                        this.f265744k.remove(str);
                        this.f265744k.put(strJ, tVar2);
                    }
                    tVar2.a().H0(str, strJ);
                }
                Iterator it = com.rabbitmq.utility.e.a(this.f265745l).iterator();
                while (it.hasNext()) {
                    ((o) it.next()).a(str, strJ);
                }
                X.D("{} has recovered", tVar2);
            }
        } catch (Exception e12) {
            tVar2 = tVar;
            e10 = e12;
        }
    }

    @Override // com.rabbitmq.client.p
    public com.rabbitmq.client.h E7(com.rabbitmq.client.g gVar, i2 i2Var) {
        b bVar = new b(gVar, i2Var);
        Te(bVar);
        return bVar;
    }

    boolean H0(List<s> list, String str) {
        Iterator<s> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().h())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.rabbitmq.client.p
    public void Kb(String str) {
        this.f265737d.Kb(str);
    }

    public void M0() throws TimeoutException, IOException {
        this.f265737d = this.f265734a.c();
        N(this.f265737d);
    }

    @Override // com.rabbitmq.client.p
    public boolean M9(com.rabbitmq.client.h hVar) {
        this.f265740g.remove(hVar);
        return this.f265737d.M9(hVar);
    }

    @Override // com.rabbitmq.client.p
    public int O() {
        return this.f265737d.O();
    }

    void Q0(String str) {
        v vVar;
        synchronized (this.f265744k) {
            try {
                synchronized (this.f265743j) {
                    try {
                        if (!H0(com.rabbitmq.utility.e.a(this.f265742i), str) && (vVar = this.f265743j.get(str)) != null && vVar.g()) {
                            d0(str);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void R(o oVar) {
        this.f265745l.add(oVar);
    }

    void R0(String str) {
        y yVar;
        synchronized (this.f265744k) {
            synchronized (this.f265741h) {
                try {
                    if (!B0(this.f265744k.values(), str) && (yVar = this.f265741h.get(str)) != null && yVar.i()) {
                        g0(str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.rabbitmq.client.p
    public Map<String, Object> S0() {
        return this.f265737d.S0();
    }

    public void T(r rVar) {
        this.f265746m.add(rVar);
    }

    public void T1(String str, final y yVar, boolean z10) {
        try {
            if (this.f265747n.b(yVar)) {
                X.D("Recovering {}", yVar);
                if (z10) {
                    yVar = (y) t2(yVar, new Callable() { // from class: com.rabbitmq.client.impl.recovery.h
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return m.I(yVar);
                        }
                    }).a();
                } else {
                    yVar.k();
                }
                String strC = yVar.c();
                if (!str.equals(strC)) {
                    synchronized (this.f265741h) {
                        try {
                            b1(str, strC);
                            d1(str, strC);
                            if (yVar.j()) {
                                g0(str);
                            }
                            this.f265741h.put(strC, yVar);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                Iterator it = com.rabbitmq.utility.e.a(this.f265746m).iterator();
                while (it.hasNext()) {
                    ((r) it.next()).a(str, strC);
                }
                X.D("{} has recovered", yVar);
            }
        } catch (Exception e10) {
            getExceptionHandler().b(this.f265737d, yVar.b(), new f2("Caught an exception while recovering queue " + str + ": " + e10.getMessage(), e10));
        }
    }

    @Override // com.rabbitmq.client.p
    public void Te(com.rabbitmq.client.h hVar) {
        this.f265740g.add(hVar);
        this.f265737d.Te(hVar);
    }

    @Override // com.rabbitmq.client.p
    public int U() {
        return this.f265737d.U();
    }

    @Override // com.rabbitmq.client.p
    public void Ud(int i10, String str, int i11) throws IOException {
        synchronized (this.f265749s) {
            this.f265748o = true;
        }
        this.f265737d.Ud(i10, str, i11);
    }

    @Override // com.rabbitmq.client.p
    public Map<String, Object> X0() {
        return this.f265737d.X0();
    }

    t Y(String str) {
        return this.f265744k.remove(str);
    }

    @Override // com.rabbitmq.client.p
    public void abort() {
        synchronized (this.f265749s) {
            this.f265748o = true;
        }
        this.f265737d.abort();
    }

    @Override // com.rabbitmq.client.p, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f265749s) {
            this.f265748o = true;
        }
        this.f265737d.close();
    }

    @Override // com.rabbitmq.client.u0
    public void d(com.rabbitmq.client.y0 y0Var) {
        this.f265739f.remove(y0Var);
    }

    void d0(String str) {
        this.f265743j.remove(str);
        Iterator<s> it = e2(str).iterator();
        while (it.hasNext()) {
            Q0(it.next().h());
        }
    }

    void d2(c cVar) {
        this.f265735b.put(Integer.valueOf(cVar.V8()), cVar);
    }

    @Override // com.rabbitmq.client.p
    public void de(int i10) {
        synchronized (this.f265749s) {
            try {
                this.f265748o = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f265737d.de(i10);
    }

    void e1(String str, t tVar) {
        this.f265744k.put(str, tVar);
    }

    Set<s> e2(String str) {
        HashSet hashSet = new HashSet();
        synchronized (this.f265742i) {
            try {
                Iterator<s> it = this.f265742i.iterator();
                while (it.hasNext()) {
                    s next = it.next();
                    if (next.f().equals(str)) {
                        it.remove();
                        hashSet.add(next);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet;
    }

    @Override // com.rabbitmq.client.p
    public String ee() {
        return this.f265737d.ee();
    }

    boolean f0(c cVar, String str, String str2, String str3, Map<String, Object> map) {
        return this.f265742i.remove(new w(cVar).l(str2).d(str).j(str3).c(map));
    }

    public void f2(o oVar) {
        this.f265745l.remove(oVar);
    }

    @Override // com.rabbitmq.client.k1
    public l1 g() {
        return this.f265737d.g();
    }

    void g0(String str) {
        this.f265741h.remove(str);
        Iterator<s> it = e2(str).iterator();
        while (it.hasNext()) {
            Q0(it.next().h());
        }
    }

    void g1(String str, v vVar) {
        this.f265743j.put(str, vVar);
    }

    @Override // com.rabbitmq.client.p
    public com.rabbitmq.client.g0 getExceptionHandler() {
        return this.f265737d.getExceptionHandler();
    }

    @Override // com.rabbitmq.client.p
    public String getId() {
        return this.f265737d.getId();
    }

    @Override // com.rabbitmq.client.impl.d1
    public InetAddress getLocalAddress() {
        return this.f265737d.getLocalAddress();
    }

    @Override // com.rabbitmq.client.impl.d1
    public int getLocalPort() {
        return this.f265737d.getLocalPort();
    }

    @Override // com.rabbitmq.client.p, com.rabbitmq.client.impl.d1
    public int getPort() {
        return this.f265737d.getPort();
    }

    @Override // com.rabbitmq.client.k1
    public void h(j1 j1Var) {
        this.f265738e.add(j1Var);
        this.f265737d.h(j1Var);
    }

    void h1(c cVar, String str, String str2, String str3, Map<String, Object> map) {
        s sVarC = new w(cVar).l(str2).d(str).j(str3).c(map);
        this.f265742i.remove(sVarC);
        this.f265742i.add(sVarC);
    }

    @Override // com.rabbitmq.client.k1
    public boolean isOpen() {
        return this.f265737d.isOpen();
    }

    @Override // com.rabbitmq.client.k1
    public void j(j1 j1Var) {
        this.f265738e.remove(j1Var);
        this.f265737d.j(j1Var);
    }

    boolean j0(c cVar, String str, String str2, String str3, Map<String, Object> map) {
        return this.f265742i.remove(new z(cVar).l(str2).d(str).j(str3).c(map));
    }

    void j1(com.rabbitmq.client.a.i.d dVar, y yVar) {
        this.f265741h.put(dVar.e(), yVar);
    }

    @Override // com.rabbitmq.client.p
    public com.rabbitmq.client.k jd() throws IOException {
        d0 d0Var = (d0) this.f265737d.jd();
        if (d0Var == null) {
            return null;
        }
        return s2(d0Var);
    }

    public void k0(String str, boolean z10) {
        if (!z10) {
            g0(str);
            return;
        }
        synchronized (this.f265744k) {
            try {
                synchronized (this.f265741h) {
                    try {
                        if (!B0(this.f265744k.values(), str)) {
                            g0(str);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.rabbitmq.client.k1
    public void l() {
        this.f265737d.l();
    }

    void l1(String str, y yVar) {
        this.f265741h.put(str, yVar);
    }

    @Override // com.rabbitmq.client.p
    public void l5(int i10, String str, int i11) {
        synchronized (this.f265749s) {
            this.f265748o = true;
        }
        this.f265737d.l5(i10, str, i11);
    }

    @Override // com.rabbitmq.client.u0
    public void m(com.rabbitmq.client.y0 y0Var) {
        this.f265739f.add(y0Var);
    }

    @Override // com.rabbitmq.client.p
    public int m0() {
        return this.f265737d.m0();
    }

    public void n2(r rVar) {
        this.f265746m.remove(rVar);
    }

    @Override // com.rabbitmq.client.p
    public void nd() {
        this.f265740g.clear();
        this.f265737d.nd();
    }

    public com.rabbitmq.client.impl.i o0() {
        return this.f265737d;
    }

    void o1(c cVar, String str, String str2, String str3, Map<String, Object> map) {
        s sVarC = new z(cVar).l(str2).d(str).j(str3).c(map);
        this.f265742i.remove(sVarC);
        this.f265742i.add(sVarC);
    }

    protected boolean p2(l1 l1Var) {
        return this.f265750t.test(l1Var);
    }

    void q2(c cVar) {
        this.f265735b.remove(Integer.valueOf(cVar.V8()));
    }

    public List<s> r0() {
        return this.f265742i;
    }

    @Override // com.rabbitmq.client.p
    public void r1(int i10, String str) {
        synchronized (this.f265749s) {
            this.f265748o = true;
        }
        this.f265737d.r1(i10, str);
    }

    public String toString() {
        return this.f265737d.toString();
    }

    void u1(c cVar) throws IOException {
        cVar.c(this, this.f265737d);
    }

    @Override // com.rabbitmq.client.p, com.rabbitmq.client.impl.d1
    public InetAddress v1() {
        return this.f265737d.v1();
    }

    public Map<String, v> w0() {
        return this.f265743j;
    }

    public Map<String, y> x0() {
        return this.f265741h;
    }

    @Override // com.rabbitmq.client.p
    public void x1(int i10) throws IOException {
        synchronized (this.f265749s) {
            try {
                this.f265748o = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f265737d.x1(i10);
    }

    public m(com.rabbitmq.client.impl.y yVar, com.rabbitmq.client.impl.u0 u0Var, com.rabbitmq.client.c cVar) {
        this(yVar, u0Var, cVar, new com.rabbitmq.client.r0());
    }

    public m(com.rabbitmq.client.impl.y yVar, com.rabbitmq.client.impl.u0 u0Var, com.rabbitmq.client.c cVar, com.rabbitmq.client.p0 p0Var) {
        this.f265738e = Collections.synchronizedList(new ArrayList());
        this.f265739f = Collections.synchronizedList(new ArrayList());
        this.f265740g = Collections.synchronizedList(new ArrayList());
        this.f265741h = Collections.synchronizedMap(new LinkedHashMap());
        this.f265742i = Collections.synchronizedList(new ArrayList());
        this.f265743j = Collections.synchronizedMap(new LinkedHashMap());
        this.f265744k = Collections.synchronizedMap(new LinkedHashMap());
        this.f265745l = Collections.synchronizedList(new ArrayList());
        this.f265746m = Collections.synchronizedList(new ArrayList());
        this.f265748o = false;
        this.f265749s = new Object();
        this.f265734a = new b0(yVar, u0Var, cVar, p0Var);
        this.f265736c = yVar;
        this.f265750t = yVar.d() == null ? f265733w : yVar.d();
        o2();
        this.f265735b = new ConcurrentHashMap();
        this.f265747n = yVar.v() == null ? O0() : yVar.v();
        this.f265751v = yVar.w();
    }

    @Override // com.rabbitmq.client.p
    public void close(int i10, String str) throws IOException {
        synchronized (this.f265749s) {
            this.f265748o = true;
        }
        this.f265737d.close(i10, str);
    }
}
