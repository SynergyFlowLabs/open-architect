package com.rabbitmq.client.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final org.slf4j.c f265801k = org.slf4j.e.k(s.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f265802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, u> f265803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.rabbitmq.utility.c f265804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f265805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<CountDownLatch> f265806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f265807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ExecutorService f265808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ThreadFactory f265809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f265810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final com.rabbitmq.client.p0 f265811j;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f265812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.l1 f265813b;

        a(u uVar, com.rabbitmq.client.l1 l1Var) {
            this.f265812a = uVar;
            this.f265813b = l1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f265812a.r0(this.f265813b, true, true);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f265815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f265816b;

        b(Set set, a0 a0Var) {
            this.f265815a = set;
            this.f265816b = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (CountDownLatch countDownLatch : this.f265815a) {
                try {
                    int iD = this.f265816b.d();
                    if (iD == 0) {
                        countDownLatch.await();
                    } else if (!countDownLatch.await(iD, TimeUnit.MILLISECONDS)) {
                        s.f265801k.w("Consumer dispatcher for channel didn't shutdown after waiting for {} ms", Integer.valueOf(iD));
                    }
                } catch (Throwable unused) {
                }
            }
            this.f265816b.g();
        }
    }

    public s(a0 a0Var, int i10) {
        this(a0Var, i10, Executors.defaultThreadFactory());
    }

    private u b(i iVar, int i10) {
        if (this.f265803b.containsKey(Integer.valueOf(i10))) {
            throw new IllegalStateException("We have attempted to create a channel with a number that is already in use. This should never happen. Please report this as a bug.");
        }
        u uVarI = i(iVar, i10, this.f265805d);
        this.f265803b.put(Integer.valueOf(uVarI.V8()), uVarI);
        return uVarI;
    }

    private void k() {
        b bVar = new b(new HashSet(this.f265806e), this.f265805d);
        ExecutorService executorService = this.f265808g;
        if (executorService != null) {
            executorService.execute(bVar);
        } else {
            o0.c(this.f265809h, bVar, "ConsumerWorkService shutdown monitor", true).start();
        }
    }

    public u c(i iVar) throws IOException {
        synchronized (this.f265802a) {
            try {
                int iA = this.f265804c.a();
                if (iA == -1) {
                    return null;
                }
                u uVarB = b(iVar, iA);
                uVarB.J2();
                return uVarB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u d(i iVar, int i10) throws IOException {
        synchronized (this.f265802a) {
            if (!this.f265804c.c(i10)) {
                return null;
            }
            u uVarB = b(iVar, i10);
            uVarB.J2();
            return uVarB;
        }
    }

    public u e(int i10) {
        u uVar;
        synchronized (this.f265802a) {
            try {
                uVar = this.f265803b.get(Integer.valueOf(i10));
                if (uVar == null) {
                    throw new h2(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public int f() {
        return this.f265807f;
    }

    public ExecutorService g() {
        return this.f265808g;
    }

    public void h(com.rabbitmq.client.l1 l1Var) {
        HashSet<u> hashSet;
        synchronized (this.f265802a) {
            try {
                hashSet = new HashSet(this.f265803b.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (u uVar : hashSet) {
            j(uVar);
            a aVar = new a(uVar, l1Var);
            ExecutorService executorService = this.f265808g;
            if (executorService == null) {
                aVar.run();
            } else {
                Future<?> futureSubmit = executorService.submit(aVar);
                try {
                    futureSubmit.get(this.f265810i, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                    f265801k.m("Couldn't properly close channel {} on shutdown after waiting for {} ms", Integer.valueOf(uVar.V8()), Integer.valueOf(this.f265810i));
                    futureSubmit.cancel(true);
                }
            }
            this.f265806e.add(uVar.E2());
            uVar.l();
        }
        k();
    }

    protected u i(i iVar, int i10, a0 a0Var) {
        return new u(iVar, i10, a0Var, this.f265811j);
    }

    public void j(u uVar) {
        synchronized (this.f265802a) {
            try {
                int iV8 = uVar.V8();
                u uVarRemove = this.f265803b.remove(Integer.valueOf(iV8));
                if (uVarRemove == null) {
                    return;
                }
                if (uVarRemove != uVar) {
                    this.f265803b.put(Integer.valueOf(iV8), uVarRemove);
                } else {
                    this.f265804c.b(iV8);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(int i10) {
        this.f265810i = i10;
    }

    public void m(ExecutorService executorService) {
        this.f265808g = executorService;
    }

    public s(a0 a0Var, int i10, ThreadFactory threadFactory) {
        this(a0Var, i10, threadFactory, new com.rabbitmq.client.r0());
    }

    public s(a0 a0Var, int i10, ThreadFactory threadFactory, com.rabbitmq.client.p0 p0Var) {
        this.f265802a = new Object();
        this.f265803b = new HashMap();
        this.f265806e = new HashSet();
        this.f265810i = 63000;
        i10 = i10 == 0 ? 65535 : i10;
        this.f265807f = i10;
        this.f265804c = new com.rabbitmq.utility.c(1, i10);
        this.f265805d = a0Var;
        this.f265809h = threadFactory;
        this.f265811j = p0Var;
    }
}
