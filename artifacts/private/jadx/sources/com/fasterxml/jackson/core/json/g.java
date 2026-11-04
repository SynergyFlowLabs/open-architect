package com.fasterxml.jackson.core.json;

import com.facebook.internal.z0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.s;
import com.fasterxml.jackson.core.util.n;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes4.dex */
public class g extends com.fasterxml.jackson.core.base.b {

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    protected static final int f102566v4 = JsonParser.a.ALLOW_TRAILING_COMMA.o();

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    protected static final int[] f102567w4 = com.fasterxml.jackson.core.io.a.g();

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    protected Reader f102568l4;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    protected char[] f102569m4;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    protected boolean f102570n4;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    protected q f102571o4;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.sym.b f102572p4;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    protected final int f102573q4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    protected boolean f102574r4;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    protected long f102575s4;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    protected int f102576t4;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    protected int f102577u4;

    public g(com.fasterxml.jackson.core.io.d dVar, int i10, Reader reader, q qVar, com.fasterxml.jackson.core.sym.b bVar, char[] cArr, int i11, int i12, boolean z10) {
        super(dVar, i10);
        this.f102568l4 = reader;
        this.f102569m4 = cArr;
        this.M3 = i11;
        this.N3 = i12;
        this.f102571o4 = qVar;
        this.f102572p4 = bVar;
        this.f102573q4 = bVar.r();
        this.f102570n4 = z10;
    }

    private final int H6() throws IOException {
        while (true) {
            if (this.M3 >= this.N3 && !X5()) {
                throw f("Unexpected end-of-input within/between " + this.U3.q() + " entries");
            }
            char[] cArr = this.f102569m4;
            int i10 = this.M3;
            int i11 = i10 + 1;
            this.M3 = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    S6();
                } else if (c10 != '#' || !Y6()) {
                    return c10;
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this.P3++;
                    this.Q3 = i11;
                } else if (c10 == '\r') {
                    L6();
                } else if (c10 != '\t') {
                    b4(c10);
                }
            }
        }
    }

    private void I6() throws IOException {
        while (true) {
            if (this.M3 >= this.N3 && !X5()) {
                break;
            }
            char[] cArr = this.f102569m4;
            int i10 = this.M3;
            int i11 = i10 + 1;
            this.M3 = i11;
            char c10 = cArr[i10];
            if (c10 <= '*') {
                if (c10 == '*') {
                    if (i11 >= this.N3 && !X5()) {
                        break;
                    }
                    char[] cArr2 = this.f102569m4;
                    int i12 = this.M3;
                    if (cArr2[i12] == '/') {
                        this.M3 = i12 + 1;
                        return;
                    }
                } else if (c10 < ' ') {
                    if (c10 == '\n') {
                        this.P3++;
                        this.Q3 = i11;
                    } else if (c10 == '\r') {
                        L6();
                    } else if (c10 != '\t') {
                        b4(c10);
                    }
                }
            }
        }
        N3(" in a comment", null);
    }

    private final int M6() throws IOException {
        int i10 = this.M3;
        if (i10 + 4 >= this.N3) {
            return N6(false);
        }
        char[] cArr = this.f102569m4;
        char c10 = cArr[i10];
        if (c10 == ':') {
            int i11 = i10 + 1;
            this.M3 = i11;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (c11 == '/' || c11 == '#') {
                    return N6(true);
                }
                this.M3 = i10 + 2;
                return c11;
            }
            if (c11 == ' ' || c11 == '\t') {
                int i12 = i10 + 2;
                this.M3 = i12;
                char c12 = cArr[i12];
                if (c12 > ' ') {
                    if (c12 == '/' || c12 == '#') {
                        return N6(true);
                    }
                    this.M3 = i10 + 3;
                    return c12;
                }
            }
            return N6(true);
        }
        if (c10 == ' ' || c10 == '\t') {
            int i13 = i10 + 1;
            this.M3 = i13;
            c10 = cArr[i13];
        }
        if (c10 != ':') {
            return N6(false);
        }
        int i14 = this.M3;
        int i15 = i14 + 1;
        this.M3 = i15;
        char c13 = cArr[i15];
        if (c13 > ' ') {
            if (c13 == '/' || c13 == '#') {
                return N6(true);
            }
            this.M3 = i14 + 2;
            return c13;
        }
        if (c13 == ' ' || c13 == '\t') {
            int i16 = i14 + 2;
            this.M3 = i16;
            char c14 = cArr[i16];
            if (c14 > ' ') {
                if (c14 != '/' && c14 != '#') {
                    this.M3 = i14 + 3;
                    return c14;
                }
                return N6(true);
            }
        }
        return N6(true);
    }

    private final int N6(boolean z10) throws IOException {
        while (true) {
            if (this.M3 >= this.N3 && !X5()) {
                N3(" within/between " + this.U3.q() + " entries", null);
                return -1;
            }
            char[] cArr = this.f102569m4;
            int i10 = this.M3;
            int i11 = i10 + 1;
            this.M3 = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    S6();
                } else if (c10 != '#' || !Y6()) {
                    if (z10) {
                        return c10;
                    }
                    if (c10 != ':') {
                        V3(c10, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this.P3++;
                    this.Q3 = i11;
                } else if (c10 == '\r') {
                    L6();
                } else if (c10 != '\t') {
                    b4(c10);
                }
            }
        }
    }

    private final int P6(int i10) throws IOException {
        char[] cArr = this.f102569m4;
        int i11 = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == ':') {
            int i12 = i10 + 2;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (c11 != '/' && c11 != '#') {
                    this.M3 = i12;
                    return c11;
                }
            } else if (c11 == ' ' || c11 == '\t') {
                int i13 = i10 + 3;
                char c12 = cArr[i12];
                if (c12 > ' ' && c12 != '/' && c12 != '#') {
                    this.M3 = i13;
                    return c12;
                }
                i12 = i13;
            }
            this.M3 = i12 - 1;
            return N6(true);
        }
        if (c10 == ' ' || c10 == '\t') {
            c10 = cArr[i11];
            i11 = i10 + 2;
        }
        boolean z10 = c10 == ':';
        if (z10) {
            int i14 = i11 + 1;
            char c13 = cArr[i11];
            if (c13 > ' ') {
                if (c13 != '/' && c13 != '#') {
                    this.M3 = i14;
                    return c13;
                }
            } else if (c13 == ' ' || c13 == '\t') {
                i11 += 2;
                char c14 = cArr[i14];
                if (c14 > ' ' && c14 != '/' && c14 != '#') {
                    this.M3 = i11;
                    return c14;
                }
            }
            i11 = i14;
        }
        this.M3 = i11 - 1;
        return N6(z10);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x006f A[SYNTHETIC] */
    private String R5(int i10, int i11, int[] iArr) throws IOException {
        int i12;
        this.W3.E(this.f102569m4, i10, this.M3 - i10);
        char[] cArrU = this.W3.u();
        int iV = this.W3.v();
        int length = iArr.length;
        while (true) {
            if (this.M3 >= this.N3 && !X5()) {
                break;
            }
            char c10 = this.f102569m4[this.M3];
            if (c10 <= length) {
                if (iArr[c10] != 0) {
                    break;
                }
                this.M3++;
                i11 = (i11 * 33) + c10;
                i12 = iV + 1;
                cArrU[iV] = c10;
                if (i12 >= cArrU.length) {
                    cArrU = this.W3.s();
                    iV = 0;
                } else {
                    iV = i12;
                }
            } else {
                if (!Character.isJavaIdentifierPart(c10)) {
                    break;
                }
                this.M3++;
                i11 = (i11 * 33) + c10;
                i12 = iV + 1;
                cArrU[iV] = c10;
                if (i12 >= cArrU.length) {
                    cArrU = this.W3.s();
                    iV = 0;
                } else {
                    iV = i12;
                }
            }
        }
        this.W3.I(iV);
        n nVar = this.W3;
        return this.f102572p4.q(nVar.w(), nVar.x(), nVar.J(), i11);
    }

    private final int R6(int i10) throws IOException {
        if (i10 != 44) {
            V3(i10, "was expecting comma to separate " + this.U3.q() + " entries");
        }
        while (true) {
            int i11 = this.M3;
            if (i11 >= this.N3) {
                return H6();
            }
            char[] cArr = this.f102569m4;
            int i12 = i11 + 1;
            this.M3 = i12;
            char c10 = cArr[i11];
            if (c10 > ' ') {
                if (c10 != '/' && c10 != '#') {
                    return c10;
                }
                this.M3 = i11;
                return H6();
            }
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this.P3++;
                    this.Q3 = i12;
                } else if (c10 == '\r') {
                    L6();
                } else if (c10 != '\t') {
                    b4(c10);
                }
            }
        }
    }

    private void S6() throws IOException {
        if (!p2(JsonParser.a.ALLOW_COMMENTS)) {
            V3(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.M3 >= this.N3 && !X5()) {
            N3(" in a comment", null);
        }
        char[] cArr = this.f102569m4;
        int i10 = this.M3;
        this.M3 = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '/') {
            T6();
        } else if (c10 == '*') {
            I6();
        } else {
            V3(c10, "was expecting either '*' or '/' for a comment");
        }
    }

    private void T6() throws IOException {
        while (true) {
            if (this.M3 >= this.N3 && !X5()) {
                return;
            }
            char[] cArr = this.f102569m4;
            int i10 = this.M3;
            int i11 = i10 + 1;
            this.M3 = i11;
            char c10 = cArr[i10];
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this.P3++;
                    this.Q3 = i11;
                    return;
                } else if (c10 == '\r') {
                    L6();
                    return;
                } else if (c10 != '\t') {
                    b4(c10);
                }
            }
        }
    }

    private final void W5(int i10) throws IOException {
        this.f102294g = com.fasterxml.jackson.core.n.FIELD_NAME;
        Z6();
        if (i10 == 34) {
            this.f102574r4 = true;
            this.V3 = com.fasterxml.jackson.core.n.VALUE_STRING;
            return;
        }
        if (i10 == 45) {
            this.V3 = x6();
            return;
        }
        if (i10 == 91) {
            this.V3 = com.fasterxml.jackson.core.n.START_ARRAY;
            return;
        }
        if (i10 == 102) {
            e6("false", 1);
            this.V3 = com.fasterxml.jackson.core.n.VALUE_FALSE;
            return;
        }
        if (i10 == 110) {
            e6(AbstractJsonLexerKt.NULL, 1);
            this.V3 = com.fasterxml.jackson.core.n.VALUE_NULL;
            return;
        }
        if (i10 == 116) {
            e6(z0.P, 1);
            this.V3 = com.fasterxml.jackson.core.n.VALUE_TRUE;
        } else {
            if (i10 == 123) {
                this.V3 = com.fasterxml.jackson.core.n.START_OBJECT;
                return;
            }
            switch (i10) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    this.V3 = A6(i10);
                    break;
                default:
                    this.V3 = S5(i10);
                    break;
            }
        }
    }

    private final int W6() throws IOException {
        if (this.M3 >= this.N3 && !X5()) {
            return C4();
        }
        char[] cArr = this.f102569m4;
        int i10 = this.M3;
        int i11 = i10 + 1;
        this.M3 = i11;
        char c10 = cArr[i10];
        if (c10 > ' ') {
            if (c10 != '/' && c10 != '#') {
                return c10;
            }
            this.M3 = i10;
            return X6();
        }
        if (c10 != ' ') {
            if (c10 == '\n') {
                this.P3++;
                this.Q3 = i11;
            } else if (c10 == '\r') {
                L6();
            } else if (c10 != '\t') {
                b4(c10);
            }
        }
        while (true) {
            int i12 = this.M3;
            if (i12 >= this.N3) {
                return X6();
            }
            char[] cArr2 = this.f102569m4;
            int i13 = i12 + 1;
            this.M3 = i13;
            char c11 = cArr2[i12];
            if (c11 > ' ') {
                if (c11 != '/' && c11 != '#') {
                    return c11;
                }
                this.M3 = i12;
                return X6();
            }
            if (c11 != ' ') {
                if (c11 == '\n') {
                    this.P3++;
                    this.Q3 = i13;
                } else if (c11 == '\r') {
                    L6();
                } else if (c11 != '\t') {
                    b4(c11);
                }
            }
        }
    }

    private int X6() throws IOException {
        while (true) {
            if (this.M3 >= this.N3 && !X5()) {
                return C4();
            }
            char[] cArr = this.f102569m4;
            int i10 = this.M3;
            int i11 = i10 + 1;
            this.M3 = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    S6();
                } else if (c10 != '#' || !Y6()) {
                    return c10;
                }
            } else if (c10 != ' ') {
                if (c10 == '\n') {
                    this.P3++;
                    this.Q3 = i11;
                } else if (c10 == '\r') {
                    L6();
                } else if (c10 != '\t') {
                    b4(c10);
                }
            }
        }
    }

    private boolean Y6() throws IOException {
        if (!p2(JsonParser.a.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        T6();
        return true;
    }

    private final void Z6() {
        int i10 = this.M3;
        this.R3 = this.O3 + ((long) i10);
        this.S3 = this.P3;
        this.T3 = i10 - this.Q3;
    }

    private final void b6() throws IOException {
        int i10;
        char c10;
        int i11 = this.M3;
        if (i11 + 4 < this.N3) {
            char[] cArr = this.f102569m4;
            if (cArr[i11] == 'a' && cArr[i11 + 1] == 'l' && cArr[i11 + 2] == 's' && cArr[i11 + 3] == 'e' && ((c10 = cArr[(i10 = i11 + 4)]) < '0' || c10 == ']' || c10 == '}')) {
                this.M3 = i10;
                return;
            }
        }
        e6("false", 1);
    }

    private final void c6() throws IOException {
        int i10;
        char c10;
        int i11 = this.M3;
        if (i11 + 3 < this.N3) {
            char[] cArr = this.f102569m4;
            if (cArr[i11] == 'u' && cArr[i11 + 1] == 'l' && cArr[i11 + 2] == 'l' && ((c10 = cArr[(i10 = i11 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this.M3 = i10;
                return;
            }
        }
        e6(AbstractJsonLexerKt.NULL, 1);
    }

    private final void c7() {
        int i10 = this.M3;
        this.f102575s4 = i10;
        this.f102576t4 = this.P3;
        this.f102577u4 = i10 - this.Q3;
    }

    private char d7() throws IOException {
        char c10;
        if ((this.M3 < this.N3 || X5()) && (c10 = this.f102569m4[this.M3]) >= '0' && c10 <= '9') {
            if (!p2(JsonParser.a.ALLOW_NUMERIC_LEADING_ZEROS)) {
                h4("Leading zeroes not allowed");
            }
            this.M3++;
            if (c10 != '0') {
                return c10;
            }
            do {
                if (this.M3 >= this.N3 && !X5()) {
                    return c10;
                }
                char[] cArr = this.f102569m4;
                int i10 = this.M3;
                c10 = cArr[i10];
                if (c10 < '0' || c10 > '9') {
                    return l.f338160j;
                }
                this.M3 = i10 + 1;
            } while (c10 == '0');
            return c10;
        }
        return l.f338160j;
    }

    private final void g6(String str, int i10) throws IOException {
        int i11;
        char c10;
        int length = str.length();
        do {
            if ((this.M3 >= this.N3 && !X5()) || this.f102569m4[this.M3] != str.charAt(i10)) {
                E6(str.substring(0, i10));
            }
            i11 = this.M3 + 1;
            this.M3 = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this.N3 || X5()) && (c10 = this.f102569m4[this.M3]) >= '0' && c10 != ']' && c10 != '}') {
            y5(str, i10, c10);
        }
    }

    private final void i6() throws IOException {
        int i10;
        char c10;
        int i11 = this.M3;
        if (i11 + 3 < this.N3) {
            char[] cArr = this.f102569m4;
            if (cArr[i11] == 'r' && cArr[i11 + 1] == 'u' && cArr[i11 + 2] == 'e' && ((c10 = cArr[(i10 = i11 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this.M3 = i10;
                return;
            }
        }
        e6(z0.P, 1);
    }

    private final char i7() throws IOException {
        char c10;
        int i10 = this.M3;
        return (i10 >= this.N3 || ((c10 = this.f102569m4[i10]) >= '0' && c10 <= '9')) ? d7() : l.f338160j;
    }

    private final void l7(int i10) throws IOException {
        int i11 = this.M3 + 1;
        this.M3 = i11;
        if (i10 != 9) {
            if (i10 == 10) {
                this.P3++;
                this.Q3 = i11;
            } else if (i10 == 13) {
                L6();
            } else if (i10 != 32) {
                T3(i10);
            }
        }
    }

    private final com.fasterxml.jackson.core.n o6() {
        this.Y3 = false;
        com.fasterxml.jackson.core.n nVar = this.V3;
        this.V3 = null;
        if (nVar == com.fasterxml.jackson.core.n.START_ARRAY) {
            this.U3 = this.U3.t(this.S3, this.T3);
        } else if (nVar == com.fasterxml.jackson.core.n.START_OBJECT) {
            this.U3 = this.U3.u(this.S3, this.T3);
        }
        this.f102294g = nVar;
        return nVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    private final com.fasterxml.jackson.core.n q6(int i10) throws IOException {
        if (i10 == 34) {
            this.f102574r4 = true;
            com.fasterxml.jackson.core.n nVar = com.fasterxml.jackson.core.n.VALUE_STRING;
            this.f102294g = nVar;
            return nVar;
        }
        if (i10 == 44) {
            if (p2(JsonParser.a.ALLOW_MISSING_VALUES)) {
                this.M3--;
                com.fasterxml.jackson.core.n nVar2 = com.fasterxml.jackson.core.n.VALUE_NULL;
                this.f102294g = nVar2;
                return nVar2;
            }
        } else {
            if (i10 == 45) {
                com.fasterxml.jackson.core.n nVarX6 = x6();
                this.f102294g = nVarX6;
                return nVarX6;
            }
            if (i10 == 91) {
                this.U3 = this.U3.t(this.S3, this.T3);
                com.fasterxml.jackson.core.n nVar3 = com.fasterxml.jackson.core.n.START_ARRAY;
                this.f102294g = nVar3;
                return nVar3;
            }
            if (i10 != 93) {
                if (i10 == 102) {
                    e6("false", 1);
                    com.fasterxml.jackson.core.n nVar4 = com.fasterxml.jackson.core.n.VALUE_FALSE;
                    this.f102294g = nVar4;
                    return nVar4;
                }
                if (i10 == 110) {
                    e6(AbstractJsonLexerKt.NULL, 1);
                    com.fasterxml.jackson.core.n nVar5 = com.fasterxml.jackson.core.n.VALUE_NULL;
                    this.f102294g = nVar5;
                    return nVar5;
                }
                if (i10 == 116) {
                    e6(z0.P, 1);
                    com.fasterxml.jackson.core.n nVar6 = com.fasterxml.jackson.core.n.VALUE_TRUE;
                    this.f102294g = nVar6;
                    return nVar6;
                }
                if (i10 != 123) {
                    switch (i10) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                        case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                            com.fasterxml.jackson.core.n nVarA6 = A6(i10);
                            this.f102294g = nVarA6;
                            return nVarA6;
                    }
                }
                this.U3 = this.U3.u(this.S3, this.T3);
                com.fasterxml.jackson.core.n nVar7 = com.fasterxml.jackson.core.n.START_OBJECT;
                this.f102294g = nVar7;
                return nVar7;
            }
            if (p2(JsonParser.a.ALLOW_MISSING_VALUES)) {
                this.M3--;
                com.fasterxml.jackson.core.n nVar8 = com.fasterxml.jackson.core.n.VALUE_NULL;
                this.f102294g = nVar8;
                return nVar8;
            }
        }
        com.fasterxml.jackson.core.n nVarS5 = S5(i10);
        this.f102294g = nVarS5;
        return nVarS5;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v14 ??, r11v9 ??, r11v5 ??, r11v4 ??, r11v3 ??, r11v8 ??, r11v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final com.fasterxml.jackson.core.n s6(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v14 ??, r11v9 ??, r11v5 ??, r11v4 ??, r11v3 ??, r11v8 ??, r11v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    private String w6(int i10, int i11, int i12) throws IOException {
        this.W3.E(this.f102569m4, i10, this.M3 - i10);
        char[] cArrU = this.W3.u();
        int iV = this.W3.v();
        while (true) {
            if (this.M3 >= this.N3 && !X5()) {
                N3(" in field name", com.fasterxml.jackson.core.n.FIELD_NAME);
            }
            char[] cArr = this.f102569m4;
            int i13 = this.M3;
            this.M3 = i13 + 1;
            char cW4 = cArr[i13];
            if (cW4 <= '\\') {
                if (cW4 == '\\') {
                    cW4 = w4();
                } else if (cW4 <= i12) {
                    if (cW4 == i12) {
                        this.W3.I(iV);
                        n nVar = this.W3;
                        return this.f102572p4.q(nVar.w(), nVar.x(), nVar.J(), i11);
                    }
                    if (cW4 < ' ') {
                        f4(cW4, "name");
                    }
                }
            }
            i11 = (i11 * 33) + cW4;
            int i14 = iV + 1;
            cArrU[iV] = cW4;
            if (i14 >= cArrU.length) {
                cArrU = this.W3.s();
                iV = 0;
            } else {
                iV = i14;
            }
        }
    }

    private final void y5(String str, int i10, int i11) throws IOException {
        if (Character.isJavaIdentifierPart((char) i11)) {
            E6(str.substring(0, i10));
        }
    }

    private final com.fasterxml.jackson.core.n y6(boolean z10, int i10) throws IOException {
        int i11;
        char cO7;
        boolean z11;
        int i12;
        char cM7;
        if (z10) {
            i10++;
        }
        this.M3 = i10;
        char[] cArrN = this.W3.n();
        int i13 = 0;
        if (z10) {
            cArrN[0] = org.apache.commons.codec.language.l.f335457d;
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i14 = this.M3;
        if (i14 < this.N3) {
            char[] cArr = this.f102569m4;
            this.M3 = i14 + 1;
            cO7 = cArr[i14];
        } else {
            cO7 = o7("No digit following minus sign", com.fasterxml.jackson.core.n.VALUE_NUMBER_INT);
        }
        if (cO7 == '0') {
            cO7 = i7();
        }
        int i15 = 0;
        while (true) {
            if (cO7 >= '0' && cO7 <= '9') {
                i15++;
                if (i11 >= cArrN.length) {
                    cArrN = this.W3.s();
                    i11 = 0;
                }
                int i16 = i11 + 1;
                cArrN[i11] = cO7;
                if (this.M3 >= this.N3 && !X5()) {
                    cO7 = 0;
                    i11 = i16;
                    z11 = true;
                    break;
                }
                char[] cArr2 = this.f102569m4;
                int i17 = this.M3;
                this.M3 = i17 + 1;
                cO7 = cArr2[i17];
                i11 = i16;
            } else {
                z11 = false;
                break;
            }
        }
        if (i15 == 0) {
            return N5(cO7, z10);
        }
        if (cO7 == '.') {
            if (i11 >= cArrN.length) {
                cArrN = this.W3.s();
                i11 = 0;
            }
            cArrN[i11] = cO7;
            i11++;
            i12 = 0;
            while (true) {
                if (this.M3 >= this.N3 && !X5()) {
                    z11 = true;
                    break;
                }
                char[] cArr3 = this.f102569m4;
                int i18 = this.M3;
                this.M3 = i18 + 1;
                cO7 = cArr3[i18];
                if (cO7 < '0' || cO7 > '9') {
                    break;
                }
                i12++;
                if (i11 >= cArrN.length) {
                    cArrN = this.W3.s();
                    i11 = 0;
                }
                cArrN[i11] = cO7;
                i11++;
            }
            if (i12 == 0) {
                n4(cO7, "Decimal point not followed by a digit");
            }
        } else {
            i12 = 0;
        }
        if (cO7 == 'e' || cO7 == 'E') {
            if (i11 >= cArrN.length) {
                cArrN = this.W3.s();
                i11 = 0;
            }
            int i19 = i11 + 1;
            cArrN[i11] = cO7;
            int i20 = this.M3;
            if (i20 < this.N3) {
                char[] cArr4 = this.f102569m4;
                this.M3 = i20 + 1;
                cM7 = cArr4[i20];
            } else {
                cM7 = m7("expected a digit for number exponent");
            }
            if (cM7 == '-' || cM7 == '+') {
                if (i19 >= cArrN.length) {
                    cArrN = this.W3.s();
                    i19 = 0;
                }
                int i21 = i19 + 1;
                cArrN[i19] = cM7;
                int i22 = this.M3;
                if (i22 < this.N3) {
                    char[] cArr5 = this.f102569m4;
                    this.M3 = i22 + 1;
                    cM7 = cArr5[i22];
                } else {
                    cM7 = m7("expected a digit for number exponent");
                }
                i19 = i21;
            }
            int i23 = 0;
            cO7 = cM7;
            while (true) {
                if (cO7 <= '9' && cO7 >= '0') {
                    i23++;
                    if (i19 >= cArrN.length) {
                        cArrN = this.W3.s();
                        i19 = 0;
                    }
                    i11 = i19 + 1;
                    cArrN[i19] = cO7;
                    if (this.M3 >= this.N3 && !X5()) {
                        z11 = true;
                        break;
                    }
                    char[] cArr6 = this.f102569m4;
                    int i24 = this.M3;
                    this.M3 = i24 + 1;
                    cO7 = cArr6[i24];
                    i19 = i11;
                } else {
                    i11 = i19;
                    break;
                }
            }
            i13 = i23;
            if (i13 == 0) {
                n4(cO7, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this.M3--;
            if (this.U3.m()) {
                l7(cO7);
            }
        }
        this.W3.I(i11);
        return s5(z10, i15, i12, i13);
    }

    private void z5(int i10) throws com.fasterxml.jackson.core.j {
        if (i10 == 93) {
            Z6();
            if (!this.U3.k()) {
                R4(i10, AbstractJsonLexerKt.END_OBJ);
            }
            this.U3 = this.U3.s();
            this.f102294g = com.fasterxml.jackson.core.n.END_ARRAY;
        }
        if (i10 == 125) {
            Z6();
            if (!this.U3.l()) {
                R4(i10, AbstractJsonLexerKt.END_LIST);
            }
            this.U3 = this.U3.s();
            this.f102294g = com.fasterxml.jackson.core.n.END_OBJECT;
        }
    }

    protected byte[] A5(com.fasterxml.jackson.core.a aVar) throws IOException {
        com.fasterxml.jackson.core.util.c cVarE4 = E4();
        while (true) {
            if (this.M3 >= this.N3) {
                Z5();
            }
            char[] cArr = this.f102569m4;
            int i10 = this.M3;
            this.M3 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                int iF = aVar.f(c10);
                if (iF < 0) {
                    if (c10 == '\"') {
                        return cVarE4.q();
                    }
                    iF = s4(aVar, c10, 0);
                    if (iF < 0) {
                        continue;
                    }
                }
                if (this.M3 >= this.N3) {
                    Z5();
                }
                char[] cArr2 = this.f102569m4;
                int i11 = this.M3;
                this.M3 = i11 + 1;
                char c11 = cArr2[i11];
                int iF2 = aVar.f(c11);
                if (iF2 < 0) {
                    iF2 = s4(aVar, c11, 1);
                }
                int i12 = (iF << 6) | iF2;
                if (this.M3 >= this.N3) {
                    Z5();
                }
                char[] cArr3 = this.f102569m4;
                int i13 = this.M3;
                this.M3 = i13 + 1;
                char c12 = cArr3[i13];
                int iF3 = aVar.f(c12);
                if (iF3 < 0) {
                    if (iF3 != -2) {
                        if (c12 == '\"' && !aVar.u()) {
                            cVarE4.b(i12 >> 4);
                            return cVarE4.q();
                        }
                        iF3 = s4(aVar, c12, 2);
                    }
                    if (iF3 == -2) {
                        if (this.M3 >= this.N3) {
                            Z5();
                        }
                        char[] cArr4 = this.f102569m4;
                        int i14 = this.M3;
                        this.M3 = i14 + 1;
                        char c13 = cArr4[i14];
                        if (!aVar.v(c13)) {
                            throw r5(aVar, c13, 3, "expected padding character '" + aVar.t() + "'");
                        }
                        cVarE4.b(i12 >> 4);
                    }
                }
                int i15 = (i12 << 6) | iF3;
                if (this.M3 >= this.N3) {
                    Z5();
                }
                char[] cArr5 = this.f102569m4;
                int i16 = this.M3;
                this.M3 = i16 + 1;
                char c14 = cArr5[i16];
                int iF4 = aVar.f(c14);
                if (iF4 < 0) {
                    if (iF4 != -2) {
                        if (c14 == '\"' && !aVar.u()) {
                            cVarE4.e(i15 >> 2);
                            return cVarE4.q();
                        }
                        iF4 = s4(aVar, c14, 3);
                    }
                    if (iF4 == -2) {
                        cVarE4.e(i15 >> 2);
                    }
                }
                cVarE4.d((i15 << 6) | iF4);
            }
        }
    }

    protected final com.fasterxml.jackson.core.n A6(int i10) throws IOException {
        int i11 = this.M3;
        int i12 = i11 - 1;
        int i13 = this.N3;
        int i14 = 1 >> 0;
        char c10 = l.f338160j;
        if (i10 == 48) {
            return y6(false, i12);
        }
        int i15 = 1;
        while (i11 < i13) {
            char c11 = c10;
            int i16 = i11 + 1;
            char c12 = this.f102569m4[i11];
            if (c12 < c11 || c12 > '9') {
                if (c12 != '.' && c12 != 'e' && c12 != 'E') {
                    this.M3 = i11;
                    if (this.U3.m()) {
                        l7(c12);
                    }
                    this.W3.E(this.f102569m4, i12, i11 - i12);
                    return x5(false, i15);
                }
                this.M3 = i16;
                return s6(c12, i12, i16, false, i15);
            }
            i15++;
            i11 = i16;
            c10 = c11;
        }
        this.M3 = i12;
        return y6(false, i12);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long B2(long j10) throws IOException {
        if (this.f102294g == com.fasterxml.jackson.core.n.FIELD_NAME) {
            this.Y3 = false;
            com.fasterxml.jackson.core.n nVar = this.V3;
            this.V3 = null;
            this.f102294g = nVar;
            if (nVar == com.fasterxml.jackson.core.n.VALUE_NUMBER_INT) {
                return Q0();
            }
            if (nVar == com.fasterxml.jackson.core.n.START_ARRAY) {
                this.U3 = this.U3.t(this.S3, this.T3);
                return j10;
            }
            if (nVar == com.fasterxml.jackson.core.n.START_OBJECT) {
                this.U3 = this.U3.u(this.S3, this.T3);
                return j10;
            }
        } else if (E2() == com.fasterxml.jackson.core.n.VALUE_NUMBER_INT) {
            return Q0();
        }
        return j10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String D2() throws IOException {
        if (this.f102294g != com.fasterxml.jackson.core.n.FIELD_NAME) {
            if (E2() == com.fasterxml.jackson.core.n.VALUE_STRING) {
                return j1();
            }
            return null;
        }
        this.Y3 = false;
        com.fasterxml.jackson.core.n nVar = this.V3;
        this.V3 = null;
        this.f102294g = nVar;
        if (nVar == com.fasterxml.jackson.core.n.VALUE_STRING) {
            if (this.f102574r4) {
                this.f102574r4 = false;
                D4();
            }
            return this.W3.l();
        }
        if (nVar == com.fasterxml.jackson.core.n.START_ARRAY) {
            this.U3 = this.U3.t(this.S3, this.T3);
        } else if (nVar == com.fasterxml.jackson.core.n.START_OBJECT) {
            this.U3 = this.U3.u(this.S3, this.T3);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected final void D4() throws IOException {
        int i10 = this.M3;
        int i11 = this.N3;
        if (i10 < i11) {
            int[] iArr = f102567w4;
            int length = iArr.length;
            do {
                char[] cArr = this.f102569m4;
                char c10 = cArr[i10];
                if (c10 < length && iArr[c10] != 0) {
                    if (c10 != '\"') {
                        break;
                    }
                    n nVar = this.W3;
                    int i12 = this.M3;
                    nVar.E(cArr, i12, i10 - i12);
                    this.M3 = i10 + 1;
                    return;
                }
                i10++;
            } while (i10 < i11);
        }
        n nVar2 = this.W3;
        char[] cArr2 = this.f102569m4;
        int i13 = this.M3;
        nVar2.C(cArr2, i13, i10 - i13);
        this.M3 = i10;
        F5();
    }

    protected int D6(com.fasterxml.jackson.core.a aVar, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length - 3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (this.M3 >= this.N3) {
                Z5();
            }
            char[] cArr = this.f102569m4;
            int i12 = this.M3;
            this.M3 = i12 + 1;
            char c10 = cArr[i12];
            if (c10 > ' ') {
                int iF = aVar.f(c10);
                if (iF < 0) {
                    if (c10 == '\"') {
                        break;
                    }
                    iF = s4(aVar, c10, 0);
                    if (iF < 0) {
                        continue;
                    }
                }
                if (i10 > length) {
                    i11 += i10;
                    outputStream.write(bArr, 0, i10);
                    i10 = 0;
                }
                if (this.M3 >= this.N3) {
                    Z5();
                }
                char[] cArr2 = this.f102569m4;
                int i13 = this.M3;
                this.M3 = i13 + 1;
                char c11 = cArr2[i13];
                int iF2 = aVar.f(c11);
                if (iF2 < 0) {
                    iF2 = s4(aVar, c11, 1);
                }
                int i14 = (iF << 6) | iF2;
                if (this.M3 >= this.N3) {
                    Z5();
                }
                char[] cArr3 = this.f102569m4;
                int i15 = this.M3;
                this.M3 = i15 + 1;
                char c12 = cArr3[i15];
                int iF3 = aVar.f(c12);
                if (iF3 < 0) {
                    if (iF3 != -2) {
                        if (c12 == '\"' && !aVar.u()) {
                            bArr[i10] = (byte) (i14 >> 4);
                            i10++;
                            break;
                        }
                        iF3 = s4(aVar, c12, 2);
                    }
                    if (iF3 == -2) {
                        if (this.M3 >= this.N3) {
                            Z5();
                        }
                        char[] cArr4 = this.f102569m4;
                        int i16 = this.M3;
                        this.M3 = i16 + 1;
                        char c13 = cArr4[i16];
                        if (!aVar.v(c13)) {
                            throw r5(aVar, c13, 3, "expected padding character '" + aVar.t() + "'");
                        }
                        bArr[i10] = (byte) (i14 >> 4);
                        i10++;
                    }
                }
                int i17 = (i14 << 6) | iF3;
                if (this.M3 >= this.N3) {
                    Z5();
                }
                char[] cArr5 = this.f102569m4;
                int i18 = this.M3;
                this.M3 = i18 + 1;
                char c14 = cArr5[i18];
                int iF4 = aVar.f(c14);
                if (iF4 < 0) {
                    if (iF4 != -2) {
                        if (c14 == '\"' && !aVar.u()) {
                            int i19 = i10 + 1;
                            bArr[i10] = (byte) (i17 >> 10);
                            i10 += 2;
                            bArr[i19] = (byte) (i17 >> 2);
                            break;
                        }
                        iF4 = s4(aVar, c14, 3);
                    }
                    if (iF4 == -2) {
                        int i20 = i10 + 1;
                        bArr[i10] = (byte) (i17 >> 10);
                        i10 += 2;
                        bArr[i20] = (byte) (i17 >> 2);
                    }
                }
                int i21 = (i17 << 6) | iF4;
                bArr[i10] = (byte) (i21 >> 16);
                int i22 = i10 + 2;
                bArr[i10 + 1] = (byte) (i21 >> 8);
                i10 += 3;
                bArr[i22] = (byte) i21;
            }
        }
        this.f102574r4 = false;
        if (i10 <= 0) {
            return i11;
        }
        int i23 = i11 + i10;
        outputStream.write(bArr, 0, i10);
        return i23;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.n E2() throws IOException {
        com.fasterxml.jackson.core.n nVarX6;
        com.fasterxml.jackson.core.n nVar = this.f102294g;
        com.fasterxml.jackson.core.n nVar2 = com.fasterxml.jackson.core.n.FIELD_NAME;
        if (nVar == nVar2) {
            return o6();
        }
        this.f102250b4 = 0;
        if (this.f102574r4) {
            V6();
        }
        int iW6 = W6();
        if (iW6 < 0) {
            close();
            this.f102294g = null;
            return null;
        }
        this.f102249a4 = null;
        if (iW6 == 93 || iW6 == 125) {
            z5(iW6);
            return this.f102294g;
        }
        if (this.U3.x()) {
            iW6 = R6(iW6);
            if ((this.f102189a & f102566v4) != 0 && (iW6 == 93 || iW6 == 125)) {
                z5(iW6);
                return this.f102294g;
            }
        }
        boolean zL = this.U3.l();
        if (zL) {
            c7();
            this.U3.B(iW6 == 34 ? v6() : Q5(iW6));
            this.f102294g = nVar2;
            iW6 = M6();
        }
        Z6();
        if (iW6 == 34) {
            this.f102574r4 = true;
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_STRING;
        } else if (iW6 == 45) {
            nVarX6 = x6();
        } else if (iW6 == 91) {
            if (!zL) {
                this.U3 = this.U3.t(this.S3, this.T3);
            }
            nVarX6 = com.fasterxml.jackson.core.n.START_ARRAY;
        } else if (iW6 == 102) {
            b6();
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_FALSE;
        } else if (iW6 == 110) {
            c6();
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_NULL;
        } else if (iW6 == 116) {
            i6();
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_TRUE;
        } else if (iW6 == 123) {
            if (!zL) {
                this.U3 = this.U3.u(this.S3, this.T3);
            }
            nVarX6 = com.fasterxml.jackson.core.n.START_OBJECT;
        } else if (iW6 != 125) {
            switch (iW6) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    nVarX6 = A6(iW6);
                    break;
                default:
                    nVarX6 = S5(iW6);
                    break;
            }
        } else {
            V3(iW6, "expected a value");
            i6();
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_TRUE;
        }
        if (zL) {
            this.V3 = nVarX6;
            return this.f102294g;
        }
        this.f102294g = nVarX6;
        return nVarX6;
    }

    protected void E6(String str) throws IOException {
        F6(str, "'null', 'true', 'false' or NaN");
    }

    protected void F5() throws IOException {
        char[] cArrU = this.W3.u();
        int iV = this.W3.v();
        int[] iArr = f102567w4;
        int length = iArr.length;
        while (true) {
            if (this.M3 >= this.N3 && !X5()) {
                N3(": was expecting closing quote for a string value", com.fasterxml.jackson.core.n.VALUE_STRING);
            }
            char[] cArr = this.f102569m4;
            int i10 = this.M3;
            this.M3 = i10 + 1;
            char cW4 = cArr[i10];
            if (cW4 < length && iArr[cW4] != 0) {
                if (cW4 == '\"') {
                    this.W3.I(iV);
                    return;
                } else if (cW4 == '\\') {
                    cW4 = w4();
                } else if (cW4 < ' ') {
                    f4(cW4, "string value");
                }
            }
            if (iV >= cArrU.length) {
                cArrU = this.W3.s();
                iV = 0;
            }
            cArrU[iV] = cW4;
            iV++;
        }
    }

    protected void F6(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        do {
            if (this.M3 < this.N3 || X5()) {
                char c10 = this.f102569m4[this.M3];
                if (Character.isJavaIdentifierPart(c10)) {
                    this.M3++;
                    sb2.append(c10);
                }
            }
            H3("Unrecognized token '%s': was expecting %s", sb2, str2);
        } while (sb2.length() < 256);
        sb2.append("...");
        H3("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void H() throws IOException {
        if (this.f102574r4) {
            this.f102574r4 = false;
            D4();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object H0() {
        return this.f102568l4;
    }

    protected final String K5(com.fasterxml.jackson.core.n nVar) {
        if (nVar == null) {
            return null;
        }
        int iO = nVar.o();
        if (iO != 5) {
            return (iO == 6 || iO == 7 || iO == 8) ? this.W3.l() : nVar.n();
        }
        return this.U3.b();
    }

    protected com.fasterxml.jackson.core.n L5() throws IOException {
        char[] cArrN = this.W3.n();
        int iV = this.W3.v();
        while (true) {
            if (this.M3 >= this.N3 && !X5()) {
                N3(": was expecting closing quote for a string value", com.fasterxml.jackson.core.n.VALUE_STRING);
            }
            char[] cArr = this.f102569m4;
            int i10 = this.M3;
            this.M3 = i10 + 1;
            char cW4 = cArr[i10];
            if (cW4 <= '\\') {
                if (cW4 == '\\') {
                    cW4 = w4();
                } else if (cW4 <= '\'') {
                    if (cW4 == '\'') {
                        this.W3.I(iV);
                        return com.fasterxml.jackson.core.n.VALUE_STRING;
                    }
                    if (cW4 < ' ') {
                        f4(cW4, "string value");
                    }
                }
            }
            if (iV >= cArrN.length) {
                cArrN = this.W3.s();
                iV = 0;
            }
            cArrN[iV] = cW4;
            iV++;
        }
    }

    protected final void L6() throws IOException {
        if (this.M3 < this.N3 || X5()) {
            char[] cArr = this.f102569m4;
            int i10 = this.M3;
            if (cArr[i10] == '\n') {
                this.M3 = i10 + 1;
            }
        }
        this.P3++;
        this.Q3 = this.M3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected com.fasterxml.jackson.core.n N5(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    @Override // com.fasterxml.jackson.core.JsonParser
    public int O2(com.fasterxml.jackson.core.a aVar, OutputStream outputStream) throws IOException {
        if (!this.f102574r4 || this.f102294g != com.fasterxml.jackson.core.n.VALUE_STRING) {
            byte[] bArrR = R(aVar);
            outputStream.write(bArrR);
            return bArrR.length;
        }
        byte[] bArrD = this.K3.d();
        try {
            int iD6 = D6(aVar, outputStream, bArrD);
            com.fasterxml.jackson.core.io.d dVar = this.K3;
            return iD6;
        } finally {
            this.K3.r(bArrD);
        }
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected void Q4() throws IOException {
        char[] cArr;
        super.Q4();
        this.f102572p4.x();
        if (!this.f102570n4 || (cArr = this.f102569m4) == null) {
            return;
        }
        this.f102569m4 = null;
        this.K3.v(cArr);
    }

    protected String Q5(int i10) throws IOException {
        boolean zIsJavaIdentifierPart;
        if (i10 == 39 && p2(JsonParser.a.ALLOW_SINGLE_QUOTES)) {
            return r6();
        }
        if (!p2(JsonParser.a.ALLOW_UNQUOTED_FIELD_NAMES)) {
            V3(i10, "was expecting double-quote to start field name");
        }
        int[] iArrH = com.fasterxml.jackson.core.io.a.h();
        int length = iArrH.length;
        if (i10 < length) {
            zIsJavaIdentifierPart = iArrH[i10] == 0;
        } else {
            zIsJavaIdentifierPart = Character.isJavaIdentifierPart((char) i10);
        }
        if (!zIsJavaIdentifierPart) {
            V3(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i11 = this.M3;
        int i12 = this.f102573q4;
        int i13 = this.N3;
        if (i11 < i13) {
            do {
                char[] cArr = this.f102569m4;
                char c10 = cArr[i11];
                if (c10 < length) {
                    if (iArrH[c10] != 0) {
                        int i14 = this.M3 - 1;
                        this.M3 = i11;
                        return this.f102572p4.q(cArr, i14, i11 - i14, i12);
                    }
                } else if (!Character.isJavaIdentifierPart(c10)) {
                    int i15 = this.M3 - 1;
                    this.M3 = i11;
                    return this.f102572p4.q(this.f102569m4, i15, i11 - i15, i12);
                }
                i12 = (i12 * 33) + c10;
                i11++;
            } while (i11 < i13);
        }
        int i16 = this.M3 - 1;
        this.M3 = i11;
        return R5(i16, i12, iArrH);
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public byte[] R(com.fasterxml.jackson.core.a aVar) throws IOException {
        byte[] bArr;
        com.fasterxml.jackson.core.n nVar = this.f102294g;
        if (nVar == com.fasterxml.jackson.core.n.VALUE_EMBEDDED_OBJECT && (bArr = this.f102249a4) != null) {
            return bArr;
        }
        if (nVar != com.fasterxml.jackson.core.n.VALUE_STRING) {
            F3("Current token (" + this.f102294g + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f102574r4) {
            try {
                this.f102249a4 = A5(aVar);
                this.f102574r4 = false;
            } catch (IllegalArgumentException e10) {
                throw f("Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e10.getMessage());
            }
        } else if (this.f102249a4 == null) {
            com.fasterxml.jackson.core.util.c cVarE4 = E4();
            w3(j1(), cVarE4, aVar);
            this.f102249a4 = cVarE4.q();
        }
        return this.f102249a4;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    protected com.fasterxml.jackson.core.n S5(int i10) throws IOException {
        if (i10 != 39) {
            if (i10 == 73) {
                e6("Infinity", 1);
                if (p2(JsonParser.a.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return t5("Infinity", Double.POSITIVE_INFINITY);
                }
                F3("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i10 == 78) {
                e6("NaN", 1);
                if (p2(JsonParser.a.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return t5("NaN", Double.NaN);
                }
                F3("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i10 != 93) {
                if (i10 == 43) {
                    if (this.M3 >= this.N3 && !X5()) {
                        S3(com.fasterxml.jackson.core.n.VALUE_NUMBER_INT);
                    }
                    char[] cArr = this.f102569m4;
                    int i11 = this.M3;
                    this.M3 = i11 + 1;
                    return N5(cArr[i11], false);
                }
                if (i10 == 44) {
                    if (p2(JsonParser.a.ALLOW_MISSING_VALUES)) {
                        this.M3--;
                        return com.fasterxml.jackson.core.n.VALUE_NULL;
                    }
                }
            } else if (this.U3.k()) {
                if (p2(JsonParser.a.ALLOW_MISSING_VALUES)) {
                    this.M3--;
                    return com.fasterxml.jackson.core.n.VALUE_NULL;
                }
            }
        } else if (p2(JsonParser.a.ALLOW_SINGLE_QUOTES)) {
            return L5();
        }
        if (Character.isJavaIdentifierStart(i10)) {
            F6("" + ((char) i10), "('true', 'false' or 'null')");
        }
        V3(i10, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    protected boolean T5(int i10, String str) throws IOException {
        com.fasterxml.jackson.core.n nVarX6;
        String strV6 = i10 == 34 ? v6() : Q5(i10);
        this.U3.B(strV6);
        this.f102294g = com.fasterxml.jackson.core.n.FIELD_NAME;
        int iM6 = M6();
        Z6();
        if (iM6 == 34) {
            this.f102574r4 = true;
            this.V3 = com.fasterxml.jackson.core.n.VALUE_STRING;
            return str.equals(strV6);
        }
        if (iM6 == 45) {
            nVarX6 = x6();
        } else if (iM6 == 91) {
            nVarX6 = com.fasterxml.jackson.core.n.START_ARRAY;
        } else if (iM6 == 102) {
            b6();
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_FALSE;
        } else if (iM6 == 110) {
            c6();
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_NULL;
        } else if (iM6 == 116) {
            i6();
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_TRUE;
        } else if (iM6 != 123) {
            switch (iM6) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    nVarX6 = A6(iM6);
                    break;
                default:
                    nVarX6 = S5(iM6);
                    break;
            }
        } else {
            nVarX6 = com.fasterxml.jackson.core.n.START_OBJECT;
        }
        this.V3 = nVarX6;
        return str.equals(strV6);
    }

    protected final void V6() throws IOException {
        this.f102574r4 = false;
        int i10 = this.M3;
        int i11 = this.N3;
        char[] cArr = this.f102569m4;
        while (true) {
            if (i10 >= i11) {
                this.M3 = i10;
                if (!X5()) {
                    N3(": was expecting closing quote for a string value", com.fasterxml.jackson.core.n.VALUE_STRING);
                }
                i10 = this.M3;
                i11 = this.N3;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    this.M3 = i12;
                    w4();
                    i10 = this.M3;
                    i11 = this.N3;
                } else if (c10 <= '\"') {
                    if (c10 == '\"') {
                        this.M3 = i12;
                        return;
                    } else if (c10 < ' ') {
                        this.M3 = i12;
                        f4(c10, "string value");
                    }
                }
            }
            i10 = i12;
        }
    }

    protected boolean X5() throws IOException {
        int i10 = this.N3;
        long j10 = i10;
        this.O3 += j10;
        this.Q3 -= i10;
        this.f102575s4 -= j10;
        Reader reader = this.f102568l4;
        if (reader != null) {
            char[] cArr = this.f102569m4;
            int i11 = reader.read(cArr, 0, cArr.length);
            if (i11 > 0) {
                this.M3 = 0;
                this.N3 = i11;
                return true;
            }
            r4();
            if (i11 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.N3);
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public q Y() {
        return this.f102571o4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int Z2(Writer writer) throws IOException {
        int i10 = this.N3;
        int i11 = this.M3;
        int i12 = i10 - i11;
        if (i12 < 1) {
            return 0;
        }
        writer.write(this.f102569m4, i11, i12);
        return i12;
    }

    protected void Z5() throws IOException {
        if (X5()) {
            return;
        }
        I3();
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i d0() {
        int i10 = (this.M3 - this.Q3) + 1;
        return new com.fasterxml.jackson.core.i(H4(), -1L, ((long) this.M3) + this.O3, this.P3, i10);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public final String d2() throws IOException {
        com.fasterxml.jackson.core.n nVar = this.f102294g;
        if (nVar != com.fasterxml.jackson.core.n.VALUE_STRING) {
            return nVar == com.fasterxml.jackson.core.n.FIELD_NAME ? f0() : super.e2(null);
        }
        if (this.f102574r4) {
            this.f102574r4 = false;
            D4();
        }
        return this.W3.l();
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public final String e2(String str) throws IOException {
        com.fasterxml.jackson.core.n nVar = this.f102294g;
        if (nVar != com.fasterxml.jackson.core.n.VALUE_STRING) {
            return nVar == com.fasterxml.jackson.core.n.FIELD_NAME ? f0() : super.e2(str);
        }
        if (this.f102574r4) {
            this.f102574r4 = false;
            D4();
        }
        return this.W3.l();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void e3(q qVar) {
        this.f102571o4 = qVar;
    }

    protected final void e6(String str, int i10) throws IOException {
        int i11;
        int length = str.length();
        if (this.M3 + length >= this.N3) {
            g6(str, i10);
            return;
        }
        do {
            if (this.f102569m4[this.M3] != str.charAt(i10)) {
                E6(str.substring(0, i10));
            }
            i11 = this.M3 + 1;
            this.M3 = i11;
            i10++;
        } while (i10 < length);
        char c10 = this.f102569m4[i11];
        if (c10 < '0' || c10 == ']' || c10 == '}') {
            return;
        }
        y5(str, i10, c10);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int h1(Writer writer) throws IOException {
        com.fasterxml.jackson.core.n nVar = this.f102294g;
        if (nVar == com.fasterxml.jackson.core.n.VALUE_STRING) {
            if (this.f102574r4) {
                this.f102574r4 = false;
                D4();
            }
            return this.W3.m(writer);
        }
        if (nVar == com.fasterxml.jackson.core.n.FIELD_NAME) {
            String strB = this.U3.b();
            writer.write(strB);
            return strB.length();
        }
        if (nVar == null) {
            return 0;
        }
        if (nVar.q()) {
            return this.W3.m(writer);
        }
        char[] cArrL = nVar.l();
        writer.write(cArrL);
        return cArrL.length;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public final String j1() throws IOException {
        com.fasterxml.jackson.core.n nVar = this.f102294g;
        if (nVar != com.fasterxml.jackson.core.n.VALUE_STRING) {
            return K5(nVar);
        }
        if (this.f102574r4) {
            this.f102574r4 = false;
            D4();
        }
        return this.W3.l();
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public final char[] l1() throws IOException {
        com.fasterxml.jackson.core.n nVar = this.f102294g;
        if (nVar == null) {
            return null;
        }
        int iO = nVar.o();
        if (iO != 5) {
            if (iO != 6) {
                if (iO != 7 && iO != 8) {
                    return this.f102294g.l();
                }
            } else if (this.f102574r4) {
                this.f102574r4 = false;
                D4();
            }
            return this.W3.w();
        }
        if (!this.Y3) {
            String strB = this.U3.b();
            int length = strB.length();
            char[] cArr = this.X3;
            if (cArr == null) {
                this.X3 = this.K3.g(length);
            } else if (cArr.length < length) {
                this.X3 = new char[length];
            }
            strB.getChars(0, length, this.X3, 0);
            this.Y3 = true;
        }
        return this.X3;
    }

    @Deprecated
    protected char m7(String str) throws IOException {
        return o7(str, null);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public final int o1() throws IOException {
        com.fasterxml.jackson.core.n nVar = this.f102294g;
        if (nVar == null) {
            return 0;
        }
        int iO = nVar.o();
        if (iO == 5) {
            return this.U3.b().length();
        }
        if (iO != 6) {
            if (iO != 7 && iO != 8) {
                return this.f102294g.l().length;
            }
        } else if (this.f102574r4) {
            this.f102574r4 = false;
            D4();
        }
        return this.W3.J();
    }

    protected char o7(String str, com.fasterxml.jackson.core.n nVar) throws IOException {
        if (this.M3 >= this.N3 && !X5()) {
            N3(str, nVar);
        }
        char[] cArr = this.f102569m4;
        int i10 = this.M3;
        this.M3 = i10 + 1;
        return cArr[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p1() throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.n r0 = r4.f102294g
            r3 = 2
            r1 = 0
            r3 = 0
            if (r0 == 0) goto L29
            int r0 = r0.o()
            r2 = 6
            if (r0 == r2) goto L17
            r2 = 7
            r3 = 1
            if (r0 == r2) goto L21
            r2 = 8
            if (r0 == r2) goto L21
            goto L29
        L17:
            boolean r0 = r4.f102574r4
            r3 = 4
            if (r0 == 0) goto L21
            r4.f102574r4 = r1
            r4.D4()
        L21:
            r3 = 0
            com.fasterxml.jackson.core.util.n r4 = r4.W3
            int r4 = r4.x()
            return r4
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.g.p1():int");
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected void r4() throws IOException {
        if (this.f102568l4 != null) {
            if (this.K3.q() || p2(JsonParser.a.AUTO_CLOSE_SOURCE)) {
                this.f102568l4.close();
            }
            this.f102568l4 = null;
        }
    }

    protected String r6() throws IOException {
        int i10 = this.M3;
        int i11 = this.f102573q4;
        int i12 = this.N3;
        if (i10 < i12) {
            int[] iArr = f102567w4;
            int length = iArr.length;
            do {
                char[] cArr = this.f102569m4;
                char c10 = cArr[i10];
                if (c10 != '\'') {
                    if (c10 < length && iArr[c10] != 0) {
                        break;
                    }
                    i11 = (i11 * 33) + c10;
                    i10++;
                } else {
                    int i13 = this.M3;
                    this.M3 = i10 + 1;
                    return this.f102572p4.q(cArr, i13, i10 - i13, i11);
                }
            } while (i10 < i12);
        }
        int i14 = this.M3;
        this.M3 = i10;
        return w6(i14, i11, 39);
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i s1() {
        if (this.f102294g != com.fasterxml.jackson.core.n.FIELD_NAME) {
            return new com.fasterxml.jackson.core.i(H4(), -1L, this.R3 - 1, this.S3, this.T3);
        }
        return new com.fasterxml.jackson.core.i(H4(), -1L, this.O3 + (this.f102575s4 - 1), this.f102576t4, this.f102577u4);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Boolean u2() throws IOException {
        if (this.f102294g != com.fasterxml.jackson.core.n.FIELD_NAME) {
            com.fasterxml.jackson.core.n nVarE2 = E2();
            if (nVarE2 != null) {
                int iO = nVarE2.o();
                if (iO == 9) {
                    return Boolean.TRUE;
                }
                if (iO == 10) {
                    return Boolean.FALSE;
                }
            }
            return null;
        }
        this.Y3 = false;
        com.fasterxml.jackson.core.n nVar = this.V3;
        this.V3 = null;
        this.f102294g = nVar;
        if (nVar == com.fasterxml.jackson.core.n.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (nVar == com.fasterxml.jackson.core.n.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (nVar == com.fasterxml.jackson.core.n.START_ARRAY) {
            this.U3 = this.U3.t(this.S3, this.T3);
        } else if (nVar == com.fasterxml.jackson.core.n.START_OBJECT) {
            this.U3 = this.U3.u(this.S3, this.T3);
        }
        return null;
    }

    protected final String v6() throws IOException {
        int i10 = this.M3;
        int i11 = this.f102573q4;
        int[] iArr = f102567w4;
        while (i10 < this.N3) {
            char[] cArr = this.f102569m4;
            char c10 = cArr[i10];
            if (c10 < iArr.length && iArr[c10] != 0) {
                if (c10 != '\"') {
                    break;
                }
                int i12 = this.M3;
                this.M3 = i10 + 1;
                return this.f102572p4.q(cArr, i12, i10 - i12, i11);
            }
            i11 = (i11 * 33) + c10;
            i10++;
        }
        int i13 = this.M3;
        this.M3 = i10;
        return w6(i13, i11, 34);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String w2() throws IOException {
        com.fasterxml.jackson.core.n nVarX6;
        this.f102250b4 = 0;
        com.fasterxml.jackson.core.n nVar = this.f102294g;
        com.fasterxml.jackson.core.n nVar2 = com.fasterxml.jackson.core.n.FIELD_NAME;
        if (nVar == nVar2) {
            o6();
            return null;
        }
        if (this.f102574r4) {
            V6();
        }
        int iW6 = W6();
        if (iW6 < 0) {
            close();
            this.f102294g = null;
            return null;
        }
        this.f102249a4 = null;
        if (iW6 == 93 || iW6 == 125) {
            z5(iW6);
            return null;
        }
        if (this.U3.x()) {
            iW6 = R6(iW6);
            if ((this.f102189a & f102566v4) != 0 && (iW6 == 93 || iW6 == 125)) {
                z5(iW6);
                return null;
            }
        }
        if (!this.U3.l()) {
            Z6();
            q6(iW6);
            return null;
        }
        c7();
        String strV6 = iW6 == 34 ? v6() : Q5(iW6);
        this.U3.B(strV6);
        this.f102294g = nVar2;
        int iM6 = M6();
        Z6();
        if (iM6 == 34) {
            this.f102574r4 = true;
            this.V3 = com.fasterxml.jackson.core.n.VALUE_STRING;
            return strV6;
        }
        if (iM6 == 45) {
            nVarX6 = x6();
        } else if (iM6 == 91) {
            nVarX6 = com.fasterxml.jackson.core.n.START_ARRAY;
        } else if (iM6 == 102) {
            b6();
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_FALSE;
        } else if (iM6 == 110) {
            c6();
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_NULL;
        } else if (iM6 == 116) {
            i6();
            nVarX6 = com.fasterxml.jackson.core.n.VALUE_TRUE;
        } else if (iM6 != 123) {
            switch (iM6) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    nVarX6 = A6(iM6);
                    break;
                default:
                    nVarX6 = S5(iM6);
                    break;
            }
        } else {
            nVarX6 = com.fasterxml.jackson.core.n.START_OBJECT;
        }
        this.V3 = nVarX6;
        return strV6;
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected char w4() throws IOException {
        if (this.M3 >= this.N3 && !X5()) {
            N3(" in character escape sequence", com.fasterxml.jackson.core.n.VALUE_STRING);
        }
        char[] cArr = this.f102569m4;
        int i10 = this.M3;
        this.M3 = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '\"' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return org.apache.commons.lang3.k.f337188d;
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            return C3(c10);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this.M3 >= this.N3 && !X5()) {
                N3(" in character escape sequence", com.fasterxml.jackson.core.n.VALUE_STRING);
            }
            char[] cArr2 = this.f102569m4;
            int i13 = this.M3;
            this.M3 = i13 + 1;
            char c11 = cArr2[i13];
            int iB = com.fasterxml.jackson.core.io.a.b(c11);
            if (iB < 0) {
                V3(c11, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | iB;
        }
        return (char) i11;
    }

    protected final com.fasterxml.jackson.core.n x6() throws IOException {
        int i10 = this.M3;
        int i11 = i10 - 1;
        int i12 = this.N3;
        if (i10 >= i12) {
            return y6(true, i11);
        }
        int i13 = i10 + 1;
        char c10 = this.f102569m4[i10];
        char c11 = '9';
        if (c10 > '9' || c10 < '0') {
            this.M3 = i13;
            return N5(c10, true);
        }
        if (c10 == '0') {
            return y6(true, i11);
        }
        int i14 = 1;
        while (i13 < i12) {
            char c12 = c11;
            int i15 = i13 + 1;
            char c13 = this.f102569m4[i13];
            if (c13 < '0' || c13 > c12) {
                if (c13 == '.' || c13 == 'e' || c13 == 'E') {
                    this.M3 = i15;
                    return s6(c13, i11, i15, true, i14);
                }
                this.M3 = i13;
                if (this.U3.m()) {
                    l7(c13);
                }
                this.W3.E(this.f102569m4, i11, i13 - i11);
                return x5(true, i14);
            }
            i14++;
            i13 = i15;
            c11 = c12;
        }
        return y6(true, i11);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean y2(s sVar) throws IOException {
        int i10 = 0;
        this.f102250b4 = 0;
        if (this.f102294g == com.fasterxml.jackson.core.n.FIELD_NAME) {
            o6();
            return false;
        }
        if (this.f102574r4) {
            V6();
        }
        int iW6 = W6();
        if (iW6 < 0) {
            close();
            this.f102294g = null;
            return false;
        }
        this.f102249a4 = null;
        if (iW6 == 93 || iW6 == 125) {
            z5(iW6);
            return false;
        }
        if (this.U3.x()) {
            iW6 = R6(iW6);
            if ((this.f102189a & f102566v4) != 0 && (iW6 == 93 || iW6 == 125)) {
                z5(iW6);
                return false;
            }
        }
        if (!this.U3.l()) {
            Z6();
            q6(iW6);
            return false;
        }
        c7();
        if (iW6 == 34) {
            char[] cArrC = sVar.c();
            int length = cArrC.length;
            int i11 = this.M3;
            if (i11 + length + 4 < this.N3) {
                int i12 = length + i11;
                if (this.f102569m4[i12] == '\"') {
                    while (i11 != i12) {
                        if (cArrC[i10] == this.f102569m4[i11]) {
                            i10++;
                            i11++;
                        }
                    }
                    this.U3.B(sVar.getValue());
                    W5(P6(i11 + 1));
                    return true;
                }
            }
        }
        return T5(iW6, sVar.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int z2(int i10) throws IOException {
        if (this.f102294g == com.fasterxml.jackson.core.n.FIELD_NAME) {
            this.Y3 = false;
            com.fasterxml.jackson.core.n nVar = this.V3;
            this.V3 = null;
            this.f102294g = nVar;
            if (nVar == com.fasterxml.jackson.core.n.VALUE_NUMBER_INT) {
                return M0();
            }
            if (nVar == com.fasterxml.jackson.core.n.START_ARRAY) {
                this.U3 = this.U3.t(this.S3, this.T3);
                return i10;
            }
            if (nVar == com.fasterxml.jackson.core.n.START_OBJECT) {
                this.U3 = this.U3.u(this.S3, this.T3);
                return i10;
            }
        } else if (E2() == com.fasterxml.jackson.core.n.VALUE_NUMBER_INT) {
            return M0();
        }
        return i10;
    }

    public g(com.fasterxml.jackson.core.io.d dVar, int i10, Reader reader, q qVar, com.fasterxml.jackson.core.sym.b bVar) {
        super(dVar, i10);
        this.f102568l4 = reader;
        this.f102569m4 = dVar.j();
        this.M3 = 0;
        this.N3 = 0;
        this.f102571o4 = qVar;
        this.f102572p4 = bVar;
        this.f102573q4 = bVar.r();
        this.f102570n4 = true;
    }
}
