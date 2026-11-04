package org.apache.commons.collections4.multiset;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public class d<E> extends a<E> implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f336228f = 20150610;

    public d() {
        super(new HashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        v(new HashMap());
        super.m(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        super.n(objectOutputStream);
    }

    public d(Collection<? extends E> collection) {
        this();
        addAll(collection);
    }
}
