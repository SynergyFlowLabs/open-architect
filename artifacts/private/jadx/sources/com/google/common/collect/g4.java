package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.d
@a4
@com.google.common.annotations.b(emulated = true)
public final class g4<E extends Enum<E>> extends i<E> implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.common.annotations.c
    private static final long f117406h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Class<E> f117407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient E[] f117408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int[] f117409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f117410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient long f117411g;

    class a extends g4<E>.c<E> {
        a() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.g4.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public E b(int i10) {
            return (E) g4.this.f117408d[i10];
        }
    }

    class b extends g4<E>.c<q8.a<E>> {

        class a extends r8.f<E> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f117414a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f117415b;

            a(final b this$1, final int val$index) {
                this.f117414a = val$index;
                this.f117415b = this$1;
            }

            @Override // com.google.common.collect.q8.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public E X0() {
                return (E) g4.this.f117408d[this.f117414a];
            }

            @Override // com.google.common.collect.q8.a
            public int getCount() {
                return g4.this.f117409e[this.f117414a];
            }
        }

        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.g4.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public q8.a<E> b(final int index) {
            return new a(this, index);
        }
    }

    abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f117416a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f117417b = -1;

        c() {
        }

        abstract T b(int index);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f117416a < g4.this.f117408d.length) {
                int[] iArr = g4.this.f117409e;
                int i10 = this.f117416a;
                if (iArr[i10] > 0) {
                    return true;
                }
                this.f117416a = i10 + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tB = b(this.f117416a);
            int i10 = this.f117416a;
            this.f117417b = i10;
            this.f117416a = i10 + 1;
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z10;
            if (this.f117417b >= 0) {
                z10 = true;
                boolean z11 = false & true;
            } else {
                z10 = false;
            }
            a3.e(z10);
            if (g4.this.f117409e[this.f117417b] > 0) {
                g4.r(g4.this);
                g4 g4Var = g4.this;
                g4.s(g4Var, g4Var.f117409e[this.f117417b]);
                g4.this.f117409e[this.f117417b] = 0;
            }
            this.f117417b = -1;
        }
    }

    private g4(Class<E> type) {
        this.f117407c = type;
        com.google.common.base.j0.d(type.isEnum());
        E[] enumConstants = type.getEnumConstants();
        this.f117408d = enumConstants;
        this.f117409e = new int[enumConstants.length];
    }

    public static <E extends Enum<E>> g4<E> A(Iterable<E> elements, Class<E> type) {
        g4<E> g4VarV = v(type);
        o7.a(g4VarV, elements);
        return g4VarV;
    }

    private boolean B(@fj.a Object o10) {
        if (o10 instanceof Enum) {
            Enum r10 = (Enum) o10;
            int iOrdinal = r10.ordinal();
            E[] eArr = this.f117408d;
            if (iOrdinal < eArr.length && eArr[iOrdinal] == r10) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ int r(g4 g4Var) {
        int i10 = g4Var.f117410f;
        g4Var.f117410f = i10 - 1;
        return i10;
    }

    @com.google.common.annotations.c
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        Class<E> cls = (Class) object;
        this.f117407c = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.f117408d = enumConstants;
        this.f117409e = new int[enumConstants.length];
        x9.f(this, stream);
    }

    static /* synthetic */ long s(g4 g4Var, long j10) {
        long j11 = g4Var.f117411g - j10;
        g4Var.f117411g = j11;
        return j11;
    }

    private void u(Object element) {
        com.google.common.base.j0.E(element);
        if (B(element)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.f117407c + " but got " + element);
    }

    public static <E extends Enum<E>> g4<E> v(Class<E> type) {
        return new g4<>(type);
    }

    public static <E extends Enum<E>> g4<E> w(Iterable<E> elements) {
        Iterator<E> it = elements.iterator();
        com.google.common.base.j0.e(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        g4<E> g4Var = new g4<>(it.next().getDeclaringClass());
        o7.a(g4Var, elements);
        return g4Var;
    }

    @com.google.common.annotations.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.f117407c);
        x9.k(this, stream);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int g1(E element, int count) {
        u(element);
        a3.b(count, "count");
        int iOrdinal = element.ordinal();
        int[] iArr = this.f117409e;
        int i10 = iArr[iOrdinal];
        iArr[iOrdinal] = count;
        this.f117411g += (long) (count - i10);
        if (i10 == 0 && count > 0) {
            this.f117410f++;
            return i10;
        }
        if (i10 > 0 && count == 0) {
            this.f117410f--;
        }
        return i10;
    }

    @Override // com.google.common.collect.q8
    public int P3(@fj.a Object element) {
        if (element == null || !B(element)) {
            return 0;
        }
        return this.f117409e[((Enum) element).ordinal()];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public /* bridge */ /* synthetic */ boolean Q2(@b9 Object element, int oldCount, int newCount) {
        return super.Q2(element, oldCount, newCount);
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.f117409e, 0);
        this.f117411g = 0L;
        this.f117410f = 0;
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
        if (element == null || !B(element)) {
            return 0;
        }
        Enum r10 = (Enum) element;
        a3.b(occurrences, "occurrences");
        if (occurrences == 0) {
            return P3(element);
        }
        int iOrdinal = r10.ordinal();
        int[] iArr = this.f117409e;
        int i10 = iArr[iOrdinal];
        if (i10 == 0) {
            return 0;
        }
        if (i10 > occurrences) {
            iArr[iOrdinal] = i10 - occurrences;
            this.f117411g -= (long) occurrences;
            return i10;
        }
        iArr[iOrdinal] = 0;
        this.f117410f--;
        this.f117411g -= (long) i10;
        return i10;
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
        return this.f117410f;
    }

    @Override // com.google.common.collect.i
    Iterator<E> l() {
        return new a();
    }

    @Override // com.google.common.collect.i
    Iterator<q8.a<E>> m() {
        return new b();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    public /* bridge */ /* synthetic */ Set o() {
        return super.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public int size() {
        return com.google.common.primitives.l.A(this.f117411g);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int H(E element, int occurrences) {
        u(element);
        a3.b(occurrences, "occurrences");
        if (occurrences == 0) {
            return P3(element);
        }
        int iOrdinal = element.ordinal();
        int i10 = this.f117409e[iOrdinal];
        long j10 = occurrences;
        long j11 = ((long) i10) + j10;
        com.google.common.base.j0.p(j11 <= androidx.collection.g3.f12256c, "too many occurrences: %s", j11);
        this.f117409e[iOrdinal] = (int) j11;
        if (i10 == 0) {
            this.f117410f++;
        }
        this.f117411g += j10;
        return i10;
    }
}
