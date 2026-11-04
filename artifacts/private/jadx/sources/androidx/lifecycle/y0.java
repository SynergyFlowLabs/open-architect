package androidx.lifecycle;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface y0<T> {
    @Nullable
    Object a(@NotNull w0<T> w0Var, @NotNull kotlin.coroutines.d<? super kotlinx.coroutines.o1> dVar);

    @Nullable
    T b();

    @Nullable
    Object emit(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
