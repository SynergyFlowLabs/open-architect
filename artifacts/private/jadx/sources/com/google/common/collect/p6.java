package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
final class p6<K, V> extends l7<K> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n6<K, V> f117925i;

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static class a<K> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117926b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n6<K, ?> f117927a;

        a(n6<K, ?> map) {
            this.f117927a = map;
        }

        Object readResolve() {
            return this.f117927a.keySet();
        }
    }

    p6(n6<K, V> map) {
        this.f117925i = map;
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object object) {
        return this.f117925i.containsKey(object);
    }

    @Override // com.google.common.collect.l7
    K get(int index) {
        return this.f117925i.entrySet().c().get(index).getKey();
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return true;
    }

    @Override // com.google.common.collect.l7, com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<K> iterator() {
        return this.f117925i.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f117925i.size();
    }

    @Override // com.google.common.collect.l7, com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return new a(this.f117925i);
    }
}
