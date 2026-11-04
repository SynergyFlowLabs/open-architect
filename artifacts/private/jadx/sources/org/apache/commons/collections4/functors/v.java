package org.apache.commons.collections4.functors;

import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
class v {
    private v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> org.apache.commons.collections4.h<T> a(org.apache.commons.collections4.h<? super T> hVar) {
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> org.apache.commons.collections4.l0<T> b(org.apache.commons.collections4.l0<? super T> l0Var) {
        return l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <I, O> org.apache.commons.collections4.w0<I, O> c(org.apache.commons.collections4.w0<? super I, ? extends O> w0Var) {
        return w0Var;
    }

    static <E> org.apache.commons.collections4.h<E>[] d(org.apache.commons.collections4.h<? super E>... hVarArr) {
        if (hVarArr == null) {
            return null;
        }
        return (org.apache.commons.collections4.h[]) hVarArr.clone();
    }

    static <T> org.apache.commons.collections4.l0<T>[] e(org.apache.commons.collections4.l0<? super T>... l0VarArr) {
        if (l0VarArr == null) {
            return null;
        }
        return (org.apache.commons.collections4.l0[]) l0VarArr.clone();
    }

    static <I, O> org.apache.commons.collections4.w0<I, O>[] f(org.apache.commons.collections4.w0<? super I, ? extends O>... w0VarArr) {
        if (w0VarArr == null) {
            return null;
        }
        return (org.apache.commons.collections4.w0[]) w0VarArr.clone();
    }

    static void g(org.apache.commons.collections4.h<?>... hVarArr) {
        if (hVarArr == null) {
            throw new NullPointerException("The closure array must not be null");
        }
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            if (hVarArr[i10] == null) {
                throw new NullPointerException("The closure array must not contain a null closure, index " + i10 + " was null");
            }
        }
    }

    static void h(org.apache.commons.collections4.l0<?>... l0VarArr) {
        if (l0VarArr == null) {
            throw new NullPointerException("The predicate array must not be null");
        }
        for (int i10 = 0; i10 < l0VarArr.length; i10++) {
            if (l0VarArr[i10] == null) {
                throw new NullPointerException("The predicate array must not contain a null predicate, index " + i10 + " was null");
            }
        }
    }

    static void i(org.apache.commons.collections4.w0<?, ?>... w0VarArr) {
        if (w0VarArr == null) {
            throw new NullPointerException("The transformer array must not be null");
        }
        for (int i10 = 0; i10 < w0VarArr.length; i10++) {
            if (w0VarArr[i10] == null) {
                throw new NullPointerException("The transformer array must not contain a null transformer, index " + i10 + " was null");
            }
        }
    }

    static <T> org.apache.commons.collections4.l0<? super T>[] j(Collection<? extends org.apache.commons.collections4.l0<? super T>> collection) {
        if (collection == null) {
            throw new NullPointerException("The predicate collection must not be null");
        }
        org.apache.commons.collections4.l0<? super T>[] l0VarArr = new org.apache.commons.collections4.l0[collection.size()];
        int i10 = 0;
        for (org.apache.commons.collections4.l0<? super T> l0Var : collection) {
            l0VarArr[i10] = l0Var;
            if (l0Var == null) {
                throw new NullPointerException("The predicate collection must not contain a null predicate, index " + i10 + " was null");
            }
            i10++;
        }
        return l0VarArr;
    }
}
