package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.l0;

/* JADX INFO: loaded from: classes14.dex */
public class y<K, V> extends b<K, V> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336145d = 7412622456128415156L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final l0<? super K> f336146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final l0<? super V> f336147c;

    protected y(Map<K, V> map, l0<? super K> l0Var, l0<? super V> l0Var2) {
        super(map);
        this.f336146b = l0Var;
        this.f336147c = l0Var2;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            e(entry.getKey(), entry.getValue());
        }
    }

    public static <K, V> y<K, V> d(Map<K, V> map, l0<? super K> l0Var, l0<? super V> l0Var2) {
        return new y<>(map, l0Var, l0Var2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336038a = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f336038a);
    }

    @Override // org.apache.commons.collections4.map.b
    protected V b(V v10) {
        if (this.f336147c.a(v10)) {
            return v10;
        }
        throw new IllegalArgumentException("Cannot set value - Predicate rejected it");
    }

    @Override // org.apache.commons.collections4.map.b
    protected boolean c() {
        return this.f336147c != null;
    }

    protected void e(K k10, V v10) {
        l0<? super K> l0Var = this.f336146b;
        if (l0Var != null && !l0Var.a(k10)) {
            throw new IllegalArgumentException("Cannot add key - Predicate rejected it");
        }
        l0<? super V> l0Var2 = this.f336147c;
        if (l0Var2 != null && !l0Var2.a(v10)) {
            throw new IllegalArgumentException("Cannot add value - Predicate rejected it");
        }
    }

    @Override // org.apache.commons.collections4.map.b, org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        e(k10, v10);
        return this.f336038a.put(k10, v10);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            e(entry.getKey(), entry.getValue());
        }
        super.putAll(map);
    }
}
