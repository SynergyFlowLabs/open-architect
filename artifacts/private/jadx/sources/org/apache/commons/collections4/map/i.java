package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class i<K, V> extends a<K, V> implements Serializable, Cloneable {
    private static final long X = -7074655917369299456L;

    public i() {
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
    public i<K, V> clone() {
        return (i) super.clone();
    }

    @Override // org.apache.commons.collections4.map.a
    protected Object h(Object obj) {
        if (obj == null) {
            return a.f335977w;
        }
        char[] charArray = obj.toString().toCharArray();
        int length = charArray.length;
        while (true) {
            length--;
            if (length < 0) {
                return new String(charArray);
            }
            charArray[length] = Character.toLowerCase(Character.toUpperCase(charArray[length]));
        }
    }

    public i(int i10) {
        super(i10);
    }

    public i(int i10, float f10) {
        super(i10, f10);
    }

    public i(Map<? extends K, ? extends V> map) {
        super(map);
    }
}
