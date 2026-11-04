package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class e0<K, V> extends b<K, V> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336039d = 7023152376788900464L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final w0<? super K, ? extends K> f336040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final w0<? super V, ? extends V> f336041c;

    protected e0(Map<K, V> map, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        super(map);
        this.f336040b = w0Var;
        this.f336041c = w0Var2;
    }

    public static <K, V> e0<K, V> g(Map<K, V> map, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        e0<K, V> e0Var = new e0<>(map, w0Var, w0Var2);
        if (map.size() > 0) {
            Map<K, V> mapE = e0Var.e(map);
            e0Var.clear();
            e0Var.a().putAll(mapE);
        }
        return e0Var;
    }

    public static <K, V> e0<K, V> h(Map<K, V> map, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        return new e0<>(map, w0Var, w0Var2);
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
        return this.f336041c.a(v10);
    }

    @Override // org.apache.commons.collections4.map.b
    protected boolean c() {
        return this.f336041c != null;
    }

    protected K d(K k10) {
        w0<? super K, ? extends K> w0Var = this.f336040b;
        return w0Var == null ? k10 : w0Var.a(k10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected Map<K, V> e(Map<? extends K, ? extends V> map) {
        if (map.isEmpty()) {
            return map;
        }
        t tVar = new t(map.size());
        for (Map.Entry entry : map.entrySet()) {
            tVar.put(d(entry.getKey()), f(entry.getValue()));
        }
        return tVar;
    }

    @Override // org.apache.commons.collections4.map.b, org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    protected V f(V v10) {
        w0<? super V, ? extends V> w0Var = this.f336041c;
        return w0Var == null ? v10 : w0Var.a(v10);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        return a().put(d(k10), f(v10));
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        a().putAll(e(map));
    }
}
