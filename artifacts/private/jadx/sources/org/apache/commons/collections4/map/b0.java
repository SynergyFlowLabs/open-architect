package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class b0<K, V> extends g<K, V> implements Serializable {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final long f336006p1 = 1555089888138299607L;

    public b0() {
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

    public b0(g.h hVar, g.h hVar2) {
        super(hVar, hVar2, 16, 0.75f, false);
    }

    public b0(g.h hVar, g.h hVar2, boolean z10) {
        super(hVar, hVar2, 16, 0.75f, z10);
    }

    public b0(g.h hVar, g.h hVar2, int i10, float f10) {
        super(hVar, hVar2, i10, f10, false);
    }

    public b0(g.h hVar, g.h hVar2, int i10, float f10, boolean z10) {
        super(hVar, hVar2, i10, f10, z10);
    }
}
