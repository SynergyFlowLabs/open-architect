package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class h1 implements List<a>, qj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17411b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<a> f17412a;

    public interface a {
        int getIndex();

        @Nullable
        Object getKey();
    }

    private h1(List<a> list) {
        this.f17412a = list;
    }

    public a A() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public a B(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void c(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof a) {
            return l((a) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        return this.f17412a.containsAll(collection);
    }

    public boolean d(a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void i(a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof a) {
            return p((a) obj);
        }
        int i10 = 4 | (-1);
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f17412a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<a> iterator() {
        return this.f17412a.iterator();
    }

    public void k(a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean l(@NotNull a aVar) {
        return this.f17412a.contains(aVar);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof a) {
            return s((a) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<a> listIterator() {
        return this.f17412a.listIterator();
    }

    @Override // java.util.List
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a get(int i10) {
        return this.f17412a.get(i10);
    }

    public int n() {
        return this.f17412a.size();
    }

    public int p(@NotNull a aVar) {
        return this.f17412a.indexOf(aVar);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ a remove(int i10) {
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
    public void replaceAll(UnaryOperator<a> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int s(@NotNull a aVar) {
        return this.f17412a.lastIndexOf(aVar);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ a set(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return n();
    }

    @Override // java.util.List
    public void sort(Comparator<? super a> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<a> subList(int i10, int i11) {
        return this.f17412a.subList(i10, i11);
    }

    public final void t(@NotNull a aVar) {
        this.f17412a.add(aVar);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    public final void u(@NotNull a aVar) {
        this.f17412a.remove(aVar);
    }

    public a v(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public a w() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public h1() {
        this(new SnapshotStateList());
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<a> listIterator(int i10) {
        return this.f17412a.listIterator(i10);
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
