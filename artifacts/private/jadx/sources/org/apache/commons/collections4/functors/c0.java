package org.apache.commons.collections4.functors;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes14.dex */
public class c0<I, O> implements org.apache.commons.collections4.w0<I, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f335666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?>[] f335667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f335668c;

    private c0(String str) {
        this.f335666a = str;
        this.f335667b = null;
        this.f335668c = null;
    }

    public static <I, O> org.apache.commons.collections4.w0<I, O> b(String str) {
        if (str != null) {
            return new c0(str);
        }
        throw new NullPointerException("The method to invoke must not be null");
    }

    public static <I, O> org.apache.commons.collections4.w0<I, O> c(String str, Class<?>[] clsArr, Object[] objArr) {
        if (str == null) {
            throw new NullPointerException("The method to invoke must not be null");
        }
        if ((clsArr == null && objArr != null) || ((clsArr != null && objArr == null) || (clsArr != null && objArr != null && clsArr.length != objArr.length))) {
            throw new IllegalArgumentException("The parameter types must match the arguments");
        }
        if (clsArr != null && clsArr.length != 0) {
            return new c0(str, clsArr, objArr);
        }
        return new c0(str);
    }

    @Override // org.apache.commons.collections4.w0
    public O a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (O) obj.getClass().getMethod(this.f335666a, this.f335667b).invoke(obj, this.f335668c);
        } catch (IllegalAccessException unused) {
            throw new org.apache.commons.collections4.q("InvokerTransformer: The method '" + this.f335666a + "' on '" + obj.getClass() + "' cannot be accessed");
        } catch (NoSuchMethodException unused2) {
            throw new org.apache.commons.collections4.q("InvokerTransformer: The method '" + this.f335666a + "' on '" + obj.getClass() + "' does not exist");
        } catch (InvocationTargetException e10) {
            throw new org.apache.commons.collections4.q("InvokerTransformer: The method '" + this.f335666a + "' on '" + obj.getClass() + "' threw an exception", e10);
        }
    }

    public c0(String str, Class<?>[] clsArr, Object[] objArr) {
        this.f335666a = str;
        this.f335667b = clsArr != null ? (Class[]) clsArr.clone() : null;
        this.f335668c = objArr != null ? (Object[]) objArr.clone() : null;
    }
}
