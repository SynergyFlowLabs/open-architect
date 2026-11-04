package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
abstract class e6<E> extends l6<E> {

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117361b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h6<?> f117362a;

        a(h6<?> collection) {
            this.f117362a = collection;
        }

        Object readResolve() {
            return this.f117362a.c();
        }
    }

    e6() {
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract h6<E> b0();

    @Override // com.google.common.collect.l6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object target) {
        return b0().contains(target);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return b0().isEmpty();
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return b0().m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return b0().size();
    }

    @Override // com.google.common.collect.l6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return new a(b0());
    }
}
