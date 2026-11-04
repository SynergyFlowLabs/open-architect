package androidx.media3.extractor.text;

import androidx.media3.common.util.b1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class h {
    private h() {
    }

    private static int a(j jVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int iL = jVar.l(j10);
        if (iL == -1) {
            iL = jVar.k();
        }
        return (iL <= 0 || jVar.b(iL + (-1)) != j10) ? iL : iL - 1;
    }

    private static void b(j jVar, int i10, androidx.media3.common.util.o<d> oVar) {
        long jB = jVar.b(i10);
        List<androidx.media3.common.text.a> listN = jVar.n(jB);
        if (listN.isEmpty()) {
            return;
        }
        if (i10 == jVar.k() - 1) {
            throw new IllegalStateException();
        }
        long jB2 = jVar.b(i10 + 1) - jVar.b(i10);
        if (jB2 > 0) {
            oVar.accept(new d(listN, jB, jB2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    public static void c(j jVar, r.b bVar, androidx.media3.common.util.o<d> oVar) {
        boolean z10;
        int iA = a(jVar, bVar.f68572a);
        if (bVar.f68572a == -9223372036854775807L || iA >= jVar.k()) {
            z10 = false;
        } else {
            List<androidx.media3.common.text.a> listN = jVar.n(bVar.f68572a);
            long jB = jVar.b(iA);
            if (listN.isEmpty()) {
                z10 = false;
            } else {
                long j10 = bVar.f68572a;
                if (j10 < jB) {
                    oVar.accept(new d(listN, j10, jB - j10));
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        for (int i10 = iA; i10 < jVar.k(); i10++) {
            b(jVar, i10, oVar);
        }
        if (bVar.f68573b) {
            if (z10) {
                iA--;
            }
            for (int i11 = 0; i11 < iA; i11++) {
                b(jVar, i11, oVar);
            }
            if (z10) {
                oVar.accept(new d(jVar.n(bVar.f68572a), jVar.b(iA), bVar.f68572a - jVar.b(iA)));
            }
        }
    }
}
