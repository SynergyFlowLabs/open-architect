package com.google.common.math;

import com.google.common.base.b0;
import com.google.common.base.d0;
import com.google.common.base.j0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@e
@com.google.common.annotations.d
public final class j implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f119439d = 88;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f119440e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f119441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f119442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f119443c;

    j(n xStats, n yStats, double sumOfProductsOfDeltas) {
        this.f119441a = xStats;
        this.f119442b = yStats;
        this.f119443c = sumOfProductsOfDeltas;
    }

    private static double b(double value) {
        if (value >= 1.0d) {
            return 1.0d;
        }
        if (value <= -1.0d) {
            return -1.0d;
        }
        return value;
    }

    private static double c(double value) {
        if (value > 0.0d) {
            return value;
        }
        return Double.MIN_VALUE;
    }

    public static j d(byte[] byteArray) {
        j0.E(byteArray);
        j0.m(byteArray.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, byteArray.length);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN);
        return new j(n.r(byteBufferOrder), n.r(byteBufferOrder), byteBufferOrder.getDouble());
    }

    public long a() {
        return this.f119441a.a();
    }

    public g e() {
        j0.g0(a() > 1);
        if (Double.isNaN(this.f119443c)) {
            return g.a();
        }
        double dV = this.f119441a.v();
        if (dV > 0.0d) {
            return this.f119442b.v() > 0.0d ? g.f(this.f119441a.d(), this.f119442b.d()).b(this.f119443c / dV) : g.b(this.f119442b.d());
        }
        j0.g0(this.f119442b.v() > 0.0d);
        return g.i(this.f119441a.d());
    }

    public boolean equals(@fj.a Object obj) {
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f119441a.equals(jVar.f119441a) && this.f119442b.equals(jVar.f119442b) && Double.doubleToLongBits(this.f119443c) == Double.doubleToLongBits(jVar.f119443c);
    }

    public double f() {
        j0.g0(a() > 1);
        if (Double.isNaN(this.f119443c)) {
            return Double.NaN;
        }
        double dV = k().v();
        double dV2 = l().v();
        j0.g0(dV > 0.0d);
        j0.g0(dV2 > 0.0d);
        return b(this.f119443c / Math.sqrt(c(dV * dV2)));
    }

    public double g() {
        j0.g0(a() != 0);
        return this.f119443c / a();
    }

    public double h() {
        j0.g0(a() > 1);
        return this.f119443c / (a() - 1);
    }

    public int hashCode() {
        return d0.b(this.f119441a, this.f119442b, Double.valueOf(this.f119443c));
    }

    double i() {
        return this.f119443c;
    }

    public byte[] j() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.f119441a.x(byteBufferOrder);
        this.f119442b.x(byteBufferOrder);
        byteBufferOrder.putDouble(this.f119443c);
        return byteBufferOrder.array();
    }

    public n k() {
        return this.f119441a;
    }

    public n l() {
        return this.f119442b;
    }

    public String toString() {
        return a() > 0 ? b0.c(this).f("xStats", this.f119441a).f("yStats", this.f119442b).b("populationCovariance", g()).toString() : b0.c(this).f("xStats", this.f119441a).f("yStats", this.f119442b).toString();
    }
}
