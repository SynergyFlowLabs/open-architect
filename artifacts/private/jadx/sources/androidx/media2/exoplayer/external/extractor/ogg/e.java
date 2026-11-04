package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f54613a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f54614b = new x(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54615c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54617e;

    e() {
    }

    private int a(int startSegmentIndex) {
        int i10;
        int i11 = 0;
        this.f54616d = 0;
        do {
            int i12 = this.f54616d;
            int i13 = startSegmentIndex + i12;
            f fVar = this.f54613a;
            if (i13 >= fVar.f54629g) {
                break;
            }
            int[] iArr = fVar.f54632j;
            this.f54616d = i12 + 1;
            i10 = iArr[i12 + startSegmentIndex];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public f b() {
        return this.f54613a;
    }

    public x c() {
        return this.f54614b;
    }

    public boolean d(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        int i10;
        androidx.media2.exoplayer.external.util.a.i(input != null);
        if (this.f54617e) {
            this.f54617e = false;
            this.f54614b.L();
        }
        while (!this.f54617e) {
            if (this.f54615c < 0) {
                if (!this.f54613a.a(input, true)) {
                    return false;
                }
                f fVar = this.f54613a;
                int iA = fVar.f54630h;
                if ((fVar.f54624b & 1) == 1 && this.f54614b.d() == 0) {
                    iA += a(0);
                    i10 = this.f54616d;
                } else {
                    i10 = 0;
                }
                input.o(iA);
                this.f54615c = i10;
            }
            int iA2 = a(this.f54615c);
            int i11 = this.f54615c + this.f54616d;
            if (iA2 > 0) {
                if (this.f54614b.b() < this.f54614b.d() + iA2) {
                    x xVar = this.f54614b;
                    xVar.f57720a = Arrays.copyOf(xVar.f57720a, xVar.d() + iA2);
                }
                x xVar2 = this.f54614b;
                input.readFully(xVar2.f57720a, xVar2.d(), iA2);
                x xVar3 = this.f54614b;
                xVar3.P(xVar3.d() + iA2);
                this.f54617e = this.f54613a.f54632j[i11 + (-1)] != 255;
            }
            if (i11 == this.f54613a.f54629g) {
                i11 = -1;
            }
            this.f54615c = i11;
        }
        return true;
    }

    public void e() {
        this.f54613a.b();
        this.f54614b.L();
        this.f54615c = -1;
        this.f54617e = false;
    }

    public void f() {
        x xVar = this.f54614b;
        byte[] bArr = xVar.f57720a;
        if (bArr.length == 65025) {
            return;
        }
        xVar.f57720a = Arrays.copyOf(bArr, Math.max(65025, xVar.d()));
    }
}
