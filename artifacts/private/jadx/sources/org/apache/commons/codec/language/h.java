package org.apache.commons.codec.language;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class h implements nk.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f335416a = " ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f335417b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f335418c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f335419d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f335420e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f335421f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f335422g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f335423h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f335424i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f335425j = 11;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f335426k = 12;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f335427l = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f335428m = "ÀàÈèÌìÒòÙùÁáÉéÍíÓóÚúÝýÂâÊêÎîÔôÛûŶŷÃãÕõÑñÄäËëÏïÖöÜüŸÿÅåÇçŐőŰű";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f335429n = {"BB", "CC", "DD", "FF", "GG", "HH", "JJ", "KK", "LL", "MM", "NN", "PP", "QQ", "RR", "SS", "TT", "VV", "WW", "XX", "YY", "ZZ"};

    @Override // nk.g
    public final Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return f((String) obj);
        }
        throw new nk.h("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
    }

    String b(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        String[] strArr = {"\\-", "[&]", "\\'", "\\.", "[\\,]"};
        for (int i10 = 0; i10 < 5; i10++) {
            upperCase = upperCase.replaceAll(strArr[i10], "");
        }
        return j(upperCase).replaceAll("\\s+", "");
    }

    String c(String str) {
        int length = str.length();
        if (length <= 6) {
            return str;
        }
        return str.substring(0, 3) + str.substring(length - 3, length);
    }

    int d(int i10) {
        if (i10 <= 4) {
            return 5;
        }
        if (i10 <= 7) {
            return 4;
        }
        if (i10 <= 11) {
            return 3;
        }
        return i10 == 12 ? 2 : 1;
    }

    @Override // nk.j
    public final String f(String str) {
        return (str == null || "".equalsIgnoreCase(str) || " ".equalsIgnoreCase(str) || str.length() == 1) ? "" : c(k(l(b(str))));
    }

    public boolean g(String str, String str2) {
        if (str != null && !"".equalsIgnoreCase(str) && !" ".equalsIgnoreCase(str) && str2 != null && !"".equalsIgnoreCase(str2) && !" ".equalsIgnoreCase(str2) && str.length() != 1 && str2.length() != 1) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
            String strB = b(str);
            String strB2 = b(str2);
            String strL = l(strB);
            String strL2 = l(strB2);
            String strK = k(strL);
            String strK2 = k(strL2);
            String strC = c(strK);
            String strC2 = c(strK2);
            if (Math.abs(strC.length() - strC2.length()) >= 3) {
                return false;
            }
            if (i(strC, strC2) >= d(Math.abs(strC.length() + strC2.length()))) {
                return true;
            }
        }
        return false;
    }

    boolean h(String str) {
        if (!str.equalsIgnoreCase(androidx.exifinterface.media.a.T4) && !str.equalsIgnoreCase(androidx.exifinterface.media.a.X4) && !str.equalsIgnoreCase("O") && !str.equalsIgnoreCase("I") && !str.equalsIgnoreCase("U")) {
            return false;
        }
        return true;
    }

    int i(String str, String str2) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        int i10 = 0;
        while (i10 < charArray.length && i10 <= length2) {
            int i11 = i10 + 1;
            String strSubstring = str.substring(i10, i11);
            int i12 = length - i10;
            String strSubstring2 = str.substring(i12, i12 + 1);
            String strSubstring3 = str2.substring(i10, i11);
            int i13 = length2 - i10;
            String strSubstring4 = str2.substring(i13, i13 + 1);
            if (strSubstring.equals(strSubstring3)) {
                charArray[i10] = ' ';
                charArray2[i10] = ' ';
            }
            if (strSubstring2.equals(strSubstring4)) {
                charArray[i12] = ' ';
                charArray2[i13] = ' ';
            }
            i10 = i11;
        }
        String strReplaceAll = new String(charArray).replaceAll("\\s+", "");
        String strReplaceAll2 = new String(charArray2).replaceAll("\\s+", "");
        return strReplaceAll.length() > strReplaceAll2.length() ? Math.abs(6 - strReplaceAll.length()) : Math.abs(6 - strReplaceAll2.length());
    }

    String j(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            int iIndexOf = f335428m.indexOf(cCharAt);
            if (iIndexOf > -1) {
                sb2.append(f335427l.charAt(iIndexOf));
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    String k(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        for (String str2 : f335429n) {
            if (upperCase.contains(str2)) {
                upperCase = upperCase.replace(str2, str2.substring(0, 1));
            }
        }
        return upperCase;
    }

    String l(String str) {
        String strSubstring = str.substring(0, 1);
        String strReplaceAll = str.replaceAll(androidx.exifinterface.media.a.X4, "").replaceAll(androidx.exifinterface.media.a.T4, "").replaceAll("I", "").replaceAll("O", "").replaceAll("U", "").replaceAll("\\s{2,}\\b", " ");
        if (!h(strSubstring)) {
            return strReplaceAll;
        }
        return strSubstring + strReplaceAll;
    }
}
