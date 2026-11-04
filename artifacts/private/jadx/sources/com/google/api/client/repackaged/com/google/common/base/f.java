package com.google.api.client.repackaged.com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@r7.b
public abstract class f<A, B> implements i<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f115860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    private transient f<B, A> f115861b;

    class a implements Iterable<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f115862a;

        /* JADX INFO: renamed from: com.google.api.client.repackaged.com.google.common.base.f$a$a, reason: collision with other inner class name */
        class C1029a implements Iterator<B> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<? extends A> f115864a;

            C1029a() {
                this.f115864a = a.this.f115862a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f115864a.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) f.this.b(this.f115864a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f115864a.remove();
            }
        }

        a(Iterable iterable) {
            this.f115862a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new C1029a();
        }
    }

    private static final class b<A, B, C> extends f<A, C> implements Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f115866e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final f<A, B> f115867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final f<B, C> f115868d;

        b(f<A, B> fVar, f<B, C> fVar2) {
            this.f115867c = fVar;
            this.f115868d = fVar2;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        @fj.h
        A d(@fj.h C c10) {
            return (A) this.f115867c.d(this.f115868d.d(c10));
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        @fj.h
        C e(@fj.h A a10) {
            return (C) this.f115868d.e(this.f115867c.e(a10));
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f, com.google.api.client.repackaged.com.google.common.base.i
        public boolean equals(@fj.h Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f115867c.equals(bVar.f115867c) && this.f115868d.equals(bVar.f115868d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        protected A g(C c10) {
            throw new AssertionError();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        protected C h(A a10) {
            throw new AssertionError();
        }

        public int hashCode() {
            return (this.f115867c.hashCode() * 31) + this.f115868d.hashCode();
        }

        public String toString() {
            return this.f115867c + ".andThen(" + this.f115868d + ")";
        }
    }

    private static final class c<A, B> extends f<A, B> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i<? super A, ? extends B> f115869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final i<? super B, ? extends A> f115870d;

        /* synthetic */ c(i iVar, i iVar2, a aVar) {
            this(iVar, iVar2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f, com.google.api.client.repackaged.com.google.common.base.i
        public boolean equals(@fj.h Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f115869c.equals(cVar.f115869c) && this.f115870d.equals(cVar.f115870d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        protected A g(B b10) {
            return this.f115870d.apply(b10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        protected B h(A a10) {
            return this.f115869c.apply(a10);
        }

        public int hashCode() {
            return (this.f115869c.hashCode() * 31) + this.f115870d.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f115869c + ", " + this.f115870d + ")";
        }

        private c(i<? super A, ? extends B> iVar, i<? super B, ? extends A> iVar2) {
            this.f115869c = (i) q.E(iVar);
            this.f115870d = (i) q.E(iVar2);
        }
    }

    private static final class d<T> extends f<T, T> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final d f115871c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f115872d = 0;

        private d() {
        }

        private Object readResolve() {
            return f115871c;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        <S> f<T, S> f(f<T, S> fVar) {
            return (f) q.F(fVar, "otherConverter");
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        protected T g(T t10) {
            return t10;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        protected T h(T t10) {
            return t10;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public d<T> k() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    private static final class e<A, B> extends f<B, A> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f115873d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final f<A, B> f115874c;

        e(f<A, B> fVar) {
            this.f115874c = fVar;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        @fj.h
        B d(@fj.h A a10) {
            return this.f115874c.e(a10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        @fj.h
        A e(@fj.h B b10) {
            return this.f115874c.d(b10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f, com.google.api.client.repackaged.com.google.common.base.i
        public boolean equals(@fj.h Object obj) {
            if (obj instanceof e) {
                return this.f115874c.equals(((e) obj).f115874c);
            }
            return false;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        protected B g(A a10) {
            throw new AssertionError();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        protected A h(B b10) {
            throw new AssertionError();
        }

        public int hashCode() {
            return ~this.f115874c.hashCode();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f
        public f<A, B> k() {
            return this.f115874c;
        }

        public String toString() {
            return this.f115874c + ".reverse()";
        }
    }

    protected f() {
        this(true);
    }

    public static <A, B> f<A, B> i(i<? super A, ? extends B> iVar, i<? super B, ? extends A> iVar2) {
        return new c(iVar, iVar2, null);
    }

    public static <T> f<T, T> j() {
        return d.f115871c;
    }

    public final <C> f<A, C> a(f<B, C> fVar) {
        return f(fVar);
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.i
    @fj.h
    @z7.a
    @Deprecated
    public final B apply(@fj.h A a10) {
        return b(a10);
    }

    @fj.h
    @z7.a
    public final B b(@fj.h A a10) {
        return e(a10);
    }

    @z7.a
    public Iterable<B> c(Iterable<? extends A> iterable) {
        q.F(iterable, "fromIterable");
        return new a(iterable);
    }

    @fj.h
    A d(@fj.h B b10) {
        if (!this.f115860a) {
            return g(b10);
        }
        if (b10 == null) {
            return null;
        }
        return (A) q.E(g(b10));
    }

    @fj.h
    B e(@fj.h A a10) {
        if (!this.f115860a) {
            return h(a10);
        }
        if (a10 == null) {
            return null;
        }
        return (B) q.E(h(a10));
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.i
    public boolean equals(@fj.h Object obj) {
        return super.equals(obj);
    }

    <C> f<A, C> f(f<B, C> fVar) {
        return new b(this, (f) q.E(fVar));
    }

    protected abstract A g(B b10);

    protected abstract B h(A a10);

    @z7.a
    public f<B, A> k() {
        f<B, A> eVar = this.f115861b;
        if (eVar == null) {
            eVar = new e<>(this);
            this.f115861b = eVar;
        }
        return eVar;
    }

    f(boolean z10) {
        this.f115860a = z10;
    }
}
