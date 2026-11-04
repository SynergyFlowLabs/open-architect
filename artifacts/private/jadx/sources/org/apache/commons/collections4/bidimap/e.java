package org.apache.commons.collections4.bidimap;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class e<K, V> extends b<K, V> implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f335545g = 721969328361808L;

    public e() {
        super(new HashMap(), new HashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f335520a = new HashMap();
        this.f335521b = new HashMap();
        putAll((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f335520a);
    }

    @Override // org.apache.commons.collections4.bidimap.b
    protected org.apache.commons.collections4.e<V, K> a(Map<V, K> map, Map<K, V> map2, org.apache.commons.collections4.e<K, V> eVar) {
        return new e(map, map2, eVar);
    }

    public e(Map<? extends K, ? extends V> map) {
        super(new HashMap(), new HashMap());
        putAll(map);
    }

    protected e(Map<K, V> map, Map<V, K> map2, org.apache.commons.collections4.e<V, K> eVar) {
        super(map, map2, eVar);
    }
}
