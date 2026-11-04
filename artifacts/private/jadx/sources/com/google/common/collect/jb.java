package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public final class jb<E> extends o<E> implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final long f117526h = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient g<f<E>> f117527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient v5<E> f117528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient f<E> f117529g;

    class a extends r8.f<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f117530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ jb f117531b;

        a(final jb this$0, final f val$baseEntry) {
            this.f117530a = val$baseEntry;
            this.f117531b = this$0;
        }

        @Override // com.google.common.collect.q8.a
        @b9
        public E X0() {
            return (E) this.f117530a.x();
        }

        @Override // com.google.common.collect.q8.a
        public int getCount() {
            int iW = this.f117530a.w();
            return iW == 0 ? this.f117531b.P3(X0()) : iW;
        }
    }

    class b implements Iterator<q8.a<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        f<E> f117532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        q8.a<E> f117533b;

        b() {
            this.f117532a = jb.this.M();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q8.a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            jb jbVar = jb.this;
            f<E> fVar = this.f117532a;
            Objects.requireNonNull(fVar);
            q8.a<E> aVarQ = jbVar.Q(fVar);
            this.f117533b = aVarQ;
            if (this.f117532a.L() == jb.this.f117529g) {
                this.f117532a = null;
                return aVarQ;
            }
            this.f117532a = this.f117532a.L();
            return aVarQ;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f117532a == null) {
                return false;
            }
            if (!jb.this.f117528f.p(this.f117532a.x())) {
                return true;
            }
            this.f117532a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.j0.h0(this.f117533b != null, "no calls to next() since the last call to remove()");
            jb.this.g1(this.f117533b.X0(), 0);
            this.f117533b = null;
        }
    }

    class c implements Iterator<q8.a<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        f<E> f117535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        q8.a<E> f117536b = null;

        c() {
            this.f117535a = jb.this.N();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q8.a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.f117535a);
            q8.a<E> aVarQ = jb.this.Q(this.f117535a);
            this.f117536b = aVarQ;
            if (this.f117535a.z() == jb.this.f117529g) {
                this.f117535a = null;
                return aVarQ;
            }
            this.f117535a = this.f117535a.z();
            return aVarQ;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f117535a == null) {
                return false;
            }
            if (!jb.this.f117528f.q(this.f117535a.x())) {
                return true;
            }
            this.f117535a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.j0.h0(this.f117536b != null, "no calls to next() since the last call to remove()");
            jb.this.g1(this.f117536b.X0(), 0);
            this.f117536b = null;
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f117538a;

        static {
            int[] iArr = new int[x.values().length];
            f117538a = iArr;
            try {
                iArr[x.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117538a[x.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f117539a = new a("SIZE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f117540b = new b("DISTINCT", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ e[] f117541c = k();

        final enum a extends e {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.collect.jb.e
            int l(f<?> node) {
                return ((f) node).f117543b;
            }

            @Override // com.google.common.collect.jb.e
            long n(@fj.a f<?> root) {
                if (root == null) {
                    return 0L;
                }
                return ((f) root).f117545d;
            }
        }

        final enum b extends e {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.collect.jb.e
            int l(f<?> node) {
                return 1;
            }

            @Override // com.google.common.collect.jb.e
            long n(@fj.a f<?> root) {
                if (root == null) {
                    return 0L;
                }
                return ((f) root).f117544c;
            }
        }

        private e(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ e[] k() {
            return new e[]{f117539a, f117540b};
        }

        public static e valueOf(String name) {
            return (e) Enum.valueOf(e.class, name);
        }

        public static e[] values() {
            return (e[]) f117541c.clone();
        }

        abstract int l(f<?> node);

        abstract long n(@fj.a f<?> root);

        /* synthetic */ e(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    private static final class g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        private T f117551a;

        private g() {
        }

        public void a(@fj.a T expected, @fj.a T newValue) {
            if (this.f117551a != expected) {
                throw new ConcurrentModificationException();
            }
            this.f117551a = newValue;
        }

        void b() {
            this.f117551a = null;
        }

        @fj.a
        public T c() {
            return this.f117551a;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    jb(g<f<E>> rootReference, v5<E> range, f<E> endLink) {
        super(range.b());
        this.f117527e = rootReference;
        this.f117528f = range;
        this.f117529g = endLink;
    }

    private long C(e aggr, @fj.a f<E> node) {
        long jN;
        long jC;
        if (node == null) {
            return 0L;
        }
        int iCompare = comparator().compare(u8.a(this.f117528f.i()), node.x());
        if (iCompare > 0) {
            return C(aggr, ((f) node).f117548g);
        }
        if (iCompare == 0) {
            int i10 = d.f117538a[this.f117528f.h().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return aggr.n(((f) node).f117548g);
                }
                throw new AssertionError();
            }
            jN = aggr.l(node);
            jC = aggr.n(((f) node).f117548g);
        } else {
            jN = aggr.n(((f) node).f117548g) + ((long) aggr.l(node));
            jC = C(aggr, ((f) node).f117547f);
        }
        return jN + jC;
    }

    private long D(e aggr, @fj.a f<E> node) {
        long jN;
        long jD;
        if (node == null) {
            return 0L;
        }
        int iCompare = comparator().compare(u8.a(this.f117528f.g()), node.x());
        if (iCompare < 0) {
            return D(aggr, ((f) node).f117547f);
        }
        if (iCompare == 0) {
            int i10 = d.f117538a[this.f117528f.f().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return aggr.n(((f) node).f117547f);
                }
                throw new AssertionError();
            }
            jN = aggr.l(node);
            jD = aggr.n(((f) node).f117547f);
        } else {
            jN = aggr.n(((f) node).f117547f) + ((long) aggr.l(node));
            jD = D(aggr, ((f) node).f117548g);
        }
        return jN + jD;
    }

    private long F(e aggr) {
        f<E> fVarC = this.f117527e.c();
        long jN = aggr.n(fVarC);
        if (this.f117528f.j()) {
            jN -= D(aggr, fVarC);
        }
        if (this.f117528f.k()) {
            jN -= C(aggr, fVarC);
        }
        return jN;
    }

    public static <E extends Comparable> jb<E> G() {
        return new jb<>(a9.z());
    }

    public static <E extends Comparable> jb<E> J(Iterable<? extends E> elements) {
        jb<E> jbVarG = G();
        o7.a(jbVarG, elements);
        return jbVarG;
    }

    public static <E> jb<E> K(@fj.a Comparator<? super E> comparator) {
        return comparator == null ? new jb<>(a9.z()) : new jb<>(comparator);
    }

    static int L(@fj.a f<?> node) {
        if (node == null) {
            return 0;
        }
        return ((f) node).f117544c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.a
    public f<E> M() {
        f<E> fVarL;
        f<E> fVarC = this.f117527e.c();
        if (fVarC == null) {
            return null;
        }
        if (this.f117528f.j()) {
            Object objA = u8.a(this.f117528f.g());
            fVarL = fVarC.s(comparator(), objA);
            if (fVarL == null) {
                return null;
            }
            if (this.f117528f.f() == x.OPEN && comparator().compare(objA, fVarL.x()) == 0) {
                fVarL = fVarL.L();
            }
        } else {
            fVarL = this.f117529g.L();
        }
        if (fVarL != this.f117529g && this.f117528f.c(fVarL.x())) {
            return fVarL;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.a
    public f<E> N() {
        f<E> fVarZ;
        f<E> fVarC = this.f117527e.c();
        if (fVarC == null) {
            return null;
        }
        if (this.f117528f.k()) {
            Object objA = u8.a(this.f117528f.i());
            fVarZ = fVarC.v(comparator(), objA);
            if (fVarZ == null) {
                return null;
            }
            if (this.f117528f.h() == x.OPEN && comparator().compare(objA, fVarZ.x()) == 0) {
                fVarZ = fVarZ.z();
            }
        } else {
            fVarZ = this.f117529g.z();
        }
        if (fVarZ == this.f117529g || !this.f117528f.c(fVarZ.x())) {
            return null;
        }
        return fVarZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void O(f<T> a10, f<T> b10) {
        ((f) a10).f117550i = b10;
        ((f) b10).f117549h = a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void P(f<T> a10, f<T> b10, f<T> c10) {
        O(a10, b10);
        O(b10, c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q8.a<E> Q(final f<E> baseEntry) {
        return new a(this, baseEntry);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        x9.a(o.class, "comparator").b(this, comparator);
        x9.a(jb.class, "range").b(this, v5.a(comparator));
        x9.a(jb.class, "rootReference").b(this, new g(null));
        f fVar = new f();
        x9.a(jb.class, "header").b(this, fVar);
        O(fVar, fVar);
        x9.f(this, stream);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(o().comparator());
        x9.k(this, stream);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public int H(@b9 E element, int occurrences) {
        a3.b(occurrences, "occurrences");
        if (occurrences == 0) {
            return P3(element);
        }
        com.google.common.base.j0.d(this.f117528f.c(element));
        f<E> fVarC = this.f117527e.c();
        if (fVarC != null) {
            int[] iArr = new int[1];
            this.f117527e.a(fVarC, fVarC.o(comparator(), element, occurrences, iArr));
            return iArr[0];
        }
        comparator().compare(element, element);
        f<E> fVar = new f<>(element, occurrences);
        f<E> fVar2 = this.f117529g;
        P(fVar2, fVar, fVar2);
        this.f117527e.a(fVarC, fVar);
        return 0;
    }

    @Override // com.google.common.collect.o, com.google.common.collect.ga
    public /* bridge */ /* synthetic */ ga J2() {
        return super.J2();
    }

    @Override // com.google.common.collect.q8
    public int P3(@fj.a Object element) {
        try {
            f<E> fVarC = this.f117527e.c();
            if (this.f117528f.c(element) && fVarC != null) {
                return fVarC.t(comparator(), element);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public boolean Q2(@b9 E element, int oldCount, int newCount) {
        a3.b(newCount, "newCount");
        a3.b(oldCount, "oldCount");
        com.google.common.base.j0.d(this.f117528f.c(element));
        f<E> fVarC = this.f117527e.c();
        if (fVarC != null) {
            int[] iArr = new int[1];
            this.f117527e.a(fVarC, fVarC.J(comparator(), element, oldCount, newCount, iArr));
            return iArr[0] == oldCount;
        }
        if (oldCount != 0) {
            return false;
        }
        if (newCount > 0) {
            H(element, newCount);
        }
        return true;
    }

    @Override // com.google.common.collect.ga
    public ga<E> T2(@b9 E upperBound, x boundType) {
        return new jb(this.f117527e, this.f117528f.l(v5.r(comparator(), upperBound, boundType)), this.f117529g);
    }

    @Override // com.google.common.collect.ga
    public ga<E> b4(@b9 E lowerBound, x boundType) {
        return new jb(this.f117527e, this.f117528f.l(v5.d(comparator(), lowerBound, boundType)), this.f117529g);
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f117528f.j() || this.f117528f.k()) {
            p7.g(m());
            return;
        }
        f<E> fVarL = this.f117529g.L();
        while (true) {
            f<E> fVar = this.f117529g;
            if (fVarL == fVar) {
                O(fVar, fVar);
                this.f117527e.b();
                return;
            }
            f<E> fVarL2 = fVarL.L();
            ((f) fVarL).f117543b = 0;
            ((f) fVarL).f117547f = null;
            ((f) fVarL).f117548g = null;
            ((f) fVarL).f117549h = null;
            ((f) fVarL).f117550i = null;
            fVarL = fVarL2;
        }
    }

    @Override // com.google.common.collect.o, com.google.common.collect.ga, com.google.common.collect.ca
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public /* bridge */ /* synthetic */ boolean contains(@fj.a Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public int f0(@fj.a Object element, int occurrences) {
        a3.b(occurrences, "occurrences");
        if (occurrences == 0) {
            return P3(element);
        }
        f<E> fVarC = this.f117527e.c();
        int[] iArr = new int[1];
        try {
            if (this.f117528f.c(element) && fVarC != null) {
                this.f117527e.a(fVarC, fVarC.E(comparator(), element, occurrences, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.o, com.google.common.collect.ga
    @fj.a
    public /* bridge */ /* synthetic */ q8.a firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public int g1(@b9 E element, int count) {
        a3.b(count, "count");
        if (!this.f117528f.c(element)) {
            com.google.common.base.j0.d(count == 0);
            return 0;
        }
        f<E> fVarC = this.f117527e.c();
        if (fVarC == null) {
            if (count > 0) {
                H(element, count);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f117527e.a(fVarC, fVarC.K(comparator(), element, count, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.q8
    public Iterator<E> iterator() {
        return r8.n(this);
    }

    @Override // com.google.common.collect.i
    int k() {
        return com.google.common.primitives.l.A(F(e.f117540b));
    }

    @Override // com.google.common.collect.i
    Iterator<E> l() {
        return r8.h(m());
    }

    @Override // com.google.common.collect.o, com.google.common.collect.ga
    @fj.a
    public /* bridge */ /* synthetic */ q8.a lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.i
    Iterator<q8.a<E>> m() {
        return new b();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.i, com.google.common.collect.q8
    public /* bridge */ /* synthetic */ NavigableSet o() {
        return super.o();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.ga
    @fj.a
    public /* bridge */ /* synthetic */ q8.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.ga
    @fj.a
    public /* bridge */ /* synthetic */ q8.a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.o
    Iterator<q8.a<E>> r() {
        return new c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public int size() {
        return com.google.common.primitives.l.A(F(e.f117539a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.o, com.google.common.collect.ga
    public /* bridge */ /* synthetic */ ga x3(@b9 Object fromElement, x fromBoundType, @b9 Object toElement, x toBoundType) {
        return super.x3(fromElement, fromBoundType, toElement, toBoundType);
    }

    jb(Comparator<? super E> comparator) {
        super(comparator);
        this.f117528f = v5.a(comparator);
        f<E> fVar = new f<>();
        this.f117529g = fVar;
        O(fVar, fVar);
        this.f117527e = new g<>(null);
    }

    private static final class f<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        private final E f117542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f117543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f117544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f117545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f117546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        private f<E> f117547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @fj.a
        private f<E> f117548g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @fj.a
        private f<E> f117549h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @fj.a
        private f<E> f117550i;

        f(@b9 E elem, int elemCount) {
            com.google.common.base.j0.d(elemCount > 0);
            this.f117542a = elem;
            this.f117543b = elemCount;
            this.f117545d = elemCount;
            this.f117544c = 1;
            this.f117546e = 1;
            this.f117547f = null;
            this.f117548g = null;
        }

        private f<E> A() {
            int iR = r();
            if (iR == -2) {
                Objects.requireNonNull(this.f117548g);
                if (this.f117548g.r() > 0) {
                    this.f117548g = this.f117548g.I();
                }
                return H();
            }
            if (iR != 2) {
                C();
                return this;
            }
            Objects.requireNonNull(this.f117547f);
            if (this.f117547f.r() < 0) {
                this.f117547f = this.f117547f.H();
            }
            return I();
        }

        private void B() {
            D();
            C();
        }

        private void C() {
            this.f117546e = Math.max(y(this.f117547f), y(this.f117548g)) + 1;
        }

        private void D() {
            this.f117544c = jb.L(this.f117547f) + 1 + jb.L(this.f117548g);
            this.f117545d = ((long) this.f117543b) + M(this.f117547f) + M(this.f117548g);
        }

        @fj.a
        private f<E> F(f<E> node) {
            f<E> fVar = this.f117548g;
            if (fVar == null) {
                return this.f117547f;
            }
            this.f117548g = fVar.F(node);
            this.f117544c--;
            this.f117545d -= (long) node.f117543b;
            return A();
        }

        @fj.a
        private f<E> G(f<E> node) {
            f<E> fVar = this.f117547f;
            if (fVar == null) {
                return this.f117548g;
            }
            this.f117547f = fVar.G(node);
            this.f117544c--;
            this.f117545d -= (long) node.f117543b;
            return A();
        }

        private f<E> H() {
            com.google.common.base.j0.g0(this.f117548g != null);
            f<E> fVar = this.f117548g;
            this.f117548g = fVar.f117547f;
            fVar.f117547f = this;
            fVar.f117545d = this.f117545d;
            fVar.f117544c = this.f117544c;
            B();
            fVar.C();
            return fVar;
        }

        private f<E> I() {
            com.google.common.base.j0.g0(this.f117547f != null);
            f<E> fVar = this.f117547f;
            this.f117547f = fVar.f117548g;
            fVar.f117548g = this;
            fVar.f117545d = this.f117545d;
            fVar.f117544c = this.f117544c;
            B();
            fVar.C();
            return fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public f<E> L() {
            f<E> fVar = this.f117550i;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        private static long M(@fj.a f<?> node) {
            if (node == null) {
                return 0L;
            }
            return ((f) node).f117545d;
        }

        private f<E> p(@b9 E e10, int count) {
            this.f117547f = new f<>(e10, count);
            jb.P(z(), this.f117547f, this);
            this.f117546e = Math.max(2, this.f117546e);
            this.f117544c++;
            this.f117545d += (long) count;
            return this;
        }

        private f<E> q(@b9 E e10, int count) {
            f<E> fVar = new f<>(e10, count);
            this.f117548g = fVar;
            jb.P(this, fVar, L());
            this.f117546e = Math.max(2, this.f117546e);
            this.f117544c++;
            this.f117545d += (long) count;
            return this;
        }

        private int r() {
            return y(this.f117547f) - y(this.f117548g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @fj.a
        public f<E> s(Comparator<? super E> comparator, @b9 E e10) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                f<E> fVar = this.f117547f;
                if (fVar != null) {
                    return (f) com.google.common.base.b0.a(fVar.s(comparator, e10), this);
                }
            } else if (iCompare != 0) {
                f<E> fVar2 = this.f117548g;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.s(comparator, e10);
            }
            return this;
        }

        @fj.a
        private f<E> u() {
            int i10 = this.f117543b;
            this.f117543b = 0;
            jb.O(z(), L());
            f<E> fVar = this.f117547f;
            if (fVar == null) {
                return this.f117548g;
            }
            f<E> fVar2 = this.f117548g;
            if (fVar2 == null) {
                return fVar;
            }
            if (fVar.f117546e >= fVar2.f117546e) {
                f<E> fVarZ = z();
                fVarZ.f117547f = this.f117547f.F(fVarZ);
                fVarZ.f117548g = this.f117548g;
                fVarZ.f117544c = this.f117544c - 1;
                fVarZ.f117545d = this.f117545d - ((long) i10);
                return fVarZ.A();
            }
            f<E> fVarL = L();
            fVarL.f117548g = this.f117548g.G(fVarL);
            fVarL.f117547f = this.f117547f;
            fVarL.f117544c = this.f117544c - 1;
            fVarL.f117545d = this.f117545d - ((long) i10);
            return fVarL.A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @fj.a
        public f<E> v(Comparator<? super E> comparator, @b9 E e10) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare > 0) {
                f<E> fVar = this.f117548g;
                if (fVar != null) {
                    return (f) com.google.common.base.b0.a(fVar.v(comparator, e10), this);
                }
            } else if (iCompare != 0) {
                f<E> fVar2 = this.f117547f;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.v(comparator, e10);
            }
            return this;
        }

        private static int y(@fj.a f<?> node) {
            if (node == null) {
                return 0;
            }
            return ((f) node).f117546e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public f<E> z() {
            f<E> fVar = this.f117549h;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fj.a
        f<E> E(Comparator<? super E> comparator, @b9 E e10, int count, int[] result) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                f<E> fVar = this.f117547f;
                if (fVar == null) {
                    result[0] = 0;
                    return this;
                }
                this.f117547f = fVar.E(comparator, e10, count, result);
                int i10 = result[0];
                if (i10 > 0) {
                    if (count >= i10) {
                        this.f117544c--;
                        this.f117545d -= (long) i10;
                    } else {
                        this.f117545d -= (long) count;
                    }
                }
                return i10 == 0 ? this : A();
            }
            if (iCompare <= 0) {
                int i11 = this.f117543b;
                result[0] = i11;
                if (count >= i11) {
                    return u();
                }
                this.f117543b = i11 - count;
                this.f117545d -= (long) count;
                return this;
            }
            f<E> fVar2 = this.f117548g;
            if (fVar2 == null) {
                result[0] = 0;
                return this;
            }
            this.f117548g = fVar2.E(comparator, e10, count, result);
            int i12 = result[0];
            if (i12 > 0) {
                if (count >= i12) {
                    this.f117544c--;
                    this.f117545d -= (long) i12;
                } else {
                    this.f117545d -= (long) count;
                }
            }
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fj.a
        f<E> J(Comparator<? super E> comparator, @b9 E e10, int expectedCount, int newCount, int[] result) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                f<E> fVar = this.f117547f;
                if (fVar != null) {
                    this.f117547f = fVar.J(comparator, e10, expectedCount, newCount, result);
                    int i10 = result[0];
                    if (i10 == expectedCount) {
                        if (newCount == 0 && i10 != 0) {
                            this.f117544c--;
                        } else if (newCount > 0 && i10 == 0) {
                            this.f117544c++;
                        }
                        this.f117545d += (long) (newCount - i10);
                    }
                    return A();
                }
                result[0] = 0;
                if (expectedCount == 0 && newCount > 0) {
                    return p(e10, newCount);
                }
            } else if (iCompare > 0) {
                f<E> fVar2 = this.f117548g;
                if (fVar2 != null) {
                    this.f117548g = fVar2.J(comparator, e10, expectedCount, newCount, result);
                    int i11 = result[0];
                    if (i11 == expectedCount) {
                        if (newCount == 0 && i11 != 0) {
                            this.f117544c--;
                        } else if (newCount > 0 && i11 == 0) {
                            this.f117544c++;
                        }
                        this.f117545d += (long) (newCount - i11);
                    }
                    return A();
                }
                result[0] = 0;
                if (expectedCount == 0 && newCount > 0) {
                    return q(e10, newCount);
                }
            } else {
                int i12 = this.f117543b;
                result[0] = i12;
                if (expectedCount == i12) {
                    if (newCount == 0) {
                        return u();
                    }
                    this.f117545d += (long) (newCount - i12);
                    this.f117543b = newCount;
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fj.a
        f<E> K(Comparator<? super E> comparator, @b9 E e10, int count, int[] result) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                f<E> fVar = this.f117547f;
                if (fVar != null) {
                    this.f117547f = fVar.K(comparator, e10, count, result);
                    if (count == 0 && result[0] != 0) {
                        this.f117544c--;
                    } else if (count > 0 && result[0] == 0) {
                        this.f117544c++;
                    }
                    this.f117545d += (long) (count - result[0]);
                    return A();
                }
                result[0] = 0;
                if (count > 0) {
                    return p(e10, count);
                }
            } else {
                if (iCompare <= 0) {
                    int i10 = this.f117543b;
                    result[0] = i10;
                    if (count == 0) {
                        return u();
                    }
                    this.f117545d += (long) (count - i10);
                    this.f117543b = count;
                    return this;
                }
                f<E> fVar2 = this.f117548g;
                if (fVar2 != null) {
                    this.f117548g = fVar2.K(comparator, e10, count, result);
                    if (count == 0 && result[0] != 0) {
                        this.f117544c--;
                    } else if (count > 0 && result[0] == 0) {
                        this.f117544c++;
                    }
                    this.f117545d += (long) (count - result[0]);
                    return A();
                }
                result[0] = 0;
                if (count > 0) {
                    this = q(e10, count);
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        f<E> o(Comparator<? super E> comparator, @b9 E e10, int count, int[] result) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                f<E> fVar = this.f117547f;
                if (fVar == null) {
                    result[0] = 0;
                    return p(e10, count);
                }
                int i10 = fVar.f117546e;
                f<E> fVarO = fVar.o(comparator, e10, count, result);
                this.f117547f = fVarO;
                if (result[0] == 0) {
                    this.f117544c++;
                }
                this.f117545d += (long) count;
                if (fVarO.f117546e != i10) {
                    return A();
                }
            } else {
                if (iCompare <= 0) {
                    int i11 = this.f117543b;
                    result[0] = i11;
                    long j10 = count;
                    com.google.common.base.j0.d(((long) i11) + j10 <= androidx.collection.g3.f12256c);
                    this.f117543b += count;
                    this.f117545d += j10;
                    return this;
                }
                f<E> fVar2 = this.f117548g;
                if (fVar2 == null) {
                    result[0] = 0;
                    return q(e10, count);
                }
                int i12 = fVar2.f117546e;
                f<E> fVarO2 = fVar2.o(comparator, e10, count, result);
                this.f117548g = fVarO2;
                if (result[0] == 0) {
                    this.f117544c++;
                }
                this.f117545d += (long) count;
                if (fVarO2.f117546e != i12) {
                    return A();
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        int t(Comparator<? super E> comparator, @b9 E e10) {
            int iCompare = comparator.compare(e10, x());
            int i10 = 4 | 0;
            if (iCompare < 0) {
                f<E> fVar = this.f117547f;
                if (fVar == null) {
                    return 0;
                }
                return fVar.t(comparator, e10);
            }
            if (iCompare <= 0) {
                return this.f117543b;
            }
            f<E> fVar2 = this.f117548g;
            if (fVar2 == null) {
                return 0;
            }
            return fVar2.t(comparator, e10);
        }

        public String toString() {
            return r8.k(x(), w()).toString();
        }

        int w() {
            return this.f117543b;
        }

        @b9
        E x() {
            return (E) u8.a(this.f117542a);
        }

        f() {
            this.f117542a = null;
            this.f117543b = 1;
        }
    }
}
