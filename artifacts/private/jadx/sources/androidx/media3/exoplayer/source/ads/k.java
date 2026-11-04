package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.z0;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.source.t0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class k {
    private k() {
    }

    @androidx.annotation.j
    public static androidx.media3.common.b a(androidx.media3.common.b bVar, long j10, long j11, long... jArr) {
        long jF = f(j10, -1, bVar);
        int i10 = bVar.f60426e;
        while (i10 < bVar.f60423b && bVar.f(i10).f60439a != Long.MIN_VALUE && bVar.f(i10).f60439a <= jF) {
            i10++;
        }
        androidx.media3.common.b bVarA = bVar.G(i10, jF).C(i10, true).o(i10, jArr.length).p(i10, jArr).A(i10, j11);
        androidx.media3.common.b bVarL = bVarA;
        for (int i11 = 0; i11 < jArr.length && jArr[i11] == 0; i11++) {
            bVarL = bVarL.L(i10, i11);
        }
        return b(bVarL, i10, k1.q2(jArr), j11);
    }

    private static androidx.media3.common.b b(androidx.media3.common.b bVar, int i10, long j10, long j11) {
        long j12 = (-j10) + j11;
        while (true) {
            i10++;
            if (i10 >= bVar.f60423b) {
                return bVar;
            }
            long j13 = bVar.f(i10).f60439a;
            if (j13 != Long.MIN_VALUE) {
                bVar = bVar.r(i10, j13 + j12);
            }
        }
    }

    public static int c(androidx.media3.common.b bVar, int i10) {
        int i11 = bVar.f(i10).f60440b;
        if (i11 == -1) {
            return 0;
        }
        return i11;
    }

    public static long d(long j10, t0.b bVar, androidx.media3.common.b bVar2) {
        return bVar.c() ? e(j10, bVar.f65468b, bVar.f65469c, bVar2) : f(j10, bVar.f65471e, bVar2);
    }

    public static long e(long j10, int i10, int i11, androidx.media3.common.b bVar) {
        int i12;
        androidx.media3.common.b.C0566b c0566bF = bVar.f(i10);
        long j11 = j10 - c0566bF.f60439a;
        int i13 = bVar.f60426e;
        while (true) {
            i12 = 0;
            if (i13 >= i10) {
                break;
            }
            androidx.media3.common.b.C0566b c0566bF2 = bVar.f(i13);
            while (i12 < c(bVar, i13)) {
                j11 -= c0566bF2.f60445g[i12];
                i12++;
            }
            j11 += c0566bF2.f60447i;
            i13++;
        }
        if (i11 < c(bVar, i10)) {
            while (i12 < i11) {
                j11 -= c0566bF.f60445g[i12];
                i12++;
            }
        }
        return j11;
    }

    public static long f(long j10, int i10, androidx.media3.common.b bVar) {
        if (i10 == -1) {
            i10 = bVar.f60423b;
        }
        long j11 = 0;
        for (int i11 = bVar.f60426e; i11 < i10; i11++) {
            androidx.media3.common.b.C0566b c0566bF = bVar.f(i11);
            long j12 = c0566bF.f60439a;
            if (j12 == Long.MIN_VALUE || j12 > j10 - j11) {
                break;
            }
            for (int i12 = 0; i12 < c(bVar, i11); i12++) {
                j11 += c0566bF.f60445g[i12];
            }
            long j13 = c0566bF.f60447i;
            j11 -= j13;
            long j14 = c0566bF.f60439a;
            long j15 = j10 - j11;
            if (j13 + j14 > j15) {
                return Math.max(j14, j15);
            }
        }
        return j10 - j11;
    }

    public static long g(long j10, t0.b bVar, androidx.media3.common.b bVar2) {
        return bVar.c() ? i(j10, bVar.f65468b, bVar.f65469c, bVar2) : j(j10, bVar.f65471e, bVar2);
    }

    public static long h(z0 z0Var, androidx.media3.common.b bVar) {
        z3 z3VarC0 = z0Var.c0();
        if (z3VarC0.w()) {
            return -9223372036854775807L;
        }
        z3.b bVarJ = z3VarC0.j(z0Var.O(), new z3.b());
        if (!Objects.equals(bVarJ.j(), bVar.f60422a)) {
            return -9223372036854775807L;
        }
        if (!z0Var.x()) {
            return j(k1.D1(z0Var.getCurrentPosition()) - bVarJ.q(), -1, bVar);
        }
        return i(k1.D1(z0Var.getCurrentPosition()), z0Var.E(), z0Var.P(), bVar);
    }

    public static long i(long j10, int i10, int i11, androidx.media3.common.b bVar) {
        int i12;
        androidx.media3.common.b.C0566b c0566bF = bVar.f(i10);
        long j11 = j10 + c0566bF.f60439a;
        int i13 = bVar.f60426e;
        while (true) {
            i12 = 0;
            if (i13 >= i10) {
                break;
            }
            androidx.media3.common.b.C0566b c0566bF2 = bVar.f(i13);
            while (i12 < c(bVar, i13)) {
                j11 += c0566bF2.f60445g[i12];
                i12++;
            }
            j11 -= c0566bF2.f60447i;
            i13++;
        }
        if (i11 < c(bVar, i10)) {
            while (i12 < i11) {
                j11 += c0566bF.f60445g[i12];
                i12++;
            }
        }
        return j11;
    }

    public static long j(long j10, int i10, androidx.media3.common.b bVar) {
        if (i10 == -1) {
            i10 = bVar.f60423b;
        }
        long j11 = 0;
        for (int i11 = bVar.f60426e; i11 < i10; i11++) {
            androidx.media3.common.b.C0566b c0566bF = bVar.f(i11);
            long j12 = c0566bF.f60439a;
            if (j12 == Long.MIN_VALUE || j12 > j10) {
                break;
                break;
            }
            long j13 = j12 + j11;
            for (int i12 = 0; i12 < c(bVar, i11); i12++) {
                j11 += c0566bF.f60445g[i12];
            }
            long j14 = c0566bF.f60447i;
            j11 -= j14;
            if (c0566bF.f60439a + j14 > j10) {
                return Math.max(j13, j10 + j11);
            }
        }
        return j10 + j11;
    }
}
