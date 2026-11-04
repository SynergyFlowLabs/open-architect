package com.rabbitmq.client.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes13.dex */
public abstract class q implements com.rabbitmq.client.p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final org.slf4j.c f265661d = org.slf4j.e.k(q.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<String, c> f265662a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f265663b = new Runnable() { // from class: com.rabbitmq.client.impl.o
        @Override // java.lang.Runnable
        public final void run() {
            this.f265639a.B();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f265664c = new Runnable() { // from class: com.rabbitmq.client.impl.p
        @Override // java.lang.Runnable
        public final void run() {
            this.f265643a.I();
        }
    };

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f265665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set<Long> f265666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Set<String> f265667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.rabbitmq.client.k f265668d;

        private b(com.rabbitmq.client.k kVar) {
            this.f265665a = new ReentrantLock();
            this.f265666b = new HashSet();
            this.f265667c = new HashSet();
            this.f265668d = kVar;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ConcurrentMap<Integer, b> f265669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.rabbitmq.client.p f265670b;

        private c(com.rabbitmq.client.p pVar) {
            this.f265669a = new ConcurrentHashMap();
            this.f265670b = pVar;
        }
    }

    private void J(com.rabbitmq.client.k kVar, long j10, boolean z10, Runnable runnable) {
        b bVarU = u(kVar);
        bVarU.f265665a.lock();
        try {
            if (z10) {
                Iterator<Long> it = bVarU.f265666b.iterator();
                while (it.hasNext()) {
                    if (it.next().longValue() <= j10) {
                        it.remove();
                        runnable.run();
                    }
                }
            } else if (bVarU.f265666b.remove(Long.valueOf(j10))) {
                runnable.run();
            }
            bVarU.f265665a.unlock();
        } catch (Throwable th2) {
            bVarU.f265665a.unlock();
            throw th2;
        }
    }

    private b u(com.rabbitmq.client.k kVar) {
        return w(kVar.C0()).f265669a.get(Integer.valueOf(kVar.V8()));
    }

    private c w(com.rabbitmq.client.p pVar) {
        return this.f265662a.get(pVar.getId());
    }

    protected abstract void A(com.rabbitmq.client.p pVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void B();

    protected abstract void C();

    protected abstract void D();

    protected abstract void E();

    protected abstract void F();

    protected abstract void G();

    protected abstract void H();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void I();

    @Override // com.rabbitmq.client.p0
    public void a(com.rabbitmq.client.k kVar, long j10, boolean z10) {
        if (z10) {
            return;
        }
        try {
            F();
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in basicPublishNack: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void b(com.rabbitmq.client.k kVar, long j10, boolean z10) {
        try {
            J(kVar, j10, z10, this.f265663b);
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in basicAck: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void c(com.rabbitmq.client.k kVar, long j10, boolean z10) {
        if (z10) {
            return;
        }
        try {
            D();
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in basicPublishAck: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void d(com.rabbitmq.client.k kVar, String str, boolean z10) {
        if (z10) {
            return;
        }
        try {
            b bVarU = u(kVar);
            bVarU.f265665a.lock();
            try {
                u(kVar).f265667c.add(str);
                Lock lock = bVarU.f265665a;
            } finally {
                bVarU.f265665a.unlock();
            }
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in basicConsume: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void e(final com.rabbitmq.client.p pVar) {
        try {
            if (pVar.getId() == null) {
                pVar.Kb(UUID.randomUUID().toString());
            }
            A(pVar);
            int i10 = 6 & 0;
            this.f265662a.put(pVar.getId(), new c(pVar));
            pVar.h(new com.rabbitmq.client.j1() { // from class: com.rabbitmq.client.impl.n
                @Override // com.rabbitmq.client.j1
                public final void a(com.rabbitmq.client.l1 l1Var) {
                    this.f265546a.h(pVar);
                }
            });
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in newConnection: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void f(com.rabbitmq.client.k kVar, long j10) {
        try {
            J(kVar, j10, true, this.f265664c);
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in basicNack: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void g(final com.rabbitmq.client.k kVar) {
        try {
            z(kVar);
            kVar.h(new com.rabbitmq.client.j1() { // from class: com.rabbitmq.client.impl.m
                @Override // com.rabbitmq.client.j1
                public final void a(com.rabbitmq.client.l1 l1Var) {
                    this.f265539a.p(kVar);
                }
            });
            w(kVar.C0()).f265669a.put(Integer.valueOf(kVar.V8()), new b(kVar));
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in newChannel: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void h(com.rabbitmq.client.p pVar) {
        try {
            if (this.f265662a.remove(pVar.getId()) != null) {
                y(pVar);
            }
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in closeConnection: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void i(com.rabbitmq.client.k kVar, long j10, String str) {
        try {
            C();
            b bVarU = u(kVar);
            bVarU.f265665a.lock();
            try {
                if (bVarU.f265667c.contains(str)) {
                    bVarU.f265666b.add(Long.valueOf(j10));
                }
                bVarU.f265665a.unlock();
            } catch (Throwable th2) {
                bVarU.f265665a.unlock();
                throw th2;
            }
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in consumedMessage: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void j(com.rabbitmq.client.k kVar) {
        try {
            G();
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in basicPublish: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void k(com.rabbitmq.client.k kVar, long j10, boolean z10) {
        try {
            C();
            if (z10) {
                return;
            }
            b bVarU = u(kVar);
            bVarU.f265665a.lock();
            try {
                u(kVar).f265666b.add(Long.valueOf(j10));
                Lock lock = bVarU.f265665a;
            } finally {
                bVarU.f265665a.unlock();
            }
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in consumedMessage: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void l(com.rabbitmq.client.k kVar) {
        try {
            H();
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in markPublishedMessageUnrouted: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void m(com.rabbitmq.client.k kVar, String str) {
        try {
            b bVarU = u(kVar);
            bVarU.f265665a.lock();
            try {
                u(kVar).f265667c.remove(str);
                bVarU.f265665a.unlock();
            } catch (Throwable th2) {
                bVarU.f265665a.unlock();
                throw th2;
            }
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in basicCancel: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void n(com.rabbitmq.client.k kVar, long j10) {
        try {
            J(kVar, j10, false, this.f265664c);
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in basicReject: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void o(com.rabbitmq.client.k kVar, Throwable th2) {
        try {
            E();
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in basicPublishFailure: " + e10.getMessage());
        }
    }

    @Override // com.rabbitmq.client.p0
    public void p(com.rabbitmq.client.k kVar) {
        try {
            if (w(kVar.C0()).f265669a.remove(Integer.valueOf(kVar.V8())) != null) {
                x(kVar);
            }
        } catch (Exception e10) {
            f265661d.I("Error while computing metrics in closeChannel: " + e10.getMessage());
        }
    }

    public void v() {
        try {
            Iterator<Map.Entry<String, c>> it = this.f265662a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, c> next = it.next();
                com.rabbitmq.client.p pVar = next.getValue().f265670b;
                if (pVar.isOpen()) {
                    Iterator<Map.Entry<Integer, b>> it2 = next.getValue().f265669a.entrySet().iterator();
                    while (it2.hasNext()) {
                        com.rabbitmq.client.k kVar = it2.next().getValue().f265668d;
                        if (!kVar.isOpen()) {
                            it2.remove();
                            x(kVar);
                            f265661d.s("Ripped off state of channel {} of connection {}. This is abnormal, please report.", Integer.valueOf(kVar.V8()), pVar.getId());
                        }
                    }
                } else {
                    it.remove();
                    y(pVar);
                    for (int i10 = 0; i10 < next.getValue().f265669a.size(); i10++) {
                        x(null);
                    }
                    f265661d.v("Ripped off state of connection {}. This is abnormal, please report.", pVar.getId());
                }
            }
        } catch (Exception e10) {
            f265661d.I("Error during periodic clean of metricsCollector: " + e10.getMessage());
        }
    }

    protected abstract void x(com.rabbitmq.client.k kVar);

    protected abstract void y(com.rabbitmq.client.p pVar);

    protected abstract void z(com.rabbitmq.client.k kVar);
}
