package org.apache.commons.collections4.set;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b<E> extends c<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336284d = 1229469966212206107L;

    protected b(Set<E> set) {
        super(set);
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
