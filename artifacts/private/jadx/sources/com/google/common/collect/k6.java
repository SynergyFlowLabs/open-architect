package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
final class k6<E extends Enum<E>> extends z6<E> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient EnumSet<E> f117559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @a8.b
    private transient int f117560j;

    @com.google.common.annotations.d
    private static class b<E extends Enum<E>> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117561b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final EnumSet<E> f117562a;

        b(EnumSet<E> delegate) {
            this.f117562a = delegate;
        }

        Object readResolve() {
            return new k6(this.f117562a.clone());
        }
    }

    static <E extends Enum<E>> z6<E> R(EnumSet<E> set) {
        int size = set.size();
        if (size != 0) {
            return size != 1 ? new k6(set) : z6.J((Enum) o7.z(set));
        }
        return z6.G();
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.z6
    boolean F() {
        return true;
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object object) {
        return this.f117559i.contains(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof k6) {
            collection = ((k6) collection).f117559i;
        }
        return this.f117559i.containsAll(collection);
    }

    @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof k6) {
            object = ((k6) object).f117559i;
        }
        return this.f117559i.equals(object);
    }

    @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
    public int hashCode() {
        int i10 = this.f117560j;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f117559i.hashCode();
        this.f117560j = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f117559i.isEmpty();
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return false;
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<E> iterator() {
        return p7.e0(this.f117559i.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f117559i.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f117559i.toString();
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.d
    Object writeReplace() {
        return new b(this.f117559i);
    }

    private k6(EnumSet<E> delegate) {
        this.f117559i = delegate;
    }
}
