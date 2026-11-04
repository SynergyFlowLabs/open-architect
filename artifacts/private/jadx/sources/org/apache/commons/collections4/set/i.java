package org.apache.commons.collections4.set;

import java.util.Set;
import org.apache.commons.collections4.l0;

/* JADX INFO: loaded from: classes14.dex */
public class i<E> extends org.apache.commons.collections4.collection.d<E> implements Set<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336298e = -684521469108685117L;

    protected i(Set<E> set, l0<? super E> l0Var) {
        super(set, l0Var);
    }

    public static <E> i<E> p(Set<E> set, l0<? super E> l0Var) {
        return new i<>(set, l0Var);
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
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Set<E> c() {
        return (Set) super.c();
    }
}
