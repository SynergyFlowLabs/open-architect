package com.google.vr.sdk.deps;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f129375a = Logger.getLogger(f6.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Unsafe f129376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<?> f129377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f129378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f129379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f129380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f129381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f129382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f129383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f129384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f129385k;

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final byte a(Object obj, long j10) {
            return f6.f129385k ? f6.Q(obj, j10) : f6.R(obj, j10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void c(long j10, byte b10) {
            Memory.pokeByte((int) j10, b10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void d(Object obj, long j10, byte b10) {
            if (f6.f129385k) {
                f6.x(obj, j10, b10);
            } else {
                f6.C(obj, j10, b10);
            }
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void e(Object obj, long j10, double d10) {
            h(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void f(Object obj, long j10, float f10) {
            g(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void i(Object obj, long j10, boolean z10) {
            if (f6.f129385k) {
                f6.D(obj, j10, z10);
            } else {
                f6.G(obj, j10, z10);
            }
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void j(byte[] bArr, long j10, long j11, long j12) {
            Memory.pokeByteArray((int) j11, bArr, (int) j10, (int) j12);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final boolean k(Object obj, long j10) {
            return f6.f129385k ? f6.S(obj, j10) : f6.T(obj, j10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final float l(Object obj, long j10) {
            return Float.intBitsToFloat(n(obj, j10));
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final double m(Object obj, long j10) {
            return Double.longBitsToDouble(o(obj, j10));
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final byte a(Object obj, long j10) {
            return f6.f129385k ? f6.Q(obj, j10) : f6.R(obj, j10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void c(long j10, byte b10) {
            Memory.pokeByte(j10, b10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void d(Object obj, long j10, byte b10) {
            if (f6.f129385k) {
                f6.x(obj, j10, b10);
            } else {
                f6.C(obj, j10, b10);
            }
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void e(Object obj, long j10, double d10) {
            h(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void f(Object obj, long j10, float f10) {
            g(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void i(Object obj, long j10, boolean z10) {
            if (f6.f129385k) {
                f6.D(obj, j10, z10);
            } else {
                f6.G(obj, j10, z10);
            }
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void j(byte[] bArr, long j10, long j11, long j12) {
            Memory.pokeByteArray(j11, bArr, (int) j10, (int) j12);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final boolean k(Object obj, long j10) {
            return f6.f129385k ? f6.S(obj, j10) : f6.T(obj, j10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final float l(Object obj, long j10) {
            return Float.intBitsToFloat(n(obj, j10));
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final double m(Object obj, long j10) {
            return Double.longBitsToDouble(o(obj, j10));
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final byte a(Object obj, long j10) {
            return this.f129386a.getByte(obj, j10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void c(long j10, byte b10) {
            this.f129386a.putByte(j10, b10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void d(Object obj, long j10, byte b10) {
            this.f129386a.putByte(obj, j10, b10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void e(Object obj, long j10, double d10) {
            this.f129386a.putDouble(obj, j10, d10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void f(Object obj, long j10, float f10) {
            this.f129386a.putFloat(obj, j10, f10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void i(Object obj, long j10, boolean z10) {
            this.f129386a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final void j(byte[] bArr, long j10, long j11, long j12) {
            this.f129386a.copyMemory(bArr, f6.f129383i + j10, (Object) null, j11, j12);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final boolean k(Object obj, long j10) {
            return this.f129386a.getBoolean(obj, j10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final float l(Object obj, long j10) {
            return this.f129386a.getFloat(obj, j10);
        }

        @Override // com.google.vr.sdk.deps.f6.d
        public final double m(Object obj, long j10) {
            return this.f129386a.getDouble(obj, j10);
        }
    }

    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f129386a;

        d(Unsafe unsafe) {
            this.f129386a = unsafe;
        }

        public abstract byte a(Object obj, long j10);

        public final long b(Field field) {
            return this.f129386a.objectFieldOffset(field);
        }

        public abstract void c(long j10, byte b10);

        public abstract void d(Object obj, long j10, byte b10);

        public abstract void e(Object obj, long j10, double d10);

        public abstract void f(Object obj, long j10, float f10);

        public final void g(Object obj, long j10, int i10) {
            this.f129386a.putInt(obj, j10, i10);
        }

        public final void h(Object obj, long j10, long j11) {
            this.f129386a.putLong(obj, j10, j11);
        }

        public abstract void i(Object obj, long j10, boolean z10);

        public abstract void j(byte[] bArr, long j10, long j11, long j12);

        public abstract boolean k(Object obj, long j10);

        public abstract float l(Object obj, long j10);

        public abstract double m(Object obj, long j10);

        public final int n(Object obj, long j10) {
            return this.f129386a.getInt(obj, j10);
        }

        public final long o(Object obj, long j10) {
            return this.f129386a.getLong(obj, j10);
        }
    }

    static {
        boolean z10;
        Unsafe unsafeW = w();
        f129376b = unsafeW;
        f129377c = g2.c();
        boolean zE = E(Long.TYPE);
        f129378d = zE;
        boolean zE2 = E(Integer.TYPE);
        f129379e = zE2;
        d cVar = null;
        if (unsafeW != null) {
            if (!g2.b()) {
                cVar = new c(unsafeW);
            } else if (zE) {
                cVar = new b(unsafeW);
            } else if (zE2) {
                cVar = new a(unsafeW);
            }
        }
        f129380f = cVar;
        f129381g = L();
        f129382h = J();
        f129383i = q(byte[].class);
        q(boolean[].class);
        v(boolean[].class);
        q(int[].class);
        v(int[].class);
        q(long[].class);
        v(long[].class);
        q(float[].class);
        v(float[].class);
        q(double[].class);
        v(double[].class);
        q(Object[].class);
        v(Object[].class);
        Field fieldN = N();
        f129384j = (fieldN == null || cVar == null) ? -1L : cVar.b(fieldN);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
            boolean z11 = !false;
        } else {
            z10 = false;
        }
        f129385k = z10;
    }

    private f6() {
    }

    static float A(Object obj, long j10) {
        return f129380f.l(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void C(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        j(obj, j11, ((255 & b10) << i10) | (b(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Object obj, long j10, boolean z10) {
        x(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    private static boolean E(Class<?> cls) {
        if (!g2.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f129377c;
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

    static double F(Object obj, long j10) {
        return f129380f.m(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        C(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static Object I(Object obj, long j10) {
        return f129380f.f129386a.getObject(obj, j10);
    }

    private static boolean J() {
        Unsafe unsafe = f129376b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (g2.b()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            Logger logger = f129375a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
            return false;
        }
    }

    private static boolean L() {
        Unsafe unsafe = f129376b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (N() == null) {
                return false;
            }
            if (g2.b()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th2) {
            Logger logger = f129375a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
            return false;
        }
    }

    private static Field N() {
        Field fieldE;
        if (g2.b() && (fieldE = e(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldE;
        }
        Field fieldE2 = e(Buffer.class, "address");
        if (fieldE2 == null || fieldE2.getType() != Long.TYPE) {
            return null;
        }
        return fieldE2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte Q(Object obj, long j10) {
        return (byte) (b(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte R(Object obj, long j10) {
        return (byte) (b(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean S(Object obj, long j10) {
        return Q(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean T(Object obj, long j10) {
        return R(obj, j10) != 0;
    }

    static byte a(byte[] bArr, long j10) {
        return f129380f.a(bArr, f129383i + j10);
    }

    static int b(Object obj, long j10) {
        return f129380f.n(obj, j10);
    }

    static long c(ByteBuffer byteBuffer) {
        return f129380f.o(byteBuffer, f129384j);
    }

    static <T> T d(Class<T> cls) {
        try {
            return (T) f129376b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static Field e(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(long j10, byte b10) {
        f129380f.c(j10, b10);
    }

    static void h(Object obj, long j10, double d10) {
        f129380f.e(obj, j10, d10);
    }

    static void i(Object obj, long j10, float f10) {
        f129380f.f(obj, j10, f10);
    }

    static void j(Object obj, long j10, int i10) {
        f129380f.g(obj, j10, i10);
    }

    static void k(Object obj, long j10, long j11) {
        f129380f.h(obj, j10, j11);
    }

    static void l(Object obj, long j10, Object obj2) {
        f129380f.f129386a.putObject(obj, j10, obj2);
    }

    static void m(Object obj, long j10, boolean z10) {
        f129380f.i(obj, j10, z10);
    }

    static void n(byte[] bArr, long j10, byte b10) {
        f129380f.d(bArr, f129383i + j10, b10);
    }

    static void o(byte[] bArr, long j10, long j11, long j12) {
        f129380f.j(bArr, j10, j11, j12);
    }

    static boolean p() {
        return f129382h;
    }

    private static int q(Class<?> cls) {
        if (f129382h) {
            return f129380f.f129386a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long r(Object obj, long j10) {
        return f129380f.o(obj, j10);
    }

    static boolean u() {
        return f129381g;
    }

    private static int v(Class<?> cls) {
        if (f129382h) {
            return f129380f.f129386a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe w() {
        try {
            return (Unsafe) AccessController.doPrivileged(new g6());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iB = b(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        j(obj, j11, ((255 & b10) << i10) | (iB & (~(255 << i10))));
    }

    static boolean z(Object obj, long j10) {
        return f129380f.k(obj, j10);
    }
}
