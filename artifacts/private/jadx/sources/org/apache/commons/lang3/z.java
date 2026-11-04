package org.apache.commons.lang3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f337562a = " ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f337563b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f337564c = "\n";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f337565d = "\r";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f337566e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f337567f = 8192;

    public static boolean A(CharSequence charSequence, char... cArr) {
        if (charSequence != null && cArr != null) {
            int length = charSequence.length();
            int i10 = length - 1;
            int length2 = cArr.length;
            int i11 = length2 - 1;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = charSequence.charAt(i12);
                for (int i13 = 0; i13 < length2; i13++) {
                    if (cArr[i13] == cCharAt) {
                        if (Character.isHighSurrogate(cCharAt)) {
                            if (i13 == i11) {
                                return false;
                            }
                            if (i12 >= i10 || cArr[i13 + 1] != charSequence.charAt(i12 + 1)) {
                            }
                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean A0(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private static int A1(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        int length = -1;
        if (charSequence != null && charSequence2 != null && i10 > 0) {
            int i11 = 0;
            if (charSequence2.length() == 0) {
                if (z10) {
                    return charSequence.length();
                }
                return 0;
            }
            length = z10 ? charSequence.length() : -1;
            do {
                length = z10 ? h.d(charSequence, charSequence2, length - 1) : h.b(charSequence, charSequence2, length + 1);
                if (length < 0) {
                    break;
                }
                i11++;
            } while (i11 < i10);
        }
        return length;
    }

    public static String[] A2(String str) {
        return F2(str, null, -1, true);
    }

    public static boolean B(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return false;
        }
        return C(charSequence, str.toCharArray());
    }

    public static boolean B0(CharSequence charSequence) {
        if (!A0(charSequence) && charSequence.length() != 1) {
            int length = charSequence.length();
            boolean z10 = false;
            boolean z11 = false;
            for (int i10 = 0; i10 < length; i10++) {
                if (z10 && z11) {
                    return true;
                }
                if (Character.isUpperCase(charSequence.charAt(i10))) {
                    z10 = true;
                } else if (Character.isLowerCase(charSequence.charAt(i10))) {
                    z11 = true;
                }
            }
            if (z10 && z11) {
                return true;
            }
        }
        return false;
    }

    public static String B1(String str, String str2, int i10, int i11) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        int length = str.length();
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > length) {
            i10 = length;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 <= length) {
            length = i11;
        }
        if (i10 > length) {
            int i12 = length;
            length = i10;
            i10 = i12;
        }
        return str.substring(0, i10) + str2 + str.substring(length);
    }

    public static String[] B2(String str, char c10) {
        return E2(str, c10, true);
    }

    public static boolean C(CharSequence charSequence, char... cArr) {
        if (cArr != null && charSequence != null) {
            if (charSequence.length() == 0) {
                return true;
            }
            if (cArr.length == 0) {
                return false;
            }
            if (j0(charSequence, cArr) == -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean C0(CharSequence... charSequenceArr) {
        return !w0(charSequenceArr);
    }

    private static String C1(String str, CharSequence charSequence, boolean z10, CharSequence... charSequenceArr) {
        if (str != null && !A0(charSequence) && !H2(str, charSequence, z10)) {
            if (charSequenceArr != null && charSequenceArr.length > 0) {
                for (CharSequence charSequence2 : charSequenceArr) {
                    if (H2(str, charSequence2, z10)) {
                        return str;
                    }
                }
            }
            str = charSequence.toString() + str;
        }
        return str;
    }

    public static String[] C2(String str, String str2) {
        return F2(str, str2, -1, true);
    }

    public static boolean D(CharSequence charSequence) {
        if (A0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (Character.isWhitespace(charSequence.charAt(i10))) {
                return true;
            }
        }
        return false;
    }

    public static boolean D0(CharSequence... charSequenceArr) {
        return !x0(charSequenceArr);
    }

    public static String D1(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return C1(str, charSequence, false, charSequenceArr);
    }

    public static String[] D2(String str, String str2, int i10) {
        return F2(str, str2, i10, true);
    }

    private static void E(StringBuilder sb2) {
        for (int i10 = 0; i10 < sb2.length(); i10++) {
            if (sb2.charAt(i10) == 321) {
                sb2.deleteCharAt(i10);
                sb2.insert(i10, 'L');
            } else if (sb2.charAt(i10) == 322) {
                sb2.deleteCharAt(i10);
                sb2.insert(i10, 'l');
            }
        }
    }

    public static boolean E0(CharSequence charSequence) {
        return !z0(charSequence);
    }

    public static String E1(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return C1(str, charSequence, true, charSequenceArr);
    }

    private static String[] E2(String str, char c10, boolean z10) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return c.f337037c;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        while (i10 < length) {
            if (str.charAt(i10) == c10) {
                if (z11 || z10) {
                    arrayList.add(str.substring(i11, i10));
                    z11 = false;
                    z12 = true;
                }
                i11 = i10 + 1;
                i10 = i11;
            } else {
                i10++;
                z12 = false;
                z11 = true;
            }
        }
        if (z11 || (z10 && z12)) {
            arrayList.add(str.substring(i11, i10));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int F(CharSequence charSequence, char c10) {
        if (A0(charSequence)) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (c10 == charSequence.charAt(i11)) {
                i10++;
            }
        }
        return i10;
    }

    public static boolean F0(CharSequence charSequence) {
        return !A0(charSequence);
    }

    public static String F1(String str, char c10) {
        if (A0(str) || str.indexOf(c10) == -1) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i10 = 0;
        for (char c11 : charArray) {
            if (c11 != c10) {
                charArray[i10] = c11;
                i10++;
            }
        }
        return new String(charArray, 0, i10);
    }

    private static String[] F2(String str, String str2, int i10, boolean z10) {
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        boolean z13;
        boolean z14;
        int i14;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return c.f337037c;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i13 = 0;
            z13 = false;
            z14 = false;
            i14 = 0;
            int i15 = 1;
            while (i13 < length) {
                if (Character.isWhitespace(str.charAt(i13))) {
                    if (z13 || z10) {
                        int i16 = i15 + 1;
                        if (i15 == i10) {
                            i13 = length;
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        arrayList.add(str.substring(i14, i13));
                        i15 = i16;
                        z13 = false;
                    }
                    i14 = i13 + 1;
                    i13 = i14;
                } else {
                    i13++;
                    z14 = false;
                    z13 = true;
                }
            }
        } else {
            if (str2.length() == 1) {
                char cCharAt = str2.charAt(0);
                i11 = 0;
                z11 = false;
                z12 = false;
                i12 = 0;
                int i17 = 1;
                while (i11 < length) {
                    if (str.charAt(i11) == cCharAt) {
                        if (z11 || z10) {
                            int i18 = i17 + 1;
                            if (i17 == i10) {
                                i11 = length;
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            arrayList.add(str.substring(i12, i11));
                            i17 = i18;
                            z11 = false;
                        }
                        i12 = i11 + 1;
                        i11 = i12;
                    } else {
                        i11++;
                        z12 = false;
                        z11 = true;
                    }
                }
            } else {
                i11 = 0;
                z11 = false;
                z12 = false;
                i12 = 0;
                int i19 = 1;
                while (i11 < length) {
                    if (str2.indexOf(str.charAt(i11)) >= 0) {
                        if (z11 || z10) {
                            int i20 = i19 + 1;
                            if (i19 == i10) {
                                i11 = length;
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            arrayList.add(str.substring(i12, i11));
                            i19 = i20;
                            z11 = false;
                        }
                        i12 = i11 + 1;
                        i11 = i12;
                    } else {
                        i11++;
                        z12 = false;
                        z11 = true;
                    }
                }
            }
            i13 = i11;
            z13 = z11;
            z14 = z12;
            i14 = i12;
        }
        if (z13 || (z10 && z14)) {
            arrayList.add(str.substring(i14, i13));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int G(CharSequence charSequence, CharSequence charSequence2) {
        int length = 0;
        if (A0(charSequence) || A0(charSequence2)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            int iB = h.b(charSequence, charSequence2, length);
            if (iB == -1) {
                return i10;
            }
            i10++;
            length = iB + charSequence2.length();
        }
    }

    public static boolean G0(CharSequence charSequence) {
        if (A0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String G1(String str, String str2) {
        if (!A0(str) && !A0(str2)) {
            str = T1(str, str2, "", -1);
        }
        return str;
    }

    public static boolean G2(CharSequence charSequence, CharSequence charSequence2) {
        return H2(charSequence, charSequence2, false);
    }

    public static <T extends CharSequence> T H(T t10, T t11) {
        return z0(t10) ? t11 : t10;
    }

    public static boolean H0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(charSequence.charAt(i10)) && charSequence.charAt(i10) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String H1(String str, String str2) {
        return V1(str, str2, "");
    }

    private static boolean H2(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return h.e(charSequence, z10, 0, charSequence2, 0, charSequence2.length());
    }

    public static <T extends CharSequence> T I(T t10, T t11) {
        return A0(t10) ? t11 : t10;
    }

    public static boolean I0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isWhitespace(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String I1(String str, String str2) {
        return (A0(str) || A0(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static boolean I2(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!A0(charSequence) && !c.H0(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (G2(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String J(String str) {
        if (str == null) {
            str = "";
        }
        return str;
    }

    public static String J0(Iterable<?> iterable, char c10) {
        if (iterable != null) {
            return L0(iterable.iterator(), c10);
        }
        int i10 = 3 & 0;
        return null;
    }

    public static String J1(String str, String str2) {
        return (A0(str) || A0(str2) || !Q(str, str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static boolean J2(CharSequence charSequence, CharSequence charSequence2) {
        return H2(charSequence, charSequence2, true);
    }

    public static String K(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static String K0(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return M0(iterable.iterator(), str);
    }

    public static String K1(String str, String str2) {
        return b2(str, str2, "");
    }

    public static String K2(String str) {
        return L2(str, null);
    }

    public static String L(String str) {
        if (A0(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isWhitespace(str.charAt(i11))) {
                cArr[i10] = str.charAt(i11);
                i10++;
            }
        }
        return i10 == length ? str : new String(cArr, 0, i10);
    }

    public static String L0(Iterator<?> it, char c10) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb2 = new StringBuilder(256);
        if (next != null) {
            sb2.append(next);
        }
        while (it.hasNext()) {
            sb2.append(c10);
            Object next2 = it.next();
            if (next2 != null) {
                sb2.append(next2);
            }
        }
        return sb2.toString();
    }

    public static String L1(String str, String str2) {
        if (!A0(str) && !A0(str2)) {
            str = d2(str, str2, "", -1);
        }
        return str;
    }

    public static String L2(String str, String str2) {
        return A0(str) ? str : P2(Q2(str, str2), str2);
    }

    public static String M(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int iK0 = k0(str, str2);
        return iK0 == -1 ? "" : str2.substring(iK0);
    }

    public static String M0(Iterator<?> it, String str) {
        if (it == null) {
            int i10 = 6 >> 0;
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb2 = new StringBuilder(256);
        if (next != null) {
            sb2.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb2.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb2.append(next2);
            }
        }
        return sb2.toString();
    }

    public static String M1(String str, String str2) {
        return g2(str, str2, "");
    }

    public static String M2(String str) {
        if (str == null) {
            return null;
        }
        Pattern patternCompile = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        StringBuilder sb2 = new StringBuilder(Normalizer.normalize(str, Normalizer.Form.NFD));
        E(sb2);
        return patternCompile.matcher(sb2).replaceAll("");
    }

    public static boolean N(CharSequence charSequence, CharSequence charSequence2) {
        return O(charSequence, charSequence2, false);
    }

    public static String N0(byte[] bArr, char c10) {
        if (bArr == null) {
            return null;
        }
        return O0(bArr, c10, 0, bArr.length);
    }

    public static String N1(String str, String str2) {
        if (!A0(str) && !A0(str2) && str.startsWith(str2)) {
            str = str.substring(str2.length());
        }
        return str;
    }

    public static String[] N2(String... strArr) {
        return O2(strArr, null);
    }

    private static boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return h.e(charSequence, z10, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
    }

    public static String O0(byte[] bArr, char c10, int i10, int i11) {
        if (bArr == null) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(c10);
            }
            sb2.append((int) bArr[i13]);
        }
        return sb2.toString();
    }

    public static String O1(String str, String str2) {
        if (!A0(str) && !A0(str2) && J2(str, str2)) {
            str = str.substring(str2.length());
        }
        return str;
    }

    public static String[] O2(String[] strArr, String str) {
        int length;
        if (strArr == null || (length = strArr.length) == 0) {
            return strArr;
        }
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr2[i10] = L2(strArr[i10], str);
        }
        return strArr2;
    }

    public static boolean P(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!A0(charSequence) && !c.H0(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (N(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String P0(char[] cArr, char c10) {
        if (cArr == null) {
            return null;
        }
        return Q0(cArr, c10, 0, cArr.length);
    }

    public static String P1(char c10, int i10) {
        if (i10 <= 0) {
            return "";
        }
        char[] cArr = new char[i10];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            cArr[i11] = c10;
        }
        return new String(cArr);
    }

    public static String P2(String str, String str2) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            if (str2 == null) {
                while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                    length--;
                }
            } else {
                if (str2.isEmpty()) {
                    return str;
                }
                while (length != 0 && str2.indexOf(str.charAt(length - 1)) != -1) {
                    length--;
                }
            }
            str = str.substring(0, length);
        }
        return str;
    }

    public static boolean Q(CharSequence charSequence, CharSequence charSequence2) {
        return O(charSequence, charSequence2, true);
    }

    public static String Q0(char[] cArr, char c10, int i10, int i11) {
        if (cArr == null) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(c10);
            }
            sb2.append(cArr[i13]);
        }
        return sb2.toString();
    }

    public static String Q1(String str, int i10) {
        if (str == null) {
            return null;
        }
        if (i10 <= 0) {
            return "";
        }
        int length = str.length();
        if (i10 != 1 && length != 0) {
            if (length == 1 && i10 <= 8192) {
                return P1(str.charAt(0), i10);
            }
            int i11 = length * i10;
            if (length != 1) {
                if (length != 2) {
                    StringBuilder sb2 = new StringBuilder(i11);
                    for (int i12 = 0; i12 < i10; i12++) {
                        sb2.append(str);
                    }
                    return sb2.toString();
                }
                char cCharAt = str.charAt(0);
                char cCharAt2 = str.charAt(1);
                char[] cArr = new char[i11];
                for (int i13 = (i10 * 2) - 2; i13 >= 0; i13 -= 2) {
                    cArr[i13] = cCharAt;
                    cArr[i13 + 1] = cCharAt2;
                }
                return new String(cArr);
            }
            str = P1(str.charAt(0), i10);
        }
        return str;
    }

    public static String Q2(String str, String str2) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            int i10 = 0;
            if (str2 == null) {
                while (i10 != length && Character.isWhitespace(str.charAt(i10))) {
                    i10++;
                }
            } else {
                if (str2.isEmpty()) {
                    return str;
                }
                while (i10 != length && str2.indexOf(str.charAt(i10)) != -1) {
                    i10++;
                }
            }
            str = str.substring(i10);
        }
        return str;
    }

    public static boolean R(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? charSequence.equals(charSequence2) : h.e(charSequence, false, 0, charSequence2, 0, charSequence.length());
    }

    public static String R0(double[] dArr, char c10) {
        if (dArr == null) {
            return null;
        }
        return S0(dArr, c10, 0, dArr.length);
    }

    public static String R1(String str, String str2, int i10) {
        if (str == null || str2 == null) {
            return Q1(str, i10);
        }
        return I1(Q1(str + str2, i10), str2);
    }

    public static String R2(String str) {
        return str == null ? "" : L2(str, null);
    }

    public static boolean S(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (c.R0(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (R(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String S0(double[] dArr, char c10, int i10, int i11) {
        if (dArr == null) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(c10);
            }
            sb2.append(dArr[i13]);
        }
        return sb2.toString();
    }

    public static String S1(String str, String str2, String str3) {
        return T1(str, str2, str3, -1);
    }

    public static String S2(String str) {
        if (str == null) {
            return null;
        }
        String strL2 = L2(str, null);
        if (strL2.isEmpty()) {
            return null;
        }
        return strL2;
    }

    public static boolean T(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (c.R0(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (U(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String T0(float[] fArr, char c10) {
        if (fArr == null) {
            return null;
        }
        return U0(fArr, c10, 0, fArr.length);
    }

    public static String T1(String str, String str2, String str3, int i10) {
        return U1(str, str2, str3, i10, false);
    }

    public static String T2(String str, int i10) {
        if (str == null) {
            return null;
        }
        if (i10 < 0) {
            i10 += str.length();
        }
        if (i10 < 0) {
            i10 = 0;
        }
        return i10 > str.length() ? "" : str.substring(i10);
    }

    public static boolean U(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence.length() != charSequence2.length()) {
            return false;
        }
        return h.e(charSequence, true, 0, charSequence2, 0, charSequence.length());
    }

    public static String U0(float[] fArr, char c10, int i10, int i11) {
        if (fArr == null) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(c10);
            }
            sb2.append(fArr[i13]);
        }
        return sb2.toString();
    }

    private static String U1(String str, String str2, String str3, int i10, boolean z10) {
        String lowerCase;
        int i11;
        if (!A0(str) && !A0(str2) && str3 != null && i10 != 0) {
            if (z10) {
                lowerCase = str.toLowerCase();
                str2 = str2.toLowerCase();
            } else {
                lowerCase = str;
            }
            int i12 = 0;
            int iIndexOf = lowerCase.indexOf(str2, 0);
            if (iIndexOf == -1) {
                return str;
            }
            int length = str2.length();
            int length2 = str3.length() - length;
            if (length2 < 0) {
                length2 = 0;
            }
            if (i10 < 0) {
                i11 = 16;
            } else {
                i11 = 64;
                if (i10 <= 64) {
                    i11 = i10;
                }
            }
            StringBuilder sb2 = new StringBuilder(str.length() + (length2 * i11));
            while (iIndexOf != -1) {
                sb2.append((CharSequence) str, i12, iIndexOf);
                sb2.append(str3);
                i12 = iIndexOf + length;
                i10--;
                if (i10 == 0) {
                    break;
                }
                iIndexOf = lowerCase.indexOf(str2, i12);
            }
            sb2.append((CharSequence) str, i12, str.length());
            return sb2.toString();
        }
        return str;
    }

    public static String U2(String str, int i10, int i11) {
        if (str == null) {
            return null;
        }
        if (i11 < 0) {
            i11 += str.length();
        }
        if (i10 < 0) {
            i10 += str.length();
        }
        if (i11 > str.length()) {
            i11 = str.length();
        }
        if (i10 > i11) {
            return "";
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        return str.substring(i10, i11);
    }

    public static String V(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            int iL0 = l0(strArr);
            if (iL0 != -1) {
                return iL0 == 0 ? "" : strArr[0].substring(0, iL0);
            }
            String str = strArr[0];
            return str == null ? "" : str;
        }
        return "";
    }

    public static String V0(int[] iArr, char c10) {
        if (iArr == null) {
            return null;
        }
        return W0(iArr, c10, 0, iArr.length);
    }

    public static String V1(String str, String str2, String str3) {
        return (str == null || str2 == null || str3 == null) ? str : str.replaceAll(str2, str3);
    }

    public static String V2(String str, String str2) {
        int iIndexOf;
        if (A0(str)) {
            return str;
        }
        if (str2 != null && (iIndexOf = str.indexOf(str2)) != -1) {
            return str.substring(iIndexOf + str2.length());
        }
        return "";
    }

    public static String W(String str) {
        if (A0(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static String W0(int[] iArr, char c10, int i10, int i11) {
        if (iArr == null) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(c10);
            }
            sb2.append(iArr[i13]);
        }
        return sb2.toString();
    }

    public static String W1(String str, char c10, char c11) {
        if (str == null) {
            return null;
        }
        return str.replace(c10, c11);
    }

    public static String W2(String str, String str2) {
        if (A0(str)) {
            return str;
        }
        if (A0(str2)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(str2);
        return (iLastIndexOf == -1 || iLastIndexOf == str.length() - str2.length()) ? "" : str.substring(iLastIndexOf + str2.length());
    }

    @Deprecated
    public static int X(CharSequence charSequence, CharSequence charSequence2, Locale locale) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (locale == null) {
            throw new IllegalArgumentException("Locale must not be null");
        }
        String lowerCase = charSequence.toString().toLowerCase(locale);
        String lowerCase2 = charSequence2.toString().toLowerCase(locale);
        int i10 = Integer.MIN_VALUE;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < lowerCase2.length(); i13++) {
            char cCharAt = lowerCase2.charAt(i13);
            boolean z10 = false;
            while (i12 < lowerCase.length() && !z10) {
                if (cCharAt == lowerCase.charAt(i12)) {
                    int i14 = i11 + 1;
                    if (i10 + 1 == i12) {
                        i14 = i11 + 3;
                    }
                    i11 = i14;
                    z10 = true;
                    i10 = i12;
                }
                i12++;
            }
        }
        return i11;
    }

    public static String X0(long[] jArr, char c10) {
        if (jArr == null) {
            return null;
        }
        return Y0(jArr, c10, 0, jArr.length);
    }

    public static String X1(String str, String str2, String str3) {
        if (!A0(str) && !A0(str2)) {
            if (str3 == null) {
                str3 = "";
            }
            int length = str3.length();
            int length2 = str.length();
            StringBuilder sb2 = new StringBuilder(length2);
            boolean z10 = false;
            for (int i10 = 0; i10 < length2; i10++) {
                char cCharAt = str.charAt(i10);
                int iIndexOf = str2.indexOf(cCharAt);
                if (iIndexOf >= 0) {
                    if (iIndexOf < length) {
                        sb2.append(str3.charAt(iIndexOf));
                    }
                    z10 = true;
                } else {
                    sb2.append(cCharAt);
                }
            }
            return z10 ? sb2.toString() : str;
        }
        return str;
    }

    public static String X2(String str, String str2) {
        if (A0(str) || str2 == null) {
            return str;
        }
        if (str2.isEmpty()) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    @Deprecated
    public static double Y(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int[] iArrW1 = w1(charSequence, charSequence2);
        double d10 = iArrW1[0];
        if (d10 == 0.0d) {
            return 0.0d;
        }
        double length = (((d10 / ((double) charSequence.length())) + (d10 / ((double) charSequence2.length()))) + ((d10 - ((double) iArrW1[1])) / d10)) / 3.0d;
        if (length >= 0.7d) {
            length += Math.min(0.1d, 1.0d / ((double) iArrW1[3])) * ((double) iArrW1[2]) * (1.0d - length);
        }
        return Math.round(length * 100.0d) / 100.0d;
    }

    public static String Y0(long[] jArr, char c10, int i10, int i11) {
        if (jArr == null) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(c10);
            }
            sb2.append(jArr[i13]);
        }
        return sb2.toString();
    }

    public static String Y1(String str, String[] strArr, String[] strArr2) {
        return Z1(str, strArr, strArr2, false, 0);
    }

    public static String Y2(String str, String str2) {
        if (!A0(str) && !A0(str2)) {
            int iLastIndexOf = str.lastIndexOf(str2);
            if (iLastIndexOf == -1) {
                return str;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }

    @Deprecated
    public static int Z(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        if (length > length2) {
            length2 = charSequence.length();
            length = length2;
        } else {
            charSequence2 = charSequence;
            charSequence = charSequence2;
        }
        int[] iArr = new int[length + 1];
        for (int i10 = 0; i10 <= length; i10++) {
            iArr[i10] = i10;
        }
        for (int i11 = 1; i11 <= length2; i11++) {
            int i12 = iArr[0];
            char cCharAt = charSequence.charAt(i11 - 1);
            iArr[0] = i11;
            int i13 = 1;
            while (i13 <= length) {
                int i14 = iArr[i13];
                int i15 = i13 - 1;
                iArr[i13] = Math.min(Math.min(iArr[i15] + 1, iArr[i13] + 1), i12 + (charSequence2.charAt(i15) == cCharAt ? 0 : 1));
                i13++;
                i12 = i14;
            }
        }
        return iArr[length];
    }

    @SafeVarargs
    public static <T> String Z0(T... tArr) {
        return c1(tArr, null);
    }

    private static String Z1(String str, String[] strArr, String[] strArr2, boolean z10, int i10) {
        String str2;
        String str3;
        int length;
        String str4;
        if (str == null || str.isEmpty() || strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return str;
        }
        if (i10 < 0) {
            throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
        }
        int length2 = strArr.length;
        int length3 = strArr2.length;
        if (length2 != length3) {
            throw new IllegalArgumentException("Search and Replace array lengths don't match: " + length2 + " vs " + length3);
        }
        boolean[] zArr = new boolean[length2];
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < length2; i13++) {
            if (!zArr[i13] && (str4 = strArr[i13]) != null && !str4.isEmpty() && strArr2[i13] != null) {
                int iIndexOf = str.indexOf(strArr[i13]);
                if (iIndexOf == -1) {
                    zArr[i13] = true;
                } else if (i11 == -1 || iIndexOf < i11) {
                    i12 = i13;
                    i11 = iIndexOf;
                }
            }
        }
        if (i11 == -1) {
            return str;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < strArr.length; i15++) {
            if (strArr[i15] != null && (str3 = strArr2[i15]) != null && (length = str3.length() - strArr[i15].length()) > 0) {
                i14 += length * 3;
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length() + Math.min(i14, str.length() / 5));
        int length4 = 0;
        while (i11 != -1) {
            while (length4 < i11) {
                sb2.append(str.charAt(length4));
                length4++;
            }
            sb2.append(strArr2[i12]);
            length4 = strArr[i12].length() + i11;
            i11 = -1;
            i12 = -1;
            for (int i16 = 0; i16 < length2; i16++) {
                if (!zArr[i16] && (str2 = strArr[i16]) != null && !str2.isEmpty() && strArr2[i16] != null) {
                    int iIndexOf2 = str.indexOf(strArr[i16], length4);
                    if (iIndexOf2 == -1) {
                        zArr[i16] = true;
                    } else if (i11 == -1 || iIndexOf2 < i11) {
                        i12 = i16;
                        i11 = iIndexOf2;
                    }
                }
            }
        }
        int length5 = str.length();
        while (length4 < length5) {
            sb2.append(str.charAt(length4));
            length4++;
        }
        String string = sb2.toString();
        return !z10 ? string : Z1(string, strArr, strArr2, z10, i10 - 1);
    }

    public static String Z2(String str, String str2) {
        return a3(str, str2, str2);
    }

    public static String a(String str, int i10) {
        return d(str, "...", 0, i10);
    }

    @Deprecated
    public static int a0(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        int length;
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        int length2 = charSequence.length();
        int length3 = charSequence2.length();
        int i12 = -1;
        if (length2 == 0) {
            if (length3 <= i10) {
                return length3;
            }
            return -1;
        }
        if (length3 == 0) {
            if (length2 <= i10) {
                return length2;
            }
            return -1;
        }
        if (Math.abs(length2 - length3) > i10) {
            return -1;
        }
        if (length2 > length3) {
            length = charSequence.length();
            i11 = length3;
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            i11 = length2;
            length = length3;
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int i13 = i11 + 1;
        int[] iArr = new int[i13];
        int[] iArr2 = new int[i13];
        int i14 = 1;
        int iMin = Math.min(i11, i10) + 1;
        for (int i15 = 0; i15 < iMin; i15++) {
            iArr[i15] = i15;
        }
        Arrays.fill(iArr, iMin, i13, Integer.MAX_VALUE);
        Arrays.fill(iArr2, Integer.MAX_VALUE);
        int i16 = 1;
        while (i16 <= length) {
            char cCharAt = charSequence4.charAt(i16 - 1);
            iArr2[0] = i16;
            int iMax = Math.max(i14, i16 - i10);
            int iMin2 = i16 > Integer.MAX_VALUE - i10 ? i11 : Math.min(i11, i16 + i10);
            if (iMax > iMin2) {
                return i12;
            }
            if (iMax > i14) {
                iArr2[iMax - 1] = Integer.MAX_VALUE;
            }
            while (iMax <= iMin2) {
                int i17 = iMax - 1;
                int i18 = i12;
                if (charSequence3.charAt(i17) == cCharAt) {
                    iArr2[iMax] = iArr[i17];
                } else {
                    iArr2[iMax] = Math.min(Math.min(iArr2[i17], iArr[iMax]), iArr[i17]) + 1;
                }
                iMax++;
                i14 = i14;
                i12 = i18;
            }
            int i19 = i12;
            i16++;
            int[] iArr3 = iArr2;
            iArr2 = iArr;
            iArr = iArr3;
            i12 = i19;
        }
        int i20 = i12;
        int i21 = iArr[i11];
        return i21 <= i10 ? i21 : i20;
    }

    public static String a1(Object[] objArr, char c10) {
        if (objArr == null) {
            return null;
        }
        return b1(objArr, c10, 0, objArr.length);
    }

    public static String a2(String str, String[] strArr, String[] strArr2) {
        return Z1(str, strArr, strArr2, true, strArr == null ? 0 : strArr.length);
    }

    public static String a3(String str, String str2, String str3) {
        int iIndexOf;
        int iIndexOf2;
        if (str == null || str2 == null || str3 == null || (iIndexOf = str.indexOf(str2)) == -1 || (iIndexOf2 = str.indexOf(str3, str2.length() + iIndexOf)) == -1) {
            return null;
        }
        return str.substring(iIndexOf + str2.length(), iIndexOf2);
    }

    public static String b(String str, int i10, int i11) {
        return d(str, "...", i10, i11);
    }

    public static int b0(CharSequence charSequence, int i10) {
        if (A0(charSequence)) {
            return -1;
        }
        return h.a(charSequence, i10, 0);
    }

    public static String b1(Object[] objArr, char c10, int i10, int i11) {
        if (objArr == null) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(c10);
            }
            Object obj = objArr[i13];
            if (obj != null) {
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }

    public static String b2(String str, String str2, String str3) {
        if (str != null && str2 != null && str3 != null) {
            return str.replaceFirst(str2, str3);
        }
        return str;
    }

    public static String[] b3(String str, String str2, String str3) {
        int iIndexOf;
        int i10;
        int iIndexOf2;
        if (str == null || A0(str2) || A0(str3)) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return c.f337037c;
        }
        int length2 = str3.length();
        int length3 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < length - length2 && (iIndexOf = str.indexOf(str2, i11)) >= 0 && (iIndexOf2 = str.indexOf(str3, (i10 = iIndexOf + length3))) >= 0) {
            arrayList.add(str.substring(i10, iIndexOf2));
            i11 = iIndexOf2 + length2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String c(String str, String str2, int i10) {
        return d(str, str2, 0, i10);
    }

    public static int c0(CharSequence charSequence, int i10, int i11) {
        if (A0(charSequence)) {
            return -1;
        }
        return h.a(charSequence, i10, i11);
    }

    public static String c1(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return d1(objArr, str, 0, objArr.length);
    }

    public static String c2(String str, String str2, String str3) {
        return d2(str, str2, str3, -1);
    }

    public static String c3(String str) {
        if (A0(str)) {
            return str;
        }
        int length = str.length();
        int[] iArr = new int[length];
        int iCharCount = 0;
        int i10 = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (Character.isUpperCase(iCodePointAt)) {
                iCodePointAt = Character.toLowerCase(iCodePointAt);
            } else if (Character.isTitleCase(iCodePointAt)) {
                iCodePointAt = Character.toLowerCase(iCodePointAt);
            } else if (Character.isLowerCase(iCodePointAt)) {
                iCodePointAt = Character.toUpperCase(iCodePointAt);
            }
            iArr[i10] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
            i10++;
        }
        return new String(iArr, 0, i10);
    }

    public static String d(String str, String str2, int i10, int i11) {
        if (A0(str) || A0(str2)) {
            return str;
        }
        int length = str2.length();
        int i12 = length + 1;
        int i13 = length + length + 1;
        if (i11 < i12) {
            throw new IllegalArgumentException(String.format("Minimum abbreviation width is %d", Integer.valueOf(i12)));
        }
        if (str.length() <= i11) {
            return str;
        }
        if (i10 > str.length()) {
            i10 = str.length();
        }
        int i14 = i11 - length;
        if (str.length() - i10 < i14) {
            i10 = str.length() - i14;
        }
        if (i10 <= i12) {
            return str.substring(0, i14) + str2;
        }
        if (i11 < i13) {
            throw new IllegalArgumentException(String.format("Minimum abbreviation width with offset is %d", Integer.valueOf(i13)));
        }
        if ((i11 + i10) - length < str.length()) {
            return str2 + c(str.substring(i10), str2, i14);
        }
        return str2 + str.substring(str.length() - i14);
    }

    public static int d0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return h.b(charSequence, charSequence2, 0);
    }

    public static String d1(Object[] objArr, String str, int i10, int i11) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(str);
            }
            Object obj = objArr[i13];
            if (obj != null) {
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }

    public static String d2(String str, String str2, String str3, int i10) {
        return U1(str, str2, str3, i10, true);
    }

    public static int[] d3(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return c.f337040f;
        }
        String string = charSequence.toString();
        int iCodePointCount = string.codePointCount(0, string.length());
        int[] iArr = new int[iCodePointCount];
        int iCharCount = 0;
        for (int i10 = 0; i10 < iCodePointCount; i10++) {
            int iCodePointAt = string.codePointAt(iCharCount);
            iArr[i10] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return iArr;
    }

    public static String e(String str, String str2, int i10) {
        if (A0(str) || A0(str2) || i10 >= str.length() || i10 < str2.length() + 2) {
            return str;
        }
        int length = i10 - str2.length();
        int i11 = length / 2;
        return str.substring(0, (length % 2) + i11) + str2 + str.substring(str.length() - i11);
    }

    public static int e0(CharSequence charSequence, CharSequence charSequence2, int i10) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return h.b(charSequence, charSequence2, i10);
    }

    public static String e1(short[] sArr, char c10) {
        if (sArr == null) {
            return null;
        }
        return f1(sArr, c10, 0, sArr.length);
    }

    public static String e2(String str, String str2, String str3) {
        return T1(str, str2, str3, 1);
    }

    public static String e3(byte[] bArr, Charset charset) {
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        return new String(bArr, charset);
    }

    private static String f(String str, CharSequence charSequence, boolean z10, CharSequence... charSequenceArr) {
        if (str == null || A0(charSequence) || O(str, charSequence, z10)) {
            return str;
        }
        if (charSequenceArr != null && charSequenceArr.length > 0) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (O(str, charSequence2, z10)) {
                    return str;
                }
            }
        }
        return str + charSequence.toString();
    }

    public static int f0(CharSequence charSequence, String str) {
        if (A0(charSequence) || A0(str)) {
            return -1;
        }
        return g0(charSequence, str.toCharArray());
    }

    public static String f1(short[] sArr, char c10, int i10, int i11) {
        if (sArr == null) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(c10);
            }
            sb2.append((int) sArr[i13]);
        }
        return sb2.toString();
    }

    public static String f2(String str, String str2, String str3) {
        return d2(str, str2, str3, 1);
    }

    @Deprecated
    public static String f3(byte[] bArr, String str) throws UnsupportedEncodingException {
        return str != null ? new String(bArr, str) : new String(bArr, Charset.defaultCharset());
    }

    public static String g(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return f(str, charSequence, false, charSequenceArr);
    }

    public static int g0(CharSequence charSequence, char... cArr) {
        if (!A0(charSequence) && !c.C0(cArr)) {
            int length = charSequence.length();
            int i10 = length - 1;
            int length2 = cArr.length;
            int i11 = length2 - 1;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = charSequence.charAt(i12);
                for (int i13 = 0; i13 < length2; i13++) {
                    if (cArr[i13] == cCharAt && (i12 >= i10 || i13 >= i11 || !Character.isHighSurrogate(cCharAt) || cArr[i13 + 1] == charSequence.charAt(i12 + 1))) {
                        return i12;
                    }
                }
            }
        }
        return -1;
    }

    public static String g1(String str, Object... objArr) {
        if (objArr == null) {
            throw new IllegalArgumentException("Object varargs must not be null");
        }
        String strK = K(str, "");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = Arrays.asList(objArr).iterator();
        while (it.hasNext()) {
            sb2.append(Objects.toString(it.next(), ""));
            if (it.hasNext()) {
                sb2.append(strK);
            }
        }
        return sb2.toString();
    }

    public static String g2(String str, String str2, String str3) {
        if (str != null && str2 != null && str3 != null) {
            str = Pattern.compile(str2, 32).matcher(str).replaceAll(str3);
        }
        return str;
    }

    public static String g3(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String h(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return f(str, charSequence, true, charSequenceArr);
    }

    public static int h0(CharSequence charSequence, CharSequence... charSequenceArr) {
        int iB;
        if (charSequence == null || charSequenceArr == null) {
            return -1;
        }
        int i10 = Integer.MAX_VALUE;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (charSequence2 != null && (iB = h.b(charSequence, charSequence2, 0)) != -1 && iB < i10) {
                i10 = iB;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10;
    }

    public static int h1(CharSequence charSequence, int i10) {
        if (A0(charSequence)) {
            return -1;
        }
        return h.c(charSequence, i10, charSequence.length());
    }

    public static String h2(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String h3(String str) {
        return str == null ? "" : str.trim();
    }

    public static String i(String str) {
        int length;
        int iCodePointAt;
        int titleCase;
        if (str == null || (length = str.length()) == 0 || iCodePointAt == (titleCase = Character.toTitleCase((iCodePointAt = str.codePointAt(0))))) {
            return str;
        }
        int[] iArr = new int[length];
        iArr[0] = titleCase;
        int iCharCount = Character.charCount(iCodePointAt);
        int i10 = 1;
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            iArr[i10] = iCodePointAt2;
            iCharCount += Character.charCount(iCodePointAt2);
            i10++;
        }
        return new String(iArr, 0, i10);
    }

    public static int i0(CharSequence charSequence, CharSequence charSequence2) {
        if (!A0(charSequence) && !A0(charSequence2)) {
            int length = charSequence.length();
            int i10 = 0;
            while (i10 < length) {
                char cCharAt = charSequence.charAt(i10);
                boolean z10 = h.a(charSequence2, cCharAt, 0) >= 0;
                int i11 = i10 + 1;
                if (i11 < length && Character.isHighSurrogate(cCharAt)) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (z10 && h.a(charSequence2, cCharAt2, 0) < 0) {
                        return i10;
                    }
                    i10 = i11;
                } else {
                    if (!z10) {
                        return i10;
                    }
                    i10 = i11;
                }
            }
        }
        return -1;
    }

    public static int i1(CharSequence charSequence, int i10, int i11) {
        if (A0(charSequence)) {
            return -1;
        }
        return h.c(charSequence, i10, i11);
    }

    public static String i2(String str, char c10) {
        if (str == null) {
            return null;
        }
        String[] strArrP2 = p2(str, c10);
        c.k3(strArrP2);
        return a1(strArrP2, c10);
    }

    public static String i3(String str) {
        String strG3 = g3(str);
        if (A0(strG3)) {
            return null;
        }
        return strG3;
    }

    public static String j(String str, int i10) {
        return k(str, i10, ' ');
    }

    public static int j0(CharSequence charSequence, char... cArr) {
        if (!A0(charSequence) && !c.C0(cArr)) {
            int length = charSequence.length();
            int i10 = length - 1;
            int length2 = cArr.length;
            int i11 = length2 - 1;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = charSequence.charAt(i12);
                for (int i13 = 0; i13 < length2; i13++) {
                    if (cArr[i13] != cCharAt || (i12 < i10 && i13 < i11 && Character.isHighSurrogate(cCharAt) && cArr[i13 + 1] != charSequence.charAt(i12 + 1))) {
                    }
                }
                return i12;
            }
        }
        return -1;
    }

    public static int j1(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            return h.d(charSequence, charSequence2, charSequence.length());
        }
        return -1;
    }

    public static String j2(String str, int i10) {
        if (str == null) {
            return null;
        }
        if (i10 < 0) {
            return "";
        }
        return str.length() <= i10 ? str : str.substring(str.length() - i10);
    }

    public static String j3(String str, int i10) {
        return k3(str, 0, i10);
    }

    public static String k(String str, int i10, char c10) {
        if (str != null && i10 > 0) {
            int length = str.length();
            int i11 = i10 - length;
            if (i11 <= 0) {
                return str;
            }
            str = l2(r1(str, length + (i11 / 2), c10), i10, c10);
        }
        return str;
    }

    public static int k0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return -1;
        }
        int i10 = 0;
        if (charSequence != null && charSequence2 != null) {
            while (i10 < charSequence.length() && i10 < charSequence2.length() && charSequence.charAt(i10) == charSequence2.charAt(i10)) {
                i10++;
            }
            if (i10 >= charSequence2.length() && i10 >= charSequence.length()) {
                return -1;
            }
        }
        return i10;
    }

    public static int k1(CharSequence charSequence, CharSequence charSequence2, int i10) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return h.d(charSequence, charSequence2, i10);
    }

    public static String k2(String str, int i10) {
        return l2(str, i10, ' ');
    }

    public static String k3(String str, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("maxWith cannot be negative");
        }
        if (str == null) {
            return null;
        }
        if (i10 > str.length()) {
            return "";
        }
        if (str.length() <= i11) {
            return str.substring(i10);
        }
        int length = i11 + i10;
        if (length > str.length()) {
            length = str.length();
        }
        return str.substring(i10, length);
    }

    public static String l(String str, int i10, String str2) {
        if (str != null && i10 > 0) {
            if (A0(str2)) {
                str2 = " ";
            }
            int length = str.length();
            int i11 = i10 - length;
            if (i11 <= 0) {
                return str;
            }
            str = m2(s1(str, length + (i11 / 2), str2), i10, str2);
        }
        return str;
    }

    public static int l0(CharSequence... charSequenceArr) {
        if (charSequenceArr != null && charSequenceArr.length > 1) {
            int length = charSequenceArr.length;
            int iMin = Integer.MAX_VALUE;
            boolean z10 = true;
            int iMax = 0;
            boolean z11 = false;
            for (CharSequence charSequence : charSequenceArr) {
                if (charSequence == null) {
                    z11 = true;
                    iMin = 0;
                } else {
                    iMin = Math.min(charSequence.length(), iMin);
                    iMax = Math.max(charSequence.length(), iMax);
                    z10 = false;
                }
            }
            if (!z10 && (iMax != 0 || z11)) {
                if (iMin == 0) {
                    return 0;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < iMin; i11++) {
                    char cCharAt = charSequenceArr[0].charAt(i11);
                    for (int i12 = 1; i12 < length; i12++) {
                        if (charSequenceArr[i12].charAt(i11) != cCharAt) {
                            i10 = i11;
                            break;
                        }
                    }
                    if (i10 != -1) {
                        break;
                    }
                }
                return (i10 != -1 || iMin == iMax) ? i10 : iMin;
            }
        }
        return -1;
    }

    public static int l1(CharSequence charSequence, CharSequence... charSequenceArr) {
        int iD;
        int i10 = -1;
        if (charSequence != null && charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence2 != null && (iD = h.d(charSequence, charSequence2, charSequence.length())) > i10) {
                    i10 = iD;
                }
            }
        }
        return i10;
    }

    public static String l2(String str, int i10, char c10) {
        if (str == null) {
            return null;
        }
        int length = i10 - str.length();
        if (length <= 0) {
            return str;
        }
        return length > 8192 ? m2(str, i10, String.valueOf(c10)) : str.concat(P1(c10, length));
    }

    public static String l3(String str) {
        int length;
        int iCodePointAt;
        int lowerCase;
        if (str == null || (length = str.length()) == 0 || iCodePointAt == (lowerCase = Character.toLowerCase((iCodePointAt = str.codePointAt(0))))) {
            return str;
        }
        int[] iArr = new int[length];
        iArr[0] = lowerCase;
        int iCharCount = Character.charCount(iCodePointAt);
        int i10 = 1;
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            iArr[i10] = iCodePointAt2;
            iCharCount += Character.charCount(iCodePointAt2);
            i10++;
        }
        return new String(iArr, 0, i10);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    public static String m(String str) {
        if (A0(str)) {
            return str;
        }
        if (str.length() == 1) {
            char cCharAt = str.charAt(0);
            return (cCharAt == '\r' || cCharAt == '\n') ? "" : str;
        }
        int length = str.length();
        int i10 = length - 1;
        char cCharAt2 = str.charAt(i10);
        if (cCharAt2 == '\n') {
            if (str.charAt(length - 2) == '\r') {
                length -= 2;
            } else {
                length = i10;
            }
        } else if (cCharAt2 == '\r') {
            length = i10;
        }
        return str.substring(0, length);
    }

    public static int m0(CharSequence charSequence, CharSequence charSequence2) {
        return n0(charSequence, charSequence2, 0);
    }

    public static int m1(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return n1(charSequence, charSequence2, charSequence.length());
    }

    public static String m2(String str, int i10, String str2) {
        if (str == null) {
            return null;
        }
        if (A0(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i10 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return l2(str, i10, str2.charAt(0));
        }
        if (length2 == length) {
            return str.concat(str2);
        }
        if (length2 < length) {
            return str.concat(str2.substring(0, length2));
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i11 = 0; i11 < length2; i11++) {
            cArr[i11] = charArray[i11 % length];
        }
        return str.concat(new String(cArr));
    }

    public static String m3(String str, char c10) {
        int length;
        if (!A0(str) && c10 != 0 && str.charAt(0) == c10 && str.charAt(str.length() - 1) == c10 && (length = str.length() - 1) != -1) {
            str = str.substring(1, length);
        }
        return str;
    }

    @Deprecated
    public static String n(String str, String str2) {
        return I1(str, str2);
    }

    public static int n0(CharSequence charSequence, CharSequence charSequence2, int i10) {
        if (charSequence != null && charSequence2 != null) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i10 > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i10;
            }
            int i11 = i10;
            while (i11 < length) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (h.e(charSequence3, true, i11, charSequence4, 0, charSequence2.length())) {
                    return i11;
                }
                i11++;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return -1;
    }

    public static int n1(CharSequence charSequence, CharSequence charSequence2, int i10) {
        if (charSequence != null && charSequence2 != null) {
            if (i10 > charSequence.length() - charSequence2.length()) {
                i10 = charSequence.length() - charSequence2.length();
            }
            if (i10 < 0) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i10;
            }
            int i11 = i10;
            while (i11 >= 0) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (h.e(charSequence3, true, i11, charSequence4, 0, charSequence2.length())) {
                    return i11;
                }
                i11--;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return -1;
    }

    public static String n2(String str, int i10) {
        int i11;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (i10 == 0 || length == 0 || (i11 = i10 % length) == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(length);
        int i12 = -i11;
        sb2.append(T2(str, i12));
        sb2.append(U2(str, 0, i12));
        return sb2.toString();
    }

    public static String n3(String str, String str2) {
        if (!A0(str) && !A0(str2) && G2(str, str2) && N(str, str2)) {
            int iIndexOf = str.indexOf(str2);
            int iLastIndexOf = str.lastIndexOf(str2);
            int length = str2.length();
            if (iIndexOf != -1 && iLastIndexOf != -1) {
                str = str.substring(iIndexOf + length, iLastIndexOf);
            }
        }
        return str;
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length < 2) {
            return "";
        }
        int i10 = length - 1;
        String strSubstring = str.substring(0, i10);
        if (str.charAt(i10) == '\n') {
            int i11 = length - 2;
            if (strSubstring.charAt(i11) == '\r') {
                return strSubstring.substring(0, i11);
            }
        }
        return strSubstring;
    }

    public static boolean o0(CharSequence... charSequenceArr) {
        if (c.H0(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (E0(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static int o1(CharSequence charSequence, CharSequence charSequence2, int i10) {
        return A1(charSequence, charSequence2, i10, true);
    }

    public static String[] o2(String str) {
        return r2(str, null, -1);
    }

    public static String o3(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static int p(String str, String str2) {
        return q(str, str2, true);
    }

    public static boolean p0(CharSequence... charSequenceArr) {
        if (c.H0(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (F0(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static String p1(String str, int i10) {
        if (str == null) {
            return null;
        }
        if (i10 < 0) {
            return "";
        }
        return str.length() <= i10 ? str : str.substring(0, i10);
    }

    public static String[] p2(String str, char c10) {
        return E2(str, c10, false);
    }

    public static String p3(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(locale);
    }

    public static int q(String str, String str2, boolean z10) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return z10 ? -1 : 1;
        }
        if (str2 == null) {
            return z10 ? 1 : -1;
        }
        return str.compareTo(str2);
    }

    public static boolean q0(CharSequence charSequence) {
        if (charSequence != null && !A0(charSequence)) {
            int length = charSequence.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (!Character.isLowerCase(charSequence.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static String q1(String str, int i10) {
        return r1(str, i10, ' ');
    }

    public static String[] q2(String str, String str2) {
        return F2(str, str2, -1, false);
    }

    public static String q3(String str, char c10) {
        if (!A0(str) && c10 != 0) {
            return c10 + str + c10;
        }
        return str;
    }

    public static int r(String str, String str2) {
        return s(str, str2, true);
    }

    public static boolean r0(CharSequence charSequence) {
        if (charSequence != null && !A0(charSequence)) {
            int length = charSequence.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (!Character.isUpperCase(charSequence.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static String r1(String str, int i10, char c10) {
        if (str == null) {
            return null;
        }
        int length = i10 - str.length();
        if (length <= 0) {
            return str;
        }
        return length > 8192 ? s1(str, i10, String.valueOf(c10)) : P1(c10, length).concat(str);
    }

    public static String[] r2(String str, String str2, int i10) {
        return F2(str, str2, i10, false);
    }

    public static String r3(String str, String str2) {
        return (A0(str) || A0(str2)) ? str : str2.concat(str).concat(str2);
    }

    public static int s(String str, String str2, boolean z10) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return z10 ? -1 : 1;
        }
        if (str2 == null) {
            return z10 ? 1 : -1;
        }
        return str.compareToIgnoreCase(str2);
    }

    public static boolean s0(CharSequence charSequence) {
        if (A0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isLetter(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String s1(String str, int i10, String str2) {
        if (str == null) {
            return null;
        }
        if (A0(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i10 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return r1(str, i10, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i11 = 0; i11 < length2; i11++) {
            cArr[i11] = charArray[i11 % length];
        }
        return new String(cArr).concat(str);
    }

    public static String[] s2(String str) {
        return t2(str, false);
    }

    public static String s3(String str, char c10) {
        if (!A0(str) && c10 != 0) {
            StringBuilder sb2 = new StringBuilder(str.length() + 2);
            if (str.charAt(0) != c10) {
                sb2.append(c10);
            }
            sb2.append(str);
            if (str.charAt(str.length() - 1) != c10) {
                sb2.append(c10);
            }
            return sb2.toString();
        }
        return str;
    }

    public static boolean t(CharSequence charSequence, int i10) {
        return !A0(charSequence) && h.a(charSequence, i10, 0) >= 0;
    }

    public static boolean t0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isLetter(charSequence.charAt(i10)) && charSequence.charAt(i10) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static int t1(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    private static String[] t2(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return c.f337037c;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int type = Character.getType(charArray[0]);
        for (int i11 = 1; i11 < charArray.length; i11++) {
            int type2 = Character.getType(charArray[i11]);
            if (type2 != type) {
                if (z10 && type2 == 2 && type == 1) {
                    int i12 = i11 - 1;
                    if (i12 != i10) {
                        arrayList.add(new String(charArray, i10, i12 - i10));
                        i10 = i12;
                    }
                } else {
                    arrayList.add(new String(charArray, i10, i11 - i10));
                    i10 = i11;
                }
                type = type2;
            }
        }
        arrayList.add(new String(charArray, i10, charArray.length - i10));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String t3(String str, String str2) {
        if (A0(str) || A0(str2)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + str2.length());
        if (!str.startsWith(str2)) {
            sb2.append(str2);
        }
        sb2.append(str);
        if (!str.endsWith(str2)) {
            sb2.append(str2);
        }
        return sb2.toString();
    }

    public static boolean u(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null || h.b(charSequence, charSequence2, 0) < 0) ? false : true;
    }

    public static boolean u0(CharSequence charSequence) {
        if (A0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String u1(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static String[] u2(String str) {
        return t2(str, true);
    }

    public static boolean v(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return w(charSequence, h.g(charSequence2));
    }

    public static boolean v0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i10)) && charSequence.charAt(i10) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String v1(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(locale);
    }

    public static String[] v2(String str, String str2) {
        return z2(str, str2, -1, false);
    }

    public static boolean w(CharSequence charSequence, char... cArr) {
        if (!A0(charSequence) && !c.C0(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i10 = length - 1;
            int i11 = length2 - 1;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = charSequence.charAt(i12);
                for (int i13 = 0; i13 < length2; i13++) {
                    if (cArr[i13] == cCharAt) {
                        if (Character.isHighSurrogate(cCharAt)) {
                            if (i13 == i11) {
                                return true;
                            }
                            if (i12 >= i10 || cArr[i13 + 1] != charSequence.charAt(i12 + 1)) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean w0(CharSequence... charSequenceArr) {
        if (c.H0(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (z0(charSequence)) {
                return true;
            }
        }
        return false;
    }

    private static int[] w1(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence.length() > charSequence2.length()) {
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int iMax = Math.max((charSequence4.length() / 2) - 1, 0);
        int[] iArr = new int[charSequence3.length()];
        Arrays.fill(iArr, -1);
        boolean[] zArr = new boolean[charSequence4.length()];
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence3.length(); i11++) {
            char cCharAt = charSequence3.charAt(i11);
            int iMin = Math.min(i11 + iMax + 1, charSequence4.length());
            for (int iMax2 = Math.max(i11 - iMax, 0); iMax2 < iMin; iMax2++) {
                if (!zArr[iMax2] && cCharAt == charSequence4.charAt(iMax2)) {
                    iArr[i11] = iMax2;
                    zArr[iMax2] = true;
                    i10++;
                    break;
                }
            }
        }
        char[] cArr = new char[i10];
        char[] cArr2 = new char[i10];
        int i12 = 0;
        for (int i13 = 0; i13 < charSequence3.length(); i13++) {
            if (iArr[i13] != -1) {
                cArr[i12] = charSequence3.charAt(i13);
                i12++;
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < charSequence4.length(); i15++) {
            if (zArr[i15]) {
                cArr2[i14] = charSequence4.charAt(i15);
                i14++;
            }
        }
        int i16 = 0;
        for (int i17 = 0; i17 < i10; i17++) {
            if (cArr[i17] != cArr2[i17]) {
                i16++;
            }
        }
        int i18 = 0;
        for (int i19 = 0; i19 < charSequence3.length() && charSequence.charAt(i19) == charSequence2.charAt(i19); i19++) {
            i18++;
        }
        return new int[]{i10, i16 / 2, i18, charSequence4.length()};
    }

    public static String[] w2(String str, String str2, int i10) {
        return z2(str, str2, i10, false);
    }

    public static boolean x(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!A0(charSequence) && !c.H0(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (u(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean x0(CharSequence... charSequenceArr) {
        if (c.H0(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (A0(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static String x1(String str, int i10, int i11) {
        if (str == null) {
            return null;
        }
        if (i11 < 0 || i10 > str.length()) {
            return "";
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int i12 = i11 + i10;
        return str.length() <= i12 ? str.substring(i10) : str.substring(i10, i12);
    }

    public static String[] x2(String str, String str2) {
        return z2(str, str2, -1, true);
    }

    public static boolean y(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            int i10 = 0;
            while (i10 <= length2) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (h.e(charSequence3, true, i10, charSequence4, 0, length)) {
                    return true;
                }
                i10++;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return false;
    }

    public static boolean y0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!k.i(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String y1(String str) {
        if (A0(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isWhitespace(cCharAt)) {
                if (i11 == 0 && !z10) {
                    cArr[i10] = " ".charAt(0);
                    i10++;
                }
                i11++;
            } else {
                int i13 = i10 + 1;
                if (cCharAt == 160) {
                    cCharAt = ' ';
                }
                cArr[i10] = cCharAt;
                i11 = 0;
                i10 = i13;
                z10 = false;
            }
        }
        if (z10) {
            return "";
        }
        return new String(cArr, 0, i10 - (i11 <= 0 ? 0 : 1)).trim();
    }

    public static String[] y2(String str, String str2, int i10) {
        return z2(str, str2, i10, true);
    }

    public static boolean z(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return true;
        }
        return A(charSequence, str.toCharArray());
    }

    public static boolean z0(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i10 = 0; i10 < length; i10++) {
                if (!Character.isWhitespace(charSequence.charAt(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int z1(CharSequence charSequence, CharSequence charSequence2, int i10) {
        return A1(charSequence, charSequence2, i10, false);
    }

    private static String[] z2(String str, String str2, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return c.f337037c;
        }
        if (str2 == null || "".equals(str2)) {
            return F2(str, null, i10, z10);
        }
        int length2 = str2.length();
        ArrayList arrayList = new ArrayList();
        int iIndexOf = 0;
        int i11 = 0;
        int i12 = 0;
        while (iIndexOf < length) {
            iIndexOf = str.indexOf(str2, i11);
            if (iIndexOf > -1) {
                if (iIndexOf > i11) {
                    i12++;
                    if (i12 == i10) {
                        arrayList.add(str.substring(i11));
                    } else {
                        arrayList.add(str.substring(i11, iIndexOf));
                    }
                } else if (z10) {
                    i12++;
                    if (i12 == i10) {
                        arrayList.add(str.substring(i11));
                        iIndexOf = length;
                    } else {
                        arrayList.add("");
                    }
                }
                i11 = iIndexOf + length2;
            } else {
                arrayList.add(str.substring(i11));
            }
            iIndexOf = length;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
