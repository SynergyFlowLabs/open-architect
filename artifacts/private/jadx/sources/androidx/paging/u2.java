package androidx.paging;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface u2<Key, Value> extends w2<Key, Value> {
    @Nullable
    Object a(@NotNull kotlin.coroutines.d<? super s2.a> dVar);

    @NotNull
    kotlinx.coroutines.flow.z0<z0> getState();
}
