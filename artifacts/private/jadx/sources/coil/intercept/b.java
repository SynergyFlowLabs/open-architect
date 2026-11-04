package coil.intercept;

import coil.request.i;
import coil.request.j;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public interface a {
        @Nullable
        Object a(@NotNull i iVar, @NotNull d<? super j> dVar);

        @i4.a
        @NotNull
        a b(@NotNull i iVar);

        @NotNull
        a c(@NotNull coil.size.i iVar);

        @NotNull
        i getRequest();

        @NotNull
        coil.size.i getSize();
    }

    @Nullable
    Object a(@NotNull a aVar, @NotNull d<? super j> dVar);
}
