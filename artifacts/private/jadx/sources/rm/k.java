package rm;

import java.io.IOException;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
public class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f366699j = "Invalid geometry type encountered in ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f366700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.g f366701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g0 f366702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f366703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f366704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f366705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f366706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f366707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double[] f366708i;

    public k() {
        this(new r());
    }

    public static byte[] a(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i10 = 0; i10 < str.length() / 2; i10++) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            if (i12 > str.length()) {
                throw new IllegalArgumentException("Hex string has odd length");
            }
            bArr[i10] = (byte) ((b(str.charAt(i11)) << 4) + ((byte) b(str.charAt(i12))));
        }
        return bArr;
    }

    private static int b(char c10) {
        int iDigit = Character.digit(c10, 16);
        if (iDigit >= 0) {
            return iDigit;
        }
        throw new IllegalArgumentException("Invalid hex digit: '" + c10 + "'");
    }

    private void e() throws IOException {
        for (int i10 = 0; i10 < this.f366703d; i10++) {
            if (i10 <= 1) {
                this.f366708i[i10] = this.f366702c.r(this.f366707h.b());
            } else {
                this.f366708i[i10] = this.f366707h.b();
            }
        }
    }

    private org.locationtech.jts.geom.e f(int i10) throws IOException {
        org.locationtech.jts.geom.e eVarC = this.f366701b.c(i10, this.f366703d);
        int iRg = eVarC.Rg();
        int i11 = this.f366703d;
        if (iRg > i11) {
            iRg = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            e();
            for (int i13 = 0; i13 < iRg; i13++) {
                eVarC.Ld(i12, i13, this.f366708i[i13]);
            }
        }
        return eVarC;
    }

    private org.locationtech.jts.geom.e g(int i10) throws IOException {
        org.locationtech.jts.geom.e eVarF = f(i10);
        if (this.f366706g) {
            return eVarF;
        }
        return (eVarF.size() == 0 || eVarF.size() >= 2) ? eVarF : org.locationtech.jts.geom.i.e(this.f366701b, eVarF, 2);
    }

    private org.locationtech.jts.geom.e h(int i10) throws IOException {
        org.locationtech.jts.geom.e eVarF = f(i10);
        return (this.f366706g || org.locationtech.jts.geom.i.g(eVarF)) ? eVarF : org.locationtech.jts.geom.i.d(this.f366701b, eVarF);
    }

    private org.locationtech.jts.geom.n i() throws h, IOException {
        org.locationtech.jts.geom.n nVarP;
        int i10;
        int i11;
        byte bA = this.f366707h.a();
        boolean z10 = true;
        if (bA == 1) {
            this.f366707h.f(2);
        } else if (bA == 0) {
            this.f366707h.f(1);
        } else if (this.f366706g) {
            throw new h("Unknown geometry byte order (not NDR or XDR): " + ((int) bA));
        }
        int iC = this.f366707h.c();
        int i12 = 65535 & iC;
        int i13 = i12 % 1000;
        this.f366703d = (((Integer.MIN_VALUE & iC) != 0 || (i11 = i12 / 1000) == 1 || i11 == 3) ? 1 : 0) + 2 + (((1073741824 & iC) != 0 || (i10 = i12 / 1000) == 2 || i10 == 3) ? 1 : 0);
        if ((iC & 536870912) == 0) {
            z10 = false;
        }
        this.f366704e = z10;
        int iC2 = z10 ? this.f366707h.c() : 0;
        double[] dArr = this.f366708i;
        if (dArr == null || dArr.length < this.f366703d) {
            this.f366708i = new double[this.f366703d];
        }
        switch (i13) {
            case 1:
                nVarP = p();
                break;
            case 2:
                nVarP = k();
                break;
            case 3:
                nVarP = q();
                break;
            case 4:
                nVarP = n();
                break;
            case 5:
                nVarP = m();
                break;
            case 6:
                nVarP = o();
                break;
            case 7:
                nVarP = j();
                break;
            default:
                throw new h("Unknown WKB type " + i13);
        }
        r(nVarP, iC2);
        return nVarP;
    }

    private org.locationtech.jts.geom.o j() throws h, IOException {
        int iC = this.f366707h.c();
        org.locationtech.jts.geom.n[] nVarArr = new org.locationtech.jts.geom.n[iC];
        for (int i10 = 0; i10 < iC; i10++) {
            nVarArr[i10] = i();
        }
        return this.f366700a.e(nVarArr);
    }

    private v k() throws IOException {
        return this.f366700a.g(g(this.f366707h.c()));
    }

    private x l() throws IOException {
        return this.f366700a.j(h(this.f366707h.c()));
    }

    private z m() throws h, IOException {
        int iC = this.f366707h.c();
        v[] vVarArr = new v[iC];
        for (int i10 = 0; i10 < iC; i10++) {
            org.locationtech.jts.geom.n nVarI = i();
            if (!(nVarI instanceof v)) {
                throw new h("Invalid geometry type encountered in MultiLineString");
            }
            vVarArr[i10] = (v) nVarI;
        }
        return this.f366700a.m(vVarArr);
    }

    private a0 n() throws h, IOException {
        int iC = this.f366707h.c();
        d0[] d0VarArr = new d0[iC];
        for (int i10 = 0; i10 < iC; i10++) {
            org.locationtech.jts.geom.n nVarI = i();
            if (!(nVarI instanceof d0)) {
                throw new h("Invalid geometry type encountered in MultiPoint");
            }
            d0VarArr[i10] = (d0) nVarI;
        }
        return this.f366700a.q(d0VarArr);
    }

    private b0 o() throws h, IOException {
        int iC = this.f366707h.c();
        e0[] e0VarArr = new e0[iC];
        for (int i10 = 0; i10 < iC; i10++) {
            org.locationtech.jts.geom.n nVarI = i();
            if (!(nVarI instanceof e0)) {
                throw new h("Invalid geometry type encountered in MultiPolygon");
            }
            e0VarArr[i10] = (e0) nVarI;
        }
        return this.f366700a.t(e0VarArr);
    }

    private d0 p() throws IOException {
        return this.f366700a.w(f(1));
    }

    private e0 q() throws IOException {
        int iC = this.f366707h.c();
        x[] xVarArr = iC > 1 ? new x[iC - 1] : null;
        x xVarL = l();
        for (int i10 = 0; i10 < iC - 1; i10++) {
            xVarArr[i10] = l();
        }
        return this.f366700a.B(xVarL, xVarArr);
    }

    private org.locationtech.jts.geom.n r(org.locationtech.jts.geom.n nVar, int i10) {
        if (i10 != 0) {
            nVar.I0(i10);
        }
        return nVar;
    }

    public org.locationtech.jts.geom.n c(d dVar) throws h, IOException {
        this.f366707h.e(dVar);
        return i();
    }

    public org.locationtech.jts.geom.n d(byte[] bArr) throws h {
        try {
            return c(new a(bArr));
        } catch (IOException e10) {
            throw new RuntimeException("Unexpected IOException caught: " + e10.getMessage());
        }
    }

    public k(r rVar) {
        this.f366703d = 2;
        this.f366704e = false;
        this.f366705f = 0;
        this.f366706g = false;
        this.f366707h = new b();
        this.f366700a = rVar;
        this.f366702c = rVar.F();
        this.f366701b = this.f366700a.D();
    }
}
