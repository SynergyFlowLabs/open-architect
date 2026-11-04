package org.apache.commons.codec.language.bm;

import com.facebook.internal.z0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<d, b> f335300c = new EnumMap(d.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f335301d = "org/apache/commons/codec/language/bm/%s_lang.txt";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f335302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<C2380b> f335303b;

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.b$b, reason: collision with other inner class name */
    private static final class C2380b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f335304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<String> f335305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Pattern f335306c;

        public boolean c(String str) {
            return this.f335306c.matcher(str).find();
        }

        private C2380b(Pattern pattern, Set<String> set, boolean z10) {
            this.f335306c = pattern;
            this.f335305b = set;
            this.f335304a = z10;
        }
    }

    static {
        int i10 = 2 ^ 0;
        for (d dVar : d.values()) {
            f335300c.put(dVar, d(String.format(f335301d, dVar.getName()), c.b(dVar)));
        }
    }

    private b(List<C2380b> list, c cVar) {
        this.f335303b = Collections.unmodifiableList(list);
        this.f335302a = cVar;
    }

    public static b c(d dVar) {
        return f335300c.get(dVar);
    }

    public static b d(String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        InputStream resourceAsStream = b.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new IllegalStateException("Unable to resolve required resource:org/apache/commons/codec/language/bm/%s_lang.txt");
        }
        Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
        while (true) {
            boolean z10 = false;
            while (true) {
                try {
                    if (!scanner.hasNextLine()) {
                        scanner.close();
                        return new b(arrayList, cVar);
                    }
                    String strNextLine = scanner.nextLine();
                    if (z10) {
                        if (strNextLine.endsWith("*/")) {
                            break;
                        }
                    } else if (strNextLine.startsWith("/*")) {
                        z10 = true;
                    } else {
                        int iIndexOf = strNextLine.indexOf("//");
                        String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                        if (strTrim.length() != 0) {
                            String[] strArrSplit = strTrim.split("\\s+");
                            if (strArrSplit.length != 3) {
                                throw new IllegalArgumentException("Malformed line '" + strNextLine + "' in language resource '" + str + "'");
                            }
                            boolean z11 = true & false;
                            arrayList.add(new C2380b(Pattern.compile(strArrSplit[0]), new HashSet(Arrays.asList(strArrSplit[1].split("\\+"))), strArrSplit[2].equals(z0.P)));
                        }
                    }
                } catch (Throwable th2) {
                    scanner.close();
                    throw th2;
                }
            }
        }
    }

    public String a(String str) {
        c.AbstractC2381c abstractC2381cB = b(str);
        return abstractC2381cB.e() ? abstractC2381cB.c() : c.f335307b;
    }

    public c.AbstractC2381c b(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        HashSet hashSet = new HashSet(this.f335302a.c());
        for (C2380b c2380b : this.f335303b) {
            if (c2380b.c(lowerCase)) {
                if (c2380b.f335304a) {
                    hashSet.retainAll(c2380b.f335305b);
                } else {
                    hashSet.removeAll(c2380b.f335305b);
                }
            }
        }
        c.AbstractC2381c abstractC2381cB = c.AbstractC2381c.b(hashSet);
        if (abstractC2381cB.equals(c.f335309d)) {
            abstractC2381cB = c.f335310e;
        }
        return abstractC2381cB;
    }
}
