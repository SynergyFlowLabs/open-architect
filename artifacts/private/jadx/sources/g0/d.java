package g0;

import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1734#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
public abstract class d<E> extends AbstractList<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f275358a = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(Collection collection, Object obj) {
        return !collection.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> addAll(@NotNull Collection<? extends E> collection) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.g.a<E> aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.build();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> clear() {
        return o.b();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> remove(E e10) {
        int iIndexOf = indexOf(e10);
        return iIndexOf != -1 ? l3(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> removeAll(@NotNull final Collection<? extends E> collection) {
        return I((Function1) new Function1() { // from class: g0.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(d.i(collection, obj));
            }
        });
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> retainAll(@NotNull final Collection<? extends E> collection) {
        return I((Function1) new Function1() { // from class: g0.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(d.k(collection, obj));
            }
        });
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.c
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.c<E> subList(int i10, int i11) {
        return super.subList(i10, i11);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> addAll(int i10, @NotNull Collection<? extends E> collection) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.g.a<E> aVarBuilder = builder();
        aVarBuilder.addAll(i10, collection);
        return aVarBuilder.build();
    }
}
