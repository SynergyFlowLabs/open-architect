package androidx.collection;

import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1787:1\n1254#1,6:1789\n1220#1:1795\n1220#1:1796\n1220#1:1797\n1297#1:1798\n1#2:1788\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1230#1:1789,6\n1262#1:1795\n1265#1:1796\n1268#1:1797\n1303#1:1798\n*E\n"})
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f12141a = -9187201950435737472L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f12142b = 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f12143c = 254;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f12144d = 255;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12146f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12147g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12148h = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12150j = -862048943;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f12151k = 72340172838076673L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f12152l = -9187201950435737472L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final long[] f12145e = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final k2 f12149i = new k2(0);

    public static final int A(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return i10 + ((i10 - 1) / 7);
    }

    public static final void B(@NotNull long[] data, int i10, int i11, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i12 = i11 >> 3;
        int i13 = (i11 & 7) << 3;
        long j11 = (j10 << i13) | (data[i12] & (~(255 << i13)));
        data[i12] = j11;
        data[(((i11 - 7) & i10) + (i10 & 7)) >> 3] = j11;
    }

    public static final void C(@NotNull long[] data, int i10, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        data[i11] = (j10 << i12) | (data[i11] & (~(255 << i12)));
    }

    public static final void a(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i11 = (i10 + 7) >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = metadata[i12] & (-9187201950435737472L);
            metadata[i12] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(metadata);
        int i13 = lastIndex - 1;
        metadata[i13] = (metadata[i13] & 72057594037927935L) | (-72057594037927936L);
        metadata[lastIndex] = metadata[0];
    }

    @NotNull
    public static final <K, V> a3<K, V> b() {
        k2 k2Var = f12149i;
        Intrinsics.checkNotNull(k2Var, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return k2Var;
    }

    public static final int c(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    @kotlin.a1
    public static /* synthetic */ void d() {
    }

    @kotlin.a1
    public static /* synthetic */ void e() {
    }

    @kotlin.a1
    public static /* synthetic */ void f() {
    }

    public static final long g(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        return (((-i12) >> 63) & (metadata[i11 + 1] << (64 - i12))) | (metadata[i11] >>> i12);
    }

    public static final int h(int i10) {
        return i10 >>> 7;
    }

    public static final int i(int i10) {
        return i10 & 127;
    }

    public static final boolean j(long j10) {
        return j10 != 0;
    }

    public static final int k(@Nullable Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * f12150j;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final boolean l(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) != 254) {
            return false;
        }
        int i11 = 3 ^ 1;
        return true;
    }

    public static final boolean m(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128;
    }

    @kotlin.a1
    public static final boolean n(long j10) {
        return j10 < 128;
    }

    public static final boolean o(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128;
    }

    public static final int p(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    @kotlin.a1
    public static final int q(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    public static final long r(long j10) {
        return j10 & ((~j10) << 6) & (-9187201950435737472L);
    }

    @kotlin.a1
    public static final long s(long j10) {
        return j10 & ((~j10) << 7) & (-9187201950435737472L);
    }

    @kotlin.a1
    public static final long t(long j10, int i10) {
        long j11 = j10 ^ (((long) i10) * f12151k);
        return (~j11) & (j11 - f12151k) & (-9187201950435737472L);
    }

    @NotNull
    public static final <K, V> k2<K, V> u() {
        return new k2<>(0, 1, null);
    }

    @NotNull
    public static final <K, V> k2<K, V> v(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        k2<K, V> k2Var = new k2<>(pairs.length);
        k2Var.k0(pairs);
        return k2Var;
    }

    public static final long w(long j10) {
        return j10 & (j10 - 1);
    }

    public static final int x(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int y(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    @kotlin.a1
    public static final long z(@NotNull long[] data, int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (data[i10 >> 3] >> ((i10 & 7) << 3)) & 255;
    }
}
