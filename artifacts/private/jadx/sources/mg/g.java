package mg;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.msgpack.core.j;
import org.msgpack.core.o;

/* JADX INFO: loaded from: classes13.dex */
public interface g {
    @NotNull
    Object[] a(@NotNull o oVar) throws IOException;

    @NotNull
    com.google.gson.i b(@NotNull Object[] objArr);

    void c(@NotNull Object[] objArr, @NotNull j jVar) throws IOException;

    @NotNull
    Object[] d(@NotNull com.google.gson.i iVar);
}
