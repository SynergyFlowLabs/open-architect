package com.google.zxing.client.result;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f130174f = Pattern.compile("BEGIN:VCARD", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f130175g = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f130176h = Pattern.compile("\r\n[ \t]");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f130177i = Pattern.compile("\\\\[nN]");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f130178j = Pattern.compile("\\\\([,;\\\\])");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f130179k = Pattern.compile("=");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f130180l = Pattern.compile(";");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f130181m = Pattern.compile("(?<!\\\\);+");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f130182n = Pattern.compile(",");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f130183o = Pattern.compile("[;,]");

    private static String[] A(Collection<List<String>> collection) {
        String strSubstring;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = list.get(0);
            if (str != null && !str.isEmpty()) {
                int i10 = 1;
                while (true) {
                    if (i10 >= list.size()) {
                        strSubstring = null;
                        break;
                    }
                    strSubstring = list.get(i10);
                    int iIndexOf = strSubstring.indexOf(61);
                    if (iIndexOf < 0) {
                        break;
                    }
                    if ("TYPE".equalsIgnoreCase(strSubstring.substring(0, iIndexOf))) {
                        strSubstring = strSubstring.substring(iIndexOf + 1);
                        break;
                    }
                    i10++;
                }
                arrayList.add(strSubstring);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static String q(CharSequence charSequence, String str) {
        char cCharAt;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = 5 ^ 0;
        while (i10 < length) {
            char cCharAt2 = charSequence.charAt(i10);
            if (cCharAt2 != '\n' && cCharAt2 != '\r') {
                if (cCharAt2 != '=') {
                    w(byteArrayOutputStream, str, sb2);
                    sb2.append(cCharAt2);
                } else if (i10 < length - 2 && (cCharAt = charSequence.charAt(i10 + 1)) != '\r' && cCharAt != '\n') {
                    i10 += 2;
                    char cCharAt3 = charSequence.charAt(i10);
                    int iL = u.l(cCharAt);
                    int iL2 = u.l(cCharAt3);
                    if (iL >= 0 && iL2 >= 0) {
                        byteArrayOutputStream.write((iL << 4) + iL2);
                    }
                }
            }
            i10++;
        }
        w(byteArrayOutputStream, str, sb2);
        return sb2.toString();
    }

    private static void r(Iterable<List<String>> iterable) {
        int iIndexOf;
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i10 = 0;
                int i11 = 0;
                while (i10 < 4 && (iIndexOf = str.indexOf(59, i11)) >= 0) {
                    strArr[i10] = str.substring(i11, iIndexOf);
                    i10++;
                    i11 = iIndexOf + 1;
                }
                strArr[i10] = str.substring(i11);
                StringBuilder sb2 = new StringBuilder(100);
                v(strArr, 3, sb2);
                v(strArr, 1, sb2);
                v(strArr, 2, sb2);
                v(strArr, 0, sb2);
                v(strArr, 4, sb2);
                list.set(0, sb2.toString().trim());
            }
        }
    }

    private static boolean s(CharSequence charSequence) {
        return charSequence == null || f130175g.matcher(charSequence).matches();
    }

    static List<String> t(CharSequence charSequence, String str, boolean z10, boolean z11) {
        List<List<String>> listU = u(charSequence, str, z10, z11);
        if (listU == null || listU.isEmpty()) {
            return null;
        }
        return listU.get(0);
    }

    static List<List<String>> u(CharSequence charSequence, String str, boolean z10, boolean z11) {
        int i10;
        int i11;
        ArrayList arrayList;
        String str2;
        String str3;
        int iIndexOf;
        int i12;
        String strReplaceAll;
        int i13;
        int length = str.length();
        int i14 = 0;
        int i15 = 0;
        ArrayList arrayList2 = null;
        while (i15 < length) {
            Matcher matcher = Pattern.compile("(?:^|\n)" + ((Object) charSequence) + "(?:;([^:]*))?:", 2).matcher(str);
            if (i15 > 0) {
                i15--;
            }
            if (!matcher.find(i15)) {
                break;
            }
            int iEnd = matcher.end(i14);
            int i16 = 1;
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                String[] strArrSplit = f130180l.split(strGroup);
                int length2 = strArrSplit.length;
                int i17 = i14;
                i11 = i17;
                arrayList = null;
                str2 = null;
                str3 = null;
                while (i17 < length2) {
                    String str4 = strArrSplit[i17];
                    if (arrayList == null) {
                        arrayList = new ArrayList(i16);
                    }
                    arrayList.add(str4);
                    int i18 = i14;
                    String[] strArrSplit2 = f130179k.split(str4, 2);
                    if (strArrSplit2.length > i16) {
                        String str5 = strArrSplit2[i18];
                        String str6 = strArrSplit2[i16];
                        i13 = i16;
                        if ("ENCODING".equalsIgnoreCase(str5) && "QUOTED-PRINTABLE".equalsIgnoreCase(str6)) {
                            i11 = i13;
                        } else if ("CHARSET".equalsIgnoreCase(str5)) {
                            str2 = str6;
                        } else if ("VALUE".equalsIgnoreCase(str5)) {
                            str3 = str6;
                        }
                    } else {
                        i13 = i16;
                    }
                    i17++;
                    i14 = i18;
                    i16 = i13;
                }
                i10 = i14;
            } else {
                i10 = i14;
                i11 = i10;
                arrayList = null;
                str2 = null;
                str3 = null;
            }
            int i19 = i16;
            int i20 = iEnd;
            while (true) {
                iIndexOf = str.indexOf(10, i20);
                if (iIndexOf < 0) {
                    break;
                }
                if (iIndexOf < str.length() - 1) {
                    int i21 = iIndexOf + 1;
                    if (str.charAt(i21) == ' ' || str.charAt(i21) == '\t') {
                        i20 = iIndexOf + 2;
                    }
                }
                if (i11 == 0 || ((iIndexOf <= 0 || str.charAt(iIndexOf - 1) != '=') && (iIndexOf < 2 || str.charAt(iIndexOf - 2) != '='))) {
                    break;
                }
                i20 = iIndexOf + 1;
            }
            if (iIndexOf < 0) {
                i15 = length;
                i14 = i10;
            } else {
                if (iIndexOf <= iEnd) {
                    i12 = i10;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(i19);
                    }
                    if (iIndexOf > 0 && str.charAt(iIndexOf - 1) == '\r') {
                        iIndexOf--;
                    }
                    String strSubstring = str.substring(iEnd, iIndexOf);
                    if (z10) {
                        strSubstring = strSubstring.trim();
                    }
                    if (i11 != 0) {
                        strReplaceAll = q(strSubstring, str2);
                        if (z11) {
                            strReplaceAll = f130181m.matcher(strReplaceAll).replaceAll("\n").trim();
                        }
                    } else {
                        if (z11) {
                            strSubstring = f130181m.matcher(strSubstring).replaceAll("\n").trim();
                        }
                        strReplaceAll = f130178j.matcher(f130177i.matcher(f130176h.matcher(strSubstring).replaceAll("")).replaceAll("\n")).replaceAll("$1");
                    }
                    if ("uri".equals(str3)) {
                        try {
                            strReplaceAll = URI.create(strReplaceAll).getSchemeSpecificPart();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(strReplaceAll);
                        arrayList2.add(arrayList3);
                        i12 = i10;
                    } else {
                        i12 = i10;
                        arrayList.add(i12, strReplaceAll);
                        arrayList2.add(arrayList);
                    }
                }
                i14 = i12;
                i15 = iIndexOf + 1;
            }
        }
        return arrayList2;
    }

    private static void v(String[] strArr, int i10, StringBuilder sb2) {
        String str = strArr[i10];
        if (str != null && !str.isEmpty()) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(strArr[i10]);
        }
    }

    private static void w(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb2) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb2.append(str2);
        }
    }

    private static String y(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static String[] z(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<List<String>> it = collection.iterator();
        while (it.hasNext()) {
            String str = it.next().get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.r rVar) {
        String strC = u.c(rVar);
        Matcher matcher = f130174f.matcher(strC);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> listU = u("FN", strC, true, false);
        if (listU == null) {
            listU = u("N", strC, true, false);
            r(listU);
        }
        List<String> listT = t("NICKNAME", strC, true, false);
        String[] strArrSplit = listT == null ? null : f130182n.split(listT.get(0));
        List<List<String>> listU2 = u("TEL", strC, true, false);
        List<List<String>> listU3 = u("EMAIL", strC, true, false);
        List<String> listT2 = t("NOTE", strC, false, false);
        List<List<String>> listU4 = u("ADR", strC, true, true);
        List<String> listT3 = t("ORG", strC, true, true);
        List<String> listT4 = t("BDAY", strC, true, false);
        if (listT4 != null && !s(listT4.get(0))) {
            listT4 = null;
        }
        List<String> listT5 = t("TITLE", strC, true, false);
        List<List<String>> listU5 = u("URL", strC, true, false);
        List<String> listT6 = t("IMPP", strC, true, false);
        List<String> listT7 = t("GEO", strC, true, false);
        String[] strArrSplit2 = listT7 == null ? null : f130183o.split(listT7.get(0));
        return new d(z(listU), strArrSplit, null, z(listU2), A(listU2), z(listU3), A(listU3), y(listT6), y(listT2), z(listU4), A(listU4), y(listT3), y(listT4), y(listT5), z(listU5), (strArrSplit2 == null || strArrSplit2.length == 2) ? strArrSplit2 : null);
    }
}
