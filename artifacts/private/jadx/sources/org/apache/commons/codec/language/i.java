package org.apache.commons.codec.language;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class i implements nk.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f335430b = "AEIOU";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f335431c = "EIY";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f335432d = "CSPTG";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f335433a = 4;

    private boolean c(int i10, int i11) {
        return i11 + 1 == i10;
    }

    private boolean g(StringBuilder sb2, int i10, char c10) {
        return i10 >= 0 && i10 < sb2.length() - 1 && sb2.charAt(i10 + 1) == c10;
    }

    private boolean h(StringBuilder sb2, int i10, char c10) {
        return i10 > 0 && i10 < sb2.length() && sb2.charAt(i10 - 1) == c10;
    }

    private boolean i(StringBuilder sb2, int i10) {
        return f335430b.indexOf(sb2.charAt(i10)) >= 0;
    }

    private boolean k(StringBuilder sb2, int i10, String str) {
        if (i10 < 0 || (str.length() + i10) - 1 >= sb2.length()) {
            return false;
        }
        return sb2.substring(i10, str.length() + i10).equals(str);
    }

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return j((String) obj);
        }
        throw new nk.h("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }

    public int b() {
        return this.f335433a;
    }

    public boolean d(String str, String str2) {
        return j(str).equals(j(str2));
    }

    @Override // nk.j
    public String f(String str) {
        return j(str);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0216  */
    public String j(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return "";
        }
        boolean z10 = true;
        if (length == 1) {
            return str.toUpperCase(Locale.ENGLISH);
        }
        char[] charArray = str.toUpperCase(Locale.ENGLISH).toCharArray();
        StringBuilder sb2 = new StringBuilder(40);
        StringBuilder sb3 = new StringBuilder(10);
        int i10 = 0;
        char c10 = charArray[0];
        if (c10 != 'A') {
            if (c10 == 'G' || c10 == 'K' || c10 == 'P') {
                if (charArray[1] == 'N') {
                    sb2.append(charArray, 1, charArray.length - 1);
                } else {
                    sb2.append(charArray);
                }
            } else if (c10 == 'W') {
                char c11 = charArray[1];
                if (c11 == 'R') {
                    sb2.append(charArray, 1, charArray.length - 1);
                } else if (c11 == 'H') {
                    sb2.append(charArray, 1, charArray.length - 1);
                    sb2.setCharAt(0, 'W');
                } else {
                    sb2.append(charArray);
                }
            } else if (c10 != 'X') {
                sb2.append(charArray);
            } else {
                charArray[0] = 'S';
                sb2.append(charArray);
            }
        } else if (charArray[1] == 'E') {
            sb2.append(charArray, 1, charArray.length - 1);
        } else {
            sb2.append(charArray);
        }
        int length2 = sb2.length();
        while (sb3.length() < b() && i10 < length2) {
            char cCharAt = sb2.charAt(i10);
            if (cCharAt == 'C' || !h(sb2, i10, cCharAt)) {
                switch (cCharAt) {
                    case 'A':
                    case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                    case com.planner5d.library.engine.input.f.b.f160725s /* 73 */:
                    case com.planner5d.library.engine.input.f.b.X /* 79 */:
                    case 'U':
                        if (i10 == 0) {
                            sb3.append(cCharAt);
                        }
                        break;
                    case 'B':
                        if (!h(sb2, i10, ni.f.f333370g) || !c(length2, i10)) {
                            sb3.append(cCharAt);
                        }
                        break;
                    case 'C':
                        if (!h(sb2, i10, 'S') || c(length2, i10) || f335431c.indexOf(sb2.charAt(i10 + 1)) < 0) {
                            if (k(sb2, i10, "CIA")) {
                                sb3.append('X');
                            } else if (!c(length2, i10) && f335431c.indexOf(sb2.charAt(i10 + 1)) >= 0) {
                                sb3.append('S');
                            } else if ((h(sb2, i10, 'S') && g(sb2, i10, 'H')) || !g(sb2, i10, 'H')) {
                                sb3.append('K');
                            } else if (i10 == 0 && length2 >= 3 && i(sb2, 2)) {
                                sb3.append('K');
                            } else {
                                sb3.append('X');
                            }
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        if (!c(length2, i10 + 1) && g(sb2, i10, 'G')) {
                            int i11 = i10 + 2;
                            if (f335431c.indexOf(sb2.charAt(i11)) < 0) {
                                sb3.append(org.locationtech.jts.geom.l.f338158h);
                            } else {
                                sb3.append('J');
                                i10 = i11;
                            }
                        } else {
                            sb3.append(org.locationtech.jts.geom.l.f338158h);
                        }
                        break;
                    case 'F':
                    case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                    case 'L':
                    case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                    case 'N':
                    case com.planner5d.library.engine.input.f.b.f160705l0 /* 82 */:
                        sb3.append(cCharAt);
                        break;
                    case 'G':
                        int i12 = i10 + 1;
                        if ((!c(length2, i12) || !g(sb2, i10, 'H')) && ((c(length2, i12) || !g(sb2, i10, 'H') || i(sb2, i10 + 2)) && (i10 <= 0 || (!k(sb2, i10, "GN") && !k(sb2, i10, "GNED"))))) {
                            boolean zH = h(sb2, i10, 'G');
                            if (c(length2, i10) || f335431c.indexOf(sb2.charAt(i12)) < 0 || zH) {
                                sb3.append('K');
                            } else {
                                sb3.append('J');
                            }
                        }
                        break;
                    case 'H':
                        if (!c(length2, i10) && ((i10 <= 0 || f335432d.indexOf(sb2.charAt(i10 - 1)) < 0) && i(sb2, i10 + 1))) {
                            sb3.append('H');
                        }
                        break;
                    case 'K':
                        if (i10 <= 0 || !h(sb2, i10, 'C')) {
                            sb3.append(cCharAt);
                        }
                        break;
                    case 'P':
                        if (!g(sb2, i10, 'H')) {
                            sb3.append(cCharAt);
                        } else {
                            sb3.append(org.locationtech.jts.geom.l.f338157g);
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160732u0 /* 81 */:
                        sb3.append('K');
                        break;
                    case com.planner5d.library.engine.input.f.b.f160717p0 /* 83 */:
                        if (k(sb2, i10, "SH") || k(sb2, i10, "SIO") || k(sb2, i10, "SIA")) {
                            sb3.append('X');
                        } else {
                            sb3.append('S');
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.B0 /* 84 */:
                        if (k(sb2, i10, "TIA") || k(sb2, i10, "TIO")) {
                            sb3.append('X');
                        } else if (!k(sb2, i10, "TCH")) {
                            if (!k(sb2, i10, "TH")) {
                                sb3.append(org.locationtech.jts.geom.l.f338158h);
                            } else {
                                sb3.append(org.locationtech.jts.geom.l.f338160j);
                            }
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160702k0 /* 86 */:
                        sb3.append(org.locationtech.jts.geom.l.f338157g);
                        break;
                    case com.planner5d.library.engine.input.f.b.f160690g0 /* 87 */:
                    case 'Y':
                        if (!c(length2, i10) && i(sb2, i10 + 1)) {
                            sb3.append(cCharAt);
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                        sb3.append('K');
                        sb3.append('S');
                        break;
                    case 'Z':
                        sb3.append('S');
                        break;
                }
                i10++;
            } else {
                i10++;
            }
            if (sb3.length() > b()) {
                sb3.setLength(b());
            }
            z10 = z10;
        }
        return sb3.toString();
    }

    public void l(int i10) {
        this.f335433a = i10;
    }
}
