package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPersistentOrderedMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class l<K, V> extends AbstractSet<Map.Entry<? extends K, ? extends V>> implements androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35752b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c<K, V> f35753a;

    public l(@NotNull c<K, V> cVar) {
        this.f35753a = cVar;
    }

    public boolean c(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        if (entry == null) {
            return false;
        }
        V v10 = this.f35753a.get(entry.getKey());
        if (v10 != null) {
            return Intrinsics.areEqual(v10, entry.getValue());
        }
        return entry.getValue() == null && this.f35753a.containsKey(entry.getKey());
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f35753a.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new m(this.f35753a);
    }
}
