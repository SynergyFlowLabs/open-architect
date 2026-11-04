package sm;

import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.o;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.util.m;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f376067i = "clampToGround ";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f376068j = "relativeToGround  ";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f376069k = "absolute";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f376070l = ",";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f376071m = " ";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f376077f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f376072a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f376073b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f376074c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f376075d = Double.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f376076e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f376078g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DecimalFormat f376079h = null;

    private static DecimalFormat a(int i10) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("0." + m.a('#', i10), decimalFormatSymbols);
        decimalFormat.setDecimalSeparatorAlwaysShown(false);
        return decimalFormat;
    }

    private String b(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<");
        stringBuffer.append(str);
        if (str2 != null && str2.length() > 0) {
            stringBuffer.append(" ");
            stringBuffer.append(str2);
        }
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    private void j(String str, int i10, StringBuffer stringBuffer) {
        String str2 = this.f376073b;
        if (str2 != null) {
            stringBuffer.append(str2);
        }
        stringBuffer.append(m.d(i10 * 2));
        stringBuffer.append(str);
    }

    private void l(double d10, StringBuffer stringBuffer) {
        DecimalFormat decimalFormat = this.f376079h;
        if (decimalFormat != null) {
            stringBuffer.append(decimalFormat.format(d10));
        } else {
            stringBuffer.append(d10);
        }
    }

    private void m(org.locationtech.jts.geom.a aVar, StringBuffer stringBuffer) {
        l(aVar.f338092a, stringBuffer);
        stringBuffer.append(f376070l);
        l(aVar.f338093b, stringBuffer);
        double d10 = aVar.f338094c;
        if (!Double.isNaN(this.f376075d)) {
            d10 = this.f376075d;
        }
        if (!Double.isNaN(d10)) {
            stringBuffer.append(f376070l);
            l(d10, stringBuffer);
        }
    }

    private void p(org.locationtech.jts.geom.a[] aVarArr, int i10, StringBuffer stringBuffer) {
        j("<coordinates>", i10, stringBuffer);
        int i11 = 0;
        boolean z10 = false;
        while (i11 < aVarArr.length) {
            if (i11 > 0) {
                stringBuffer.append(" ");
            }
            if (z10) {
                j("  ", i10, stringBuffer);
                z10 = false;
            }
            m(aVarArr[i11], stringBuffer);
            int i12 = i11 + 1;
            if (i12 % this.f376074c == 0 && i11 < aVarArr.length - 1) {
                stringBuffer.append("\n");
                z10 = true;
            }
            i11 = i12;
        }
        stringBuffer.append("</coordinates>\n");
    }

    public static String q(n nVar, double d10) {
        a aVar = new a();
        aVar.i(d10);
        return aVar.k(nVar);
    }

    public static String r(n nVar, double d10, int i10, boolean z10, String str) {
        a aVar = new a();
        aVar.i(d10);
        aVar.g(i10);
        aVar.d(z10);
        aVar.c(str);
        return aVar.k(nVar);
    }

    private void s(n nVar, int i10, StringBuffer stringBuffer) {
        if (nVar instanceof d0) {
            x((d0) nVar, "", i10, stringBuffer);
            return;
        }
        if (nVar instanceof x) {
            v((x) nVar, "", true, i10, stringBuffer);
            return;
        }
        if (nVar instanceof v) {
            u((v) nVar, "", i10, stringBuffer);
            return;
        }
        if (nVar instanceof e0) {
            y((e0) nVar, "", i10, stringBuffer);
        } else {
            if (nVar instanceof o) {
                t((o) nVar, "", i10, stringBuffer);
                return;
            }
            throw new IllegalArgumentException("Geometry type not supported: " + nVar.i0());
        }
    }

    private void t(o oVar, String str, int i10, StringBuffer stringBuffer) {
        j("<MultiGeometry>\n", i10, stringBuffer);
        for (int i11 = 0; i11 < oVar.l0(); i11++) {
            s(oVar.h0(i11), i10 + 1, stringBuffer);
        }
        j("</MultiGeometry>\n", i10, stringBuffer);
    }

    private void u(v vVar, String str, int i10, StringBuffer stringBuffer) {
        j(b(org.locationtech.jts.io.gml2.a.f338493k, str) + "\n", i10, stringBuffer);
        w(i10, stringBuffer);
        p(vVar.d0(), i10 + 1, stringBuffer);
        j("</LineString>\n", i10, stringBuffer);
    }

    private void v(x xVar, String str, boolean z10, int i10, StringBuffer stringBuffer) {
        j(b(org.locationtech.jts.io.gml2.a.f338494l, str) + "\n", i10, stringBuffer);
        if (z10) {
            w(i10, stringBuffer);
        }
        p(xVar.d0(), i10 + 1, stringBuffer);
        j("</LinearRing>\n", i10, stringBuffer);
    }

    private void w(int i10, StringBuffer stringBuffer) {
        if (this.f376076e) {
            j("<extrude>1</extrude>\n", i10, stringBuffer);
        }
        if (this.f376077f) {
            j("<tesselate>1</tesselate>\n", i10, stringBuffer);
        }
        if (this.f376078g != null) {
            j("<altitudeMode>" + this.f376078g + "</altitudeMode>\n", i10, stringBuffer);
        }
    }

    private void x(d0 d0Var, String str, int i10, StringBuffer stringBuffer) {
        j(b(org.locationtech.jts.io.gml2.a.f338492j, str) + "\n", i10, stringBuffer);
        w(i10, stringBuffer);
        p(new org.locationtech.jts.geom.a[]{d0Var.c0()}, i10 + 1, stringBuffer);
        j("</Point>\n", i10, stringBuffer);
    }

    private void y(e0 e0Var, String str, int i10, StringBuffer stringBuffer) {
        j(b(org.locationtech.jts.io.gml2.a.f338495m, str) + "\n", i10, stringBuffer);
        w(i10, stringBuffer);
        j("  <outerBoundaryIs>\n", i10, stringBuffer);
        int i11 = i10 + 1;
        StringBuffer stringBuffer2 = stringBuffer;
        v((x) e0Var.R0(), null, false, i11, stringBuffer2);
        j("  </outerBoundaryIs>\n", i10, stringBuffer2);
        for (int i12 = 0; i12 < e0Var.T0(); i12++) {
            j("  <innerBoundaryIs>\n", i10, stringBuffer2);
            int i13 = i11;
            StringBuffer stringBuffer3 = stringBuffer2;
            int i14 = 4 | 0;
            v((x) e0Var.S0(i12), null, false, i13, stringBuffer3);
            i11 = i13;
            stringBuffer2 = stringBuffer3;
            j("  </innerBoundaryIs>\n", i10, stringBuffer2);
        }
        j("</Polygon>\n", i10, stringBuffer2);
    }

    public void c(String str) {
        this.f376078g = str;
    }

    public void d(boolean z10) {
        this.f376076e = z10;
    }

    public void e(String str) {
        this.f376073b = str;
    }

    public void f(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.f376074c = i10;
    }

    public void g(int i10) {
        if (i10 >= 0) {
            this.f376079h = a(i10);
        }
    }

    public void h(boolean z10) {
        this.f376077f = z10;
    }

    public void i(double d10) {
        this.f376075d = d10;
    }

    public String k(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        o(nVar, stringBuffer);
        return stringBuffer.toString();
    }

    public void n(n nVar, Writer writer) throws IOException {
        writer.write(k(nVar));
    }

    public void o(n nVar, StringBuffer stringBuffer) {
        s(nVar, 0, stringBuffer);
    }
}
