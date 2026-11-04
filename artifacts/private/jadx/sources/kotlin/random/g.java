package kotlin.random;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public final class g {
    @e1(version = "1.3")
    @NotNull
    public static final f a(int i10) {
        return new i(i10, i10 >> 31);
    }

    @e1(version = "1.3")
    @NotNull
    public static final f b(long j10) {
        return new i((int) j10, (int) (j10 >> 32));
    }

    @NotNull
    public static final String c(@NotNull Object from, @NotNull Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void d(double d10, double d11) {
        if (d11 <= d10) {
            throw new IllegalArgumentException(c(Double.valueOf(d10), Double.valueOf(d11)).toString());
        }
    }

    public static final void e(int i10, int i11) {
        if (i11 <= i10) {
            throw new IllegalArgumentException(c(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void f(long j10, long j11) {
        if (j11 <= j10) {
            throw new IllegalArgumentException(c(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int g(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    @e1(version = "1.3")
    public static final int h(@NotNull f fVar, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (range.m() < Integer.MAX_VALUE) {
                return fVar.n(range.l(), range.m() + 1);
            }
            return range.l() > Integer.MIN_VALUE ? fVar.n(range.l() - 1, range.m()) + 1 : fVar.l();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @e1(version = "1.3")
    public static final long i(@NotNull f fVar, @NotNull n range) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (range.m() < Long.MAX_VALUE) {
                return fVar.q(range.l(), range.m() + 1);
            }
            return range.l() > Long.MIN_VALUE ? fVar.q(range.l() - 1, range.m()) + 1 : fVar.o();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int j(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
