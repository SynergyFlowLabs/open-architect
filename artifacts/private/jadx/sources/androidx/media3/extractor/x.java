package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class x {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f69631a;
    }

    private x() {
    }

    private static boolean a(androidx.media3.common.util.o0 o0Var, a0 a0Var, int i10) {
        int iJ = j(o0Var, i10);
        return iJ != -1 && iJ <= a0Var.f67013b;
    }

    private static boolean b(androidx.media3.common.util.o0 o0Var, int i10) {
        return o0Var.L() == k1.F(o0Var.e(), i10, o0Var.f() - 1, 0);
    }

    private static boolean c(androidx.media3.common.util.o0 o0Var, a0 a0Var, boolean z10, a aVar) {
        try {
            long jU = o0Var.U();
            if (!z10) {
                jU *= (long) a0Var.f67013b;
            }
            aVar.f69631a = jU;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(androidx.media3.common.util.o0 o0Var, a0 a0Var, int i10, a aVar) {
        int iF = o0Var.f();
        long jN = o0Var.N();
        long j10 = jN >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((jN >> 4) & 15), a0Var) && f((int) ((jN >> 1) & 7), a0Var) && !(((jN & 1) > 1L ? 1 : ((jN & 1) == 1L ? 0 : -1)) == 0) && c(o0Var, a0Var, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(o0Var, a0Var, (int) ((jN >> 12) & 15)) && e(o0Var, a0Var, (int) ((jN >> 8) & 15)) && b(o0Var, iF);
    }

    private static boolean e(androidx.media3.common.util.o0 o0Var, a0 a0Var, int i10) {
        int i11 = a0Var.f67016e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == a0Var.f67017f;
        }
        if (i10 == 12) {
            return o0Var.L() * 1000 == i11;
        }
        if (i10 <= 14) {
            int iT = o0Var.T();
            if (i10 == 14) {
                iT *= 10;
            }
            if (iT == i11) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int i10, a0 a0Var) {
        return i10 == 0 || i10 == a0Var.f67020i;
    }

    private static boolean g(int i10, a0 a0Var) {
        if (i10 <= 7) {
            return i10 == a0Var.f67018g - 1;
        }
        return i10 <= 10 && a0Var.f67018g == 2;
    }

    public static boolean h(s sVar, a0 a0Var, int i10, a aVar) throws IOException {
        long jM = sVar.m();
        byte[] bArr = new byte[2];
        sVar.i(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            sVar.l();
            sVar.n((int) (jM - sVar.getPosition()));
            return false;
        }
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(16);
        System.arraycopy(bArr, 0, o0Var.e(), 0, 2);
        o0Var.Z(u.c(sVar, o0Var.e(), 2, 14));
        sVar.l();
        sVar.n((int) (jM - sVar.getPosition()));
        return d(o0Var, a0Var, i10, aVar);
    }

    public static long i(s sVar, a0 a0Var) throws IOException {
        sVar.l();
        boolean z10 = true;
        sVar.n(1);
        byte[] bArr = new byte[1];
        sVar.i(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        sVar.n(2);
        int i10 = z10 ? 7 : 6;
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(i10);
        o0Var.Z(u.c(sVar, o0Var.e(), 0, i10));
        sVar.l();
        a aVar = new a();
        if (c(o0Var, a0Var, z10, aVar)) {
            return aVar.f69631a;
        }
        throw androidx.media3.common.v0.a(null, null);
    }

    public static int j(androidx.media3.common.util.o0 o0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return o0Var.L() + 1;
            case 7:
                return o0Var.T() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
