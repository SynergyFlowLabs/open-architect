package rm;

import com.facebook.appevents.p;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
public class o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f366733h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f366734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DecimalFormat f366735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f366736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f366737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f366738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f366739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f366740g;

    public o() {
        this.f366734a = 2;
        this.f366736c = false;
        this.f366737d = false;
        this.f366738e = 0;
        this.f366739f = -1;
        this.f366740g = "  ";
    }

    public static String A(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        return "LINESTRING ( " + aVar.f338092a + " " + aVar.f338093b + ", " + aVar2.f338092a + " " + aVar2.f338093b + " )";
    }

    public static String B(org.locationtech.jts.geom.e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LINESTRING ");
        if (eVar.size() == 0) {
            stringBuffer.append(" EMPTY");
        } else {
            stringBuffer.append("(");
            for (int i10 = 0; i10 < eVar.size(); i10++) {
                if (i10 > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(eVar.N5(i10) + " " + eVar.I3(i10));
            }
            stringBuffer.append(")");
        }
        return stringBuffer.toString();
    }

    public static String C(org.locationtech.jts.geom.a[] aVarArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LINESTRING ");
        if (aVarArr.length == 0) {
            stringBuffer.append(" EMPTY");
        } else {
            stringBuffer.append("(");
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                if (i10 > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(aVarArr[i10].f338092a + " " + aVarArr[i10].f338093b);
            }
            stringBuffer.append(")");
        }
        return stringBuffer.toString();
    }

    public static String D(org.locationtech.jts.geom.a aVar) {
        return "POINT ( " + aVar.f338092a + " " + aVar.f338093b + " )";
    }

    private void I(org.locationtech.jts.geom.n nVar, boolean z10, Writer writer) throws IOException {
        this.f366737d = z10;
        this.f366735b = t(nVar.n0());
        e(nVar, 0, writer);
    }

    private String J(double d10) {
        return this.f366735b.format(d10);
    }

    private void a(org.locationtech.jts.geom.a aVar, Writer writer) throws IOException {
        writer.write(J(aVar.f338092a) + " " + J(aVar.f338093b));
        if (this.f366734a < 3 || Double.isNaN(aVar.f338094c)) {
            return;
        }
        writer.write(" ");
        writer.write(J(aVar.f338094c));
    }

    private void b(org.locationtech.jts.geom.e eVar, int i10, Writer writer) throws IOException {
        writer.write(J(eVar.N5(i10)) + " " + J(eVar.I3(i10)));
        if (this.f366734a < 3 || eVar.Rg() < 3) {
            return;
        }
        double dIj = eVar.ij(i10, 3);
        if (Double.isNaN(dIj)) {
            return;
        }
        writer.write(" ");
        writer.write(J(dIj));
    }

    private void c(org.locationtech.jts.geom.o oVar, int i10, Writer writer) throws IOException {
        writer.write("GEOMETRYCOLLECTION ");
        d(oVar, i10, writer);
    }

    private void d(org.locationtech.jts.geom.o oVar, int i10, Writer writer) throws IOException {
        if (oVar.v0()) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        int i11 = i10;
        for (int i12 = 0; i12 < oVar.l0(); i12++) {
            if (i12 > 0) {
                writer.write(", ");
                i11 = i10 + 1;
            }
            e(oVar.h0(i12), i11, writer);
        }
        writer.write(")");
    }

    private void e(org.locationtech.jts.geom.n nVar, int i10, Writer writer) throws IOException {
        u(i10, writer);
        if (nVar instanceof d0) {
            d0 d0Var = (d0) nVar;
            o(d0Var.c0(), i10, writer, d0Var.n0());
            return;
        }
        if (nVar instanceof x) {
            h((x) nVar, i10, writer);
            return;
        }
        if (nVar instanceof v) {
            f((v) nVar, i10, writer);
            return;
        }
        if (nVar instanceof e0) {
            q((e0) nVar, i10, writer);
            return;
        }
        if (nVar instanceof a0) {
            k((a0) nVar, i10, writer);
            return;
        }
        if (nVar instanceof z) {
            i((z) nVar, i10, writer);
            return;
        }
        if (nVar instanceof b0) {
            m((b0) nVar, i10, writer);
            return;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            c((org.locationtech.jts.geom.o) nVar, i10, writer);
            return;
        }
        org.locationtech.jts.util.a.f("Unsupported Geometry implementation:" + nVar.getClass());
    }

    private void f(v vVar, int i10, Writer writer) throws IOException {
        writer.write("LINESTRING ");
        g(vVar, i10, false, writer);
    }

    private void g(v vVar, int i10, boolean z10, Writer writer) throws IOException {
        if (vVar.v0()) {
            writer.write("EMPTY");
            return;
        }
        if (z10) {
            u(i10, writer);
        }
        writer.write("(");
        for (int i11 = 0; i11 < vVar.m0(); i11++) {
            if (i11 > 0) {
                writer.write(", ");
                int i12 = this.f366739f;
                if (i12 > 0 && i11 % i12 == 0) {
                    u(i10 + 1, writer);
                }
            }
            a(vVar.R0(i11), writer);
        }
        writer.write(")");
    }

    private void h(x xVar, int i10, Writer writer) throws IOException {
        writer.write("LINEARRING ");
        g(xVar, i10, false, writer);
    }

    private void i(z zVar, int i10, Writer writer) throws IOException {
        writer.write("MULTILINESTRING ");
        j(zVar, i10, false, writer);
    }

    private void j(z zVar, int i10, boolean z10, Writer writer) throws IOException {
        if (zVar.v0()) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        int i11 = i10;
        for (int i12 = 0; i12 < zVar.l0(); i12++) {
            if (i12 > 0) {
                writer.write(", ");
                i11 = i10 + 1;
                z10 = true;
            }
            g((v) zVar.h0(i12), i11, z10, writer);
        }
        writer.write(")");
    }

    private void k(a0 a0Var, int i10, Writer writer) throws IOException {
        writer.write("MULTIPOINT ");
        l(a0Var, i10, writer);
    }

    private void l(a0 a0Var, int i10, Writer writer) throws IOException {
        if (a0Var.v0()) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        for (int i11 = 0; i11 < a0Var.l0(); i11++) {
            if (i11 > 0) {
                writer.write(", ");
                v(i11, i10 + 1, writer);
            }
            writer.write("(");
            a(((d0) a0Var.h0(i11)).c0(), writer);
            writer.write(")");
        }
        writer.write(")");
    }

    private void m(b0 b0Var, int i10, Writer writer) throws IOException {
        writer.write("MULTIPOLYGON ");
        n(b0Var, i10, writer);
    }

    private void n(b0 b0Var, int i10, Writer writer) throws IOException {
        if (b0Var.v0()) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < b0Var.l0(); i12++) {
            if (i12 > 0) {
                writer.write(", ");
                i11 = i10 + 1;
                z10 = true;
            }
            r((e0) b0Var.h0(i12), i11, z10, writer);
        }
        writer.write(")");
    }

    private void o(org.locationtech.jts.geom.a aVar, int i10, Writer writer, g0 g0Var) throws IOException {
        writer.write("POINT ");
        p(aVar, i10, writer, g0Var);
    }

    private void p(org.locationtech.jts.geom.a aVar, int i10, Writer writer, g0 g0Var) throws IOException {
        if (aVar == null) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        a(aVar, writer);
        writer.write(")");
    }

    private void q(e0 e0Var, int i10, Writer writer) throws IOException {
        writer.write("POLYGON ");
        r(e0Var, i10, false, writer);
    }

    private void r(e0 e0Var, int i10, boolean z10, Writer writer) throws IOException {
        if (e0Var.v0()) {
            writer.write("EMPTY");
            return;
        }
        if (z10) {
            u(i10, writer);
        }
        writer.write("(");
        g(e0Var.R0(), i10, false, writer);
        for (int i11 = 0; i11 < e0Var.T0(); i11++) {
            writer.write(", ");
            g(e0Var.S0(i11), i10 + 1, true, writer);
        }
        writer.write(")");
    }

    private void s(org.locationtech.jts.geom.e eVar, int i10, boolean z10, Writer writer) throws IOException {
        if (eVar.size() == 0) {
            writer.write("EMPTY");
            return;
        }
        if (z10) {
            u(i10, writer);
        }
        writer.write("(");
        for (int i11 = 0; i11 < eVar.size(); i11++) {
            if (i11 > 0) {
                writer.write(", ");
                int i12 = this.f366739f;
                if (i12 > 0 && i11 % i12 == 0) {
                    u(i10 + 1, writer);
                }
            }
            b(eVar, i11, writer);
        }
        writer.write(")");
    }

    private static DecimalFormat t(g0 g0Var) {
        int iK = g0Var.k();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p.f99189d0);
        sb2.append(iK > 0 ? "." : "");
        sb2.append(z('#', iK));
        return new DecimalFormat(sb2.toString(), decimalFormatSymbols);
    }

    private void u(int i10, Writer writer) throws IOException {
        if (this.f366737d && i10 > 0) {
            writer.write("\n");
            for (int i11 = 0; i11 < i10; i11++) {
                writer.write(this.f366740g);
            }
        }
    }

    private void v(int i10, int i11, Writer writer) throws IOException {
        int i12 = this.f366739f;
        if (i12 > 0 && i10 % i12 == 0) {
            u(i11, writer);
        }
    }

    public static String z(char c10, int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append(c10);
        }
        return stringBuffer.toString();
    }

    public String E(org.locationtech.jts.geom.n nVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            I(nVar, this.f366736c, stringWriter);
        } catch (IOException unused) {
            org.locationtech.jts.util.a.e();
        }
        return stringWriter.toString();
    }

    public void F(org.locationtech.jts.geom.n nVar, Writer writer) throws IOException {
        I(nVar, false, writer);
    }

    public String G(org.locationtech.jts.geom.n nVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            I(nVar, true, stringWriter);
        } catch (IOException unused) {
            org.locationtech.jts.util.a.e();
        }
        return stringWriter.toString();
    }

    public void H(org.locationtech.jts.geom.n nVar, Writer writer) throws IOException {
        I(nVar, true, writer);
    }

    public void w(boolean z10) {
        this.f366736c = z10;
    }

    public void x(int i10) {
        this.f366739f = i10;
    }

    public void y(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Tab count must be positive");
        }
        this.f366740g = z(' ', i10);
    }

    public o(int i10) {
        this.f366736c = false;
        this.f366737d = false;
        this.f366738e = 0;
        this.f366739f = -1;
        this.f366740g = "  ";
        this.f366734a = i10;
        if (i10 < 2 || i10 > 3) {
            throw new IllegalArgumentException("Invalid output dimension (must be 2 or 3)");
        }
    }
}
