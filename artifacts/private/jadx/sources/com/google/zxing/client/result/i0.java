package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f130213f = Pattern.compile("[IOQ]");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f130214g = Pattern.compile("[A-Z0-9]{17}");

    private static char q(int i10) {
        if (i10 < 10) {
            return (char) (i10 + 48);
        }
        if (i10 == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }

    private static boolean r(CharSequence charSequence) {
        int i10 = 0;
        int iW = 0;
        while (i10 < charSequence.length()) {
            int i11 = i10 + 1;
            iW += w(i11) * v(charSequence.charAt(i10));
            i10 = i11;
        }
        return charSequence.charAt(8) == q(iW % 11);
    }

    private static String s(CharSequence charSequence) {
        char cCharAt = charSequence.charAt(0);
        char cCharAt2 = charSequence.charAt(1);
        if (cCharAt != '9') {
            if (cCharAt != 'S') {
                if (cCharAt != 'Z') {
                    switch (cCharAt) {
                        case '1':
                        case '4':
                        case '5':
                            return "US";
                        case '2':
                            return "CA";
                        case '3':
                            if (cCharAt2 >= 'A' && cCharAt2 <= 'W') {
                                return "MX";
                            }
                            break;
                        default:
                            switch (cCharAt) {
                                case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                                    if (cCharAt2 >= 'A' && cCharAt2 <= 'T') {
                                        return "JP";
                                    }
                                    break;
                                case 'K':
                                    if (cCharAt2 >= 'L' && cCharAt2 <= 'R') {
                                        return "KO";
                                    }
                                    break;
                                case 'L':
                                    return "CN";
                                case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                                    if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                                        return "IN";
                                    }
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case com.planner5d.library.engine.input.f.b.f160702k0 /* 86 */:
                                            if (cCharAt2 >= 'F' && cCharAt2 <= 'R') {
                                                return "FR";
                                            }
                                            if (cCharAt2 >= 'S' && cCharAt2 <= 'W') {
                                                return "ES";
                                            }
                                            break;
                                        case com.planner5d.library.engine.input.f.b.f160690g0 /* 87 */:
                                            return "DE";
                                        case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                                            if (cCharAt2 == '0' || (cCharAt2 >= '3' && cCharAt2 <= '9')) {
                                                return "RU";
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else if (cCharAt2 >= 'A' && cCharAt2 <= 'R') {
                    return "IT";
                }
            } else {
                if (cCharAt2 >= 'A' && cCharAt2 <= 'M') {
                    return "UK";
                }
                if (cCharAt2 >= 'N' && cCharAt2 <= 'T') {
                    return "DE";
                }
            }
        } else if ((cCharAt2 >= 'A' && cCharAt2 <= 'E') || (cCharAt2 >= '3' && cCharAt2 <= '9')) {
            return "BR";
        }
        return null;
    }

    private static int t(char c10) {
        if (c10 >= 'E' && c10 <= 'H') {
            return c10 + 1915;
        }
        if (c10 >= 'J' && c10 <= 'N') {
            return c10 + 1914;
        }
        if (c10 == 'P') {
            return 1993;
        }
        if (c10 >= 'R' && c10 <= 'T') {
            return c10 + 1912;
        }
        if (c10 >= 'V' && c10 <= 'Y') {
            return c10 + 1911;
        }
        if (c10 >= '1' && c10 <= '9') {
            return c10 + 1952;
        }
        if (c10 < 'A' || c10 > 'D') {
            throw new IllegalArgumentException();
        }
        return c10 + 1945;
    }

    private static int v(char c10) {
        if (c10 >= 'A' && c10 <= 'I') {
            return c10 - '@';
        }
        if (c10 >= 'J' && c10 <= 'R') {
            return c10 - 'I';
        }
        if (c10 >= 'S' && c10 <= 'Z') {
            return c10 - 'Q';
        }
        if (c10 < '0' || c10 > '9') {
            throw new IllegalArgumentException();
        }
        return c10 - org.locationtech.jts.geom.l.f338160j;
    }

    private static int w(int i10) {
        if (i10 > 0 && i10 <= 7) {
            return 9 - i10;
        }
        if (i10 == 8) {
            return 10;
        }
        if (i10 == 9) {
            return 0;
        }
        if (i10 < 10 || i10 > 17) {
            throw new IllegalArgumentException();
        }
        return 19 - i10;
    }

    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public h0 k(com.google.zxing.r rVar) {
        if (rVar.b() != com.google.zxing.a.CODE_39) {
            return null;
        }
        String strTrim = f130213f.matcher(rVar.g()).replaceAll("").trim();
        if (!f130214g.matcher(strTrim).matches()) {
            return null;
        }
        try {
            if (!r(strTrim)) {
                return null;
            }
            String strSubstring = strTrim.substring(0, 3);
            return new h0(strTrim, strSubstring, strTrim.substring(3, 9), strTrim.substring(9, 17), s(strSubstring), strTrim.substring(3, 8), t(strTrim.charAt(9)), strTrim.charAt(10), strTrim.substring(11));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
