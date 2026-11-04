package com.google.zxing.client.result;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u[] f130263a = {new f(), new c(), new j(), new b(), new f0(), new e(), new g0(), new i(), new y(), new a0(), new v(), new x(), new n(), new k0(), new e0(), new d0(), new p(), new t(), new l(), new i0()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f130264b = Pattern.compile("\\d+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f130265c = Pattern.compile("&");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f130266d = Pattern.compile("=");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f130267e = "\ufeff";

    private static void a(CharSequence charSequence, Map<String, String> map) {
        String[] strArrSplit = f130266d.split(charSequence, 2);
        if (strArrSplit.length == 2) {
            try {
                map.put(strArrSplit[0], p(strArrSplit[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private static int b(CharSequence charSequence, int i10) {
        int i11 = 0;
        for (int i12 = i10 - 1; i12 >= 0 && charSequence.charAt(i12) == '\\'; i12--) {
            i11++;
        }
        return i11;
    }

    protected static String c(com.google.zxing.r rVar) {
        String strG = rVar.g();
        if (strG.startsWith(f130267e)) {
            strG = strG.substring(1);
        }
        return strG;
    }

    protected static boolean d(CharSequence charSequence, int i10) {
        return charSequence != null && i10 > 0 && i10 == charSequence.length() && f130264b.matcher(charSequence).matches();
    }

    protected static boolean e(CharSequence charSequence, int i10, int i11) {
        int i12;
        if (charSequence == null || i11 <= 0 || charSequence.length() < (i12 = i11 + i10) || !f130264b.matcher(charSequence.subSequence(i10, i12)).matches()) {
            return false;
        }
        int i13 = 7 & 1;
        return true;
    }

    static String[] f(String str, String str2, char c10, boolean z10) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str2.indexOf(str, i10);
            if (iIndexOf < 0) {
                break;
            }
            int length2 = iIndexOf + str.length();
            boolean z11 = true;
            ArrayList arrayList2 = arrayList;
            int length3 = length2;
            while (z11) {
                int iIndexOf2 = str2.indexOf(c10, length3);
                if (iIndexOf2 < 0) {
                    length3 = str2.length();
                } else if (b(str2, iIndexOf2) % 2 != 0) {
                    length3 = iIndexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String strO = o(str2.substring(length2, iIndexOf2));
                    if (z10) {
                        strO = strO.trim();
                    }
                    if (!strO.isEmpty()) {
                        arrayList2.add(strO);
                    }
                    length3 = iIndexOf2 + 1;
                }
                z11 = false;
            }
            i10 = length3;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    static String g(String str, String str2, char c10, boolean z10) {
        String[] strArrF = f(str, str2, c10, z10);
        if (strArrF == null) {
            return null;
        }
        return strArrF[0];
    }

    protected static void h(String str, StringBuilder sb2) {
        if (str != null) {
            sb2.append('\n');
            sb2.append(str);
        }
    }

    protected static void i(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append('\n');
                sb2.append(str);
            }
        }
    }

    protected static String[] j(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    protected static int l(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - org.locationtech.jts.geom.l.f338160j;
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    static Map<String, String> m(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf < 0) {
            return null;
        }
        HashMap map = new HashMap(3);
        for (String str2 : f130265c.split(str.substring(iIndexOf + 1))) {
            a(str2, map);
        }
        return map;
    }

    public static q n(com.google.zxing.r rVar) {
        for (u uVar : f130263a) {
            q qVarK = uVar.k(rVar);
            if (qVarK != null) {
                return qVarK;
            }
        }
        return new b0(rVar.g(), null);
    }

    protected static String o(String str) {
        int iIndexOf = str.indexOf(92);
        if (iIndexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length - 1);
        sb2.append(str.toCharArray(), 0, iIndexOf);
        boolean z10 = false;
        while (iIndexOf < length) {
            char cCharAt = str.charAt(iIndexOf);
            if (z10 || cCharAt != '\\') {
                sb2.append(cCharAt);
                z10 = false;
            } else {
                z10 = true;
            }
            iIndexOf++;
        }
        return sb2.toString();
    }

    static String p(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public abstract q k(com.google.zxing.r rVar);
}
