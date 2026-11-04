package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f125496a = c();

    class a extends l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f125497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f125498c;

        a(Method method, Object obj) {
            this.f125497b = method;
            this.f125498c = obj;
        }

        @Override // com.google.gson.internal.l0
        public <T> T d(Class<T> cls) throws Exception {
            l0.b(cls);
            return (T) this.f125497b.invoke(this.f125498c, cls);
        }
    }

    class b extends l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f125499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f125500c;

        b(Method method, int i10) {
            this.f125499b = method;
            this.f125500c = i10;
        }

        @Override // com.google.gson.internal.l0
        public <T> T d(Class<T> cls) throws Exception {
            l0.b(cls);
            int i10 = 7 & 0;
            return (T) this.f125499b.invoke(null, cls, Integer.valueOf(this.f125500c));
        }
    }

    class c extends l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f125501b;

        c(Method method) {
            this.f125501b = method;
        }

        @Override // com.google.gson.internal.l0
        public <T> T d(Class<T> cls) throws Exception {
            l0.b(cls);
            int i10 = 3 & 0;
            return (T) this.f125501b.invoke(null, cls, Object.class);
        }
    }

    class d extends l0 {
        d() {
        }

        @Override // com.google.gson.internal.l0
        public <T> T d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class<?> cls) {
        String strV = v.v(cls);
        if (strV == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strV);
    }

    private static l0 c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    return new c(declaredMethod);
                }
            } catch (Exception unused2) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                return new b(declaredMethod3, iIntValue);
            }
        } catch (Exception unused3) {
            return new d();
        }
    }

    public abstract <T> T d(Class<T> cls) throws Exception;
}
