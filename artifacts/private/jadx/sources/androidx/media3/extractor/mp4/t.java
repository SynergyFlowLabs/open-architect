package androidx.media3.extractor.mp4;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f68095a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f68096b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f68097c = 7;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f68098d = 9;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f68099e = 12;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f68100f = 13;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f68101g = 21;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f68102h = 22;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f68103i = 23;

    private t() {
    }

    private static int a(int i10, o0 o0Var, int i11) {
        if (i10 == 12) {
            return 240;
        }
        if (i10 == 13) {
            return 120;
        }
        if (i10 != 21) {
            return androidx.media3.common.j.f60676f;
        }
        if (o0Var.a() >= 8 && o0Var.f() + 8 <= i11) {
            int iS = o0Var.s();
            int iS2 = o0Var.s();
            if (iS >= 12 && iS2 == 1936877170) {
                return o0Var.M();
            }
        }
        return androidx.media3.common.j.f60676f;
    }

    @p0
    public static r0 b(o0 o0Var, int i10) {
        o0Var.b0(12);
        while (o0Var.f() < i10) {
            int iF = o0Var.f();
            int iS = o0Var.s();
            if (o0Var.s() == 1935766900) {
                if (iS < 16) {
                    return null;
                }
                o0Var.b0(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int iL = o0Var.L();
                    int iL2 = o0Var.L();
                    if (iL == 0) {
                        i11 = iL2;
                    } else if (iL == 1) {
                        i12 = iL2;
                    }
                }
                int iA = a(i11, o0Var, i10);
                if (iA == -2147483647) {
                    return null;
                }
                return new r0(new androidx.media3.extractor.metadata.mp4.d(iA, i12));
            }
            o0Var.a0(iF + iS);
        }
        return null;
    }
}
