package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class k2 implements l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f289312b = Logger.getLogger(k2.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor<?> f289313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f289314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f289315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final RuntimeException f289316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object[] f289317g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f289318a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", null);
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = constructors[i10];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    f289312b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                    constructor = null;
                }
            } catch (Throwable th3) {
                th = th3;
                method2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            method = null;
            method2 = null;
        }
        if (th != null || constructor == null) {
            f289313c = null;
            f289314d = null;
            f289315e = null;
            f289316f = new RuntimeException(th);
        } else {
            f289313c = constructor;
            f289314d = method;
            f289315e = method2;
            f289316f = null;
        }
        f289317g = new Object[]{1L};
    }

    k2() {
        RuntimeException runtimeException = f289316f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f289318a = f289313c.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    static boolean a() {
        return f289316f == null;
    }

    @Override // io.grpc.internal.l1
    public void add(long j10) {
        try {
            f289314d.invoke(this.f289318a, j10 == 1 ? f289317g : new Object[]{Long.valueOf(j10)});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // io.grpc.internal.l1
    public long value() {
        try {
            return ((Long) f289315e.invoke(this.f289318a, null)).longValue();
        } catch (IllegalAccessException unused) {
            throw new RuntimeException();
        } catch (InvocationTargetException unused2) {
            throw new RuntimeException();
        }
    }
}
