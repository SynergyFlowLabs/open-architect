package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class u0<I, O> implements org.apache.commons.collections4.w0<I, O>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335748d = -6404460890903469332L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super I>[] f335749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.w0<? super I, ? extends O>[] f335750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.apache.commons.collections4.w0<? super I, ? extends O> f335751c;

    private u0(boolean z10, org.apache.commons.collections4.l0<? super I>[] l0VarArr, org.apache.commons.collections4.w0<? super I, ? extends O>[] w0VarArr, org.apache.commons.collections4.w0<? super I, ? extends O> w0Var) {
        this.f335749a = z10 ? v.e(l0VarArr) : l0VarArr;
        this.f335750b = z10 ? v.f(w0VarArr) : w0VarArr;
        this.f335751c = w0Var == null ? l.d() : w0Var;
    }

    public static <I, O> org.apache.commons.collections4.w0<I, O> e(Map<? extends org.apache.commons.collections4.l0<? super I>, ? extends org.apache.commons.collections4.w0<? super I, ? extends O>> map) {
        if (map == null) {
            throw new NullPointerException("The predicate and transformer map must not be null");
        }
        if (map.size() == 0) {
            return l.d();
        }
        org.apache.commons.collections4.w0<? super I, ? extends O> w0VarRemove = map.remove(null);
        int size = map.size();
        if (size == 0) {
            return w0VarRemove == null ? l.d() : w0VarRemove;
        }
        org.apache.commons.collections4.w0[] w0VarArr = new org.apache.commons.collections4.w0[size];
        org.apache.commons.collections4.l0[] l0VarArr = new org.apache.commons.collections4.l0[size];
        int i10 = 0;
        for (Map.Entry<? extends org.apache.commons.collections4.l0<? super I>, ? extends org.apache.commons.collections4.w0<? super I, ? extends O>> entry : map.entrySet()) {
            l0VarArr[i10] = entry.getKey();
            w0VarArr[i10] = entry.getValue();
            i10++;
        }
        return new u0(false, l0VarArr, w0VarArr, w0VarRemove);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <I, O> org.apache.commons.collections4.w0<I, O> f(org.apache.commons.collections4.l0<? super I>[] l0VarArr, org.apache.commons.collections4.w0<? super I, ? extends O>[] w0VarArr, org.apache.commons.collections4.w0<? super I, ? extends O> w0Var) {
        v.h(l0VarArr);
        v.i(w0VarArr);
        if (l0VarArr.length != w0VarArr.length) {
            throw new IllegalArgumentException("The predicate and transformer arrays must be the same size");
        }
        if (l0VarArr.length == 0) {
            return w0Var == 0 ? l.d() : w0Var;
        }
        return new u0(l0VarArr, w0VarArr, w0Var);
    }

    @Override // org.apache.commons.collections4.w0
    public O a(I i10) {
        int i11 = 0;
        while (true) {
            org.apache.commons.collections4.l0<? super I>[] l0VarArr = this.f335749a;
            if (i11 >= l0VarArr.length) {
                return this.f335751c.a(i10);
            }
            if (l0VarArr[i11].a(i10)) {
                return this.f335750b[i11].a(i10);
            }
            i11++;
        }
    }

    public org.apache.commons.collections4.w0<? super I, ? extends O> b() {
        return this.f335751c;
    }

    public org.apache.commons.collections4.l0<? super I>[] c() {
        return v.e(this.f335749a);
    }

    public org.apache.commons.collections4.w0<? super I, ? extends O>[] d() {
        return v.f(this.f335750b);
    }

    public u0(org.apache.commons.collections4.l0<? super I>[] l0VarArr, org.apache.commons.collections4.w0<? super I, ? extends O>[] w0VarArr, org.apache.commons.collections4.w0<? super I, ? extends O> w0Var) {
        this(true, l0VarArr, w0VarArr, w0Var);
    }
}
