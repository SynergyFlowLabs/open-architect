package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        return a0Var.B2(new TextContextMenuGestureElement(function1));
    }

    public static /* synthetic */ a0 b(a0 a0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        return a(a0Var, function1);
    }
}
