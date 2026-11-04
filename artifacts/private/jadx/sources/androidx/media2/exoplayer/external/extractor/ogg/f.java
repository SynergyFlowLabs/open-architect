package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.x;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f54618l = 27;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f54619m = 255;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f54620n = 65025;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f54621o = 65307;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f54622p = 1332176723;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f54625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f54626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f54627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f54628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f54632j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final x f54633k = new x(255);

    f() {
    }

    public boolean a(androidx.media2.exoplayer.external.extractor.j input, boolean quiet) throws InterruptedException, IOException {
        this.f54633k.L();
        b();
        if ((input.getLength() != -1 && input.getLength() - input.m() < 27) || !input.k(this.f54633k.f57720a, 0, 27, true)) {
            if (quiet) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f54633k.F() != 1332176723) {
            if (quiet) {
                return false;
            }
            throw new k0("expected OggS capture pattern at begin of page");
        }
        int iD = this.f54633k.D();
        this.f54623a = iD;
        if (iD != 0) {
            if (quiet) {
                return false;
            }
            throw new k0("unsupported bit stream revision");
        }
        this.f54624b = this.f54633k.D();
        this.f54625c = this.f54633k.q();
        this.f54626d = this.f54633k.s();
        this.f54627e = this.f54633k.s();
        this.f54628f = this.f54633k.s();
        int iD2 = this.f54633k.D();
        this.f54629g = iD2;
        this.f54630h = iD2 + 27;
        this.f54633k.L();
        input.i(this.f54633k.f57720a, 0, this.f54629g);
        for (int i10 = 0; i10 < this.f54629g; i10++) {
            this.f54632j[i10] = this.f54633k.D();
            this.f54631i += this.f54632j[i10];
        }
        return true;
    }

    public void b() {
        this.f54623a = 0;
        this.f54624b = 0;
        this.f54625c = 0L;
        this.f54626d = 0L;
        this.f54627e = 0L;
        this.f54628f = 0L;
        this.f54629g = 0;
        this.f54630h = 0;
        this.f54631i = 0;
    }
}
