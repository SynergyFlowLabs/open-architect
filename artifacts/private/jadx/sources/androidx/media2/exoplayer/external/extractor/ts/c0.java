package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.util.k0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k0 f54742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f54743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54744c;

    @Override // androidx.media2.exoplayer.external.extractor.ts.z
    public void b(k0 timestampAdjuster, androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        this.f54742a = timestampAdjuster;
        idGenerator.a();
        androidx.media2.exoplayer.external.extractor.s sVarA = extractorOutput.a(idGenerator.c(), 4);
        this.f54743b = sVarA;
        sVarA.c(Format.x(idGenerator.b(), "application/x-scte35", null, -1, null));
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.z
    public void d(androidx.media2.exoplayer.external.util.x sectionData) {
        if (!this.f54744c) {
            if (this.f54742a.e() == -9223372036854775807L) {
                return;
            }
            this.f54743b.c(Format.w(null, "application/x-scte35", this.f54742a.e()));
            this.f54744c = true;
        }
        int iA = sectionData.a();
        this.f54743b.d(sectionData, iA);
        this.f54743b.b(this.f54742a.d(), 1, iA, 0, null);
    }
}
