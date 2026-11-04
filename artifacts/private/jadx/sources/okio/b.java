package okio;

import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@oj.i(name = "-DeflaterSinkExtensions")
public final class b {
    @NotNull
    public static final r a(@NotNull z0 z0Var, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        return new r(z0Var, deflater);
    }

    public static /* synthetic */ r b(z0 z0Var, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        return new r(z0Var, deflater);
    }
}
