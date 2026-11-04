package androidx.compose.ui.input.rotary;

import androidx.compose.ui.a0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull Function1<? super d, Boolean> function1) {
        return a0Var.B2(new RotaryInputElement(null, function1));
    }

    @NotNull
    public static final a0 b(@NotNull a0 a0Var, @NotNull Function1<? super d, Boolean> function1) {
        return a0Var.B2(new RotaryInputElement(function1, null));
    }
}
