package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class r<K, V> implements Iterator<V>, qj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35766b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p<K, V> f35767a;

    public r(@NotNull c<K, V> cVar) {
        this.f35767a = new p<>(cVar.e(), cVar.f());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35767a.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.f35767a.next().e();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
