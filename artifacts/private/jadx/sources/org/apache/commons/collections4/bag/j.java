package org.apache.commons.collections4.bag;

import java.util.Comparator;
import org.apache.commons.collections4.t0;

/* JADX INFO: loaded from: classes14.dex */
public class j<E> extends i<E> implements t0<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335514e = 722374056718497858L;

    protected j(t0<E> t0Var) {
        super(t0Var);
    }

    public static <E> j<E> m(t0<E> t0Var) {
        return new j<>(t0Var);
    }

    @Override // org.apache.commons.collections4.t0
    public synchronized Comparator<? super E> comparator() {
        Comparator<? super E> comparator;
        try {
            synchronized (this.f335613b) {
                comparator = l().comparator();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return comparator;
    }

    @Override // org.apache.commons.collections4.t0
    public synchronized E first() {
        E eFirst;
        try {
            synchronized (this.f335613b) {
                try {
                    eFirst = l().first();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return eFirst;
    }

    protected t0<E> l() {
        return (t0) c();
    }

    @Override // org.apache.commons.collections4.t0
    public synchronized E last() {
        E eLast;
        synchronized (this.f335613b) {
            try {
                eLast = l().last();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eLast;
    }

    protected j(org.apache.commons.collections4.c<E> cVar, Object obj) {
        super(cVar, obj);
    }
}
