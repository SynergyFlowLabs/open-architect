package coil.decode;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface h {

    public interface a {
        @Nullable
        h create(@NotNull coil.fetch.m mVar, @NotNull coil.request.n nVar, @NotNull coil.j jVar);
    }

    @Nullable
    Object decode(@NotNull kotlin.coroutines.d<? super f> dVar);
}
