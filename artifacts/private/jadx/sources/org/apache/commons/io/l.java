package org.apache.commons.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes14.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f336707a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f336708b = '.';

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f336710d = '/';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f336711e = '\\';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char f336713g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f336709c = Character.toString('.');

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char f336712f = File.separatorChar;

    static {
        if (A()) {
            f336713g = '/';
        } else {
            f336713g = '\\';
        }
    }

    static boolean A() {
        return f336712f == '\\';
    }

    public static String B(String str) {
        return e(str, f336712f, true);
    }

    public static String C(String str, boolean z10) {
        return e(str, z10 ? '/' : '\\', true);
    }

    public static String D(String str) {
        return e(str, f336712f, false);
    }

    public static String E(String str, boolean z10) {
        return e(str, z10 ? '/' : '\\', false);
    }

    public static String F(String str) {
        if (str == null) {
            return null;
        }
        k(str);
        int iU = u(str);
        return iU == -1 ? str : str.substring(0, iU);
    }

    public static String G(String str) {
        if (str == null) {
            return null;
        }
        return A() ? I(str) : H(str);
    }

    public static String H(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace('\\', '/');
    }

    public static String I(String str) {
        if (str != null && str.indexOf(47) != -1) {
            str = str.replace('/', '\\');
        }
        return str;
    }

    static String[] J(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int length = charArray.length;
        int i10 = 0;
        char c10 = 0;
        while (i10 < length) {
            char c11 = charArray[i10];
            if (c11 == '?' || c11 == '*') {
                if (sb2.length() != 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
                if (c11 == '?') {
                    arrayList.add(com.planner5d.library.model.payments.a.f222474i);
                } else if (c10 != '*') {
                    arrayList.add("*");
                }
            } else {
                sb2.append(c11);
            }
            i10++;
            c10 = c11;
        }
        if (sb2.length() != 0) {
            arrayList.add(sb2.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean K(String str, String str2) {
        return L(str, str2, n.SENSITIVE);
    }

    public static boolean L(String str, String str2, n nVar) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            if (nVar == null) {
                nVar = n.SENSITIVE;
            }
            String[] strArrJ = J(str2);
            Stack stack = new Stack();
            boolean z10 = false;
            int length = 0;
            int i10 = 0;
            do {
                if (stack.size() > 0) {
                    int[] iArr = (int[]) stack.pop();
                    i10 = iArr[0];
                    length = iArr[1];
                    z10 = true;
                }
                while (i10 < strArrJ.length) {
                    if (strArrJ[i10].equals(com.planner5d.library.model.payments.a.f222474i)) {
                        length++;
                        if (length > str.length()) {
                            break;
                        }
                        z10 = false;
                        i10++;
                    } else {
                        if (strArrJ[i10].equals("*")) {
                            if (i10 == strArrJ.length - 1) {
                                length = str.length();
                            }
                            z10 = true;
                        } else if (z10) {
                            length = nVar.e(str, length, strArrJ[i10]);
                            if (length == -1) {
                                break;
                            }
                            int iE = nVar.e(str, length + 1, strArrJ[i10]);
                            if (iE >= 0) {
                                stack.push(new int[]{i10, iE});
                            }
                            length += strArrJ[i10].length();
                            z10 = false;
                        } else {
                            if (!nVar.f(str, length, strArrJ[i10])) {
                                break;
                            }
                            length += strArrJ[i10].length();
                            z10 = false;
                        }
                        i10++;
                    }
                }
                if (i10 == strArrJ.length && length == str.length()) {
                    return true;
                }
            } while (stack.size() > 0);
        }
        return false;
    }

    public static boolean M(String str, String str2) {
        return L(str, str2, n.SYSTEM);
    }

    public static String a(String str, String str2) {
        int iT = t(str2);
        if (iT < 0) {
            return null;
        }
        if (iT > 0) {
            return B(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return B(str2);
        }
        if (z(str.charAt(length - 1))) {
            return B(str + str2);
        }
        return B(str + '/' + str2);
    }

    public static boolean b(String str, String str2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (str2 == null) {
            return false;
        }
        n nVar = n.SYSTEM;
        if (nVar.d(str, str2)) {
            return false;
        }
        return nVar.k(str2, str);
    }

    private static String c(String str, boolean z10) {
        int iT;
        if (str == null || (iT = t(str)) < 0) {
            return null;
        }
        if (iT >= str.length()) {
            if (z10) {
                str = s(str);
            }
            return str;
        }
        int iV = v(str);
        if (iV < 0) {
            return str.substring(0, iT);
        }
        int i10 = iV + (z10 ? 1 : 0);
        if (i10 == 0) {
            i10++;
        }
        return str.substring(0, i10);
    }

    private static String d(String str, int i10) {
        int iT;
        if (str == null || (iT = t(str)) < 0) {
            return null;
        }
        int iV = v(str);
        int i11 = i10 + iV;
        if (iT >= str.length() || iV < 0 || iT >= i11) {
            return "";
        }
        String strSubstring = str.substring(iT, i11);
        k(strSubstring);
        return strSubstring;
    }

    private static String e(String str, char c10, boolean z10) {
        boolean z11;
        if (str == null) {
            return null;
        }
        k(str);
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int iT = t(str);
        if (iT < 0) {
            return null;
        }
        int i10 = length + 2;
        char[] cArr = new char[i10];
        str.getChars(0, str.length(), cArr, 0);
        char c11 = f336712f;
        if (c10 == c11) {
            c11 = f336713g;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (cArr[i11] == c11) {
                cArr[i11] = c10;
            }
        }
        if (cArr[length - 1] != c10) {
            cArr[length] = c10;
            length++;
            z11 = false;
        } else {
            z11 = true;
        }
        int i12 = iT + 1;
        int i13 = i12;
        while (i13 < length) {
            if (cArr[i13] == c10) {
                int i14 = i13 - 1;
                if (cArr[i14] == c10) {
                    System.arraycopy(cArr, i13, cArr, i14, length - i13);
                    length--;
                    i13--;
                }
            }
            i13++;
        }
        int i15 = i12;
        while (i15 < length) {
            if (cArr[i15] == c10) {
                int i16 = i15 - 1;
                if (cArr[i16] == '.' && (i15 == i12 || cArr[i15 - 2] == c10)) {
                    if (i15 == length - 1) {
                        z11 = true;
                    }
                    System.arraycopy(cArr, i15 + 1, cArr, i16, length - i15);
                    length -= 2;
                    i15--;
                }
            }
            i15++;
        }
        int i17 = iT + 2;
        int i18 = i17;
        while (i18 < length) {
            if (cArr[i18] == c10 && cArr[i18 - 1] == '.' && cArr[i18 - 2] == '.' && (i18 == i17 || cArr[i18 - 3] == c10)) {
                if (i18 == i17) {
                    return null;
                }
                if (i18 == length - 1) {
                    z11 = true;
                }
                int i19 = i18 - 4;
                while (true) {
                    if (i19 < iT) {
                        int i20 = i18 + 1;
                        System.arraycopy(cArr, i20, cArr, iT, length - i18);
                        length -= i20 - iT;
                        i18 = i12;
                        break;
                    }
                    if (cArr[i19] == c10) {
                        int i21 = i19 + 1;
                        System.arraycopy(cArr, i18 + 1, cArr, i21, length - i18);
                        length -= i18 - i19;
                        i18 = i21;
                        break;
                    }
                    i19--;
                }
            }
            i18++;
        }
        if (length <= 0) {
            return "";
        }
        if (length <= iT) {
            return new String(cArr, 0, length);
        }
        return (z11 && z10) ? new String(cArr, 0, length) : new String(cArr, 0, length - 1);
    }

    public static boolean f(String str, String str2) {
        return g(str, str2, false, n.SENSITIVE);
    }

    public static boolean g(String str, String str2, boolean z10, n nVar) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (z10) {
            str = B(str);
            str2 = B(str2);
            if (str == null || str2 == null) {
                throw new NullPointerException("Error normalizing one or both of the file names");
            }
        }
        if (nVar == null) {
            nVar = n.SENSITIVE;
        }
        return nVar.d(str, str2);
    }

    public static boolean h(String str, String str2) {
        return g(str, str2, true, n.SENSITIVE);
    }

    public static boolean i(String str, String str2) {
        return g(str, str2, true, n.SYSTEM);
    }

    public static boolean j(String str, String str2) {
        return g(str, str2, false, n.SYSTEM);
    }

    private static void k(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) == 0) {
                throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }

    public static String l(String str) {
        return F(p(str));
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        int iU = u(str);
        return iU == -1 ? "" : str.substring(iU + 1);
    }

    public static String n(String str) {
        return c(str, true);
    }

    public static String o(String str) {
        return c(str, false);
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        k(str);
        return str.substring(v(str) + 1);
    }

    public static String q(String str) {
        return d(str, 1);
    }

    public static String r(String str) {
        return d(str, 0);
    }

    public static String s(String str) {
        int iT;
        if (str == null || (iT = t(str)) < 0) {
            return null;
        }
        if (iT <= str.length()) {
            String strSubstring = str.substring(0, iT);
            k(strSubstring);
            return strSubstring;
        }
        k(str + '/');
        return str + '/';
    }

    public static int t(String str) {
        int iMin;
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (cCharAt == '~') {
                return 2;
            }
            return z(cCharAt) ? 1 : 0;
        }
        if (cCharAt == '~') {
            int iIndexOf = str.indexOf(47, 1);
            int iIndexOf2 = str.indexOf(92, 1);
            if (iIndexOf == -1 && iIndexOf2 == -1) {
                return length + 1;
            }
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            if (iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            iMin = Math.min(iIndexOf, iIndexOf2);
        } else {
            char cCharAt2 = str.charAt(1);
            if (cCharAt2 == ':') {
                char upperCase = Character.toUpperCase(cCharAt);
                if (upperCase < 'A' || upperCase > 'Z') {
                    return -1;
                }
                return (length == 2 || !z(str.charAt(2))) ? 2 : 3;
            }
            if (!z(cCharAt) || !z(cCharAt2)) {
                return z(cCharAt) ? 1 : 0;
            }
            int iIndexOf3 = str.indexOf(47, 2);
            int iIndexOf4 = str.indexOf(92, 2);
            if ((iIndexOf3 == -1 && iIndexOf4 == -1) || iIndexOf3 == 2 || iIndexOf4 == 2) {
                return -1;
            }
            if (iIndexOf3 == -1) {
                iIndexOf3 = iIndexOf4;
            }
            if (iIndexOf4 == -1) {
                iIndexOf4 = iIndexOf3;
            }
            iMin = Math.min(iIndexOf3, iIndexOf4);
        }
        return iMin + 1;
    }

    public static int u(String str) {
        int iLastIndexOf;
        if (str != null && v(str) <= (iLastIndexOf = str.lastIndexOf(46))) {
            return iLastIndexOf;
        }
        return -1;
    }

    public static int v(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static boolean w(String str, String str2) {
        if (str == null) {
            return false;
        }
        k(str);
        if (str2 != null && !str2.isEmpty()) {
            return m(str).equals(str2);
        }
        return u(str) == -1;
    }

    public static boolean x(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        k(str);
        if (collection == null || collection.isEmpty()) {
            return u(str) == -1;
        }
        String strM = m(str);
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (strM.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean y(String str, String[] strArr) {
        if (str == null) {
            return false;
        }
        k(str);
        if (strArr == null || strArr.length == 0) {
            return u(str) == -1;
        }
        String strM = m(str);
        for (String str2 : strArr) {
            if (strM.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean z(char c10) {
        if (c10 != '/' && c10 != '\\') {
            return false;
        }
        return true;
    }
}
