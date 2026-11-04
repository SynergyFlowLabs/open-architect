package io.ktor.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@io.ktor.utils.io.o0
public final class t implements Set<String>, qj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s<Boolean> f296809a;

    public t() {
        this.f296809a = new s<>();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends String> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends String> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull String element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f296809a.containsKey(element)) {
            return false;
        }
        this.f296809a.put(element, Boolean.TRUE);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f296809a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return d((String) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f296809a.keySet().containsAll(elements);
    }

    public boolean d(@NotNull String element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f296809a.containsKey(element);
    }

    public int i() {
        return this.f296809a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f296809a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<String> iterator() {
        return this.f296809a.keySet().iterator();
    }

    public boolean k(@NotNull String element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.areEqual(this.f296809a.remove(element), Boolean.TRUE);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof String) {
            return k((String) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f296809a.keySet().removeAll(CollectionsKt.toSet(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f296809a.keySet().retainAll(CollectionsKt.toSet(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(@NotNull Iterable<String> initial) {
        this();
        Intrinsics.checkNotNullParameter(initial, "initial");
        CollectionsKt.addAll(this, initial);
    }
}
