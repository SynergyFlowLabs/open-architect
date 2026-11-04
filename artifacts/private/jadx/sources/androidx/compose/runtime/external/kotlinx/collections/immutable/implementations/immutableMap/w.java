package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class w<K, V> extends v<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35673e = 8;

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        i0.a.a(f());
        l(e() + 2);
        return new b(d()[e() - 2], d()[e() - 1]);
    }
}
