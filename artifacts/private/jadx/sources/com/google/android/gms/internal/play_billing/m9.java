package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f109220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f109221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f109222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l9 f109223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f109224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f109225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f109226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f109227h;

    /* JADX WARN: Code duplicated, block: B:11:0x004a  */
    static {
        boolean z10;
        boolean z11;
        l9 l9Var;
        Unsafe unsafeL = l();
        f109220a = unsafeL;
        int i10 = q5.f109268a;
        f109221b = Memory.class;
        Class cls = Long.TYPE;
        boolean zA = A(cls);
        f109222c = zA;
        Class cls2 = Integer.TYPE;
        boolean zA2 = A(cls2);
        l9 j9Var = null;
        if (unsafeL != null) {
            if (zA) {
                j9Var = new k9(unsafeL);
            } else if (zA2) {
                j9Var = new j9(unsafeL);
            }
        }
        f109223d = j9Var;
        boolean z12 = true;
        if (j9Var == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = j9Var.f109200a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                m(th2);
            }
        }
        f109224e = z10;
        l9 l9Var2 = f109223d;
        if (l9Var2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = l9Var2.f109200a.getClass();
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
                m(th3);
                z11 = false;
            }
        }
        f109225f = z11;
        f109226g = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (l9Var = f109223d) != null) {
            l9Var.f109200a.objectFieldOffset(fieldB);
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z12 = false;
        }
        f109227h = z12;
    }

    private m9() {
    }

    static boolean A(Class cls) {
        int i10 = q5.f109268a;
        try {
            Class cls2 = f109221b;
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

    static boolean B(Object obj, long j10) {
        return f109223d.g(obj, j10);
    }

    static boolean C() {
        return f109225f;
    }

    static boolean D() {
        return f109224e;
    }

    private static int E(Class cls) {
        if (f109225f) {
            return f109223d.f109200a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f109225f) {
            return f109223d.f109200a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = q5.f109268a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        l9 l9Var = f109223d;
        long j11 = (-4) & j10;
        int i10 = l9Var.f109200a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        l9Var.f109200a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        l9 l9Var = f109223d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        l9Var.f109200a.putInt(obj, j11, ((255 & b10) << i10) | (l9Var.f109200a.getInt(obj, j11) & (~(255 << i10))));
    }

    static double f(Object obj, long j10) {
        return f109223d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f109223d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f109223d.f109200a.getInt(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f109223d.f109200a.getLong(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f109220a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object k(Object obj, long j10) {
        return f109223d.f109200a.getObject(obj, j10);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new i9());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th2) {
        Logger.getLogger(m9.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static void r(Object obj, long j10, boolean z10) {
        f109223d.c(obj, j10, z10);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f109223d.d(bArr, f109226g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f109223d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f10) {
        f109223d.f(obj, j10, f10);
    }

    static void v(Object obj, long j10, int i10) {
        f109223d.f109200a.putInt(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f109223d.f109200a.putLong(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f109223d.f109200a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        if (((byte) ((f109223d.f109200a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) == 0) {
            return false;
        }
        int i10 = 2 | 1;
        return true;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f109223d.f109200a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
