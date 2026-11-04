package io.ktor.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nDelegatingMutableSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingMutableSet.kt\nio/ktor/util/DelegatingMutableSet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1563#2:60\n1634#2,3:61\n1563#2:64\n1634#2,3:65\n*S KotlinDebug\n*F\n+ 1 DelegatingMutableSet.kt\nio/ktor/util/DelegatingMutableSet\n*L\n13#1:60\n13#1:61,3\n14#1:64\n14#1:65,3\n*E\n"})
public class j0<From, To> implements Set<To>, qj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<From> f296677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<From, To> f296678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<To, From> f296679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f296680d;

    public static final class a implements Iterator<To>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<From> f296681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0<From, To> f296682b;

        a(j0<From, To> j0Var) {
            this.f296682b = j0Var;
            this.f296681a = ((j0) j0Var).f296677a.iterator();
        }

        public final Iterator<From> b() {
            return this.f296681a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f296681a.hasNext();
        }

        @Override // java.util.Iterator
        public To next() {
            return (To) ((j0) this.f296682b).f296678b.invoke(this.f296681a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f296681a.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(@NotNull Set<From> delegate, @NotNull Function1<? super From, ? extends To> convertTo, @NotNull Function1<? super To, ? extends From> convert) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(convertTo, "convertTo");
        Intrinsics.checkNotNullParameter(convert, "convert");
        this.f296677a = delegate;
        this.f296678b = convertTo;
        this.f296679c = convert;
        this.f296680d = delegate.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(To to) {
        return this.f296677a.add(this.f296679c.invoke(to));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends To> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f296677a.addAll(i(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f296677a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f296677a.contains(this.f296679c.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f296677a.containsAll(i(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof Set)) {
            Collection<To> collectionK = k(this.f296677a);
            if (((Set) obj).containsAll(collectionK) && collectionK.containsAll((Collection) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f296677a.hashCode();
    }

    @NotNull
    public Collection<From> i(@NotNull Collection<? extends To> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection<? extends To> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f296679c.invoke((To) it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f296677a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<To> iterator() {
        return new a(this);
    }

    @NotNull
    public Collection<To> k(@NotNull Collection<? extends From> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection<? extends From> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f296678b.invoke((From) it.next()));
        }
        return arrayList;
    }

    public int l() {
        return this.f296680d;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f296677a.remove(this.f296679c.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f296677a.removeAll(CollectionsKt.toSet(i(elements)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f296677a.retainAll(CollectionsKt.toSet(i(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return l();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @NotNull
    public String toString() {
        return k(this.f296677a).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }
}
