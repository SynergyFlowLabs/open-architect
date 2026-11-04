package androidx.media2.exoplayer.external.text.cea;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.x;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f56690a = "CeaUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f56691b = 1195456820;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f56692c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f56693d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f56694e = 181;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f56695f = 49;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f56696g = 47;

    private g() {
    }

    public static void a(long presentationTimeUs, x seiBuffer, s[] outputs) {
        while (true) {
            if (seiBuffer.a() <= 1) {
                return;
            }
            int iC = c(seiBuffer);
            int iC2 = c(seiBuffer);
            int iC3 = seiBuffer.c() + iC2;
            if (iC2 == -1 || iC2 > seiBuffer.a()) {
                p.l(f56690a, "Skipping remainder of malformed SEI NAL unit.");
                iC3 = seiBuffer.d();
            } else if (iC == 4 && iC2 >= 8) {
                int iD = seiBuffer.D();
                int iJ = seiBuffer.J();
                int iL = iJ == 49 ? seiBuffer.l() : 0;
                int iD2 = seiBuffer.D();
                if (iJ == 47) {
                    seiBuffer.R(1);
                }
                boolean z10 = iD == f56694e && (iJ == 49 || iJ == 47) && iD2 == 3;
                if (iJ == 49) {
                    z10 &= iL == 1195456820;
                }
                if (z10) {
                    b(presentationTimeUs, seiBuffer, outputs);
                }
            }
            seiBuffer.Q(iC3);
        }
    }

    public static void b(long presentationTimeUs, x ccDataBuffer, s[] outputs) {
        int iD = ccDataBuffer.D();
        if ((iD & 64) != 0) {
            ccDataBuffer.R(1);
            int i10 = (iD & 31) * 3;
            int iC = ccDataBuffer.c();
            for (s sVar : outputs) {
                ccDataBuffer.Q(iC);
                sVar.d(ccDataBuffer, i10);
                sVar.b(presentationTimeUs, 1, i10, 0, null);
            }
        }
    }

    private static int c(x buffer) {
        int i10 = 0;
        while (buffer.a() != 0) {
            int iD = buffer.D();
            i10 += iD;
            if (iD != 255) {
                return i10;
            }
        }
        return -1;
    }
}
