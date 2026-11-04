package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b implements androidx.media2.exoplayer.external.extractor.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final androidx.media2.exoplayer.external.extractor.l f54717g = a.f54707a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54718h = 8192;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f54719i = 2935;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54720j = 2786;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f54721d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54722e = new androidx.media2.exoplayer.external.util.x(f54720j);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f54723f;

    static final /* synthetic */ androidx.media2.exoplayer.external.extractor.i[] d() {
        return new androidx.media2.exoplayer.external.extractor.i[]{new b()};
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        this.f54723f = false;
        this.f54721d.a();
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        androidx.media2.exoplayer.external.util.x xVar = new androidx.media2.exoplayer.external.util.x(10);
        int i10 = 0;
        while (true) {
            input.i(xVar.f57720a, 0, 10);
            xVar.Q(0);
            if (xVar.G() != 4801587) {
                break;
            }
            xVar.R(3);
            int iC = xVar.C();
            i10 += iC + 10;
            input.n(iC);
        }
        input.l();
        input.n(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            input.i(xVar.f57720a, 0, 6);
            xVar.Q(0);
            if (xVar.J() != f54719i) {
                input.l();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                input.n(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iF = androidx.media2.exoplayer.external.audio.a.f(xVar.f57720a);
                if (iF == -1) {
                    return false;
                }
                input.n(iF - 6);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(androidx.media2.exoplayer.external.extractor.k output) {
        this.f54721d.e(output, new h0.e(0, 1));
        output.l();
        output.q(new androidx.media2.exoplayer.external.extractor.q.b(-9223372036854775807L));
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPosition) throws InterruptedException, IOException {
        int i10 = input.read(this.f54722e.f57720a, 0, f54720j);
        if (i10 == -1) {
            return -1;
        }
        this.f54722e.Q(0);
        this.f54722e.P(i10);
        if (!this.f54723f) {
            this.f54721d.c(0L, 4);
            this.f54723f = true;
        }
        this.f54721d.d(this.f54722e);
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }
}
