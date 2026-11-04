package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f54893c = 434;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Format> f54894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.extractor.s[] f54895b;

    public j0(List<Format> closedCaptionFormats) {
        this.f54894a = closedCaptionFormats;
        this.f54895b = new androidx.media2.exoplayer.external.extractor.s[closedCaptionFormats.size()];
    }

    public void a(long pesTimeUs, androidx.media2.exoplayer.external.util.x userDataPayload) {
        if (userDataPayload.a() < 9) {
            return;
        }
        int iL = userDataPayload.l();
        int iL2 = userDataPayload.l();
        int iD = userDataPayload.D();
        if (iL == f54893c && iL2 == 1195456820 && iD == 3) {
            androidx.media2.exoplayer.external.text.cea.g.b(pesTimeUs, userDataPayload, this.f54895b);
        }
    }

    public void b(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        for (int i10 = 0; i10 < this.f54895b.length; i10++) {
            idGenerator.a();
            androidx.media2.exoplayer.external.extractor.s sVarA = extractorOutput.a(idGenerator.c(), 3);
            Format format = this.f54894a.get(i10);
            String str = format.f53103i;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            androidx.media2.exoplayer.external.util.a.b(z10, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            sVarA.c(Format.D(idGenerator.b(), str, null, -1, format.f53095c, format.f53100g3, format.f53102h3, null, Long.MAX_VALUE, format.f53107k));
            this.f54895b[i10] = sVarA;
        }
    }
}
