package androidx.media2.exoplayer.external.extractor.mkv;

import androidx.annotation.b1;
import androidx.collection.g3;
import androidx.media2.exoplayer.external.extractor.j;
import androidx.media2.exoplayer.external.k0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class a implements androidx.media2.exoplayer.external.extractor.mkv.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54083h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f54084i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54085j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f54086k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f54087l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f54088m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f54089n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f54090o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54091a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<c> f54092b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f54093c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.mkv.b f54094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f54097g;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface b {
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f54099b;

        private c(int elementId, long elementEndPosition) {
            this.f54098a = elementId;
            this.f54099b = elementEndPosition;
        }
    }

    private long a(j input) throws InterruptedException, IOException {
        input.l();
        while (true) {
            input.i(this.f54091a, 0, 4);
            int iC = g.c(this.f54091a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f54091a, iC, false);
                if (this.f54094d.g(iA)) {
                    input.o(iC);
                    return iA;
                }
            }
            input.o(1);
        }
    }

    private double d(j input, int byteLength) throws InterruptedException, IOException {
        long jE = e(input, byteLength);
        return byteLength == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    private long e(j input, int byteLength) throws InterruptedException, IOException {
        input.readFully(this.f54091a, 0, byteLength);
        long j10 = 0;
        for (int i10 = 0; i10 < byteLength; i10++) {
            j10 = (j10 << 8) | ((long) (this.f54091a[i10] & 255));
        }
        return j10;
    }

    private String f(j input, int byteLength) throws InterruptedException, IOException {
        if (byteLength == 0) {
            return "";
        }
        byte[] bArr = new byte[byteLength];
        input.readFully(bArr, 0, byteLength);
        while (byteLength > 0 && bArr[byteLength - 1] == 0) {
            byteLength--;
        }
        return new String(bArr, 0, byteLength);
    }

    @Override // androidx.media2.exoplayer.external.extractor.mkv.c
    public boolean b(j input) throws InterruptedException, IOException {
        androidx.media2.exoplayer.external.util.a.g(this.f54094d);
        while (true) {
            if (!this.f54092b.isEmpty() && input.getPosition() >= this.f54092b.peek().f54099b) {
                this.f54094d.a(this.f54092b.pop().f54098a);
                return true;
            }
            if (this.f54095e == 0) {
                long jD = this.f54093c.d(input, true, false, 4);
                if (jD == -2) {
                    jD = a(input);
                }
                if (jD == -1) {
                    return false;
                }
                this.f54096f = (int) jD;
                this.f54095e = 1;
            }
            if (this.f54095e == 1) {
                this.f54097g = this.f54093c.d(input, false, true, 8);
                this.f54095e = 2;
            }
            int iF = this.f54094d.f(this.f54096f);
            if (iF != 0) {
                if (iF == 1) {
                    long position = input.getPosition();
                    this.f54092b.push(new c(this.f54096f, this.f54097g + position));
                    this.f54094d.e(this.f54096f, position, this.f54097g);
                    this.f54095e = 0;
                    return true;
                }
                if (iF == 2) {
                    long j10 = this.f54097g;
                    if (j10 <= 8) {
                        this.f54094d.c(this.f54096f, e(input, (int) j10));
                        this.f54095e = 0;
                        return true;
                    }
                    long j11 = this.f54097g;
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Invalid integer size: ");
                    sb2.append(j11);
                    throw new k0(sb2.toString());
                }
                if (iF == 3) {
                    long j12 = this.f54097g;
                    if (j12 <= g3.f12256c) {
                        this.f54094d.d(this.f54096f, f(input, (int) j12));
                        this.f54095e = 0;
                        return true;
                    }
                    long j13 = this.f54097g;
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("String element size: ");
                    sb3.append(j13);
                    throw new k0(sb3.toString());
                }
                if (iF == 4) {
                    this.f54094d.h(this.f54096f, (int) this.f54097g, input);
                    this.f54095e = 0;
                    return true;
                }
                if (iF != 5) {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(iF);
                    throw new k0(sb4.toString());
                }
                long j14 = this.f54097g;
                if (j14 == 4 || j14 == 8) {
                    this.f54094d.b(this.f54096f, d(input, (int) j14));
                    this.f54095e = 0;
                    return true;
                }
                long j15 = this.f54097g;
                StringBuilder sb5 = new StringBuilder(40);
                sb5.append("Invalid float size: ");
                sb5.append(j15);
                throw new k0(sb5.toString());
            }
            input.o((int) this.f54097g);
            this.f54095e = 0;
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.mkv.c
    public void c(androidx.media2.exoplayer.external.extractor.mkv.b processor) {
        this.f54094d = processor;
    }

    @Override // androidx.media2.exoplayer.external.extractor.mkv.c
    public void reset() {
        this.f54095e = 0;
        this.f54092b.clear();
        this.f54093c.e();
    }
}
