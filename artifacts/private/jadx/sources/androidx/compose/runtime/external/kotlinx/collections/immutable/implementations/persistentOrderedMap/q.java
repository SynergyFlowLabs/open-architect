package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class q<K, V> extends AbstractCollection<V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35764b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c<K, V> f35765a;

    public q(@NotNull c<K, V> cVar) {
        this.f35765a = cVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f35765a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f35765a.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<V> iterator() {
        return new r(this.f35765a);
    }
}
