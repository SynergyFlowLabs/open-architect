package ui;

import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    @kotlin.l(level = kotlin.n.ERROR, message = "Use transferTo instead", replaceWith = @b1(expression = "output.transferTo(this)", imports = {"kotlinx.io.transferTo"}))
    public static final long a(@NotNull c0 c0Var, @NotNull x output) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(output, "output");
        return c0Var.T8(output);
    }
}
