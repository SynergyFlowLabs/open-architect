package androidx.compose.runtime.snapshots;

import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f36610a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f36611b = Long.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36612c = 64;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f36613d = -1;

    public static final int a(@NotNull long[] jArr, long j10) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j11 = jArr[i11];
            if (j10 > j11) {
                i10 = i11 + 1;
            } else {
                if (j10 >= j11) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int b(long j10, int i10) {
        return Intrinsics.compare(j10, i10);
    }

    public static final int c(long j10, long j11) {
        return Intrinsics.compare(j10, j11);
    }

    public static final void d(@NotNull long[] jArr, @NotNull long[] jArr2) {
        ArraysKt.copyInto$default(jArr, jArr2, 0, 0, 0, 12, (Object) null);
    }

    public static final long e(long j10, int i10) {
        return j10 / ((long) i10);
    }

    public static final long f(@NotNull long[] jArr) {
        return jArr[0];
    }

    public static final void g(@NotNull long[] jArr, @NotNull Function1<? super Long, Unit> function1) {
        for (long j10 : jArr) {
            function1.invoke(Long.valueOf(j10));
        }
    }

    public static final long h(@NotNull long[] jArr, int i10) {
        return jArr[i10];
    }

    public static final int i(@NotNull long[] jArr) {
        return jArr.length;
    }

    public static final long j(long j10, int i10) {
        return j10 - ((long) i10);
    }

    public static final long k(long j10, long j11) {
        return j10 - j11;
    }

    public static final long l(long j10, int i10) {
        return j10 + ((long) i10);
    }

    public static final void m(@NotNull long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    @NotNull
    public static final long[] n(long j10) {
        return new long[]{j10};
    }

    @NotNull
    public static final long[] o(int i10) {
        return new long[i10];
    }

    public static final long p(long j10, int i10) {
        return j10 * ((long) i10);
    }

    public static final int q(long j10) {
        return (int) j10;
    }

    public static final long r(long j10) {
        return j10;
    }

    public static final long s(int i10) {
        return i10;
    }

    public static final long t(long j10) {
        return j10;
    }

    @NotNull
    public static final long[] u(@NotNull long[] jArr, int i10, long j10) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        ArraysKt.copyInto(jArr, jArr2, 0, 0, i10);
        ArraysKt.copyInto(jArr, jArr2, i10 + 1, i10, length);
        jArr2[i10] = j10;
        return jArr2;
    }

    @Nullable
    public static final long[] v(@NotNull long[] jArr, int i10) {
        int length = jArr.length;
        int i11 = length - 1;
        if (i11 == 0) {
            return null;
        }
        long[] jArr2 = new long[i11];
        if (i10 > 0) {
            ArraysKt.copyInto(jArr, jArr2, 0, 0, i10);
        }
        if (i10 < i11) {
            ArraysKt.copyInto(jArr, jArr2, i10, i10 + 1, length);
        }
        return jArr2;
    }
}
