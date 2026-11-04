package androidx.media3.extractor.ogg;

import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import androidx.media3.extractor.s;
import androidx.media3.extractor.u;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f68231l = 27;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f68232m = 255;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f68233n = 65025;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f68234o = 65307;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f68235p = 1332176723;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f68236q = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f68238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f68239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f68240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f68241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f68242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f68243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f68244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f68245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f68246j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o0 f68247k = new o0(255);

    f() {
    }

    public boolean a(s sVar, boolean z10) throws IOException {
        b();
        this.f68247k.W(27);
        if (u.b(sVar, this.f68247k.e(), 0, 27, z10) && this.f68247k.N() == 1332176723) {
            int iL = this.f68247k.L();
            this.f68237a = iL;
            if (iL != 0) {
                if (z10) {
                    return false;
                }
                throw v0.e("unsupported bit stream revision");
            }
            this.f68238b = this.f68247k.L();
            this.f68239c = this.f68247k.y();
            this.f68240d = this.f68247k.A();
            this.f68241e = this.f68247k.A();
            this.f68242f = this.f68247k.A();
            int iL2 = this.f68247k.L();
            this.f68243g = iL2;
            this.f68244h = iL2 + 27;
            this.f68247k.W(iL2);
            if (!u.b(sVar, this.f68247k.e(), 0, this.f68243g, z10)) {
                return false;
            }
            for (int i10 = 0; i10 < this.f68243g; i10++) {
                this.f68246j[i10] = this.f68247k.L();
                this.f68245i += this.f68246j[i10];
            }
            return true;
        }
        return false;
    }

    public void b() {
        this.f68237a = 0;
        this.f68238b = 0;
        this.f68239c = 0L;
        this.f68240d = 0L;
        this.f68241e = 0L;
        this.f68242f = 0L;
        this.f68243g = 0;
        this.f68244h = 0;
        this.f68245i = 0;
    }

    public boolean c(s sVar) throws IOException {
        return d(sVar, -1L);
    }

    public boolean d(s sVar, long j10) throws IOException {
        androidx.media3.common.util.a.a(sVar.getPosition() == sVar.m());
        this.f68247k.W(4);
        while (true) {
            if ((j10 != -1 && sVar.getPosition() + 4 >= j10) || !u.b(sVar, this.f68247k.e(), 0, 4, true)) {
                break;
            }
            this.f68247k.a0(0);
            if (this.f68247k.N() == 1332176723) {
                sVar.l();
                return true;
            }
            sVar.o(1);
        }
        do {
            if (j10 != -1 && sVar.getPosition() >= j10) {
                break;
            }
        } while (sVar.b(1) != -1);
        return false;
    }
}
