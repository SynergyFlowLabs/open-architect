package okhttp3;

import java.io.IOException;
import okio.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface e extends Cloneable {

    public interface a {
        @NotNull
        e a(@NotNull d0 d0Var);
    }

    void cancel();

    @NotNull
    /* JADX INFO: renamed from: clone */
    e mo1616clone();

    @NotNull
    f0 execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    void li(@NotNull f fVar);

    @NotNull
    d0 request();

    @NotNull
    e1 timeout();
}
