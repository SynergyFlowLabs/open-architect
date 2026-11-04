package okhttp3;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface f {
    void onFailure(@NotNull e eVar, @NotNull IOException iOException);

    void onResponse(@NotNull e eVar, @NotNull f0 f0Var) throws IOException;
}
