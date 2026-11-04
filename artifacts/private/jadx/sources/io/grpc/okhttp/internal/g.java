package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f290615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f290616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class[] f290617c;

    public g(Class<?> cls, String str, Class... clsArr) {
        this.f290615a = cls;
        this.f290616b = str;
        this.f290617c = clsArr;
    }

    private Method a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f290616b;
        if (str == null) {
            return null;
        }
        Method methodB = b(cls, str, this.f290617c);
        if (methodB == null || (cls2 = this.f290615a) == null || cls2.isAssignableFrom(methodB.getReturnType())) {
            return methodB;
        }
        return null;
    }

    private static Method b(Class<?> cls, String str, Class[] clsArr) {
        Method method = null;
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return b(cls.getSuperclass(), str, clsArr);
            }
            Method method2 = cls.getMethod(str, clsArr);
            try {
                if ((method2.getModifiers() & 1) == 0) {
                    return null;
                }
                return method2;
            } catch (NoSuchMethodException unused) {
                method = method2;
                return method;
            }
        } catch (NoSuchMethodException unused2) {
        }
    }

    public Object c(T t10, Object... objArr) throws InvocationTargetException {
        Method methodA = a(t10.getClass());
        if (methodA == null) {
            throw new AssertionError("Method " + this.f290616b + " not supported for object " + t10);
        }
        try {
            return methodA.invoke(t10, objArr);
        } catch (IllegalAccessException e10) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodA);
            assertionError.initCause(e10);
            throw assertionError;
        }
    }

    public Object d(T t10, Object... objArr) throws InvocationTargetException {
        Method methodA = a(t10.getClass());
        if (methodA == null) {
            return null;
        }
        try {
            return methodA.invoke(t10, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object e(T t10, Object... objArr) {
        try {
            return d(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object f(T t10, Object... objArr) {
        try {
            return c(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean g(T t10) {
        return a(t10.getClass()) != null;
    }
}
