package org.apache.commons.collections4.functors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes14.dex */
public class a0<T> implements org.apache.commons.collections4.n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f335652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?>[] f335653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f335654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Constructor<T> f335655d;

    public a0(Class<T> cls) {
        this.f335655d = null;
        this.f335652a = cls;
        this.f335653b = null;
        this.f335654c = null;
        a();
    }

    private void a() {
        try {
            this.f335655d = this.f335652a.getConstructor(this.f335653b);
        } catch (NoSuchMethodException unused) {
            throw new IllegalArgumentException("InstantiateFactory: The constructor must exist and be public ");
        }
    }

    public static <T> org.apache.commons.collections4.n<T> b(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        if (cls == null) {
            throw new NullPointerException("Class to instantiate must not be null");
        }
        if ((clsArr == null && objArr != null) || ((clsArr != null && objArr == null) || (clsArr != null && objArr != null && clsArr.length != objArr.length))) {
            throw new IllegalArgumentException("Parameter types must match the arguments");
        }
        return (clsArr == null || clsArr.length == 0) ? new a0(cls) : new a0(cls, clsArr, objArr);
    }

    @Override // org.apache.commons.collections4.n
    public T k() {
        if (this.f335655d == null) {
            a();
        }
        try {
            return this.f335655d.newInstance(this.f335654c);
        } catch (IllegalAccessException e10) {
            throw new org.apache.commons.collections4.q("InstantiateFactory: Constructor must be public", e10);
        } catch (InstantiationException e11) {
            throw new org.apache.commons.collections4.q("InstantiateFactory: InstantiationException", e11);
        } catch (InvocationTargetException e12) {
            throw new org.apache.commons.collections4.q("InstantiateFactory: Constructor threw an exception", e12);
        }
    }

    public a0(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        this.f335655d = null;
        this.f335652a = cls;
        this.f335653b = (Class[]) clsArr.clone();
        this.f335654c = (Object[]) objArr.clone();
        a();
    }
}
