package io.grpc.okhttp.internal;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes13.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f290471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f290472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f290473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f290474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f290475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f290476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char[] f290477g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f290471a = name;
        this.f290472b = name.length();
    }

    private String a() {
        int i10;
        int i11;
        char c10;
        int i12 = this.f290473c;
        this.f290474d = i12;
        this.f290475e = i12;
        while (true) {
            int i13 = this.f290473c;
            if (i13 >= this.f290472b) {
                char[] cArr = this.f290477g;
                int i14 = this.f290474d;
                return new String(cArr, i14, this.f290475e - i14);
            }
            char[] cArr2 = this.f290477g;
            char c11 = cArr2[i13];
            if (c11 != ' ') {
                if (c11 != ';') {
                    if (c11 == '\\') {
                        int i15 = this.f290475e;
                        this.f290475e = i15 + 1;
                        cArr2[i15] = d();
                        this.f290473c++;
                    } else if (c11 != '+' && c11 != ',') {
                        int i16 = this.f290475e;
                        this.f290475e = i16 + 1;
                        cArr2[i16] = c11;
                        this.f290473c = i13 + 1;
                    }
                }
                int i17 = this.f290474d;
                return new String(cArr2, i17, this.f290475e - i17);
            }
            int i18 = this.f290475e;
            this.f290476f = i18;
            this.f290473c = i13 + 1;
            this.f290475e = i18 + 1;
            cArr2[i18] = ' ';
            while (true) {
                i10 = this.f290473c;
                i11 = this.f290472b;
                if (i10 >= i11) {
                    break;
                }
                char[] cArr3 = this.f290477g;
                if (cArr3[i10] != ' ') {
                    break;
                }
                int i19 = this.f290475e;
                this.f290475e = i19 + 1;
                cArr3[i19] = ' ';
                this.f290473c = i10 + 1;
            }
            if (i10 == i11 || (c10 = this.f290477g[i10]) == ',' || c10 == '+' || c10 == ';') {
                char[] cArr4 = this.f290477g;
                int i20 = this.f290474d;
                return new String(cArr4, i20, this.f290476f - i20);
            }
        }
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 >= this.f290472b) {
            throw new IllegalStateException("Malformed DN: " + this.f290471a);
        }
        char[] cArr = this.f290477g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - org.locationtech.jts.geom.l.f338160j;
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f290471a);
            }
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - org.locationtech.jts.geom.l.f338160j;
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f290471a);
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    private char d() {
        int i10 = this.f290473c + 1;
        this.f290473c = i10;
        if (i10 == this.f290472b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f290471a);
        }
        char c10 = this.f290477g[i10];
        if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
            switch (c10) {
                default:
                    switch (c10) {
                        case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                        case '<':
                        case '=':
                        case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                            break;
                        default:
                            return e();
                    }
                case '*':
                case '+':
                case ',':
                    return c10;
            }
        }
        return c10;
    }

    private char e() {
        int i10;
        int i11;
        int iC = c(this.f290473c);
        this.f290473c++;
        if (iC < 128) {
            return (char) iC;
        }
        if (iC < 192 || iC > 247) {
            return '?';
        }
        if (iC <= 223) {
            i10 = iC & 31;
            i11 = 1;
        } else if (iC <= 239) {
            i10 = iC & 15;
            i11 = 2;
        } else {
            i10 = iC & 7;
            i11 = 3;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f290473c;
            int i14 = i13 + 1;
            this.f290473c = i14;
            if (i14 == this.f290472b || this.f290477g[i14] != '\\') {
                return '?';
            }
            int i15 = i13 + 2;
            this.f290473c = i15;
            int iC2 = c(i15);
            this.f290473c++;
            if ((iC2 & 192) != 128) {
                return '?';
            }
            i10 = (i10 << 6) + (iC2 & 63);
        }
        return (char) i10;
    }

    private String f() {
        char[] cArr;
        char c10;
        int i10 = this.f290473c;
        if (i10 + 4 >= this.f290472b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f290471a);
        }
        this.f290474d = i10;
        this.f290473c = i10 + 1;
        while (true) {
            int i11 = this.f290473c;
            if (i11 == this.f290472b || (c10 = (cArr = this.f290477g)[i11]) == '+' || c10 == ',' || c10 == ';') {
                this.f290475e = i11;
                break;
            }
            if (c10 == ' ') {
                this.f290475e = i11;
                this.f290473c = i11 + 1;
                while (true) {
                    int i12 = this.f290473c;
                    if (i12 >= this.f290472b || this.f290477g[i12] != ' ') {
                        break;
                    }
                    this.f290473c = i12 + 1;
                }
            } else {
                if (c10 >= 'A' && c10 <= 'F') {
                    cArr[i11] = (char) (c10 + ' ');
                }
                this.f290473c = i11 + 1;
            }
        }
        int i13 = this.f290475e;
        int i14 = this.f290474d;
        int i15 = i13 - i14;
        if (i15 < 5 || (i15 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f290471a);
        }
        int i16 = i15 / 2;
        byte[] bArr = new byte[i16];
        int i17 = i14 + 1;
        for (int i18 = 0; i18 < i16; i18++) {
            bArr[i18] = (byte) c(i17);
            i17 += 2;
        }
        return new String(this.f290477g, this.f290474d, i15);
    }

    private String g() {
        int i10;
        int i11;
        int i12;
        int i13;
        char c10;
        int i14;
        int i15;
        char c11;
        char c12;
        while (true) {
            i10 = this.f290473c;
            i11 = this.f290472b;
            if (i10 >= i11 || this.f290477g[i10] != ' ') {
                break;
            }
            this.f290473c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f290474d = i10;
        this.f290473c = i10 + 1;
        while (true) {
            i12 = this.f290473c;
            i13 = this.f290472b;
            if (i12 >= i13 || (c12 = this.f290477g[i12]) == '=' || c12 == ' ') {
                break;
            }
            this.f290473c = i12 + 1;
        }
        if (i12 >= i13) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f290471a);
        }
        this.f290475e = i12;
        if (this.f290477g[i12] == ' ') {
            while (true) {
                i14 = this.f290473c;
                i15 = this.f290472b;
                if (i14 >= i15 || (c11 = this.f290477g[i14]) == '=' || c11 != ' ') {
                    break;
                }
                this.f290473c = i14 + 1;
            }
            if (this.f290477g[i14] != '=' || i14 == i15) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f290471a);
            }
        }
        this.f290473c++;
        while (true) {
            int i16 = this.f290473c;
            if (i16 >= this.f290472b || this.f290477g[i16] != ' ') {
                break;
            }
            this.f290473c = i16 + 1;
        }
        int i17 = this.f290475e;
        int i18 = this.f290474d;
        if (i17 - i18 > 4) {
            char[] cArr = this.f290477g;
            if (cArr[i18 + 3] == '.' && (((c10 = cArr[i18]) == 'O' || c10 == 'o') && ((cArr[i18 + 1] == 'I' || cArr[i18 + 1] == 'i') && (cArr[i18 + 2] == 'D' || cArr[i18 + 2] == 'd')))) {
                this.f290474d = i18 + 4;
            }
        }
        char[] cArr2 = this.f290477g;
        int i19 = this.f290474d;
        return new String(cArr2, i19, i17 - i19);
    }

    private String h() {
        int i10 = this.f290473c + 1;
        this.f290473c = i10;
        this.f290474d = i10;
        this.f290475e = i10;
        while (true) {
            int i11 = this.f290473c;
            if (i11 == this.f290472b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f290471a);
            }
            char[] cArr = this.f290477g;
            char c10 = cArr[i11];
            if (c10 == '\"') {
                this.f290473c = i11 + 1;
                while (true) {
                    int i12 = this.f290473c;
                    if (i12 >= this.f290472b || this.f290477g[i12] != ' ') {
                        break;
                    }
                    this.f290473c = i12 + 1;
                }
                char[] cArr2 = this.f290477g;
                int i13 = this.f290474d;
                return new String(cArr2, i13, this.f290475e - i13);
            }
            if (c10 == '\\') {
                cArr[this.f290475e] = d();
            } else {
                cArr[this.f290475e] = c10;
            }
            this.f290473c++;
            this.f290475e++;
        }
    }

    public String b(String str) {
        String strH;
        this.f290473c = 0;
        this.f290474d = 0;
        this.f290475e = 0;
        this.f290476f = 0;
        this.f290477g = this.f290471a.toCharArray();
        String strG = g();
        if (strG == null) {
            return null;
        }
        do {
            int i10 = this.f290473c;
            if (i10 == this.f290472b) {
                return null;
            }
            char c10 = this.f290477g[i10];
            if (c10 == '\"') {
                strH = h();
            } else if (c10 != '#') {
                strH = (c10 == '+' || c10 == ',' || c10 == ';') ? "" : a();
            } else {
                strH = f();
            }
            if (str.equalsIgnoreCase(strG)) {
                return strH;
            }
            int i11 = this.f290473c;
            if (i11 >= this.f290472b) {
                return null;
            }
            char c11 = this.f290477g[i11];
            if (c11 != ',' && c11 != ';' && c11 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f290471a);
            }
            this.f290473c = i11 + 1;
            strG = g();
        } while (strG != null);
        throw new IllegalStateException("Malformed DN: " + this.f290471a);
    }
}
