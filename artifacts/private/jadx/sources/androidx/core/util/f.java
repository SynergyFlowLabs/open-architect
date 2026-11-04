package androidx.core.util;

import androidx.annotation.w0;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(24)
@oj.i(name = "ConsumerKt")
public final class f {
    @w0(24)
    @NotNull
    public static final <T> Consumer<T> a(@NotNull kotlin.coroutines.d<? super T> dVar) {
        return new g(dVar);
    }
}
