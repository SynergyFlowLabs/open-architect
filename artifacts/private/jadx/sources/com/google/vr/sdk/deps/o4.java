package com.google.vr.sdk.deps;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class o4<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o4 f129513b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f129514a;

    static {
        o4 o4Var = new o4();
        f129513b = o4Var;
        o4Var.f129514a = false;
    }

    private o4() {
        this.f129514a = true;
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return k3.j((byte[]) obj);
        }
        if (obj instanceof n3) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static <K, V> o4<K, V> b() {
        return f129513b;
    }

    private final void g() {
        if (!this.f129514a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(o4<K, V> o4Var) {
        g();
        if (!o4Var.isEmpty()) {
            putAll(o4Var);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final o4<K, V> d() {
        return isEmpty() ? new o4<>() : new o4<>(this);
    }

    public final void e() {
        this.f129514a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                z10 = true;
            } else {
                if (size() == map.size()) {
                    Iterator<Map.Entry<K, V>> it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry<K, V> next = it.next();
                            if (map.containsKey(next.getKey())) {
                                V value = next.getValue();
                                Object obj2 = map.get(next.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z10 = true;
                        }
                    }
                }
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f129514a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iA = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        g();
        k3.d(k10);
        k3.d(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        g();
        for (K k10 : map.keySet()) {
            k3.d(k10);
            k3.d(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        g();
        return (V) super.remove(obj);
    }

    private o4(Map<K, V> map) {
        super(map);
        this.f129514a = true;
    }
}
