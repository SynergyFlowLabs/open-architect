package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
final class l9<K, V> extends f6<K, V> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final l9<Object, Object> f117633m = new l9<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @fj.a
    private final transient Object f117634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.google.common.annotations.e
    final transient Object[] f117635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient int f117636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f117637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient l9<V, K> f117638l;

    /* JADX WARN: Multi-variable type inference failed */
    private l9() {
        this.f117634h = null;
        this.f117635i = new Object[0];
        this.f117636j = 0;
        this.f117637k = 0;
        this.f117638l = this;
    }

    @Override // com.google.common.collect.f6, com.google.common.collect.w
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public f6<V, K> Y2() {
        return this.f117638l;
    }

    @Override // com.google.common.collect.n6, java.util.Map
    @fj.a
    public V get(@fj.a Object obj) {
        V v10 = (V) n9.K(this.f117634h, this.f117635i, this.f117637k, this.f117636j, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.n6
    z6<Map.Entry<K, V>> h() {
        return new n9.a(this, this.f117635i, this.f117636j, this.f117637k);
    }

    @Override // com.google.common.collect.n6
    z6<K> i() {
        return new n9.b(this, new n9.c(this.f117635i, this.f117636j, this.f117637k));
    }

    @Override // com.google.common.collect.n6
    boolean n() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f117637k;
    }

    @Override // com.google.common.collect.f6, com.google.common.collect.n6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }

    l9(Object[] alternatingKeysAndValues, int size) {
        this.f117635i = alternatingKeysAndValues;
        this.f117637k = size;
        this.f117636j = 0;
        int iU = size >= 2 ? z6.u(size) : 0;
        this.f117634h = n9.J(alternatingKeysAndValues, size, iU, 0);
        this.f117638l = new l9<>(n9.J(alternatingKeysAndValues, size, iU, 1), alternatingKeysAndValues, size, this);
    }

    private l9(@fj.a Object valueHashTable, Object[] alternatingKeysAndValues, int size, l9<V, K> inverse) {
        this.f117634h = valueHashTable;
        this.f117635i = alternatingKeysAndValues;
        this.f117636j = 1;
        this.f117637k = size;
        this.f117638l = inverse;
    }
}
