package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import kotlin.collections.AbstractSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class n<K, V> extends AbstractSet<K> implements androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35756b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c<K, V> f35757a;

    public n(@NotNull c<K, V> cVar) {
        this.f35757a = cVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f35757a.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f35757a.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<K> iterator() {
        return new o(this.f35757a);
    }
}
