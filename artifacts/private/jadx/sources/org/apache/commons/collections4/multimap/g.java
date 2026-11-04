package org.apache.commons.collections4.multimap;

import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.g0;
import org.apache.commons.collections4.j;
import org.apache.commons.collections4.p;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class g<K, V> extends c<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336195e = 20150612;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0<? super K, ? extends K> f336196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0<? super V, ? extends V> f336197d;

    protected g(g0<K, V> g0Var, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        super(g0Var);
        this.f336196c = w0Var;
        this.f336197d = w0Var2;
    }

    public static <K, V> g<K, V> f(g0<K, V> g0Var, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        g<K, V> gVar = new g<>(g0Var, w0Var, w0Var2);
        if (!g0Var.isEmpty()) {
            e eVar = new e(g0Var);
            gVar.clear();
            gVar.b(eVar);
        }
        return gVar;
    }

    public static <K, V> g<K, V> g(g0<K, V> g0Var, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        return new g<>(g0Var, w0Var, w0Var2);
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public boolean b(g0<? extends K, ? extends V> g0Var) {
        if (g0Var == null) {
            throw new NullPointerException("Map must not be null.");
        }
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : g0Var.k()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    protected K d(K k10) {
        w0<? super K, ? extends K> w0Var = this.f336196c;
        return w0Var == null ? k10 : w0Var.a(k10);
    }

    protected V e(V v10) {
        w0<? super V, ? extends V> w0Var = this.f336197d;
        return w0Var == null ? v10 : w0Var.a(v10);
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public boolean put(K k10, V v10) {
        return c().put(d(k10), e(v10));
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public boolean putAll(Map<? extends K, ? extends V> map) {
        if (map == null) {
            throw new NullPointerException("Map must not be null.");
        }
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public boolean v(K k10, Iterable<? extends V> iterable) {
        if (iterable == null) {
            throw new NullPointerException("Values must not be null.");
        }
        Iterator<E> it = p.A(iterable).K(this.f336197d).iterator();
        return it.hasNext() && j.c(c().get(d(k10)), it);
    }
}
