package org.apache.commons.collections4.bag;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public class f<E> extends b<E> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335508e = -6561115435802554013L;

    public f() {
        super(new HashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        super.l(new HashMap(), objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        super.m(objectOutputStream);
    }

    public f(Collection<? extends E> collection) {
        this();
        addAll(collection);
    }
}
