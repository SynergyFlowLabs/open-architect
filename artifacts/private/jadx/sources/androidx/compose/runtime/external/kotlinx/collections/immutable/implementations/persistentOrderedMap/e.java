package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPersistentOrderedMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
public final class e<K, V> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35733c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d<K, V> f35734b;

    public e(@NotNull d<K, V> dVar) {
        this.f35734b = dVar;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.a
    public boolean c(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        return this.f35734b.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f35734b.clear();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.a
    public boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        V v10 = this.f35734b.get(entry.getKey());
        if (v10 != null) {
            return Intrinsics.areEqual(v10, entry.getValue());
        }
        return entry.getValue() == null && this.f35734b.containsKey(entry.getKey());
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f35734b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new f(this.f35734b);
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }
}
