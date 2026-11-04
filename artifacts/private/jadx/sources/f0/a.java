package f0;

import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public class a<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.b<E>, Collection<E>, qj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f274909b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Collection<E> f274910a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Collection<? extends E> collection) {
        this.f274910a = collection;
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return this.f274910a.size();
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f274910a.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        return this.f274910a.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(@Nullable Object obj) {
        return this.f274910a.equals(obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f274910a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f274910a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return this.f274910a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @NotNull
    public String toString() {
        return this.f274910a.toString();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }
}
