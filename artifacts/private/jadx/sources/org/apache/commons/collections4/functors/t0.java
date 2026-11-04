package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class t0<E> implements org.apache.commons.collections4.h<E>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335742d = 3518477308466486130L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super E>[] f335743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.h<? super E>[] f335744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.apache.commons.collections4.h<? super E> f335745c;

    private t0(boolean z10, org.apache.commons.collections4.l0<? super E>[] l0VarArr, org.apache.commons.collections4.h<? super E>[] hVarArr, org.apache.commons.collections4.h<? super E> hVar) {
        this.f335743a = z10 ? v.e(l0VarArr) : l0VarArr;
        this.f335744b = z10 ? v.d(hVarArr) : hVarArr;
        this.f335745c = hVar == null ? e0.b() : hVar;
    }

    public static <E> org.apache.commons.collections4.h<E> e(Map<org.apache.commons.collections4.l0<E>, org.apache.commons.collections4.h<E>> map) {
        if (map == null) {
            throw new NullPointerException("The predicate and closure map must not be null");
        }
        org.apache.commons.collections4.h<E> hVarRemove = map.remove(null);
        int size = map.size();
        if (size == 0) {
            return hVarRemove == null ? e0.b() : hVarRemove;
        }
        org.apache.commons.collections4.h[] hVarArr = new org.apache.commons.collections4.h[size];
        org.apache.commons.collections4.l0[] l0VarArr = new org.apache.commons.collections4.l0[size];
        int i10 = 0;
        for (Map.Entry<org.apache.commons.collections4.l0<E>, org.apache.commons.collections4.h<E>> entry : map.entrySet()) {
            l0VarArr[i10] = entry.getKey();
            hVarArr[i10] = entry.getValue();
            i10++;
        }
        return new t0(false, l0VarArr, hVarArr, hVarRemove);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> org.apache.commons.collections4.h<E> f(org.apache.commons.collections4.l0<? super E>[] l0VarArr, org.apache.commons.collections4.h<? super E>[] hVarArr, org.apache.commons.collections4.h<? super E> hVar) {
        v.h(l0VarArr);
        v.g(hVarArr);
        if (l0VarArr.length != hVarArr.length) {
            throw new IllegalArgumentException("The predicate and closure arrays must be the same size");
        }
        if (l0VarArr.length == 0) {
            return hVar == 0 ? e0.b() : hVar;
        }
        return new t0(l0VarArr, hVarArr, hVar);
    }

    @Override // org.apache.commons.collections4.h
    public void a(E e10) {
        int i10 = 0;
        while (true) {
            org.apache.commons.collections4.l0<? super E>[] l0VarArr = this.f335743a;
            if (i10 >= l0VarArr.length) {
                this.f335745c.a(e10);
                return;
            } else {
                if (l0VarArr[i10].a(e10)) {
                    this.f335744b[i10].a(e10);
                    return;
                }
                i10++;
            }
        }
    }

    public org.apache.commons.collections4.h<? super E>[] b() {
        return v.d(this.f335744b);
    }

    public org.apache.commons.collections4.h<? super E> c() {
        return this.f335745c;
    }

    public org.apache.commons.collections4.l0<? super E>[] d() {
        return v.e(this.f335743a);
    }

    public t0(org.apache.commons.collections4.l0<? super E>[] l0VarArr, org.apache.commons.collections4.h<? super E>[] hVarArr, org.apache.commons.collections4.h<? super E> hVar) {
        this(true, l0VarArr, hVarArr, hVar);
    }
}
