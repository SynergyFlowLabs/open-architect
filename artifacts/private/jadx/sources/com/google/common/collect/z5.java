package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public final class z5<K, V> extends a6<K, V> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f118423k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final long f118424l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.google.common.annotations.e
    transient int f118425j;

    private z5() {
        this(12, 2);
    }

    public static <K, V> z5<K, V> J() {
        return new z5<>();
    }

    public static <K, V> z5<K, V> K(int expectedKeys, int expectedValuesPerKey) {
        return new z5<>(expectedKeys, expectedValuesPerKey);
    }

    public static <K, V> z5<K, V> L(k8<? extends K, ? extends V> multimap) {
        return new z5<>(multimap);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        this.f118425j = 2;
        int iH = x9.h(stream);
        D(d9.d(12));
        x9.e(this, stream, iH);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        x9.j(this, stream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m, com.google.common.collect.e
    /* JADX INFO: renamed from: H */
    public Set<V> u() {
        return d9.e(this.f118425j);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean I0(@fj.a Object key, @fj.a Object value) {
        return super.I0(key, value);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean R(k8 multimap) {
        return super.R(multimap);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public /* bridge */ /* synthetic */ Set c(@fj.a Object key) {
        return super.c(key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean containsKey(@fj.a Object key) {
        return super.containsKey(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean containsValue(@fj.a Object value) {
        return super.containsValue(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public /* bridge */ /* synthetic */ Set d(@b9 Object key, Iterable values) {
        return super.d(key, values);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public /* bridge */ /* synthetic */ Set x(@b9 Object key) {
        return super.x(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Set u() {
        return super.u();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ q8 keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public /* bridge */ /* synthetic */ Map l() {
        return super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean put(@b9 Object key, @b9 Object value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean remove(@fj.a Object key, @fj.a Object value) {
        return super.remove(key, value);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean v(@b9 Object key, Iterable values) {
        return super.v(key, values);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    private z5(int expectedKeys, int expectedValuesPerKey) {
        super(d9.d(expectedKeys));
        this.f118425j = 2;
        com.google.common.base.j0.d(expectedValuesPerKey >= 0);
        this.f118425j = expectedValuesPerKey;
    }

    private z5(k8<? extends K, ? extends V> multimap) {
        super(d9.d(multimap.keySet().size()));
        this.f118425j = 2;
        R(multimap);
    }
}
