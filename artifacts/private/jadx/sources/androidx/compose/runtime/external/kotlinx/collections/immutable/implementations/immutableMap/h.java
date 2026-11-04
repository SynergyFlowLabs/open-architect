package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPersistentHashMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35639c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f<K, V> f35640b;

    public h(@NotNull f<K, V> fVar) {
        this.f35640b = fVar;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.a
    public boolean c(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        return this.f35640b.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f35640b.clear();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.a
    public boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        V v10 = this.f35640b.get(entry.getKey());
        if (v10 != null) {
            return Intrinsics.areEqual(v10, entry.getValue());
        }
        return entry.getValue() == null && this.f35640b.containsKey(entry.getKey());
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f35640b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f35640b);
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }
}
