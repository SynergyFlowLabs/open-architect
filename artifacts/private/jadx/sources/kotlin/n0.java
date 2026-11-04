package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
class n0 {
    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal a(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(BigDecimal.ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @kotlin.internal.f
    private static final BigDecimal b(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalDivide = bigDecimal.divide(other, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal c(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalAdd = bigDecimal.add(BigDecimal.ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @kotlin.internal.f
    private static final BigDecimal d(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @kotlin.internal.f
    private static final BigDecimal e(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalAdd = bigDecimal.add(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @kotlin.internal.f
    private static final BigDecimal f(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalRemainder = bigDecimal.remainder(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimalRemainder, "remainder(...)");
        return bigDecimalRemainder;
    }

    @kotlin.internal.f
    private static final BigDecimal g(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal h(double d10) {
        return new BigDecimal(String.valueOf(d10));
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal i(double d10, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d10), mathContext);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal j(float f10) {
        return new BigDecimal(String.valueOf(f10));
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal k(float f10, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f10), mathContext);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal l(int i10) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i10);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal m(int i10, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(i10, mathContext);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal n(long j10) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j10);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal o(long j10, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(j10, mathContext);
    }

    @kotlin.internal.f
    private static final BigDecimal p(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalNegate = bigDecimal.negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        return bigDecimalNegate;
    }
}
