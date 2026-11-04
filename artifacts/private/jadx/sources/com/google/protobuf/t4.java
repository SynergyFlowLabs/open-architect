package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f126348a = T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f126349b = com.google.protobuf.e.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f126350c = s(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f126351d = s(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f126352e = P();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f126353f = w0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f126354g = v0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f126355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f126356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f126357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f126358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f126359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f126360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f126361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f126362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f126363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f126364q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f126365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f126366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f126367t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f126368u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f126369v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f126370w = 7;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f126371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final boolean f126372y;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f126373b = -1;

        b(Unsafe unsafe) {
            super(unsafe);
        }

        private static int C(long address) {
            return (int) address;
        }

        @Override // com.google.protobuf.t4.e
        public boolean B() {
            return false;
        }

        @Override // com.google.protobuf.t4.e
        public void c(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public void d(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public boolean e(Object target, long offset) {
            return t4.f126372y ? t4.y(target, offset) : t4.z(target, offset);
        }

        @Override // com.google.protobuf.t4.e
        public byte f(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public byte g(Object target, long offset) {
            return t4.f126372y ? t4.D(target, offset) : t4.E(target, offset);
        }

        @Override // com.google.protobuf.t4.e
        public double h(Object target, long offset) {
            return Double.longBitsToDouble(m(target, offset));
        }

        @Override // com.google.protobuf.t4.e
        public float i(Object target, long offset) {
            return Float.intBitsToFloat(k(target, offset));
        }

        @Override // com.google.protobuf.t4.e
        public int j(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public long l(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.t4.e
        public void q(Object target, long offset, boolean value) {
            if (t4.f126372y) {
                t4.c0(target, offset, value);
            } else {
                t4.d0(target, offset, value);
            }
        }

        @Override // com.google.protobuf.t4.e
        public void r(long address, byte value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public void s(Object target, long offset, byte value) {
            if (t4.f126372y) {
                t4.h0(target, offset, value);
            } else {
                t4.i0(target, offset, value);
            }
        }

        @Override // com.google.protobuf.t4.e
        public void t(Object target, long offset, double value) {
            y(target, offset, Double.doubleToLongBits(value));
        }

        @Override // com.google.protobuf.t4.e
        public void u(Object target, long offset, float value) {
            w(target, offset, Float.floatToIntBits(value));
        }

        @Override // com.google.protobuf.t4.e
        public void v(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public void x(long address, long value) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.t4.e
        public boolean B() {
            return false;
        }

        @Override // com.google.protobuf.t4.e
        public void c(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public void d(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public boolean e(Object target, long offset) {
            return t4.f126372y ? t4.y(target, offset) : t4.z(target, offset);
        }

        @Override // com.google.protobuf.t4.e
        public byte f(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public byte g(Object target, long offset) {
            return t4.f126372y ? t4.D(target, offset) : t4.E(target, offset);
        }

        @Override // com.google.protobuf.t4.e
        public double h(Object target, long offset) {
            return Double.longBitsToDouble(m(target, offset));
        }

        @Override // com.google.protobuf.t4.e
        public float i(Object target, long offset) {
            return Float.intBitsToFloat(k(target, offset));
        }

        @Override // com.google.protobuf.t4.e
        public int j(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public long l(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.t4.e
        public void q(Object target, long offset, boolean value) {
            if (t4.f126372y) {
                t4.c0(target, offset, value);
            } else {
                t4.d0(target, offset, value);
            }
        }

        @Override // com.google.protobuf.t4.e
        public void r(long address, byte value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public void s(Object target, long offset, byte value) {
            if (t4.f126372y) {
                t4.h0(target, offset, value);
            } else {
                t4.i0(target, offset, value);
            }
        }

        @Override // com.google.protobuf.t4.e
        public void t(Object target, long offset, double value) {
            y(target, offset, Double.doubleToLongBits(value));
        }

        @Override // com.google.protobuf.t4.e
        public void u(Object target, long offset, float value) {
            w(target, offset, Float.floatToIntBits(value));
        }

        @Override // com.google.protobuf.t4.e
        public void v(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t4.e
        public void x(long address, long value) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.t4.e
        public boolean A() {
            if (!super.A()) {
                return false;
            }
            try {
                Class<?> cls = this.f126374a.getClass();
                Class cls2 = Long.TYPE;
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
                t4.X(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.t4.e
        public boolean B() {
            if (!super.B()) {
                return false;
            }
            try {
                Class<?> cls = this.f126374a.getClass();
                Class cls2 = Long.TYPE;
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
                t4.X(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.t4.e
        public void c(long srcOffset, byte[] target, long targetIndex, long length) {
            this.f126374a.copyMemory((Object) null, srcOffset, target, t4.f126355h + targetIndex, length);
        }

        @Override // com.google.protobuf.t4.e
        public void d(byte[] src, long srcIndex, long targetOffset, long length) {
            this.f126374a.copyMemory(src, t4.f126355h + srcIndex, (Object) null, targetOffset, length);
        }

        @Override // com.google.protobuf.t4.e
        public boolean e(Object target, long offset) {
            return this.f126374a.getBoolean(target, offset);
        }

        @Override // com.google.protobuf.t4.e
        public byte f(long address) {
            return this.f126374a.getByte(address);
        }

        @Override // com.google.protobuf.t4.e
        public byte g(Object target, long offset) {
            return this.f126374a.getByte(target, offset);
        }

        @Override // com.google.protobuf.t4.e
        public double h(Object target, long offset) {
            return this.f126374a.getDouble(target, offset);
        }

        @Override // com.google.protobuf.t4.e
        public float i(Object target, long offset) {
            return this.f126374a.getFloat(target, offset);
        }

        @Override // com.google.protobuf.t4.e
        public int j(long address) {
            return this.f126374a.getInt(address);
        }

        @Override // com.google.protobuf.t4.e
        public long l(long address) {
            return this.f126374a.getLong(address);
        }

        @Override // com.google.protobuf.t4.e
        public Object o(Field field) {
            return n(this.f126374a.staticFieldBase(field), this.f126374a.staticFieldOffset(field));
        }

        @Override // com.google.protobuf.t4.e
        public void q(Object target, long offset, boolean value) {
            this.f126374a.putBoolean(target, offset, value);
        }

        @Override // com.google.protobuf.t4.e
        public void r(long address, byte value) {
            this.f126374a.putByte(address, value);
        }

        @Override // com.google.protobuf.t4.e
        public void s(Object target, long offset, byte value) {
            this.f126374a.putByte(target, offset, value);
        }

        @Override // com.google.protobuf.t4.e
        public void t(Object target, long offset, double value) {
            this.f126374a.putDouble(target, offset, value);
        }

        @Override // com.google.protobuf.t4.e
        public void u(Object target, long offset, float value) {
            this.f126374a.putFloat(target, offset, value);
        }

        @Override // com.google.protobuf.t4.e
        public void v(long address, int value) {
            this.f126374a.putInt(address, value);
        }

        @Override // com.google.protobuf.t4.e
        public void x(long address, long value) {
            this.f126374a.putLong(address, value);
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f126374a;

        e(Unsafe unsafe) {
            this.f126374a = unsafe;
        }

        public boolean A() {
            Unsafe unsafe = this.f126374a;
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
                return true;
            } catch (Throwable th2) {
                t4.X(th2);
                return false;
            }
        }

        public boolean B() {
            Unsafe unsafe = this.f126374a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return t4.o() != null;
            } catch (Throwable th2) {
                t4.X(th2);
                return false;
            }
        }

        public final int a(Class<?> clazz) {
            return this.f126374a.arrayBaseOffset(clazz);
        }

        public final int b(Class<?> clazz) {
            return this.f126374a.arrayIndexScale(clazz);
        }

        public abstract void c(long srcOffset, byte[] target, long targetIndex, long length);

        public abstract void d(byte[] src, long srcIndex, long targetOffset, long length);

        public abstract boolean e(Object target, long offset);

        public abstract byte f(long address);

        public abstract byte g(Object target, long offset);

        public abstract double h(Object target, long offset);

        public abstract float i(Object target, long offset);

        public abstract int j(long address);

        public final int k(Object target, long offset) {
            return this.f126374a.getInt(target, offset);
        }

        public abstract long l(long address);

        public final long m(Object target, long offset) {
            return this.f126374a.getLong(target, offset);
        }

        public final Object n(Object target, long offset) {
            return this.f126374a.getObject(target, offset);
        }

        public abstract Object o(Field field);

        public final long p(Field field) {
            return this.f126374a.objectFieldOffset(field);
        }

        public abstract void q(Object target, long offset, boolean value);

        public abstract void r(long address, byte value);

        public abstract void s(Object target, long offset, byte value);

        public abstract void t(Object target, long offset, double value);

        public abstract void u(Object target, long offset, float value);

        public abstract void v(long address, int value);

        public final void w(Object target, long offset, int value) {
            this.f126374a.putInt(target, offset, value);
        }

        public abstract void x(long address, long value);

        public final void y(Object target, long offset, long value) {
            this.f126374a.putLong(target, offset, value);
        }

        public final void z(Object target, long offset, Object value) {
            this.f126374a.putObject(target, offset, value);
        }
    }

    static {
        long jM = m(byte[].class);
        f126355h = jM;
        f126356i = m(boolean[].class);
        f126357j = n(boolean[].class);
        f126358k = m(int[].class);
        f126359l = n(int[].class);
        f126360m = m(long[].class);
        f126361n = n(long[].class);
        f126362o = m(float[].class);
        f126363p = n(float[].class);
        f126364q = m(double[].class);
        f126365r = n(double[].class);
        f126366s = m(Object[].class);
        f126367t = n(Object[].class);
        f126368u = u(o());
        f126371x = (int) (jM & 7);
        f126372y = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private t4() {
    }

    static byte A(long address) {
        return f126352e.f(address);
    }

    static byte B(Object target, long offset) {
        return f126352e.g(target, offset);
    }

    static byte C(byte[] target, long index) {
        return f126352e.g(target, f126355h + index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte D(Object target, long offset) {
        return (byte) ((K(target, (-4) & offset) >>> ((int) (((~offset) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte E(Object target, long offset) {
        return (byte) ((K(target, (-4) & offset) >>> ((int) ((offset & 3) << 3))) & 255);
    }

    static double F(Object target, long offset) {
        return f126352e.h(target, offset);
    }

    static double G(double[] target, long index) {
        return f126352e.h(target, f126364q + (index * f126365r));
    }

    static float H(Object target, long offset) {
        return f126352e.i(target, offset);
    }

    static float I(float[] target, long index) {
        return f126352e.i(target, f126362o + (index * f126363p));
    }

    static int J(long address) {
        return f126352e.j(address);
    }

    static int K(Object target, long offset) {
        return f126352e.k(target, offset);
    }

    static int L(int[] target, long index) {
        return f126352e.k(target, f126358k + (index * f126359l));
    }

    static long M(long address) {
        return f126352e.l(address);
    }

    static long N(Object target, long offset) {
        return f126352e.m(target, offset);
    }

    static long O(long[] target, long index) {
        return f126352e.m(target, f126360m + (index * f126361n));
    }

    private static e P() {
        Unsafe unsafe = f126348a;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.protobuf.e.c()) {
            return new d(unsafe);
        }
        if (f126350c) {
            return new c(unsafe);
        }
        return f126351d ? new b(unsafe) : null;
    }

    static Object Q(Object target, long offset) {
        return f126352e.n(target, offset);
    }

    static Object R(Object[] target, long index) {
        return f126352e.n(target, f126366s + (index * f126367t));
    }

    static Object S(Field field) {
        return f126352e.o(field);
    }

    static Unsafe T() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean U() {
        return f126354g;
    }

    static boolean V() {
        return f126353f;
    }

    static boolean W() {
        return f126350c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void X(Throwable e10) {
        Logger.getLogger(t4.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + e10);
    }

    static int Y(byte[] left, int leftOff, byte[] right, int rightOff, int length) {
        if (leftOff < 0 || rightOff < 0 || length < 0 || leftOff + length > left.length || rightOff + length > right.length) {
            throw new IndexOutOfBoundsException();
        }
        int i10 = 0;
        if (f126354g) {
            for (int i11 = (f126371x + leftOff) & 7; i10 < length && (i11 & 7) != 0; i11++) {
                if (left[leftOff + i10] != right[rightOff + i10]) {
                    return i10;
                }
                i10++;
            }
            int i12 = ((length - i10) & (-8)) + i10;
            while (i10 < i12) {
                long j10 = f126355h;
                long j11 = i10;
                long jN = N(left, ((long) leftOff) + j10 + j11);
                long jN2 = N(right, j10 + ((long) rightOff) + j11);
                if (jN != jN2) {
                    return i10 + v(jN, jN2);
                }
                i10 += 8;
            }
        }
        while (i10 < length) {
            if (left[leftOff + i10] != right[rightOff + i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static long Z(Field field) {
        return f126352e.p(field);
    }

    static void a0(Object target, long offset, boolean value) {
        f126352e.q(target, offset, value);
    }

    static void b0(boolean[] target, long index, boolean value) {
        f126352e.q(target, f126356i + (index * f126357j), value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c0(Object obj, long j10, boolean z10) {
        h0(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d0(Object obj, long j10, boolean z10) {
        i0(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void e0(long address, byte value) {
        f126352e.r(address, value);
    }

    static void f0(Object target, long offset, byte value) {
        f126352e.s(target, offset, value);
    }

    static void g0(byte[] target, long index, byte value) {
        f126352e.s(target, f126355h + index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h0(Object target, long offset, byte value) {
        long j10 = (-4) & offset;
        int iK = K(target, j10);
        int i10 = ((~((int) offset)) & 3) << 3;
        o0(target, j10, ((255 & value) << i10) | (iK & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i0(Object target, long offset, byte value) {
        long j10 = (-4) & offset;
        int i10 = (((int) offset) & 3) << 3;
        o0(target, j10, ((255 & value) << i10) | (K(target, j10) & (~(255 << i10))));
    }

    static void j0(Object target, long offset, double value) {
        f126352e.t(target, offset, value);
    }

    static long k(ByteBuffer buffer) {
        return f126352e.m(buffer, f126368u);
    }

    static void k0(double[] target, long index, double value) {
        f126352e.t(target, f126364q + (index * f126365r), value);
    }

    static <T> T l(Class<T> cls) {
        try {
            return (T) f126348a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static void l0(Object target, long offset, float value) {
        f126352e.u(target, offset, value);
    }

    private static int m(Class<?> clazz) {
        if (f126354g) {
            return f126352e.a(clazz);
        }
        return -1;
    }

    static void m0(float[] target, long index, float value) {
        f126352e.u(target, f126362o + (index * f126363p), value);
    }

    private static int n(Class<?> clazz) {
        if (f126354g) {
            return f126352e.b(clazz);
        }
        return -1;
    }

    static void n0(long address, int value) {
        f126352e.v(address, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field o() {
        Field fieldT;
        if (com.google.protobuf.e.c() && (fieldT = t(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldT;
        }
        Field fieldT2 = t(Buffer.class, "address");
        if (fieldT2 == null || fieldT2.getType() != Long.TYPE) {
            return null;
        }
        return fieldT2;
    }

    static void o0(Object target, long offset, int value) {
        f126352e.w(target, offset, value);
    }

    static void p(long srcOffset, byte[] target, long targetIndex, long length) {
        f126352e.c(srcOffset, target, targetIndex, length);
    }

    static void p0(int[] target, long index, int value) {
        f126352e.w(target, f126358k + (index * f126359l), value);
    }

    static void q(byte[] src, long srcIndex, long targetOffset, long length) {
        f126352e.d(src, srcIndex, targetOffset, length);
    }

    static void q0(long address, long value) {
        f126352e.x(address, value);
    }

    static void r(byte[] src, long srcIndex, byte[] target, long targetIndex, long length) {
        System.arraycopy(src, (int) srcIndex, target, (int) targetIndex, (int) length);
    }

    static void r0(Object target, long offset, long value) {
        f126352e.y(target, offset, value);
    }

    static boolean s(Class<?> addressClass) {
        if (!com.google.protobuf.e.c()) {
            return false;
        }
        try {
            Class<?> cls = f126349b;
            Class cls2 = Boolean.TYPE;
            cls.getMethod("peekLong", addressClass, cls2);
            cls.getMethod("pokeLong", addressClass, Long.TYPE, cls2);
            Class cls3 = Integer.TYPE;
            cls.getMethod("pokeInt", addressClass, cls3, cls2);
            cls.getMethod("peekInt", addressClass, cls2);
            cls.getMethod("pokeByte", addressClass, Byte.TYPE);
            cls.getMethod("peekByte", addressClass);
            cls.getMethod("pokeByteArray", addressClass, byte[].class, cls3, cls3);
            cls.getMethod("peekByteArray", addressClass, byte[].class, cls3, cls3);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static void s0(long[] target, long index, long value) {
        f126352e.y(target, f126360m + (index * f126361n), value);
    }

    private static Field t(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void t0(Object target, long offset, Object value) {
        f126352e.z(target, offset, value);
    }

    private static long u(Field field) {
        e eVar;
        if (field != null && (eVar = f126352e) != null) {
            return eVar.p(field);
        }
        return -1L;
    }

    static void u0(Object[] target, long index, Object value) {
        f126352e.z(target, f126366s + (index * f126367t), value);
    }

    private static int v(long left, long right) {
        return (f126372y ? Long.numberOfLeadingZeros(left ^ right) : Long.numberOfTrailingZeros(left ^ right)) >> 3;
    }

    private static boolean v0() {
        e eVar = f126352e;
        if (eVar == null) {
            return false;
        }
        return eVar.A();
    }

    static boolean w(Object target, long offset) {
        return f126352e.e(target, offset);
    }

    private static boolean w0() {
        e eVar = f126352e;
        if (eVar == null) {
            return false;
        }
        return eVar.B();
    }

    static boolean x(boolean[] target, long index) {
        return f126352e.e(target, f126356i + (index * f126357j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean y(Object target, long offset) {
        return D(target, offset) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean z(Object target, long offset) {
        return E(target, offset) != 0;
    }
}
