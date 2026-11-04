package org.apache.commons.codec.language.bm;

import java.io.InputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f335307b = "any";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<org.apache.commons.codec.language.bm.d, c> f335308c = new EnumMap(org.apache.commons.codec.language.bm.d.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2381c f335309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2381c f335310e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f335311a;

    static class a extends AbstractC2381c {
        a() {
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public boolean a(String str) {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public String c() {
            throw new NoSuchElementException("Can't fetch any language from the empty language set.");
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public boolean d() {
            return true;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public boolean e() {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public AbstractC2381c f(AbstractC2381c abstractC2381c) {
            return abstractC2381c;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public AbstractC2381c g(AbstractC2381c abstractC2381c) {
            return this;
        }

        public String toString() {
            return "NO_LANGUAGES";
        }
    }

    static class b extends AbstractC2381c {
        b() {
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public boolean a(String str) {
            return true;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public String c() {
            throw new NoSuchElementException("Can't fetch any language from the any language set.");
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public boolean d() {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public boolean e() {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public AbstractC2381c f(AbstractC2381c abstractC2381c) {
            return abstractC2381c;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public AbstractC2381c g(AbstractC2381c abstractC2381c) {
            return abstractC2381c;
        }

        public String toString() {
            return "ANY_LANGUAGE";
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC2381c {
        public static AbstractC2381c b(Set<String> set) {
            return set.isEmpty() ? c.f335309d : new d(set, null);
        }

        public abstract boolean a(String str);

        public abstract String c();

        public abstract boolean d();

        public abstract boolean e();

        abstract AbstractC2381c f(AbstractC2381c abstractC2381c);

        public abstract AbstractC2381c g(AbstractC2381c abstractC2381c);
    }

    public static final class d extends AbstractC2381c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<String> f335312a;

        /* synthetic */ d(Set set, a aVar) {
            this(set);
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public boolean a(String str) {
            return this.f335312a.contains(str);
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public String c() {
            return this.f335312a.iterator().next();
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public boolean d() {
            return this.f335312a.isEmpty();
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public boolean e() {
            return this.f335312a.size() == 1;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public AbstractC2381c f(AbstractC2381c abstractC2381c) {
            if (abstractC2381c == c.f335309d) {
                return this;
            }
            if (abstractC2381c == c.f335310e) {
                return abstractC2381c;
            }
            HashSet hashSet = new HashSet(this.f335312a);
            Iterator<String> it = ((d) abstractC2381c).f335312a.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
            return AbstractC2381c.b(hashSet);
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC2381c
        public AbstractC2381c g(AbstractC2381c abstractC2381c) {
            if (abstractC2381c == c.f335309d) {
                return abstractC2381c;
            }
            if (abstractC2381c == c.f335310e) {
                return this;
            }
            d dVar = (d) abstractC2381c;
            HashSet hashSet = new HashSet(Math.min(this.f335312a.size(), dVar.f335312a.size()));
            for (String str : this.f335312a) {
                if (dVar.f335312a.contains(str)) {
                    hashSet.add(str);
                }
            }
            return AbstractC2381c.b(hashSet);
        }

        public Set<String> h() {
            return this.f335312a;
        }

        public String toString() {
            return "Languages(" + this.f335312a.toString() + ")";
        }

        private d(Set<String> set) {
            this.f335312a = Collections.unmodifiableSet(set);
        }
    }

    static {
        for (org.apache.commons.codec.language.bm.d dVar : org.apache.commons.codec.language.bm.d.values()) {
            f335308c.put(dVar, a(d(dVar)));
        }
        f335309d = new a();
        f335310e = new b();
    }

    private c(Set<String> set) {
        this.f335311a = set;
    }

    public static c a(String str) {
        HashSet hashSet = new HashSet();
        InputStream resourceAsStream = c.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new IllegalArgumentException("Unable to resolve required resource: " + str);
        }
        Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
        while (true) {
            boolean z10 = false;
            while (true) {
                try {
                    if (!scanner.hasNextLine()) {
                        scanner.close();
                        return new c(Collections.unmodifiableSet(hashSet));
                    }
                    String strTrim = scanner.nextLine().trim();
                    if (z10) {
                        if (strTrim.endsWith("*/")) {
                            break;
                        }
                    } else if (strTrim.startsWith("/*")) {
                        z10 = true;
                    } else if (strTrim.length() > 0) {
                        hashSet.add(strTrim);
                    }
                } catch (Throwable th2) {
                    scanner.close();
                    throw th2;
                }
            }
        }
    }

    public static c b(org.apache.commons.codec.language.bm.d dVar) {
        return f335308c.get(dVar);
    }

    private static String d(org.apache.commons.codec.language.bm.d dVar) {
        return String.format("org/apache/commons/codec/language/bm/%s_languages.txt", dVar.getName());
    }

    public Set<String> c() {
        return this.f335311a;
    }
}
