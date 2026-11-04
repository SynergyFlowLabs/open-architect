package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.f4;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,511:1\n1734#2,3:512\n1863#2,2:515\n34#3,4:517\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n355#1:512,3\n365#1:515,2\n498#1:517,4\n*E\n"})
public final class h1<T> implements List<T>, qj.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36493e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SnapshotStateList<T> f36494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36497d;

    public static final class a implements ListIterator<T>, qj.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.f f36498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h1<T> f36499b;

        a(kotlin.jvm.internal.i1.f fVar, h1<T> h1Var) {
            this.f36498a = fVar;
            this.f36499b = h1Var;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void add(T t10) {
            k0.n();
            throw new kotlin.a0();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            k0.n();
            throw new kotlin.a0();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void set(T t10) {
            k0.n();
            throw new kotlin.a0();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f36498a.f312749a < this.f36499b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f36498a.f312749a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i10 = this.f36498a.f312749a + 1;
            k0.t(i10, this.f36499b.size());
            this.f36498a.f312749a = i10;
            return this.f36499b.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f36498a.f312749a + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f36498a.f312749a;
            k0.t(i10, this.f36499b.size());
            this.f36498a.f312749a = i10 - 1;
            return this.f36499b.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f36498a.f312749a;
        }
    }

    public h1(@NotNull SnapshotStateList<T> snapshotStateList, int i10, int i11) {
        this.f36494a = snapshotStateList;
        this.f36495b = i10;
        this.f36496c = k0.l(snapshotStateList);
        this.f36497d = i11 - i10;
    }

    private final void l() {
        if (k0.l(this.f36494a) != this.f36496c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        l();
        this.f36494a.add(this.f36495b + size(), t10);
        this.f36497d = size() + 1;
        this.f36496c = k0.l(this.f36494a);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, @NotNull Collection<? extends T> collection) {
        l();
        boolean zAddAll = this.f36494a.addAll(i10 + this.f36495b, collection);
        if (zAddAll) {
            this.f36497d = size() + collection.size();
            this.f36496c = k0.l(this.f36494a);
        }
        return zAddAll;
    }

    @NotNull
    public final SnapshotStateList<T> c() {
        return this.f36494a;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            l();
            SnapshotStateList<T> snapshotStateList = this.f36494a;
            int i10 = this.f36495b;
            snapshotStateList.v(i10, size() + i10);
            this.f36497d = 0;
            this.f36496c = k0.l(this.f36494a);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i10) {
        l();
        k0.t(i10, size());
        return this.f36494a.get(this.f36495b + i10);
    }

    public int i() {
        return this.f36497d;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        l();
        int i10 = this.f36495b;
        Iterator<Integer> it = kotlin.ranges.r.W1(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (Intrinsics.areEqual(obj, this.f36494a.get(iNextInt))) {
                return iNextInt - this.f36495b;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    public T k(int i10) {
        l();
        T tRemove = this.f36494a.remove(this.f36495b + i10);
        this.f36497d = size() - 1;
        this.f36496c = k0.l(this.f36494a);
        return tRemove;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        l();
        int size = this.f36495b + size();
        do {
            size--;
            if (size < this.f36495b) {
                return -1;
            }
        } while (!Intrinsics.areEqual(obj, this.f36494a.get(size)));
        return size - this.f36495b;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return k(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> collection) {
        l();
        SnapshotStateList<T> snapshotStateList = this.f36494a;
        int i10 = this.f36495b;
        int iB = snapshotStateList.B(collection, i10, size() + i10);
        if (iB > 0) {
            this.f36496c = k0.l(this.f36494a);
            this.f36497d = size() - iB;
        }
        return iB > 0;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        k0.t(i10, size());
        l();
        T t11 = this.f36494a.set(i10 + this.f36495b, t10);
        this.f36496c = k0.l(this.f36494a);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            f4.d("fromIndex or toIndex are out of bounds");
        }
        l();
        SnapshotStateList<T> snapshotStateList = this.f36494a;
        int i12 = this.f36495b;
        return new h1(snapshotStateList, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i10) {
        l();
        kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
        fVar.f312749a = i10 - 1;
        return new a(fVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        int i10 = 4 >> 1;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        l();
        this.f36494a.add(this.f36495b + i10, t10);
        this.f36497d = size() + 1;
        this.f36496c = k0.l(this.f36494a);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> collection) {
        return addAll(size(), collection);
    }
}
