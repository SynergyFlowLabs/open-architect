package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.p;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class d implements androidx.media2.exoplayer.external.extractor.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final androidx.media2.exoplayer.external.extractor.l f54608g = c.f54607a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54609h = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.k f54610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f54611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f54612f;

    static final /* synthetic */ androidx.media2.exoplayer.external.extractor.i[] d() {
        return new androidx.media2.exoplayer.external.extractor.i[]{new d()};
    }

    private static x e(x scratch) {
        scratch.Q(0);
        return scratch;
    }

    private boolean g(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        f fVar = new f();
        if (fVar.a(input, true) && (fVar.f54624b & 2) == 2) {
            int iMin = Math.min(fVar.f54631i, 8);
            x xVar = new x(iMin);
            input.i(xVar.f57720a, 0, iMin);
            if (b.o(e(xVar))) {
                this.f54611e = new b();
            } else if (k.p(e(xVar))) {
                this.f54611e = new k();
            } else if (h.n(e(xVar))) {
                this.f54611e = new h();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        i iVar = this.f54611e;
        if (iVar != null) {
            iVar.k(position, timeUs);
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        try {
            return g(input);
        } catch (k0 unused) {
            return false;
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(androidx.media2.exoplayer.external.extractor.k output) {
        this.f54610d = output;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(androidx.media2.exoplayer.external.extractor.j input, p seekPosition) throws InterruptedException, IOException {
        if (this.f54611e == null) {
            if (!g(input)) {
                throw new k0("Failed to determine bitstream type");
            }
            input.l();
        }
        if (!this.f54612f) {
            s sVarA = this.f54610d.a(0, 1);
            this.f54610d.l();
            this.f54611e.c(this.f54610d, sVarA);
            this.f54612f = true;
        }
        return this.f54611e.f(input, seekPosition);
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }
}
