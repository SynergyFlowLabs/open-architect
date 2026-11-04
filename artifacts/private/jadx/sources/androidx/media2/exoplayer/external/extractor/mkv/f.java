package androidx.media2.exoplayer.external.extractor.mkv;

import androidx.annotation.b1;
import androidx.collection.g3;
import androidx.media2.exoplayer.external.extractor.j;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f54245c = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f54246d = 440786851;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f54247a = new x(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54248b;

    private long a(j input) throws InterruptedException, IOException {
        int i10 = 0;
        input.i(this.f54247a.f57720a, 0, 1);
        int i11 = this.f54247a.f57720a[0] & 255;
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
        input.i(this.f54247a.f57720a, 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f54247a.f57720a[i10] & 255) + (i14 << 8);
        }
        this.f54248b += i13 + 1;
        return i14;
    }

    public boolean b(j input) throws InterruptedException, IOException {
        long length = input.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        input.i(this.f54247a.f57720a, 0, 4);
        long jF = this.f54247a.F();
        this.f54248b = 4;
        while (jF != 440786851) {
            int i11 = this.f54248b + 1;
            this.f54248b = i11;
            if (i11 == i10) {
                return false;
            }
            input.i(this.f54247a.f57720a, 0, 1);
            jF = ((jF << 8) & (-256)) | ((long) (this.f54247a.f57720a[0] & 255));
        }
        long jA = a(input);
        long j11 = this.f54248b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f54248b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(input) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(input);
                    if (jA2 >= 0 && jA2 <= g3.f12256c) {
                        if (jA2 != 0) {
                            int i13 = (int) jA2;
                            input.n(i13);
                            this.f54248b += i13;
                        }
                    }
                    return false;
                }
                if (i12 == j12) {
                    return true;
                }
            }
        }
        return false;
    }
}
