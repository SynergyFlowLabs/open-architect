package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
class i6<K, V> extends g<K, V> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f117469c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b9
    final K f117470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b9
    final V f117471b;

    i6(@b9 K key, @b9 V value) {
        this.f117470a = key;
        this.f117471b = value;
    }

    @Override // com.google.common.collect.g, java.util.Map.Entry
    @b9
    public final K getKey() {
        return this.f117470a;
    }

    @Override // com.google.common.collect.g, java.util.Map.Entry
    @b9
    public final V getValue() {
        return this.f117471b;
    }

    @Override // com.google.common.collect.g, java.util.Map.Entry
    @b9
    public final V setValue(@b9 V value) {
        throw new UnsupportedOperationException();
    }
}
