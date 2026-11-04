package com.davidehrmann.vcdiff.engine;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f97806h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final int f97807i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final int f97808j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final e f97809k = new e(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f97810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f97811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f97812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f97813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f97814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f97815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f97816g;

    /* JADX INFO: renamed from: com.davidehrmann.vcdiff.engine.a$a, reason: collision with other inner class name */
    public static class C0881a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f97817a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f97818b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f97819c = -1;

        public void a(int i10, int i11, int i12) {
            if (i10 > this.f97817a) {
                this.f97817a = i10;
                this.f97818b = i11;
                this.f97819c = i12;
            }
        }

        public int b() {
            return this.f97817a;
        }

        public int c() {
            return this.f97818b;
        }

        public int d() {
            return this.f97819c;
        }
    }

    public a(byte[] bArr, int i10, boolean z10) {
        this(ByteBuffer.wrap(bArr), i10, z10);
    }

    protected static boolean e(byte[] bArr, int i10, ByteBuffer byteBuffer, int i11) {
        for (int i12 = 0; i12 < 16; i12++) {
            if (bArr[i10 + i12] != byteBuffer.get(i11 + i12)) {
                return false;
            }
        }
        return true;
    }

    protected static boolean f(byte[] bArr, int i10, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 < 16; i12++) {
            if (bArr[i10 + i12] != bArr2[i11 + i12]) {
                return false;
            }
        }
        return true;
    }

    protected static int g(int i10) {
        int i11 = 1;
        int i12 = (i10 / 4) + 1;
        while (i11 < i12) {
            i11 <<= 1;
            if (i11 <= 0) {
                throw new IllegalStateException(String.format("Internal error: CalcTableSize(dictionarySize = %d): resulting table_size %d is zero or negative", Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }
        if (((i11 - 1) & i11) != 0) {
            throw new IllegalStateException(String.format("Internal error: CalcTableSize(dictionarySize = %d): resulting table_size %d is not a power of 2", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i10 <= 0 || i11 <= i12 * 2) {
            return i11;
        }
        throw new IllegalStateException(String.format("Internal error: CalcTableSize(dictionarySize = %d): resulting table_size %d is too large", Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public static a h(byte[] bArr) {
        return new a(bArr, 0, true);
    }

    public static a i(ByteBuffer byteBuffer, int i10) {
        return new a(byteBuffer, i10, false);
    }

    public static a j(byte[] bArr, int i10) {
        return new a(bArr, i10, false);
    }

    protected static int p(ByteBuffer byteBuffer, int i10, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            i10--;
            i11--;
            if (byteBuffer.get(i10) != bArr[i11]) {
                break;
            }
            i13++;
        }
        return i13;
    }

    protected static int q(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            i10--;
            i11--;
            if (bArr[i10] != bArr2[i11]) {
                break;
            }
            i13++;
        }
        return i13;
    }

    protected static int r(ByteBuffer byteBuffer, int i10, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12 && byteBuffer.get(i10) == bArr[i11]) {
            i13++;
            i10++;
            i11++;
        }
        return i13;
    }

    protected static int s(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12 && bArr[i10] == bArr2[i11]) {
            i13++;
            i10++;
            i11++;
        }
        return i13;
    }

    protected void a() {
        b(this.f97810a.limit());
    }

    public void b(int i10) {
        if (i10 > this.f97810a.limit()) {
            throw new IllegalArgumentException("AddAllBlocksThroughIndex() called with index " + i10 + " higher than end index " + this.f97810a.limit());
        }
        int i11 = this.f97816g * 16;
        if (i10 <= i11) {
            throw new IllegalArgumentException("AddAllBlocksThroughIndex() called with index " + i10 + " <= last index added ( " + i11 + ")");
        }
        if (this.f97810a.remaining() < 16) {
            return;
        }
        int iLimit = this.f97810a.limit();
        if (i10 > iLimit - 16) {
            i10 = iLimit - 15;
        }
        ByteBuffer byteBufferDuplicate = this.f97810a.duplicate();
        byteBufferDuplicate.position(t());
        while (byteBufferDuplicate.position() < i10) {
            c((int) f97809k.a(byteBufferDuplicate));
        }
    }

    protected void c(int i10) {
        int i11 = this.f97816g + 1;
        int iLimit = this.f97810a.limit() / 16;
        if (i11 >= iLimit) {
            throw new IllegalArgumentException(String.format("BlockHash.AddBlock() called with block number %d. This is past last block %d", Integer.valueOf(i11), Integer.valueOf(iLimit - 1)));
        }
        if (this.f97812c[i11] != -1) {
            throw new IllegalStateException(String.format("Internal error in BlockHash.AddBlock(): block number = %d, next block should be -1 but is %d", Integer.valueOf(i11), Integer.valueOf(this.f97812c[i11])));
        }
        int iN = n(i10);
        int[] iArr = this.f97811b;
        int i12 = iArr[iN];
        if (i12 < 0) {
            iArr[iN] = i11;
            this.f97813d[i11] = i11;
        } else {
            int[] iArr2 = this.f97813d;
            int i13 = iArr2[i12];
            int[] iArr3 = this.f97812c;
            if (iArr3[i13] != -1) {
                throw new IllegalStateException(String.format("Internal error in BlockHash.AddBlock(): first matching block = %d, last matching block = %d, next block should be -1 but is %d", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(this.f97812c[i13])));
            }
            iArr3[i13] = i11;
            iArr2[i12] = i11;
        }
        this.f97816g = i11;
    }

    public void d(int i10, int i11) {
        if (i10 == t()) {
            c(i11);
        }
    }

    public void k(int i10, ByteBuffer byteBuffer, C0881a c0881a) {
        int iM = m(i10, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position());
        int i11 = 0;
        while (iM >= 0) {
            i11++;
            if (i11 > 64) {
                return;
            }
            int i12 = iM * 16;
            int i13 = i12 + 16;
            int iPosition = byteBuffer.position();
            int i14 = iPosition + 16;
            int iP = p(this.f97810a, i12, byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, Math.min(i12, iPosition));
            int i15 = iPosition - iP;
            int iMin = Math.min(this.f97810a.limit() - i13, byteBuffer.limit() - i14);
            c0881a.a(iP + 16 + r(this.f97810a, i13, byteBuffer.array(), byteBuffer.arrayOffset() + i14, iMin), (i12 - iP) + this.f97815f, i15);
            iM = u(iM, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position());
        }
    }

    public void l(int i10, byte[] bArr, int i11, byte[] bArr2, int i12, C0881a c0881a) {
        if (bArr != bArr2) {
            throw new IllegalArgumentException("target_candidate != target");
        }
        if (i11 < i12) {
            throw new IllegalArgumentException("target_candidate_start < target_start");
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2, i12, bArr2.length - i12);
        byteBufferWrap.position(i11);
        k(i10, byteBufferWrap, c0881a);
    }

    protected int m(int i10, byte[] bArr, int i11) {
        return v(this.f97811b[n(i10)], bArr, i11);
    }

    protected int n(int i10) {
        return this.f97814e & i10;
    }

    protected int o() {
        return this.f97810a.limit() / 16;
    }

    protected int t() {
        return (this.f97816g + 1) * 16;
    }

    protected int u(int i10, byte[] bArr, int i11) {
        if (i10 < o()) {
            return v(this.f97812c[i10], bArr, i11);
        }
        throw new IllegalArgumentException("NextMatchingBlock called for invalid block number " + i10);
    }

    protected int v(int i10, byte[] bArr, int i11) {
        int i12 = 0;
        while (i10 >= 0 && !e(bArr, i11, this.f97810a, i10 * 16)) {
            i12++;
            if (i12 > 16) {
                return -1;
            }
            i10 = this.f97812c[i10];
        }
        return i10;
    }

    public a(ByteBuffer byteBuffer, int i10, boolean z10) {
        this.f97816g = -1;
        int iG = g(byteBuffer.remaining());
        if (iG == 0) {
            throw new IllegalArgumentException("Error finding table size for source size " + byteBuffer.remaining());
        }
        this.f97810a = byteBuffer;
        this.f97815f = i10;
        this.f97814e = iG - 1;
        int[] iArr = new int[iG];
        this.f97811b = iArr;
        Arrays.fill(iArr, -1);
        int[] iArr2 = new int[o()];
        this.f97812c = iArr2;
        int[] iArr3 = new int[o()];
        this.f97813d = iArr3;
        Arrays.fill(iArr2, -1);
        Arrays.fill(iArr3, -1);
        if (z10) {
            a();
        }
    }
}
