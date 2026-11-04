package org.apache.commons.collections4.bidimap;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class f<K, V> extends b<K, V> implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f335546g = 721969328361810L;

    public f() {
        super(new LinkedHashMap(), new LinkedHashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f335520a = new LinkedHashMap();
        this.f335521b = new LinkedHashMap();
        putAll((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f335520a);
    }

    @Override // org.apache.commons.collections4.bidimap.b
    protected org.apache.commons.collections4.e<V, K> a(Map<V, K> map, Map<K, V> map2, org.apache.commons.collections4.e<K, V> eVar) {
        return new f(map, map2, eVar);
    }

    public f(Map<? extends K, ? extends V> map) {
        super(new LinkedHashMap(), new LinkedHashMap());
        putAll(map);
    }

    protected f(Map<K, V> map, Map<V, K> map2, org.apache.commons.collections4.e<V, K> eVar) {
        super(map, map2, eVar);
    }
}
