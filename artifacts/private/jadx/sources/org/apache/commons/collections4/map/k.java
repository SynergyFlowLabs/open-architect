package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class k<K, V> extends e<K, V> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336070c = 19698628745827L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0<? super K, ? extends V> f336071b;

    public k(V v10) {
        this(org.apache.commons.collections4.functors.l.b(v10));
    }

    public static <K, V> Map<K, V> b(Map<K, V> map, w0<? super K, ? extends V> w0Var) {
        if (w0Var != null) {
            return new k(map, w0Var);
        }
        throw new IllegalArgumentException("Transformer must not be null");
    }

    public static <K, V> k<K, V> c(Map<K, V> map, V v10) {
        return new k<>(map, org.apache.commons.collections4.functors.l.b(v10));
    }

    public static <K, V> k<K, V> d(Map<K, V> map, org.apache.commons.collections4.n<? extends V> nVar) {
        if (nVar != null) {
            return new k<>(map, org.apache.commons.collections4.functors.s.b(nVar));
        }
        throw new IllegalArgumentException("Factory must not be null");
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
        V v10 = this.f336038a.get(obj);
        return (v10 != null || this.f336038a.containsKey(obj)) ? v10 : this.f336071b.a(obj);
    }

    public k(w0<? super K, ? extends V> w0Var) {
        this(new HashMap(), w0Var);
    }

    protected k(Map<K, V> map, w0<? super K, ? extends V> w0Var) {
        super(map);
        if (w0Var != null) {
            this.f336071b = w0Var;
            return;
        }
        throw new NullPointerException("Transformer must not be null.");
    }
}
