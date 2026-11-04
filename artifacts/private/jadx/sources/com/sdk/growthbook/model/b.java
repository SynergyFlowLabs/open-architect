package com.sdk.growthbook.model;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends q implements List<q>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ List<q> f266282a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull List<? extends q> value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f266282a = value;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends q> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof q) {
            return k((q) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f266282a.containsAll(elements);
    }

    public void d(int i10, q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean i(q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof q) {
            return n((q) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f266282a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<q> iterator() {
        return this.f266282a.iterator();
    }

    public boolean k(@NotNull q element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f266282a.contains(element);
    }

    @Override // java.util.List
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public q get(int i10) {
        return this.f266282a.get(i10);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof q) {
            return p((q) obj);
        }
        int i10 = 5 ^ (-1);
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<q> listIterator() {
        return this.f266282a.listIterator();
    }

    public int m() {
        return this.f266282a.size();
    }

    public int n(@NotNull q element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f266282a.indexOf(element);
    }

    public int p(@NotNull q element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f266282a.lastIndexOf(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ q remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<q> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public q s(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ q set(int i10, q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m();
    }

    @Override // java.util.List
    public void sort(Comparator<? super q> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<q> subList(int i10, int i11) {
        return this.f266282a.subList(i10, i11);
    }

    public q t(int i10, q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends q> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<q> listIterator(int i10) {
        return this.f266282a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) v.b(this, array);
    }
}
