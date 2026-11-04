package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f44169d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44171b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44172c;

    enum a {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN;

        static {
            int i10 = 1 ^ 4;
        }
    }

    public g(String str) {
        this.f44170a = str;
    }

    private c a(c cVar, int i10, a aVar, boolean z10, char[] cArr) {
        c cVarA0;
        if (f44169d) {
            System.out.println("CREATE " + aVar + " at " + cArr[i10]);
        }
        switch (aVar.ordinal()) {
            case 1:
                cVarA0 = f.A0(cArr);
                i10++;
                break;
            case 2:
                cVarA0 = androidx.constraintlayout.core.parser.a.N(cArr);
                i10++;
                break;
            case 3:
                cVarA0 = e.M(cArr);
                break;
            case 4:
                cVarA0 = i.M(cArr);
                break;
            case 5:
                cVarA0 = d.N(cArr);
                break;
            case 6:
                cVarA0 = j.M(cArr);
                break;
            default:
                cVarA0 = null;
                break;
        }
        if (cVarA0 == null) {
            return null;
        }
        cVarA0.G(this.f44172c);
        if (z10) {
            cVarA0.J(i10);
        }
        if (cVar instanceof b) {
            cVarA0.D((b) cVar);
        }
        return cVarA0;
    }

    private c b(int i10, char c10, c cVar, char[] cArr) throws h {
        if (c10 != '\t' && c10 != '\n' && c10 != '\r' && c10 != ' ') {
            if (c10 == '\"' || c10 == '\'') {
                return cVar instanceof f ? a(cVar, i10, a.KEY, true, cArr) : a(cVar, i10, a.STRING, true, cArr);
            }
            if (c10 == '[') {
                return a(cVar, i10, a.ARRAY, true, cArr);
            }
            if (c10 != ']') {
                if (c10 == '{') {
                    return a(cVar, i10, a.OBJECT, true, cArr);
                }
                if (c10 != '}') {
                    switch (c10) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                        case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                            return a(cVar, i10, a.NUMBER, true, cArr);
                        case ',':
                        case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                            break;
                        case '/':
                            int i11 = i10 + 1;
                            if (i11 >= cArr.length || cArr[i11] != '/') {
                                return cVar;
                            }
                            this.f44171b = true;
                            return cVar;
                        default:
                            if (!(cVar instanceof b) || (cVar instanceof f)) {
                                int i12 = 6 ^ 1;
                                return a(cVar, i10, a.KEY, true, cArr);
                            }
                            c cVarA = a(cVar, i10, a.TOKEN, true, cArr);
                            j jVar = (j) cVarA;
                            if (jVar.Q(c10, i10)) {
                                return cVarA;
                            }
                            throw new h("incorrect token <" + c10 + "> at line " + this.f44172c, jVar);
                    }
                }
            }
            cVar.F(i10 - 1);
            c cVarL = cVar.l();
            cVarL.F(i10);
            return cVarL;
        }
        return cVar;
    }

    public static f d(String str) throws h {
        return new g(str).c();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0054 A[EDGE_INSN: B:108:0x0054->B:24:0x0054 BREAK  A[LOOP:1: B:14:0x0038->B:89:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0157 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0137  */
    /* JADX WARN: Code duplicated, block: B:84:0x0144  */
    public f c() throws h {
        boolean z10;
        long j10;
        char c10;
        long j11;
        j jVar;
        long j12;
        char[] charArray = this.f44170a.toCharArray();
        int length = charArray.length;
        int i10 = 1;
        this.f44172c = 1;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            char c11 = charArray[i11];
            if (c11 == '{') {
                break;
            }
            if (c11 == '\n') {
                this.f44172c++;
            }
            i11++;
        }
        if (i11 == -1) {
            throw new h("invalid json content", null);
        }
        f fVarA0 = f.A0(charArray);
        fVarA0.G(this.f44172c);
        fVarA0.J(i11);
        int i12 = i11 + 1;
        c cVarL = fVarA0;
        while (i12 < length) {
            char c12 = charArray[i12];
            if (c12 == '\n') {
                this.f44172c += i10;
            }
            if (this.f44171b) {
                if (c12 == '\n') {
                    this.f44171b = z11;
                    if (cVarL == null) {
                        break;
                        break;
                    }
                    if (cVarL.A()) {
                        cVarL = b(i12, c12, cVarL, charArray);
                    } else if (cVarL instanceof f) {
                        if (c12 == '}') {
                            cVarL.F(i12 - 1);
                        } else {
                            cVarL = b(i12, c12, cVarL, charArray);
                        }
                    } else if (cVarL instanceof androidx.constraintlayout.core.parser.a) {
                        z10 = cVarL instanceof i;
                        if (z10) {
                            j12 = cVarL.f44161b;
                            if (charArray[(int) j12] == c12) {
                                cVarL.J(j12 + 1);
                                cVarL.F(i12 - 1);
                            }
                        } else {
                            if (cVarL instanceof j) {
                                jVar = (j) cVarL;
                                if (!jVar.Q(c12, i12)) {
                                    throw new h("parsing incorrect token " + jVar.k() + " at line " + this.f44172c, jVar);
                                }
                            }
                            if (cVarL instanceof d) {
                                j10 = cVarL.f44161b;
                                c10 = charArray[(int) j10];
                                if (c10 != '\'') {
                                    cVarL.J(j10 + 1);
                                    cVarL.F(i12 - 1);
                                } else {
                                    cVarL.J(j10 + 1);
                                    cVarL.F(i12 - 1);
                                }
                            } else {
                                j10 = cVarL.f44161b;
                                c10 = charArray[(int) j10];
                                if (c10 != '\'') {
                                    cVarL.J(j10 + 1);
                                    cVarL.F(i12 - 1);
                                } else {
                                    cVarL.J(j10 + 1);
                                    cVarL.F(i12 - 1);
                                }
                            }
                            if (!cVarL.A()) {
                                j11 = i12 - 1;
                                cVarL.F(j11);
                                if (c12 != '}') {
                                    cVarL = cVarL.l();
                                    cVarL.F(j11);
                                    if (cVarL instanceof d) {
                                        cVarL = cVarL.l();
                                        cVarL.F(j11);
                                    }
                                } else {
                                    cVarL = cVarL.l();
                                    cVarL.F(j11);
                                    if (cVarL instanceof d) {
                                        cVarL = cVarL.l();
                                        cVarL.F(j11);
                                    }
                                }
                            }
                        }
                        if (!cVarL.A()) {
                        }
                    } else if (c12 == ']') {
                        cVarL.F(i12 - 1);
                    } else {
                        cVarL = b(i12, c12, cVarL, charArray);
                    }
                    i10 = i10;
                    if (!cVarL.A()) {
                    }
                } else {
                    i10 = i10;
                }
            } else {
                if (cVarL == null) {
                    break;
                }
                if (cVarL.A()) {
                    cVarL = b(i12, c12, cVarL, charArray);
                } else if (cVarL instanceof f) {
                    if (c12 == '}') {
                        cVarL.F(i12 - 1);
                    } else {
                        cVarL = b(i12, c12, cVarL, charArray);
                    }
                } else if (cVarL instanceof androidx.constraintlayout.core.parser.a) {
                    z10 = cVarL instanceof i;
                    if (z10) {
                        j12 = cVarL.f44161b;
                        if (charArray[(int) j12] == c12) {
                            cVarL.J(j12 + 1);
                            cVarL.F(i12 - 1);
                        }
                    } else {
                        if (cVarL instanceof j) {
                            jVar = (j) cVarL;
                            if (!jVar.Q(c12, i12)) {
                                throw new h("parsing incorrect token " + jVar.k() + " at line " + this.f44172c, jVar);
                            }
                        }
                        if ((cVarL instanceof d) || z10) {
                            j10 = cVarL.f44161b;
                            c10 = charArray[(int) j10];
                            if ((c10 != '\'' || c10 == '\"') && c10 == c12) {
                                cVarL.J(j10 + 1);
                                cVarL.F(i12 - 1);
                            }
                        }
                        if (!cVarL.A() && (c12 == '}' || c12 == ']' || c12 == ',' || c12 == ' ' || c12 == '\t' || c12 == '\r' || c12 == '\n' || c12 == ':')) {
                            j11 = i12 - 1;
                            cVarL.F(j11);
                            if (c12 != '}' || c12 == ']') {
                                cVarL = cVarL.l();
                                cVarL.F(j11);
                                if (cVarL instanceof d) {
                                    cVarL = cVarL.l();
                                    cVarL.F(j11);
                                }
                            }
                        }
                    }
                    if (!cVarL.A() && (!(cVarL instanceof d) || ((d) cVarL).f44157h.size() > 0)) {
                        cVarL = cVarL.l();
                    }
                } else if (c12 == ']') {
                    cVarL.F(i12 - 1);
                } else {
                    cVarL = b(i12, c12, cVarL, charArray);
                }
                i10 = i10;
                if (!cVarL.A()) {
                }
            }
            i12++;
            i10 = i10;
            z11 = false;
        }
        while (cVarL != null && !cVarL.A()) {
            if (cVarL instanceof i) {
                cVarL.J(((int) cVarL.f44161b) + 1);
            }
            cVarL.F(length - 1);
            cVarL = cVarL.l();
        }
        if (f44169d) {
            System.out.println("Root: " + fVarA0.L());
        }
        return fVarA0;
    }
}
