package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.p;
import androidx.media2.exoplayer.external.upstream.o0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class k extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p f55836l = new p();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e f55837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f55838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f55839k;

    public k(androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.upstream.o dataSpec, Format trackFormat, int trackSelectionReason, @p0 Object trackSelectionData, e extractorWrapper) {
        super(dataSource, dataSpec, 2, trackFormat, trackSelectionReason, trackSelectionData, -9223372036854775807L, -9223372036854775807L);
        this.f55837i = extractorWrapper;
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public void a() throws InterruptedException, IOException {
        androidx.media2.exoplayer.external.upstream.o oVarD = this.f55774a.d(this.f55838j);
        try {
            o0 o0Var = this.f55781h;
            androidx.media2.exoplayer.external.extractor.e eVar = new androidx.media2.exoplayer.external.extractor.e(o0Var, oVarD.f57374e, o0Var.b(oVarD));
            if (this.f55838j == 0) {
                this.f55837i.d(null, -9223372036854775807L, -9223372036854775807L);
            }
            try {
                androidx.media2.exoplayer.external.extractor.i iVar = this.f55837i.f55782a;
                int iF = 0;
                while (iF == 0 && !this.f55839k) {
                    iF = iVar.f(eVar, f55836l);
                }
                androidx.media2.exoplayer.external.util.a.i(iF != 1);
                this.f55838j = eVar.getPosition() - this.f55774a.f57374e;
                q0.n(this.f55781h);
            } catch (Throwable th2) {
                this.f55838j = eVar.getPosition() - this.f55774a.f57374e;
                throw th2;
            }
        } catch (Throwable th3) {
            q0.n(this.f55781h);
            throw th3;
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public void b() {
        this.f55839k = true;
    }
}
