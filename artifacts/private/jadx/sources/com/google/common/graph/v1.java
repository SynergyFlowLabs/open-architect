package com.google.common.graph;

import com.google.common.collect.n6;
import com.google.common.collect.p7;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class v1<N, V> implements o0<N, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<N, V> f118734a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f118735a;

        static {
            int[] iArr = new int[f0.a.values().length];
            f118735a = iArr;
            try {
                iArr[f0.a.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118735a[f0.a.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private v1(Map<N, V> adjacentNodeValues) {
        this.f118734a = (Map) com.google.common.base.j0.E(adjacentNodeValues);
    }

    static <N, V> v1<N, V> k(f0<N> incidentEdgeOrder) {
        int i10 = a.f118735a[incidentEdgeOrder.h().ordinal()];
        if (i10 == 1) {
            return new v1<>(new HashMap(2, 1.0f));
        }
        if (i10 == 2) {
            return new v1<>(new LinkedHashMap(2, 1.0f));
        }
        throw new AssertionError(incidentEdgeOrder.h());
    }

    static <N, V> v1<N, V> l(Map<N, V> adjacentNodeValues) {
        return new v1<>(n6.g(adjacentNodeValues));
    }

    @Override // com.google.common.graph.o0
    public Set<N> a() {
        return Collections.unmodifiableSet(this.f118734a.keySet());
    }

    @Override // com.google.common.graph.o0
    public Set<N> b() {
        return a();
    }

    @Override // com.google.common.graph.o0
    public Set<N> c() {
        return a();
    }

    @Override // com.google.common.graph.o0
    public void d(N node, V value) {
        i(node, value);
    }

    @Override // com.google.common.graph.o0
    @fj.a
    public V e(N node) {
        return this.f118734a.get(node);
    }

    @Override // com.google.common.graph.o0
    @fj.a
    public V f(N node) {
        return this.f118734a.remove(node);
    }

    @Override // com.google.common.graph.o0
    public void g(N node) {
        f(node);
    }

    @Override // com.google.common.graph.o0
    public Iterator<h0<N>> h(final N thisNode) {
        return p7.b0(this.f118734a.keySet().iterator(), new com.google.common.base.t() { // from class: com.google.common.graph.u1
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return h0.u(thisNode, obj);
            }
        });
    }

    @Override // com.google.common.graph.o0
    @fj.a
    public V i(N node, V value) {
        return this.f118734a.put(node, value);
    }
}
