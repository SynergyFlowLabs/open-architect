package androidx.compose.material3.carousel;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nKeylineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,569:1\n360#2,7:570\n360#2,7:577\n388#2,7:584\n360#2,7:591\n388#2,7:598\n295#2,2:605\n295#2,2:607\n117#3,2:609\n34#3,6:611\n119#3:617\n70#3,6:618\n34#3,6:624\n*S KotlinDebug\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineList\n*L\n72#1:570,7\n82#1:577,7\n96#1:584,7\n110#1:591,7\n128#1:598,7\n183#1:605,2\n197#1:607,2\n220#1:609,2\n220#1:611,6\n220#1:617\n228#1:618,6\n235#1:624,6\n*E\n"})
public final class p0 implements List<o0>, qj.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f26644h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f26645i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final p0 f26646j = new p0(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ List<o0> f26647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f26651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f26653g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final p0 a() {
            return p0.f26646j;
        }

        private a() {
        }
    }

    public p0(@NotNull List<o0> list) {
        int iNextIndex;
        int iNextIndex2;
        this.f26647a = list;
        Iterator<o0> it = iterator();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().p()) {
                break;
            } else {
                i11++;
            }
        }
        this.f26648b = i11;
        Iterator<o0> it2 = iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            } else if (!it2.next().n()) {
                break;
            } else {
                i12++;
            }
        }
        this.f26649c = i12;
        ListIterator<o0> listIterator = listIterator(size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            } else if (!listIterator.previous().n()) {
                iNextIndex2 = listIterator.nextIndex();
                break;
            }
        }
        this.f26650d = iNextIndex2;
        Iterator<o0> it3 = iterator();
        while (true) {
            if (!it3.hasNext()) {
                i10 = -1;
                break;
            } else if (it3.next().o()) {
                break;
            } else {
                i10++;
            }
        }
        this.f26651e = i10;
        ListIterator<o0> listIterator2 = listIterator(size());
        while (listIterator2.hasPrevious()) {
            if (listIterator2.previous().o()) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        this.f26652f = iNextIndex;
        this.f26653g = (iNextIndex - this.f26651e) + 1;
    }

    @NotNull
    public final o0 A(float f10) {
        o0 o0Var;
        int size = size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                o0Var = null;
                break;
            }
            o0Var = get(i10);
            if (o0Var.m() >= f10) {
                break;
            }
            i10++;
        }
        o0 o0Var2 = o0Var;
        return o0Var2 == null ? (o0) CollectionsKt.last((List) this) : o0Var2;
    }

    @NotNull
    public final o0 B(float f10) {
        int size = size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                o0 o0Var = get(size);
                if (o0Var.m() < f10) {
                    return o0Var;
                }
                if (i10 >= 0) {
                    size = i10;
                }
            }
        }
        return (o0) CollectionsKt.first((List) this);
    }

    @NotNull
    public final o0 C() {
        o0 o0Var = (o0) CollectionsKt.getOrNull(this, this.f26652f);
        if (o0Var != null) {
            return o0Var;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int D() {
        return this.f26652f;
    }

    @NotNull
    public final o0 F() {
        return get(this.f26650d);
    }

    public final int G() {
        return this.f26650d;
    }

    @NotNull
    public final o0 J() {
        return get(this.f26648b);
    }

    public final int K() {
        return this.f26648b;
    }

    public int L() {
        return this.f26647a.size();
    }

    public int M(@NotNull o0 o0Var) {
        return this.f26647a.indexOf(o0Var);
    }

    public final boolean N() {
        return s().k() - (s().l() / ((float) 2)) >= 0.0f && Intrinsics.areEqual(s(), u());
    }

    public final boolean O(float f10) {
        return C().k() + (C().l() / ((float) 2)) <= f10 && Intrinsics.areEqual(C(), F());
    }

    public final int P(float f10) {
        Integer next;
        Iterator<Integer> it = kotlin.ranges.r.k0(this.f26651e - 1, 0).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (get(next.intValue()).l() != f10);
        Integer num = next;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int Q(@NotNull o0 o0Var) {
        return this.f26647a.lastIndexOf(o0Var);
    }

    public o0 R(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public o0 T() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public o0 Y() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public o0 a0(int i10, o0 o0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, o0 o0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends o0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof o0) {
            return m((o0) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        return this.f26647a.containsAll(collection);
    }

    public void d(int i10, o0 o0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (size() != p0Var.size()) {
            return false;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!Intrinsics.areEqual(get(i10), p0Var.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += get(i10).hashCode() * 31;
        }
        return iHashCode;
    }

    public boolean i(o0 o0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof o0) {
            return M((o0) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f26647a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<o0> iterator() {
        return this.f26647a.iterator();
    }

    public void k(o0 o0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void l(o0 o0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof o0) {
            return Q((o0) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<o0> listIterator() {
        return this.f26647a.listIterator();
    }

    public boolean m(@NotNull o0 o0Var) {
        return this.f26647a.contains(o0Var);
    }

    public final int n(float f10) {
        Integer next;
        Iterator<Integer> it = new IntRange(this.f26652f, CollectionsKt.getLastIndex(this)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (get(next.intValue()).l() != f10);
        Integer num = next;
        return num != null ? num.intValue() : CollectionsKt.getLastIndex(this);
    }

    @Override // java.util.List
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public o0 get(int i10) {
        return this.f26647a.get(i10);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ o0 remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<o0> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final o0 s() {
        o0 o0Var = (o0) CollectionsKt.getOrNull(this, this.f26651e);
        if (o0Var != null) {
            return o0Var;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ o0 set(int i10, o0 o0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return L();
    }

    @Override // java.util.List
    public void sort(Comparator<? super o0> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<o0> subList(int i10, int i11) {
        return this.f26647a.subList(i10, i11);
    }

    public final int t() {
        return this.f26651e;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @NotNull
    public final o0 u() {
        return get(this.f26649c);
    }

    public final int v() {
        return this.f26649c;
    }

    public final int w() {
        return this.f26653g;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends o0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<o0> listIterator(int i10) {
        return this.f26647a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
