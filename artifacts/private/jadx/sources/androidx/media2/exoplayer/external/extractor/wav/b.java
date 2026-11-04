package androidx.media2.exoplayer.external.extractor.wav;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.i;
import androidx.media2.exoplayer.external.extractor.j;
import androidx.media2.exoplayer.external.extractor.k;
import androidx.media2.exoplayer.external.extractor.l;
import androidx.media2.exoplayer.external.extractor.p;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.k0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b implements i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f55162i = a.f55161a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f55163j = 32768;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k f55164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s f55165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f55166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f55167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f55168h;

    static final /* synthetic */ i[] d() {
        return new i[]{new b()};
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        this.f55168h = 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(j input) throws InterruptedException, IOException {
        return d.a(input) != null;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(k output) {
        this.f55164d = output;
        this.f55165e = output.a(0, 1);
        this.f55166f = null;
        output.l();
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(j input, p seekPosition) throws InterruptedException, IOException {
        if (this.f55166f == null) {
            c cVarA = d.a(input);
            this.f55166f = cVarA;
            if (cVarA == null) {
                throw new k0("Unsupported or unrecognized wav header.");
            }
            this.f55165e.c(Format.r(null, "audio/raw", null, cVarA.a(), 32768, this.f55166f.g(), this.f55166f.h(), this.f55166f.f(), null, null, 0, null));
            this.f55167g = this.f55166f.b();
        }
        if (!this.f55166f.i()) {
            d.b(input, this.f55166f);
            this.f55164d.q(this.f55166f);
        } else if (input.getPosition() == 0) {
            input.o(this.f55166f.c());
        }
        long jD = this.f55166f.d();
        androidx.media2.exoplayer.external.util.a.i(jD != -1);
        long position = jD - input.getPosition();
        if (position <= 0) {
            return -1;
        }
        int iA = this.f55165e.a(input, (int) Math.min(32768 - this.f55168h, position), true);
        if (iA != -1) {
            this.f55168h += iA;
        }
        int i10 = this.f55168h / this.f55167g;
        if (i10 > 0) {
            long jE = this.f55166f.e(input.getPosition() - ((long) this.f55168h));
            int i11 = i10 * this.f55167g;
            int i12 = this.f55168h - i11;
            this.f55168h = i12;
            this.f55165e.b(jE, 1, i11, i12, null);
        }
        return iA == -1 ? -1 : 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }
}
