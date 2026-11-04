package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f51121o = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ByteBuffer f51122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f51123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f51124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f51125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f51126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f51127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f51128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f51129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f51130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f51131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f51132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f51133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    b f51134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final x f51135n;

    static class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ByteBuffer f51136a;

        public a(ByteBuffer byteBuffer) {
            this.f51136a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f51136a.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    public static abstract class b {
        public abstract ByteBuffer a(int i10);

        public void b(ByteBuffer byteBuffer) {
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f51137a = new c();

        @Override // androidx.emoji2.text.flatbuffer.i.b
        public ByteBuffer a(int i10) {
            return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public i(int i10, b bVar) {
        this(i10, bVar, null, x.d());
    }

    @Deprecated
    private int C() {
        L();
        return this.f51123b;
    }

    static ByteBuffer N(ByteBuffer byteBuffer, b bVar) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i10 = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferA = bVar.a(i10);
        byteBufferA.position(byteBufferA.clear().capacity() - iCapacity);
        byteBufferA.put(byteBuffer);
        return byteBufferA;
    }

    public static boolean P(v vVar, int i10) {
        return vVar.d(i10) != 0;
    }

    public int A(int[] iArr) {
        Q();
        h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            n(iArr[length]);
        }
        return E();
    }

    public ByteBuffer B() {
        L();
        return this.f51122a;
    }

    public int D() {
        int i10;
        if (this.f51125d == null || !this.f51127f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        j(0);
        int iR = R();
        int i11 = this.f51126e - 1;
        while (i11 >= 0 && this.f51125d[i11] == 0) {
            i11--;
        }
        for (int i12 = i11; i12 >= 0; i12--) {
            int i13 = this.f51125d[i12];
            q((short) (i13 != 0 ? iR - i13 : 0));
        }
        q((short) (iR - this.f51129h));
        q((short) ((i11 + 3) * 2));
        int i14 = 0;
        loop2: while (true) {
            if (i14 >= this.f51131j) {
                i10 = 0;
                break;
            }
            int iCapacity = this.f51122a.capacity() - this.f51130i[i14];
            int i15 = this.f51123b;
            short s10 = this.f51122a.getShort(iCapacity);
            if (s10 == this.f51122a.getShort(i15)) {
                int i16 = 2;
                while (true) {
                    if (i16 >= s10) {
                        i10 = this.f51130i[i14];
                        break loop2;
                    }
                    if (this.f51122a.getShort(iCapacity + i16) != this.f51122a.getShort(i15 + i16)) {
                        break;
                    }
                    i16 += 2;
                }
            }
            i14++;
        }
        if (i10 != 0) {
            int iCapacity2 = this.f51122a.capacity() - iR;
            this.f51123b = iCapacity2;
            this.f51122a.putInt(iCapacity2, i10 - iR);
        } else {
            int i17 = this.f51131j;
            int[] iArr = this.f51130i;
            if (i17 == iArr.length) {
                this.f51130i = Arrays.copyOf(iArr, i17 * 2);
            }
            int[] iArr2 = this.f51130i;
            int i18 = this.f51131j;
            this.f51131j = i18 + 1;
            iArr2[i18] = R();
            ByteBuffer byteBuffer = this.f51122a;
            byteBuffer.putInt(byteBuffer.capacity() - iR, R() - iR);
        }
        this.f51127f = false;
        return iR;
    }

    public int E() {
        if (!this.f51127f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f51127f = false;
        Y(this.f51132k);
        return R();
    }

    public void F(int i10) {
        I(i10, false);
    }

    public void G(int i10, String str) {
        H(i10, str, false);
    }

    protected void H(int i10, String str, boolean z10) {
        T(this.f51124c, (z10 ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i11 = 3; i11 >= 0; i11--) {
            d((byte) str.charAt(i11));
        }
        I(i10, z10);
    }

    protected void I(int i10, boolean z10) {
        T(this.f51124c, (z10 ? 4 : 0) + 4);
        n(i10);
        if (z10) {
            j(this.f51122a.capacity() - this.f51123b);
        }
        this.f51122a.position(this.f51123b);
        this.f51128g = true;
    }

    public void J(int i10) {
        I(i10, true);
    }

    public void K(int i10, String str) {
        H(i10, str, true);
    }

    public void L() {
        if (!this.f51128g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public i M(boolean z10) {
        this.f51133l = z10;
        return this;
    }

    public i O(ByteBuffer byteBuffer, b bVar) {
        this.f51134m = bVar;
        this.f51122a = byteBuffer;
        byteBuffer.clear();
        this.f51122a.order(ByteOrder.LITTLE_ENDIAN);
        this.f51124c = 1;
        this.f51123b = this.f51122a.capacity();
        this.f51126e = 0;
        this.f51127f = false;
        this.f51128g = false;
        this.f51129h = 0;
        this.f51131j = 0;
        this.f51132k = 0;
        return this;
    }

    public void Q() {
        if (this.f51127f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int R() {
        return this.f51122a.capacity() - this.f51123b;
    }

    public void S(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBuffer = this.f51122a;
            int i12 = this.f51123b - 1;
            this.f51123b = i12;
            byteBuffer.put(i12, (byte) 0);
        }
    }

    public void T(int i10, int i11) {
        if (i10 > this.f51124c) {
            this.f51124c = i10;
        }
        int i12 = ((~((this.f51122a.capacity() - this.f51123b) + i11)) + 1) & (i10 - 1);
        while (this.f51123b < i12 + i10 + i11) {
            int iCapacity = this.f51122a.capacity();
            ByteBuffer byteBuffer = this.f51122a;
            ByteBuffer byteBufferN = N(byteBuffer, this.f51134m);
            this.f51122a = byteBufferN;
            if (byteBuffer != byteBufferN) {
                this.f51134m.b(byteBuffer);
            }
            this.f51123b += this.f51122a.capacity() - iCapacity;
        }
        S(i12);
    }

    public void U(boolean z10) {
        ByteBuffer byteBuffer = this.f51122a;
        int i10 = this.f51123b - 1;
        this.f51123b = i10;
        byteBuffer.put(i10, z10 ? (byte) 1 : (byte) 0);
    }

    public void V(byte b10) {
        ByteBuffer byteBuffer = this.f51122a;
        int i10 = this.f51123b - 1;
        this.f51123b = i10;
        byteBuffer.put(i10, b10);
    }

    public void W(double d10) {
        ByteBuffer byteBuffer = this.f51122a;
        int i10 = this.f51123b - 8;
        this.f51123b = i10;
        byteBuffer.putDouble(i10, d10);
    }

    public void X(float f10) {
        ByteBuffer byteBuffer = this.f51122a;
        int i10 = this.f51123b - 4;
        this.f51123b = i10;
        byteBuffer.putFloat(i10, f10);
    }

    public void Y(int i10) {
        ByteBuffer byteBuffer = this.f51122a;
        int i11 = this.f51123b - 4;
        this.f51123b = i11;
        byteBuffer.putInt(i11, i10);
    }

    public void Z(long j10) {
        ByteBuffer byteBuffer = this.f51122a;
        int i10 = this.f51123b - 8;
        this.f51123b = i10;
        byteBuffer.putLong(i10, j10);
    }

    public void a(int i10) {
        if (i10 != R()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void a0(short s10) {
        ByteBuffer byteBuffer = this.f51122a;
        int i10 = this.f51123b - 2;
        this.f51123b = i10;
        byteBuffer.putShort(i10, s10);
    }

    public void b(int i10, boolean z10, boolean z11) {
        if (this.f51133l || z10 != z11) {
            c(z10);
            f0(i10);
        }
    }

    public void b0(int i10, int i11) {
        int iCapacity = this.f51122a.capacity() - i10;
        if (this.f51122a.getShort((iCapacity - this.f51122a.getInt(iCapacity)) + i11) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i11 + " must be set");
    }

    public void c(boolean z10) {
        T(1, 0);
        U(z10);
    }

    public byte[] c0() {
        return d0(this.f51123b, this.f51122a.capacity() - this.f51123b);
    }

    public void d(byte b10) {
        T(1, 0);
        V(b10);
    }

    public byte[] d0(int i10, int i11) {
        L();
        byte[] bArr = new byte[i11];
        this.f51122a.position(i10);
        this.f51122a.get(bArr);
        return bArr;
    }

    public void e(int i10, byte b10, int i11) {
        if (!this.f51133l && b10 == i11) {
            return;
        }
        d(b10);
        f0(i10);
    }

    public InputStream e0() {
        L();
        ByteBuffer byteBufferDuplicate = this.f51122a.duplicate();
        byteBufferDuplicate.position(this.f51123b);
        byteBufferDuplicate.limit(this.f51122a.capacity());
        return new a(byteBufferDuplicate);
    }

    public void f(double d10) {
        T(8, 0);
        W(d10);
    }

    public void f0(int i10) {
        this.f51125d[i10] = R();
    }

    public void g(int i10, double d10, double d11) {
        if (this.f51133l || d10 != d11) {
            f(d10);
            f0(i10);
        }
    }

    public void g0(int i10) {
        Q();
        int[] iArr = this.f51125d;
        if (iArr == null || iArr.length < i10) {
            this.f51125d = new int[i10];
        }
        this.f51126e = i10;
        Arrays.fill(this.f51125d, 0, i10, 0);
        this.f51127f = true;
        this.f51129h = R();
    }

    public void h(float f10) {
        T(4, 0);
        X(f10);
    }

    public void h0(int i10, int i11, int i12) {
        Q();
        this.f51132k = i11;
        int i13 = i10 * i11;
        T(4, i13);
        T(i12, i13);
        this.f51127f = true;
    }

    public void i(int i10, float f10, double d10) {
        if (this.f51133l || f10 != d10) {
            h(f10);
            f0(i10);
        }
    }

    public void j(int i10) {
        T(4, 0);
        Y(i10);
    }

    public void k(int i10, int i11, int i12) {
        if (this.f51133l || i11 != i12) {
            j(i11);
            f0(i10);
        }
    }

    public void l(int i10, long j10, long j11) {
        if (!this.f51133l && j10 == j11) {
            return;
        }
        m(j10);
        f0(i10);
    }

    public void m(long j10) {
        T(8, 0);
        Z(j10);
    }

    public void n(int i10) {
        T(4, 0);
        Y((R() - i10) + 4);
    }

    public void o(int i10, int i11, int i12) {
        if (!this.f51133l && i11 == i12) {
            return;
        }
        n(i11);
        f0(i10);
    }

    public void p(int i10, short s10, int i11) {
        if (this.f51133l || s10 != i11) {
            q(s10);
            f0(i10);
        }
    }

    public void q(short s10) {
        T(2, 0);
        a0(s10);
    }

    public void r(int i10, int i11, int i12) {
        if (i11 != i12) {
            a(i11);
            f0(i10);
        }
    }

    public void s() {
        this.f51123b = this.f51122a.capacity();
        this.f51122a.clear();
        this.f51124c = 1;
        while (true) {
            int i10 = this.f51126e;
            if (i10 <= 0) {
                this.f51126e = 0;
                this.f51127f = false;
                this.f51128g = false;
                this.f51129h = 0;
                this.f51131j = 0;
                this.f51132k = 0;
                return;
            }
            int[] iArr = this.f51125d;
            int i11 = i10 - 1;
            this.f51126e = i11;
            iArr[i11] = 0;
        }
    }

    public int t(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        h0(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f51122a;
        int i10 = this.f51123b - iRemaining;
        this.f51123b = i10;
        byteBuffer2.position(i10);
        this.f51122a.put(byteBuffer);
        return E();
    }

    public int u(byte[] bArr) {
        int length = bArr.length;
        h0(1, length, 1);
        ByteBuffer byteBuffer = this.f51122a;
        int i10 = this.f51123b - length;
        this.f51123b = i10;
        byteBuffer.position(i10);
        this.f51122a.put(bArr);
        return E();
    }

    public int v(byte[] bArr, int i10, int i11) {
        h0(1, i11, 1);
        ByteBuffer byteBuffer = this.f51122a;
        int i12 = this.f51123b - i11;
        this.f51123b = i12;
        byteBuffer.position(i12);
        this.f51122a.put(bArr, i10, i11);
        return E();
    }

    public <T extends v> int w(T t10, int[] iArr) {
        t10.t(iArr, this.f51122a);
        return A(iArr);
    }

    public int x(CharSequence charSequence) {
        int iC = this.f51135n.c(charSequence);
        d((byte) 0);
        h0(1, iC, 1);
        ByteBuffer byteBuffer = this.f51122a;
        int i10 = this.f51123b - iC;
        this.f51123b = i10;
        byteBuffer.position(i10);
        this.f51135n.b(charSequence, this.f51122a);
        return E();
    }

    public int y(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        d((byte) 0);
        h0(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f51122a;
        int i10 = this.f51123b - iRemaining;
        this.f51123b = i10;
        byteBuffer2.position(i10);
        this.f51122a.put(byteBuffer);
        return E();
    }

    public ByteBuffer z(int i10, int i11, int i12) {
        int i13 = i10 * i11;
        h0(i10, i11, i12);
        ByteBuffer byteBuffer = this.f51122a;
        int i14 = this.f51123b - i13;
        this.f51123b = i14;
        byteBuffer.position(i14);
        ByteBuffer byteBufferOrder = this.f51122a.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i13);
        return byteBufferOrder;
    }

    public i(int i10, b bVar, ByteBuffer byteBuffer, x xVar) {
        this.f51124c = 1;
        this.f51125d = null;
        this.f51126e = 0;
        this.f51127f = false;
        this.f51128g = false;
        this.f51130i = new int[16];
        this.f51131j = 0;
        this.f51132k = 0;
        this.f51133l = false;
        i10 = i10 <= 0 ? 1 : i10;
        this.f51134m = bVar;
        if (byteBuffer != null) {
            this.f51122a = byteBuffer;
            byteBuffer.clear();
            this.f51122a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f51122a = bVar.a(i10);
        }
        this.f51135n = xVar;
        this.f51123b = this.f51122a.capacity();
    }

    public i(int i10) {
        this(i10, c.f51137a, null, x.d());
    }

    public i() {
        this(1024);
    }

    public i(ByteBuffer byteBuffer, b bVar) {
        this(byteBuffer.capacity(), bVar, byteBuffer, x.d());
    }

    public i(ByteBuffer byteBuffer) {
        this(byteBuffer, new c());
    }
}
