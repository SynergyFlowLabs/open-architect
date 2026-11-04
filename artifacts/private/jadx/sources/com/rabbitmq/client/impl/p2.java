package com.rabbitmq.client.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes13.dex */
public class p2<K, W> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f265655f = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1<K> f265656a = new l1<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<K> f265657b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<K, l2<W>> f265658c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<K> f265659d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BiConsumer<l2<W>, W> f265660e;

    public p2(final int i10) {
        if (i10 > 0) {
            this.f265660e = new BiConsumer() { // from class: com.rabbitmq.client.impl.n2
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    p2.a(i10, (l2) obj, obj2);
                }
            };
        } else {
            this.f265660e = new BiConsumer() { // from class: com.rabbitmq.client.impl.o2
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    p2.b((l2) obj, obj2);
                }
            };
        }
    }

    public static /* synthetic */ void a(int i10, l2 l2Var, Object obj) {
        try {
            if (l2Var.offer(obj, i10, TimeUnit.MILLISECONDS)) {
                return;
            }
            throw new q2("Could not enqueue in work pool after " + i10 + " ms.");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void b(l2 l2Var, Object obj) {
        try {
            l2Var.put(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void d(K k10) {
        this.f265656a.a(k10);
    }

    private int e(l2<W> l2Var, Collection<W> collection, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            W wPoll = l2Var.poll();
            if (wPoll == null) {
                break;
            }
            collection.add(wPoll);
            i11++;
        }
        return i11;
    }

    private void g(K k10) {
        this.f265657b.remove(k10);
    }

    private void h(K k10) {
        this.f265657b.remove(k10);
        this.f265656a.a(k10);
    }

    private boolean i(K k10) {
        return (j(k10) || k(k10) || !l(k10)) ? false : true;
    }

    private boolean j(K k10) {
        return this.f265657b.contains(k10);
    }

    private boolean k(K k10) {
        return this.f265656a.c(k10);
    }

    private boolean l(K k10) {
        return this.f265658c.containsKey(k10);
    }

    private boolean n(K k10) {
        l2<W> l2Var = this.f265658c.get(k10);
        return (l2Var == null || l2Var.isEmpty()) ? false : true;
    }

    private K p() {
        K kE = this.f265656a.e();
        if (kE != null) {
            this.f265657b.add(kE);
        }
        return kE;
    }

    private void r(int i10) {
        Iterator<l2<W>> it = this.f265658c.values().iterator();
        while (it.hasNext()) {
            it.next().t(i10);
        }
    }

    public boolean c(K k10, W w10) {
        l2<W> l2Var;
        synchronized (this) {
            l2Var = this.f265658c.get(k10);
        }
        if (l2Var == null) {
            return false;
        }
        this.f265660e.accept(l2Var, w10);
        synchronized (this) {
            try {
                if (!i(k10)) {
                    return false;
                }
                d(k10);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean f(K k10) {
        synchronized (this) {
            try {
                if (!l(k10)) {
                    return false;
                }
                if (this.f265657b.contains(k10)) {
                    if (n(k10)) {
                        h(k10);
                        return true;
                    }
                    g(k10);
                    return false;
                }
                throw new IllegalStateException("Client " + k10 + " not in progress");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void m(K k10) {
        try {
            this.f265659d.remove(k10);
            if (this.f265659d.isEmpty()) {
                r(1000);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public K o(Collection<W> collection, int i10) {
        K kP;
        synchronized (this) {
            try {
                kP = p();
                if (kP != null) {
                    e(this.f265658c.get(kP), collection, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kP;
    }

    public void q(K k10) {
        synchronized (this) {
            try {
                if (!this.f265658c.containsKey(k10)) {
                    this.f265658c.put(k10, new l2<>(this.f265659d.isEmpty() ? 1000 : Integer.MAX_VALUE));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void s(K k10) {
        try {
            this.f265659d.add(k10);
            if (!this.f265659d.isEmpty()) {
                r(Integer.MAX_VALUE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void t() {
        synchronized (this) {
            this.f265658c.clear();
            this.f265656a.b();
            this.f265657b.clear();
            this.f265659d.clear();
        }
    }

    public void u(K k10) {
        synchronized (this) {
            try {
                this.f265658c.remove(k10);
                this.f265656a.f(k10);
                this.f265657b.remove(k10);
                this.f265659d.remove(k10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
