package org.apache.commons.lang3.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class j {
    public static String a(String str) {
        return b(str, null);
    }

    public static String b(String str, char... cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (!z.A0(str) && length != 0) {
            char[] charArray = str.toCharArray();
            boolean z10 = true;
            for (int i10 = 0; i10 < charArray.length; i10++) {
                char c10 = charArray[i10];
                if (h(c10, cArr)) {
                    z10 = true;
                } else if (z10) {
                    charArray[i10] = Character.toTitleCase(c10);
                    z10 = false;
                }
            }
            return new String(charArray);
        }
        return str;
    }

    public static String c(String str) {
        return d(str, null);
    }

    public static String d(String str, char... cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (!z.A0(str) && length != 0) {
            str = b(str.toLowerCase(), cArr);
        }
        return str;
    }

    public static boolean e(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!z.A0(charSequence) && !org.apache.commons.lang3.c.H0(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (z.z0(charSequence2)) {
                    return false;
                }
                if (!Pattern.compile(".*\\b" + ((Object) charSequence2) + "\\b.*").matcher(charSequence).matches()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static String f(String str) {
        return g(str, null);
    }

    public static String g(String str, char... cArr) {
        if (z.A0(str)) {
            return str;
        }
        if (cArr != null && cArr.length == 0) {
            return "";
        }
        int length = str.length();
        char[] cArr2 = new char[(length / 2) + 1];
        boolean z10 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (h(cCharAt, cArr)) {
                z10 = true;
            } else if (z10) {
                cArr2[i10] = cCharAt;
                i10++;
                z10 = false;
            }
        }
        return new String(cArr2, 0, i10);
    }

    private static boolean h(char c10, char[] cArr) {
        if (cArr == null) {
            return Character.isWhitespace(c10);
        }
        for (char c11 : cArr) {
            if (c10 == c11) {
                return true;
            }
        }
        return false;
    }

    public static String i(String str) {
        if (z.A0(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean zIsWhitespace = true;
        int i10 = 0;
        while (i10 < charArray.length) {
            char c10 = charArray[i10];
            if (Character.isUpperCase(c10) || Character.isTitleCase(c10)) {
                charArray[i10] = Character.toLowerCase(c10);
            } else {
                if (!Character.isLowerCase(c10)) {
                    zIsWhitespace = Character.isWhitespace(c10);
                } else if (zIsWhitespace) {
                    charArray[i10] = Character.toTitleCase(c10);
                } else {
                    charArray[i10] = Character.toUpperCase(c10);
                }
                i10++;
            }
            zIsWhitespace = false;
            i10++;
        }
        return new String(charArray);
    }

    public static String j(String str) {
        return k(str, null);
    }

    public static String k(String str, char... cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (z.A0(str) || length == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean z10 = true;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            if (h(c10, cArr)) {
                z10 = true;
            } else if (z10) {
                charArray[i10] = Character.toLowerCase(c10);
                z10 = false;
            }
        }
        return new String(charArray);
    }

    public static String l(String str, int i10) {
        return m(str, i10, null, false);
    }

    public static String m(String str, int i10, String str2, boolean z10) {
        return n(str, i10, str2, z10, " ");
    }

    public static String n(String str, int i10, String str2, boolean z10, String str3) {
        int iStart;
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = System.lineSeparator();
        }
        if (i10 < 1) {
            i10 = 1;
        }
        if (z.z0(str3)) {
            str3 = " ";
        }
        Pattern patternCompile = Pattern.compile(str3);
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 32);
        int iEnd = 0;
        while (iEnd < length) {
            int i11 = iEnd + i10;
            Matcher matcher = patternCompile.matcher(str.substring(iEnd, Math.min(i11 + 1, length)));
            if (!matcher.find()) {
                iStart = -1;
            } else if (matcher.start() == 0) {
                iEnd += matcher.end();
            } else {
                iStart = matcher.start() + iEnd;
            }
            if (length - iEnd <= i10) {
                break;
            }
            while (matcher.find()) {
                iStart = matcher.start() + iEnd;
            }
            if (iStart >= iEnd) {
                sb2.append((CharSequence) str, iEnd, iStart);
                sb2.append(str2);
            } else if (z10) {
                sb2.append((CharSequence) str, iEnd, i11);
                sb2.append(str2);
                iEnd = i11;
            } else {
                Matcher matcher2 = patternCompile.matcher(str.substring(i11));
                if (matcher2.find()) {
                    iStart = matcher2.start() + iEnd + i10;
                }
                if (iStart >= 0) {
                    sb2.append((CharSequence) str, iEnd, iStart);
                    sb2.append(str2);
                } else {
                    sb2.append((CharSequence) str, iEnd, str.length());
                    iEnd = length;
                }
            }
            iEnd = iStart + 1;
        }
        sb2.append((CharSequence) str, iEnd, str.length());
        return sb2.toString();
    }
}
