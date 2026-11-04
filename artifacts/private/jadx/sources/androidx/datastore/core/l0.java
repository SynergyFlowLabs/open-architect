package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface l0<T> {
    T K();

    @Nullable
    Object L(T t10, @NotNull OutputStream outputStream, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object M(@NotNull InputStream inputStream, @NotNull kotlin.coroutines.d<? super T> dVar);
}
