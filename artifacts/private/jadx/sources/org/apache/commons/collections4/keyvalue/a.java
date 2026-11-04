package org.apache.commons.collections4.keyvalue;

import org.apache.commons.collections4.x;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<K, V> implements x<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K f335898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V f335899b;

    protected a(K k10, V v10) {
        this.f335898a = k10;
        this.f335899b = v10;
    }

    protected K a(K k10) {
        K k11 = this.f335898a;
        this.f335898a = k10;
        return k11;
    }

    @Override // org.apache.commons.collections4.x
    public K getKey() {
        return this.f335898a;
    }

    @Override // org.apache.commons.collections4.x
    public V getValue() {
        return this.f335899b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public V setValue(V v10) {
        V v11 = this.f335899b;
        this.f335899b = v10;
        return v11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
