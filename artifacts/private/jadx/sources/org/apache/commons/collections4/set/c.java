package org.apache.commons.collections4.set;

import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<E> extends org.apache.commons.collections4.collection.a<E> implements Set<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336285c = -4678668309576958546L;

    protected c() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this && !c().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return c().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<E> c() {
        return (Set) super.c();
    }

    protected c(Set<E> set) {
        super(set);
    }
}
