package org.apache.commons.collections4.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.commons.collections4.c0;
import org.apache.commons.collections4.map.w;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class c<K, C> extends a<C> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f335602f = -5512610452568370038L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0<C, K> f335603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0<K, C> f335604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f335605e;

    public c(Collection<C> collection, w0<C, K> w0Var, c0<K, C> c0Var, boolean z10) {
        super(collection);
        this.f335603c = w0Var;
        this.f335604d = c0Var;
        this.f335605e = z10;
        m();
    }

    private void i(C c10) {
        K kA = this.f335603c.a(c10);
        if (this.f335605e && this.f335604d.containsKey(kA)) {
            throw new IllegalArgumentException("Duplicate key in uniquely indexed collection.");
        }
        this.f335604d.put(kA, c10);
    }

    public static <K, C> c<K, C> l(Collection<C> collection, w0<C, K> w0Var) {
        return new c<>(collection, w0Var, w.f(new HashMap()), false);
    }

    private void n(C c10) {
        this.f335604d.remove(this.f335603c.a(c10));
    }

    public static <K, C> c<K, C> p(Collection<C> collection, w0<C, K> w0Var) {
        return new c<>(collection, w0Var, w.f(new HashMap()), true);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean add(C c10) {
        boolean zAdd = super.add(c10);
        if (zAdd) {
            i(c10);
        }
        return zAdd;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends C> collection) {
        Iterator<? extends C> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public void clear() {
        super.clear();
        this.f335604d.clear();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f335604d.containsKey(this.f335603c.a(obj));
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public C k(K k10) {
        Collection collection = (Collection) this.f335604d.get(k10);
        if (collection == null) {
            return null;
        }
        return (C) collection.iterator().next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m() {
        this.f335604d.clear();
        Iterator it = c().iterator();
        while (it.hasNext()) {
            i(it.next());
        }
    }

    public Collection<C> r(K k10) {
        return (Collection) this.f335604d.get(k10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean remove(Object obj) {
        boolean zRemove = super.remove(obj);
        if (zRemove) {
            n(obj);
        }
        return zRemove;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = super.retainAll(collection);
        if (zRetainAll) {
            m();
        }
        return zRetainAll;
    }
}
