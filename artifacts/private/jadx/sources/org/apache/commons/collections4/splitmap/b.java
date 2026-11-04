package org.apache.commons.collections4.splitmap;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import org.apache.commons.collections4.map.t;
import org.apache.commons.collections4.n0;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class b<J, K, U, V> extends a<K, V> implements n0<J, U>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336307d = 5966875321133456994L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0<? super J, ? extends K> f336308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0<? super U, ? extends V> f336309c;

    protected b(Map<K, V> map, w0<? super J, ? extends K> w0Var, w0<? super U, ? extends V> w0Var2) {
        super(map);
        if (w0Var == null) {
            throw new NullPointerException("KeyTransformer must not be null.");
        }
        this.f336308b = w0Var;
        if (w0Var2 == null) {
            throw new NullPointerException("ValueTransformer must not be null.");
        }
        this.f336309c = w0Var2;
    }

    public static <J, K, U, V> b<J, K, U, V> f(Map<K, V> map, w0<? super J, ? extends K> w0Var, w0<? super U, ? extends V> w0Var2) {
        return new b<>(map, w0Var, w0Var2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336306a = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(a());
    }

    protected V b(U u10) {
        return this.f336309c.a(u10);
    }

    protected K c(J j10) {
        return this.f336308b.a(j10);
    }

    @Override // org.apache.commons.collections4.n0
    public void clear() {
        a().clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected Map<K, V> d(Map<? extends J, ? extends U> map) {
        if (map.isEmpty()) {
            return map;
        }
        t tVar = new t(map.size());
        for (Map.Entry entry : map.entrySet()) {
            tVar.put(c(entry.getKey()), e(entry.getValue()));
        }
        return tVar;
    }

    protected V e(U u10) {
        return this.f336309c.a(u10);
    }

    @Override // org.apache.commons.collections4.n0
    public V put(J j10, U u10) {
        return a().put(c(j10), e(u10));
    }

    @Override // org.apache.commons.collections4.n0
    public void putAll(Map<? extends J, ? extends U> map) {
        a().putAll(d(map));
    }
}
