package org.apache.commons.codec.language;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/* JADX INFO: loaded from: classes9.dex */
public class f implements nk.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f335390b = "//";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f335391c = "\"";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f335392d = "*/";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f335393e = "/*";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f335394f = "org/apache/commons/codec/language/dmrules.txt";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f335395g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<Character, List<c>> f335396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<Character, Character> f335397i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f335398a;

    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return cVar2.b() - cVar.b();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final StringBuilder f335399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f335400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f335401c;

        /* synthetic */ b(a aVar) {
            this();
        }

        public b a() {
            b bVar = new b();
            bVar.f335399a.append(toString());
            bVar.f335401c = this.f335401c;
            return bVar;
        }

        public void b() {
            while (this.f335399a.length() < 6) {
                this.f335399a.append(org.locationtech.jts.geom.l.f338160j);
                this.f335400b = null;
            }
        }

        public void c(String str, boolean z10) {
            String str2 = this.f335401c;
            if ((str2 == null || !str2.endsWith(str) || z10) && this.f335399a.length() < 6) {
                this.f335399a.append(str);
                if (this.f335399a.length() > 6) {
                    StringBuilder sb2 = this.f335399a;
                    sb2.delete(6, sb2.length());
                }
                this.f335400b = null;
            }
            this.f335401c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return toString().equals(((b) obj).toString());
            }
            return false;
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public String toString() {
            if (this.f335400b == null) {
                this.f335400b = this.f335399a.toString();
            }
            return this.f335400b;
        }

        private b() {
            this.f335399a = new StringBuilder();
            this.f335401c = null;
            this.f335400b = null;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f335402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f335403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f335404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String[] f335405d;

        protected c(String str, String str2, String str3, String str4) {
            this.f335402a = str;
            this.f335403b = str2.split("\\|");
            this.f335404c = str3.split("\\|");
            this.f335405d = str4.split("\\|");
        }

        private boolean d(char c10) {
            return c10 == 'a' || c10 == 'e' || c10 == 'i' || c10 == 'o' || c10 == 'u';
        }

        public int b() {
            return this.f335402a.length();
        }

        public String[] c(String str, boolean z10) {
            if (z10) {
                return this.f335403b;
            }
            int iB = b();
            return iB < str.length() ? d(str.charAt(iB)) : false ? this.f335404c : this.f335405d;
        }

        public boolean e(String str) {
            return str.startsWith(this.f335402a);
        }

        public String toString() {
            return String.format("%s=(%s,%s,%s)", this.f335402a, Arrays.asList(this.f335403b), Arrays.asList(this.f335404c), Arrays.asList(this.f335405d));
        }
    }

    static {
        HashMap map = new HashMap();
        f335396h = map;
        HashMap map2 = new HashMap();
        f335397i = map2;
        InputStream resourceAsStream = f.class.getClassLoader().getResourceAsStream(f335394f);
        if (resourceAsStream == null) {
            throw new IllegalArgumentException("Unable to load resource: org/apache/commons/codec/language/dmrules.txt");
        }
        Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
        try {
            c(scanner, f335394f, map, map2);
            scanner.close();
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Collections.sort((List) ((Map.Entry) it.next()).getValue(), new a());
            }
        } catch (Throwable th2) {
            scanner.close();
            throw th2;
        }
    }

    public f() {
        this(true);
    }

    private String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str.toCharArray()) {
            if (!Character.isWhitespace(c10)) {
                char lowerCase = Character.toLowerCase(c10);
                if (this.f335398a) {
                    Map<Character, Character> map = f335397i;
                    if (map.containsKey(Character.valueOf(lowerCase))) {
                        lowerCase = map.get(Character.valueOf(lowerCase)).charValue();
                    }
                }
                sb2.append(lowerCase);
            }
        }
        return sb2.toString();
    }

    private static void c(Scanner scanner, String str, Map<Character, List<c>> map, Map<Character, Character> map2) {
        int i10 = 0;
        boolean z10 = false;
        while (scanner.hasNextLine()) {
            i10++;
            String strNextLine = scanner.nextLine();
            if (z10) {
                if (strNextLine.endsWith(f335392d)) {
                    z10 = false;
                }
            } else if (strNextLine.startsWith(f335393e)) {
                z10 = true;
            } else {
                int iIndexOf = strNextLine.indexOf(f335390b);
                String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                if (strTrim.length() == 0) {
                    continue;
                } else if (strTrim.contains("=")) {
                    String[] strArrSplit = strTrim.split("=");
                    if (strArrSplit.length != 2) {
                        throw new IllegalArgumentException("Malformed folding statement split into " + strArrSplit.length + " parts: " + strNextLine + " in " + str);
                    }
                    String str2 = strArrSplit[0];
                    String str3 = strArrSplit[1];
                    if (str2.length() != 1 || str3.length() != 1) {
                        throw new IllegalArgumentException("Malformed folding statement - patterns are not single characters: " + strNextLine + " in " + str);
                    }
                    map2.put(Character.valueOf(str2.charAt(0)), Character.valueOf(str3.charAt(0)));
                } else {
                    String[] strArrSplit2 = strTrim.split("\\s+");
                    if (strArrSplit2.length != 4) {
                        throw new IllegalArgumentException("Malformed rule statement split into " + strArrSplit2.length + " parts: " + strNextLine + " in " + str);
                    }
                    try {
                        c cVar = new c(h(strArrSplit2[0]), h(strArrSplit2[1]), h(strArrSplit2[2]), h(strArrSplit2[3]));
                        char cCharAt = cVar.f335402a.charAt(0);
                        List<c> arrayList = map.get(Character.valueOf(cCharAt));
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            map.put(Character.valueOf(cCharAt), arrayList);
                        }
                        arrayList.add(cVar);
                    } catch (IllegalArgumentException e10) {
                        throw new IllegalStateException("Problem parsing line '" + i10 + "' in " + str, e10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    private String[] g(String str, boolean z10) {
        String str2;
        String str3;
        boolean z11;
        a aVar = null;
        if (str == null) {
            return null;
        }
        String strB = b(str);
        LinkedHashSet<b> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new b(aVar));
        int iB = 0;
        char c10 = 0;
        while (iB < strB.length()) {
            char cCharAt = strB.charAt(iB);
            boolean z12 = true;
            if (Character.isWhitespace(cCharAt)) {
                str2 = strB;
            } else {
                String strSubstring = strB.substring(iB);
                List<c> list = f335396h.get(Character.valueOf(cCharAt));
                if (list == null) {
                    str2 = strB;
                } else {
                    List arrayList = z10 ? new ArrayList() : Collections.EMPTY_LIST;
                    Iterator<c> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str2 = strB;
                            break;
                        }
                        c next = it.next();
                        if (next.e(strSubstring)) {
                            if (z10) {
                                arrayList.clear();
                            }
                            String[] strArrC = next.c(strSubstring, c10 == 0);
                            boolean z13 = strArrC.length > 1 && z10;
                            for (b bVar : linkedHashSet) {
                                int length = strArrC.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= length) {
                                        str3 = strB;
                                        z11 = z12;
                                        break;
                                    }
                                    String str4 = strArrC[i10];
                                    b bVarA = z13 ? bVar.a() : bVar;
                                    z11 = z12;
                                    str3 = strB;
                                    bVarA.c(str4, ((c10 == 'm' && cCharAt == 'n') || (c10 == 'n' && cCharAt == 'm')) ? z11 : false);
                                    if (!z10) {
                                        break;
                                    }
                                    arrayList.add(bVarA);
                                    i10++;
                                    z12 = z11;
                                    strB = str3;
                                }
                                z12 = z11;
                                strB = str3;
                            }
                            str2 = strB;
                            if (z10) {
                                linkedHashSet.clear();
                                linkedHashSet.addAll(arrayList);
                            }
                            iB += next.b() - 1;
                            break;
                        }
                    }
                    c10 = cCharAt;
                }
            }
            iB++;
            strB = str2;
        }
        String[] strArr = new String[linkedHashSet.size()];
        int i11 = 0;
        for (b bVar2 : linkedHashSet) {
            bVar2.b();
            strArr[i11] = bVar2.toString();
            i11++;
        }
        return strArr;
    }

    private static String h(String str) {
        if (str.startsWith(f335391c)) {
            str = str.substring(1);
        }
        if (str.endsWith(f335391c)) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return f((String) obj);
        }
        throw new nk.h("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String");
    }

    public String d(String str) {
        String[] strArrG = g(str, true);
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (String str2 : strArrG) {
            sb2.append(str2);
            i10++;
            if (i10 < strArrG.length) {
                sb2.append('|');
            }
        }
        return sb2.toString();
    }

    @Override // nk.j
    public String f(String str) {
        if (str == null) {
            return null;
        }
        return g(str, false)[0];
    }

    public f(boolean z10) {
        this.f335398a = z10;
    }
}
