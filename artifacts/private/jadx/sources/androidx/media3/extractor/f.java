package androidx.media3.extractor;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f67224a = "CeaUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f67225b = 1195456820;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f67226c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f67227d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f67228e = 181;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67229f = 49;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67230g = 47;

    private f() {
    }

    public static void a(long j10, androidx.media3.common.util.o0 o0Var, u0[] u0VarArr) {
        while (true) {
            if (o0Var.a() <= 1) {
                return;
            }
            int iC = c(o0Var);
            int iC2 = c(o0Var);
            int iF = o0Var.f() + iC2;
            if (iC2 == -1 || iC2 > o0Var.a()) {
                androidx.media3.common.util.z.n(f67224a, "Skipping remainder of malformed SEI NAL unit.");
                iF = o0Var.g();
            } else if (iC == 4 && iC2 >= 8) {
                int iL = o0Var.L();
                int iT = o0Var.T();
                int iS = iT == 49 ? o0Var.s() : 0;
                int iL2 = o0Var.L();
                if (iT == 47) {
                    o0Var.b0(1);
                }
                boolean z10 = iL == f67228e && (iT == 49 || iT == 47) && iL2 == 3;
                if (iT == 49) {
                    z10 &= iS == 1195456820;
                }
                if (z10) {
                    b(j10, o0Var, u0VarArr);
                }
            }
            o0Var.a0(iF);
        }
    }

    public static void b(long j10, androidx.media3.common.util.o0 o0Var, u0[] u0VarArr) {
        int iL = o0Var.L();
        if ((iL & 64) != 0) {
            o0Var.b0(1);
            int i10 = (iL & 31) * 3;
            int iF = o0Var.f();
            for (u0 u0Var : u0VarArr) {
                o0Var.a0(iF);
                u0Var.b(o0Var, i10);
                androidx.media3.common.util.a.i(j10 != -9223372036854775807L);
                u0Var.g(j10, 1, i10, 0, null);
            }
        }
    }

    private static int c(androidx.media3.common.util.o0 o0Var) {
        int i10 = 0;
        while (o0Var.a() != 0) {
            int iL = o0Var.L();
            i10 += iL;
            if (iL != 255) {
                return i10;
            }
        }
        return -1;
    }
}
