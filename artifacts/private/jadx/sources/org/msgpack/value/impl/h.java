package org.msgpack.value.impl;

import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.msgpack.value.m;
import org.msgpack.value.n;
import org.msgpack.value.o;
import org.msgpack.value.p;
import org.msgpack.value.x;
import org.msgpack.value.z;

/* JADX INFO: loaded from: classes14.dex */
public class h extends b implements org.msgpack.value.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f339398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f339399b;

    public h(byte b10, byte[] bArr) {
        this.f339398a = b10;
        this.f339399b = bArr;
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
        jVar.q(this.f339398a, this.f339399b.length);
        jVar.r0(this.f339399b);
    }

    @Override // org.msgpack.value.x
    public String O() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(Byte.toString(this.f339398a));
        sb2.append(",\"");
        for (byte b10 : this.f339399b) {
            sb2.append(Integer.toString(b10, 16));
        }
        sb2.append("\"]");
        return sb2.toString();
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

    @Override // org.msgpack.value.d
    public byte c() {
        return this.f339398a;
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
        if (!xVar.m0()) {
            return false;
        }
        org.msgpack.value.d dVarV = xVar.V();
        return this.f339398a == dVarV.c() && Arrays.equals(this.f339399b, dVarV.getData());
    }

    @Override // org.msgpack.value.d
    public byte[] getData() {
        return this.f339399b;
    }

    public int hashCode() {
        int i10 = this.f339398a + com.google.common.base.c.I;
        for (byte b10 : this.f339399b) {
            i10 = (i10 * 31) + b10;
        }
        return i10;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.l i() {
        return super.i();
    }

    @Override // org.msgpack.value.x
    public z i1() {
        return z.EXTENSION;
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

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.h s() {
        return super.s();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.f t() {
        return super.t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(Byte.toString(this.f339398a));
        sb2.append(",0x");
        for (byte b10 : this.f339399b) {
            sb2.append(Integer.toString(b10, 16));
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    /* JADX INFO: renamed from: u0 */
    public org.msgpack.value.i V() {
        return this;
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
    public org.msgpack.value.i M() {
        return this;
    }
}
