package da;

import java.math.BigInteger;
import kotlin.collections.UCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.z1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    @NotNull
    public static final BigInteger a(@NotNull com.ionspin.kotlin.bignum.integer.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        BigInteger bigIntegerB = b(UCollectionsKt.toULongArray(z1.d(aVar.e1())));
        BigInteger bigIntegerValueOf = BigInteger.valueOf(aVar.h1().o());
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger bigIntegerMultiply = bigIntegerB.multiply(bigIntegerValueOf);
        Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply, "multiply(...)");
        return bigIntegerMultiply;
    }

    @NotNull
    public static final BigInteger b(@NotNull long[] toJavaBigInteger) {
        Intrinsics.checkNotNullParameter(toJavaBigInteger, "$this$toJavaBigInteger");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int iV = z1.v(toJavaBigInteger);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            bigIntegerValueOf = bigIntegerValueOf.or(new BigInteger(Long.toUnsignedString(z1.t(toJavaBigInteger, i10)), 10).shiftLeft(i11 * 63));
            i10++;
            i11++;
        }
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "foldIndexed-mwnnOCs(...)");
        return bigIntegerValueOf;
    }

    @NotNull
    public static final BigInteger c(long j10) {
        return new BigInteger(d0.a(j10, 10), 10);
    }
}
