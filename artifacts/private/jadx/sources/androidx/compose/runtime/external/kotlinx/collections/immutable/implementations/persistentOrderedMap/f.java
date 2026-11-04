package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class f<K, V> implements Iterator<Map.Entry<K, V>>, qj.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35735b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i<K, V> f35736a;

    public f(@NotNull d<K, V> dVar) {
        this.f35736a = new i<>(dVar.a(), dVar);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return new b(this.f35736a.e().b(), this.f35736a.g(), this.f35736a.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35736a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f35736a.remove();
    }
}
