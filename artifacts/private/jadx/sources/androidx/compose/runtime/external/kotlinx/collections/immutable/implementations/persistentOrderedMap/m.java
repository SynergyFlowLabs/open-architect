package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class m<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, qj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35754b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p<K, V> f35755a;

    public m(@NotNull c<K, V> cVar) {
        this.f35755a = new p<>(cVar.e(), cVar.f());
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b(this.f35755a.c(), this.f35755a.next().e());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35755a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
