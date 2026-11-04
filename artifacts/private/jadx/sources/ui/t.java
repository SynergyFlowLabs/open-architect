package ui;

import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class t {
    public static final boolean a(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return c0Var.y1();
    }

    @kotlin.l(message = "Use exhausted() instead", replaceWith = @b1(expression = "exhausted()", imports = {}))
    public static /* synthetic */ void b(c0 c0Var) {
    }

    public static final boolean c(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return !c0Var.y1();
    }

    @kotlin.l(message = "This makes no sense for streaming inputs. Some use-cases are covered by exhausted() method", replaceWith = @b1(expression = "!exhausted()", imports = {}))
    public static /* synthetic */ void d(c0 c0Var) {
    }
}
