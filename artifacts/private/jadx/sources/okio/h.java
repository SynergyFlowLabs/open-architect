package okio;

import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@oj.i(name = "-InflaterSourceExtensions")
public final class h {
    @NotNull
    public static final e0 a(@NotNull b1 b1Var, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new e0(b1Var, inflater);
    }

    public static /* synthetic */ e0 b(b1 b1Var, Inflater inflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inflater = new Inflater();
        }
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new e0(b1Var, inflater);
    }
}
