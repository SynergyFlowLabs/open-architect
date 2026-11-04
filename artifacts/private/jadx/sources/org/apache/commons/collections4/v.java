package org.apache.commons.collections4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final p f336382a = new e();

    /* JADX INFO: Add missing generic type declarations: [O] */
    static class a<O> extends p<O> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f336383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f336384c;

        a(Iterable iterable, w0 w0Var) {
            this.f336383b = iterable;
            this.f336384c = w0Var;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<O> iterator() {
            return w.k0(this.f336383b.iterator(), this.f336384c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class b<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f336385b;

        b(Iterable iterable) {
            this.f336385b = iterable;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            return new org.apache.commons.collections4.iterators.n0(this.f336385b.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class c<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f336386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f336387c;

        c(Iterable iterable, Iterable iterable2) {
            this.f336386b = iterable;
            this.f336387c = iterable2;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            return w.o0(this.f336386b.iterator(), this.f336387c.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class d<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable[] f336388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f336389c;

        d(Iterable[] iterableArr, Iterable iterable) {
            this.f336388b = iterableArr;
            this.f336389c = iterable;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            Iterator[] itArr = new Iterator[this.f336388b.length + 1];
            int i10 = 0;
            itArr[0] = this.f336389c.iterator();
            while (true) {
                Iterable[] iterableArr = this.f336388b;
                if (i10 >= iterableArr.length) {
                    return w.q0(itArr);
                }
                int i11 = i10 + 1;
                itArr[i11] = iterableArr[i10].iterator();
                i10 = i11;
            }
        }
    }

    static class e extends p<Object> {
        e() {
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<Object> iterator() {
            return w.A();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class f<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable[] f336390b;

        class a extends org.apache.commons.collections4.iterators.x<E> {
            a() {
            }

            @Override // org.apache.commons.collections4.iterators.x
            protected Iterator<? extends E> b(int i10) {
                Iterable[] iterableArr = f.this.f336390b;
                if (i10 > iterableArr.length) {
                    return null;
                }
                return iterableArr[i10 - 1].iterator();
            }
        }

        f(Iterable[] iterableArr) {
            this.f336390b = iterableArr;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            return new a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class g<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f336392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f336393c;

        g(Iterable iterable, Iterable iterable2) {
            this.f336392b = iterable;
            this.f336393c = iterable2;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            return w.x(null, this.f336392b.iterator(), this.f336393c.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class h<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f336394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f336395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterable f336396d;

        h(Comparator comparator, Iterable iterable, Iterable iterable2) {
            this.f336394b = comparator;
            this.f336395c = iterable;
            this.f336396d = iterable2;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            return w.x(this.f336394b, this.f336395c.iterator(), this.f336396d.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class i<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f336397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0 f336398c;

        i(Iterable iterable, l0 l0Var) {
            this.f336397b = iterable;
            this.f336398c = l0Var;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            return w.F(v.p(this.f336397b), this.f336398c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class j<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f336399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f336400c;

        j(Iterable iterable, long j10) {
            this.f336399b = iterable;
            this.f336400c = j10;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            return w.r(this.f336399b.iterator(), this.f336400c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class k<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f336401b;

        class a extends org.apache.commons.collections4.iterators.x<E> {
            a() {
            }

            @Override // org.apache.commons.collections4.iterators.x
            protected Iterator<? extends E> b(int i10) {
                if (v.y(k.this.f336401b)) {
                    return null;
                }
                return k.this.f336401b.iterator();
            }
        }

        k(Iterable iterable) {
            this.f336401b = iterable;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            return new a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class l<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f336403b;

        l(Iterable iterable) {
            this.f336403b = iterable;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            Iterable iterable = this.f336403b;
            return new org.apache.commons.collections4.iterators.i0(iterable instanceof List ? (List) iterable : w.e0(iterable.iterator()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class m<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f336404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f336405c;

        m(Iterable iterable, long j10) {
            this.f336404b = iterable;
            this.f336405c = j10;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            return w.b0(this.f336404b.iterator(), this.f336405c);
        }
    }

    private static final class n<E> extends p<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterable<E> f336406b;

        public n(Iterable<E> iterable) {
            this.f336406b = iterable;
        }

        @Override // org.apache.commons.collections4.p, java.lang.Iterable
        public Iterator<E> iterator() {
            return w.l0(this.f336406b.iterator());
        }
    }

    public static <E> boolean A(Iterable<E> iterable, l0<? super E> l0Var) {
        return w.R(p(iterable), l0Var);
    }

    public static <E> boolean B(Iterable<E> iterable, l0<? super E> l0Var) {
        return w.S(p(iterable), l0Var);
    }

    public static <O, R extends Collection<O>> List<R> C(Iterable<? extends O> iterable, org.apache.commons.collections4.n<R> nVar, l0<? super O>... l0VarArr) {
        if (iterable == null) {
            return C(o(), nVar, l0VarArr);
        }
        if (l0VarArr == null) {
            throw new NullPointerException("Predicates must not be null.");
        }
        for (l0<? super O> l0Var : l0VarArr) {
            if (l0Var == null) {
                throw new NullPointerException("Predicate must not be null.");
            }
        }
        if (l0VarArr.length < 1) {
            R rK = nVar.k();
            org.apache.commons.collections4.j.a(rK, iterable);
            return Collections.singletonList(rK);
        }
        int length = l0VarArr.length;
        int i10 = length + 1;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(nVar.k());
        }
        for (O o10 : iterable) {
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    ((Collection) arrayList.get(length)).add(o10);
                    break;
                }
                if (l0VarArr[i12].a(o10)) {
                    ((Collection) arrayList.get(i12)).add(o10);
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public static <O> List<List<O>> D(Iterable<? extends O> iterable, l0<? super O> l0Var) {
        if (l0Var != null) {
            return C(iterable, o.c(ArrayList.class), l0Var);
        }
        throw new NullPointerException("Predicate must not be null.");
    }

    public static <O> List<List<O>> E(Iterable<? extends O> iterable, l0<? super O>... l0VarArr) {
        return C(iterable, o.c(ArrayList.class), l0VarArr);
    }

    public static <E> Iterable<E> F(Iterable<E> iterable) {
        g(iterable);
        return new l(iterable);
    }

    public static int G(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : w.a0(p(iterable));
    }

    public static <E> Iterable<E> H(Iterable<E> iterable, long j10) {
        g(iterable);
        if (j10 >= 0) {
            return new m(iterable, j10);
        }
        throw new IllegalArgumentException("ElementsToSkip parameter must not be negative.");
    }

    public static <E> List<E> I(Iterable<E> iterable) {
        return w.e0(p(iterable));
    }

    public static <E> String J(Iterable<E> iterable) {
        return w.h0(p(iterable));
    }

    public static <E> String K(Iterable<E> iterable, w0<? super E, String> w0Var) {
        if (w0Var != null) {
            return w.i0(p(iterable), w0Var);
        }
        throw new NullPointerException("Transformer must not be null.");
    }

    public static <E> String L(Iterable<E> iterable, w0<? super E, String> w0Var, String str, String str2, String str3) {
        return w.j0(p(iterable), w0Var, str, str2, str3);
    }

    public static <I, O> Iterable<O> M(Iterable<I> iterable, w0<? super I, ? extends O> w0Var) {
        g(iterable);
        if (w0Var != null) {
            return new a(iterable, w0Var);
        }
        throw new NullPointerException("Transformer must not be null.");
    }

    public static <E> Iterable<E> N(Iterable<E> iterable) {
        g(iterable);
        return new b(iterable);
    }

    public static <E> Iterable<E> O(Iterable<E> iterable) {
        g(iterable);
        return iterable instanceof n ? iterable : new n(iterable);
    }

    public static <E> Iterable<E> P(Iterable<? extends E> iterable, Iterable<? extends E> iterable2) {
        g(iterable);
        g(iterable2);
        return new c(iterable, iterable2);
    }

    public static <E> Iterable<E> Q(Iterable<? extends E> iterable, Iterable<? extends E>... iterableArr) {
        g(iterable);
        h(iterableArr);
        return new d(iterableArr, iterable);
    }

    public static <E> Iterable<E> b(Iterable<E> iterable, long j10) {
        g(iterable);
        if (j10 >= 0) {
            return new j(iterable, j10);
        }
        throw new IllegalArgumentException("MaxSize parameter must not be negative.");
    }

    public static <E> Iterable<E> c(Iterable<? extends E> iterable, Iterable<? extends E> iterable2) {
        return f(iterable, iterable2);
    }

    public static <E> Iterable<E> d(Iterable<? extends E> iterable, Iterable<? extends E> iterable2, Iterable<? extends E> iterable3) {
        return f(iterable, iterable2, iterable3);
    }

    public static <E> Iterable<E> e(Iterable<? extends E> iterable, Iterable<? extends E> iterable2, Iterable<? extends E> iterable3, Iterable<? extends E> iterable4) {
        return f(iterable, iterable2, iterable3, iterable4);
    }

    public static <E> Iterable<E> f(Iterable<? extends E>... iterableArr) {
        h(iterableArr);
        return new f(iterableArr);
    }

    static void g(Iterable<?> iterable) {
        if (iterable == null) {
            throw new NullPointerException("Iterable must not be null.");
        }
    }

    static void h(Iterable<?>... iterableArr) {
        if (iterableArr == null) {
            throw new NullPointerException("Iterables must not be null.");
        }
        for (Iterable<?> iterable : iterableArr) {
            g(iterable);
        }
    }

    public static <E> Iterable<E> i(Iterable<? extends E> iterable, Iterable<? extends E> iterable2) {
        h(iterable, iterable2);
        return new g(iterable, iterable2);
    }

    public static <E> Iterable<E> j(Comparator<? super E> comparator, Iterable<? extends E> iterable, Iterable<? extends E> iterable2) {
        h(iterable, iterable2);
        return new h(comparator, iterable, iterable2);
    }

    public static <E> boolean k(Iterable<E> iterable, Object obj) {
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : w.z(p(iterable), obj);
    }

    public static <E> boolean l(Iterable<? extends E> iterable, E e10, org.apache.commons.collections4.m<? super E> mVar) {
        if (mVar != null) {
            return B(iterable, org.apache.commons.collections4.functors.n.d(e10, mVar));
        }
        throw new NullPointerException("Equator must not be null.");
    }

    public static <E> long m(Iterable<E> iterable, l0<? super E> l0Var) {
        if (l0Var != null) {
            return G(q(n(iterable), l0Var));
        }
        throw new NullPointerException("Predicate must not be null.");
    }

    public static <E> Iterable<E> n(Iterable<E> iterable) {
        if (iterable == null) {
            iterable = o();
        }
        return iterable;
    }

    public static <E> Iterable<E> o() {
        return f336382a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> p(Iterable<E> iterable) {
        return iterable != null ? iterable.iterator() : w.A();
    }

    public static <E> Iterable<E> q(Iterable<E> iterable, l0<? super E> l0Var) {
        g(iterable);
        if (l0Var != null) {
            return new i(iterable, l0Var);
        }
        throw new NullPointerException("Predicate must not be null.");
    }

    public static <E> E r(Iterable<E> iterable, l0<? super E> l0Var) {
        return (E) w.H(p(iterable), l0Var);
    }

    public static <T> T s(Iterable<T> iterable) {
        return (T) w(iterable, 0);
    }

    public static <E> void t(Iterable<E> iterable, org.apache.commons.collections4.h<? super E> hVar) {
        w.J(p(iterable), hVar);
    }

    public static <E> E u(Iterable<E> iterable, org.apache.commons.collections4.h<? super E> hVar) {
        return (E) w.K(p(iterable), hVar);
    }

    public static <E, T extends E> int v(Iterable<E> iterable, T t10) {
        if (iterable instanceof Set) {
            return ((Set) iterable).contains(t10) ? 1 : 0;
        }
        return iterable instanceof org.apache.commons.collections4.c ? ((org.apache.commons.collections4.c) iterable).U0(t10) : G(q(n(iterable), org.apache.commons.collections4.functors.n.c(t10)));
    }

    public static <T> T w(Iterable<T> iterable, int i10) {
        org.apache.commons.collections4.j.g(i10);
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) w.L(p(iterable), i10);
    }

    public static <E> int x(Iterable<E> iterable, l0<? super E> l0Var) {
        return w.N(p(iterable), l0Var);
    }

    public static boolean y(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : w.O(p(iterable));
    }

    public static <E> Iterable<E> z(Iterable<E> iterable) {
        g(iterable);
        return new k(iterable);
    }
}
