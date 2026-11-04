package org.msgpack.core;

import androidx.collection.g3;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.e2;
import org.msgpack.value.a0;
import org.msgpack.value.q;
import org.msgpack.value.x;
import org.msgpack.value.y;
import org.msgpack.value.z;

/* JADX INFO: loaded from: classes14.dex */
public class o implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final org.msgpack.core.buffer.h f339313s = org.msgpack.core.buffer.h.J(new byte[0]);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f339314t = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final /* synthetic */ boolean f339315v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f339316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f339317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CodingErrorAction f339318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CodingErrorAction f339319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f339320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f339321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.msgpack.core.buffer.j f339322g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f339324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f339325j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f339327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private StringBuilder f339328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharsetDecoder f339329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharBuffer f339330o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.msgpack.core.buffer.h f339323h = f339313s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final org.msgpack.core.buffer.h f339326k = org.msgpack.core.buffer.h.a(8);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f339332b;

        static {
            int[] iArr = new int[z.values().length];
            f339332b = iArr;
            try {
                iArr[z.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339332b[z.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339332b[z.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339332b[z.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339332b[z.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339332b[z.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339332b[z.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f339332b[z.MAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f339332b[z.EXTENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[c.values().length];
            f339331a = iArr2;
            try {
                iArr2[c.f339226b.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f339331a[c.f339253q3.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f339331a[c.f339233h.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f339331a[c.f339230f.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f339331a[c.f339227c.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f339331a[c.f339228d.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f339331a[c.f339229e.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f339331a[c.Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f339331a[c.f339257t.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f339331a[c.Z.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f339331a[c.f339258v.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f339331a[c.f339249p0.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f339331a[c.f339259w.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f339331a[c.f339247o.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f339331a[c.f339250p1.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f339331a[c.X.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f339331a[c.f339255s.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f339331a[c.f339235i.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f339331a[c.f339238j3.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f339331a[c.f339237j.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f339331a[c.f339240k3.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f339331a[c.f339239k.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f339331a[c.f339242l3.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f339331a[c.H1.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f339331a[c.f339251p2.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f339331a[c.f339232g3.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f339331a[c.f339234h3.ordinal()] = 27;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f339331a[c.f339236i3.ordinal()] = 28;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f339331a[c.f339241l.ordinal()] = 29;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f339331a[c.f339243m.ordinal()] = 30;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f339331a[c.f339245n.ordinal()] = 31;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f339331a[c.f339244m3.ordinal()] = 32;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f339331a[c.f339246n3.ordinal()] = 33;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f339331a[c.f339248o3.ordinal()] = 34;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f339331a[c.f339252p3.ordinal()] = 35;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f339331a[c.f339231g.ordinal()] = 36;
            } catch (NoSuchFieldError unused45) {
            }
        }
    }

    protected o(org.msgpack.core.buffer.j jVar, h.c cVar) {
        this.f339322g = (org.msgpack.core.buffer.j) p.j(jVar, "MessageBufferInput is null");
        this.f339316a = cVar.e();
        this.f339317b = cVar.d();
        this.f339318c = cVar.b();
        this.f339319d = cVar.c();
        this.f339320e = cVar.h();
        this.f339321f = cVar.g();
    }

    private float E() throws IOException {
        return x(4).j(this.f339327l);
    }

    private int H() throws IOException {
        return readShort() & e2.f312492d;
    }

    private int I() throws IOException {
        int i10 = readInt();
        if (i10 >= 0) {
            return i10;
        }
        throw q(i10);
    }

    private int N() throws IOException {
        return readByte() & 255;
    }

    private String a(int i10) {
        CodingErrorAction codingErrorAction = this.f339318c;
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
        if (codingErrorAction == codingErrorAction2 && this.f339319d == codingErrorAction2 && this.f339323h.n()) {
            String str = new String(this.f339323h.b(), this.f339323h.c() + this.f339324i, i10, h.f339262a);
            this.f339324i += i10;
            return str;
        }
        try {
            CharBuffer charBufferDecode = this.f339329n.decode(this.f339323h.F(this.f339324i, i10));
            this.f339324i += i10;
            return charBufferDecode.toString();
        } catch (CharacterCodingException e10) {
            throw new l(e10);
        }
    }

    private boolean b() throws IOException {
        while (this.f339323h.C() <= this.f339324i) {
            org.msgpack.core.buffer.h next = this.f339322g.next();
            if (next == null) {
                return false;
            }
            this.f339325j += (long) this.f339323h.C();
            this.f339323h = next;
            this.f339324i = 0;
        }
        return true;
    }

    private org.msgpack.core.buffer.h c() throws IOException {
        org.msgpack.core.buffer.h next = this.f339322g.next();
        if (next == null) {
            throw new e();
        }
        this.f339325j += (long) this.f339323h.C();
        return next;
    }

    private void f(CoderResult coderResult) throws CharacterCodingException {
        if ((coderResult.isMalformed() && this.f339318c == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.f339319d == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    private void g() throws IOException {
        this.f339323h = c();
        this.f339324i = 0;
    }

    private void g0() {
        CharsetDecoder charsetDecoder = this.f339329n;
        if (charsetDecoder == null) {
            this.f339330o = CharBuffer.allocate(this.f339321f);
            this.f339329n = h.f339262a.newDecoder().onMalformedInput(this.f339318c).onUnmappableCharacter(this.f339319d);
        } else {
            charsetDecoder.reset();
        }
        StringBuilder sb2 = this.f339328m;
        if (sb2 == null) {
            this.f339328m = new StringBuilder();
        } else {
            sb2.setLength(0);
        }
    }

    private static f h(short s10) {
        return new f(BigInteger.valueOf(s10));
    }

    private static f j(int i10) {
        return new f(BigInteger.valueOf(i10));
    }

    private void j0(int i10) throws IOException {
        while (true) {
            int iC = this.f339323h.C();
            int i11 = this.f339324i;
            int i12 = iC - i11;
            if (i12 >= i10) {
                this.f339324i = i11 + i10;
                return;
            } else {
                this.f339324i = i11 + i12;
                i10 -= i12;
                g();
            }
        }
    }

    private static f l(long j10) {
        return new f(BigInteger.valueOf(j10));
    }

    private static f m(short s10) {
        return new f(BigInteger.valueOf(s10 & e2.f312492d));
    }

    private static f o(int i10) {
        return new f(BigInteger.valueOf(((long) (i10 & Integer.MAX_VALUE)) + 2147483648L));
    }

    private int o0(byte b10) throws IOException {
        switch (b10) {
            case -60:
                return N();
            case -59:
                return H();
            case -58:
                return I();
            default:
                return -1;
        }
    }

    private static int o1(byte b10) {
        return Integer.numberOfLeadingZeros((~(b10 & 255)) << 24);
    }

    private static k q(int i10) {
        return new k(((long) (i10 & Integer.MAX_VALUE)) + 2147483648L);
    }

    private static f r(long j10) {
        return new f(BigInteger.valueOf(j10 - Long.MIN_VALUE).setBit(63));
    }

    private int r0(byte b10) throws IOException {
        switch (b10) {
            case -39:
                return N();
            case -38:
                return H();
            case -37:
                return I();
            default:
                return -1;
        }
    }

    private byte readByte() throws IOException {
        int iC = this.f339323h.C();
        int i10 = this.f339324i;
        if (iC > i10) {
            byte bF = this.f339323h.f(i10);
            this.f339324i++;
            return bF;
        }
        g();
        if (this.f339323h.C() <= 0) {
            return readByte();
        }
        byte bF2 = this.f339323h.f(0);
        this.f339324i = 1;
        return bF2;
    }

    private int readInt() throws IOException {
        return x(4).k(this.f339327l);
    }

    private long readLong() throws IOException {
        return x(8).l(this.f339327l);
    }

    private short readShort() throws IOException {
        return x(2).m(this.f339327l);
    }

    private static f t(byte b10) {
        return new f(BigInteger.valueOf(b10 & 255));
    }

    private static i w0(String str, byte b10) {
        c cVarN = c.n(b10);
        if (cVarN == c.f339231g) {
            return new g(String.format("Expected %s, but encountered 0xC1 \"NEVER_USED\" byte", str));
        }
        String strName = cVarN.k().name();
        return new n(String.format("Expected %s, but got %s (%02x)", str, strName.substring(0, 1) + strName.substring(1).toLowerCase(), Byte.valueOf(b10)));
    }

    private org.msgpack.core.buffer.h x(int i10) throws IOException {
        int iC = this.f339323h.C();
        int i11 = this.f339324i;
        int i12 = iC - i11;
        if (i12 >= i10) {
            this.f339327l = i11;
            this.f339324i = i11 + i10;
            return this.f339323h;
        }
        if (i12 > 0) {
            this.f339326k.z(0, this.f339323h, i11, i12);
            i10 -= i12;
        } else {
            i12 = 0;
        }
        while (true) {
            g();
            int iC2 = this.f339323h.C();
            if (iC2 >= i10) {
                this.f339326k.z(i12, this.f339323h, 0, i10);
                this.f339324i = i10;
                this.f339327l = 0;
                return this.f339326k;
            }
            this.f339326k.z(i12, this.f339323h, 0, iC2);
            i10 -= iC2;
            i12 += iC2;
        }
    }

    private double y() throws IOException {
        return x(8).i(this.f339327l);
    }

    public int B0() throws IOException {
        int iR0;
        byte b10 = readByte();
        if (h.a.e(b10)) {
            return b10 & com.google.common.base.c.I;
        }
        int iO0 = o0(b10);
        if (iO0 >= 0) {
            return iO0;
        }
        if (!this.f339316a || (iR0 = r0(b10)) < 0) {
            throw w0("Binary", b10);
        }
        return iR0;
    }

    public boolean H0() throws IOException {
        byte b10 = readByte();
        if (b10 == -62) {
            return false;
        }
        if (b10 == -61) {
            return true;
        }
        throw w0("boolean", b10);
    }

    public byte M0() throws IOException {
        long j10;
        byte b10 = readByte();
        if (h.a.a(b10)) {
            return b10;
        }
        switch (b10) {
            case -52:
                byte b11 = readByte();
                if (b11 >= 0) {
                    return b11;
                }
                throw t(b11);
            case -51:
                short s10 = readShort();
                if (s10 < 0 || s10 > 127) {
                    throw m(s10);
                }
                return (byte) s10;
            case org.locationtech.jts.index.quadtree.b.f338427a /* -50 */:
                int i10 = readInt();
                if (i10 < 0 || i10 > 127) {
                    throw o(i10);
                }
                return (byte) i10;
            case -49:
                j10 = readLong();
                if (j10 < 0 || j10 > 127) {
                    throw r(j10);
                }
                break;
            case -48:
                return readByte();
            case -47:
                short s11 = readShort();
                if (s11 < -128 || s11 > 127) {
                    throw h(s11);
                }
                return (byte) s11;
            case -46:
                int i11 = readInt();
                if (i11 < -128 || i11 > 127) {
                    throw j(i11);
                }
                return (byte) i11;
            case -45:
                j10 = readLong();
                if (j10 < -128 || j10 > 127) {
                    throw l(j10);
                }
                break;
            default:
                throw w0("Integer", b10);
        }
        return (byte) j10;
    }

    public double O0() throws IOException {
        byte b10 = readByte();
        if (b10 == -54) {
            return E();
        }
        if (b10 == -53) {
            return y();
        }
        throw w0("Float", b10);
    }

    public org.msgpack.core.a Q0() throws IOException {
        byte b10 = readByte();
        switch (b10) {
            case -57:
                org.msgpack.core.buffer.h hVarX = x(2);
                return new org.msgpack.core.a(hVarX.f(this.f339327l + 1), hVarX.f(this.f339327l) & 255);
            case -56:
                org.msgpack.core.buffer.h hVarX2 = x(3);
                return new org.msgpack.core.a(hVarX2.f(this.f339327l + 2), hVarX2.m(this.f339327l) & e2.f312492d);
            case -55:
                org.msgpack.core.buffer.h hVarX3 = x(5);
                int iK = hVarX3.k(this.f339327l);
                if (iK >= 0) {
                    return new org.msgpack.core.a(hVarX3.f(this.f339327l + 4), iK);
                }
                throw q(iK);
            default:
                switch (b10) {
                    case -44:
                        return new org.msgpack.core.a(readByte(), 1);
                    case -43:
                        return new org.msgpack.core.a(readByte(), 2);
                    case -42:
                        return new org.msgpack.core.a(readByte(), 4);
                    case -41:
                        return new org.msgpack.core.a(readByte(), 8);
                    case -40:
                        return new org.msgpack.core.a(readByte(), 16);
                    default:
                        throw w0("Ext", b10);
                }
        }
    }

    public void R(ByteBuffer byteBuffer) throws IOException {
        while (true) {
            int iRemaining = byteBuffer.remaining();
            int iC = this.f339323h.C();
            int i10 = this.f339324i;
            int i11 = iC - i10;
            if (i11 >= iRemaining) {
                this.f339323h.g(i10, iRemaining, byteBuffer);
                this.f339324i += iRemaining;
                return;
            } else {
                this.f339323h.g(i10, i11, byteBuffer);
                this.f339324i += i11;
                g();
            }
        }
    }

    public float R0() throws IOException {
        byte b10 = readByte();
        if (b10 == -54) {
            return E();
        }
        if (b10 == -53) {
            return (float) y();
        }
        throw w0("Float", b10);
    }

    public void T(byte[] bArr) throws IOException {
        X(bArr, 0, bArr.length);
    }

    public int T0() throws IOException {
        byte b10 = readByte();
        if (h.a.a(b10)) {
            return b10;
        }
        switch (b10) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & e2.f312492d;
            case org.locationtech.jts.index.quadtree.b.f338427a /* -50 */:
                int i10 = readInt();
                if (i10 >= 0) {
                    return i10;
                }
                throw o(i10);
            case -49:
                long j10 = readLong();
                if (j10 < 0 || j10 > g3.f12256c) {
                    throw r(j10);
                }
                return (int) j10;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long j11 = readLong();
                if (j11 < g3.f12261h || j11 > g3.f12256c) {
                    throw l(j11);
                }
                return (int) j11;
            default:
                throw w0("Integer", b10);
        }
    }

    public long U0() throws IOException {
        byte b10 = readByte();
        if (h.a.a(b10)) {
            return b10;
        }
        switch (b10) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & e2.f312492d;
            case org.locationtech.jts.index.quadtree.b.f338427a /* -50 */:
                int i10 = readInt();
                return i10 < 0 ? ((long) (i10 & Integer.MAX_VALUE)) + 2147483648L : i10;
            case -49:
                long j10 = readLong();
                if (j10 >= 0) {
                    return j10;
                }
                throw r(j10);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw w0("Integer", b10);
        }
    }

    public void X(byte[] bArr, int i10, int i11) throws IOException {
        R(ByteBuffer.wrap(bArr, i10, i11));
    }

    public byte[] Y(int i10) throws IOException {
        byte[] bArr = new byte[i10];
        T(bArr);
        return bArr;
    }

    public void a9() throws IOException {
        k0(1);
    }

    public int b1() throws IOException {
        byte b10 = readByte();
        if (h.a.d(b10)) {
            return b10 & com.google.common.base.c.f116464q;
        }
        if (b10 == -34) {
            return H();
        }
        if (b10 == -33) {
            return I();
        }
        throw w0("Map", b10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f339323h = f339313s;
        this.f339324i = 0;
        this.f339322g.close();
    }

    public c d() throws IOException {
        if (b()) {
            return c.n(this.f339323h.f(this.f339324i));
        }
        throw new e();
    }

    public org.msgpack.core.buffer.h d0(int i10) throws IOException {
        int iC = this.f339323h.C();
        int i11 = this.f339324i;
        if (iC - i11 >= i10) {
            org.msgpack.core.buffer.h hVarD = this.f339323h.D(i11, i10);
            this.f339324i += i10;
            return hVarD;
        }
        org.msgpack.core.buffer.h hVarA = org.msgpack.core.buffer.h.a(i10);
        R(hVarA.E());
        return hVarA;
    }

    public void d1() throws IOException {
        byte b10 = readByte();
        if (b10 != -64) {
            throw w0("Nil", b10);
        }
    }

    public long e() {
        return this.f339325j + ((long) this.f339324i);
    }

    public int e1() throws IOException {
        int iO0;
        byte b10 = readByte();
        if (h.a.e(b10)) {
            return b10 & com.google.common.base.c.I;
        }
        int iR0 = r0(b10);
        if (iR0 >= 0) {
            return iR0;
        }
        if (!this.f339317b || (iO0 = o0(b10)) < 0) {
            throw w0("String", b10);
        }
        return iO0;
    }

    public org.msgpack.core.buffer.j f0(org.msgpack.core.buffer.j jVar) throws IOException {
        org.msgpack.core.buffer.j jVar2 = (org.msgpack.core.buffer.j) p.j(jVar, "MessageBufferInput is null");
        org.msgpack.core.buffer.j jVar3 = this.f339322g;
        this.f339322g = jVar2;
        this.f339323h = f339313s;
        this.f339324i = 0;
        this.f339325j = 0L;
        return jVar3;
    }

    public short g1() throws IOException {
        int i10;
        long j10;
        byte b10 = readByte();
        if (h.a.a(b10)) {
            return b10;
        }
        switch (b10) {
            case -52:
                i10 = readByte() & 255;
                return (short) i10;
            case -51:
                short s10 = readShort();
                if (s10 >= 0) {
                    return s10;
                }
                throw m(s10);
            case org.locationtech.jts.index.quadtree.b.f338427a /* -50 */:
                int i11 = readInt();
                if (i11 < 0 || i11 > 32767) {
                    throw o(i11);
                }
                return (short) i11;
            case -49:
                j10 = readLong();
                if (j10 < 0 || j10 > 32767) {
                    throw r(j10);
                }
                i10 = (int) j10;
                return (short) i10;
            case -48:
                i10 = readByte();
                return (short) i10;
            case -47:
                return readShort();
            case -46:
                int i12 = readInt();
                if (i12 < -32768 || i12 > 32767) {
                    throw j(i12);
                }
                return (short) i12;
            case -45:
                j10 = readLong();
                if (j10 < -32768 || j10 > 32767) {
                    throw l(j10);
                }
                i10 = (int) j10;
                return (short) i10;
            default:
                throw w0("Integer", b10);
        }
    }

    public String h1() throws IOException {
        int iRemaining;
        int iE1 = e1();
        if (iE1 == 0) {
            return "";
        }
        if (iE1 > this.f339320e) {
            throw new k(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(this.f339320e), Integer.valueOf(iE1)), iE1);
        }
        g0();
        if (this.f339323h.C() - this.f339324i >= iE1) {
            return a(iE1);
        }
        while (iE1 > 0) {
            try {
                int iC = this.f339323h.C();
                int i10 = this.f339324i;
                int i11 = iC - i10;
                if (i11 >= iE1) {
                    this.f339328m.append(a(iE1));
                    break;
                }
                if (i11 == 0) {
                    g();
                } else {
                    ByteBuffer byteBufferF = this.f339323h.F(i10, i11);
                    int iPosition = byteBufferF.position();
                    this.f339330o.clear();
                    CoderResult coderResultDecode = this.f339329n.decode(byteBufferF, this.f339330o, false);
                    int iPosition2 = byteBufferF.position() - iPosition;
                    this.f339324i += iPosition2;
                    iE1 -= iPosition2;
                    this.f339328m.append(this.f339330o.flip());
                    if (coderResultDecode.isError()) {
                        f(coderResultDecode);
                    }
                    if (coderResultDecode.isUnderflow() && iPosition2 < i11) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(o1(this.f339323h.f(this.f339324i)));
                        org.msgpack.core.buffer.h hVar = this.f339323h;
                        hVar.g(this.f339324i, hVar.C() - this.f339324i, byteBufferAllocate);
                        while (true) {
                            g();
                            iRemaining = byteBufferAllocate.remaining();
                            if (this.f339323h.C() >= iRemaining) {
                                break;
                            }
                            org.msgpack.core.buffer.h hVar2 = this.f339323h;
                            hVar2.g(0, hVar2.C(), byteBufferAllocate);
                            this.f339324i = this.f339323h.C();
                        }
                        this.f339323h.g(0, iRemaining, byteBufferAllocate);
                        this.f339324i = iRemaining;
                        byteBufferAllocate.position(0);
                        this.f339330o.clear();
                        CoderResult coderResultDecode2 = this.f339329n.decode(byteBufferAllocate, this.f339330o, false);
                        if (coderResultDecode2.isError()) {
                            f(coderResultDecode2);
                        }
                        if (coderResultDecode2.isOverflow() || (coderResultDecode2.isUnderflow() && byteBufferAllocate.position() < byteBufferAllocate.limit())) {
                            try {
                                coderResultDecode2.throwException();
                                throw new d("Unexpected UTF-8 multibyte sequence");
                            } catch (Exception e10) {
                                throw new d("Unexpected UTF-8 multibyte sequence", e10);
                            }
                        }
                        iE1 -= byteBufferAllocate.limit();
                        this.f339328m.append(this.f339330o.flip());
                    }
                }
            } catch (CharacterCodingException e11) {
                throw new l(e11);
            }
        }
        return this.f339328m.toString();
    }

    public boolean hasNext() throws IOException {
        return b();
    }

    public q j1() throws IOException {
        c cVarD = d();
        int i10 = 0;
        switch (a.f339332b[cVarD.k().ordinal()]) {
            case 1:
                readByte();
                return y.y();
            case 2:
                return y.j(H0());
            case 3:
                return a.f339331a[cVarD.ordinal()] != 16 ? y.p(U0()) : y.q(y0());
            case 4:
                return y.l(O0());
            case 5:
                return y.D(Y(e1()), true);
            case 6:
                return y.i(Y(B0()), true);
            case 7:
                int iX0 = x0();
                x[] xVarArr = new x[iX0];
                while (i10 < iX0) {
                    xVarArr[i10] = j1();
                    i10++;
                }
                return y.e(xVarArr, true);
            case 8:
                int iB1 = b1() * 2;
                x[] xVarArr2 = new x[iB1];
                while (i10 < iB1) {
                    xVarArr2[i10] = j1();
                    xVarArr2[i10 + 1] = j1();
                    i10 += 2;
                }
                return y.u(xVarArr2, true);
            case 9:
                org.msgpack.core.a aVarQ0 = Q0();
                return y.k(aVarQ0.c(), Y(aVarQ0.b()));
            default:
                throw new g("Unknown value type");
        }
    }

    public void k0(int i10) throws IOException {
        int iH;
        int iH2;
        while (i10 > 0) {
            byte b10 = readByte();
            switch (a.f339331a[c.n(b10).ordinal()]) {
                case 5:
                    iH = b10 & 15;
                    iH2 = iH * 2;
                    i10 += iH2;
                    i10--;
                    break;
                case 6:
                    iH2 = b10 & 15;
                    i10 += iH2;
                    i10--;
                    break;
                case 7:
                    j0(b10 & com.google.common.base.c.I);
                    i10--;
                    break;
                case 8:
                case 9:
                    j0(1);
                    i10--;
                    break;
                case 10:
                case 11:
                    j0(2);
                    i10--;
                    break;
                case 12:
                case 13:
                case 14:
                    j0(4);
                    i10--;
                    break;
                case 15:
                case 16:
                case 17:
                    j0(8);
                    i10--;
                    break;
                case 18:
                case 19:
                    j0(N());
                    i10--;
                    break;
                case 20:
                case 21:
                    j0(H());
                    i10--;
                    break;
                case 22:
                case 23:
                    j0(I());
                    i10--;
                    break;
                case 24:
                    j0(2);
                    i10--;
                    break;
                case 25:
                    j0(3);
                    i10--;
                    break;
                case 26:
                    j0(5);
                    i10--;
                    break;
                case 27:
                    j0(9);
                    i10--;
                    break;
                case 28:
                    j0(17);
                    i10--;
                    break;
                case 29:
                    j0(N() + 1);
                    i10--;
                    break;
                case 30:
                    j0(H() + 1);
                    i10--;
                    break;
                case 31:
                    j0(I() + 1);
                    i10--;
                    break;
                case 32:
                    iH2 = H();
                    i10 += iH2;
                    i10--;
                    break;
                case 33:
                    iH2 = I();
                    i10 += iH2;
                    i10--;
                    break;
                case 34:
                    iH = H();
                    iH2 = iH * 2;
                    i10 += iH2;
                    i10--;
                    break;
                case 35:
                    iH = I();
                    iH2 = iH * 2;
                    i10 += iH2;
                    i10--;
                    break;
                case 36:
                    throw new g("Encountered 0xC1 \"NEVER_USED\" byte");
                default:
                    i10--;
                    break;
            }
        }
    }

    public a0 l1(a0 a0Var) throws IOException {
        c cVarD = d();
        int i10 = 0;
        switch (a.f339332b[cVarD.k().ordinal()]) {
            case 1:
                readByte();
                a0Var.E();
                return a0Var;
            case 2:
                a0Var.h(H0());
                return a0Var;
            case 3:
                if (a.f339331a[cVarD.ordinal()] != 16) {
                    a0Var.x(U0());
                    return a0Var;
                }
                a0Var.y(y0());
                return a0Var;
            case 4:
                a0Var.o(O0());
                return a0Var;
            case 5:
                a0Var.I(Y(e1()));
                return a0Var;
            case 6:
                a0Var.g(Y(B0()));
                return a0Var;
            case 7:
                int iX0 = x0();
                ArrayList arrayList = new ArrayList(iX0);
                while (i10 < iX0) {
                    arrayList.add(j1());
                    i10++;
                }
                a0Var.f(arrayList);
                return a0Var;
            case 8:
                int iB1 = b1();
                HashMap map = new HashMap();
                while (i10 < iB1) {
                    map.put(j1(), j1());
                    i10++;
                }
                a0Var.z(map);
                return a0Var;
            case 9:
                org.msgpack.core.a aVarQ0 = Q0();
                a0Var.j(aVarQ0.c(), Y(aVarQ0.b()));
                return a0Var;
            default:
                throw new d("Unknown value type");
        }
    }

    public int x0() throws IOException {
        byte b10 = readByte();
        if (h.a.c(b10)) {
            return b10 & com.google.common.base.c.f116464q;
        }
        if (b10 == -36) {
            return H();
        }
        if (b10 == -35) {
            return I();
        }
        throw w0("Array", b10);
    }

    public BigInteger y0() throws IOException {
        byte b10 = readByte();
        if (h.a.a(b10)) {
            return BigInteger.valueOf(b10);
        }
        switch (b10) {
            case -52:
                return BigInteger.valueOf(readByte() & 255);
            case -51:
                return BigInteger.valueOf(readShort() & e2.f312492d);
            case org.locationtech.jts.index.quadtree.b.f338427a /* -50 */:
                int i10 = readInt();
                return i10 < 0 ? BigInteger.valueOf(((long) (i10 & Integer.MAX_VALUE)) + 2147483648L) : BigInteger.valueOf(i10);
            case -49:
                long j10 = readLong();
                return j10 < 0 ? BigInteger.valueOf(j10 - Long.MIN_VALUE).setBit(63) : BigInteger.valueOf(j10);
            case -48:
                return BigInteger.valueOf(readByte());
            case -47:
                return BigInteger.valueOf(readShort());
            case -46:
                return BigInteger.valueOf(readInt());
            case -45:
                return BigInteger.valueOf(readLong());
            default:
                throw w0("Integer", b10);
        }
    }
}
