package org.apache.commons.collections4.set;

import java.util.Set;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class l<E> extends org.apache.commons.collections4.collection.f<E> implements Set<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336301e = 306127383500410386L;

    protected l(Set<E> set, w0<? super E, ? extends E> w0Var) {
        super(set, w0Var);
    }

    public static <E> Set<E> n(Set<E> set, w0<? super E, ? extends E> w0Var) {
        l lVar = new l(set, w0Var);
        if (set.size() > 0) {
            Object[] array = set.toArray();
            set.clear();
            for (Object obj : array) {
                lVar.c().add(w0Var.a(obj));
            }
        }
        return lVar;
    }

    public static <E> l<E> p(Set<E> set, w0<? super E, ? extends E> w0Var) {
        return new l<>(set, w0Var);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return c().hashCode();
    }
}
