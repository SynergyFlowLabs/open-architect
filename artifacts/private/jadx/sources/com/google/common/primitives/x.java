package com.google.common.primitives;

import com.google.common.base.j0;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b(serializable = true)
public final class x extends Number implements Comparable<x>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f119804b = Long.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f119805c = new x(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f119806d = new x(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f119807e = new x(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f119808a;

    private x(long value) {
        this.f119808a = value;
    }

    public static x o(long bits) {
        return new x(bits);
    }

    @z7.a
    public static x v(long value) {
        j0.p(value >= 0, "value (%s) is outside the range for an unsigned long value", value);
        return o(value);
    }

    @z7.a
    public static x w(String string) {
        return x(string, 10);
    }

    @z7.a
    public static x x(String string, int radix) {
        return o(y.j(string, radix));
    }

    @z7.a
    public static x z(BigInteger value) {
        j0.E(value);
        j0.u(value.signum() >= 0 && value.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", value);
        return o(value.longValue());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j10 = this.f119808a;
        if (j10 >= 0) {
            return j10;
        }
        return ((j10 & 1) | (j10 >>> 1)) * 2.0d;
    }

    public boolean equals(@fj.a Object obj) {
        return (obj instanceof x) && this.f119808a == ((x) obj).f119808a;
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j10 = this.f119808a;
        if (j10 >= 0) {
            return j10;
        }
        return ((j10 & 1) | (j10 >>> 1)) * 2.0f;
    }

    public int hashCode() {
        return n.l(this.f119808a);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f119808a;
    }

    public BigInteger k() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(this.f119808a & Long.MAX_VALUE);
        return this.f119808a < 0 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(x o10) {
        j0.E(o10);
        return y.a(this.f119808a, o10.f119808a);
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f119808a;
    }

    public x n(x val) {
        return o(y.c(this.f119808a, ((x) j0.E(val)).f119808a));
    }

    public x p(x val) {
        return o(this.f119808a - ((x) j0.E(val)).f119808a);
    }

    public x q(x val) {
        return o(y.k(this.f119808a, ((x) j0.E(val)).f119808a));
    }

    public x r(x val) {
        return o(this.f119808a + ((x) j0.E(val)).f119808a);
    }

    public x s(x val) {
        return o(this.f119808a * ((x) j0.E(val)).f119808a);
    }

    public String t(int radix) {
        return y.q(this.f119808a, radix);
    }

    public String toString() {
        return y.p(this.f119808a);
    }
}
