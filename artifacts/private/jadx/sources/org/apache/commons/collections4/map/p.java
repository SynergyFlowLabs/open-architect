package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class p<K, V> extends a<K, V> implements Serializable, Cloneable {
    private static final long X = -1788199231038721040L;

    public p() {
        super(16, 0.75f, 12);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        o(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        p(objectOutputStream);
    }

    @Override // org.apache.commons.collections4.map.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public p<K, V> clone() {
        return (p) super.clone();
    }

    public p(int i10) {
        super(i10);
    }

    public p(int i10, float f10) {
        super(i10, f10);
    }

    public p(Map<? extends K, ? extends V> map) {
        super(map);
    }
}
