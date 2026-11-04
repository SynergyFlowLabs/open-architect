package androidx.media3.extractor.metadata.dvbsi;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.n0;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b extends androidx.media3.extractor.metadata.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f67476a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f67477b = 21;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f67478c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67479d = 116;

    @p0
    private static r0 c(n0 n0Var) {
        n0Var.s(12);
        int iD = (n0Var.d() + n0Var.h(12)) - 4;
        n0Var.s(44);
        n0Var.t(n0Var.h(12));
        n0Var.s(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strM = null;
            if (n0Var.d() >= iD) {
                break;
            }
            n0Var.s(48);
            int iH = n0Var.h(8);
            n0Var.s(4);
            int iD2 = n0Var.d() + n0Var.h(12);
            String strM2 = null;
            while (n0Var.d() < iD2) {
                int iH2 = n0Var.h(8);
                int iH3 = n0Var.h(8);
                int iD3 = n0Var.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = n0Var.h(16);
                    n0Var.s(8);
                    if (iH4 == 3) {
                        while (n0Var.d() < iD3) {
                            strM = n0Var.m(n0Var.h(8), StandardCharsets.US_ASCII);
                            int iH5 = n0Var.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                n0Var.t(n0Var.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strM2 = n0Var.m(iH3, StandardCharsets.US_ASCII);
                }
                n0Var.q(iD3 * 8);
            }
            n0Var.q(iD2 * 8);
            if (strM != null && strM2 != null) {
                arrayList.add(new a(iH, strM + strM2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new r0(arrayList);
    }

    @Override // androidx.media3.extractor.metadata.c
    @p0
    protected r0 b(androidx.media3.extractor.metadata.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new n0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
