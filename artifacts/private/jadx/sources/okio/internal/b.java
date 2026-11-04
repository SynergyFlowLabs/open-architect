package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.f1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@oj.i(name = "-BufferedSource")
public final class b {
    @Nullable
    public static final <T> T a(@NotNull okio.n nVar, @NotNull f1<T> options) throws IOException {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int iXf = nVar.xf(options.i());
        if (iXf == -1) {
            return null;
        }
        return options.get(iXf);
    }
}
