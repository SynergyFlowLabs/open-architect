package org.apache.commons.collections4.bidimap;

import java.util.Set;
import org.apache.commons.collections4.a0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<K, V> extends org.apache.commons.collections4.map.e<K, V> implements org.apache.commons.collections4.e<K, V> {
    protected a(org.apache.commons.collections4.e<K, V> eVar) {
        super(eVar);
    }

    @Override // org.apache.commons.collections4.e
    public org.apache.commons.collections4.e<V, K> N() {
        return a().N();
    }

    @Override // org.apache.commons.collections4.e
    public K N2(Object obj) {
        return a().N2(obj);
    }

    @Override // org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public a0<K, V> T() {
        return a().T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.map.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.apache.commons.collections4.e<K, V> a() {
        return (org.apache.commons.collections4.e) super.a();
    }

    @Override // org.apache.commons.collections4.e
    public K w2(Object obj) {
        return a().w2(obj);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<V> values() {
        return a().values();
    }
}
