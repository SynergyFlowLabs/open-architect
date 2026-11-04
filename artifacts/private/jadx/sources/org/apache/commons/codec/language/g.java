package org.apache.commons.codec.language;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class g implements nk.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f335406b = "AEIOUY";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f335407c = {"GN", "KN", "PN", "WR", "PS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f335408d = {"L", "R", "N", "M", "B", "H", "F", androidx.exifinterface.media.a.Y4, androidx.exifinterface.media.a.U4, " "};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f335409e = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f335410f = {"L", androidx.exifinterface.media.a.f51379e5, "K", androidx.exifinterface.media.a.S4, "N", "M", "B", org.locationtech.jts.io.gml2.a.f338505w};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f335411a = 4;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final StringBuilder f335412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final StringBuilder f335413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f335414c;

        public a(int i10) {
            this.f335412a = new StringBuilder(g.this.n());
            this.f335413b = new StringBuilder(g.this.n());
            this.f335414c = i10;
        }

        public void a(char c10) {
            g(c10);
            e(c10);
        }

        public void b(char c10, char c11) {
            g(c10);
            e(c11);
        }

        public void c(String str) {
            h(str);
            f(str);
        }

        public void d(String str, String str2) {
            h(str);
            f(str2);
        }

        public void e(char c10) {
            if (this.f335413b.length() < this.f335414c) {
                this.f335413b.append(c10);
            }
        }

        public void f(String str) {
            int length = this.f335414c - this.f335413b.length();
            if (str.length() <= length) {
                this.f335413b.append(str);
            } else {
                this.f335413b.append(str.substring(0, length));
            }
        }

        public void g(char c10) {
            if (this.f335412a.length() < this.f335414c) {
                this.f335412a.append(c10);
            }
        }

        public void h(String str) {
            int length = this.f335414c - this.f335412a.length();
            if (str.length() <= length) {
                this.f335412a.append(str);
            } else {
                this.f335412a.append(str.substring(0, length));
            }
        }

        public String i() {
            return this.f335413b.toString();
        }

        public String j() {
            return this.f335412a.toString();
        }

        public boolean k() {
            return this.f335412a.length() >= this.f335414c && this.f335413b.length() >= this.f335414c;
        }
    }

    private int A(String str, a aVar, int i10, boolean z10) {
        if (k(str, i10 - 1, 3, "ISL", "YSL")) {
            return i10 + 1;
        }
        if (i10 == 0 && k(str, i10, 5, "SUGAR")) {
            aVar.b('X', 'S');
            return i10 + 1;
        }
        if (k(str, i10, 2, "SH")) {
            if (k(str, i10 + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
                aVar.a('S');
            } else {
                aVar.a('X');
            }
            return i10 + 2;
        }
        if (!k(str, i10, 3, "SIO", "SIA") && !k(str, i10, 4, "SIAN")) {
            if (i10 != 0 || !k(str, i10 + 1, 1, "M", "N", "L", androidx.exifinterface.media.a.U4)) {
                int i11 = i10 + 1;
                if (!k(str, i11, 1, org.locationtech.jts.io.gml2.a.f338505w)) {
                    if (k(str, i10, 2, "SC")) {
                        return B(str, aVar, i10);
                    }
                    if (i10 == str.length() - 1 && k(str, i10 - 2, 2, "AI", "OI")) {
                        aVar.e('S');
                    } else {
                        aVar.a('S');
                    }
                    return k(str, i11, 1, androidx.exifinterface.media.a.S4, org.locationtech.jts.io.gml2.a.f338505w) ? i10 + 2 : i11;
                }
            }
            aVar.b('S', 'X');
            int i12 = i10 + 1;
            return k(str, i12, 1, org.locationtech.jts.io.gml2.a.f338505w) ? i10 + 2 : i12;
        }
        if (z10) {
            aVar.a('S');
        } else {
            aVar.b('S', 'X');
        }
        return i10 + 3;
    }

    private int B(String str, a aVar, int i10) {
        int i11 = i10 + 2;
        if (b(str, i11) == 'H') {
            int i12 = i10 + 3;
            if (k(str, i12, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (k(str, i12, 2, "ER", "EN")) {
                    aVar.d(org.locationtech.jts.io.gml2.a.f338503u, "SK");
                } else {
                    aVar.c("SK");
                }
            } else if (i10 != 0 || K(b(str, 3)) || b(str, 3) == 'W') {
                aVar.a('X');
            } else {
                aVar.b('X', 'S');
            }
        } else if (k(str, i11, 1, "I", androidx.exifinterface.media.a.T4, org.locationtech.jts.io.gml2.a.f338504v)) {
            aVar.a('S');
        } else {
            aVar.c("SK");
        }
        return i10 + 3;
    }

    private int C(String str, a aVar, int i10) {
        if (k(str, i10, 4, "TION") || k(str, i10, 3, "TIA", "TCH")) {
            aVar.a('X');
            return i10 + 3;
        }
        if (!k(str, i10, 2, "TH") && !k(str, i10, 3, "TTH")) {
            aVar.a(org.locationtech.jts.geom.l.f338158h);
            int i11 = i10 + 1;
            return k(str, i11, 1, androidx.exifinterface.media.a.f51379e5, "D") ? i10 + 2 : i11;
        }
        int i12 = i10 + 2;
        if (k(str, i12, 2, "OM", "AM") || k(str, 0, 4, "VAN ", "VON ") || k(str, 0, 3, "SCH")) {
            aVar.a(org.locationtech.jts.geom.l.f338158h);
        } else {
            aVar.b(org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338158h);
        }
        return i12;
    }

    private int D(String str, a aVar, int i10) {
        if (k(str, i10, 2, "WR")) {
            aVar.a('R');
            return i10 + 2;
        }
        if (i10 == 0) {
            int i11 = i10 + 1;
            if (K(b(str, i11)) || k(str, i10, 2, "WH")) {
                if (K(b(str, i11))) {
                    aVar.b('A', org.locationtech.jts.geom.l.f338157g);
                } else {
                    aVar.a('A');
                }
                return i11;
            }
        }
        if ((i10 == str.length() - 1 && K(b(str, i10 - 1))) || k(str, i10 - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") || k(str, 0, 3, "SCH")) {
            aVar.e(org.locationtech.jts.geom.l.f338157g);
            return i10 + 1;
        }
        if (!k(str, i10, 4, "WICZ", "WITZ")) {
            return i10 + 1;
        }
        aVar.d("TS", "FX");
        return i10 + 4;
    }

    private int E(String str, a aVar, int i10) {
        if (i10 == 0) {
            aVar.a('S');
            return i10 + 1;
        }
        if (i10 != str.length() - 1 || (!k(str, i10 - 3, 3, "IAU", "EAU") && !k(str, i10 - 2, 2, "AU", "OU"))) {
            aVar.c("KS");
        }
        int i11 = i10 + 1;
        return k(str, i11, 1, "C", org.locationtech.jts.io.gml2.a.f338503u) ? i10 + 2 : i11;
    }

    private int F(String str, a aVar, int i10, boolean z10) {
        int i11 = i10 + 1;
        if (b(str, i11) == 'H') {
            aVar.a('J');
            return i10 + 2;
        }
        if (k(str, i11, 2, "ZO", "ZI", "ZA") || (z10 && i10 > 0 && b(str, i10 - 1) != 'T')) {
            aVar.d(androidx.exifinterface.media.a.S4, "TS");
        } else {
            aVar.a('S');
        }
        return b(str, i11) == 'Z' ? i10 + 2 : i11;
    }

    private boolean I(String str) {
        for (String str2 : f335407c) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean J(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.indexOf("CZ") > -1 || str.indexOf("WITZ") > -1;
    }

    private boolean K(char c10) {
        return f335406b.indexOf(c10) != -1;
    }

    private String c(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return null;
        }
        return strTrim.toUpperCase(Locale.ENGLISH);
    }

    private boolean d(String str, int i10) {
        if (k(str, i10, 4, "CHIA")) {
            return true;
        }
        if (i10 <= 1) {
            return false;
        }
        int i11 = i10 - 2;
        if (K(b(str, i11)) || !k(str, i10 - 1, 3, "ACH")) {
            return false;
        }
        char cB = b(str, i10 + 2);
        return !(cB == 'I' || cB == 'E') || k(str, i11, 6, "BACHER", "MACHER");
    }

    private boolean g(String str, int i10) {
        if (i10 != 0) {
            return false;
        }
        int i11 = i10 + 1;
        return (k(str, i11, 5, "HARAC", "HARIS") || k(str, i11, 3, "HOR", "HYM", "HIA", "HEM")) && !k(str, 0, 5, "CHORE");
    }

    private boolean h(String str, int i10) {
        if (!k(str, 0, 4, "VAN ", "VON ") && !k(str, 0, 3, "SCH") && !k(str, i10 - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
            int i11 = i10 + 2;
            if (!k(str, i11, 1, androidx.exifinterface.media.a.f51379e5, androidx.exifinterface.media.a.S4) && ((!k(str, i10 - 1, 1, androidx.exifinterface.media.a.X4, "O", "U", androidx.exifinterface.media.a.T4) && i10 != 0) || (!k(str, i11, 1, f335408d) && i10 + 1 != str.length() - 1))) {
                return false;
            }
        }
        return true;
    }

    private boolean i(String str, int i10) {
        if (i10 == str.length() - 3 && k(str, i10 - 1, 4, "ILLO", "ILLA", "ALLE")) {
            return true;
        }
        return (k(str, str.length() - 2, 2, "AS", "OS") || k(str, str.length() - 1, 1, androidx.exifinterface.media.a.X4, "O")) && k(str, i10 - 1, 4, "ALLE");
    }

    private boolean j(String str, int i10) {
        int i11 = i10 + 1;
        if (b(str, i11) == 'M') {
            return true;
        }
        if (k(str, i10 - 1, 3, "UMB")) {
            return i11 == str.length() - 1 || k(str, i10 + 2, 2, "ER");
        }
        return false;
    }

    protected static boolean k(String str, int i10, int i11, String... strArr) {
        int i12;
        if (i10 >= 0 && (i12 = i11 + i10) <= str.length()) {
            String strSubstring = str.substring(i10, i12);
            for (String str2 : strArr) {
                if (strSubstring.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int o(a aVar, int i10) {
        if (i10 == 0) {
            aVar.a('A');
        }
        return i10 + 1;
    }

    private int p(String str, a aVar, int i10) {
        if (d(str, i10)) {
            aVar.a('K');
            return i10 + 2;
        }
        if (i10 == 0 && k(str, i10, 6, "CAESAR")) {
            aVar.a('S');
            return i10 + 2;
        }
        if (k(str, i10, 2, "CH")) {
            return r(str, aVar, i10);
        }
        if (k(str, i10, 2, "CZ") && !k(str, i10 - 2, 4, "WICZ")) {
            aVar.b('S', 'X');
            return i10 + 2;
        }
        int i11 = i10 + 1;
        if (k(str, i11, 3, "CIA")) {
            aVar.a('X');
            return i10 + 3;
        }
        if (k(str, i10, 2, "CC") && (i10 != 1 || b(str, 0) != 'M')) {
            return q(str, aVar, i10);
        }
        if (k(str, i10, 2, "CK", "CG", "CQ")) {
            aVar.a('K');
            return i10 + 2;
        }
        if (k(str, i10, 2, "CI", "CE", "CY")) {
            if (k(str, i10, 3, "CIO", "CIE", "CIA")) {
                aVar.b('S', 'X');
            } else {
                aVar.a('S');
            }
            return i10 + 2;
        }
        aVar.a('K');
        if (k(str, i11, 2, " C", " Q", " G")) {
            return i10 + 3;
        }
        return (!k(str, i11, 1, "C", "K", "Q") || k(str, i11, 2, "CE", "CI")) ? i11 : i10 + 2;
    }

    private int q(String str, a aVar, int i10) {
        int i11 = i10 + 2;
        if (!k(str, i11, 1, "I", androidx.exifinterface.media.a.T4, "H") || k(str, i11, 2, "HU")) {
            aVar.a('K');
            return i11;
        }
        if ((i10 == 1 && b(str, i10 - 1) == 'A') || k(str, i10 - 1, 5, "UCCEE", "UCCES")) {
            aVar.c("KS");
        } else {
            aVar.a('X');
        }
        return i10 + 3;
    }

    private int r(String str, a aVar, int i10) {
        if (i10 > 0 && k(str, i10, 4, "CHAE")) {
            aVar.b('K', 'X');
        } else {
            if (!g(str, i10) && !h(str, i10)) {
                if (i10 <= 0) {
                    aVar.a('X');
                } else if (k(str, 0, 2, "MC")) {
                    aVar.a('K');
                } else {
                    aVar.b('X', 'K');
                }
                return i10 + 2;
            }
            aVar.a('K');
        }
        return i10 + 2;
    }

    private int s(String str, a aVar, int i10) {
        if (!k(str, i10, 2, "DG")) {
            if (k(str, i10, 2, "DT", "DD")) {
                aVar.a(org.locationtech.jts.geom.l.f338158h);
                return i10 + 2;
            }
            aVar.a(org.locationtech.jts.geom.l.f338158h);
            return i10 + 1;
        }
        int i11 = i10 + 2;
        if (k(str, i11, 1, "I", androidx.exifinterface.media.a.T4, org.locationtech.jts.io.gml2.a.f338504v)) {
            aVar.a('J');
            return i10 + 3;
        }
        aVar.c("TK");
        return i11;
    }

    private int t(String str, a aVar, int i10, boolean z10) {
        int i11 = i10 + 1;
        if (b(str, i11) == 'H') {
            return u(str, aVar, i10);
        }
        if (b(str, i11) == 'N') {
            if (i10 == 1 && K(b(str, 0)) && !z10) {
                aVar.d("KN", "N");
            } else if (k(str, i10 + 2, 2, "EY") || b(str, i11) == 'Y' || z10) {
                aVar.c("KN");
            } else {
                aVar.d("N", "KN");
            }
            return i10 + 2;
        }
        if (k(str, i11, 2, "LI") && !z10) {
            aVar.d("KL", "L");
            return i10 + 2;
        }
        if (i10 == 0 && (b(str, i11) == 'Y' || k(str, i11, 2, f335409e))) {
            aVar.b('K', 'J');
            return i10 + 2;
        }
        if ((k(str, i11, 2, "ER") || b(str, i11) == 'Y') && !k(str, 0, 6, "DANGER", "RANGER", "MANGER")) {
            int i12 = i10 - 1;
            if (!k(str, i12, 1, androidx.exifinterface.media.a.T4, "I") && !k(str, i12, 3, "RGY", "OGY")) {
                aVar.b('K', 'J');
                return i10 + 2;
            }
        }
        if (!k(str, i11, 1, androidx.exifinterface.media.a.T4, "I", org.locationtech.jts.io.gml2.a.f338504v) && !k(str, i10 - 1, 4, "AGGI", "OGGI")) {
            if (b(str, i11) != 'G') {
                aVar.a('K');
                return i11;
            }
            int i13 = i10 + 2;
            aVar.a('K');
            return i13;
        }
        if (k(str, 0, 4, "VAN ", "VON ") || k(str, 0, 3, "SCH") || k(str, i11, 2, "ET")) {
            aVar.a('K');
        } else if (k(str, i11, 3, "IER")) {
            aVar.a('J');
        } else {
            aVar.b('J', 'K');
        }
        return i10 + 2;
    }

    private int u(String str, a aVar, int i10) {
        if (i10 > 0 && !K(b(str, i10 - 1))) {
            aVar.a('K');
            return i10 + 2;
        }
        if (i10 == 0) {
            int i11 = i10 + 2;
            if (b(str, i11) == 'I') {
                aVar.a('J');
            } else {
                aVar.a('K');
            }
            return i11;
        }
        if ((i10 > 1 && k(str, i10 - 2, 1, "B", "H", "D")) || ((i10 > 2 && k(str, i10 - 3, 1, "B", "H", "D")) || (i10 > 3 && k(str, i10 - 4, 1, "B", "H")))) {
            return i10 + 2;
        }
        if (i10 > 2 && b(str, i10 - 1) == 'U' && k(str, i10 - 3, 1, "C", "G", "L", "R", androidx.exifinterface.media.a.f51379e5)) {
            aVar.a(org.locationtech.jts.geom.l.f338157g);
        } else if (i10 > 0 && b(str, i10 - 1) != 'I') {
            aVar.a('K');
        }
        return i10 + 2;
    }

    private int v(String str, a aVar, int i10) {
        if ((i10 != 0 && !K(b(str, i10 - 1))) || !K(b(str, i10 + 1))) {
            return i10 + 1;
        }
        aVar.a('H');
        return i10 + 2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    private int w(String str, a aVar, int i10, boolean z10) {
        if (!k(str, i10, 4, "JOSE") && !k(str, 0, 4, "SAN ")) {
            if (i10 != 0 || k(str, i10, 4, "JOSE")) {
                int i11 = i10 - 1;
                if (K(b(str, i11)) && !z10) {
                    int i12 = i10 + 1;
                    if (b(str, i12) == 'A' || b(str, i12) == 'O') {
                        aVar.b('J', 'H');
                    } else if (i10 == str.length() - 1) {
                        aVar.b('J', ' ');
                    } else if (!k(str, i10 + 1, 1, f335410f)) {
                        aVar.a('J');
                    }
                } else if (i10 == str.length() - 1) {
                    aVar.b('J', ' ');
                } else if (!k(str, i10 + 1, 1, f335410f) && !k(str, i11, 1, androidx.exifinterface.media.a.S4, "K", "L")) {
                    aVar.a('J');
                }
            } else {
                aVar.b('J', 'A');
            }
            int i13 = i10 + 1;
            return b(str, i13) == 'J' ? i10 + 2 : i13;
        }
        if ((i10 == 0 && b(str, i10 + 4) == ' ') || str.length() == 4 || k(str, 0, 4, "SAN ")) {
            aVar.a('H');
        } else {
            aVar.b('J', 'H');
        }
        return i10 + 1;
    }

    private int x(String str, a aVar, int i10) {
        int i11 = i10 + 1;
        if (b(str, i11) != 'L') {
            aVar.a('L');
            return i11;
        }
        if (i(str, i10)) {
            aVar.g('L');
        } else {
            aVar.a('L');
        }
        return i10 + 2;
    }

    private int y(String str, a aVar, int i10) {
        int i11 = i10 + 1;
        if (b(str, i11) == 'H') {
            aVar.a(org.locationtech.jts.geom.l.f338157g);
            return i10 + 2;
        }
        aVar.a('P');
        return k(str, i11, 1, "P", "B") ? i10 + 2 : i11;
    }

    private int z(String str, a aVar, int i10, boolean z10) {
        if (i10 != str.length() - 1 || z10 || !k(str, i10 - 2, 2, "IE") || k(str, i10 - 4, 2, "ME", "MA")) {
            aVar.a('R');
        } else {
            aVar.e('R');
        }
        int i11 = i10 + 1;
        return b(str, i11) == 'R' ? i10 + 2 : i11;
    }

    public boolean G(String str, String str2) {
        return H(str, str2, false);
    }

    public boolean H(String str, String str2, boolean z10) {
        return org.apache.commons.codec.binary.m.a(m(str, z10), m(str2, z10));
    }

    public void L(int i10) {
        this.f335411a = i10;
    }

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return l((String) obj);
        }
        throw new nk.h("DoubleMetaphone encode parameter is not of type String");
    }

    protected char b(String str, int i10) {
        if (i10 >= 0 && i10 < str.length()) {
            return str.charAt(i10);
        }
        return (char) 0;
    }

    @Override // nk.j
    public String f(String str) {
        return l(str);
    }

    public String l(String str) {
        return m(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.apache.commons.codec.language.g] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    public String m(String str, boolean z10) {
        int i10;
        ?? C = c(str);
        if (C == 0) {
            return null;
        }
        boolean zJ = J(C);
        ?? I = I(C);
        a aVar = new a(n());
        while (!aVar.k() && I <= C.length() - 1) {
            char cCharAt = C.charAt(I);
            if (cCharAt == 199) {
                aVar.a('S');
            } else if (cCharAt != 209) {
                switch (cCharAt) {
                    case 'A':
                    case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                    case com.planner5d.library.engine.input.f.b.f160725s /* 73 */:
                    case com.planner5d.library.engine.input.f.b.X /* 79 */:
                    case 'U':
                    case 'Y':
                        I = o(aVar, I);
                        break;
                    case 'B':
                        aVar.a('P');
                        i10 = I + 1;
                        I = b(C, i10) != 'B' ? i10 : I + 2;
                        break;
                    case 'C':
                        I = p(C, aVar, I);
                        break;
                    case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        I = s(C, aVar, I);
                        break;
                    case 'F':
                        aVar.a(org.locationtech.jts.geom.l.f338157g);
                        i10 = I + 1;
                        if (b(C, i10) != 'F') {
                        }
                        break;
                    case 'G':
                        I = t(C, aVar, I, zJ);
                        break;
                    case 'H':
                        I = v(C, aVar, I);
                        break;
                    case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                        I = w(C, aVar, I, zJ);
                        break;
                    case 'K':
                        aVar.a('K');
                        i10 = I + 1;
                        if (b(C, i10) != 'K') {
                        }
                        break;
                    case 'L':
                        I = x(C, aVar, I);
                        break;
                    case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                        aVar.a(ni.f.f333370g);
                        if (!j(C, I)) {
                        }
                        break;
                    case 'N':
                        aVar.a('N');
                        i10 = I + 1;
                        if (b(C, i10) != 'N') {
                        }
                        break;
                    case 'P':
                        I = y(C, aVar, I);
                        break;
                    case com.planner5d.library.engine.input.f.b.f160732u0 /* 81 */:
                        aVar.a('K');
                        i10 = I + 1;
                        if (b(C, i10) != 'Q') {
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160705l0 /* 82 */:
                        I = z(C, aVar, I, zJ);
                        break;
                    case com.planner5d.library.engine.input.f.b.f160717p0 /* 83 */:
                        I = A(C, aVar, I, zJ);
                        break;
                    case com.planner5d.library.engine.input.f.b.B0 /* 84 */:
                        I = C(C, aVar, I);
                        break;
                    case com.planner5d.library.engine.input.f.b.f160702k0 /* 86 */:
                        aVar.a(org.locationtech.jts.geom.l.f338157g);
                        i10 = I + 1;
                        if (b(C, i10) != 'V') {
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160690g0 /* 87 */:
                        I = D(C, aVar, I);
                        break;
                    case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                        I = E(C, aVar, I);
                        break;
                    case 'Z':
                        I = F(C, aVar, I, zJ);
                        break;
                    default:
                        break;
                }
            } else {
                aVar.a('N');
            }
            I++;
        }
        return z10 ? aVar.i() : aVar.j();
    }

    public int n() {
        return this.f335411a;
    }
}
