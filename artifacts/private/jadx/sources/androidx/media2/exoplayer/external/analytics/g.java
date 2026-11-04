package androidx.media2.exoplayer.external.analytics;

import android.util.Pair;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g {
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final int T = 5;
    public static final int U = 6;
    public static final int V = 7;
    public static final int W = 8;
    public static final int X = 9;
    public static final int Y = 10;
    public static final int Z = 11;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f53163a0 = 12;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final int f53164b0 = 13;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final g f53165c0 = W(new g[0]);
    public final int A;
    public final long B;
    public final int C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final int I;
    public final int J;
    public final int K;
    public final List<Pair<c.a, Exception>> L;
    public final List<Pair<c.a, Exception>> M;
    private final long[] N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Pair<c.a, Integer>> f53167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<long[]> f53168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f53169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f53171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f53172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f53173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f53174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f53175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f53176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f53177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f53178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f53179n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f53180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f53181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<Pair<c.a, Format>> f53182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<Pair<c.a, Format>> f53183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f53184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f53185t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f53186u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f53187v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f53188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f53189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f53190y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f53191z;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface a {
    }

    g(int playbackCount, long[] playbackStateDurationsMs, List<Pair<c.a, Integer>> playbackStateHistory, List<long[]> mediaTimeHistory, long firstReportedTimeMs, int foregroundPlaybackCount, int abandonedBeforeReadyCount, int endedCount, int backgroundJoiningCount, long totalValidJoinTimeMs, int validJoinTimeCount, int totalPauseCount, int totalPauseBufferCount, int totalSeekCount, int totalRebufferCount, long maxRebufferTimeMs, int adPlaybackCount, List<Pair<c.a, Format>> videoFormatHistory, List<Pair<c.a, Format>> audioFormatHistory, long totalVideoFormatHeightTimeMs, long totalVideoFormatHeightTimeProduct, long totalVideoFormatBitrateTimeMs, long totalVideoFormatBitrateTimeProduct, long totalAudioFormatTimeMs, long totalAudioFormatBitrateTimeProduct, int initialVideoFormatHeightCount, int initialVideoFormatBitrateCount, int totalInitialVideoFormatHeight, long totalInitialVideoFormatBitrate, int initialAudioFormatBitrateCount, long totalInitialAudioFormatBitrate, long totalBandwidthTimeMs, long totalBandwidthBytes, long totalDroppedFrames, long totalAudioUnderruns, int fatalErrorPlaybackCount, int fatalErrorCount, int nonFatalErrorCount, List<Pair<c.a, Exception>> fatalErrorHistory, List<Pair<c.a, Exception>> nonFatalErrorHistory) {
        this.f53166a = playbackCount;
        this.N = playbackStateDurationsMs;
        this.f53167b = Collections.unmodifiableList(playbackStateHistory);
        this.f53168c = Collections.unmodifiableList(mediaTimeHistory);
        this.f53169d = firstReportedTimeMs;
        this.f53170e = foregroundPlaybackCount;
        this.f53171f = abandonedBeforeReadyCount;
        this.f53172g = endedCount;
        this.f53173h = backgroundJoiningCount;
        this.f53174i = totalValidJoinTimeMs;
        this.f53175j = validJoinTimeCount;
        this.f53176k = totalPauseCount;
        this.f53177l = totalPauseBufferCount;
        this.f53178m = totalSeekCount;
        this.f53179n = totalRebufferCount;
        this.f53180o = maxRebufferTimeMs;
        this.f53181p = adPlaybackCount;
        this.f53182q = Collections.unmodifiableList(videoFormatHistory);
        this.f53183r = Collections.unmodifiableList(audioFormatHistory);
        this.f53184s = totalVideoFormatHeightTimeMs;
        this.f53185t = totalVideoFormatHeightTimeProduct;
        this.f53186u = totalVideoFormatBitrateTimeMs;
        this.f53187v = totalVideoFormatBitrateTimeProduct;
        this.f53188w = totalAudioFormatTimeMs;
        this.f53189x = totalAudioFormatBitrateTimeProduct;
        this.f53190y = initialVideoFormatHeightCount;
        this.f53191z = initialVideoFormatBitrateCount;
        this.A = totalInitialVideoFormatHeight;
        this.B = totalInitialVideoFormatBitrate;
        this.C = initialAudioFormatBitrateCount;
        this.D = totalInitialAudioFormatBitrate;
        this.E = totalBandwidthTimeMs;
        this.F = totalBandwidthBytes;
        this.G = totalDroppedFrames;
        this.H = totalAudioUnderruns;
        this.I = fatalErrorPlaybackCount;
        this.J = fatalErrorCount;
        this.K = nonFatalErrorCount;
        this.L = Collections.unmodifiableList(fatalErrorHistory);
        this.M = Collections.unmodifiableList(nonFatalErrorHistory);
    }

    public static g W(g... playbackStats) {
        int i10;
        g[] gVarArr = playbackStats;
        long[] jArr = new long[13];
        int length = gVarArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = -1;
        long j21 = -1;
        long jMax = -9223372036854775807L;
        long jMin = -9223372036854775807L;
        long j22 = -9223372036854775807L;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (i26 < length) {
            g gVar = gVarArr[i26];
            i11 += gVar.f53166a;
            for (int i30 = 0; i30 < 13; i30++) {
                jArr[i30] = jArr[i30] + gVar.N[i30];
            }
            if (jMin == -9223372036854775807L) {
                jMin = gVar.f53169d;
            } else {
                long j23 = gVar.f53169d;
                if (j23 != -9223372036854775807L) {
                    jMin = Math.min(jMin, j23);
                }
            }
            i27 += gVar.f53170e;
            i28 += gVar.f53171f;
            i29 += gVar.f53172g;
            i12 += gVar.f53173h;
            if (j22 == -9223372036854775807L) {
                j22 = gVar.f53174i;
            } else {
                long j24 = gVar.f53174i;
                if (j24 != -9223372036854775807L) {
                    j22 += j24;
                }
            }
            i13 += gVar.f53175j;
            i14 += gVar.f53176k;
            i15 += gVar.f53177l;
            i16 += gVar.f53178m;
            i17 += gVar.f53179n;
            if (jMax == -9223372036854775807L) {
                jMax = gVar.f53180o;
            } else {
                long j25 = gVar.f53180o;
                if (j25 != -9223372036854775807L) {
                    jMax = Math.max(jMax, j25);
                }
            }
            i18 += gVar.f53181p;
            j10 += gVar.f53184s;
            j11 += gVar.f53185t;
            j12 += gVar.f53186u;
            j13 += gVar.f53187v;
            j14 += gVar.f53188w;
            j15 += gVar.f53189x;
            i19 += gVar.f53190y;
            i20 += gVar.f53191z;
            int i31 = i25;
            if (i31 == -1) {
                i25 = gVar.A;
            } else {
                i25 = i31;
                int i32 = gVar.A;
                if (i32 != -1) {
                    i25 += i32;
                }
            }
            if (j20 == -1) {
                i10 = length;
                j20 = gVar.B;
            } else {
                i10 = length;
                long j26 = gVar.B;
                if (j26 != -1) {
                    j20 += j26;
                }
            }
            i21 += gVar.C;
            if (j21 == -1) {
                j21 = gVar.D;
            } else {
                long j27 = gVar.D;
                if (j27 != -1) {
                    j21 += j27;
                }
            }
            j16 += gVar.E;
            j17 += gVar.F;
            j18 += gVar.G;
            j19 += gVar.H;
            i22 += gVar.I;
            i23 += gVar.J;
            i24 += gVar.K;
            i26++;
            length = i10;
            gVarArr = playbackStats;
        }
        long j28 = jMin;
        long j29 = jMax;
        List list = Collections.EMPTY_LIST;
        return new g(i11, jArr, list, list, j28, i27, i28, i29, i12, j22, i13, i14, i15, i16, i17, j29, i18, list, list, j10, j11, j12, j13, j14, j15, i19, i20, i25, j20, i21, j21, j16, j17, j18, j19, i22, i23, i24, list, list);
    }

    public float A() {
        return 1.0f / e();
    }

    public float B() {
        return 1.0f / H();
    }

    public float C() {
        return 1.0f / K();
    }

    public int D() {
        long j10 = this.f53186u;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.f53187v / j10);
    }

    public int E() {
        long j10 = this.f53184s;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.f53185t / j10);
    }

    public long F() {
        if (this.f53170e == 0) {
            return -9223372036854775807L;
        }
        return U() / ((long) this.f53170e);
    }

    public long G(long realtimeMs) {
        if (this.f53168c.isEmpty()) {
            return -9223372036854775807L;
        }
        int i10 = 0;
        while (i10 < this.f53168c.size() && this.f53168c.get(i10)[0] <= realtimeMs) {
            i10++;
        }
        if (i10 == 0) {
            return this.f53168c.get(0)[1];
        }
        if (i10 == this.f53168c.size()) {
            List<long[]> list = this.f53168c;
            return list.get(list.size() - 1)[1];
        }
        int i11 = i10 - 1;
        long j10 = this.f53168c.get(i11)[0];
        long j11 = this.f53168c.get(i11)[1];
        long j12 = this.f53168c.get(i10)[0];
        long j13 = this.f53168c.get(i10)[1];
        long j14 = j12 - j10;
        if (j14 == 0) {
            return j11;
        }
        return j11 + ((long) ((j13 - j11) * ((realtimeMs - j10) / j14)));
    }

    public float H() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.K * 1000.0f) / jR;
    }

    public int I(long realtimeMs) {
        int iIntValue = 0;
        for (Pair<c.a, Integer> pair : this.f53167b) {
            if (((c.a) pair.first).f53140a > realtimeMs) {
                break;
            }
            iIntValue = ((Integer) pair.second).intValue();
        }
        return iIntValue;
    }

    public long J(int playbackState) {
        return this.N[playbackState];
    }

    public float K() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.f53179n * 1000.0f) / jR;
    }

    public float L() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return S() / jQ;
    }

    public float M() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return T() / jQ;
    }

    public long N() {
        long j10 = 0;
        for (int i10 = 0; i10 < 13; i10++) {
            j10 += this.N[i10];
        }
        return j10;
    }

    public long O() {
        return J(2);
    }

    public long P() {
        return J(4) + J(7);
    }

    public long Q() {
        return R() + U();
    }

    public long R() {
        return J(3);
    }

    public long S() {
        return J(6);
    }

    public long T() {
        return J(5) + J(8);
    }

    public long U() {
        return J(2) + J(6) + J(5) + J(8);
    }

    public float V() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return U() / jQ;
    }

    public float a() {
        int i10 = this.f53171f;
        int i11 = this.f53166a;
        int i12 = this.f53170e;
        int i13 = i10 - (i11 - i12);
        if (i12 == 0) {
            return 0.0f;
        }
        return i13 / i12;
    }

    public float b() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.H * 1000.0f) / jR;
    }

    public float c() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.G * 1000.0f) / jR;
    }

    public float d() {
        int i10 = this.f53170e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f53172g / i10;
    }

    public float e() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.J * 1000.0f) / jR;
    }

    public float f() {
        int i10 = this.f53170e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.I / i10;
    }

    public float g() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return O() / jQ;
    }

    public int h() {
        long j10 = this.f53188w;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.f53189x / j10);
    }

    public int i() {
        long j10 = this.E;
        if (j10 == 0) {
            return -1;
        }
        return (int) ((this.F * 8000) / j10);
    }

    public long j() {
        if (this.f53166a == 0) {
            return -9223372036854775807L;
        }
        return N() / ((long) this.f53166a);
    }

    public int k() {
        int i10 = this.C;
        if (i10 == 0) {
            return -1;
        }
        return (int) (this.D / ((long) i10));
    }

    public int l() {
        int i10 = this.f53191z;
        if (i10 == 0) {
            return -1;
        }
        return (int) (this.B / ((long) i10));
    }

    public int m() {
        int i10 = this.f53190y;
        if (i10 == 0) {
            return -1;
        }
        return this.A / i10;
    }

    public long n() {
        int i10 = this.f53175j;
        if (i10 == 0) {
            return -9223372036854775807L;
        }
        return this.f53174i / ((long) i10);
    }

    public float o() {
        int i10 = this.f53170e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.K / i10;
    }

    public float p() {
        int i10 = this.f53170e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f53177l / i10;
    }

    public float q() {
        int i10 = this.f53170e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f53176k / i10;
    }

    public long r() {
        if (this.f53170e == 0) {
            return -9223372036854775807L;
        }
        return P() / ((long) this.f53170e);
    }

    public long s() {
        if (this.f53170e == 0) {
            return -9223372036854775807L;
        }
        return Q() / ((long) this.f53170e);
    }

    public long t() {
        if (this.f53170e == 0) {
            return -9223372036854775807L;
        }
        return R() / ((long) this.f53170e);
    }

    public float u() {
        int i10 = this.f53170e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f53179n / i10;
    }

    public long v() {
        if (this.f53170e == 0) {
            return -9223372036854775807L;
        }
        return S() / ((long) this.f53170e);
    }

    public float w() {
        int i10 = this.f53170e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f53178m / i10;
    }

    public long x() {
        if (this.f53170e == 0) {
            return -9223372036854775807L;
        }
        return T() / ((long) this.f53170e);
    }

    public long y() {
        if (this.f53179n == 0) {
            return -9223372036854775807L;
        }
        return (J(6) + J(7)) / ((long) this.f53179n);
    }

    public long z() {
        if (this.f53178m == 0) {
            return -9223372036854775807L;
        }
        return T() / ((long) this.f53178m);
    }
}
