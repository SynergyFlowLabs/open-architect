package rm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f366709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f366710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f366711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteArrayOutputStream f366712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f366713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f366714f;

    public l() {
        this(2, 1);
    }

    public static String a(byte[] bArr) {
        return b(bArr);
    }

    public static String b(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(c((b10 >> 4) & 15));
            stringBuffer.append(c(b10 & com.google.common.base.c.f116464q));
        }
        return stringBuffer.toString();
    }

    private static char c(int i10) {
        if (i10 >= 0 && i10 <= 15) {
            return (char) (i10 <= 9 ? i10 + 48 : i10 + 55);
        }
        throw new IllegalArgumentException("Nibble value out of range: " + i10);
    }

    private void f(f fVar) throws IOException {
        if (this.f366710b == 2) {
            this.f366714f[0] = 1;
        } else {
            this.f366714f[0] = 0;
        }
        fVar.a(this.f366714f, 1);
    }

    private void g(org.locationtech.jts.geom.e eVar, int i10, f fVar) throws IOException {
        c.d(eVar.N5(i10), this.f366714f, this.f366710b);
        fVar.a(this.f366714f, 8);
        c.d(eVar.I3(i10), this.f366714f, this.f366710b);
        fVar.a(this.f366714f, 8);
        if (this.f366709a >= 3) {
            c.d(eVar.Rg() >= 3 ? eVar.ij(i10, 2) : Double.NaN, this.f366714f, this.f366710b);
            fVar.a(this.f366714f, 8);
        }
    }

    private void h(org.locationtech.jts.geom.e eVar, boolean z10, f fVar) throws IOException {
        if (z10) {
            k(eVar.size(), fVar);
        }
        for (int i10 = 0; i10 < eVar.size(); i10++) {
            g(eVar, i10, fVar);
        }
    }

    private void i(int i10, org.locationtech.jts.geom.o oVar, f fVar) throws IOException {
        f(fVar);
        j(i10, oVar, fVar);
        k(oVar.l0(), fVar);
        for (int i11 = 0; i11 < oVar.l0(); i11++) {
            d(oVar.h0(i11), fVar);
        }
    }

    private void j(int i10, org.locationtech.jts.geom.n nVar, f fVar) throws IOException {
        k(i10 | (this.f366709a == 3 ? Integer.MIN_VALUE : 0) | (this.f366711c ? 536870912 : 0), fVar);
        if (this.f366711c) {
            k(nVar.o0(), fVar);
        }
    }

    private void k(int i10, f fVar) throws IOException {
        c.e(i10, this.f366714f, this.f366710b);
        fVar.a(this.f366714f, 4);
    }

    private void l(v vVar, f fVar) throws IOException {
        f(fVar);
        j(2, vVar, fVar);
        h(vVar.S0(), true, fVar);
    }

    private void m(d0 d0Var, f fVar) throws IOException {
        if (d0Var.R0().size() == 0) {
            throw new IllegalArgumentException("Empty Points cannot be represented in WKB");
        }
        f(fVar);
        j(1, d0Var, fVar);
        h(d0Var.R0(), false, fVar);
    }

    private void n(e0 e0Var, f fVar) throws IOException {
        f(fVar);
        j(3, e0Var, fVar);
        k(e0Var.T0() + 1, fVar);
        h(e0Var.R0().S0(), true, fVar);
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            h(e0Var.S0(i10).S0(), true, fVar);
        }
    }

    public void d(org.locationtech.jts.geom.n nVar, f fVar) throws IOException {
        if (nVar instanceof d0) {
            m((d0) nVar, fVar);
            return;
        }
        if (nVar instanceof v) {
            l((v) nVar, fVar);
            return;
        }
        if (nVar instanceof e0) {
            n((e0) nVar, fVar);
            return;
        }
        if (nVar instanceof a0) {
            i(4, (a0) nVar, fVar);
            return;
        }
        if (nVar instanceof z) {
            i(5, (z) nVar, fVar);
            return;
        }
        if (nVar instanceof b0) {
            i(6, (b0) nVar, fVar);
        } else if (nVar instanceof org.locationtech.jts.geom.o) {
            i(7, (org.locationtech.jts.geom.o) nVar, fVar);
        } else {
            org.locationtech.jts.util.a.f("Unknown Geometry type");
        }
    }

    public byte[] e(org.locationtech.jts.geom.n nVar) {
        try {
            this.f366712d.reset();
            d(nVar, this.f366713e);
            return this.f366712d.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException("Unexpected IO exception: " + e10.getMessage());
        }
    }

    public l(int i10) {
        this(i10, 1);
    }

    public l(int i10, boolean z10) {
        this(i10, 1, z10);
    }

    public l(int i10, int i11) {
        this(i10, i11, false);
    }

    public l(int i10, int i11, boolean z10) {
        this.f366709a = 2;
        this.f366711c = false;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f366712d = byteArrayOutputStream;
        this.f366713e = new g(byteArrayOutputStream);
        this.f366714f = new byte[8];
        this.f366709a = i10;
        this.f366710b = i11;
        this.f366711c = z10;
        if (i10 < 2 || i10 > 3) {
            throw new IllegalArgumentException("Output dimension must be 2 or 3");
        }
    }
}
