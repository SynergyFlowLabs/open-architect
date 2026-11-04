package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public class p<K, V> implements Iterator<a<V>>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35760d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Object f35761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<K, a<V>> f35762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35763c;

    public p(@Nullable Object obj, @NotNull Map<K, a<V>> map) {
        this.f35761a = obj;
        this.f35762b = map;
    }

    public final int b() {
        return this.f35763c;
    }

    @Nullable
    public final Object c() {
        return this.f35761a;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        a<V> aVar = this.f35762b.get(this.f35761a);
        if (aVar != null) {
            a<V> aVar2 = aVar;
            this.f35763c++;
            this.f35761a = aVar2.c();
            return aVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f35761a + ") has changed after it was added to the persistent map.");
    }

    public final void e(int i10) {
        this.f35763c = i10;
    }

    public final void f(@Nullable Object obj) {
        this.f35761a = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35763c < this.f35762b.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
