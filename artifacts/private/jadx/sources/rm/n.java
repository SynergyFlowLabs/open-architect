package rm;

import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
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
public class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f366722f = "EMPTY";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f366723g = ",";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f366724h = "(";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f366725i = ")";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f366726j = "NaN";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f366727k = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f366728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f366729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StreamTokenizer f366730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f366731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f366732e;

    public n() {
        this(new r());
    }

    private org.locationtech.jts.geom.a[] a() throws h, IOException {
        if (e().equals(f366722f)) {
            return new org.locationtech.jts.geom.a[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        String strD = d();
        while (strD.equals(f366723g)) {
            arrayList.add(h());
            strD = d();
        }
        return (org.locationtech.jts.geom.a[]) arrayList.toArray(new org.locationtech.jts.geom.a[arrayList.size()]);
    }

    private org.locationtech.jts.geom.a[] b() throws h, IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        String strD = d();
        while (strD.equals(f366723g)) {
            arrayList.add(h());
            strD = d();
        }
        return (org.locationtech.jts.geom.a[]) arrayList.toArray(new org.locationtech.jts.geom.a[arrayList.size()]);
    }

    private String c() throws h, IOException {
        String strG = g();
        if (strG.equals(f366725i)) {
            return strG;
        }
        k(f366725i);
        return null;
    }

    private String d() throws h, IOException {
        String strG = g();
        if (strG.equals(f366723g) || strG.equals(f366725i)) {
            return strG;
        }
        k(", or )");
        return null;
    }

    private String e() throws h, IOException {
        String strG = g();
        if (strG.equalsIgnoreCase(org.locationtech.jts.io.gml2.a.f338505w)) {
            this.f366731d = true;
            strG = g();
        } else if (strG.equalsIgnoreCase("M")) {
            this.f366732e = true;
            strG = g();
        } else if (strG.equalsIgnoreCase("ZM")) {
            this.f366731d = true;
            this.f366732e = true;
            strG = g();
        }
        if (strG.equals(f366722f) || strG.equals(f366724h)) {
            return strG;
        }
        k("EMPTY or (");
        return null;
    }

    private double f() throws h, IOException {
        if (this.f366730c.nextToken() == -3) {
            if (this.f366730c.sval.equalsIgnoreCase(f366726j)) {
                return Double.NaN;
            }
            try {
                return Double.parseDouble(this.f366730c.sval);
            } catch (NumberFormatException unused) {
                l("Invalid number: " + this.f366730c.sval);
            }
        }
        k(AttributeType.NUMBER);
        return 0.0d;
    }

    private String g() throws h, IOException {
        int iNextToken = this.f366730c.nextToken();
        if (iNextToken == -3) {
            String str = this.f366730c.sval;
            return str.equalsIgnoreCase(f366722f) ? f366722f : str;
        }
        if (iNextToken == 44) {
            return f366723g;
        }
        if (iNextToken == 40) {
            return f366724h;
        }
        if (iNextToken == 41) {
            return f366725i;
        }
        k("word");
        return null;
    }

    private org.locationtech.jts.geom.a h() throws h, IOException {
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
        aVar.f338092a = f();
        aVar.f338093b = f();
        if (i()) {
            aVar.f338094c = f();
        }
        if (i()) {
            f();
        }
        this.f366729b.s(aVar);
        return aVar;
    }

    private boolean i() throws IOException {
        int iNextToken = this.f366730c.nextToken();
        this.f366730c.pushBack();
        return iNextToken == -3;
    }

    private String j() throws h, IOException {
        String strG = g();
        this.f366730c.pushBack();
        return strG;
    }

    private void k(String str) throws h {
        if (this.f366730c.ttype == -2) {
            org.locationtech.jts.util.a.f("Unexpected NUMBER token");
        }
        if (this.f366730c.ttype == 10) {
            org.locationtech.jts.util.a.f("Unexpected EOL token");
        }
        l("Expected " + str + " but found " + y());
    }

    private void l(String str) throws h {
        throw new h(str + " (line " + this.f366730c.lineno() + f366725i);
    }

    private org.locationtech.jts.geom.o o() throws h, IOException {
        if (e().equals(f366722f)) {
            return this.f366728a.e(new org.locationtech.jts.geom.n[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(p());
        String strD = d();
        while (strD.equals(f366723g)) {
            arrayList.add(p());
            strD = d();
        }
        return this.f366728a.e((org.locationtech.jts.geom.n[]) arrayList.toArray(new org.locationtech.jts.geom.n[arrayList.size()]));
    }

    private org.locationtech.jts.geom.n p() throws h, IOException {
        try {
            String upperCase = g().toUpperCase();
            if (upperCase.endsWith(org.locationtech.jts.io.gml2.a.f338505w)) {
                this.f366731d = true;
            }
            if (upperCase.endsWith("M")) {
                this.f366732e = true;
            }
            if (upperCase.startsWith("POINT")) {
                return v();
            }
            if (upperCase.startsWith("LINESTRING")) {
                return q();
            }
            if (upperCase.startsWith("LINEARRING")) {
                return r();
            }
            if (upperCase.startsWith("POLYGON")) {
                return w();
            }
            if (upperCase.startsWith("MULTIPOINT")) {
                return t();
            }
            if (upperCase.startsWith("MULTILINESTRING")) {
                return s();
            }
            if (upperCase.startsWith("MULTIPOLYGON")) {
                return u();
            }
            if (upperCase.startsWith("GEOMETRYCOLLECTION")) {
                return o();
            }
            l("Unknown geometry type: " + upperCase);
            return null;
        } catch (IOException | h unused) {
        }
    }

    private v q() throws h, IOException {
        return this.f366728a.h(a());
    }

    private x r() throws h, IOException {
        return this.f366728a.k(a());
    }

    private z s() throws h, IOException {
        if (e().equals(f366722f)) {
            return this.f366728a.m(new v[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(q());
        String strD = d();
        while (strD.equals(f366723g)) {
            arrayList.add(q());
            strD = d();
        }
        return this.f366728a.m((v[]) arrayList.toArray(new v[arrayList.size()]));
    }

    private a0 t() throws h, IOException {
        if (e().equals(f366722f)) {
            return this.f366728a.q(new d0[0]);
        }
        if (j() != f366724h) {
            return this.f366728a.q(x(b()));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(v());
        String strD = d();
        while (strD.equals(f366723g)) {
            arrayList.add(v());
            strD = d();
        }
        return this.f366728a.q((d0[]) arrayList.toArray(new d0[arrayList.size()]));
    }

    private b0 u() throws h, IOException {
        if (e().equals(f366722f)) {
            return this.f366728a.s();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(w());
        String strD = d();
        while (strD.equals(f366723g)) {
            arrayList.add(w());
            strD = d();
        }
        return this.f366728a.t((e0[]) arrayList.toArray(new e0[arrayList.size()]));
    }

    private d0 v() throws h, IOException {
        if (e().equals(f366722f)) {
            return this.f366728a.u();
        }
        d0 d0VarV = this.f366728a.v(h());
        c();
        return d0VarV;
    }

    private e0 w() throws h, IOException {
        if (e().equals(f366722f)) {
            r rVar = this.f366728a;
            return rVar.B(rVar.k(new org.locationtech.jts.geom.a[0]), new x[0]);
        }
        ArrayList arrayList = new ArrayList();
        x xVarR = r();
        String strD = d();
        while (strD.equals(f366723g)) {
            arrayList.add(r());
            strD = d();
        }
        return this.f366728a.B(xVarR, (x[]) arrayList.toArray(new x[arrayList.size()]));
    }

    private d0[] x(org.locationtech.jts.geom.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (org.locationtech.jts.geom.a aVar : aVarArr) {
            arrayList.add(this.f366728a.v(aVar));
        }
        return (d0[]) arrayList.toArray(new d0[0]);
    }

    private String y() {
        int i10 = this.f366730c.ttype;
        if (i10 == -3) {
            return "'" + this.f366730c.sval + "'";
        }
        if (i10 == -2) {
            return "<NUMBER>";
        }
        if (i10 == -1) {
            return "End-of-Stream";
        }
        if (i10 == 10) {
            return "End-of-Line";
        }
        return "'" + ((char) this.f366730c.ttype) + "'";
    }

    public org.locationtech.jts.geom.n m(Reader reader) throws h {
        StreamTokenizer streamTokenizer = new StreamTokenizer(reader);
        this.f366730c = streamTokenizer;
        streamTokenizer.resetSyntax();
        this.f366730c.wordChars(97, 122);
        this.f366730c.wordChars(65, 90);
        this.f366730c.wordChars(160, 255);
        this.f366730c.wordChars(48, 57);
        this.f366730c.wordChars(45, 45);
        this.f366730c.wordChars(43, 43);
        this.f366730c.wordChars(46, 46);
        this.f366730c.whitespaceChars(0, 32);
        this.f366730c.commentChar(35);
        this.f366731d = false;
        this.f366732e = false;
        try {
            return p();
        } catch (IOException e10) {
            throw new h(e10.toString());
        }
    }

    public org.locationtech.jts.geom.n n(String str) throws h {
        StringReader stringReader = new StringReader(str);
        try {
            org.locationtech.jts.geom.n nVarM = m(stringReader);
            stringReader.close();
            return nVarM;
        } catch (Throwable th2) {
            stringReader.close();
            throw th2;
        }
    }

    public n(r rVar) {
        this.f366728a = rVar;
        this.f366729b = rVar.F();
    }
}
