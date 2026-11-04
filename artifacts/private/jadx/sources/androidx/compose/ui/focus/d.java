package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super p0, Unit> function1) {
        return a0Var.B2(new FocusChangedElement(function1));
    }
}
