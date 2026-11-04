package org.apache.commons.collections4.map;

import org.apache.commons.collections4.k0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class f<K, V> extends e<K, V> implements org.apache.commons.collections4.j0<K, V> {
    protected f() {
    }

    @Override // org.apache.commons.collections4.j0
    public K C3(K k10) {
        return a().C3(k10);
    }

    @Override // org.apache.commons.collections4.j0
    public K E2(K k10) {
        return a().E2(k10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.map.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.apache.commons.collections4.j0<K, V> a() {
        return (org.apache.commons.collections4.j0) super.a();
    }

    @Override // org.apache.commons.collections4.j0
    public K firstKey() {
        return a().firstKey();
    }

    @Override // org.apache.commons.collections4.j0
    public K lastKey() {
        return a().lastKey();
    }

    public f(org.apache.commons.collections4.j0<K, V> j0Var) {
        super(j0Var);
    }

    @Override // org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public k0<K, V> T() {
        return a().T();
    }
}
