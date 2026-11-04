package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes14.dex */
public class j {
    public static boolean a(String str, String... strArr) {
        if (!z.A0(str) && !c(strArr)) {
            i iVarD = i.d(strArr);
            for (char c10 : str.toCharArray()) {
                if (iVarD.b(c10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int b(String str, String... strArr) {
        if (z.A0(str) || c(strArr)) {
            return 0;
        }
        i iVarD = i.d(strArr);
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            if (iVarD.b(c10)) {
                i10++;
            }
        }
        return i10;
    }

    private static boolean c(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (z.F0(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String d(String str, String... strArr) {
        if (!z.A0(str) && !c(strArr)) {
            return f(str, strArr, false);
        }
        return str;
    }

    public static String e(String str, String... strArr) {
        if (str == null) {
            return null;
        }
        return (str.isEmpty() || c(strArr)) ? "" : f(str, strArr, true);
    }

    private static String f(String str, String[] strArr, boolean z10) {
        i iVarD = i.d(strArr);
        StringBuilder sb2 = new StringBuilder(str.length());
        for (char c10 : str.toCharArray()) {
            if (iVarD.b(c10) == z10) {
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058 A[PHI: r5
      0x0058: PHI (r5v2 java.lang.Character) = (r5v1 java.lang.Character), (r5v4 java.lang.Character), (r5v1 java.lang.Character) binds: [B:10:0x0030, B:23:0x0054, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    public static String g(String str, String... strArr) {
        if (z.A0(str) || c(strArr)) {
            return str;
        }
        i iVarD = i.d(strArr);
        StringBuilder sb2 = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char c10 = charArray[0];
        sb2.append(c10);
        Character chValueOf = null;
        Character chValueOf2 = null;
        for (int i10 = 1; i10 < length; i10++) {
            char c11 = charArray[i10];
            if (c11 != c10) {
                sb2.append(c11);
                c10 = c11;
            } else if (chValueOf == null || c11 != chValueOf.charValue()) {
                if (chValueOf2 != null && c11 == chValueOf2.charValue()) {
                    sb2.append(c11);
                    c10 = c11;
                } else if (iVarD.b(c11)) {
                    chValueOf = Character.valueOf(c11);
                } else {
                    chValueOf2 = Character.valueOf(c11);
                    sb2.append(c11);
                    c10 = c11;
                }
            }
        }
        return sb2.toString();
    }
}
