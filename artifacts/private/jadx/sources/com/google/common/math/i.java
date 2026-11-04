package com.google.common.math;

import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
@e
@com.google.common.annotations.b
final class i {
    private i() {
    }

    static void a(boolean condition, double input, RoundingMode mode) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + input + " and rounding mode " + mode);
    }

    static void b(boolean condition, String methodName, int a10, int b10) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("overflow: " + methodName + "(" + a10 + ", " + b10 + ")");
    }

    static void c(boolean condition, String methodName, long a10, long b10) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("overflow: " + methodName + "(" + a10 + ", " + b10 + ")");
    }

    @z7.a
    static double d(String role, double x10) {
        if (x10 >= 0.0d) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be >= 0");
    }

    @z7.a
    static int e(String role, int x10) {
        if (x10 >= 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be >= 0");
    }

    @z7.a
    static long f(String role, long x10) {
        if (x10 >= 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be >= 0");
    }

    @z7.a
    static BigInteger g(String role, BigInteger x10) {
        if (x10.signum() >= 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be >= 0");
    }

    @z7.a
    static int h(String role, int x10) {
        if (x10 > 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be > 0");
    }

    @z7.a
    static long i(String role, long x10) {
        if (x10 > 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be > 0");
    }

    @z7.a
    static BigInteger j(String role, BigInteger x10) {
        if (x10.signum() > 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be > 0");
    }

    static void k(boolean condition) {
        if (!condition) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
