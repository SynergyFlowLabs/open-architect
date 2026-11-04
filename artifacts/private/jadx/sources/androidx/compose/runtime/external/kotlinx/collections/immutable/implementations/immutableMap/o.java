package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPersistentHashMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class o<K, V> extends AbstractSet<Map.Entry<? extends K, ? extends V>> implements androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35650b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d<K, V> f35651a;

    public o(@NotNull d<K, V> dVar) {
        this.f35651a = dVar;
    }

    public boolean c(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        if (entry == null) {
            return false;
        }
        V v10 = this.f35651a.get(entry.getKey());
        if (v10 != null) {
            return Intrinsics.areEqual(v10, entry.getValue());
        }
        return entry.getValue() == null && this.f35651a.containsKey(entry.getKey());
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
        return this.f35651a.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new p(this.f35651a.f());
    }
}
