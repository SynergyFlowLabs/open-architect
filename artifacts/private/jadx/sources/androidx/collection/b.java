package androidx.collection;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.i(name = "ArrayMapKt")
public final class b {
    @NotNull
    public static final <K, V> a<K, V> a() {
        return new a<>();
    }

    @NotNull
    public static final <K, V> a<K, V> b(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        a<K, V> aVar = new a<>(pairs.length);
        for (Pair<? extends K, ? extends V> pair : pairs) {
            aVar.put(pair.getFirst(), pair.getSecond());
        }
        return aVar;
    }
}
