package okhttp3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface j0 {

    public interface a {
        @NotNull
        j0 b(@NotNull d0 d0Var, @NotNull k0 k0Var);
    }

    void cancel();

    boolean close(int i10, @Nullable String str);

    long queueSize();

    @NotNull
    d0 request();

    boolean send(@NotNull String str);

    boolean send(@NotNull okio.o oVar);
}
