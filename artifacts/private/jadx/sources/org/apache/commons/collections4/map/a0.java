package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;

/* JADX INFO: loaded from: classes14.dex */
public class a0<K, V> extends g<K, V> implements Serializable {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final long f335998p1 = -1266190134568365852L;

    public a0() {
        super(g.h.HARD, g.h.SOFT, 16, 0.75f, false);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        o(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        p(objectOutputStream);
    }

    @Override // org.apache.commons.collections4.map.g, org.apache.commons.collections4.map.a
    protected boolean B(Object obj, Object obj2) {
        if (!O(g.h.HARD)) {
            obj2 = ((Reference) obj2).get();
        }
        return obj == obj2;
    }

    @Override // org.apache.commons.collections4.map.a
    protected boolean C(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // org.apache.commons.collections4.map.g
    protected int M(Object obj, Object obj2) {
        return System.identityHashCode(obj) ^ System.identityHashCode(obj2);
    }

    @Override // org.apache.commons.collections4.map.a
    protected int x(Object obj) {
        return System.identityHashCode(obj);
    }

    public a0(g.h hVar, g.h hVar2) {
        super(hVar, hVar2, 16, 0.75f, false);
    }

    public a0(g.h hVar, g.h hVar2, boolean z10) {
        super(hVar, hVar2, 16, 0.75f, z10);
    }

    public a0(g.h hVar, g.h hVar2, int i10, float f10) {
        super(hVar, hVar2, i10, f10, false);
    }

    public a0(g.h hVar, g.h hVar2, int i10, float f10, boolean z10) {
        super(hVar, hVar2, i10, f10, z10);
    }
}
