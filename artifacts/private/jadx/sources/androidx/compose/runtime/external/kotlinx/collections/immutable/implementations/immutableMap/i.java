package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, qj.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35641b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g<K, V, Map.Entry<K, V>> f35642a;

    public i(@NotNull f<K, V> fVar) {
        v[] vVarArr = new v[8];
        for (int i10 = 0; i10 < 8; i10++) {
            vVarArr[i10] = new z(this);
        }
        this.f35642a = new g<>(fVar, vVarArr);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return this.f35642a.next();
    }

    public final void c(K k10, V v10) {
        this.f35642a.m(k10, v10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35642a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f35642a.remove();
    }
}
