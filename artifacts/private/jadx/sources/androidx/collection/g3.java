package androidx.collection;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSieveCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1148:1\n1147#1:1149\n1147#1:1150\n*S KotlinDebug\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1097#1:1149\n1099#1:1150\n*E\n"})
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f12254a = 2147483646;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12255b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f12256c = 2147483647L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f12257d = 4611686018427387903L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f12258e = 4611686018427387904L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f12259f = -4611686018427387904L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f12260g = -4611686016279904257L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f12261h = -2147483648L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f12262i = 4611686018427387903L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final long[] f12263j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f12264k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f12265l = 9223372034707292159L;

    public static final long a(long j10) {
        return j10 & 4611686018427387903L;
    }

    public static final long b(long j10, int i10) {
        return (j10 & (-4294967296L)) | ((long) i10);
    }

    public static final long c(int i10) {
        return (((long) i10) & f12256c) | 4611686016279904256L;
    }

    public static final long d(long j10, int i10, int i11, @NotNull int[] mapping) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        int i12 = Integer.MAX_VALUE;
        long j11 = ((j10 & f12259f) | ((long) (i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i10]))) << 31;
        if (i11 != Integer.MAX_VALUE) {
            i12 = mapping[i11];
        }
        return j11 | ((long) i12);
    }

    public static final long e(long j10, int i10, int i11, @NotNull long[] mapping) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        return (((j10 & f12259f) | ((long) (i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i10] & com.rabbitmq.client.k0.f265952a)))) << 31) | ((long) (i11 != Integer.MAX_VALUE ? (int) (mapping[i11] & com.rabbitmq.client.k0.f265952a) : Integer.MAX_VALUE));
    }

    public static final long f(int i10, int i11) {
        return ((long) i11) | (((long) i10) << 32);
    }

    public static final long g(long j10, int i10) {
        return (j10 & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32);
    }

    public static final long h(long j10) {
        return (j10 & com.rabbitmq.client.k0.f265952a) | (-4294967296L);
    }

    public static final int i(long j10) {
        return (int) (j10 & com.rabbitmq.client.k0.f265952a);
    }

    @NotNull
    public static final long[] j() {
        return f12263j;
    }

    public static final int k(long j10) {
        return (int) (j10 & f12256c);
    }

    @kotlin.a1
    public static /* synthetic */ void l(long j10) {
    }

    @kotlin.a1
    public static /* synthetic */ void m() {
    }

    @kotlin.a1
    public static /* synthetic */ void n() {
    }

    public static final int o(long j10) {
        return (int) ((j10 >> 31) & f12256c);
    }

    @kotlin.a1
    public static /* synthetic */ void p(long j10) {
    }

    public static final int q(long j10) {
        return (int) ((j10 >> 32) & com.rabbitmq.client.k0.f265952a);
    }

    public static final int r(long j10) {
        return (int) ((j10 >> 62) & 1);
    }

    public static final long s(long j10, int i10) {
        return (j10 & f12261h) | (((long) i10) & f12256c);
    }

    public static final long t(long j10, int i10) {
        return (j10 & f12260g) | ((((long) i10) & f12256c) << 31);
    }
}
