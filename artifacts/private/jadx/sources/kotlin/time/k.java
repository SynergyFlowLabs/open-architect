package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class k {
    private static final long a(long j10, long j11, long j12) {
        if (!c.w0(j11) || (j10 ^ j12) >= 0) {
            return j10;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long b(long j10) {
        return j10 < 0 ? c.f313406b.J() : c.f313406b.q();
    }

    public static final boolean c(long j10) {
        return ((j10 - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long d(long j10, @NotNull f unit, long j11) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jK0 = c.K0(j11, unit);
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            return a(j10, j11, jK0);
        }
        if (((jK0 - 1) | 1) == Long.MAX_VALUE) {
            return e(j10, unit, j11);
        }
        long j12 = j10 + jK0;
        if (((j10 ^ j12) & (jK0 ^ j12)) < 0) {
            return j10 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return j12;
    }

    private static final long e(long j10, f fVar, long j11) {
        long jX = c.x(j11, 2);
        long jK0 = c.K0(jX, fVar);
        return (1 | (jK0 - 1)) == Long.MAX_VALUE ? jK0 : d(d(j10, fVar, jX), fVar, c.z0(j11, jX));
    }

    public static final long f(long j10, long j11, @NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? c.R0(b(j11)) : g(j10, j11, unit);
    }

    private static final long g(long j10, long j11, f fVar) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return e.n0(j12, fVar);
        }
        f fVar2 = f.MILLISECONDS;
        if (fVar.compareTo(fVar2) >= 0) {
            return c.R0(b(j12));
        }
        long jB = h.b(1L, fVar2, fVar);
        long j13 = (j10 / jB) - (j11 / jB);
        long j14 = (j10 % jB) - (j11 % jB);
        c.a aVar = c.f313406b;
        return c.A0(e.n0(j13, fVar2), e.n0(j14, fVar));
    }

    public static final long h(long j10, long j11, @NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j11 - 1) | 1) == Long.MAX_VALUE) {
            return j10 == j11 ? c.f313406b.W() : c.R0(b(j11));
        }
        return (1 | (j10 - 1)) == Long.MAX_VALUE ? b(j10) : g(j10, j11, unit);
    }
}
