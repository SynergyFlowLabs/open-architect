package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class z<K, V> extends v<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f35680f = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final i<K, V> f35681e;

    public z(@NotNull i<K, V> iVar) {
        this.f35681e = iVar;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        i0.a.a(f());
        l(e() + 2);
        return new c(this.f35681e, d()[e() - 2], d()[e() - 1]);
    }
}
