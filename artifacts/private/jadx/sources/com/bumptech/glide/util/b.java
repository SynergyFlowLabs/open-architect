package com.bumptech.glide.util;

import androidx.collection.h3;

/* JADX INFO: loaded from: classes3.dex */
public final class b<K, V> extends androidx.collection.a<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f97464g;

    @Override // androidx.collection.h3, java.util.Map
    public void clear() {
        this.f97464g = 0;
        super.clear();
    }

    @Override // androidx.collection.h3
    public void h(h3<? extends K, ? extends V> h3Var) {
        this.f97464g = 0;
        super.h(h3Var);
    }

    @Override // androidx.collection.h3, java.util.Map
    public int hashCode() {
        if (this.f97464g == 0) {
            this.f97464g = super.hashCode();
        }
        return this.f97464g;
    }

    @Override // androidx.collection.h3
    public V i(int i10) {
        this.f97464g = 0;
        return (V) super.i(i10);
    }

    @Override // androidx.collection.h3
    public V j(int i10, V v10) {
        this.f97464g = 0;
        return (V) super.j(i10, v10);
    }

    @Override // androidx.collection.h3, java.util.Map
    public V put(K k10, V v10) {
        this.f97464g = 0;
        return (V) super.put(k10, v10);
    }
}
