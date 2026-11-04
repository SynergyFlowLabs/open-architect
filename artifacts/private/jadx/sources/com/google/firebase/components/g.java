package com.google.firebase.components;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f120754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<j0<? super T>> f120755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<v> f120756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f120757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f120758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k<T> f120759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f120760g;

    public static /* synthetic */ Object a(Object obj, h hVar) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, h hVar) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, h hVar) {
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, h hVar) {
        return obj;
    }

    public static /* synthetic */ Object e(Object obj, h hVar) {
        return obj;
    }

    public static <T> b<T> f(j0<T> j0Var) {
        return new b<>(j0Var, new j0[0]);
    }

    @SafeVarargs
    public static <T> b<T> g(j0<T> j0Var, j0<? super T>... j0VarArr) {
        return new b<>(j0Var, j0VarArr);
    }

    public static <T> b<T> h(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> i(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> g<T> o(final T t10, j0<T> j0Var) {
        return q(j0Var).f(new k() { // from class: com.google.firebase.components.c
            @Override // com.google.firebase.components.k
            public final Object a(h hVar) {
                return g.e(t10, hVar);
            }
        }).d();
    }

    public static <T> g<T> p(final T t10, Class<T> cls) {
        return r(cls).f(new k() { // from class: com.google.firebase.components.d
            @Override // com.google.firebase.components.k
            public final Object a(h hVar) {
                return g.d(t10, hVar);
            }
        }).d();
    }

    public static <T> b<T> q(j0<T> j0Var) {
        return f(j0Var).g();
    }

    public static <T> b<T> r(Class<T> cls) {
        return h(cls).g();
    }

    @Deprecated
    public static <T> g<T> w(Class<T> cls, final T t10) {
        return h(cls).f(new k() { // from class: com.google.firebase.components.e
            @Override // com.google.firebase.components.k
            public final Object a(h hVar) {
                return g.b(t10, hVar);
            }
        }).d();
    }

    @SafeVarargs
    public static <T> g<T> x(final T t10, j0<T> j0Var, j0<? super T>... j0VarArr) {
        return g(j0Var, j0VarArr).f(new k() { // from class: com.google.firebase.components.b
            @Override // com.google.firebase.components.k
            public final Object a(h hVar) {
                return g.c(t10, hVar);
            }
        }).d();
    }

    @SafeVarargs
    public static <T> g<T> y(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return i(cls, clsArr).f(new k() { // from class: com.google.firebase.components.f
            @Override // com.google.firebase.components.k
            public final Object a(h hVar) {
                return g.a(t10, hVar);
            }
        }).d();
    }

    public Set<v> j() {
        return this.f120756c;
    }

    public k<T> k() {
        return this.f120759f;
    }

    @p0
    public String l() {
        return this.f120754a;
    }

    public Set<j0<? super T>> m() {
        return this.f120755b;
    }

    public Set<Class<?>> n() {
        return this.f120760g;
    }

    public boolean s() {
        return this.f120757d == 1;
    }

    public boolean t() {
        return this.f120757d == 2;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f120755b.toArray()) + ">{" + this.f120757d + ", type=" + this.f120758e + ", deps=" + Arrays.toString(this.f120756c.toArray()) + "}";
    }

    public boolean u() {
        return this.f120757d == 0;
    }

    public boolean v() {
        return this.f120758e == 0;
    }

    public g<T> z(k<T> kVar) {
        return new g<>(this.f120754a, this.f120755b, this.f120756c, this.f120757d, this.f120758e, kVar, this.f120760g);
    }

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f120761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<j0<? super T>> f120762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<v> f120763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f120764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f120765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private k<T> f120766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f120767g;

        /* JADX INFO: Access modifiers changed from: private */
        @z7.a
        public b<T> g() {
            this.f120765e = 1;
            return this;
        }

        @z7.a
        private b<T> j(int i10) {
            i0.d(this.f120764d == 0, "Instantiation type has already been set.");
            this.f120764d = i10;
            return this;
        }

        private void k(j0<?> j0Var) {
            i0.a(!this.f120762b.contains(j0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @z7.a
        public b<T> b(v vVar) {
            i0.c(vVar, "Null dependency");
            k(vVar.d());
            this.f120763c.add(vVar);
            return this;
        }

        @z7.a
        public b<T> c() {
            return j(1);
        }

        public g<T> d() {
            i0.d(this.f120766f != null, "Missing required property: factory.");
            return new g<>(this.f120761a, new HashSet(this.f120762b), new HashSet(this.f120763c), this.f120764d, this.f120765e, this.f120766f, this.f120767g);
        }

        @z7.a
        public b<T> e() {
            return j(2);
        }

        @z7.a
        public b<T> f(k<T> kVar) {
            this.f120766f = (k) i0.c(kVar, "Null factory");
            return this;
        }

        public b<T> h(@NonNull String str) {
            this.f120761a = str;
            return this;
        }

        @z7.a
        public b<T> i(Class<?> cls) {
            this.f120767g.add(cls);
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f120761a = null;
            HashSet hashSet = new HashSet();
            this.f120762b = hashSet;
            this.f120763c = new HashSet();
            this.f120764d = 0;
            this.f120765e = 0;
            this.f120767g = new HashSet();
            i0.c(cls, "Null interface");
            hashSet.add(j0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                i0.c(cls2, "Null interface");
                this.f120762b.add(j0.b(cls2));
            }
        }

        @SafeVarargs
        private b(j0<T> j0Var, j0<? super T>... j0VarArr) {
            this.f120761a = null;
            HashSet hashSet = new HashSet();
            this.f120762b = hashSet;
            this.f120763c = new HashSet();
            this.f120764d = 0;
            this.f120765e = 0;
            this.f120767g = new HashSet();
            i0.c(j0Var, "Null interface");
            hashSet.add(j0Var);
            for (j0<? super T> j0Var2 : j0VarArr) {
                i0.c(j0Var2, "Null interface");
            }
            Collections.addAll(this.f120762b, j0VarArr);
        }
    }

    private g(@p0 String str, Set<j0<? super T>> set, Set<v> set2, int i10, int i11, k<T> kVar, Set<Class<?>> set3) {
        this.f120754a = str;
        this.f120755b = Collections.unmodifiableSet(set);
        this.f120756c = Collections.unmodifiableSet(set2);
        this.f120757d = i10;
        this.f120758e = i11;
        this.f120759f = kVar;
        this.f120760g = Collections.unmodifiableSet(set3);
    }
}
