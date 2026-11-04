package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class a0<K, V> extends v<K, V, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35612e = 8;

    @Override // java.util.Iterator
    public V next() {
        i0.a.a(f());
        l(e() + 2);
        return (V) d()[e() - 1];
    }
}
