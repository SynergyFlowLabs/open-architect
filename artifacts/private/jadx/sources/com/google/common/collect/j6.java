package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
final class j6<K extends Enum<K>, V> extends n6.c<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient EnumMap<K, V> f117501g;

    @com.google.common.annotations.d
    private static class b<K extends Enum<K>, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117502b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final EnumMap<K, V> f117503a;

        b(EnumMap<K, V> delegate) {
            this.f117503a = delegate;
        }

        Object readResolve() {
            return new j6(this.f117503a);
        }
    }

    static <K extends Enum<K>, V> n6<K, V> H(EnumMap<K, V> map) {
        int size = map.size();
        if (size == 0) {
            return n6.q();
        }
        if (size != 1) {
            return new j6(map);
        }
        Map.Entry entry = (Map.Entry) o7.z(map.entrySet());
        return n6.s((Enum) entry.getKey(), entry.getValue());
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // com.google.common.collect.n6.c
    nb<Map.Entry<K, V>> G() {
        return b8.L0(this.f117501g.entrySet().iterator());
    }

    @Override // com.google.common.collect.n6, java.util.Map
    public boolean containsKey(@fj.a Object key) {
        return this.f117501g.containsKey(key);
    }

    @Override // com.google.common.collect.n6, java.util.Map
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof j6) {
            object = ((j6) object).f117501g;
        }
        return this.f117501g.equals(object);
    }

    @Override // com.google.common.collect.n6, java.util.Map
    @fj.a
    public V get(@fj.a Object key) {
        return this.f117501g.get(key);
    }

    @Override // com.google.common.collect.n6
    boolean n() {
        return false;
    }

    @Override // com.google.common.collect.n6
    nb<K> o() {
        return p7.e0(this.f117501g.keySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.f117501g.size();
    }

    @Override // com.google.common.collect.n6.c, com.google.common.collect.n6
    @com.google.common.annotations.d
    Object writeReplace() {
        return new b(this.f117501g);
    }

    private j6(EnumMap<K, V> delegate) {
        this.f117501g = delegate;
        com.google.common.base.j0.d(!delegate.isEmpty());
    }
}
