package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class f<E> implements org.apache.commons.collections4.h<E>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335674b = -3520677225766901240L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.h<? super E>[] f335675a;

    private f(boolean z10, org.apache.commons.collections4.h<? super E>... hVarArr) {
        this.f335675a = z10 ? v.d(hVarArr) : hVarArr;
    }

    public static <E> org.apache.commons.collections4.h<E> b(Collection<? extends org.apache.commons.collections4.h<? super E>> collection) {
        if (collection == null) {
            throw new NullPointerException("Closure collection must not be null");
        }
        if (collection.size() == 0) {
            return e0.b();
        }
        org.apache.commons.collections4.h[] hVarArr = new org.apache.commons.collections4.h[collection.size()];
        Iterator<? extends org.apache.commons.collections4.h<? super E>> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            hVarArr[i10] = it.next();
            i10++;
        }
        v.g(hVarArr);
        return new f(false, hVarArr);
    }

    public static <E> org.apache.commons.collections4.h<E> c(org.apache.commons.collections4.h<? super E>... hVarArr) {
        v.g(hVarArr);
        return hVarArr.length == 0 ? e0.b() : new f(hVarArr);
    }

    @Override // org.apache.commons.collections4.h
    public void a(E e10) {
        for (org.apache.commons.collections4.h<? super E> hVar : this.f335675a) {
            hVar.a(e10);
        }
    }

    public org.apache.commons.collections4.h<? super E>[] d() {
        return v.d(this.f335675a);
    }

    public f(org.apache.commons.collections4.h<? super E>... hVarArr) {
        this(true, hVarArr);
    }
}
