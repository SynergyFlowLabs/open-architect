package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public final class p7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements Enumeration<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f117928a;

        a(final Iterator val$iterator) {
            this.f117928a = val$iterator;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f117928a.hasNext();
        }

        @Override // java.util.Enumeration
        @b9
        public T nextElement() {
            return (T) this.f117928a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> extends nb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f117929a;

        b(final Iterator val$iterator) {
            this.f117929a = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117929a.hasNext();
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            return (T) this.f117929a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator<T> f117930a = p7.v();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f117931b;

        c(final Iterable val$iterable) {
            this.f117931b = val$iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f117930a.hasNext() && !this.f117931b.iterator().hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            if (!this.f117930a.hasNext()) {
                Iterator<T> it = this.f117931b.iterator();
                this.f117930a = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.f117930a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f117930a.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class d<I> extends nb<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f117932a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator[] f117933b;

        d(final Iterator[] val$elements) {
            this.f117933b = val$elements;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TI; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Iterator next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f117933b[this.f117932a];
            Objects.requireNonNull(it);
            Iterator it2 = it;
            Iterator[] itArr = this.f117933b;
            int i10 = this.f117932a;
            itArr[i10] = null;
            this.f117932a = i10 + 1;
            return it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117932a < this.f117933b.length;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class e<T> extends nb<List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f117934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f117935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f117936c;

        e(final Iterator val$iterator, final int val$size, final boolean val$pad) {
            this.f117934a = val$iterator;
            this.f117935b = val$size;
            this.f117936c = val$pad;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[this.f117935b];
            int i10 = 0;
            while (i10 < this.f117935b && this.f117934a.hasNext()) {
                objArr[i10] = this.f117934a.next();
                i10++;
            }
            for (int i11 = i10; i11 < this.f117935b; i11++) {
                objArr[i11] = null;
            }
            List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (this.f117936c || i10 == this.f117935b) ? listUnmodifiableList : listUnmodifiableList.subList(0, i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117934a.hasNext();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class f<T> extends com.google.common.collect.c<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f117937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.k0 f117938d;

        f(final Iterator val$unfiltered, final com.google.common.base.k0 val$retainIfTrue) {
            this.f117937c = val$unfiltered;
            this.f117938d = val$retainIfTrue;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.c
        @fj.a
        protected T b() {
            while (this.f117937c.hasNext()) {
                T t10 = (T) this.f117937c.next();
                if (this.f117938d.apply(t10)) {
                    return t10;
                }
            }
            return c();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    class g<F, T> extends eb<F, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.t f117939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Iterator backingIterator, final com.google.common.base.t val$function) {
            super(backingIterator);
            this.f117939b = val$function;
        }

        @Override // com.google.common.collect.eb
        @b9
        T b(@b9 F f10) {
            return (T) this.f117939b.apply(f10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class h<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f117940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f117941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f117942c;

        h(final int val$limitSize, final Iterator val$iterator) {
            this.f117941b = val$limitSize;
            this.f117942c = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117940a < this.f117941b && this.f117942c.hasNext();
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f117940a++;
            return (T) this.f117942c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f117942c.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class i<T> extends nb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f117943a;

        i(final Iterator val$iterator) {
            this.f117943a = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117943a.hasNext();
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            T t10 = (T) this.f117943a.next();
            this.f117943a.remove();
            return t10;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class j<T> extends nb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Enumeration f117944a;

        j(final Enumeration val$enumeration) {
            this.f117944a = val$enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117944a.hasMoreElements();
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            return (T) this.f117944a.nextElement();
        }
    }

    private static final class k<T> extends com.google.common.collect.b<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final ob<Object> f117945d = new k(new Object[0], 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T[] f117946c;

        k(T[] array, int position) {
            super(array.length, position);
            this.f117946c = array;
        }

        @Override // com.google.common.collect.b
        @b9
        protected T b(int index) {
            return this.f117946c[index];
        }
    }

    private static class l<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        private Iterator<? extends T> f117947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<? extends T> f117948b = p7.t();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        private Iterator<? extends Iterator<? extends T>> f117949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        private Deque<Iterator<? extends Iterator<? extends T>>> f117950d;

        l(Iterator<? extends Iterator<? extends T>> metaIterator) {
            this.f117949c = (Iterator) com.google.common.base.j0.E(metaIterator);
        }

        @fj.a
        private Iterator<? extends Iterator<? extends T>> b() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f117949c;
                if (it != null && it.hasNext()) {
                    return this.f117949c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f117950d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f117949c = this.f117950d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) com.google.common.base.j0.E(this.f117948b)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itB = b();
                this.f117949c = itB;
                if (itB == null) {
                    return false;
                }
                Iterator<? extends T> next = itB.next();
                this.f117948b = next;
                if (next instanceof l) {
                    l lVar = (l) next;
                    this.f117948b = lVar.f117948b;
                    if (this.f117950d == null) {
                        this.f117950d = new ArrayDeque();
                    }
                    this.f117950d.addFirst(this.f117949c);
                    if (lVar.f117950d != null) {
                        while (!lVar.f117950d.isEmpty()) {
                            this.f117950d.addFirst(lVar.f117950d.removeLast());
                        }
                    }
                    this.f117949c = lVar.f117949c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f117948b;
            this.f117947a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f117947a;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f117947a = null;
        }
    }

    private enum m implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            a3.e(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class n<T> extends nb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Queue<c9<T>> f117953a;

        public n(Iterable<? extends Iterator<? extends T>> iterators, final Comparator<? super T> itemComparator) {
            this.f117953a = new PriorityQueue(2, new Comparator() { // from class: com.google.common.collect.q7
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return itemComparator.compare(((c9) obj).peek(), ((c9) obj2).peek());
                }
            });
            for (Iterator<? extends T> it : iterators) {
                if (it.hasNext()) {
                    this.f117953a.add(p7.S(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f117953a.isEmpty();
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            c9<T> c9VarRemove = this.f117953a.remove();
            T next = c9VarRemove.next();
            if (c9VarRemove.hasNext()) {
                this.f117953a.add(c9VarRemove);
            }
            return next;
        }
    }

    private static class o<E> implements c9<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<? extends E> f117954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f117955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        private E f117956c;

        public o(Iterator<? extends E> iterator) {
            this.f117954a = (Iterator) com.google.common.base.j0.E(iterator);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f117955b && !this.f117954a.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.c9, java.util.Iterator
        @b9
        public E next() {
            if (!this.f117955b) {
                return this.f117954a.next();
            }
            E e10 = (E) u8.a(this.f117956c);
            this.f117955b = false;
            this.f117956c = null;
            return e10;
        }

        @Override // com.google.common.collect.c9
        @b9
        public E peek() {
            if (!this.f117955b) {
                this.f117956c = this.f117954a.next();
                this.f117955b = true;
            }
            return (E) u8.a(this.f117956c);
        }

        @Override // com.google.common.collect.c9, java.util.Iterator
        public void remove() {
            com.google.common.base.j0.h0(!this.f117955b, "Can't remove after you've peeked at next");
            this.f117954a.remove();
        }
    }

    private static final class p<T> extends nb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f117957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f117958b;

        p(T value) {
            this.f117957a = value;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f117958b;
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            if (this.f117958b) {
                throw new NoSuchElementException();
            }
            this.f117958b = true;
            return this.f117957a;
        }
    }

    private p7() {
    }

    @SafeVarargs
    public static <T> nb<T> A(T... array) {
        return B(array, 0);
    }

    static <T> ob<T> B(T[] array, int position) {
        if (array.length != 0) {
            return new k(array, position);
        }
        com.google.common.base.j0.d0(position, array.length);
        return u();
    }

    public static <T> nb<T> C(Enumeration<T> enumeration) {
        com.google.common.base.j0.E(enumeration);
        return new j(enumeration);
    }

    public static int D(Iterator<?> iterator, @fj.a Object element) {
        int i10 = 0;
        while (p(iterator, element)) {
            i10++;
        }
        return i10;
    }

    @b9
    public static <T> T E(Iterator<T> iterator, int position) {
        f(position);
        int iB = b(iterator, position);
        if (iterator.hasNext()) {
            return iterator.next();
        }
        throw new IndexOutOfBoundsException("position (" + position + ") must be less than the number of elements that remained (" + iB + ")");
    }

    @b9
    public static <T> T F(Iterator<? extends T> it, int i10, @b9 T t10) {
        f(i10);
        b(it, i10);
        return (T) I(it, t10);
    }

    @b9
    public static <T> T G(Iterator<T> iterator) {
        T next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }

    @b9
    public static <T> T H(Iterator<? extends T> it, @b9 T t10) {
        return it.hasNext() ? (T) G(it) : t10;
    }

    @b9
    public static <T> T I(Iterator<? extends T> iterator, @b9 T defaultValue) {
        return iterator.hasNext() ? iterator.next() : defaultValue;
    }

    @b9
    public static <T> T J(Iterator<T> iterator) {
        T next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && iterator.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(iterator.next());
        }
        if (iterator.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append(kotlin.text.b0.f313281f);
        throw new IllegalArgumentException(sb2.toString());
    }

    @b9
    public static <T> T K(Iterator<? extends T> it, @b9 T t10) {
        return it.hasNext() ? (T) J(it) : t10;
    }

    public static <T> int L(Iterator<T> iterator, com.google.common.base.k0<? super T> predicate) {
        com.google.common.base.j0.F(predicate, "predicate");
        int i10 = 0;
        while (iterator.hasNext()) {
            if (predicate.apply(iterator.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> Iterator<T> M(Iterator<T> iterator, int limitSize) {
        com.google.common.base.j0.E(iterator);
        com.google.common.base.j0.e(limitSize >= 0, "limit is negative");
        return new h(limitSize, iterator);
    }

    public static <T> nb<T> N(Iterable<? extends Iterator<? extends T>> iterators, Comparator<? super T> comparator) {
        com.google.common.base.j0.F(iterators, "iterators");
        com.google.common.base.j0.F(comparator, "comparator");
        return new n(iterators, comparator);
    }

    public static <T> nb<List<T>> O(Iterator<T> iterator, int size) {
        return Q(iterator, size, true);
    }

    public static <T> nb<List<T>> P(Iterator<T> iterator, int size) {
        return Q(iterator, size, false);
    }

    private static <T> nb<List<T>> Q(Iterator<T> iterator, int size, boolean pad) {
        com.google.common.base.j0.E(iterator);
        com.google.common.base.j0.d(size > 0);
        return new e(iterator, size, pad);
    }

    @Deprecated
    public static <T> c9<T> R(c9<T> iterator) {
        return (c9) com.google.common.base.j0.E(iterator);
    }

    public static <T> c9<T> S(Iterator<? extends T> iterator) {
        return iterator instanceof o ? (o) iterator : new o(iterator);
    }

    @fj.a
    static <T> T T(Iterator<T> iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        T next = iterator.next();
        iterator.remove();
        return next;
    }

    @z7.a
    public static boolean U(Iterator<?> removeFrom, Collection<?> elementsToRemove) {
        com.google.common.base.j0.E(elementsToRemove);
        boolean z10 = false;
        while (removeFrom.hasNext()) {
            if (elementsToRemove.contains(removeFrom.next())) {
                removeFrom.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @z7.a
    public static <T> boolean V(Iterator<T> removeFrom, com.google.common.base.k0<? super T> predicate) {
        com.google.common.base.j0.E(predicate);
        boolean z10 = false;
        while (removeFrom.hasNext()) {
            if (predicate.apply(removeFrom.next())) {
                removeFrom.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @z7.a
    public static boolean W(Iterator<?> removeFrom, Collection<?> elementsToRetain) {
        com.google.common.base.j0.E(elementsToRetain);
        boolean z10 = false;
        while (removeFrom.hasNext()) {
            if (!elementsToRetain.contains(removeFrom.next())) {
                removeFrom.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> nb<T> X(@b9 T value) {
        return new p(value);
    }

    public static int Y(Iterator<?> iterator) {
        long j10 = 0;
        while (iterator.hasNext()) {
            iterator.next();
            j10++;
        }
        return com.google.common.primitives.l.A(j10);
    }

    @com.google.common.annotations.c
    public static <T> T[] Z(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) o7.Q(x7.s(it), cls);
    }

    @z7.a
    public static <T> boolean a(Collection<T> addTo, Iterator<? extends T> iterator) {
        com.google.common.base.j0.E(addTo);
        com.google.common.base.j0.E(iterator);
        boolean zAdd = false;
        while (iterator.hasNext()) {
            zAdd |= addTo.add(iterator.next());
        }
        return zAdd;
    }

    public static String a0(Iterator<?> iterator) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z10 = true;
        while (iterator.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(iterator.next());
            z10 = false;
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @z7.a
    public static int b(Iterator<?> iterator, int numberToAdvance) {
        com.google.common.base.j0.E(iterator);
        int i10 = 0;
        com.google.common.base.j0.e(numberToAdvance >= 0, "numberToAdvance must be nonnegative");
        while (i10 < numberToAdvance && iterator.hasNext()) {
            iterator.next();
            i10++;
        }
        return i10;
    }

    public static <F, T> Iterator<T> b0(Iterator<F> fromIterator, com.google.common.base.t<? super F, ? extends T> function) {
        com.google.common.base.j0.E(function);
        return new g(fromIterator, function);
    }

    public static <T> boolean c(Iterator<T> iterator, com.google.common.base.k0<? super T> predicate) {
        com.google.common.base.j0.E(predicate);
        while (iterator.hasNext()) {
            if (!predicate.apply(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> com.google.common.base.e0<T> c0(Iterator<T> iterator, com.google.common.base.k0<? super T> predicate) {
        com.google.common.base.j0.E(iterator);
        com.google.common.base.j0.E(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return com.google.common.base.e0.f(next);
            }
        }
        return com.google.common.base.e0.a();
    }

    public static <T> boolean d(Iterator<T> iterator, com.google.common.base.k0<? super T> predicate) {
        return L(iterator, predicate) != -1;
    }

    @Deprecated
    public static <T> nb<T> d0(nb<T> iterator) {
        return (nb) com.google.common.base.j0.E(iterator);
    }

    public static <T> Enumeration<T> e(Iterator<T> iterator) {
        com.google.common.base.j0.E(iterator);
        return new a(iterator);
    }

    public static <T> nb<T> e0(Iterator<? extends T> iterator) {
        com.google.common.base.j0.E(iterator);
        return iterator instanceof nb ? (nb) iterator : new b(iterator);
    }

    static void f(int position) {
        if (position >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + position + ") must not be negative");
    }

    static void g(Iterator<?> iterator) {
        com.google.common.base.j0.E(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static <T> Iterator<T> h(Iterator<? extends Iterator<? extends T>> inputs) {
        return new l(inputs);
    }

    public static <T> Iterator<T> i(Iterator<? extends T> a10, Iterator<? extends T> b10) {
        com.google.common.base.j0.E(a10);
        com.google.common.base.j0.E(b10);
        return h(n(a10, b10));
    }

    public static <T> Iterator<T> j(Iterator<? extends T> a10, Iterator<? extends T> b10, Iterator<? extends T> c10) {
        com.google.common.base.j0.E(a10);
        com.google.common.base.j0.E(b10);
        com.google.common.base.j0.E(c10);
        int i10 = 1 << 2;
        return h(n(a10, b10, c10));
    }

    public static <T> Iterator<T> k(Iterator<? extends T> a10, Iterator<? extends T> b10, Iterator<? extends T> c10, Iterator<? extends T> d10) {
        com.google.common.base.j0.E(a10);
        com.google.common.base.j0.E(b10);
        com.google.common.base.j0.E(c10);
        com.google.common.base.j0.E(d10);
        return h(n(a10, b10, c10, d10));
    }

    @SafeVarargs
    public static <T> Iterator<T> l(Iterator<? extends T>... inputs) {
        return m((Iterator[]) Arrays.copyOf(inputs, inputs.length));
    }

    static <T> Iterator<T> m(Iterator<? extends T>... inputs) {
        for (Iterator it : (Iterator[]) com.google.common.base.j0.E(inputs)) {
            com.google.common.base.j0.E(it);
        }
        return h(n(inputs));
    }

    private static <I extends Iterator<?>> Iterator<I> n(I... elements) {
        return new d(elements);
    }

    public static <T> Iterator<T> o(Iterator<T> iterator) {
        com.google.common.base.j0.E(iterator);
        return new i(iterator);
    }

    public static boolean p(Iterator<?> iterator, @fj.a Object element) {
        if (element == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
        } else {
            while (iterator.hasNext()) {
                if (element.equals(iterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> Iterator<T> q(Iterable<T> iterable) {
        com.google.common.base.j0.E(iterable);
        return new c(iterable);
    }

    @SafeVarargs
    public static <T> Iterator<T> r(T... elements) {
        return q(x7.t(elements));
    }

    public static boolean s(Iterator<?> iterator1, Iterator<?> iterator2) {
        while (iterator1.hasNext()) {
            if (!iterator2.hasNext() || !com.google.common.base.d0.a(iterator1.next(), iterator2.next())) {
                return false;
            }
        }
        return !iterator2.hasNext();
    }

    static <T> nb<T> t() {
        return u();
    }

    static <T> ob<T> u() {
        return (ob<T>) k.f117945d;
    }

    static <T> Iterator<T> v() {
        return m.INSTANCE;
    }

    public static <T> nb<T> w(Iterator<T> unfiltered, com.google.common.base.k0<? super T> retainIfTrue) {
        com.google.common.base.j0.E(unfiltered);
        com.google.common.base.j0.E(retainIfTrue);
        return new f(unfiltered, retainIfTrue);
    }

    @com.google.common.annotations.c
    public static <T> nb<T> x(Iterator<?> unfiltered, Class<T> desiredType) {
        return w(unfiltered, com.google.common.base.l0.o(desiredType));
    }

    @b9
    public static <T> T y(Iterator<T> iterator, com.google.common.base.k0<? super T> predicate) {
        com.google.common.base.j0.E(iterator);
        com.google.common.base.j0.E(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @fj.a
    public static <T> T z(Iterator<? extends T> it, com.google.common.base.k0<? super T> k0Var, @fj.a T t10) {
        com.google.common.base.j0.E(it);
        com.google.common.base.j0.E(k0Var);
        while (it.hasNext()) {
            T next = it.next();
            if (k0Var.apply(next)) {
                return next;
            }
        }
        return t10;
    }
}
