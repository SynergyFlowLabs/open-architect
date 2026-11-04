package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class i implements s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f67367i = 65536;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67368j = 524288;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f67369k = 4096;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.l f67371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f67372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f67373e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f67375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f67376h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f67374f = new byte[65536];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f67370b = new byte[4096];

    static {
        androidx.media3.common.p0.a("media3.extractor");
    }

    public i(androidx.media3.common.l lVar, long j10, long j11) {
        this.f67371c = lVar;
        this.f67373e = j10;
        this.f67372d = j11;
    }

    private void A(int i10) {
        int i11 = this.f67376h - i10;
        this.f67376h = i11;
        this.f67375g = 0;
        byte[] bArr = this.f67374f;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f67374f = bArr2;
    }

    private void u(int i10) {
        if (i10 != -1) {
            this.f67373e += (long) i10;
        }
    }

    private void v(int i10) {
        int i11 = this.f67375g + i10;
        byte[] bArr = this.f67374f;
        if (i11 > bArr.length) {
            this.f67374f = Arrays.copyOf(this.f67374f, k1.w(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int x(byte[] bArr, int i10, int i11) {
        int i12 = this.f67376h;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f67374f, 0, bArr, i10, iMin);
        A(iMin);
        return iMin;
    }

    private int y(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f67371c.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int z(int i10) {
        int iMin = Math.min(this.f67376h, i10);
        A(iMin);
        return iMin;
    }

    @Override // androidx.media3.extractor.s
    public int b(int i10) throws IOException {
        i iVar;
        int iZ = z(i10);
        if (iZ == 0) {
            byte[] bArr = this.f67370b;
            iVar = this;
            iZ = iVar.y(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            iVar = this;
        }
        iVar.u(iZ);
        return iZ;
    }

    @Override // androidx.media3.extractor.s
    public boolean d(int i10, boolean z10) throws IOException {
        int iZ = z(i10);
        while (iZ < i10 && iZ != -1) {
            iZ = y(this.f67370b, -iZ, Math.min(i10, this.f67370b.length + iZ), iZ, z10);
        }
        u(iZ);
        if (iZ == -1) {
            return false;
        }
        int i11 = 4 ^ 1;
        return true;
    }

    @Override // androidx.media3.extractor.s
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iX = x(bArr, i10, i11);
        while (iX < i11 && iX != -1) {
            iX = y(bArr, i10, i11, iX, z10);
        }
        u(iX);
        return iX != -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // androidx.media3.extractor.s
    public <E extends Throwable> void g(long j10, E e10) throws Throwable {
        androidx.media3.common.util.a.a(j10 >= 0);
        this.f67373e = j10;
        throw e10;
    }

    @Override // androidx.media3.extractor.s
    public long getLength() {
        return this.f67372d;
    }

    @Override // androidx.media3.extractor.s
    public long getPosition() {
        return this.f67373e;
    }

    @Override // androidx.media3.extractor.s
    public void i(byte[] bArr, int i10, int i11) throws IOException {
        k(bArr, i10, i11, false);
    }

    @Override // androidx.media3.extractor.s
    public boolean k(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!p(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f67374f, this.f67375g - i11, bArr, i10, i11);
        return true;
    }

    @Override // androidx.media3.extractor.s
    public void l() {
        this.f67375g = 0;
    }

    @Override // androidx.media3.extractor.s
    public long m() {
        return this.f67373e + ((long) this.f67375g);
    }

    @Override // androidx.media3.extractor.s
    public void n(int i10) throws IOException {
        p(i10, false);
    }

    @Override // androidx.media3.extractor.s
    public void o(int i10) throws IOException {
        d(i10, false);
    }

    @Override // androidx.media3.extractor.s
    public boolean p(int i10, boolean z10) throws IOException {
        v(i10);
        int iY = this.f67376h - this.f67375g;
        while (iY < i10) {
            i iVar = this;
            int i11 = i10;
            boolean z11 = z10;
            iY = iVar.y(this.f67374f, this.f67375g, i11, iY, z11);
            if (iY == -1) {
                return false;
            }
            iVar.f67376h = iVar.f67375g + iY;
            this = iVar;
            i10 = i11;
            z10 = z11;
        }
        this.f67375g += i10;
        return true;
    }

    @Override // androidx.media3.extractor.s
    public int r(byte[] bArr, int i10, int i11) throws IOException {
        i iVar;
        int iMin;
        v(i11);
        int i12 = this.f67376h;
        int i13 = this.f67375g;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iVar = this;
            iMin = iVar.y(this.f67374f, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            iVar.f67376h += iMin;
        } else {
            iVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(iVar.f67374f, iVar.f67375g, bArr, i10, iMin);
        iVar.f67375g += iMin;
        return iMin;
    }

    @Override // androidx.media3.extractor.s, androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        i iVar;
        int iX = x(bArr, i10, i11);
        if (iX == 0) {
            int i12 = 3 << 1;
            iVar = this;
            iX = iVar.y(bArr, i10, i11, 0, true);
        } else {
            iVar = this;
        }
        iVar.u(iX);
        return iX;
    }

    @Override // androidx.media3.extractor.s
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        e(bArr, i10, i11, false);
    }

    public androidx.media3.common.l w() {
        return this.f67371c;
    }
}
