package com.nineoldandroids.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
class e<T, V> extends d<T, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f131300f = "get";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f131301g = "is";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f131302h = "set";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Method f131303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Method f131304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Field f131305e;

    public e(Class<T> cls, Class<V> cls2, String str) {
        super(cls2, str);
        boolean z10 = false & false;
        String str2 = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        String str3 = f131300f + str2;
        try {
            try {
                this.f131304d = cls.getMethod(str3, null);
            } catch (NoSuchMethodException unused) {
                String str4 = f131301g + str2;
                try {
                    try {
                        try {
                            this.f131304d = cls.getMethod(str4, null);
                        } catch (NoSuchFieldException unused2) {
                            throw new c("No accessor method or field found for property with name " + str);
                        }
                    } catch (NoSuchMethodException unused3) {
                        Field field = cls.getField(str);
                        this.f131305e = field;
                        Class<?> type = field.getType();
                        if (g(cls2, type)) {
                            return;
                        }
                        throw new c("Underlying type (" + type + ") does not match Property type (" + cls2 + ")");
                    }
                } catch (NoSuchMethodException unused4) {
                    Method declaredMethod = cls.getDeclaredMethod(str4, null);
                    this.f131304d = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
            }
        } catch (NoSuchMethodException unused5) {
            Method declaredMethod2 = cls.getDeclaredMethod(str3, null);
            this.f131304d = declaredMethod2;
            declaredMethod2.setAccessible(true);
        }
        Class<?> returnType = this.f131304d.getReturnType();
        if (g(cls2, returnType)) {
            try {
                Method declaredMethod3 = cls.getDeclaredMethod(f131302h + str2, returnType);
                this.f131303c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                return;
            } catch (NoSuchMethodException unused6) {
                return;
            }
        }
        throw new c("Underlying type (" + returnType + ") does not match Property type (" + cls2 + ")");
    }

    private boolean g(Class<V> cls, Class cls2) {
        if (cls2 != cls) {
            return cls2.isPrimitive() && ((cls2 == Float.TYPE && cls == Float.class) || ((cls2 == Integer.TYPE && cls == Integer.class) || ((cls2 == Boolean.TYPE && cls == Boolean.class) || ((cls2 == Long.TYPE && cls == Long.class) || ((cls2 == Double.TYPE && cls == Double.class) || ((cls2 == Short.TYPE && cls == Short.class) || ((cls2 == Byte.TYPE && cls == Byte.class) || (cls2 == Character.TYPE && cls == Character.class))))))));
        }
        return true;
    }

    @Override // com.nineoldandroids.util.d
    public V a(T t10) {
        Method method = this.f131304d;
        if (method != null) {
            try {
                return (V) method.invoke(t10, null);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        Field field = this.f131305e;
        if (field == null) {
            throw new AssertionError();
        }
        try {
            return (V) field.get(t10);
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    @Override // com.nineoldandroids.util.d
    public boolean d() {
        return this.f131303c == null && this.f131305e == null;
    }

    @Override // com.nineoldandroids.util.d
    public void f(T t10, V v10) {
        Method method = this.f131303c;
        if (method != null) {
            try {
                method.invoke(t10, v10);
                return;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        Field field = this.f131305e;
        if (field != null) {
            try {
                field.set(t10, v10);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        } else {
            throw new UnsupportedOperationException("Property " + b() + " is read-only");
        }
    }
}
