package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import com.google.common.collect.l6;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f69650a = 1716281667;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f69651b = 16382;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f69652c = 18;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        public a0 f69653a;

        public a(@androidx.annotation.p0 a0 a0Var) {
            this.f69653a = a0Var;
        }
    }

    private y() {
    }

    public static boolean a(s sVar) throws IOException {
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(4);
        sVar.i(o0Var.e(), 0, 4);
        return o0Var.N() == 1716281667;
    }

    public static int b(s sVar) throws IOException {
        sVar.l();
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(2);
        sVar.i(o0Var.e(), 0, 2);
        int iT = o0Var.T();
        if ((iT >> 2) == f69651b) {
            sVar.l();
            return iT;
        }
        sVar.l();
        throw androidx.media3.common.v0.a("First frame does not start with sync code.", null);
    }

    @androidx.annotation.p0
    public static androidx.media3.common.r0 c(s sVar, boolean z10) throws Throwable {
        androidx.media3.common.r0 r0VarA = new i0().a(sVar, z10 ? null : androidx.media3.extractor.metadata.id3.h.f67554b);
        if (r0VarA == null || r0VarA.e() == 0) {
            return null;
        }
        return r0VarA;
    }

    @androidx.annotation.p0
    public static androidx.media3.common.r0 d(s sVar, boolean z10) throws Throwable {
        sVar.l();
        long jM = sVar.m();
        androidx.media3.common.r0 r0VarC = c(sVar, z10);
        sVar.o((int) (sVar.m() - jM));
        return r0VarC;
    }

    public static boolean e(s sVar, a aVar) throws IOException {
        sVar.l();
        androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0(new byte[4]);
        sVar.i(n0Var.f61581a, 0, 4);
        boolean zG = n0Var.g();
        int i10 = 7 << 7;
        int iH = n0Var.h(7);
        int iH2 = n0Var.h(24) + 4;
        if (iH == 0) {
            aVar.f69653a = h(sVar);
            return zG;
        }
        a0 a0Var = aVar.f69653a;
        if (a0Var == null) {
            throw new IllegalArgumentException();
        }
        if (iH == 3) {
            aVar.f69653a = a0Var.c(g(sVar, iH2));
            return zG;
        }
        if (iH == 4) {
            aVar.f69653a = a0Var.d(j(sVar, iH2));
            return zG;
        }
        if (iH != 6) {
            sVar.o(iH2);
            return zG;
        }
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(iH2);
        sVar.readFully(o0Var.e(), 0, iH2);
        o0Var.b0(4);
        aVar.f69653a = a0Var.b(l6.G(androidx.media3.extractor.metadata.flac.a.b(o0Var)));
        return zG;
    }

    public static a0.a f(androidx.media3.common.util.o0 o0Var) {
        o0Var.b0(1);
        int iO = o0Var.O();
        long jF = ((long) o0Var.f()) + ((long) iO);
        int i10 = iO / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jE = o0Var.E();
            if (jE == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jE;
            jArrCopyOf2[i11] = o0Var.E();
            o0Var.b0(2);
        }
        o0Var.b0((int) (jF - ((long) o0Var.f())));
        return new a0.a(jArrCopyOf, jArrCopyOf2);
    }

    private static a0.a g(s sVar, int i10) throws IOException {
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(i10);
        sVar.readFully(o0Var.e(), 0, i10);
        return f(o0Var);
    }

    private static a0 h(s sVar) throws IOException {
        byte[] bArr = new byte[38];
        sVar.readFully(bArr, 0, 38);
        return new a0(bArr, 4);
    }

    public static void i(s sVar) throws IOException {
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(4);
        sVar.readFully(o0Var.e(), 0, 4);
        if (o0Var.N() != 1716281667) {
            throw androidx.media3.common.v0.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(s sVar, int i10) throws IOException {
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(i10);
        sVar.readFully(o0Var.e(), 0, i10);
        o0Var.b0(4);
        return Arrays.asList(x0.k(o0Var, false, false).f69634b);
    }
}
