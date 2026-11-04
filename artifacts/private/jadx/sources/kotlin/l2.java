package kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@oj.i(name = "UnsignedKt")
public final class l2 {
    @a1
    public static final int a(double d10) {
        if (Double.isNaN(d10) || d10 <= h(0)) {
            return 0;
        }
        if (d10 >= h(-1)) {
            return -1;
        }
        return d10 <= 2.147483647E9d ? u1.n((int) d10) : u1.n(u1.n((int) (d10 - ((double) Integer.MAX_VALUE))) + u1.n(Integer.MAX_VALUE));
    }

    @a1
    public static final long b(double d10) {
        if (Double.isNaN(d10) || d10 <= q(0L)) {
            return 0L;
        }
        if (d10 >= q(-1L)) {
            return -1L;
        }
        return d10 < 9.223372036854776E18d ? y1.n((long) d10) : y1.n(y1.n((long) (d10 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @a1
    @kotlin.internal.f
    private static final int c(float f10) {
        return a(f10);
    }

    @a1
    @kotlin.internal.f
    private static final long d(float f10) {
        return b(f10);
    }

    @a1
    public static final int e(int i10, int i11) {
        return Intrinsics.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    @a1
    public static final int f(int i10, int i11) {
        return u1.n((int) ((((long) i10) & com.rabbitmq.client.k0.f265952a) / (((long) i11) & com.rabbitmq.client.k0.f265952a)));
    }

    @a1
    public static final int g(int i10, int i11) {
        return u1.n((int) ((((long) i10) & com.rabbitmq.client.k0.f265952a) % (((long) i11) & com.rabbitmq.client.k0.f265952a)));
    }

    @a1
    public static final double h(int i10) {
        return ((double) (Integer.MAX_VALUE & i10)) + (((double) ((i10 >>> 31) << 30)) * ((double) 2));
    }

    @a1
    @kotlin.internal.f
    private static final float i(int i10) {
        return (float) h(i10);
    }

    @a1
    @kotlin.internal.f
    private static final long j(int i10) {
        return ((long) i10) & com.rabbitmq.client.k0.f265952a;
    }

    @kotlin.internal.f
    private static final String k(int i10) {
        return String.valueOf(((long) i10) & com.rabbitmq.client.k0.f265952a);
    }

    @kotlin.internal.f
    private static final String l(int i10, int i11) {
        return t(((long) i10) & com.rabbitmq.client.k0.f265952a, i11);
    }

    @a1
    @kotlin.internal.f
    private static final long m(int i10) {
        return y1.n(((long) i10) & com.rabbitmq.client.k0.f265952a);
    }

    @a1
    public static final int n(long j10, long j11) {
        return Intrinsics.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    @a1
    public static final long o(long j10, long j11) {
        if (j11 < 0) {
            return Long.compareUnsigned(j10, j11) < 0 ? y1.n(0L) : y1.n(1L);
        }
        if (j10 >= 0) {
            return y1.n(j10 / j11);
        }
        int i10 = 1;
        long j12 = ((j10 >>> 1) / j11) << 1;
        if (Long.compareUnsigned(y1.n(j10 - (j12 * j11)), y1.n(j11)) < 0) {
            i10 = 0;
        }
        return y1.n(j12 + ((long) i10));
    }

    @a1
    public static final long p(long j10, long j11) {
        if (j11 < 0) {
            return Long.compareUnsigned(j10, j11) < 0 ? j10 : y1.n(j10 - j11);
        }
        if (j10 >= 0) {
            return y1.n(j10 % j11);
        }
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if (Long.compareUnsigned(y1.n(j12), y1.n(j11)) < 0) {
            j11 = 0;
        }
        return y1.n(j12 - j11);
    }

    @a1
    public static final double q(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    @a1
    @kotlin.internal.f
    private static final float r(long j10) {
        return (float) q(j10);
    }

    @kotlin.internal.f
    private static final String s(long j10) {
        return t(j10, 10);
    }

    @NotNull
    public static final String t(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, CharsKt.checkRadix(i10));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, CharsKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, CharsKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
