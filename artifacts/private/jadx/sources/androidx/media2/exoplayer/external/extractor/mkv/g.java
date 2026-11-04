package androidx.media2.exoplayer.external.extractor.mkv;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.j;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f54249d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f54250e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f54251f = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54252a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54254c;

    public static long a(byte[] varintBytes, int varintLength, boolean removeLengthMask) {
        long j10 = ((long) varintBytes[0]) & 255;
        if (removeLengthMask) {
            j10 &= ~f54251f[varintLength - 1];
        }
        for (int i10 = 1; i10 < varintLength; i10++) {
            j10 = (j10 << 8) | (((long) varintBytes[i10]) & 255);
        }
        return j10;
    }

    public static int c(int firstByte) {
        int i10 = 0;
        while (true) {
            long[] jArr = f54251f;
            if (i10 >= jArr.length) {
                return -1;
            }
            if ((jArr[i10] & ((long) firstByte)) != 0) {
                return i10 + 1;
            }
            i10++;
        }
    }

    public int b() {
        return this.f54254c;
    }

    public long d(j input, boolean allowEndOfInput, boolean removeLengthMask, int maximumAllowedLength) throws InterruptedException, IOException {
        if (this.f54253b == 0) {
            if (!input.e(this.f54252a, 0, 1, allowEndOfInput)) {
                return -1L;
            }
            int iC = c(this.f54252a[0] & 255);
            this.f54254c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f54253b = 1;
        }
        int i10 = this.f54254c;
        if (i10 > maximumAllowedLength) {
            this.f54253b = 0;
            return -2L;
        }
        if (i10 != 1) {
            input.readFully(this.f54252a, 1, i10 - 1);
        }
        this.f54253b = 0;
        return a(this.f54252a, this.f54254c, removeLengthMask);
    }

    public void e() {
        this.f54253b = 0;
        this.f54254c = 0;
    }
}
