package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@a4
public final class n7 {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z7 f117774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f117775b;

        public <E> m7<E> a() {
            if (!this.f117775b) {
                this.f117774a.l();
            }
            return new d(this.f117774a);
        }

        public b b(int concurrencyLevel) {
            this.f117774a.a(concurrencyLevel);
            return this;
        }

        public b c() {
            this.f117775b = true;
            return this;
        }

        @com.google.common.annotations.c("java.lang.ref.WeakReference")
        public b d() {
            this.f117775b = false;
            return this;
        }

        private b() {
            this.f117774a = new z7();
            this.f117775b = true;
        }
    }

    private static class c<E> implements com.google.common.base.t<E, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m7<E> f117776a;

        public c(m7<E> interner) {
            this.f117776a = interner;
        }

        @Override // com.google.common.base.t
        public E apply(E input) {
            return this.f117776a.a(input);
        }

        @Override // com.google.common.base.t
        public boolean equals(@fj.a Object other) {
            if (other instanceof c) {
                return this.f117776a.equals(((c) other).f117776a);
            }
            return false;
        }

        public int hashCode() {
            return this.f117776a.hashCode();
        }
    }

    @com.google.common.annotations.e
    static final class d<E> implements m7<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @com.google.common.annotations.e
        final a8<E, z7.a, ?, ?> f117777a;

        @Override // com.google.common.collect.m7
        public E a(E e10) {
            E e11;
            do {
                a8.j jVarE = this.f117777a.e(e10);
                if (jVarE != null && (e11 = (E) jVarE.getKey()) != null) {
                    return e11;
                }
            } while (this.f117777a.putIfAbsent(e10, z7.a.VALUE) != null);
            return e10;
        }

        private d(z7 mapMaker) {
            this.f117777a = a8.d(mapMaker.h(com.google.common.base.m.c()));
        }
    }

    private n7() {
    }

    public static <E> com.google.common.base.t<E, E> a(m7<E> interner) {
        return new c((m7) com.google.common.base.j0.E(interner));
    }

    public static b b() {
        return new b();
    }

    public static <E> m7<E> c() {
        return b().c().a();
    }

    @com.google.common.annotations.c("java.lang.ref.WeakReference")
    public static <E> m7<E> d() {
        return b().d().a();
    }
}
