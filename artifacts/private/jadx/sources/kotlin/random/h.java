package kotlin.random;

import com.rabbitmq.client.k0;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import kotlin.r1;
import kotlin.ranges.w;
import kotlin.ranges.z;
import kotlin.u;
import kotlin.u1;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
public final class h {
    public static final void a(int i10, int i11) {
        if (Integer.compareUnsigned(i11, i10) <= 0) {
            throw new IllegalArgumentException(g.c(u1.c(i10), u1.c(i11)).toString());
        }
    }

    public static final void b(long j10, long j11) {
        if (Long.compareUnsigned(j11, j10) <= 0) {
            throw new IllegalArgumentException(g.c(y1.c(j10), y1.c(j11)).toString());
        }
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static final byte[] c(@NotNull f fVar, int i10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return r1.k(fVar.d(i10));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static final byte[] d(@NotNull f nextUBytes, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.e(array);
        return array;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static final byte[] e(@NotNull f nextUBytes, @NotNull byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.f(array, i10, i11);
        return array;
    }

    public static /* synthetic */ byte[] f(f fVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = r1.v(bArr);
        }
        return e(fVar, bArr, i10, i11);
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final int g(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return u1.n(fVar.l());
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final int h(@NotNull f fVar, @NotNull w range) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (Integer.compareUnsigned(range.m(), -1) < 0) {
                return i(fVar, range.l(), u1.n(range.m() + 1));
            }
            return Integer.compareUnsigned(range.l(), 0) > 0 ? u1.n(i(fVar, u1.n(range.l() - 1), range.m()) + 1) : g(fVar);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final int i(@NotNull f nextUInt, int i10, int i11) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        a(i10, i11);
        return u1.n(nextUInt.n(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final int j(@NotNull f nextUInt, int i10) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return i(nextUInt, 0, i10);
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final long k(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return y1.n(fVar.o());
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final long l(@NotNull f fVar, @NotNull z range) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compareUnsigned(range.m(), -1L) < 0) {
            return n(fVar, range.l(), y1.n(range.m() + y1.n(((long) 1) & k0.f265952a)));
        }
        if (Long.compareUnsigned(range.l(), 0L) <= 0) {
            return k(fVar);
        }
        long jL = range.l();
        long j10 = ((long) 1) & k0.f265952a;
        return y1.n(n(fVar, y1.n(jL - y1.n(j10)), range.m()) + y1.n(j10));
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final long m(@NotNull f nextULong, long j10) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return n(nextULong, 0L, j10);
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final long n(@NotNull f nextULong, long j10, long j11) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        b(j10, j11);
        return y1.n(nextULong.q(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
