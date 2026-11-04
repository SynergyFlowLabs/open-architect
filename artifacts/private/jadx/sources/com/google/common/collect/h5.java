package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b
public abstract class h5<K, V> extends m5 implements Map.Entry<K, V> {
    protected h5() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.m5
    public abstract Map.Entry<K, V> L0();

    protected boolean N0(@fj.a Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) object;
            if (com.google.common.base.d0.a(getKey(), entry.getKey()) && com.google.common.base.d0.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    protected int P0() {
        K key = getKey();
        V value = getValue();
        int iHashCode = 0;
        int iHashCode2 = key == null ? 0 : key.hashCode();
        if (value != null) {
            iHashCode = value.hashCode();
        }
        return iHashCode2 ^ iHashCode;
    }

    protected String S0() {
        return getKey() + "=" + getValue();
    }

    @Override // java.util.Map.Entry
    public boolean equals(@fj.a Object object) {
        return L0().equals(object);
    }

    @Override // java.util.Map.Entry
    @b9
    public K getKey() {
        return L0().getKey();
    }

    @Override // java.util.Map.Entry
    @b9
    public V getValue() {
        return L0().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return L0().hashCode();
    }

    @z7.a
    @b9
    public V setValue(@b9 V value) {
        return L0().setValue(value);
    }
}
