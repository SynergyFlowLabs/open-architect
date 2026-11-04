package org.apache.commons.codec.language;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class j implements nk.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f335434b = {'A'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f335435c = {'A', org.locationtech.jts.geom.l.f338157g};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f335436d = {'C'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f335437e = {org.locationtech.jts.geom.l.f338157g, org.locationtech.jts.geom.l.f338157g};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char[] f335438f = {'G'};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char[] f335439g = {'N'};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char[] f335440h = {'N', 'N'};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char[] f335441i = {'S'};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f335442j = {'S', 'S', 'S'};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f335443k = Pattern.compile("^MAC");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f335444l = Pattern.compile("^KN");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f335445m = Pattern.compile("^K");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f335446n = Pattern.compile("^(PH|PF)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f335447o = Pattern.compile("^SCH");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f335448p = Pattern.compile("(EE|IE)$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f335449q = Pattern.compile("(DT|RT|RD|NT|ND)$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final char f335450r = ' ';

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f335451s = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f335452a;

    static {
        boolean z10 = true;
    }

    public j() {
        this(true);
    }

    private static boolean c(char c10) {
        return c10 == 'A' || c10 == 'E' || c10 == 'I' || c10 == 'O' || c10 == 'U';
    }

    private static char[] g(char c10, char c11, char c12, char c13) {
        if (c11 == 'E' && c12 == 'V') {
            return f335435c;
        }
        if (c(c11)) {
            return f335434b;
        }
        if (c11 == 'Q') {
            return f335438f;
        }
        if (c11 == 'Z') {
            return f335441i;
        }
        if (c11 == 'M') {
            return f335439g;
        }
        if (c11 == 'K') {
            return c12 == 'N' ? f335440h : f335436d;
        }
        if (c11 == 'S' && c12 == 'C' && c13 == 'H') {
            return f335442j;
        }
        if (c11 == 'P' && c12 == 'H') {
            return f335437e;
        }
        if (c11 != 'H' || (c(c10) && c(c12))) {
            return (c11 == 'W' && c(c10)) ? new char[]{c10} : new char[]{c11};
        }
        return new char[]{c10};
    }

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return d((String) obj);
        }
        throw new nk.h("Parameter supplied to Nysiis encode is not of type java.lang.String");
    }

    public boolean b() {
        return this.f335452a;
    }

    public String d(String str) {
        if (str == null) {
            return null;
        }
        String strA = m.a(str);
        if (strA.length() == 0) {
            return strA;
        }
        String strReplaceFirst = f335449q.matcher(f335448p.matcher(f335447o.matcher(f335446n.matcher(f335445m.matcher(f335444l.matcher(f335443k.matcher(strA).replaceFirst("MCC")).replaceFirst("NN")).replaceFirst("C")).replaceFirst("FF")).replaceFirst("SSS")).replaceFirst(org.locationtech.jts.io.gml2.a.f338504v)).replaceFirst("D");
        StringBuilder sb2 = new StringBuilder(strReplaceFirst.length());
        sb2.append(strReplaceFirst.charAt(0));
        char[] charArray = strReplaceFirst.toCharArray();
        int length = charArray.length;
        int i10 = 1;
        while (i10 < length) {
            int i11 = length - 1;
            char c10 = f335450r;
            char c11 = i10 < i11 ? charArray[i10 + 1] : ' ';
            if (i10 < length - 2) {
                c10 = charArray[i10 + 2];
            }
            int i12 = i10 - 1;
            char[] cArrG = g(charArray[i12], charArray[i10], c11, c10);
            System.arraycopy(cArrG, 0, charArray, i10, cArrG.length);
            char c12 = charArray[i10];
            if (c12 != charArray[i12]) {
                sb2.append(c12);
            }
            i10++;
        }
        if (sb2.length() > 1) {
            char cCharAt = sb2.charAt(sb2.length() - 1);
            if (cCharAt == 'S') {
                sb2.deleteCharAt(sb2.length() - 1);
                cCharAt = sb2.charAt(sb2.length() - 1);
            }
            if (sb2.length() > 2 && sb2.charAt(sb2.length() - 2) == 'A' && cCharAt == 'Y') {
                sb2.deleteCharAt(sb2.length() - 2);
            }
            if (cCharAt == 'A') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
        }
        String string = sb2.toString();
        return b() ? string.substring(0, Math.min(6, string.length())) : string;
    }

    @Override // nk.j
    public String f(String str) {
        return d(str);
    }

    public j(boolean z10) {
        this.f335452a = z10;
    }
}
