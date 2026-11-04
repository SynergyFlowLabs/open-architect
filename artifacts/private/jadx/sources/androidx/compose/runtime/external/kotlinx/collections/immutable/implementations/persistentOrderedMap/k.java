package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class k<K, V> implements Iterator<V>, qj.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35750b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i<K, V> f35751a;

    public k(@NotNull d<K, V> dVar) {
        this.f35751a = new i<>(dVar.a(), dVar);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35751a.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.f35751a.next().e();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f35751a.remove();
    }
}
