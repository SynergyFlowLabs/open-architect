package com.google.common.math;

import com.google.common.base.b0;
import com.google.common.base.d0;
import com.google.common.base.j0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@e
@com.google.common.annotations.d
public final class n implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f119452f = 40;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f119453g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f119454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f119455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f119456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f119457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f119458e;

    n(long count, double mean, double sumOfSquaresOfDeltas, double min, double max) {
        this.f119454a = count;
        this.f119455b = mean;
        this.f119456c = sumOfSquaresOfDeltas;
        this.f119457d = min;
        this.f119458e = max;
    }

    public static n b(byte[] byteArray) {
        j0.E(byteArray);
        j0.m(byteArray.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, byteArray.length);
        return r(ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double e(Iterable<? extends Number> values) {
        return f(values.iterator());
    }

    public static double f(Iterator<? extends Number> values) {
        j0.d(values.hasNext());
        double dDoubleValue = values.next().doubleValue();
        long j10 = 1;
        while (values.hasNext()) {
            double dDoubleValue2 = values.next().doubleValue();
            j10++;
            dDoubleValue = (com.google.common.primitives.d.o(dDoubleValue2) && com.google.common.primitives.d.o(dDoubleValue)) ? dDoubleValue + ((dDoubleValue2 - dDoubleValue) / j10) : o.i(dDoubleValue, dDoubleValue2);
        }
        return dDoubleValue;
    }

    public static double g(double... values) {
        j0.d(values.length > 0);
        double dI = values[0];
        for (int i10 = 1; i10 < values.length; i10++) {
            double d10 = values[i10];
            dI = (com.google.common.primitives.d.o(d10) && com.google.common.primitives.d.o(dI)) ? dI + ((d10 - dI) / ((double) (i10 + 1))) : o.i(dI, d10);
        }
        return dI;
    }

    public static double h(int... values) {
        j0.d(values.length > 0);
        double dI = values[0];
        for (int i10 = 1; i10 < values.length; i10++) {
            double d10 = values[i10];
            dI = (com.google.common.primitives.d.o(d10) && com.google.common.primitives.d.o(dI)) ? dI + ((d10 - dI) / ((double) (i10 + 1))) : o.i(dI, d10);
        }
        return dI;
    }

    public static double i(long... values) {
        j0.d(values.length > 0);
        double dI = values[0];
        for (int i10 = 1; i10 < values.length; i10++) {
            double d10 = values[i10];
            dI = (com.google.common.primitives.d.o(d10) && com.google.common.primitives.d.o(dI)) ? dI + ((d10 - dI) / ((double) (i10 + 1))) : o.i(dI, d10);
        }
        return dI;
    }

    public static n k(Iterable<? extends Number> values) {
        o oVar = new o();
        oVar.d(values);
        return oVar.s();
    }

    public static n l(Iterator<? extends Number> values) {
        o oVar = new o();
        oVar.e(values);
        return oVar.s();
    }

    public static n m(double... values) {
        o oVar = new o();
        oVar.f(values);
        return oVar.s();
    }

    public static n n(int... values) {
        o oVar = new o();
        oVar.g(values);
        return oVar.s();
    }

    public static n o(long... values) {
        o oVar = new o();
        oVar.h(values);
        return oVar.s();
    }

    static n r(ByteBuffer buffer) {
        j0.E(buffer);
        j0.m(buffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, buffer.remaining());
        return new n(buffer.getLong(), buffer.getDouble(), buffer.getDouble(), buffer.getDouble(), buffer.getDouble());
    }

    public long a() {
        return this.f119454a;
    }

    public double c() {
        j0.g0(this.f119454a != 0);
        return this.f119458e;
    }

    public double d() {
        j0.g0(this.f119454a != 0);
        return this.f119455b;
    }

    public boolean equals(@fj.a Object obj) {
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f119454a == nVar.f119454a && Double.doubleToLongBits(this.f119455b) == Double.doubleToLongBits(nVar.f119455b) && Double.doubleToLongBits(this.f119456c) == Double.doubleToLongBits(nVar.f119456c) && Double.doubleToLongBits(this.f119457d) == Double.doubleToLongBits(nVar.f119457d) && Double.doubleToLongBits(this.f119458e) == Double.doubleToLongBits(nVar.f119458e);
    }

    public int hashCode() {
        return d0.b(Long.valueOf(this.f119454a), Double.valueOf(this.f119455b), Double.valueOf(this.f119456c), Double.valueOf(this.f119457d), Double.valueOf(this.f119458e));
    }

    public double j() {
        j0.g0(this.f119454a != 0);
        return this.f119457d;
    }

    public double p() {
        return Math.sqrt(q());
    }

    public double q() {
        j0.g0(this.f119454a > 0);
        if (Double.isNaN(this.f119456c)) {
            return Double.NaN;
        }
        if (this.f119454a == 1) {
            return 0.0d;
        }
        return d.b(this.f119456c) / a();
    }

    public double s() {
        return Math.sqrt(t());
    }

    public double t() {
        j0.g0(this.f119454a > 1);
        if (Double.isNaN(this.f119456c)) {
            return Double.NaN;
        }
        return d.b(this.f119456c) / (this.f119454a - 1);
    }

    public String toString() {
        return a() > 0 ? b0.c(this).e("count", this.f119454a).b("mean", this.f119455b).b("populationStandardDeviation", p()).b("min", this.f119457d).b("max", this.f119458e).toString() : b0.c(this).e("count", this.f119454a).toString();
    }

    public double u() {
        return this.f119455b * this.f119454a;
    }

    double v() {
        return this.f119456c;
    }

    public byte[] w() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        x(byteBufferOrder);
        return byteBufferOrder.array();
    }

    void x(ByteBuffer buffer) {
        j0.E(buffer);
        j0.m(buffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, buffer.remaining());
        buffer.putLong(this.f119454a).putDouble(this.f119455b).putDouble(this.f119456c).putDouble(this.f119457d).putDouble(this.f119458e);
    }
}
