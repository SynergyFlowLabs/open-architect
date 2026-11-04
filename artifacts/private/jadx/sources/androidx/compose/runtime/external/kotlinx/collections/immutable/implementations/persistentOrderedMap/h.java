package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class h<K, V> implements Iterator<K>, qj.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35739b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i<K, V> f35740a;

    public h(@NotNull d<K, V> dVar) {
        this.f35740a = new i<>(dVar.a(), dVar);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35740a.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        this.f35740a.next();
        return (K) this.f35740a.g();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f35740a.remove();
    }
}
