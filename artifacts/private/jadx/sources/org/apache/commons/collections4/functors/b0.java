package org.apache.commons.collections4.functors;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes14.dex */
public class b0<T> implements org.apache.commons.collections4.w0<Class<? extends T>, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final org.apache.commons.collections4.w0 f335660c = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?>[] f335661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f335662b;

    private b0() {
        this.f335661a = null;
        this.f335662b = null;
    }

    public static <T> org.apache.commons.collections4.w0<Class<? extends T>, T> b() {
        return f335660c;
    }

    public static <T> org.apache.commons.collections4.w0<Class<? extends T>, T> c(Class<?>[] clsArr, Object[] objArr) {
        if ((clsArr == null && objArr != null) || ((clsArr != null && objArr == null) || (clsArr != null && objArr != null && clsArr.length != objArr.length))) {
            throw new IllegalArgumentException("Parameter types must match the arguments");
        }
        return (clsArr == null || clsArr.length == 0) ? new b0() : new b0(clsArr, objArr);
    }

    @Override // org.apache.commons.collections4.w0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T a(Class<? extends T> cls) {
        try {
            if (cls != null) {
                return cls.getConstructor(this.f335661a).newInstance(this.f335662b);
            }
            throw new org.apache.commons.collections4.q("InstantiateTransformer: Input object was not an instanceof Class, it was a null object");
        } catch (IllegalAccessException e10) {
            throw new org.apache.commons.collections4.q("InstantiateTransformer: Constructor must be public", e10);
        } catch (InstantiationException e11) {
            throw new org.apache.commons.collections4.q("InstantiateTransformer: InstantiationException", e11);
        } catch (NoSuchMethodException unused) {
            throw new org.apache.commons.collections4.q("InstantiateTransformer: The constructor must exist and be public ");
        } catch (InvocationTargetException e12) {
            throw new org.apache.commons.collections4.q("InstantiateTransformer: Constructor threw an exception", e12);
        }
    }

    public b0(Class<?>[] clsArr, Object[] objArr) {
        this.f335661a = clsArr != null ? (Class[]) clsArr.clone() : null;
        this.f335662b = objArr != null ? (Object[]) objArr.clone() : null;
    }
}
