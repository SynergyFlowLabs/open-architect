package androidx.media3.extractor.mkv;

import androidx.collection.g3;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.s;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f67827c = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f67828d = 440786851;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f67829a = new o0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f67830b;

    private long a(s sVar) throws IOException {
        int i10 = 0;
        sVar.i(this.f67829a.e(), 0, 1);
        int i11 = this.f67829a.e()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        sVar.i(this.f67829a.e(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f67829a.e()[i10] & 255) + (i14 << 8);
        }
        this.f67830b += i13 + 1;
        return i14;
    }

    public boolean b(s sVar) throws IOException {
        long length = sVar.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        sVar.i(this.f67829a.e(), 0, 4);
        long jN = this.f67829a.N();
        this.f67830b = 4;
        while (jN != 440786851) {
            int i11 = this.f67830b + 1;
            this.f67830b = i11;
            if (i11 == i10) {
                return false;
            }
            sVar.i(this.f67829a.e(), 0, 1);
            jN = ((jN << 8) & (-256)) | ((long) (this.f67829a.e()[0] & 255));
        }
        long jA = a(sVar);
        long j11 = this.f67830b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f67830b;
                long j12 = j11 + jA;
                if (i12 >= j12) {
                    if (i12 != j12) {
                        break;
                    }
                    return true;
                }
                if (a(sVar) == Long.MIN_VALUE) {
                    return false;
                }
                long jA2 = a(sVar);
                if (jA2 < 0 || jA2 > g3.f12256c) {
                    return false;
                }
                if (jA2 != 0) {
                    int i13 = (int) jA2;
                    sVar.n(i13);
                    this.f67830b += i13;
                }
            }
        }
        return false;
    }
}
