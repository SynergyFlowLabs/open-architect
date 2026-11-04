package androidx.datastore.core;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface l<T> {
    @Nullable
    Object a(@NotNull Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar);

    @NotNull
    kotlinx.coroutines.flow.i<T> getData();
}
