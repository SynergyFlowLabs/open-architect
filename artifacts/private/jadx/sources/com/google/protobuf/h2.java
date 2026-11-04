package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class h2<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h2<?, ?> f126008b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f126009a;

    static {
        h2<?, ?> h2Var = new h2<>();
        f126008b = h2Var;
        h2Var.k();
    }

    private h2() {
        this.f126009a = true;
    }

    static <K, V> int a(Map<K, V> a10) {
        int iB = 0;
        for (Map.Entry<K, V> entry : a10.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    private static int b(Object a10) {
        if (a10 instanceof byte[]) {
            return s1.m((byte[]) a10);
        }
        if (a10 instanceof s1.c) {
            throw new UnsupportedOperationException();
        }
        return a10.hashCode();
    }

    private static void c(Map<?, ?> m10) {
        for (Object obj : m10.keySet()) {
            s1.d(obj);
            s1.d(m10.get(obj));
        }
    }

    private static Object d(Object object) {
        if (!(object instanceof byte[])) {
            return object;
        }
        byte[] bArr = (byte[]) object;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> Map<K, V> e(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), d(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> h2<K, V> f() {
        return (h2<K, V>) f126008b;
    }

    private void g() {
        if (!j()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean h(Object a10, Object b10) {
        return ((a10 instanceof byte[]) && (b10 instanceof byte[])) ? Arrays.equals((byte[]) a10, (byte[]) b10) : a10.equals(b10);
    }

    static <K, V> boolean i(Map<K, V> a10, Map<K, V> b10) {
        if (a10 == b10) {
            return true;
        }
        if (a10.size() != b10.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : a10.entrySet()) {
            if (!b10.containsKey(entry.getKey()) || !h(entry.getValue(), b10.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object object) {
        return (object instanceof Map) && i(this, (Map) object);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean j() {
        return this.f126009a;
    }

    public void k() {
        this.f126009a = false;
    }

    public void l(h2<K, V> other) {
        g();
        if (other.isEmpty()) {
            return;
        }
        putAll(other);
    }

    public h2<K, V> n() {
        return isEmpty() ? new h2<>() : new h2<>(this);
    }

    public V o(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        g();
        s1.d(k10);
        s1.d(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m10) {
        g();
        c(m10);
        super.putAll(m10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        return (V) super.remove(obj);
    }

    private h2(Map<K, V> mapData) {
        super(mapData);
        int i10 = 7 | 1;
        this.f126009a = true;
    }
}
