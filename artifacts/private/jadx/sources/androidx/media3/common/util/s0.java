package androidx.media3.common.util;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class s0 {
    private s0() {
    }

    public static long a(androidx.media3.common.audio.o oVar, long j10) {
        long j11 = 0;
        double dMin = 0.0d;
        while (j11 < j10) {
            long jA = oVar.a(j11);
            if (jA == -9223372036854775807L) {
                jA = Long.MAX_VALUE;
            }
            dMin += (Math.min(jA, j10) - j11) / ((double) oVar.b(j11));
            j11 = jA;
        }
        return (long) Math.floor(dMin);
    }

    public static long b(androidx.media3.common.audio.o oVar, long j10, int i10) {
        a.a(j10 >= 0);
        a.a(i10 > 0);
        long jA = oVar.a(k1.W1(j10, i10));
        if (jA == -9223372036854775807L) {
            return -1L;
        }
        return k1.P(jA, i10);
    }

    public static float c(androidx.media3.common.audio.o oVar, long j10, int i10) {
        a.a(j10 >= 0);
        a.a(i10 > 0);
        return oVar.b(k1.W1(j10, i10));
    }
}
