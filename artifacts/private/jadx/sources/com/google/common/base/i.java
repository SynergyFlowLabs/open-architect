package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
public abstract class i<A, B> implements t<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f116538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @r9.j
    @fj.a
    private transient i<B, A> f116539b;

    class a implements Iterable<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f116540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f116541b;

        /* JADX INFO: renamed from: com.google.common.base.i$a$a, reason: collision with other inner class name */
        class C1046a implements Iterator<B> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<? extends A> f116542a;

            C1046a() {
                this.f116542a = a.this.f116540a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f116542a.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) a.this.f116541b.b(this.f116542a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f116542a.remove();
            }
        }

        a(final i this$0, final Iterable val$fromIterable) {
            this.f116540a = val$fromIterable;
            this.f116541b = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new C1046a();
        }
    }

    private static final class b<A, B, C> extends i<A, C> implements Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f116544e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final i<A, B> f116545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final i<B, C> f116546d;

        b(i<A, B> first, i<B, C> second) {
            this.f116545c = first;
            this.f116546d = second;
        }

        @Override // com.google.common.base.i
        @fj.a
        A d(@fj.a C c10) {
            return (A) this.f116545c.d(this.f116546d.d(c10));
        }

        @Override // com.google.common.base.i
        @fj.a
        C e(@fj.a A a10) {
            return (C) this.f116546d.e(this.f116545c.e(a10));
        }

        @Override // com.google.common.base.i, com.google.common.base.t
        public boolean equals(@fj.a Object object) {
            if (object instanceof b) {
                b bVar = (b) object;
                if (this.f116545c.equals(bVar.f116545c) && this.f116546d.equals(bVar.f116546d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.i
        protected A g(C c10) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.i
        protected C h(A a10) {
            throw new AssertionError();
        }

        public int hashCode() {
            return (this.f116545c.hashCode() * 31) + this.f116546d.hashCode();
        }

        public String toString() {
            return this.f116545c + ".andThen(" + this.f116546d + ")";
        }
    }

    private static final class c<A, B> extends i<A, B> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t<? super A, ? extends B> f116547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t<? super B, ? extends A> f116548d;

        /* synthetic */ c(t tVar, t tVar2, a aVar) {
            this(tVar, tVar2);
        }

        @Override // com.google.common.base.i, com.google.common.base.t
        public boolean equals(@fj.a Object object) {
            if (object instanceof c) {
                c cVar = (c) object;
                if (this.f116547c.equals(cVar.f116547c) && this.f116548d.equals(cVar.f116548d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.i
        protected A g(B b10) {
            return this.f116548d.apply(b10);
        }

        @Override // com.google.common.base.i
        protected B h(A a10) {
            return this.f116547c.apply(a10);
        }

        public int hashCode() {
            return (this.f116547c.hashCode() * 31) + this.f116548d.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f116547c + ", " + this.f116548d + ")";
        }

        private c(t<? super A, ? extends B> forwardFunction, t<? super B, ? extends A> backwardFunction) {
            this.f116547c = (t) j0.E(forwardFunction);
            this.f116548d = (t) j0.E(backwardFunction);
        }
    }

    private static final class d<T> extends i<T, T> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i<?, ?> f116549c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f116550d = 0;

        private d() {
        }

        private Object readResolve() {
            return f116549c;
        }

        @Override // com.google.common.base.i
        <S> i<T, S> f(i<T, S> otherConverter) {
            return (i) j0.F(otherConverter, "otherConverter");
        }

        @Override // com.google.common.base.i
        protected T g(T t10) {
            return t10;
        }

        @Override // com.google.common.base.i
        protected T h(T t10) {
            return t10;
        }

        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public d<T> k() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    private static final class e<A, B> extends i<B, A> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f116551d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final i<A, B> f116552c;

        e(i<A, B> original) {
            this.f116552c = original;
        }

        @Override // com.google.common.base.i
        @fj.a
        B d(@fj.a A a10) {
            return this.f116552c.e(a10);
        }

        @Override // com.google.common.base.i
        @fj.a
        A e(@fj.a B b10) {
            return this.f116552c.d(b10);
        }

        @Override // com.google.common.base.i, com.google.common.base.t
        public boolean equals(@fj.a Object object) {
            if (object instanceof e) {
                return this.f116552c.equals(((e) object).f116552c);
            }
            return false;
        }

        @Override // com.google.common.base.i
        protected B g(A a10) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.i
        protected A h(B b10) {
            throw new AssertionError();
        }

        public int hashCode() {
            return ~this.f116552c.hashCode();
        }

        @Override // com.google.common.base.i
        public i<A, B> k() {
            return this.f116552c;
        }

        public String toString() {
            return this.f116552c + ".reverse()";
        }
    }

    protected i() {
        this(true);
    }

    public static <A, B> i<A, B> i(t<? super A, ? extends B> forwardFunction, t<? super B, ? extends A> backwardFunction) {
        return new c(forwardFunction, backwardFunction, null);
    }

    public static <T> i<T, T> j() {
        return (d) d.f116549c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fj.a
    private A m(@fj.a B b10) {
        return (A) g(c0.a(b10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fj.a
    private B n(@fj.a A a10) {
        return (B) h(c0.a(a10));
    }

    public final <C> i<A, C> a(i<B, C> secondConverter) {
        return f(secondConverter);
    }

    @Override // com.google.common.base.t
    @z7.m(replacement = "this.convert(a)")
    @Deprecated
    public final B apply(A a10) {
        return b(a10);
    }

    @fj.a
    public final B b(@fj.a A a10) {
        return e(a10);
    }

    public Iterable<B> c(Iterable<? extends A> fromIterable) {
        j0.F(fromIterable, "fromIterable");
        return new a(this, fromIterable);
    }

    @fj.a
    A d(@fj.a B b10) {
        if (!this.f116538a) {
            return m(b10);
        }
        if (b10 == null) {
            return null;
        }
        return (A) j0.E(g(b10));
    }

    @fj.a
    B e(@fj.a A a10) {
        if (!this.f116538a) {
            return n(a10);
        }
        if (a10 == null) {
            return null;
        }
        return (B) j0.E(h(a10));
    }

    @Override // com.google.common.base.t
    public boolean equals(@fj.a Object object) {
        return super.equals(object);
    }

    <C> i<A, C> f(i<B, C> secondConverter) {
        return new b(this, (i) j0.E(secondConverter));
    }

    @z7.g
    protected abstract A g(B b10);

    @z7.g
    protected abstract B h(A a10);

    @z7.b
    public i<B, A> k() {
        i<B, A> iVar = this.f116539b;
        if (iVar != null) {
            return iVar;
        }
        e eVar = new e(this);
        this.f116539b = eVar;
        return eVar;
    }

    i(boolean handleNullAutomatically) {
        this.f116538a = handleNullAutomatically;
    }
}
