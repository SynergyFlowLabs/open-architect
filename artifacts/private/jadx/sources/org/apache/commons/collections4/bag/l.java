package org.apache.commons.collections4.bag;

import java.util.Comparator;
import org.apache.commons.collections4.t0;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class l<E> extends k<E> implements t0<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f335516f = -251737742649401930L;

    protected l(t0<E> t0Var, w0<? super E, ? extends E> w0Var) {
        super(t0Var, w0Var);
    }

    public static <E> l<E> t(t0<E> t0Var, w0<? super E, ? extends E> w0Var) {
        l<E> lVar = new l<>(t0Var, w0Var);
        if (t0Var.size() > 0) {
            Object[] array = t0Var.toArray();
            t0Var.clear();
            for (Object obj : array) {
                lVar.c().add(w0Var.a(obj));
            }
        }
        return lVar;
    }

    public static <E> l<E> u(t0<E> t0Var, w0<? super E, ? extends E> w0Var) {
        return new l<>(t0Var, w0Var);
    }

    @Override // org.apache.commons.collections4.t0
    public Comparator<? super E> comparator() {
        return s().comparator();
    }

    @Override // org.apache.commons.collections4.t0
    public E first() {
        return s().first();
    }

    @Override // org.apache.commons.collections4.t0
    public E last() {
        return s().last();
    }

    protected t0<E> s() {
        return (t0) c();
    }
}
