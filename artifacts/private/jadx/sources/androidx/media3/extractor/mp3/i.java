package androidx.media3.extractor.mp3;

import androidx.annotation.p0;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.k0;

/* JADX INFO: loaded from: classes3.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0.a f67878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f67880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final long[] f67883f;

    private i(k0.a aVar, long j10, long j11, @p0 long[] jArr, int i10, int i11) {
        this.f67878a = new k0.a(aVar);
        this.f67879b = j10;
        this.f67880c = j11;
        this.f67883f = jArr;
        this.f67881d = i10;
        this.f67882e = i11;
    }

    public static i b(k0.a aVar, o0 o0Var) {
        long[] jArr;
        int i10;
        int i11;
        int iS = o0Var.s();
        int iP = (iS & 1) != 0 ? o0Var.P() : -1;
        long jN = (iS & 2) != 0 ? o0Var.N() : -1L;
        if ((iS & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = o0Var.L();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iS & 8) != 0) {
            o0Var.b0(4);
        }
        if (o0Var.a() >= 24) {
            o0Var.b0(21);
            int iO = o0Var.O();
            i11 = iO & 4095;
            i10 = (16773120 & iO) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new i(aVar, iP, jN, jArr2, i10, i11);
    }

    public long a() {
        long j10 = this.f67879b;
        if (j10 != -1 && j10 != 0) {
            k0.a aVar = this.f67878a;
            return k1.W1((j10 * ((long) aVar.f67442g)) - 1, aVar.f67439d);
        }
        return -9223372036854775807L;
    }
}
