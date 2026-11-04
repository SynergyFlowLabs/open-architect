package com.google.flatbuffers;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f125215o = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ByteBuffer f125216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f125217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f125218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f125219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f125220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f125221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f125222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f125223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f125224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f125225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f125226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f125227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    b f125228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final f f125229n;

    static class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ByteBuffer f125230a;

        public a(ByteBuffer byteBuffer) {
            this.f125230a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f125230a.get() & 255;
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

    /* JADX INFO: renamed from: com.google.flatbuffers.c$c, reason: collision with other inner class name */
    public static final class C1193c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1193c f125231a = new C1193c();

        @Override // com.google.flatbuffers.c.b
        public ByteBuffer a(int i10) {
            return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public c(int i10, b bVar) {
        this(i10, bVar, null, f.d());
    }

    @Deprecated
    private int A() {
        J();
        return this.f125217b;
    }

    static ByteBuffer L(ByteBuffer byteBuffer, b bVar) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i10 = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferA = bVar.a(i10);
        byteBufferA.position(i10 - iCapacity);
        byteBufferA.put(byteBuffer);
        return byteBufferA;
    }

    public int B() {
        int i10;
        if (this.f125219d == null || !this.f125221f) {
            throw new AssertionError("FlatBuffers: endObject called without startObject");
        }
        j(0);
        int iO = O();
        int i11 = this.f125220e - 1;
        while (i11 >= 0 && this.f125219d[i11] == 0) {
            i11--;
        }
        for (int i12 = i11; i12 >= 0; i12--) {
            int i13 = this.f125219d[i12];
            q((short) (i13 != 0 ? iO - i13 : 0));
        }
        q((short) (iO - this.f125223h));
        q((short) ((i11 + 3) * 2));
        int i14 = 0;
        loop2: while (true) {
            if (i14 >= this.f125225j) {
                i10 = 0;
                break;
            }
            int iCapacity = this.f125216a.capacity() - this.f125224i[i14];
            int i15 = this.f125217b;
            short s10 = this.f125216a.getShort(iCapacity);
            if (s10 == this.f125216a.getShort(i15)) {
                int i16 = 2;
                while (true) {
                    if (i16 >= s10) {
                        i10 = this.f125224i[i14];
                        break loop2;
                    }
                    if (this.f125216a.getShort(iCapacity + i16) != this.f125216a.getShort(i15 + i16)) {
                        break;
                    }
                    i16 += 2;
                }
            }
            i14++;
        }
        if (i10 != 0) {
            int iCapacity2 = this.f125216a.capacity() - iO;
            this.f125217b = iCapacity2;
            this.f125216a.putInt(iCapacity2, i10 - iO);
        } else {
            int i17 = this.f125225j;
            int[] iArr = this.f125224i;
            if (i17 == iArr.length) {
                this.f125224i = Arrays.copyOf(iArr, i17 * 2);
            }
            int[] iArr2 = this.f125224i;
            int i18 = this.f125225j;
            this.f125225j = i18 + 1;
            iArr2[i18] = O();
            ByteBuffer byteBuffer = this.f125216a;
            byteBuffer.putInt(byteBuffer.capacity() - iO, O() - iO);
        }
        this.f125221f = false;
        return iO;
    }

    public int C() {
        if (!this.f125221f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f125221f = false;
        V(this.f125226k);
        return O();
    }

    public void D(int i10) {
        G(i10, false);
    }

    public void E(int i10, String str) {
        F(i10, str, false);
    }

    protected void F(int i10, String str, boolean z10) {
        Q(this.f125218c, (z10 ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i11 = 3; i11 >= 0; i11--) {
            d((byte) str.charAt(i11));
        }
        G(i10, z10);
    }

    protected void G(int i10, boolean z10) {
        Q(this.f125218c, (z10 ? 4 : 0) + 4);
        n(i10);
        if (z10) {
            j(this.f125216a.capacity() - this.f125217b);
        }
        this.f125216a.position(this.f125217b);
        this.f125222g = true;
    }

    public void H(int i10) {
        G(i10, true);
    }

    public void I(int i10, String str) {
        F(i10, str, true);
    }

    public void J() {
        if (!this.f125222g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public c K(boolean z10) {
        this.f125227l = z10;
        return this;
    }

    public c M(ByteBuffer byteBuffer, b bVar) {
        this.f125228m = bVar;
        this.f125216a = byteBuffer;
        byteBuffer.clear();
        this.f125216a.order(ByteOrder.LITTLE_ENDIAN);
        this.f125218c = 1;
        this.f125217b = this.f125216a.capacity();
        this.f125220e = 0;
        this.f125221f = false;
        this.f125222g = false;
        this.f125223h = 0;
        this.f125225j = 0;
        this.f125226k = 0;
        return this;
    }

    public void N() {
        if (this.f125221f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int O() {
        return this.f125216a.capacity() - this.f125217b;
    }

    public void P(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBuffer = this.f125216a;
            int i12 = this.f125217b - 1;
            this.f125217b = i12;
            byteBuffer.put(i12, (byte) 0);
        }
    }

    public void Q(int i10, int i11) {
        if (i10 > this.f125218c) {
            this.f125218c = i10;
        }
        int i12 = ((~((this.f125216a.capacity() - this.f125217b) + i11)) + 1) & (i10 - 1);
        while (this.f125217b < i12 + i10 + i11) {
            int iCapacity = this.f125216a.capacity();
            ByteBuffer byteBuffer = this.f125216a;
            ByteBuffer byteBufferL = L(byteBuffer, this.f125228m);
            this.f125216a = byteBufferL;
            if (byteBuffer != byteBufferL) {
                this.f125228m.b(byteBuffer);
            }
            this.f125217b += this.f125216a.capacity() - iCapacity;
        }
        P(i12);
    }

    public void R(boolean z10) {
        ByteBuffer byteBuffer = this.f125216a;
        int i10 = this.f125217b - 1;
        this.f125217b = i10;
        byteBuffer.put(i10, z10 ? (byte) 1 : (byte) 0);
    }

    public void S(byte b10) {
        ByteBuffer byteBuffer = this.f125216a;
        int i10 = this.f125217b - 1;
        this.f125217b = i10;
        byteBuffer.put(i10, b10);
    }

    public void T(double d10) {
        ByteBuffer byteBuffer = this.f125216a;
        int i10 = this.f125217b - 8;
        this.f125217b = i10;
        byteBuffer.putDouble(i10, d10);
    }

    public void U(float f10) {
        ByteBuffer byteBuffer = this.f125216a;
        int i10 = this.f125217b - 4;
        this.f125217b = i10;
        byteBuffer.putFloat(i10, f10);
    }

    public void V(int i10) {
        ByteBuffer byteBuffer = this.f125216a;
        int i11 = this.f125217b - 4;
        this.f125217b = i11;
        byteBuffer.putInt(i11, i10);
    }

    public void W(long j10) {
        ByteBuffer byteBuffer = this.f125216a;
        int i10 = this.f125217b - 8;
        this.f125217b = i10;
        byteBuffer.putLong(i10, j10);
    }

    public void X(short s10) {
        ByteBuffer byteBuffer = this.f125216a;
        int i10 = this.f125217b - 2;
        this.f125217b = i10;
        byteBuffer.putShort(i10, s10);
    }

    public void Y(int i10, int i11) {
        int iCapacity = this.f125216a.capacity() - i10;
        if (this.f125216a.getShort((iCapacity - this.f125216a.getInt(iCapacity)) + i11) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i11 + " must be set");
    }

    public byte[] Z() {
        return a0(this.f125217b, this.f125216a.capacity() - this.f125217b);
    }

    public void a(int i10) {
        if (i10 != O()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public byte[] a0(int i10, int i11) {
        J();
        byte[] bArr = new byte[i11];
        this.f125216a.position(i10);
        this.f125216a.get(bArr);
        return bArr;
    }

    public void b(int i10, boolean z10, boolean z11) {
        if (!this.f125227l && z10 == z11) {
            return;
        }
        c(z10);
        c0(i10);
    }

    public InputStream b0() {
        J();
        ByteBuffer byteBufferDuplicate = this.f125216a.duplicate();
        byteBufferDuplicate.position(this.f125217b);
        byteBufferDuplicate.limit(this.f125216a.capacity());
        return new a(byteBufferDuplicate);
    }

    public void c(boolean z10) {
        Q(1, 0);
        R(z10);
    }

    public void c0(int i10) {
        this.f125219d[i10] = O();
    }

    public void d(byte b10) {
        Q(1, 0);
        S(b10);
    }

    public void d0(int i10) {
        N();
        int[] iArr = this.f125219d;
        if (iArr == null || iArr.length < i10) {
            this.f125219d = new int[i10];
        }
        this.f125220e = i10;
        Arrays.fill(this.f125219d, 0, i10, 0);
        this.f125221f = true;
        this.f125223h = O();
    }

    public void e(int i10, byte b10, int i11) {
        if (this.f125227l || b10 != i11) {
            d(b10);
            c0(i10);
        }
    }

    public void e0(int i10, int i11, int i12) {
        N();
        this.f125226k = i11;
        int i13 = i10 * i11;
        Q(4, i13);
        Q(i12, i13);
        this.f125221f = true;
    }

    public void f(double d10) {
        Q(8, 0);
        T(d10);
    }

    public void g(int i10, double d10, double d11) {
        if (this.f125227l || d10 != d11) {
            f(d10);
            c0(i10);
        }
    }

    public void h(float f10) {
        Q(4, 0);
        U(f10);
    }

    public void i(int i10, float f10, double d10) {
        if (!this.f125227l && f10 == d10) {
            return;
        }
        h(f10);
        c0(i10);
    }

    public void j(int i10) {
        Q(4, 0);
        V(i10);
    }

    public void k(int i10, int i11, int i12) {
        if (this.f125227l || i11 != i12) {
            j(i11);
            c0(i10);
        }
    }

    public void l(int i10, long j10, long j11) {
        if (!this.f125227l && j10 == j11) {
            return;
        }
        m(j10);
        c0(i10);
    }

    public void m(long j10) {
        Q(8, 0);
        W(j10);
    }

    public void n(int i10) {
        Q(4, 0);
        V((O() - i10) + 4);
    }

    public void o(int i10, int i11, int i12) {
        if (!this.f125227l && i11 == i12) {
            return;
        }
        n(i11);
        c0(i10);
    }

    public void p(int i10, short s10, int i11) {
        if (this.f125227l || s10 != i11) {
            q(s10);
            c0(i10);
        }
    }

    public void q(short s10) {
        Q(2, 0);
        X(s10);
    }

    public void r(int i10, int i11, int i12) {
        if (i11 != i12) {
            a(i11);
            c0(i10);
        }
    }

    public void s() {
        this.f125217b = this.f125216a.capacity();
        this.f125216a.clear();
        int i10 = 6 ^ 1;
        this.f125218c = 1;
        while (true) {
            int i11 = this.f125220e;
            if (i11 <= 0) {
                this.f125220e = 0;
                this.f125221f = false;
                this.f125222g = false;
                this.f125223h = 0;
                this.f125225j = 0;
                this.f125226k = 0;
                return;
            }
            int[] iArr = this.f125219d;
            int i12 = i11 - 1;
            this.f125220e = i12;
            iArr[i12] = 0;
        }
    }

    public int t(byte[] bArr) {
        int length = bArr.length;
        e0(1, length, 1);
        ByteBuffer byteBuffer = this.f125216a;
        int i10 = this.f125217b - length;
        this.f125217b = i10;
        byteBuffer.position(i10);
        this.f125216a.put(bArr);
        return C();
    }

    public <T extends e> int u(T t10, int[] iArr) {
        t10.q(iArr, this.f125216a);
        return y(iArr);
    }

    public int v(CharSequence charSequence) {
        int iC = this.f125229n.c(charSequence);
        d((byte) 0);
        e0(1, iC, 1);
        ByteBuffer byteBuffer = this.f125216a;
        int i10 = this.f125217b - iC;
        this.f125217b = i10;
        byteBuffer.position(i10);
        this.f125229n.b(charSequence, this.f125216a);
        return C();
    }

    public int w(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        d((byte) 0);
        e0(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f125216a;
        int i10 = this.f125217b - iRemaining;
        this.f125217b = i10;
        byteBuffer2.position(i10);
        this.f125216a.put(byteBuffer);
        return C();
    }

    public ByteBuffer x(int i10, int i11, int i12) {
        int i13 = i10 * i11;
        e0(i10, i11, i12);
        ByteBuffer byteBuffer = this.f125216a;
        int i14 = this.f125217b - i13;
        this.f125217b = i14;
        byteBuffer.position(i14);
        ByteBuffer byteBufferOrder = this.f125216a.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i13);
        return byteBufferOrder;
    }

    public int y(int[] iArr) {
        N();
        e0(4, iArr.length, 4);
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return C();
            }
            n(iArr[length]);
        }
    }

    public ByteBuffer z() {
        J();
        return this.f125216a;
    }

    public c(int i10, b bVar, ByteBuffer byteBuffer, f fVar) {
        this.f125218c = 1;
        this.f125219d = null;
        int i11 = 0 << 0;
        this.f125220e = 0;
        this.f125221f = false;
        this.f125222g = false;
        this.f125224i = new int[16];
        this.f125225j = 0;
        this.f125226k = 0;
        this.f125227l = false;
        i10 = i10 <= 0 ? 1 : i10;
        this.f125217b = i10;
        this.f125228m = bVar;
        if (byteBuffer != null) {
            this.f125216a = byteBuffer;
            byteBuffer.clear();
            this.f125216a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f125216a = bVar.a(i10);
        }
        this.f125229n = fVar;
    }

    public c(int i10) {
        this(i10, C1193c.f125231a, null, f.d());
    }

    public c() {
        this(1024);
    }

    public c(ByteBuffer byteBuffer, b bVar) {
        this(byteBuffer.capacity(), bVar, byteBuffer, f.d());
    }

    public c(ByteBuffer byteBuffer) {
        this(byteBuffer, new C1193c());
    }
}
