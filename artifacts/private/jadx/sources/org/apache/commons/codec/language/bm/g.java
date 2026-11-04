package org.apache.commons.codec.language.bm;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f335338f = "ALL";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f335339g = "\"";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f335340h = "#include";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f335342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f335343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f335344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f335345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f335337e = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<org.apache.commons.codec.language.bm.d, Map<org.apache.commons.codec.language.bm.h, Map<String, Map<String, List<g>>>>> f335341i = new EnumMap(org.apache.commons.codec.language.bm.d.class);

    static class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Pattern f335346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f335347b;

        a(String str) {
            this.f335347b = str;
            this.f335346a = Pattern.compile(str);
        }

        @Override // org.apache.commons.codec.language.bm.g.n
        public boolean a(CharSequence charSequence) {
            return this.f335346a.matcher(charSequence).find();
        }
    }

    static class b implements n {
        b() {
        }

        @Override // org.apache.commons.codec.language.bm.g.n
        public boolean a(CharSequence charSequence) {
            return true;
        }
    }

    static class c extends g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f335348j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f335349k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f335350l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f335351m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f335352n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f335353o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f335354p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, String str3, l lVar, int i10, String str4, String str5, String str6, String str7) {
            super(str, str2, str3, lVar);
            this.f335350l = i10;
            this.f335351m = str4;
            this.f335352n = str5;
            this.f335353o = str6;
            this.f335354p = str7;
            this.f335348j = i10;
            this.f335349k = str4;
        }

        public String toString() {
            return "Rule{line=" + this.f335348j + ", loc='" + this.f335349k + "', pat='" + this.f335352n + "', lcon='" + this.f335353o + "', rcon='" + this.f335354p + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    static class d implements n {
        d() {
        }

        @Override // org.apache.commons.codec.language.bm.g.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() == 0;
        }
    }

    static class e implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f335355a;

        e(String str) {
            this.f335355a = str;
        }

        @Override // org.apache.commons.codec.language.bm.g.n
        public boolean a(CharSequence charSequence) {
            return charSequence.equals(this.f335355a);
        }
    }

    static class f implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f335356a;

        f(String str) {
            this.f335356a = str;
        }

        @Override // org.apache.commons.codec.language.bm.g.n
        public boolean a(CharSequence charSequence) {
            return g.v(charSequence, this.f335356a);
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.g$g, reason: collision with other inner class name */
    static class C2382g implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f335357a;

        C2382g(String str) {
            this.f335357a = str;
        }

        @Override // org.apache.commons.codec.language.bm.g.n
        public boolean a(CharSequence charSequence) {
            return g.h(charSequence, this.f335357a);
        }
    }

    static class h implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f335358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f335359b;

        h(String str, boolean z10) {
            this.f335358a = str;
            this.f335359b = z10;
        }

        @Override // org.apache.commons.codec.language.bm.g.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() == 1 && g.d(this.f335358a, charSequence.charAt(0)) == this.f335359b;
        }
    }

    static class i implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f335360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f335361b;

        i(String str, boolean z10) {
            this.f335360a = str;
            this.f335361b = z10;
        }

        @Override // org.apache.commons.codec.language.bm.g.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() > 0 && g.d(this.f335360a, charSequence.charAt(0)) == this.f335361b;
        }
    }

    static class j implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f335362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f335363b;

        j(String str, boolean z10) {
            this.f335362a = str;
            this.f335363b = z10;
        }

        @Override // org.apache.commons.codec.language.bm.g.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() > 0 && g.d(this.f335362a, charSequence.charAt(charSequence.length() - 1)) == this.f335363b;
        }
    }

    public interface l {
        Iterable<k> a();
    }

    public static final class m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<k> f335367a;

        public m(List<k> list) {
            this.f335367a = list;
        }

        @Override // org.apache.commons.codec.language.bm.g.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<k> a() {
            return this.f335367a;
        }
    }

    public interface n {
        boolean a(CharSequence charSequence);
    }

    static {
        for (org.apache.commons.codec.language.bm.d dVar : org.apache.commons.codec.language.bm.d.values()) {
            EnumMap enumMap = new EnumMap(org.apache.commons.codec.language.bm.h.class);
            for (org.apache.commons.codec.language.bm.h hVar : org.apache.commons.codec.language.bm.h.values()) {
                HashMap map = new HashMap();
                for (String str : org.apache.commons.codec.language.bm.c.b(dVar).c()) {
                    Scanner scannerG = g(dVar, hVar, str);
                    try {
                        try {
                            map.put(str, s(scannerG, e(dVar, hVar, str)));
                            scannerG.close();
                        } catch (IllegalStateException e10) {
                            throw new IllegalStateException("Problem processing " + e(dVar, hVar, str), e10);
                        }
                    } catch (Throwable th2) {
                        scannerG.close();
                        throw th2;
                    }
                }
                if (!hVar.equals(org.apache.commons.codec.language.bm.h.RULES)) {
                    Scanner scannerG2 = g(dVar, hVar, "common");
                    try {
                        map.put("common", s(scannerG2, e(dVar, hVar, "common")));
                        scannerG2.close();
                    } catch (Throwable th3) {
                        scannerG2.close();
                        throw th3;
                    }
                }
                enumMap.put(hVar, Collections.unmodifiableMap(map));
            }
            f335341i.put(dVar, Collections.unmodifiableMap(enumMap));
        }
    }

    public g(String str, String str2, String str3, l lVar) {
        this.f335343b = str;
        this.f335342a = t(str2 + "$");
        this.f335345d = t("^" + str3);
        this.f335344c = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(CharSequence charSequence, char c10) {
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (charSequence.charAt(i10) == c10) {
                return true;
            }
        }
        return false;
    }

    private static String e(org.apache.commons.codec.language.bm.d dVar, org.apache.commons.codec.language.bm.h hVar, String str) {
        return String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", dVar.getName(), hVar.getName(), str);
    }

    private static Scanner f(String str) {
        String str2 = String.format("org/apache/commons/codec/language/bm/%s.txt", str);
        InputStream resourceAsStream = org.apache.commons.codec.language.bm.c.class.getClassLoader().getResourceAsStream(str2);
        if (resourceAsStream != null) {
            return new Scanner(resourceAsStream, "UTF-8");
        }
        throw new IllegalArgumentException("Unable to load resource: " + str2);
    }

    private static Scanner g(org.apache.commons.codec.language.bm.d dVar, org.apache.commons.codec.language.bm.h hVar, String str) {
        String strE = e(dVar, hVar, str);
        InputStream resourceAsStream = org.apache.commons.codec.language.bm.c.class.getClassLoader().getResourceAsStream(strE);
        if (resourceAsStream != null) {
            return new Scanner(resourceAsStream, "UTF-8");
        }
        throw new IllegalArgumentException("Unable to load resource: " + strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        int length = charSequence.length() - 1;
        for (int length2 = charSequence2.length() - 1; length2 >= 0; length2--) {
            if (charSequence.charAt(length) != charSequence2.charAt(length2)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static List<g> i(org.apache.commons.codec.language.bm.d dVar, org.apache.commons.codec.language.bm.h hVar, String str) {
        return j(dVar, hVar, org.apache.commons.codec.language.bm.c.AbstractC2381c.b(new HashSet(Arrays.asList(str))));
    }

    public static List<g> j(org.apache.commons.codec.language.bm.d dVar, org.apache.commons.codec.language.bm.h hVar, org.apache.commons.codec.language.bm.c.AbstractC2381c abstractC2381c) {
        Map<String, List<g>> mapL = l(dVar, hVar, abstractC2381c);
        ArrayList arrayList = new ArrayList();
        Iterator<List<g>> it = mapL.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        return arrayList;
    }

    public static Map<String, List<g>> k(org.apache.commons.codec.language.bm.d dVar, org.apache.commons.codec.language.bm.h hVar, String str) {
        Map<String, List<g>> map = f335341i.get(dVar).get(hVar).get(str);
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", dVar.getName(), hVar.getName(), str));
    }

    public static Map<String, List<g>> l(org.apache.commons.codec.language.bm.d dVar, org.apache.commons.codec.language.bm.h hVar, org.apache.commons.codec.language.bm.c.AbstractC2381c abstractC2381c) {
        return abstractC2381c.e() ? k(dVar, hVar, abstractC2381c.c()) : k(dVar, hVar, org.apache.commons.codec.language.bm.c.f335307b);
    }

    private static k q(String str) {
        int iIndexOf = str.indexOf("[");
        if (iIndexOf < 0) {
            return new k(str, org.apache.commons.codec.language.bm.c.f335310e);
        }
        if (str.endsWith("]")) {
            return new k(str.substring(0, iIndexOf), org.apache.commons.codec.language.bm.c.AbstractC2381c.b(new HashSet(Arrays.asList(str.substring(iIndexOf + 1, str.length() - 1).split("[+]")))));
        }
        throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
    }

    private static l r(String str) {
        if (!str.startsWith("(")) {
            return q(str);
        }
        if (!str.endsWith(")")) {
            throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
        }
        ArrayList arrayList = new ArrayList();
        String strSubstring = str.substring(1, str.length() - 1);
        for (String str2 : strSubstring.split("[|]")) {
            arrayList.add(q(str2));
        }
        if (strSubstring.startsWith("|") || strSubstring.endsWith("|")) {
            arrayList.add(new k("", org.apache.commons.codec.language.bm.c.f335310e));
        }
        return new m(arrayList);
    }

    private static Map<String, List<g>> s(Scanner scanner, String str) {
        HashMap map = new HashMap();
        int i10 = 0;
        boolean z10 = false;
        while (scanner.hasNextLine()) {
            int i11 = i10 + 1;
            String strNextLine = scanner.nextLine();
            if (z10) {
                if (strNextLine.endsWith("*/")) {
                    z10 = false;
                }
            } else if (strNextLine.startsWith("/*")) {
                z10 = true;
            } else {
                int iIndexOf = strNextLine.indexOf("//");
                String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                if (strTrim.length() == 0) {
                    continue;
                } else if (strTrim.startsWith(f335340h)) {
                    String strTrim2 = strTrim.substring(8).trim();
                    if (strTrim2.contains(" ")) {
                        throw new IllegalArgumentException("Malformed import statement '" + strNextLine + "' in " + str);
                    }
                    Scanner scannerF = f(strTrim2);
                    try {
                        map.putAll(s(scannerF, str + "->" + strTrim2));
                        scannerF.close();
                    } catch (Throwable th2) {
                        scannerF.close();
                        throw th2;
                    }
                } else {
                    String[] strArrSplit = strTrim.split("\\s+");
                    if (strArrSplit.length != 4) {
                        throw new IllegalArgumentException("Malformed rule statement split into " + strArrSplit.length + " parts: " + strNextLine + " in " + str);
                    }
                    try {
                        String strW = w(strArrSplit[0]);
                        String strW2 = w(strArrSplit[1]);
                        String strW3 = w(strArrSplit[2]);
                        c cVar = new c(strW, strW2, strW3, r(w(strArrSplit[3])), i11, str, strW, strW2, strW3);
                        String strSubstring = ((g) cVar).f335343b.substring(0, 1);
                        List arrayList = (List) map.get(strSubstring);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map.put(strSubstring, arrayList);
                        }
                        arrayList.add(cVar);
                    } catch (IllegalArgumentException e10) {
                        throw new IllegalStateException("Problem parsing line '" + i11 + "' in " + str, e10);
                    }
                }
            }
            i10 = i11;
        }
        return map;
    }

    private static n t(String str) {
        boolean zStartsWith = str.startsWith("^");
        boolean zEndsWith = str.endsWith("$");
        int length = str.length();
        if (zEndsWith) {
            length--;
        }
        String strSubstring = str.substring(zStartsWith ? 1 : 0, length);
        if (strSubstring.contains("[")) {
            boolean zStartsWith2 = strSubstring.startsWith("[");
            boolean zEndsWith2 = strSubstring.endsWith("]");
            if (zStartsWith2 && zEndsWith2) {
                String strSubstring2 = strSubstring.substring(1, strSubstring.length() - 1);
                if (!strSubstring2.contains("[")) {
                    boolean zStartsWith3 = strSubstring2.startsWith("^");
                    if (zStartsWith3) {
                        strSubstring2 = strSubstring2.substring(1);
                    }
                    boolean z10 = !zStartsWith3;
                    if (zStartsWith && zEndsWith) {
                        return new h(strSubstring2, z10);
                    }
                    if (zStartsWith) {
                        return new i(strSubstring2, z10);
                    }
                    if (zEndsWith) {
                        return new j(strSubstring2, z10);
                    }
                }
            }
        } else {
            if (zStartsWith && zEndsWith) {
                return strSubstring.length() == 0 ? new d() : new e(strSubstring);
            }
            if ((zStartsWith || zEndsWith) && strSubstring.length() == 0) {
                return f335337e;
            }
            if (zStartsWith) {
                return new f(strSubstring);
            }
            if (zEndsWith) {
                return new C2382g(strSubstring);
            }
        }
        return new a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i10 = 0; i10 < charSequence2.length(); i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    private static String w(String str) {
        if (str.startsWith(f335339g)) {
            str = str.substring(1);
        }
        return str.endsWith(f335339g) ? str.substring(0, str.length() - 1) : str;
    }

    public n m() {
        return this.f335342a;
    }

    public String n() {
        return this.f335343b;
    }

    public l o() {
        return this.f335344c;
    }

    public n p() {
        return this.f335345d;
    }

    public boolean u(CharSequence charSequence, int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
        }
        int length = this.f335343b.length() + i10;
        if (length <= charSequence.length() && charSequence.subSequence(i10, length).equals(this.f335343b) && this.f335345d.a(charSequence.subSequence(length, charSequence.length()))) {
            return this.f335342a.a(charSequence.subSequence(0, i10));
        }
        return false;
    }

    public static final class k implements l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Comparator<k> f335364c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final StringBuilder f335365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final org.apache.commons.codec.language.bm.c.AbstractC2381c f335366b;

        static class a implements Comparator<k> {
            a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(k kVar, k kVar2) {
                for (int i10 = 0; i10 < kVar.f335365a.length(); i10++) {
                    if (i10 >= kVar2.f335365a.length()) {
                        return 1;
                    }
                    int iCharAt = kVar.f335365a.charAt(i10) - kVar2.f335365a.charAt(i10);
                    if (iCharAt != 0) {
                        return iCharAt;
                    }
                }
                return kVar.f335365a.length() < kVar2.f335365a.length() ? -1 : 0;
            }
        }

        public k(CharSequence charSequence, org.apache.commons.codec.language.bm.c.AbstractC2381c abstractC2381c) {
            this.f335365a = new StringBuilder(charSequence);
            this.f335366b = abstractC2381c;
        }

        @Override // org.apache.commons.codec.language.bm.g.l
        public Iterable<k> a() {
            return Collections.singleton(this);
        }

        public k c(CharSequence charSequence) {
            this.f335365a.append(charSequence);
            return this;
        }

        public org.apache.commons.codec.language.bm.c.AbstractC2381c d() {
            return this.f335366b;
        }

        public CharSequence e() {
            return this.f335365a;
        }

        @Deprecated
        public k f(k kVar) {
            return new k(this.f335365a.toString() + kVar.f335365a.toString(), this.f335366b.g(kVar.f335366b));
        }

        public k g(org.apache.commons.codec.language.bm.c.AbstractC2381c abstractC2381c) {
            return new k(this.f335365a.toString(), this.f335366b.f(abstractC2381c));
        }

        public String toString() {
            return this.f335365a.toString() + "[" + this.f335366b + "]";
        }

        public k(k kVar, k kVar2) {
            this(kVar.f335365a, kVar.f335366b);
            this.f335365a.append((CharSequence) kVar2.f335365a);
        }

        public k(k kVar, k kVar2, org.apache.commons.codec.language.bm.c.AbstractC2381c abstractC2381c) {
            this(kVar.f335365a, abstractC2381c);
            this.f335365a.append((CharSequence) kVar2.f335365a);
        }
    }
}
