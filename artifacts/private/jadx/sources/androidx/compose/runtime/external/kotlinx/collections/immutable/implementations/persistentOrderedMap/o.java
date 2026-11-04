package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class o<K, V> implements Iterator<K>, qj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35758b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p<K, V> f35759a;

    public o(@NotNull c<K, V> cVar) {
        this.f35759a = new p<>(cVar.e(), cVar.f());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35759a.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        K k10 = (K) this.f35759a.c();
        this.f35759a.next();
        return k10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
