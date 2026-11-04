package org.msgpack.value.impl;

import androidx.collection.g3;
import java.io.IOException;
import java.math.BigInteger;
import org.msgpack.value.m;
import org.msgpack.value.n;
import org.msgpack.value.o;
import org.msgpack.value.p;
import org.msgpack.value.r;
import org.msgpack.value.x;
import org.msgpack.value.z;

/* JADX INFO: loaded from: classes14.dex */
public class d extends b implements org.msgpack.value.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BigInteger f339385b = BigInteger.valueOf(-128);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BigInteger f339386c = BigInteger.valueOf(127);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BigInteger f339387d = BigInteger.valueOf(-32768);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BigInteger f339388e = BigInteger.valueOf(32767);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BigInteger f339389f = BigInteger.valueOf(g3.f12261h);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BigInteger f339390g = BigInteger.valueOf(g3.f12256c);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final BigInteger f339391h = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final BigInteger f339392i = BigInteger.valueOf(Long.MAX_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigInteger f339393a;

    public d(BigInteger bigInteger) {
        this.f339393a = bigInteger;
    }

    public static org.msgpack.core.c A0(r rVar) {
        if (rVar.e0()) {
            return org.msgpack.core.c.Y;
        }
        if (rVar.a0()) {
            return org.msgpack.core.c.Z;
        }
        if (rVar.F()) {
            return org.msgpack.core.c.f339249p0;
        }
        return rVar.C() ? org.msgpack.core.c.f339250p1 : org.msgpack.core.c.X;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean A() {
        return super.A();
    }

    @Override // org.msgpack.value.r
    public boolean C() {
        return this.f339393a.compareTo(f339391h) >= 0 && this.f339393a.compareTo(f339392i) <= 0;
    }

    @Override // org.msgpack.value.r
    public boolean F() {
        return this.f339393a.compareTo(f339389f) >= 0 && this.f339393a.compareTo(f339390g) <= 0;
    }

    @Override // org.msgpack.value.r
    public byte G() {
        if (e0()) {
            return this.f339393a.byteValue();
        }
        throw new org.msgpack.core.f(this.f339393a);
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean J() {
        return super.J();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean K() {
        return super.K();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean L() {
        return super.L();
    }

    @Override // org.msgpack.value.x
    public void N(org.msgpack.core.j jVar) throws IOException {
        jVar.h(this.f339393a);
    }

    @Override // org.msgpack.value.x
    public String O() {
        return this.f339393a.toString();
    }

    @Override // org.msgpack.value.u
    public float P() {
        return this.f339393a.floatValue();
    }

    @Override // org.msgpack.value.u
    public double R() {
        return this.f339393a.doubleValue();
    }

    @Override // org.msgpack.value.u
    public byte S() {
        return this.f339393a.byteValue();
    }

    @Override // org.msgpack.value.u
    public short T() {
        return this.f339393a.shortValue();
    }

    @Override // org.msgpack.value.r
    public short U() {
        if (a0()) {
            return this.f339393a.shortValue();
        }
        throw new org.msgpack.core.f(this.f339393a);
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean W() {
        return super.W();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean Y() {
        return super.Y();
    }

    @Override // org.msgpack.value.r
    public boolean a0() {
        return this.f339393a.compareTo(f339387d) >= 0 && this.f339393a.compareTo(f339388e) <= 0;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean b0() {
        return super.b0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
    }

    @Override // org.msgpack.value.r
    public boolean e0() {
        return this.f339393a.compareTo(f339385b) >= 0 && this.f339393a.compareTo(f339386c) <= 0;
    }

    @Override // org.msgpack.value.x
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!xVar.p0()) {
            return false;
        }
        return this.f339393a.equals(xVar.l().l0());
    }

    @Override // org.msgpack.value.u
    public long h0() {
        return this.f339393a.longValue();
    }

    public int hashCode() {
        if (f339389f.compareTo(this.f339393a) <= 0 && this.f339393a.compareTo(f339390g) <= 0) {
            return (int) this.f339393a.longValue();
        }
        if (f339391h.compareTo(this.f339393a) > 0 || this.f339393a.compareTo(f339392i) > 0) {
            return this.f339393a.hashCode();
        }
        long jLongValue = this.f339393a.longValue();
        return (int) (jLongValue ^ (jLongValue >>> 32));
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.l i() {
        return super.i();
    }

    @Override // org.msgpack.value.r
    public int i0() {
        if (F()) {
            return this.f339393a.intValue();
        }
        throw new org.msgpack.core.f(this.f339393a);
    }

    @Override // org.msgpack.value.x
    public z i1() {
        return z.INTEGER;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public org.msgpack.value.k l() {
        return this;
    }

    @Override // org.msgpack.value.u
    public BigInteger l0() {
        return this.f339393a;
    }

    @Override // org.msgpack.value.r
    public long m() {
        if (C()) {
            return this.f339393a.longValue();
        }
        throw new org.msgpack.core.f(this.f339393a);
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean m0() {
        return super.m0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.g n() {
        return super.n();
    }

    @Override // org.msgpack.value.r
    public org.msgpack.core.c n0() {
        return A0(this);
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ m p() {
        return super.p();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean p0() {
        return super.p0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean q0() {
        return super.q0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ p r() {
        return super.r();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.h s() {
        return super.s();
    }

    @Override // org.msgpack.value.r
    public BigInteger s0() {
        return this.f339393a;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.f t() {
        return super.t();
    }

    @Override // org.msgpack.value.u
    public int t0() {
        return this.f339393a.intValue();
    }

    public String toString() {
        return O();
    }

    @Override // org.msgpack.value.impl.b
    /* JADX INFO: renamed from: u0 */
    public /* bridge */ /* synthetic */ org.msgpack.value.i V() {
        return super.V();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ o v() {
        return super.v();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    /* JADX INFO: renamed from: v0 */
    public n Z() {
        return this;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.j w() {
        return super.w();
    }

    @Override // org.msgpack.value.x
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public org.msgpack.value.k M() {
        return this;
    }
}
