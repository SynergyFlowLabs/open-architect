package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class u3<C extends Comparable> implements Comparable<u3<C>>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f118169b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C f118170a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f118171a;

        static {
            int[] iArr = new int[x.values().length];
            f118171a = iArr;
            try {
                iArr[x.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118171a[x.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static final class b extends u3<Comparable<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f118172c = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f118173d = 0;

        private b() {
            super("");
        }

        private Object readResolve() {
            return f118172c;
        }

        @Override // com.google.common.collect.u3
        x D() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.u3
        u3<Comparable<?>> E(x boundType, z3<Comparable<?>> domain) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.u3
        u3<Comparable<?>> H(x boundType, z3<Comparable<?>> domain) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.u3
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.u3, java.lang.Comparable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public int compareTo(u3<Comparable<?>> o10) {
            return o10 == this ? 0 : 1;
        }

        @Override // com.google.common.collect.u3
        void r(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.u3
        void s(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        @Override // com.google.common.collect.u3
        Comparable<?> t() {
            throw new IllegalStateException("range unbounded on this side");
        }

        public String toString() {
            return "+∞";
        }

        @Override // com.google.common.collect.u3
        Comparable<?> v(z3<Comparable<?>> domain) {
            return domain.e();
        }

        @Override // com.google.common.collect.u3
        boolean w(Comparable<?> value) {
            return false;
        }

        @Override // com.google.common.collect.u3
        Comparable<?> x(z3<Comparable<?>> domain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.u3
        x z() {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    private static final class c<C extends Comparable> extends u3<C> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f118174c = 0;

        c(C endpoint) {
            super((Comparable) com.google.common.base.j0.E(endpoint));
        }

        @Override // com.google.common.collect.u3
        x D() {
            return x.CLOSED;
        }

        @Override // com.google.common.collect.u3
        u3<C> E(x boundType, z3<C> domain) {
            int i10 = a.f118171a[boundType.ordinal()];
            if (i10 == 1) {
                Comparable comparableG = domain.g(this.f118170a);
                return comparableG == null ? u3.n() : u3.o(comparableG);
            }
            if (i10 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.u3
        u3<C> H(x boundType, z3<C> domain) {
            int i10 = a.f118171a[boundType.ordinal()];
            if (i10 == 1) {
                return this;
            }
            if (i10 != 2) {
                throw new AssertionError();
            }
            Comparable comparableG = domain.g(this.f118170a);
            return comparableG == null ? u3.k() : u3.o(comparableG);
        }

        @Override // com.google.common.collect.u3, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.compareTo((u3) that);
        }

        @Override // com.google.common.collect.u3
        public int hashCode() {
            return ~this.f118170a.hashCode();
        }

        @Override // com.google.common.collect.u3
        u3<C> p(z3<C> domain) {
            Comparable comparableX = x(domain);
            return comparableX != null ? u3.o(comparableX) : u3.k();
        }

        @Override // com.google.common.collect.u3
        void r(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f118170a);
        }

        @Override // com.google.common.collect.u3
        void s(StringBuilder sb2) {
            sb2.append(this.f118170a);
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }

        public String toString() {
            return "/" + this.f118170a + "\\";
        }

        @Override // com.google.common.collect.u3
        C v(z3<C> domain) {
            return this.f118170a;
        }

        @Override // com.google.common.collect.u3
        boolean w(C value) {
            return f9.h(this.f118170a, value) < 0;
        }

        @Override // com.google.common.collect.u3
        @fj.a
        C x(z3<C> z3Var) {
            return (C) z3Var.g(this.f118170a);
        }

        @Override // com.google.common.collect.u3
        x z() {
            return x.OPEN;
        }
    }

    private static final class d extends u3<Comparable<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final d f118175c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f118176d = 0;

        private d() {
            super("");
        }

        private Object readResolve() {
            return f118175c;
        }

        @Override // com.google.common.collect.u3
        x D() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.u3
        u3<Comparable<?>> E(x boundType, z3<Comparable<?>> domain) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.u3
        u3<Comparable<?>> H(x boundType, z3<Comparable<?>> domain) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.u3
        public int hashCode() {
            return System.identityHashCode(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.collect.u3$d] */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.google.common.collect.u3<java.lang.Comparable<?>>] */
        /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.collect.u3] */
        @Override // com.google.common.collect.u3
        u3<Comparable<?>> p(z3<Comparable<?>> domain) {
            try {
                this = u3.o(domain.f());
            } catch (NoSuchElementException unused) {
            }
            return this;
        }

        @Override // com.google.common.collect.u3, java.lang.Comparable
        /* JADX INFO: renamed from: q */
        public int compareTo(u3<Comparable<?>> o10) {
            return o10 == this ? 0 : -1;
        }

        @Override // com.google.common.collect.u3
        void r(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        @Override // com.google.common.collect.u3
        void s(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.u3
        Comparable<?> t() {
            throw new IllegalStateException("range unbounded on this side");
        }

        public String toString() {
            return "-∞";
        }

        @Override // com.google.common.collect.u3
        Comparable<?> v(z3<Comparable<?>> domain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.u3
        boolean w(Comparable<?> value) {
            return true;
        }

        @Override // com.google.common.collect.u3
        Comparable<?> x(z3<Comparable<?>> domain) {
            return domain.f();
        }

        @Override // com.google.common.collect.u3
        x z() {
            throw new IllegalStateException();
        }
    }

    private static final class e<C extends Comparable> extends u3<C> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f118177c = 0;

        e(C endpoint) {
            super((Comparable) com.google.common.base.j0.E(endpoint));
        }

        @Override // com.google.common.collect.u3
        x D() {
            return x.OPEN;
        }

        @Override // com.google.common.collect.u3
        u3<C> E(x boundType, z3<C> domain) {
            int i10 = a.f118171a[boundType.ordinal()];
            int i11 = 1 << 1;
            if (i10 == 1) {
                return this;
            }
            if (i10 != 2) {
                throw new AssertionError();
            }
            Comparable comparableI = domain.i(this.f118170a);
            return comparableI == null ? u3.n() : new c(comparableI);
        }

        @Override // com.google.common.collect.u3
        u3<C> H(x boundType, z3<C> domain) {
            int i10 = a.f118171a[boundType.ordinal()];
            if (i10 == 1) {
                Comparable comparableI = domain.i(this.f118170a);
                return comparableI == null ? u3.k() : new c(comparableI);
            }
            if (i10 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.u3, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.compareTo((u3) that);
        }

        @Override // com.google.common.collect.u3
        public int hashCode() {
            return this.f118170a.hashCode();
        }

        @Override // com.google.common.collect.u3
        void r(StringBuilder sb2) {
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f118170a);
        }

        @Override // com.google.common.collect.u3
        void s(StringBuilder sb2) {
            sb2.append(this.f118170a);
            sb2.append(')');
        }

        public String toString() {
            return "\\" + this.f118170a + "/";
        }

        @Override // com.google.common.collect.u3
        @fj.a
        C v(z3<C> z3Var) {
            return (C) z3Var.i(this.f118170a);
        }

        @Override // com.google.common.collect.u3
        boolean w(C value) {
            return f9.h(this.f118170a, value) <= 0;
        }

        @Override // com.google.common.collect.u3
        C x(z3<C> domain) {
            return this.f118170a;
        }

        @Override // com.google.common.collect.u3
        x z() {
            return x.CLOSED;
        }
    }

    u3(C endpoint) {
        this.f118170a = endpoint;
    }

    static <C extends Comparable> u3<C> k() {
        return b.f118172c;
    }

    static <C extends Comparable> u3<C> l(C endpoint) {
        return new c(endpoint);
    }

    static <C extends Comparable> u3<C> n() {
        return d.f118175c;
    }

    static <C extends Comparable> u3<C> o(C endpoint) {
        return new e(endpoint);
    }

    abstract x D();

    abstract u3<C> E(x boundType, z3<C> domain);

    abstract u3<C> H(x boundType, z3<C> domain);

    public boolean equals(@fj.a Object obj) {
        if (obj instanceof u3) {
            try {
                if (compareTo((u3) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    u3<C> p(z3<C> domain) {
        return this;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q */
    public int compareTo(u3<C> that) {
        if (that == n()) {
            return 1;
        }
        if (that == k()) {
            return -1;
        }
        int iH = f9.h(this.f118170a, that.f118170a);
        return iH != 0 ? iH : Boolean.compare(this instanceof c, that instanceof c);
    }

    abstract void r(StringBuilder sb2);

    abstract void s(StringBuilder sb2);

    C t() {
        return this.f118170a;
    }

    @fj.a
    abstract C v(z3<C> domain);

    abstract boolean w(C value);

    @fj.a
    abstract C x(z3<C> domain);

    abstract x z();
}
