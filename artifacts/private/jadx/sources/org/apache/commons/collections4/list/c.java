package org.apache.commons.collections4.list;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<E> extends b<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335924d = 2684959196747496299L;

    protected c(List<E> list) {
        super(list);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        d((Collection) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(c());
    }
}
