package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class r<K, V> extends e<K, V> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336103c = 7990956402564206740L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final w0<? super K, ? extends V> f336104b;

    protected r(Map<K, V> map, org.apache.commons.collections4.n<? extends V> nVar) {
        super(map);
        if (nVar == null) {
            throw new NullPointerException("Factory must not be null");
        }
        this.f336104b = org.apache.commons.collections4.functors.s.b(nVar);
    }

    public static <K, V> r<K, V> b(Map<K, V> map, org.apache.commons.collections4.n<? extends V> nVar) {
        return new r<>(map, nVar);
    }

    public static <V, K> r<K, V> c(Map<K, V> map, w0<? super K, ? extends V> w0Var) {
        return new r<>(map, w0Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336038a = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f336038a);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        if (this.f336038a.containsKey(obj)) {
            return this.f336038a.get(obj);
        }
        V vA = this.f336104b.a(obj);
        this.f336038a.put(obj, vA);
        return vA;
    }

    protected r(Map<K, V> map, w0<? super K, ? extends V> w0Var) {
        super(map);
        if (w0Var != null) {
            this.f336104b = w0Var;
            return;
        }
        throw new NullPointerException("Factory must not be null");
    }
}
