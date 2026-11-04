package io.ktor.util.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;
import qj.h;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [Key] */
    @SourceDebugExtension({"SMAP\nConcurrentSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentSet.kt\nio/ktor/util/collections/ConcurrentSetKt$ConcurrentSet$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1740#2,3:53\n1740#2,3:56\n*S KotlinDebug\n*F\n+ 1 ConcurrentSet.kt\nio/ktor/util/collections/ConcurrentSetKt$ConcurrentSet$1\n*L\n22#1:53,3\n32#1:56,3\n*E\n"})
    public static final class a<Key> implements Set<Key>, h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<Key, Unit> f296558a = new d<>(0, 1, null);

        a() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Key element) {
            Intrinsics.checkNotNullParameter(element, "element");
            if (this.f296558a.containsKey(element)) {
                return false;
            }
            this.f296558a.put(element, Unit.f312394a);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Key> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Collection<? extends Key> collection = elements;
            if (collection.isEmpty()) {
                return true;
            }
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!add(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int c() {
            return this.f296558a.size();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f296558a.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            return this.f296558a.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return elements.containsAll(this.f296558a.keySet());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f296558a.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Key> iterator() {
            return this.f296558a.keySet().iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return (obj == null || this.f296558a.remove(obj) == null) ? false : true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Collection<?> collection = elements;
            if (collection.isEmpty()) {
                return true;
            }
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!remove(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Key key : this.f296558a.keySet()) {
                if (!elements.contains(key)) {
                    linkedHashSet.add(key);
                }
            }
            return removeAll(linkedHashSet);
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) v.b(this, array);
        }
    }

    @NotNull
    public static final <Key> Set<Key> a() {
        return new a();
    }
}
