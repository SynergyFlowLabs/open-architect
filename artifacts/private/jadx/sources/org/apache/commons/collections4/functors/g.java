package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public class g<T> implements org.apache.commons.collections4.w0<T, T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335678b = 3514945074733160196L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.w0<? super T, ? extends T>[] f335679a;

    private g(boolean z10, org.apache.commons.collections4.w0<? super T, ? extends T>[] w0VarArr) {
        this.f335679a = z10 ? v.f(w0VarArr) : w0VarArr;
    }

    public static <T> org.apache.commons.collections4.w0<T, T> b(Collection<? extends org.apache.commons.collections4.w0<? super T, ? extends T>> collection) {
        if (collection == null) {
            throw new NullPointerException("Transformer collection must not be null");
        }
        if (collection.size() == 0) {
            return f0.b();
        }
        org.apache.commons.collections4.w0[] w0VarArr = (org.apache.commons.collections4.w0[]) collection.toArray(new org.apache.commons.collections4.w0[collection.size()]);
        v.i(w0VarArr);
        return new g(false, w0VarArr);
    }

    public static <T> org.apache.commons.collections4.w0<T, T> c(org.apache.commons.collections4.w0<? super T, ? extends T>... w0VarArr) {
        v.i(w0VarArr);
        return w0VarArr.length == 0 ? f0.b() : new g(w0VarArr);
    }

    @Override // org.apache.commons.collections4.w0
    public T a(T t10) {
        for (org.apache.commons.collections4.w0<? super T, ? extends T> w0Var : this.f335679a) {
            t10 = w0Var.a(t10);
        }
        return t10;
    }

    public org.apache.commons.collections4.w0<? super T, ? extends T>[] d() {
        return v.f(this.f335679a);
    }

    public g(org.apache.commons.collections4.w0<? super T, ? extends T>... w0VarArr) {
        this(true, w0VarArr);
    }
}
