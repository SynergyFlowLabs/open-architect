package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
class o0 extends n0 {
    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger A(BigInteger bigInteger, int i10) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i10);
        Intrinsics.checkNotNullExpressionValue(bigIntegerShiftRight, "shiftRight(...)");
        return bigIntegerShiftRight;
    }

    @kotlin.internal.f
    private static final BigInteger B(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerMultiply = bigInteger.multiply(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply, "multiply(...)");
        return bigIntegerMultiply;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal C(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal D(BigInteger bigInteger, int i10, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i10, mathContext);
    }

    static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i10, MathContext mathContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            Intrinsics.checkNotNullExpressionValue(mathContext, "UNLIMITED");
        }
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i10, mathContext);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger F(int i10) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i10);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger G(long j10) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j10);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    @kotlin.internal.f
    private static final BigInteger H(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerNegate = bigInteger.negate();
        Intrinsics.checkNotNullExpressionValue(bigIntegerNegate, "negate(...)");
        return bigIntegerNegate;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger I(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerXor = bigInteger.xor(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerXor, "xor(...)");
        return bigIntegerXor;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger q(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerAnd = bigInteger.and(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerAnd, "and(...)");
        return bigIntegerAnd;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger r(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerSubtract = bigInteger.subtract(BigInteger.ONE);
        Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    @kotlin.internal.f
    private static final BigInteger s(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerDivide = bigInteger.divide(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerDivide, "divide(...)");
        return bigIntegerDivide;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger t(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerAdd = bigInteger.add(BigInteger.ONE);
        Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger u(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerNot = bigInteger.not();
        Intrinsics.checkNotNullExpressionValue(bigIntegerNot, "not(...)");
        return bigIntegerNot;
    }

    @kotlin.internal.f
    private static final BigInteger v(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerSubtract = bigInteger.subtract(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger w(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerOr = bigInteger.or(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerOr, "or(...)");
        return bigIntegerOr;
    }

    @kotlin.internal.f
    private static final BigInteger x(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerAdd = bigInteger.add(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final BigInteger y(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerRemainder = bigInteger.remainder(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "remainder(...)");
        return bigIntegerRemainder;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger z(BigInteger bigInteger, int i10) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i10);
        Intrinsics.checkNotNullExpressionValue(bigIntegerShiftLeft, "shiftLeft(...)");
        return bigIntegerShiftLeft;
    }
}
