package org.msgpack.value.impl;

import java.io.IOException;
import org.msgpack.value.m;
import org.msgpack.value.n;
import org.msgpack.value.o;
import org.msgpack.value.p;
import org.msgpack.value.x;
import org.msgpack.value.z;

/* JADX INFO: loaded from: classes14.dex */
public class f extends b implements org.msgpack.value.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.msgpack.value.h f339394b = new f(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final org.msgpack.value.h f339395c = new f(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f339396a;

    private f(boolean z10) {
        this.f339396a = z10;
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
        jVar.l(this.f339396a);
    }

    @Override // org.msgpack.value.x
    public String O() {
        return Boolean.toString(this.f339396a);
    }

    @Override // org.msgpack.value.c
    public boolean Q() {
        return this.f339396a;
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
        return xVar.Y() && this.f339396a == xVar.s().Q();
    }

    public int hashCode() {
        return this.f339396a ? 1231 : 1237;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.l i() {
        return super.i();
    }

    @Override // org.msgpack.value.x
    public z i1() {
        return z.BOOLEAN;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.k l() {
        return super.l();
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

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public org.msgpack.value.h s() {
        return this;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.f t() {
        return super.t();
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

    @Override // org.msgpack.value.impl.b
    /* JADX INFO: renamed from: v0 */
    public /* bridge */ /* synthetic */ n Z() {
        return super.Z();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.j w() {
        return super.w();
    }

    @Override // org.msgpack.value.x
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public org.msgpack.value.h M() {
        return this;
    }
}
