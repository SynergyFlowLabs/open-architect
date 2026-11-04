package androidx.media3.extractor.mkv;

import androidx.collection.g3;
import androidx.media3.common.v0;
import androidx.media3.extractor.s;
import il.m;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
final class a implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67649h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f67650i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67651j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f67652k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f67653l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f67654m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f67655n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f67656o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f67657a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f67658b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f67659c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.extractor.mkv.b f67660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f67661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f67662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f67663g;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f67664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f67665b;

        private b(int i10, long j10) {
            this.f67664a = i10;
            this.f67665b = j10;
        }
    }

    @m({"processor"})
    private long c(s sVar) throws IOException {
        sVar.l();
        while (true) {
            sVar.i(this.f67657a, 0, 4);
            int iC = h.c(this.f67657a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) h.a(this.f67657a, iC, false);
                if (this.f67660d.g(iA)) {
                    sVar.o(iC);
                    return iA;
                }
            }
            sVar.o(1);
        }
    }

    private double d(s sVar, int i10) throws IOException {
        long jE = e(sVar, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    private long e(s sVar, int i10) throws IOException {
        sVar.readFully(this.f67657a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f67657a[i11] & 255));
        }
        return j10;
    }

    private static String f(s sVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        sVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // androidx.media3.extractor.mkv.c
    public void a(androidx.media3.extractor.mkv.b bVar) {
        this.f67660d = bVar;
    }

    @Override // androidx.media3.extractor.mkv.c
    public boolean b(s sVar) throws IOException {
        androidx.media3.common.util.a.k(this.f67660d);
        while (true) {
            b bVarPeek = this.f67658b.peek();
            if (bVarPeek != null && sVar.getPosition() >= bVarPeek.f67665b) {
                this.f67660d.a(this.f67658b.pop().f67664a);
                return true;
            }
            if (this.f67661e == 0) {
                long jD = this.f67659c.d(sVar, true, false, 4);
                if (jD == -2) {
                    jD = c(sVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f67662f = (int) jD;
                this.f67661e = 1;
            }
            if (this.f67661e == 1) {
                this.f67663g = this.f67659c.d(sVar, false, true, 8);
                this.f67661e = 2;
            }
            int iF = this.f67660d.f(this.f67662f);
            if (iF != 0) {
                if (iF == 1) {
                    long position = sVar.getPosition();
                    this.f67658b.push(new b(this.f67662f, this.f67663g + position));
                    this.f67660d.e(this.f67662f, position, this.f67663g);
                    this.f67661e = 0;
                    return true;
                }
                if (iF == 2) {
                    long j10 = this.f67663g;
                    if (j10 <= 8) {
                        this.f67660d.c(this.f67662f, e(sVar, (int) j10));
                        this.f67661e = 0;
                        return true;
                    }
                    throw v0.a("Invalid integer size: " + this.f67663g, null);
                }
                if (iF == 3) {
                    long j11 = this.f67663g;
                    if (j11 <= g3.f12256c) {
                        this.f67660d.d(this.f67662f, f(sVar, (int) j11));
                        this.f67661e = 0;
                        return true;
                    }
                    throw v0.a("String element size: " + this.f67663g, null);
                }
                if (iF == 4) {
                    this.f67660d.h(this.f67662f, (int) this.f67663g, sVar);
                    this.f67661e = 0;
                    return true;
                }
                if (iF != 5) {
                    throw v0.a("Invalid element type " + iF, null);
                }
                long j12 = this.f67663g;
                if (j12 == 4 || j12 == 8) {
                    this.f67660d.b(this.f67662f, d(sVar, (int) j12));
                    this.f67661e = 0;
                    return true;
                }
                throw v0.a("Invalid float size: " + this.f67663g, null);
            }
            sVar.o((int) this.f67663g);
            this.f67661e = 0;
        }
    }

    @Override // androidx.media3.extractor.mkv.c
    public void reset() {
        this.f67661e = 0;
        this.f67658b.clear();
        this.f67659c.e();
    }
}
