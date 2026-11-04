package f0;

import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class b<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.c<E>, List<E>, qj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f274911b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<E> f274912a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull List<? extends E> list) {
        this.f274912a = list;
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return this.f274912a.size();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f274912a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        return this.f274912a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        return this.f274912a.equals(obj);
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f274912a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f274912a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f274912a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f274912a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return this.f274912a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f274912a.lastIndexOf(obj);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return this.f274912a.listIterator();
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @NotNull
    public String toString() {
        return this.f274912a.toString();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i10) {
        return this.f274912a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.c, java.util.List
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.c<E> subList(int i10, int i11) {
        return new b(this.f274912a.subList(i10, i11));
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }
}
