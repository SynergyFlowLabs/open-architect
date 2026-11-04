package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f107688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f107689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f107690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j6 f107691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f107692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f107693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final boolean f107694g;

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    static {
        boolean z10;
        boolean z11;
        j6 j6Var;
        Unsafe unsafeG = g();
        f107688a = unsafeG;
        int i10 = p2.f107733a;
        f107689b = Memory.class;
        Class cls = Long.TYPE;
        boolean zS = s(cls);
        f107690c = zS;
        Class cls2 = Integer.TYPE;
        boolean zS2 = s(cls2);
        j6 h6Var = null;
        if (unsafeG != null) {
            if (zS) {
                h6Var = new i6(unsafeG);
            } else if (zS2) {
                h6Var = new h6(unsafeG);
            }
        }
        f107691d = h6Var;
        if (h6Var == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = h6Var.f107673a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (y() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                h(th2);
            }
        }
        f107692e = z10;
        j6 j6Var2 = f107691d;
        if (j6Var2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = j6Var2.f107673a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z11 = true;
            } catch (Throwable th3) {
                h(th3);
                z11 = false;
            }
        }
        f107693f = z11;
        w(byte[].class);
        w(boolean[].class);
        x(boolean[].class);
        w(int[].class);
        x(int[].class);
        w(long[].class);
        x(long[].class);
        w(float[].class);
        x(float[].class);
        w(double[].class);
        x(double[].class);
        w(Object[].class);
        x(Object[].class);
        Field fieldY = y();
        if (fieldY != null && (j6Var = f107691d) != null) {
            j6Var.f107673a.objectFieldOffset(fieldY);
        }
        f107694g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private k6() {
    }

    static double a(Object obj, long j10) {
        return f107691d.a(obj, j10);
    }

    static float b(Object obj, long j10) {
        return f107691d.b(obj, j10);
    }

    static int c(Object obj, long j10) {
        return f107691d.f107673a.getInt(obj, j10);
    }

    static long d(Object obj, long j10) {
        return f107691d.f107673a.getLong(obj, j10);
    }

    static Object e(Class cls) {
        try {
            return f107688a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object f(Object obj, long j10) {
        return f107691d.f107673a.getObject(obj, j10);
    }

    static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new g6());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void h(Throwable th2) {
        Logger.getLogger(k6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static /* synthetic */ void i(Object obj, long j10, boolean z10) {
        j6 j6Var = f107691d;
        long j11 = (-4) & j10;
        int i10 = j6Var.f107673a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        j6Var.f107673a.putInt(obj, j11, ((z10 ? 1 : 0) << i11) | ((~(255 << i11)) & i10));
    }

    static /* synthetic */ void j(Object obj, long j10, boolean z10) {
        j6 j6Var = f107691d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        j6Var.f107673a.putInt(obj, j11, ((z10 ? 1 : 0) << i10) | ((~(255 << i10)) & j6Var.f107673a.getInt(obj, j11)));
    }

    static void k(Object obj, long j10, boolean z10) {
        f107691d.c(obj, j10, z10);
    }

    static void l(Object obj, long j10, double d10) {
        f107691d.d(obj, j10, d10);
    }

    static void m(Object obj, long j10, float f10) {
        f107691d.e(obj, j10, f10);
    }

    static void n(Object obj, long j10, int i10) {
        f107691d.f107673a.putInt(obj, j10, i10);
    }

    static void o(Object obj, long j10, long j11) {
        f107691d.f107673a.putLong(obj, j10, j11);
    }

    static void p(Object obj, long j10, Object obj2) {
        f107691d.f107673a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean q(Object obj, long j10) {
        return ((byte) ((f107691d.f107673a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean r(Object obj, long j10) {
        return ((byte) ((f107691d.f107673a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static boolean s(Class cls) {
        int i10 = p2.f107733a;
        try {
            Class cls2 = f107689b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean t(Object obj, long j10) {
        return f107691d.f(obj, j10);
    }

    static boolean u() {
        return f107693f;
    }

    static boolean v() {
        return f107692e;
    }

    private static int w(Class cls) {
        if (f107693f) {
            return f107691d.f107673a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int x(Class cls) {
        if (f107693f) {
            return f107691d.f107673a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field y() {
        int i10 = p2.f107733a;
        Field fieldZ = z(Buffer.class, "effectiveDirectAddress");
        if (fieldZ != null) {
            return fieldZ;
        }
        Field fieldZ2 = z(Buffer.class, "address");
        if (fieldZ2 == null || fieldZ2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZ2;
    }

    private static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
