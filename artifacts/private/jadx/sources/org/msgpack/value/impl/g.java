package org.msgpack.value.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.msgpack.value.m;
import org.msgpack.value.n;
import org.msgpack.value.o;
import org.msgpack.value.p;
import org.msgpack.value.x;
import org.msgpack.value.z;

/* JADX INFO: loaded from: classes14.dex */
public class g extends b implements org.msgpack.value.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f339397a;

    public g(double d10) {
        this.f339397a = d10;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean A() {
        return super.A();
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
        jVar.o(this.f339397a);
    }

    @Override // org.msgpack.value.x
    public String O() {
        return (Double.isNaN(this.f339397a) || Double.isInfinite(this.f339397a)) ? AbstractJsonLexerKt.NULL : Double.toString(this.f339397a);
    }

    @Override // org.msgpack.value.u
    public float P() {
        return (float) this.f339397a;
    }

    @Override // org.msgpack.value.u
    public double R() {
        return this.f339397a;
    }

    @Override // org.msgpack.value.u
    public byte S() {
        return (byte) this.f339397a;
    }

    @Override // org.msgpack.value.u
    public short T() {
        return (short) this.f339397a;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean W() {
        return super.W();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean Y() {
        return super.Y();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean b0() {
        return super.b0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
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
        return xVar.L() && this.f339397a == xVar.w().R();
    }

    @Override // org.msgpack.value.u
    public long h0() {
        return (long) this.f339397a;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f339397a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.l i() {
        return super.i();
    }

    @Override // org.msgpack.value.x
    public z i1() {
        return z.FLOAT;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.k l() {
        return super.l();
    }

    @Override // org.msgpack.value.u
    public BigInteger l0() {
        return new BigDecimal(this.f339397a).toBigInteger();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean m0() {
        return super.m0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.g n() {
        return super.n();
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

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.f t() {
        return super.t();
    }

    @Override // org.msgpack.value.u
    public int t0() {
        return (int) this.f339397a;
    }

    public String toString() {
        return Double.toString(this.f339397a);
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

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public org.msgpack.value.j w() {
        return this;
    }

    @Override // org.msgpack.value.x
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public g M() {
        return this;
    }
}
