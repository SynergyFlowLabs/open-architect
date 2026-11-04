package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class s<K, V> extends AbstractCollection<V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35656b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d<K, V> f35657a;

    public s(@NotNull d<K, V> dVar) {
        this.f35657a = dVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f35657a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f35657a.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<V> iterator() {
        return new t(this.f35657a.f());
    }
}
