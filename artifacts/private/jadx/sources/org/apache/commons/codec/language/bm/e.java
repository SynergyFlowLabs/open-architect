package org.apache.commons.codec.language.bm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.commons.codec.language.l;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<d, Set<String>> f335318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f335319g = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.codec.language.bm.b f335320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f335321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f335322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f335323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f335324e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f335325a;

        static {
            int[] iArr = new int[d.values().length];
            f335325a = iArr;
            try {
                iArr[d.SEPHARDIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f335325a[d.ASHKENAZI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f335325a[d.GENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<g.k> f335326a;

        /* synthetic */ b(Set set, a aVar) {
            this((Set<g.k>) set);
        }

        public static b c(org.apache.commons.codec.language.bm.c.AbstractC2381c abstractC2381c) {
            return new b(new g.k("", abstractC2381c));
        }

        public void a(CharSequence charSequence) {
            Iterator<g.k> it = this.f335326a.iterator();
            while (it.hasNext()) {
                it.next().c(charSequence);
            }
        }

        public void b(g.l lVar, int i10) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(i10);
            loop0: for (g.k kVar : this.f335326a) {
                for (g.k kVar2 : lVar.a()) {
                    org.apache.commons.codec.language.bm.c.AbstractC2381c abstractC2381cG = kVar.d().g(kVar2.d());
                    if (!abstractC2381cG.d()) {
                        g.k kVar3 = new g.k(kVar, kVar2, abstractC2381cG);
                        if (linkedHashSet.size() < i10) {
                            linkedHashSet.add(kVar3);
                            if (linkedHashSet.size() >= i10) {
                                break loop0;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            this.f335326a.clear();
            this.f335326a.addAll(linkedHashSet);
        }

        public Set<g.k> d() {
            return this.f335326a;
        }

        public String e() {
            StringBuilder sb2 = new StringBuilder();
            for (g.k kVar : this.f335326a) {
                if (sb2.length() > 0) {
                    sb2.append("|");
                }
                sb2.append(kVar.e());
            }
            return sb2.toString();
        }

        private b(g.k kVar) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            this.f335326a = linkedHashSet;
            linkedHashSet.add(kVar);
        }

        private b(Set<g.k> set) {
            this.f335326a = set;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, List<g>> f335327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f335328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f335329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f335330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f335331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f335332f;

        public c(Map<String, List<g>> map, CharSequence charSequence, b bVar, int i10, int i11) {
            if (map == null) {
                throw new NullPointerException("The finalRules argument must not be null");
            }
            this.f335327a = map;
            this.f335329c = bVar;
            this.f335328b = charSequence;
            this.f335330d = i10;
            this.f335331e = i11;
        }

        public int a() {
            return this.f335330d;
        }

        public b b() {
            return this.f335329c;
        }

        public c c() {
            int i10;
            this.f335332f = false;
            Map<String, List<g>> map = this.f335327a;
            CharSequence charSequence = this.f335328b;
            int i11 = this.f335330d;
            List<g> list = map.get(charSequence.subSequence(i11, i11 + 1));
            if (list != null) {
                i10 = 1;
                for (g gVar : list) {
                    int length = gVar.n().length();
                    if (gVar.u(this.f335328b, this.f335330d)) {
                        this.f335329c.b(gVar.o(), this.f335331e);
                        this.f335332f = true;
                        i10 = length;
                        break;
                    }
                    i10 = length;
                }
            } else {
                i10 = 1;
            }
            this.f335330d += this.f335332f ? i10 : 1;
            return this;
        }

        public boolean d() {
            return this.f335332f;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(d.class);
        f335318f = enumMap;
        enumMap.put(d.ASHKENAZI, Collections.unmodifiableSet(new HashSet(Arrays.asList("bar", "ben", "da", "de", "van", "von"))));
        enumMap.put(d.SEPHARDIC, Collections.unmodifiableSet(new HashSet(Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
        enumMap.put(d.GENERIC, Collections.unmodifiableSet(new HashSet(Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
    }

    public e(d dVar, h hVar, boolean z10) {
        this(dVar, hVar, z10, 20);
    }

    private b a(b bVar, Map<String, List<g>> map) {
        if (map == null) {
            throw new NullPointerException("finalRules can not be null");
        }
        if (map.isEmpty()) {
            return bVar;
        }
        TreeMap treeMap = new TreeMap(g.k.f335364c);
        for (g.k kVar : bVar.d()) {
            b bVarC = b.c(kVar.d());
            String string = kVar.e().toString();
            int iA = 0;
            b bVarB = bVarC;
            while (iA < string.length()) {
                Map<String, List<g>> map2 = map;
                c cVarC = new c(map2, string, bVarB, iA, this.f335324e).c();
                boolean zD = cVarC.d();
                bVarB = cVarC.b();
                if (!zD) {
                    bVarB.a(string.subSequence(iA, iA + 1));
                }
                iA = cVarC.a();
                map = map2;
            }
            Map<String, List<g>> map3 = map;
            for (g.k kVar2 : bVarB.d()) {
                if (treeMap.containsKey(kVar2)) {
                    g.k kVarG = ((g.k) treeMap.remove(kVar2)).g(kVar2.d());
                    treeMap.put(kVarG, kVarG);
                } else {
                    treeMap.put(kVar2, kVar2);
                }
            }
            map = map3;
        }
        return new b(treeMap.keySet(), null);
    }

    private static String i(Iterable<String> iterable, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = iterable.iterator();
        if (it.hasNext()) {
            sb2.append(it.next());
        }
        while (it.hasNext()) {
            sb2.append(str);
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    public String b(String str) {
        return c(str, this.f335320a.b(str));
    }

    public String c(String str, org.apache.commons.codec.language.bm.c.AbstractC2381c abstractC2381c) {
        String strI;
        Map<String, List<g>> mapL = g.l(this.f335321b, h.RULES, abstractC2381c);
        Map<String, List<g>> mapK = g.k(this.f335321b, this.f335322c, "common");
        Map<String, List<g>> mapL2 = g.l(this.f335321b, this.f335322c, abstractC2381c);
        String strTrim = str.toLowerCase(Locale.ENGLISH).replace(l.f335457d, ' ').trim();
        int iA = 0;
        if (this.f335321b == d.GENERIC) {
            if (strTrim.length() >= 2 && strTrim.substring(0, 2).equals("d'")) {
                String strSubstring = strTrim.substring(2);
                return "(" + b(strSubstring) + ")-(" + b("d" + strSubstring) + ")";
            }
            for (String str2 : f335318f.get(this.f335321b)) {
                if (strTrim.startsWith(str2 + " ")) {
                    String strSubstring2 = strTrim.substring(str2.length() + 1);
                    return "(" + b(strSubstring2) + ")-(" + b(str2 + strSubstring2) + ")";
                }
            }
        }
        List listAsList = Arrays.asList(strTrim.split("\\s+"));
        ArrayList<String> arrayList = new ArrayList();
        int i10 = a.f335325a[this.f335321b.ordinal()];
        if (i10 == 1) {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                String[] strArrSplit = ((String) it.next()).split("'");
                arrayList.add(strArrSplit[strArrSplit.length - 1]);
            }
            arrayList.removeAll(f335318f.get(this.f335321b));
        } else if (i10 == 2) {
            arrayList.addAll(listAsList);
            arrayList.removeAll(f335318f.get(this.f335321b));
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Unreachable case: " + this.f335321b);
            }
            arrayList.addAll(listAsList);
        }
        if (this.f335323d) {
            strI = i(arrayList, " ");
        } else {
            if (arrayList.size() != 1) {
                StringBuilder sb2 = new StringBuilder();
                for (String str3 : arrayList) {
                    sb2.append("-");
                    sb2.append(b(str3));
                }
                return sb2.substring(1);
            }
            strI = (String) listAsList.iterator().next();
        }
        String str4 = strI;
        b bVarC = b.c(abstractC2381c);
        while (iA < str4.length()) {
            c cVarC = new c(mapL, str4, bVarC, iA, this.f335324e).c();
            iA = cVarC.a();
            bVarC = cVarC.b();
        }
        return a(a(bVarC, mapK), mapL2).e();
    }

    public org.apache.commons.codec.language.bm.b d() {
        return this.f335320a;
    }

    public int e() {
        return this.f335324e;
    }

    public d f() {
        return this.f335321b;
    }

    public h g() {
        return this.f335322c;
    }

    public boolean h() {
        return this.f335323d;
    }

    public e(d dVar, h hVar, boolean z10, int i10) {
        h hVar2 = h.RULES;
        if (hVar == hVar2) {
            throw new IllegalArgumentException("ruleType must not be " + hVar2);
        }
        this.f335321b = dVar;
        this.f335322c = hVar;
        this.f335323d = z10;
        this.f335320a = org.apache.commons.codec.language.bm.b.c(dVar);
        this.f335324e = i10;
    }
}
