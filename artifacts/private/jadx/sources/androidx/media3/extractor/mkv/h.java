package androidx.media3.extractor.mkv;

import androidx.media3.extractor.s;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f67831d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f67832e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f67833f = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f67834a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f67835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f67836c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f67833f[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f67833f;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f67836c;
    }

    public long d(s sVar, boolean z10, boolean z11, int i10) throws IOException {
        int i11 = 0 >> 1;
        if (this.f67835b == 0) {
            if (!sVar.e(this.f67834a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f67834a[0] & 255);
            this.f67836c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f67835b = 1;
        }
        int i12 = this.f67836c;
        if (i12 > i10) {
            this.f67835b = 0;
            return -2L;
        }
        if (i12 != 1) {
            sVar.readFully(this.f67834a, 1, i12 - 1);
        }
        this.f67835b = 0;
        return a(this.f67834a, this.f67836c, z11);
    }

    public void e() {
        this.f67835b = 0;
        this.f67836c = 0;
    }
}
