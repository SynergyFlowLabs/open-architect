package org.locationtech.jts.io.gml2;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.o;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f338514j = ",";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f338515k = " ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f338516a = "  ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338517b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338518c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338519d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338520e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f338521f = a.f338484b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f338522g = a.f338483a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f338523h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f338524i = null;

    public d() {
        int i10 = 7 & 0;
    }

    private void a(String str, Writer writer) throws IOException {
        writer.write("</" + b());
        writer.write(str);
        writer.write(">\n");
    }

    private String b() {
        String str = this.f338521f;
        if (str == null || str.length() == 0) {
            return "";
        }
        return this.f338521f + ":";
    }

    private void i(String str, n nVar, Writer writer) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        String str2 = this.f338521f;
        String str3 = "";
        if (str2 != null && !"".equals(str2)) {
            str3 = this.f338521f + ":";
        }
        sb2.append(str3);
        writer.write(sb2.toString());
        writer.write(str);
        o(nVar, writer);
        writer.write(">\n");
        p(nVar, writer);
        this.f338520e = false;
    }

    private void j(int i10, Writer writer) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            writer.write("  ");
        }
    }

    private void m(n nVar, Writer writer, int i10) throws IOException {
        this.f338520e = true;
        if (nVar instanceof d0) {
            w((d0) nVar, writer, i10);
        } else if (nVar instanceof v) {
            r((v) nVar, writer, i10);
        } else if (nVar instanceof e0) {
            x((e0) nVar, writer, i10);
        } else if (nVar instanceof a0) {
            u((a0) nVar, writer, i10);
        } else if (nVar instanceof z) {
            t((z) nVar, writer, i10);
        } else if (nVar instanceof b0) {
            v((b0) nVar, writer, i10);
        } else {
            if (!(nVar instanceof o)) {
                throw new IllegalArgumentException("Unhandled geometry type: " + nVar.i0());
            }
            q((o) nVar, writer, this.f338517b);
        }
        writer.flush();
    }

    private void n(org.locationtech.jts.geom.a[] aVarArr, Writer writer, int i10) throws IOException {
        boolean z10;
        j(i10, writer);
        i(a.f338501s, null, writer);
        boolean z11 = false;
        char c10 = 2;
        char c11 = (aVarArr.length <= 0 || Double.isNaN(aVarArr[0].f338094c)) ? (char) 2 : (char) 3;
        int i11 = 0;
        boolean z12 = true;
        while (i11 < aVarArr.length) {
            if (z12) {
                j(i10 + 1, writer);
                z12 = z11;
            }
            if (c11 == c10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                z10 = true;
                sb2.append(aVarArr[i11].f338092a);
                writer.write(sb2.toString());
                writer.write(f338514j);
                writer.write("" + aVarArr[i11].f338093b);
            } else {
                z10 = true;
                if (c11 == 3) {
                    writer.write("" + aVarArr[i11].f338092a);
                    writer.write(f338514j);
                    writer.write("" + aVarArr[i11].f338093b);
                    writer.write(f338514j);
                    writer.write("" + aVarArr[i11].f338094c);
                }
            }
            writer.write(" ");
            int i12 = i11 + 1;
            if (i12 % this.f338518c == 0 && i11 < aVarArr.length - 1) {
                writer.write("\n");
                z12 = z10;
            }
            i11 = i12;
            z11 = false;
            c10 = 2;
        }
        if (!z12) {
            writer.write("\n");
        }
        j(i10, writer);
        a(a.f338501s, writer);
    }

    private void o(n nVar, Writer writer) throws IOException {
        if (nVar != null && this.f338520e) {
            if (this.f338519d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" xmlns");
                String str = this.f338521f;
                String str2 = "";
                if (str != null && !"".equals(str)) {
                    str2 = ":" + this.f338521f;
                }
                sb2.append(str2);
                sb2.append("='");
                sb2.append(this.f338522g);
                sb2.append("'");
                writer.write(sb2.toString());
            }
            String str3 = this.f338523h;
            if (str3 != null && str3.length() > 0) {
                writer.write(" srsName='" + this.f338523h + "'");
            }
        }
    }

    private void p(n nVar, Writer writer) throws IOException {
        if (nVar != null && this.f338520e && this.f338524i != null) {
            int i10 = 0;
            while (true) {
                String[] strArr = this.f338524i;
                if (i10 >= strArr.length) {
                    break;
                }
                writer.write(strArr[i10]);
                writer.write("\n");
                i10++;
            }
        }
    }

    private void q(o oVar, Writer writer, int i10) throws IOException {
        j(i10, writer);
        i(a.f338497o, oVar, writer);
        for (int i11 = 0; i11 < oVar.l0(); i11++) {
            int i12 = i10 + 1;
            j(i12, writer);
            i(a.f338486d, null, writer);
            m(oVar.h0(i11), writer, i10 + 2);
            j(i12, writer);
            a(a.f338486d, writer);
        }
        j(i10, writer);
        a(a.f338497o, writer);
    }

    private void r(v vVar, Writer writer, int i10) throws IOException {
        j(i10, writer);
        i(a.f338493k, vVar, writer);
        n(vVar.d0(), writer, i10 + 1);
        j(i10, writer);
        a(a.f338493k, writer);
    }

    private void s(x xVar, Writer writer, int i10) throws IOException {
        j(i10, writer);
        i(a.f338494l, xVar, writer);
        n(xVar.d0(), writer, i10 + 1);
        j(i10, writer);
        a(a.f338494l, writer);
    }

    private void t(z zVar, Writer writer, int i10) throws IOException {
        j(i10, writer);
        i(a.f338499q, zVar, writer);
        for (int i11 = 0; i11 < zVar.l0(); i11++) {
            int i12 = i10 + 1;
            j(i12, writer);
            i(a.f338489g, null, writer);
            r((v) zVar.h0(i11), writer, i10 + 2);
            j(i12, writer);
            a(a.f338489g, writer);
        }
        j(i10, writer);
        a(a.f338499q, writer);
    }

    private void u(a0 a0Var, Writer writer, int i10) throws IOException {
        j(i10, writer);
        i(a.f338498p, a0Var, writer);
        for (int i11 = 0; i11 < a0Var.l0(); i11++) {
            int i12 = i10 + 1;
            j(i12, writer);
            i(a.f338487e, null, writer);
            w((d0) a0Var.h0(i11), writer, i10 + 2);
            j(i12, writer);
            a(a.f338487e, writer);
        }
        j(i10, writer);
        a(a.f338498p, writer);
    }

    private void v(b0 b0Var, Writer writer, int i10) throws IOException {
        j(i10, writer);
        i(a.f338500r, b0Var, writer);
        for (int i11 = 0; i11 < b0Var.l0(); i11++) {
            int i12 = i10 + 1;
            j(i12, writer);
            i(a.f338488f, null, writer);
            x((e0) b0Var.h0(i11), writer, i10 + 2);
            j(i12, writer);
            a(a.f338488f, writer);
        }
        j(i10, writer);
        a(a.f338500r, writer);
    }

    private void w(d0 d0Var, Writer writer, int i10) throws IOException {
        j(i10, writer);
        i(a.f338492j, d0Var, writer);
        n(new org.locationtech.jts.geom.a[]{d0Var.c0()}, writer, i10 + 1);
        j(i10, writer);
        a(a.f338492j, writer);
    }

    private void x(e0 e0Var, Writer writer, int i10) throws IOException {
        j(i10, writer);
        i(a.f338495m, e0Var, writer);
        int i11 = i10 + 1;
        j(i11, writer);
        i(a.f338490h, null, writer);
        int i12 = i10 + 2;
        s((x) e0Var.R0(), writer, i12);
        j(i11, writer);
        a(a.f338490h, writer);
        for (int i13 = 0; i13 < e0Var.T0(); i13++) {
            j(i11, writer);
            i(a.f338491i, null, writer);
            s((x) e0Var.S0(i13), writer, i12);
            j(i11, writer);
            a(a.f338491i, writer);
        }
        j(i10, writer);
        a(a.f338495m, writer);
    }

    public void c(String[] strArr) {
        this.f338524i = strArr;
    }

    public void d(int i10) {
        if (i10 < 1) {
            throw new IndexOutOfBoundsException("Invalid coordinate count per line, must be > 0");
        }
        this.f338518c = i10;
    }

    public void e(boolean z10) {
        this.f338519d = z10;
    }

    public void f(String str) {
        this.f338521f = str;
    }

    public void g(String str) {
        this.f338523h = str;
    }

    public void h(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f338517b = i10;
    }

    public String k(n nVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            l(nVar, stringWriter);
        } catch (IOException unused) {
            org.locationtech.jts.util.a.e();
        }
        return stringWriter.toString();
    }

    public void l(n nVar, Writer writer) throws IOException {
        m(nVar, writer, this.f338517b);
    }

    public d(boolean z10) {
        e(z10);
    }
}
