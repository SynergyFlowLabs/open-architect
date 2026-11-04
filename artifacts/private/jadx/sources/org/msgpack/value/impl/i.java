package org.msgpack.value.impl;

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
public class i extends b implements org.msgpack.value.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f339400b = -128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f339401c = 127;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f339402d = -32768;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f339403e = 32767;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f339404f = -2147483648L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f339405g = 2147483647L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f339406a;

    public i(long j10) {
        this.f339406a = j10;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean A() {
        return super.A();
    }

    @Override // org.msgpack.value.r
    public boolean C() {
        return true;
    }

    @Override // org.msgpack.value.r
    public boolean F() {
        long j10 = this.f339406a;
        return -2147483648L <= j10 && j10 <= 2147483647L;
    }

    @Override // org.msgpack.value.r
    public byte G() {
        if (e0()) {
            return (byte) this.f339406a;
        }
        throw new org.msgpack.core.f(this.f339406a);
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
        jVar.x(this.f339406a);
    }

    @Override // org.msgpack.value.x
    public String O() {
        return Long.toString(this.f339406a);
    }

    @Override // org.msgpack.value.u
    public float P() {
        return this.f339406a;
    }

    @Override // org.msgpack.value.u
    public double R() {
        return this.f339406a;
    }

    @Override // org.msgpack.value.u
    public byte S() {
        return (byte) this.f339406a;
    }

    @Override // org.msgpack.value.u
    public short T() {
        return (short) this.f339406a;
    }

    @Override // org.msgpack.value.r
    public short U() {
        if (a0()) {
            return (short) this.f339406a;
        }
        throw new org.msgpack.core.f(this.f339406a);
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
        long j10 = this.f339406a;
        return f339402d <= j10 && j10 <= f339403e;
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
        long j10 = this.f339406a;
        return f339400b <= j10 && j10 <= f339401c;
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
        r rVarL = xVar.l();
        return rVarL.C() && this.f339406a == rVarL.h0();
    }

    @Override // org.msgpack.value.u
    public long h0() {
        return this.f339406a;
    }

    public int hashCode() {
        long j10 = this.f339406a;
        return (-2147483648L > j10 || j10 > 2147483647L) ? (int) (j10 ^ (j10 >>> 32)) : (int) j10;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.l i() {
        return super.i();
    }

    @Override // org.msgpack.value.r
    public int i0() {
        if (F()) {
            return (int) this.f339406a;
        }
        throw new org.msgpack.core.f(this.f339406a);
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
        return BigInteger.valueOf(this.f339406a);
    }

    @Override // org.msgpack.value.r
    public long m() {
        return this.f339406a;
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
        return d.A0(this);
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
        return BigInteger.valueOf(this.f339406a);
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.f t() {
        return super.t();
    }

    @Override // org.msgpack.value.u
    public int t0() {
        return (int) this.f339406a;
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
