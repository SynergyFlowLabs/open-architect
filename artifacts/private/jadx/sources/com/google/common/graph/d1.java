package com.google.common.graph;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class d1<K, V> extends c1<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    private volatile transient a<K, V> f118602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.a
    private volatile transient a<K, V> f118603d;

    private static final class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f118604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final V f118605b;

        a(K key, V value) {
            this.f118604a = key;
            this.f118605b = value;
        }
    }

    d1(Map<K, V> backingMap) {
        super(backingMap);
    }

    private void l(a<K, V> entry) {
        this.f118603d = this.f118602c;
        this.f118602c = entry;
    }

    private void m(K key, V value) {
        l(new a<>(key, value));
    }

    @Override // com.google.common.graph.c1
    void d() {
        super.d();
        this.f118602c = null;
        this.f118603d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.c1
    @fj.a
    V f(Object key) {
        com.google.common.base.j0.E(key);
        V vG = g(key);
        if (vG != null) {
            return vG;
        }
        V vH = h(key);
        if (vH != null) {
            m(key, vH);
        }
        return vH;
    }

    @Override // com.google.common.graph.c1
    @fj.a
    V g(@fj.a Object obj) {
        V v10 = (V) super.g(obj);
        if (v10 != null) {
            return v10;
        }
        a<K, V> aVar = this.f118602c;
        if (aVar != null && aVar.f118604a == obj) {
            return aVar.f118605b;
        }
        a<K, V> aVar2 = this.f118603d;
        if (aVar2 == null || aVar2.f118604a != obj) {
            return null;
        }
        l(aVar2);
        return aVar2.f118605b;
    }
}
