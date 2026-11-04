package com.google.common.graph;

import com.google.common.collect.nb;
import com.google.common.collect.p7;
import com.google.common.collect.z6;
import java.util.AbstractSet;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class e0<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<?, E> f118608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f118609b;

    e0(Map<?, E> nodeToEdgeMap, Object targetNode) {
        this.f118608a = (Map) com.google.common.base.j0.E(nodeToEdgeMap);
        this.f118609b = com.google.common.base.j0.E(targetNode);
    }

    @fj.a
    private E c() {
        return this.f118608a.get(this.f118609b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object edge) {
        E eC = c();
        return eC != null && eC.equals(edge);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public nb<E> iterator() {
        E eC = c();
        return eC == null ? z6.G().iterator() : p7.X(eC);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return c() == null ? 0 : 1;
    }
}
