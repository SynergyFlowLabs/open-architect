package androidx.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1548:1\n903#1,5:1549\n903#1,5:1554\n903#1,5:1559\n903#1,5:1564\n903#1,5:1572\n903#1,5:1577\n903#1,5:1582\n919#1,2:1604\n903#1,5:1613\n903#1,5:1618\n919#1,2:1624\n919#1,2:1628\n629#1:1631\n924#1,2:1634\n924#1,2:1641\n924#1,2:1661\n924#1,2:1670\n924#1,2:1673\n924#1,2:1677\n1864#2,3:1569\n1855#2:1623\n1856#2:1626\n1855#2:1672\n1856#2:1675\n231#3,3:1587\n200#3,7:1590\n211#3,3:1598\n214#3,2:1602\n217#3,6:1606\n234#3:1612\n231#3,3:1644\n200#3,7:1647\n211#3,3:1655\n214#3,2:1659\n217#3,6:1663\n234#3:1669\n1399#4:1597\n1270#4:1601\n1399#4:1654\n1270#4:1658\n1313#5:1627\n1314#5:1630\n1313#5:1676\n1314#5:1679\n84#6:1632\n287#6,4:1637\n292#6:1643\n80#6:1680\n80#6:1681\n80#6:1682\n80#6:1683\n80#6:1684\n80#6:1685\n13309#7:1633\n13310#7:1636\n1#8:1686\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n633#1:1549,5\n649#1:1554,5\n678#1:1559,5\n708#1:1564,5\n738#1:1572,5\n825#1:1577,5\n839#1:1582,5\n840#1:1604,2\n846#1:1613,5\n856#1:1618,5\n866#1:1624,2\n871#1:1628,2\n892#1:1631\n1020#1:1634,2\n1025#1:1641,2\n1030#1:1661,2\n1036#1:1670,2\n1042#1:1673,2\n1047#1:1677,2\n718#1:1569,3\n866#1:1623\n866#1:1626\n1042#1:1672\n1042#1:1675\n840#1:1587,3\n840#1:1590,7\n840#1:1598,3\n840#1:1602,2\n840#1:1606,6\n840#1:1612\n1030#1:1644,3\n1030#1:1647,7\n1030#1:1655,3\n1030#1:1659,2\n1030#1:1663,6\n1030#1:1669\n840#1:1597\n840#1:1601\n1030#1:1654\n1030#1:1658\n871#1:1627\n871#1:1630\n1047#1:1676\n1047#1:1679\n946#1:1632\n1025#1:1637,4\n1025#1:1643\n1061#1:1680\n1113#1:1681\n1130#1:1682\n1147#1:1683\n1164#1:1684\n1181#1:1685\n1020#1:1633\n1020#1:1636\n*E\n"})
public final class g2<E> extends s2<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private b<E> f12247c;

    private static final class a<T> implements ListIterator<T>, qj.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<T> f12248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12249b;

        public a(@NotNull List<T> list, int i10) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f12248a = list;
            this.f12249b = i10 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            List<T> list = this.f12248a;
            int i10 = this.f12249b + 1;
            this.f12249b = i10;
            list.add(i10, t10);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f12249b < this.f12248a.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f12249b >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f12248a;
            int i10 = this.f12249b + 1;
            this.f12249b = i10;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f12249b + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.f12248a;
            int i10 = this.f12249b;
            this.f12249b = i10 - 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f12249b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f12248a.remove(this.f12249b);
            this.f12249b--;
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.f12248a.set(this.f12249b, t10);
        }
    }

    private static final class b<T> implements List<T>, qj.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final g2<T> f12250a;

        public b(@NotNull g2<T> objectList) {
            Intrinsics.checkNotNullParameter(objectList, "objectList");
            this.f12250a = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            return this.f12250a.a0(t10);
        }

        @Override // java.util.List
        public boolean addAll(int i10, @NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f12250a.c0(i10, elements);
        }

        public int c() {
            return this.f12250a.C();
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f12250a.l0();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f12250a.d(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f12250a.f(elements);
        }

        public T d(int i10) {
            t2.d(this, i10);
            return this.f12250a.J0(i10);
        }

        @Override // java.util.List
        public T get(int i10) {
            t2.d(this, i10);
            return this.f12250a.y(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f12250a.E(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f12250a.H();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f12250a.T(obj);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return d(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f12250a.F0(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f12250a.P0(elements);
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            t2.d(this, i10);
            return this.f12250a.S0(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int i10, int i11) {
            t2.e(this, i10, i11);
            return new c(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.v.a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f12250a.Z(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f12250a.g0(elements);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f12250a.C0(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) kotlin.jvm.internal.v.b(this, array);
        }
    }

    @SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1548:1\n1855#2,2:1549\n1855#2,2:1551\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1345#1:1549,2\n1427#1:1551,2\n*E\n"})
    private static final class c<T> implements List<T>, qj.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<T> f12251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12253c;

        public c(@NotNull List<T> list, int i10, int i11) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f12251a = list;
            this.f12252b = i10;
            this.f12253c = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            List<T> list = this.f12251a;
            int i10 = this.f12253c;
            this.f12253c = i10 + 1;
            list.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, @NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f12251a.addAll(i10 + this.f12252b, elements);
            this.f12253c += elements.size();
            return elements.size() > 0;
        }

        public int c() {
            return this.f12253c - this.f12252b;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f12253c - 1;
            int i11 = this.f12252b;
            if (i11 <= i10) {
                while (true) {
                    this.f12251a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f12253c = this.f12252b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f12253c;
            for (int i11 = this.f12252b; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f12251a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public T d(int i10) {
            t2.d(this, i10);
            T tRemove = this.f12251a.remove(i10 + this.f12252b);
            this.f12253c--;
            return tRemove;
        }

        @Override // java.util.List
        public T get(int i10) {
            t2.d(this, i10);
            return this.f12251a.get(i10 + this.f12252b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f12253c;
            for (int i11 = this.f12252b; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f12251a.get(i11), obj)) {
                    return i11 - this.f12252b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f12253c == this.f12252b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f12253c - 1;
            int i11 = this.f12252b;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.f12251a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f12252b;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return d(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i10 = this.f12253c;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f12253c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i10 = this.f12253c;
            int i11 = i10 - 1;
            int i12 = this.f12252b;
            if (i12 <= i11) {
                while (true) {
                    if (!elements.contains(this.f12251a.get(i11))) {
                        this.f12251a.remove(i11);
                        this.f12253c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f12253c;
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            t2.d(this, i10);
            return this.f12251a.set(i10 + this.f12252b, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int i10, int i11) {
            t2.e(this, i10, i11);
            return new c(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.v.a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f12251a.add(i10 + this.f12252b, t10);
            this.f12253c++;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f12253c;
            for (int i11 = this.f12252b; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f12251a.get(i11), obj)) {
                    this.f12251a.remove(i11);
                    this.f12253c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) kotlin.jvm.internal.v.b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f12251a.addAll(this.f12253c, elements);
            this.f12253c += elements.size();
            return elements.size() > 0;
        }
    }

    public g2() {
        this(0, 1, null);
    }

    private final void T0(int i10) {
        t.f.e("Index " + i10 + " must be in 0.." + this.f12450b);
    }

    public static /* synthetic */ void V0(g2 g2Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = g2Var.f12450b;
        }
        g2Var.U0(i10);
    }

    public final void A0(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            a0(it.next());
        }
    }

    public final void B0(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        int length = this.f12450b + elements.length;
        Object[] objArr = this.f12449a;
        if (objArr.length < length) {
            M0(length, objArr);
        }
        ArraysKt.copyInto$default(elements, this.f12449a, this.f12450b, 0, 0, 12, (Object) null);
        this.f12450b += elements.length;
    }

    public final boolean C0(E e10) {
        int iE = E(e10);
        if (iE < 0) {
            return false;
        }
        J0(iE);
        return true;
    }

    public final boolean D0(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        o0(elements);
        return i10 != this.f12450b;
    }

    public final boolean E0(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        p0(elements);
        return i10 != this.f12450b;
    }

    public final boolean F0(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        q0(elements);
        return i10 != this.f12450b;
    }

    public final boolean G0(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        s0(elements);
        return i10 != this.f12450b;
    }

    public final boolean H0(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        t0(elements);
        return i10 != this.f12450b;
    }

    public final boolean I0(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        for (E e10 : elements) {
            C0(e10);
        }
        return i10 != this.f12450b;
    }

    public final E J0(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12450b) {
            Y(i10);
        }
        Object[] objArr = this.f12449a;
        E e10 = (E) objArr[i10];
        int i11 = this.f12450b;
        if (i10 != i11 - 1) {
            ArraysKt.copyInto(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this.f12450b - 1;
        this.f12450b = i12;
        objArr[i12] = null;
        return e10;
    }

    public final void K0(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = this.f12450b;
        Object[] objArr = this.f12449a;
        int i11 = 0;
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, i10);
        int iL = intRangeW1.l();
        int iM = intRangeW1.m();
        if (iL <= iM) {
            while (true) {
                objArr[iL - i11] = objArr[iL];
                if (predicate.invoke(objArr[iL]).booleanValue()) {
                    i11++;
                }
                if (iL == iM) {
                    break;
                } else {
                    iL++;
                }
            }
        }
        ArraysKt.fill(objArr, (Object) null, i10 - i11, i10);
        this.f12450b -= i11;
    }

    public final void L0(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f12450b) || i11 < 0 || i11 > i12) {
            t.f.e("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f12450b);
        }
        if (i11 < i10) {
            t.f.c("Start (" + i10 + ") is more than end (" + i11 + ')');
        }
        if (i11 != i10) {
            int i13 = this.f12450b;
            if (i11 < i13) {
                Object[] objArr = this.f12449a;
                ArraysKt.copyInto(objArr, objArr, i10, i11, i13);
            }
            int i14 = this.f12450b;
            int i15 = i14 - (i11 - i10);
            ArraysKt.fill(this.f12449a, (Object) null, i15, i14);
            this.f12450b = i15;
        }
    }

    @kotlin.a1
    public final void M0(int i10, @NotNull Object[] oldContent) {
        Intrinsics.checkNotNullParameter(oldContent, "oldContent");
        int length = oldContent.length;
        this.f12449a = ArraysKt.copyInto(oldContent, new Object[Math.max(i10, (length * 3) / 2)], 0, 0, length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean N0(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        Object[] objArr = this.f12449a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.d(objArr[i11])) {
                J0(i11);
            }
        }
        return i10 != this.f12450b;
    }

    public final boolean O0(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        Object[] objArr = this.f12449a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!CollectionsKt.contains(elements, objArr[i11])) {
                J0(i11);
            }
        }
        return i10 != this.f12450b;
    }

    public final boolean P0(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        Object[] objArr = this.f12449a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(objArr[i11])) {
                J0(i11);
            }
        }
        return i10 != this.f12450b;
    }

    public final boolean Q0(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        Object[] objArr = this.f12449a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!kotlin.sequences.o.f0(elements, objArr[i11])) {
                J0(i11);
            }
        }
        return i10 != this.f12450b;
    }

    public final boolean R0(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        Object[] objArr = this.f12449a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (ArraysKt.indexOf(elements, objArr[i11]) < 0) {
                J0(i11);
            }
        }
        return i10 != this.f12450b;
    }

    public final E S0(@androidx.annotation.g0(from = 0) int i10, E e10) {
        if (i10 < 0 || i10 >= this.f12450b) {
            Y(i10);
        }
        Object[] objArr = this.f12449a;
        E e11 = (E) objArr[i10];
        objArr[i10] = e10;
        return e11;
    }

    public final void U0(int i10) {
        int iMax = Math.max(i10, this.f12450b);
        Object[] objArr = this.f12449a;
        if (objArr.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, iMax);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f12449a = objArrCopyOf;
        }
    }

    public final void Z(@androidx.annotation.g0(from = 0) int i10, E e10) {
        if (i10 < 0 || i10 > this.f12450b) {
            T0(i10);
        }
        int i11 = this.f12450b + 1;
        Object[] objArr = this.f12449a;
        if (objArr.length < i11) {
            M0(i11, objArr);
        }
        Object[] objArr2 = this.f12449a;
        int i12 = this.f12450b;
        if (i10 != i12) {
            ArraysKt.copyInto(objArr2, objArr2, i10 + 1, i10, i12);
        }
        objArr2[i10] = e10;
        this.f12450b++;
    }

    public final boolean a0(E e10) {
        int i10 = this.f12450b + 1;
        Object[] objArr = this.f12449a;
        if (objArr.length < i10) {
            M0(i10, objArr);
        }
        Object[] objArr2 = this.f12449a;
        int i11 = this.f12450b;
        objArr2[i11] = e10;
        this.f12450b = i11 + 1;
        return true;
    }

    public final boolean b0(@androidx.annotation.g0(from = 0) int i10, @NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12450b) {
            T0(i10);
        }
        if (elements.H()) {
            return false;
        }
        int i11 = this.f12450b + elements.f12450b;
        Object[] objArr = this.f12449a;
        if (objArr.length < i11) {
            M0(i11, objArr);
        }
        Object[] objArr2 = this.f12449a;
        int i12 = this.f12450b;
        if (i10 != i12) {
            ArraysKt.copyInto(objArr2, objArr2, elements.f12450b + i10, i10, i12);
        }
        ArraysKt.copyInto(elements.f12449a, objArr2, i10, 0, elements.f12450b);
        this.f12450b += elements.f12450b;
        return true;
    }

    @Override // androidx.collection.s2
    @NotNull
    public List<E> c() {
        return k0();
    }

    public final boolean c0(@androidx.annotation.g0(from = 0) int i10, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12450b) {
            T0(i10);
        }
        int i11 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = this.f12450b + elements.size();
        Object[] objArr = this.f12449a;
        if (objArr.length < size) {
            M0(size, objArr);
        }
        Object[] objArr2 = this.f12449a;
        if (i10 != this.f12450b) {
            ArraysKt.copyInto(objArr2, objArr2, elements.size() + i10, i10, this.f12450b);
        }
        for (Object obj : elements) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            objArr2[i11 + i10] = obj;
            i11 = i12;
        }
        this.f12450b += elements.size();
        return true;
    }

    public final boolean d0(@androidx.annotation.g0(from = 0) int i10, @NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12450b) {
            T0(i10);
        }
        if (elements.length == 0) {
            return false;
        }
        int length = this.f12450b + elements.length;
        Object[] objArr = this.f12449a;
        if (objArr.length < length) {
            M0(length, objArr);
        }
        Object[] objArr2 = this.f12449a;
        int i11 = this.f12450b;
        if (i10 != i11) {
            ArraysKt.copyInto(objArr2, objArr2, elements.length + i10, i10, i11);
        }
        ArraysKt.copyInto$default(elements, objArr2, i10, 0, 0, 12, (Object) null);
        this.f12450b += elements.length;
        return true;
    }

    public final boolean e0(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        v0(elements);
        return i10 != this.f12450b;
    }

    public final boolean f0(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        w0(elements);
        return i10 != this.f12450b;
    }

    public final boolean g0(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        x0(elements);
        return i10 != this.f12450b;
    }

    public final boolean h0(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        z0(elements);
        return i10 != this.f12450b;
    }

    public final boolean i0(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        A0(elements);
        return i10 != this.f12450b;
    }

    public final boolean j0(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12450b;
        B0(elements);
        return i10 != this.f12450b;
    }

    @NotNull
    public final List<E> k0() {
        b<E> bVar = this.f12247c;
        if (bVar != null) {
            return bVar;
        }
        b<E> bVar2 = new b<>(this);
        this.f12247c = bVar2;
        return bVar2;
    }

    public final void l0() {
        ArraysKt.fill(this.f12449a, (Object) null, 0, this.f12450b);
        this.f12450b = 0;
    }

    public final void m0(int i10) {
        Object[] objArr = this.f12449a;
        if (objArr.length < i10) {
            M0(i10, objArr);
        }
    }

    public final int n0() {
        return this.f12449a.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12449a;
        int i10 = elements.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            C0(objArr[i11]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[LOOP:0: B:5:0x0014->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[EDGE_INSN: B:20:0x0057->B:17:0x0057 BREAK  A[LOOP:0: B:5:0x0014->B:16:0x0053], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12171b;
        long[] jArr = elements.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 5 << 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            C0(objArr[(i11 << 3) + i13]);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
    }

    public final void q0(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            C0(it.next());
        }
    }

    public final void r0(E e10) {
        C0(e10);
    }

    public final void s0(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0(elements.get(i10));
        }
    }

    public final void t0(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            C0(it.next());
        }
    }

    public final void u0(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e10 : elements) {
            C0(e10);
        }
    }

    public final void v0(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.H()) {
            return;
        }
        int i10 = this.f12450b + elements.f12450b;
        Object[] objArr = this.f12449a;
        if (objArr.length < i10) {
            M0(i10, objArr);
        }
        ArraysKt.copyInto(elements.f12449a, this.f12449a, this.f12450b, 0, elements.f12450b);
        this.f12450b += elements.f12450b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.r()) {
            return;
        }
        int iQ = this.f12450b + elements.q();
        Object[] objArr = this.f12449a;
        if (objArr.length < iQ) {
            M0(iQ, objArr);
        }
        Object[] objArr2 = elements.f12171b;
        long[] jArr = elements.f12170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        a0(objArr2[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void x0(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            a0(it.next());
        }
    }

    public final void y0(E e10) {
        a0(e10);
    }

    public final void z0(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this.f12450b;
        int size = elements.size() + i10;
        Object[] objArr = this.f12449a;
        if (objArr.length < size) {
            M0(size, objArr);
        }
        Object[] objArr2 = this.f12449a;
        int size2 = elements.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = elements.get(i11);
        }
        this.f12450b += elements.size();
    }

    public g2(int i10) {
        super(i10, null);
    }

    public /* synthetic */ g2(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
