package okio;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class o0 {
    @NotNull
    public static final v a(@NotNull v vVar, @NotNull r0 zipPath) throws IOException {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        return okio.internal.m.g(zipPath, vVar, null, 4, null);
    }
}
