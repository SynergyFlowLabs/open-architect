package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.msgpack.core.p;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final boolean f339207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Unsafe f339208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Constructor<?> f339209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Constructor<?> f339210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f339211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f339212j = "org.msgpack.core.buffer.MessageBufferU";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f339213k = "org.msgpack.core.buffer.MessageBufferBE";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f339214l = "org.msgpack.core.buffer.MessageBuffer";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ boolean f339215m = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f339216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final long f339217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f339218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final ByteBuffer f339219d;

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    static {
        boolean z10;
        boolean z11;
        String str = f339213k;
        Class cls = Integer.TYPE;
        String str2 = f339212j;
        Unsafe unsafe = null;
        boolean z12 = false;
        int iArrayBaseOffset = 16;
        try {
            try {
                String property = System.getProperty("java.specification.version", "");
                int iIndexOf = property.indexOf(46);
                if (iIndexOf != -1) {
                    try {
                        int i10 = Integer.parseInt(property.substring(0, iIndexOf));
                        int i11 = Integer.parseInt(property.substring(iIndexOf + 1));
                        if (i10 > 1 || (i10 == 1 && i11 >= 7)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (NumberFormatException e10) {
                        e10.printStackTrace(System.err);
                    }
                } else {
                    z10 = false;
                }
                try {
                    Class.forName("sun.misc.Unsafe");
                    z11 = true;
                } catch (Exception unused) {
                    z11 = false;
                }
                z12 = Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false")) || System.getProperty("java.runtime.name", "").toLowerCase().contains("android") || (System.getProperty("com.google.appengine.runtime.version") != null) || !z10 || !z11;
                if (!z12) {
                    Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    Unsafe unsafe2 = (Unsafe) declaredField.get(null);
                    try {
                        if (unsafe2 == null) {
                            throw new RuntimeException("Unsafe is unavailable");
                        }
                        iArrayBaseOffset = unsafe2.arrayBaseOffset(byte[].class);
                        int iArrayIndexScale = unsafe2.arrayIndexScale(byte[].class);
                        if (iArrayIndexScale != 1) {
                            throw new IllegalStateException("Byte array index scale must be 1, but is " + iArrayIndexScale);
                        }
                        unsafe = unsafe2;
                    } catch (Exception e11) {
                        e = e11;
                        unsafe = unsafe2;
                        e.printStackTrace(System.err);
                        f339208f = unsafe;
                        f339211i = 16;
                        f339207e = true;
                        try {
                            Class<?> cls2 = Class.forName(f339212j);
                            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(byte[].class, cls, cls);
                            declaredConstructor.setAccessible(true);
                            f339209g = declaredConstructor;
                            Constructor<?> declaredConstructor2 = cls2.getDeclaredConstructor(ByteBuffer.class);
                            declaredConstructor2.setAccessible(true);
                            f339210h = declaredConstructor2;
                            return;
                        } catch (Exception e12) {
                            e12.printStackTrace(System.err);
                            throw new RuntimeException(e12);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        unsafe = unsafe2;
                        f339208f = unsafe;
                        f339211i = 16;
                        f339207e = z12;
                        if (!z12) {
                            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                                str = f339214l;
                            }
                            str2 = str;
                        }
                        try {
                            Class<?> cls3 = Class.forName(str2);
                            Constructor<?> declaredConstructor3 = cls3.getDeclaredConstructor(byte[].class, cls, cls);
                            declaredConstructor3.setAccessible(true);
                            f339209g = declaredConstructor3;
                            Constructor<?> declaredConstructor4 = cls3.getDeclaredConstructor(ByteBuffer.class);
                            declaredConstructor4.setAccessible(true);
                            f339210h = declaredConstructor4;
                            throw th;
                        } catch (Exception e13) {
                            e13.printStackTrace(System.err);
                            throw new RuntimeException(e13);
                        }
                    }
                }
                f339208f = unsafe;
                f339211i = iArrayBaseOffset;
                f339207e = z12;
                if (!z12) {
                    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                        str = f339214l;
                    }
                    str2 = str;
                }
                try {
                    Class<?> cls4 = Class.forName(str2);
                    Constructor<?> declaredConstructor5 = cls4.getDeclaredConstructor(byte[].class, cls, cls);
                    declaredConstructor5.setAccessible(true);
                    f339209g = declaredConstructor5;
                    Constructor<?> declaredConstructor6 = cls4.getDeclaredConstructor(ByteBuffer.class);
                    declaredConstructor6.setAccessible(true);
                    f339210h = declaredConstructor6;
                } catch (Exception e14) {
                    e14.printStackTrace(System.err);
                    throw new RuntimeException(e14);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e15) {
            e = e15;
        }
    }

    h(byte[] bArr, int i10, int i11) {
        this.f339216a = bArr;
        this.f339217b = f339211i + i10;
        this.f339218c = i11;
        this.f339219d = null;
    }

    public static void B(h hVar) {
        if (!f339207e && !hVar.n()) {
            if (f.c(hVar.f339219d)) {
                f.a(hVar.f339219d);
            } else {
                f339208f.freeMemory(hVar.f339217b);
            }
        }
    }

    public static h I(ByteBuffer byteBuffer) {
        return p(byteBuffer);
    }

    public static h J(byte[] bArr) {
        return q(bArr, 0, bArr.length);
    }

    public static h K(byte[] bArr, int i10, int i11) {
        return q(bArr, i10, i11);
    }

    public static h a(int i10) {
        if (i10 >= 0) {
            return J(new byte[i10]);
        }
        throw new IllegalArgumentException("size must not be negative");
    }

    private static h o(Constructor<?> constructor, Object... objArr) {
        try {
            return (h) constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            if (e12.getCause() instanceof Error) {
                throw ((Error) e12.getCause());
            }
            throw new IllegalStateException(e12.getCause());
        }
    }

    private static h p(ByteBuffer byteBuffer) {
        p.i(byteBuffer);
        return o(f339210h, byteBuffer);
    }

    private static h q(byte[] bArr, int i10, int i11) {
        p.i(bArr);
        return o(f339209g, bArr, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public void A(int i10, short s10) {
        f339208f.putShort(this.f339216a, this.f339217b + ((long) i10), Short.reverseBytes(s10));
    }

    public int C() {
        return this.f339218c;
    }

    public h D(int i10, int i11) {
        if (i10 == 0 && i11 == C()) {
            return this;
        }
        p.d(i10 + i11 <= C());
        return new h(this.f339216a, this.f339217b + ((long) i10), i11);
    }

    public ByteBuffer E() {
        return F(0, C());
    }

    public ByteBuffer F(int i10, int i11) {
        return n() ? ByteBuffer.wrap((byte[]) this.f339216a, (int) ((this.f339217b - ((long) f339211i)) + ((long) i10)), i11) : f.d(this.f339217b, i10, i11, this.f339219d);
    }

    public byte[] G() {
        byte[] bArr = new byte[C()];
        f339208f.copyMemory(this.f339216a, this.f339217b, bArr, f339211i, C());
        return bArr;
    }

    public String H(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = i10; i12 < i11; i12++) {
            if (i12 != i10) {
                sb2.append(" ");
            }
            sb2.append(String.format("%02x", Byte.valueOf(f(i12))));
        }
        return sb2.toString();
    }

    public byte[] b() {
        return (byte[]) this.f339216a;
    }

    public int c() {
        return ((int) this.f339217b) - f339211i;
    }

    public void d(int i10, h hVar, int i11, int i12) {
        f339208f.copyMemory(this.f339216a, this.f339217b + ((long) i10), hVar.f339216a, hVar.f339217b + ((long) i11), i12);
    }

    public boolean e(int i10) {
        return f339208f.getBoolean(this.f339216a, this.f339217b + ((long) i10));
    }

    public byte f(int i10) {
        return f339208f.getByte(this.f339216a, this.f339217b + ((long) i10));
    }

    public void g(int i10, int i11, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < i11) {
            throw new BufferOverflowException();
        }
        byteBuffer.put(F(i10, i11));
    }

    public void h(int i10, byte[] bArr, int i11, int i12) {
        f339208f.copyMemory(this.f339216a, this.f339217b + ((long) i10), bArr, f339211i + i11, i12);
    }

    public double i(int i10) {
        return Double.longBitsToDouble(l(i10));
    }

    public float j(int i10) {
        return Float.intBitsToFloat(k(i10));
    }

    public int k(int i10) {
        return Integer.reverseBytes(f339208f.getInt(this.f339216a, this.f339217b + ((long) i10)));
    }

    public long l(int i10) {
        return Long.reverseBytes(f339208f.getLong(this.f339216a, this.f339217b + ((long) i10)));
    }

    public short m(int i10) {
        return Short.reverseBytes(f339208f.getShort(this.f339216a, this.f339217b + ((long) i10)));
    }

    public boolean n() {
        return this.f339216a != null;
    }

    public void r(int i10, boolean z10) {
        f339208f.putBoolean(this.f339216a, this.f339217b + ((long) i10), z10);
    }

    public void s(int i10, byte b10) {
        f339208f.putByte(this.f339216a, this.f339217b + ((long) i10), b10);
    }

    public void t(int i10, ByteBuffer byteBuffer, int i11) {
        if (byteBuffer.isDirect()) {
            f339208f.copyMemory((Object) null, f.b(byteBuffer) + ((long) byteBuffer.position()), this.f339216a, this.f339217b + ((long) i10), i11);
            byteBuffer.position(byteBuffer.position() + i11);
            return;
        }
        if (byteBuffer.hasArray()) {
            f339208f.copyMemory(byteBuffer.array(), f339211i + byteBuffer.position(), this.f339216a, this.f339217b + ((long) i10), i11);
            byteBuffer.position(byteBuffer.position() + i11);
        } else {
            if (n()) {
                byteBuffer.get((byte[]) this.f339216a, i10, i11);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                f339208f.putByte(this.f339216a, this.f339217b + ((long) i10), byteBuffer.get());
            }
        }
    }

    public void u(int i10, byte[] bArr, int i11, int i12) {
        f339208f.copyMemory(bArr, f339211i + i11, this.f339216a, this.f339217b + ((long) i10), i12);
    }

    public void v(int i10, double d10) {
        y(i10, Double.doubleToRawLongBits(d10));
    }

    public void w(int i10, float f10) {
        x(i10, Float.floatToRawIntBits(f10));
    }

    public void x(int i10, int i11) {
        f339208f.putInt(this.f339216a, this.f339217b + ((long) i10), Integer.reverseBytes(i11));
    }

    public void y(int i10, long j10) {
        f339208f.putLong(this.f339216a, this.f339217b + ((long) i10), Long.reverseBytes(j10));
    }

    public void z(int i10, h hVar, int i11, int i12) {
        f339208f.copyMemory(hVar.f339216a, hVar.f339217b + ((long) i11), this.f339216a, this.f339217b + ((long) i10), i12);
    }

    h(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (!f339207e) {
                this.f339216a = null;
                this.f339217b = f.b(byteBuffer) + ((long) byteBuffer.position());
                this.f339218c = byteBuffer.remaining();
                this.f339219d = byteBuffer;
                return;
            }
            throw new UnsupportedOperationException("Cannot create MessageBuffer from a DirectBuffer on this platform");
        }
        if (byteBuffer.hasArray()) {
            this.f339216a = byteBuffer.array();
            this.f339217b = f339211i + byteBuffer.arrayOffset() + byteBuffer.position();
            this.f339218c = byteBuffer.remaining();
            this.f339219d = null;
            return;
        }
        throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
    }

    protected h(Object obj, long j10, int i10) {
        this.f339216a = obj;
        this.f339217b = j10;
        this.f339218c = i10;
        this.f339219d = null;
    }
}
