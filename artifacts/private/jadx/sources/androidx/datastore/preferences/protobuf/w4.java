package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f50721a = T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f50722b = androidx.datastore.preferences.protobuf.e.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f50723c = s(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f50724d = s(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f50725e = P();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f50726f = w0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f50727g = v0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f50728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f50729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f50730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f50731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f50732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f50733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f50734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f50735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f50736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f50737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f50738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f50739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f50740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f50741u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f50742v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f50743w = 7;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f50744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final boolean f50745y;

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
        private static final long f50746b = -1;

        b(Unsafe unsafe) {
            super(unsafe);
        }

        private static int C(long address) {
            return (int) address;
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public boolean B() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void c(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void d(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public boolean e(Object target, long offset) {
            return w4.f50745y ? w4.y(target, offset) : w4.z(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public byte f(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public byte g(Object target, long offset) {
            return w4.f50745y ? w4.D(target, offset) : w4.E(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public double h(Object target, long offset) {
            return Double.longBitsToDouble(m(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public float i(Object target, long offset) {
            return Float.intBitsToFloat(k(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public int j(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public long l(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void q(Object target, long offset, boolean value) {
            if (w4.f50745y) {
                w4.c0(target, offset, value);
            } else {
                w4.d0(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void r(long address, byte value) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void s(Object target, long offset, byte value) {
            if (w4.f50745y) {
                w4.h0(target, offset, value);
            } else {
                w4.i0(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void t(Object target, long offset, double value) {
            y(target, offset, Double.doubleToLongBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void u(Object target, long offset, float value) {
            w(target, offset, Float.floatToIntBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void v(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void x(long address, long value) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public boolean B() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void c(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void d(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public boolean e(Object target, long offset) {
            return w4.f50745y ? w4.y(target, offset) : w4.z(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public byte f(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public byte g(Object target, long offset) {
            return w4.f50745y ? w4.D(target, offset) : w4.E(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public double h(Object target, long offset) {
            return Double.longBitsToDouble(m(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public float i(Object target, long offset) {
            return Float.intBitsToFloat(k(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public int j(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public long l(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public Object o(Field field) {
            Object obj = null;
            try {
                obj = field.get(null);
            } catch (IllegalAccessException unused) {
            }
            return obj;
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void q(Object target, long offset, boolean value) {
            if (w4.f50745y) {
                w4.c0(target, offset, value);
            } else {
                w4.d0(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void r(long address, byte value) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void s(Object target, long offset, byte value) {
            if (w4.f50745y) {
                w4.h0(target, offset, value);
            } else {
                w4.i0(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void t(Object target, long offset, double value) {
            y(target, offset, Double.doubleToLongBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void u(Object target, long offset, float value) {
            w(target, offset, Float.floatToIntBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void v(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void x(long address, long value) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public boolean A() {
            if (!super.A()) {
                return false;
            }
            try {
                Class<?> cls = this.f50747a.getClass();
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
                w4.X(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public boolean B() {
            if (!super.B()) {
                return false;
            }
            try {
                Class<?> cls = this.f50747a.getClass();
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
                w4.X(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void c(long srcOffset, byte[] target, long targetIndex, long length) {
            this.f50747a.copyMemory((Object) null, srcOffset, target, w4.f50728h + targetIndex, length);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void d(byte[] src, long srcIndex, long targetOffset, long length) {
            this.f50747a.copyMemory(src, w4.f50728h + srcIndex, (Object) null, targetOffset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public boolean e(Object target, long offset) {
            return this.f50747a.getBoolean(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public byte f(long address) {
            return this.f50747a.getByte(address);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public byte g(Object target, long offset) {
            return this.f50747a.getByte(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public double h(Object target, long offset) {
            return this.f50747a.getDouble(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public float i(Object target, long offset) {
            return this.f50747a.getFloat(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public int j(long address) {
            return this.f50747a.getInt(address);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public long l(long address) {
            return this.f50747a.getLong(address);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public Object o(Field field) {
            return n(this.f50747a.staticFieldBase(field), this.f50747a.staticFieldOffset(field));
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void q(Object target, long offset, boolean value) {
            this.f50747a.putBoolean(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void r(long address, byte value) {
            this.f50747a.putByte(address, value);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void s(Object target, long offset, byte value) {
            this.f50747a.putByte(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void t(Object target, long offset, double value) {
            this.f50747a.putDouble(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void u(Object target, long offset, float value) {
            this.f50747a.putFloat(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void v(long address, int value) {
            this.f50747a.putInt(address, value);
        }

        @Override // androidx.datastore.preferences.protobuf.w4.e
        public void x(long address, long value) {
            this.f50747a.putLong(address, value);
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f50747a;

        e(Unsafe unsafe) {
            this.f50747a = unsafe;
        }

        public boolean A() {
            Unsafe unsafe = this.f50747a;
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
                w4.X(th2);
                return false;
            }
        }

        public boolean B() {
            Unsafe unsafe = this.f50747a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return w4.o() != null;
            } catch (Throwable th2) {
                w4.X(th2);
                return false;
            }
        }

        public final int a(Class<?> clazz) {
            return this.f50747a.arrayBaseOffset(clazz);
        }

        public final int b(Class<?> clazz) {
            return this.f50747a.arrayIndexScale(clazz);
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
            return this.f50747a.getInt(target, offset);
        }

        public abstract long l(long address);

        public final long m(Object target, long offset) {
            return this.f50747a.getLong(target, offset);
        }

        public final Object n(Object target, long offset) {
            return this.f50747a.getObject(target, offset);
        }

        public abstract Object o(Field field);

        public final long p(Field field) {
            return this.f50747a.objectFieldOffset(field);
        }

        public abstract void q(Object target, long offset, boolean value);

        public abstract void r(long address, byte value);

        public abstract void s(Object target, long offset, byte value);

        public abstract void t(Object target, long offset, double value);

        public abstract void u(Object target, long offset, float value);

        public abstract void v(long address, int value);

        public final void w(Object target, long offset, int value) {
            this.f50747a.putInt(target, offset, value);
        }

        public abstract void x(long address, long value);

        public final void y(Object target, long offset, long value) {
            this.f50747a.putLong(target, offset, value);
        }

        public final void z(Object target, long offset, Object value) {
            this.f50747a.putObject(target, offset, value);
        }
    }

    static {
        long jM = m(byte[].class);
        f50728h = jM;
        f50729i = m(boolean[].class);
        f50730j = n(boolean[].class);
        f50731k = m(int[].class);
        f50732l = n(int[].class);
        f50733m = m(long[].class);
        f50734n = n(long[].class);
        f50735o = m(float[].class);
        f50736p = n(float[].class);
        f50737q = m(double[].class);
        f50738r = n(double[].class);
        f50739s = m(Object[].class);
        f50740t = n(Object[].class);
        f50741u = u(o());
        f50744x = (int) (jM & 7);
        f50745y = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private w4() {
    }

    static byte A(long address) {
        return f50725e.f(address);
    }

    static byte B(Object target, long offset) {
        return f50725e.g(target, offset);
    }

    static byte C(byte[] target, long index) {
        return f50725e.g(target, f50728h + index);
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
        return f50725e.h(target, offset);
    }

    static double G(double[] target, long index) {
        return f50725e.h(target, f50737q + (index * f50738r));
    }

    static float H(Object target, long offset) {
        return f50725e.i(target, offset);
    }

    static float I(float[] target, long index) {
        return f50725e.i(target, f50735o + (index * f50736p));
    }

    static int J(long address) {
        return f50725e.j(address);
    }

    static int K(Object target, long offset) {
        return f50725e.k(target, offset);
    }

    static int L(int[] target, long index) {
        return f50725e.k(target, f50731k + (index * f50732l));
    }

    static long M(long address) {
        return f50725e.l(address);
    }

    static long N(Object target, long offset) {
        return f50725e.m(target, offset);
    }

    static long O(long[] target, long index) {
        return f50725e.m(target, f50733m + (index * f50734n));
    }

    private static e P() {
        Unsafe unsafe = f50721a;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.e.c()) {
            return new d(unsafe);
        }
        if (f50723c) {
            return new c(unsafe);
        }
        return f50724d ? new b(unsafe) : null;
    }

    static Object Q(Object target, long offset) {
        return f50725e.n(target, offset);
    }

    static Object R(Object[] target, long index) {
        return f50725e.n(target, f50739s + (index * f50740t));
    }

    static Object S(Field field) {
        return f50725e.o(field);
    }

    static Unsafe T() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean U() {
        return f50727g;
    }

    static boolean V() {
        return f50726f;
    }

    static boolean W() {
        return f50723c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void X(Throwable e10) {
        Logger.getLogger(w4.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + e10);
    }

    static int Y(byte[] left, int leftOff, byte[] right, int rightOff, int length) {
        if (leftOff < 0 || rightOff < 0 || length < 0 || leftOff + length > left.length || rightOff + length > right.length) {
            throw new IndexOutOfBoundsException();
        }
        int i10 = 0;
        if (f50727g) {
            for (int i11 = (f50744x + leftOff) & 7; i10 < length && (i11 & 7) != 0; i11++) {
                if (left[leftOff + i10] != right[rightOff + i10]) {
                    return i10;
                }
                i10++;
            }
            int i12 = ((length - i10) & (-8)) + i10;
            while (i10 < i12) {
                long j10 = f50728h;
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
        return f50725e.p(field);
    }

    static void a0(Object target, long offset, boolean value) {
        f50725e.q(target, offset, value);
    }

    static void b0(boolean[] target, long index, boolean value) {
        f50725e.q(target, f50729i + (index * f50730j), value);
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
        f50725e.r(address, value);
    }

    static void f0(Object target, long offset, byte value) {
        f50725e.s(target, offset, value);
    }

    static void g0(byte[] target, long index, byte value) {
        f50725e.s(target, f50728h + index, value);
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
        f50725e.t(target, offset, value);
    }

    static long k(ByteBuffer buffer) {
        return f50725e.m(buffer, f50741u);
    }

    static void k0(double[] target, long index, double value) {
        f50725e.t(target, f50737q + (index * f50738r), value);
    }

    static <T> T l(Class<T> cls) {
        try {
            return (T) f50721a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static void l0(Object target, long offset, float value) {
        f50725e.u(target, offset, value);
    }

    private static int m(Class<?> clazz) {
        if (f50727g) {
            return f50725e.a(clazz);
        }
        return -1;
    }

    static void m0(float[] target, long index, float value) {
        f50725e.u(target, f50735o + (index * f50736p), value);
    }

    private static int n(Class<?> clazz) {
        if (f50727g) {
            return f50725e.b(clazz);
        }
        return -1;
    }

    static void n0(long address, int value) {
        f50725e.v(address, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field o() {
        Field fieldT;
        if (androidx.datastore.preferences.protobuf.e.c() && (fieldT = t(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldT;
        }
        Field fieldT2 = t(Buffer.class, "address");
        if (fieldT2 == null || fieldT2.getType() != Long.TYPE) {
            return null;
        }
        return fieldT2;
    }

    static void o0(Object target, long offset, int value) {
        f50725e.w(target, offset, value);
    }

    static void p(long srcOffset, byte[] target, long targetIndex, long length) {
        f50725e.c(srcOffset, target, targetIndex, length);
    }

    static void p0(int[] target, long index, int value) {
        f50725e.w(target, f50731k + (index * f50732l), value);
    }

    static void q(byte[] src, long srcIndex, long targetOffset, long length) {
        f50725e.d(src, srcIndex, targetOffset, length);
    }

    static void q0(long address, long value) {
        f50725e.x(address, value);
    }

    static void r(byte[] src, long srcIndex, byte[] target, long targetIndex, long length) {
        System.arraycopy(src, (int) srcIndex, target, (int) targetIndex, (int) length);
    }

    static void r0(Object target, long offset, long value) {
        f50725e.y(target, offset, value);
    }

    static boolean s(Class<?> addressClass) {
        if (!androidx.datastore.preferences.protobuf.e.c()) {
            return false;
        }
        try {
            Class<?> cls = f50722b;
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
        f50725e.y(target, f50733m + (index * f50734n), value);
    }

    private static Field t(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void t0(Object target, long offset, Object value) {
        f50725e.z(target, offset, value);
    }

    private static long u(Field field) {
        e eVar;
        if (field != null && (eVar = f50725e) != null) {
            return eVar.p(field);
        }
        return -1L;
    }

    static void u0(Object[] target, long index, Object value) {
        f50725e.z(target, f50739s + (index * f50740t), value);
    }

    private static int v(long left, long right) {
        return (f50745y ? Long.numberOfLeadingZeros(left ^ right) : Long.numberOfTrailingZeros(left ^ right)) >> 3;
    }

    private static boolean v0() {
        e eVar = f50725e;
        if (eVar == null) {
            return false;
        }
        return eVar.A();
    }

    static boolean w(Object target, long offset) {
        return f50725e.e(target, offset);
    }

    private static boolean w0() {
        e eVar = f50725e;
        if (eVar == null) {
            return false;
        }
        return eVar.B();
    }

    static boolean x(boolean[] target, long index) {
        return f50725e.e(target, f50729i + (index * f50730j));
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
