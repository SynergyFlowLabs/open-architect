package androidx.compose.ui.spatial;

import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.h0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 2 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n*L\n1#1,1024:1\n926#1:1025\n926#1:1026\n926#1:1027\n926#1:1028\n545#2:1029\n545#2:1030\n*S KotlinDebug\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n853#1:1025\n854#1:1026\n855#1:1027\n871#1:1028\n879#1:1029\n880#1:1030\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f41243a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41244b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41245c = 67108863;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41246d = 511;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f41247e = -4503599560261633L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f41248f = -2301339409586323457L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f41249g = 4294967297L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f41250h = -9223372034707292160L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f41251i = 2305843009213693951L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f41252j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f41253k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f41254l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f41255m = 3;

    public static final int a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i10 == 0) {
            return b(i12, i18, i13, i11, i17, i15);
        }
        if (i10 == 1) {
            return b(i16, i14, i13, i11, i17, i15);
        }
        if (i10 == 2) {
            return b(i11, i17, i14, i12, i18, i16);
        }
        if (i10 != 3) {
            return Integer.MAX_VALUE;
        }
        return b(i15, i13, i14, i12, i18, i16);
    }

    public static final int b(int i10, int i11, int i12, int i13, int i14, int i15) {
        return ((i10 - i11) + 1) * ((((i12 - i13) + Math.max(i13, i15)) - Math.min(i12, i14)) + 1);
    }

    public static final long c(long j10, boolean z10, boolean z11) {
        return (j10 & 4611686018427387903L) | ((z10 ? 1L : 0L) * 4611686018427387904L) | ((z11 ? 1L : 0L) * Long.MIN_VALUE);
    }

    public static final long d(long j10) {
        return j10 | h0.f315065r;
    }

    public static final long e(long j10) {
        return j10 & (-2305843009213693953L);
    }

    public static final long f(long j10, int i10) {
        return (j10 & f41248f) | (((long) (i10 & 511)) << 52);
    }

    public static final long g(long j10, int i10) {
        return (j10 & f41247e) | (((long) (i10 & f41245c)) << 26);
    }

    public static final long h(long j10, boolean z10) {
        return (j10 & (-2305843009213693953L)) | ((z10 ? 1L : 0L) << 61);
    }

    public static final long i(int i10, int i11, int i12, boolean z10, boolean z11, boolean z12) {
        return ((z11 ? 1L : 0L) << 62) | ((z12 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 61) | (((long) (i12 & 511)) << 52) | (((long) (i11 & f41245c)) << 26) | ((long) (i10 & f41245c));
    }

    public static final long j(int i10, int i11) {
        return (((long) i11) & k0.f265952a) | (((long) i10) << 32);
    }

    public static final boolean k(long j10, long j11, long j12, long j13) {
        return ((((j13 - j10) - 4294967297L) | ((j11 - j12) - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final long l(boolean z10) {
        return z10 ? 1L : 0L;
    }

    public static final int m(long j10) {
        return ((int) (j10 >> 62)) & 1;
    }

    public static final int n(long j10) {
        return ((int) (j10 >> 63)) & 1;
    }

    public static final int o(long j10) {
        return ((int) (j10 >> 52)) & 511;
    }

    public static final int p(long j10) {
        return ((int) (j10 >> 26)) & f41245c;
    }

    public static final int q(long j10) {
        return ((int) (j10 >> 61)) & 1;
    }

    public static final int r(long j10) {
        return ((int) j10) & f41245c;
    }

    public static final int s(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int t(long j10) {
        return (int) j10;
    }
}
