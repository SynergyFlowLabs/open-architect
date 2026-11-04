package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Format> f54724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.extractor.s[] f54725b;

    public b0(List<Format> closedCaptionFormats) {
        this.f54724a = closedCaptionFormats;
        this.f54725b = new androidx.media2.exoplayer.external.extractor.s[closedCaptionFormats.size()];
    }

    public void a(long pesTimeUs, androidx.media2.exoplayer.external.util.x seiBuffer) {
        androidx.media2.exoplayer.external.text.cea.g.a(pesTimeUs, seiBuffer, this.f54725b);
    }

    public void b(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        for (int i10 = 0; i10 < this.f54725b.length; i10++) {
            idGenerator.a();
            androidx.media2.exoplayer.external.extractor.s sVarA = extractorOutput.a(idGenerator.c(), 3);
            Format format = this.f54724a.get(i10);
            String str = format.f53103i;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            androidx.media2.exoplayer.external.util.a.b(z10, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            String strB = format.f53093a;
            if (strB == null) {
                strB = idGenerator.b();
            }
            sVarA.c(Format.D(strB, str, null, -1, format.f53095c, format.f53100g3, format.f53102h3, null, Long.MAX_VALUE, format.f53107k));
            this.f54725b[i10] = sVarA;
        }
    }
}
