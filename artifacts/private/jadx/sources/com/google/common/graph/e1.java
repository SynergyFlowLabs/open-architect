package com.google.common.graph;

import com.google.common.collect.nb;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@g0
abstract class e1<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<E, ?> f118610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f118611b;

    class a extends com.google.common.collect.c<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f118612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e1 f118613d;

        a(final e1 this$0, final Iterator val$entries) {
            this.f118612c = val$entries;
            this.f118613d = this$0;
        }

        @Override // com.google.common.collect.c
        @fj.a
        protected E b() {
            while (this.f118612c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f118612c.next();
                if (this.f118613d.f118611b.equals(entry.getValue())) {
                    return (E) entry.getKey();
                }
            }
            return c();
        }
    }

    e1(Map<E, ?> outEdgeToNode, Object targetNode) {
        this.f118610a = (Map) com.google.common.base.j0.E(outEdgeToNode);
        this.f118611b = com.google.common.base.j0.E(targetNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object edge) {
        return this.f118611b.equals(this.f118610a.get(edge));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public nb<E> iterator() {
        return new a(this, this.f118610a.entrySet().iterator());
    }
}
