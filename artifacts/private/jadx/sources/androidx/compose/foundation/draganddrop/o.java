package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.a0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull Function1<? super androidx.compose.ui.draganddrop.b, Boolean> function1, @NotNull androidx.compose.ui.draganddrop.i iVar) {
        return a0Var.B2(new DropTargetElement(function1, iVar));
    }
}
