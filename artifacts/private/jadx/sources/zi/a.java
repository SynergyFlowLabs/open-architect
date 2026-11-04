package zi;

import java.io.EOFException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import kotlinx.io.g0;
import org.jetbrains.annotations.NotNull;
import ui.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final boolean a(@NotNull c0 c0Var, @NotNull byte[] data) throws EOFException {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        kotlinx.io.b bVarC = c0Var.n().c();
        l.g(bVarC, l.j(bVarC) - ((long) data.length));
        return Arrays.equals(g0.c(bVarC), data);
    }
}
