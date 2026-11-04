package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.collection.g3;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.common.v0;
import androidx.media3.extractor.s;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f69617a = "WavHeaderReader";

    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f69618c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f69620b;

        private a(int i10, long j10) {
            this.f69619a = i10;
            this.f69620b = j10;
        }

        public static a a(s sVar, o0 o0Var) throws IOException {
            sVar.i(o0Var.e(), 0, 8);
            o0Var.a0(0);
            return new a(o0Var.s(), o0Var.A());
        }
    }

    private d() {
    }

    public static boolean a(s sVar) throws IOException {
        o0 o0Var = new o0(8);
        int i10 = a.a(sVar, o0Var).f69619a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        sVar.i(o0Var.e(), 0, 4);
        o0Var.a0(0);
        int iS = o0Var.s();
        if (iS == 1463899717) {
            return true;
        }
        z.d(f69617a, "Unsupported form type: " + iS);
        return false;
    }

    public static c b(s sVar) throws IOException {
        byte[] bArr;
        o0 o0Var = new o0(16);
        a aVarD = d(1718449184, sVar, o0Var);
        androidx.media3.common.util.a.i(aVarD.f69620b >= 16);
        sVar.i(o0Var.e(), 0, 16);
        o0Var.a0(0);
        int iD = o0Var.D();
        int iD2 = o0Var.D();
        int iC = o0Var.C();
        int iC2 = o0Var.C();
        int iD3 = o0Var.D();
        int iD4 = o0Var.D();
        int i10 = ((int) aVarD.f69620b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            sVar.i(bArr, 0, i10);
        } else {
            bArr = k1.f61545f;
        }
        byte[] bArr2 = bArr;
        sVar.o((int) (sVar.m() - sVar.getPosition()));
        return new c(iD, iD2, iC, iC2, iD3, iD4, bArr2);
    }

    public static long c(s sVar) throws IOException {
        o0 o0Var = new o0(8);
        a aVarA = a.a(sVar, o0Var);
        if (aVarA.f69619a != 1685272116) {
            sVar.l();
            return -1L;
        }
        sVar.n(8);
        o0Var.a0(0);
        sVar.i(o0Var.e(), 0, 8);
        long jY = o0Var.y();
        sVar.o(((int) aVarA.f69620b) + 8);
        return jY;
    }

    private static a d(int i10, s sVar, o0 o0Var) throws IOException {
        a aVarA = a.a(sVar, o0Var);
        while (aVarA.f69619a != i10) {
            z.n(f69617a, "Ignoring unknown WAV chunk: " + aVarA.f69619a);
            long j10 = aVarA.f69620b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > g3.f12256c) {
                throw v0.e("Chunk is too large (~2GB+) to skip; id: " + aVarA.f69619a);
            }
            sVar.o((int) j11);
            aVarA = a.a(sVar, o0Var);
        }
        return aVarA;
    }

    public static Pair<Long, Long> e(s sVar) throws IOException {
        sVar.l();
        a aVarD = d(1684108385, sVar, new o0(8));
        sVar.o(8);
        return Pair.create(Long.valueOf(sVar.getPosition()), Long.valueOf(aVarD.f69620b));
    }
}
