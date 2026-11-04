package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
abstract class c<T> {

    class a extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f267130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f267131b;

        a(Constructor constructor, Class cls) {
            this.f267130a = constructor;
            this.f267131b = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return (T) this.f267130a.newInstance(null);
        }

        public String toString() {
            return this.f267131b.getName();
        }
    }

    class b extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f267132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f267133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f267134c;

        b(Method method, Object obj, Class cls) {
            this.f267132a = method;
            this.f267133b = obj;
            this.f267134c = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f267132a.invoke(this.f267133b, this.f267134c);
        }

        public String toString() {
            return this.f267134c.getName();
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.c$c, reason: collision with other inner class name */
    class C1871c extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f267135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f267136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f267137c;

        C1871c(Method method, Class cls, int i10) {
            this.f267135a = method;
            this.f267136b = cls;
            this.f267137c = i10;
        }

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f267135a.invoke(null, this.f267136b, Integer.valueOf(this.f267137c));
        }

        public String toString() {
            return this.f267136b.getName();
        }
    }

    class d extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f267138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f267139b;

        d(Method method, Class cls) {
            this.f267138a = method;
            this.f267139b = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f267138a.invoke(null, this.f267139b, Object.class);
        }

        public String toString() {
            return this.f267139b.getName();
        }
    }

    c() {
    }

    public static <T> c<T> a(Class<?> cls) {
        int i10 = 0 >> 1;
        try {
            try {
                try {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new a(declaredConstructor, cls);
                    } catch (NoSuchMethodException unused) {
                        Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                        Field declaredField = cls2.getDeclaredField("theUnsafe");
                        declaredField.setAccessible(true);
                        return new b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                    }
                } catch (Exception unused2) {
                    throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new C1871c(declaredMethod2, cls, iIntValue);
            } catch (IllegalAccessException unused4) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused5) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new d(declaredMethod3, cls);
        } catch (InvocationTargetException e10) {
            throw Util.x(e10);
        }
    }

    abstract T b() throws IllegalAccessException, InstantiationException, InvocationTargetException;
}
