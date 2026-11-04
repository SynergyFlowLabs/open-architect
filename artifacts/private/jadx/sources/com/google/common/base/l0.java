package com.google.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b(emulated = true)
@com.google.common.base.k
public final class l0 {

    private static class b<T> implements k0<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116559b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends k0<? super T>> f116560a;

        @Override // com.google.common.base.k0
        public boolean apply(@g0 T t10) {
            for (int i10 = 0; i10 < this.f116560a.size(); i10++) {
                if (!this.f116560a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.k0
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof b) {
                return this.f116560a.equals(((b) obj).f116560a);
            }
            return false;
        }

        public int hashCode() {
            return this.f116560a.hashCode() + 306654252;
        }

        public String toString() {
            return l0.w("and", this.f116560a);
        }

        private b(List<? extends k0<? super T>> components) {
            this.f116560a = components;
        }
    }

    private static class c<A, B> implements k0<A>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f116561c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k0<B> f116562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t<A, ? extends B> f116563b;

        @Override // com.google.common.base.k0
        public boolean apply(@g0 A a10) {
            return this.f116562a.apply(this.f116563b.apply(a10));
        }

        @Override // com.google.common.base.k0
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f116563b.equals(cVar.f116563b) && this.f116562a.equals(cVar.f116562a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f116562a.hashCode() ^ this.f116563b.hashCode();
        }

        public String toString() {
            return this.f116562a + "(" + this.f116563b + ")";
        }

        private c(k0<B> p10, t<A, ? extends B> f10) {
            this.f116562a = (k0) j0.E(p10);
            this.f116563b = (t) j0.E(f10);
        }
    }

    @com.google.common.annotations.c
    private static class d extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f116564c = 0;

        d(String string) {
            super(i0.a(string));
        }

        @Override // com.google.common.base.l0.e
        public String toString() {
            return "Predicates.containsPattern(" + this.f116566a.e() + ")";
        }
    }

    @com.google.common.annotations.c
    private static class e implements k0<CharSequence>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116565b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.common.base.h f116566a;

        e(com.google.common.base.h pattern) {
            this.f116566a = (com.google.common.base.h) j0.E(pattern);
        }

        @Override // com.google.common.base.k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(CharSequence t10) {
            return this.f116566a.d(t10).b();
        }

        @Override // com.google.common.base.k0
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (d0.a(this.f116566a.e(), eVar.f116566a.e()) && this.f116566a.b() == eVar.f116566a.b()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return d0.b(this.f116566a.e(), Integer.valueOf(this.f116566a.b()));
        }

        public String toString() {
            return "Predicates.contains(" + b0.c(this.f116566a).f("pattern", this.f116566a.e()).d("pattern.flags", this.f116566a.b()).toString() + ")";
        }
    }

    private static class f<T> implements k0<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116567b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection<?> f116568a;

        @Override // com.google.common.base.k0
        public boolean apply(@g0 T t10) {
            try {
                return this.f116568a.contains(t10);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.k0
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof f) {
                return this.f116568a.equals(((f) obj).f116568a);
            }
            return false;
        }

        public int hashCode() {
            return this.f116568a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f116568a + ")";
        }

        private f(Collection<?> target) {
            this.f116568a = (Collection) j0.E(target);
        }
    }

    @com.google.common.annotations.c
    private static class g<T> implements k0<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @com.google.common.annotations.d
        private static final long f116569b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f116570a;

        @Override // com.google.common.base.k0
        public boolean apply(@g0 T o10) {
            return this.f116570a.isInstance(o10);
        }

        @Override // com.google.common.base.k0
        public boolean equals(@fj.a Object obj) {
            return (obj instanceof g) && this.f116570a == ((g) obj).f116570a;
        }

        public int hashCode() {
            return this.f116570a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f116570a.getName() + ")";
        }

        private g(Class<?> clazz) {
            this.f116570a = (Class) j0.E(clazz);
        }
    }

    private static class h implements k0<Object>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116571b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f116572a;

        <T> k0<T> a() {
            return this;
        }

        @Override // com.google.common.base.k0
        public boolean apply(@fj.a Object o10) {
            return this.f116572a.equals(o10);
        }

        @Override // com.google.common.base.k0
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof h) {
                return this.f116572a.equals(((h) obj).f116572a);
            }
            return false;
        }

        public int hashCode() {
            return this.f116572a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f116572a + ")";
        }

        private h(Object target) {
            this.f116572a = target;
        }
    }

    private static class i<T> implements k0<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116573b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k0<T> f116574a;

        i(k0<T> predicate) {
            this.f116574a = (k0) j0.E(predicate);
        }

        @Override // com.google.common.base.k0
        public boolean apply(@g0 T t10) {
            return !this.f116574a.apply(t10);
        }

        @Override // com.google.common.base.k0
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof i) {
                return this.f116574a.equals(((i) obj).f116574a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f116574a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f116574a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class j implements k0<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f116575a = new a("ALWAYS_TRUE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f116576b = new b("ALWAYS_FALSE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f116577c = new c("IS_NULL", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final j f116578d = new d("NOT_NULL", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ j[] f116579e = k();

        final enum a extends j {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.base.k0
            public boolean apply(@fj.a Object o10) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        final enum b extends j {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.base.k0
            public boolean apply(@fj.a Object o10) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        final enum c extends j {
            c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.base.k0
            public boolean apply(@fj.a Object o10) {
                return o10 == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        final enum d extends j {
            d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.base.k0
            public boolean apply(@fj.a Object o10) {
                return o10 != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        private j(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ j[] k() {
            return new j[]{f116575a, f116576b, f116577c, f116578d};
        }

        public static j valueOf(String name) {
            return (j) Enum.valueOf(j.class, name);
        }

        public static j[] values() {
            return (j[]) f116579e.clone();
        }

        <T> k0<T> l() {
            return this;
        }
    }

    private static class k<T> implements k0<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116580b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends k0<? super T>> f116581a;

        @Override // com.google.common.base.k0
        public boolean apply(@g0 T t10) {
            for (int i10 = 0; i10 < this.f116581a.size(); i10++) {
                if (this.f116581a.get(i10).apply(t10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.k0
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof k) {
                return this.f116581a.equals(((k) obj).f116581a);
            }
            return false;
        }

        public int hashCode() {
            return this.f116581a.hashCode() + 87855567;
        }

        public String toString() {
            return l0.w("or", this.f116581a);
        }

        private k(List<? extends k0<? super T>> components) {
            this.f116581a = components;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static class l implements k0<Class<?>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116582b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f116583a;

        @Override // com.google.common.base.k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Class<?> input) {
            return this.f116583a.isAssignableFrom(input);
        }

        @Override // com.google.common.base.k0
        public boolean equals(@fj.a Object obj) {
            return (obj instanceof l) && this.f116583a == ((l) obj).f116583a;
        }

        public int hashCode() {
            return this.f116583a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f116583a.getName() + ")";
        }

        private l(Class<?> clazz) {
            this.f116583a = (Class) j0.E(clazz);
        }
    }

    private l0() {
    }

    @com.google.common.annotations.b(serializable = true)
    public static <T> k0<T> b() {
        return j.f116576b.l();
    }

    @com.google.common.annotations.b(serializable = true)
    public static <T> k0<T> c() {
        return j.f116575a.l();
    }

    public static <T> k0<T> d(k0<? super T> first, k0<? super T> second) {
        return new b(g((k0) j0.E(first), (k0) j0.E(second)));
    }

    public static <T> k0<T> e(Iterable<? extends k0<? super T>> components) {
        return new b(k(components));
    }

    @SafeVarargs
    public static <T> k0<T> f(k0<? super T>... components) {
        return new b(l(components));
    }

    private static <T> List<k0<? super T>> g(k0<? super T> first, k0<? super T> second) {
        return Arrays.asList(first, second);
    }

    public static <A, B> k0<A> h(k0<B> predicate, t<A, ? extends B> function) {
        return new c(predicate, function);
    }

    @com.google.common.annotations.c("java.util.regex.Pattern")
    public static k0<CharSequence> i(Pattern pattern) {
        return new e(new z(pattern));
    }

    @com.google.common.annotations.c
    public static k0<CharSequence> j(String pattern) {
        return new d(pattern);
    }

    static <T> List<T> k(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(j0.E(it.next()));
        }
        return arrayList;
    }

    private static <T> List<T> l(T... array) {
        return k(Arrays.asList(array));
    }

    public static <T> k0<T> m(@g0 T target) {
        return target == null ? p() : new h(target).a();
    }

    public static <T> k0<T> n(Collection<? extends T> target) {
        return new f(target);
    }

    @com.google.common.annotations.c
    public static <T> k0<T> o(Class<?> clazz) {
        return new g(clazz);
    }

    @com.google.common.annotations.b(serializable = true)
    public static <T> k0<T> p() {
        return j.f116577c.l();
    }

    public static <T> k0<T> q(k0<T> predicate) {
        return new i(predicate);
    }

    @com.google.common.annotations.b(serializable = true)
    public static <T> k0<T> r() {
        return j.f116578d.l();
    }

    public static <T> k0<T> s(k0<? super T> first, k0<? super T> second) {
        return new k(g((k0) j0.E(first), (k0) j0.E(second)));
    }

    public static <T> k0<T> t(Iterable<? extends k0<? super T>> components) {
        return new k(k(components));
    }

    @SafeVarargs
    public static <T> k0<T> u(k0<? super T>... components) {
        return new k(l(components));
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static k0<Class<?>> v(Class<?> clazz) {
        return new l(clazz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w(String methodName, Iterable<?> components) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(methodName);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : components) {
            if (!z10) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
