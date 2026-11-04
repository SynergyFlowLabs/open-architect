package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Method f339192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Method f339193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static Method f339194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static Constructor f339195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static Class<?> f339196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static b f339197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static Method f339198g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339199a;

        static {
            int[] iArr = new int[b.values().length];
            f339199a = iArr;
            try {
                iArr[b.ARGS_LONG_INT_REF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339199a[b.ARGS_LONG_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339199a[b.ARGS_INT_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339199a[b.ARGS_MB_INT_INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    enum b {
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT
    }

    static {
        Constructor<?> declaredConstructor;
        Method method;
        b bVar;
        Class cls = Long.TYPE;
        Class cls2 = Integer.TYPE;
        try {
            Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("java.nio.DirectByteBuffer");
            f339196e = clsLoadClass;
            try {
                try {
                    try {
                        declaredConstructor = clsLoadClass.getDeclaredConstructor(cls, cls2, Object.class);
                        bVar = b.ARGS_LONG_INT_REF;
                    } catch (NoSuchMethodException unused) {
                        Class<?> cls3 = Class.forName("java.nio.MemoryBlock");
                        Method declaredMethod = cls3.getDeclaredMethod("wrapFromJni", cls2, cls);
                        declaredMethod.setAccessible(true);
                        declaredConstructor = f339196e.getDeclaredConstructor(cls3, cls2, cls2);
                        method = declaredMethod;
                        bVar = b.ARGS_MB_INT_INT;
                    }
                } catch (NoSuchMethodException unused2) {
                    declaredConstructor = f339196e.getDeclaredConstructor(cls2, cls2);
                    bVar = b.ARGS_INT_INT;
                }
            } catch (NoSuchMethodException unused3) {
                declaredConstructor = f339196e.getDeclaredConstructor(cls, cls2);
                bVar = b.ARGS_LONG_INT;
            }
            method = null;
            f339195d = declaredConstructor;
            f339197f = bVar;
            f339198g = method;
            if (declaredConstructor == null) {
                throw new RuntimeException("Constructor of DirectByteBuffer is not found");
            }
            declaredConstructor.setAccessible(true);
            Method declaredMethod2 = f339196e.getDeclaredMethod("address", null);
            f339192a = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = f339196e.getDeclaredMethod("cleaner", null);
            f339193b = declaredMethod3;
            declaredMethod3.setAccessible(true);
            Method declaredMethod4 = f339193b.getReturnType().getDeclaredMethod("clean", null);
            f339194c = declaredMethod4;
            declaredMethod4.setAccessible(true);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private f() {
    }

    static void a(Object obj) {
        try {
            f339194c.invoke(f339193b.invoke(obj, null), null);
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    static long b(Object obj) {
        try {
            return ((Long) f339192a.invoke(obj, null)).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    static boolean c(Object obj) {
        return f339196e.isInstance(obj);
    }

    static ByteBuffer d(long j10, int i10, int i11, ByteBuffer byteBuffer) {
        try {
            int i12 = a.f339199a[f339197f.ordinal()];
            if (i12 == 1) {
                return (ByteBuffer) f339195d.newInstance(Long.valueOf(j10 + ((long) i10)), Integer.valueOf(i11), byteBuffer);
            }
            if (i12 == 2) {
                return (ByteBuffer) f339195d.newInstance(Long.valueOf(j10 + ((long) i10)), Integer.valueOf(i11));
            }
            if (i12 == 3) {
                return (ByteBuffer) f339195d.newInstance(Integer.valueOf(((int) j10) + i10), Integer.valueOf(i11));
            }
            if (i12 == 4) {
                return (ByteBuffer) f339195d.newInstance(f339198g.invoke(null, Long.valueOf(j10 + ((long) i10)), Integer.valueOf(i11)), Integer.valueOf(i11), 0);
            }
            throw new IllegalStateException("Unexpected value");
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }
}
