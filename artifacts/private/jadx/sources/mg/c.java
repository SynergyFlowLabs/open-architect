package mg;

import io.ably.lib.types.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface c {
    @lm.c
    long V() throws io.ably.lib.types.a;

    @NotNull
    io.ably.lib.realtime.c a(@NotNull String str) throws io.ably.lib.types.a;

    @NotNull
    n b();

    @NotNull
    io.ably.lib.transport.b getConnectionManager();
}
