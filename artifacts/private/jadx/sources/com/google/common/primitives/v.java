package com.google.common.primitives;

import com.google.common.base.j0;
import com.rabbitmq.client.k0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b(emulated = true)
public final class v extends Number implements Comparable<v> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f119797b = o(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f119798c = o(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f119799d = o(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f119800a;

    private v(int value) {
        this.f119800a = value;
    }

    public static v o(int bits) {
        return new v(bits);
    }

    public static v v(long value) {
        j0.p((k0.f265952a & value) == value, "value (%s) is outside the range for an unsigned integer value", value);
        return o((int) value);
    }

    public static v w(String string) {
        return x(string, 10);
    }

    public static v x(String string, int radix) {
        return o(w.k(string, radix));
    }

    public static v z(BigInteger value) {
        j0.E(value);
        j0.u(value.signum() >= 0 && value.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", value);
        return o(value.intValue());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public boolean equals(@fj.a Object obj) {
        if (!(obj instanceof v) || this.f119800a != ((v) obj).f119800a) {
            return false;
        }
        int i10 = 7 >> 1;
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    public int hashCode() {
        return this.f119800a;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f119800a;
    }

    public BigInteger k() {
        return BigInteger.valueOf(longValue());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(v other) {
        j0.E(other);
        return w.b(this.f119800a, other.f119800a);
    }

    @Override // java.lang.Number
    public long longValue() {
        return w.r(this.f119800a);
    }

    public v n(v val) {
        return o(w.d(this.f119800a, ((v) j0.E(val)).f119800a));
    }

    public v p(v val) {
        return o(this.f119800a - ((v) j0.E(val)).f119800a);
    }

    public v q(v val) {
        return o(w.l(this.f119800a, ((v) j0.E(val)).f119800a));
    }

    public v r(v val) {
        return o(this.f119800a + ((v) j0.E(val)).f119800a);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public v s(v val) {
        return o(this.f119800a * ((v) j0.E(val)).f119800a);
    }

    public String t(int radix) {
        return w.t(this.f119800a, radix);
    }

    public String toString() {
        return t(10);
    }
}
