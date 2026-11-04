package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.b2;
import androidx.compose.ui.a0;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function1) {
        return i.a(a0Var, function1);
    }

    @NotNull
    public static final a0 b(@NotNull a0 a0Var, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1, @NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function2) {
        return i.b(a0Var, function1, function2);
    }

    @kotlin.l(message = "Replaced by overload with a callback for obtain a transfer data,start detection is performed by Compose itself", replaceWith = @b1(expression = "Modifier.dragAndDropSource(transferData)", imports = {}))
    @b2
    @NotNull
    public static final a0 c(@NotNull a0 a0Var, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1, @NotNull Function2<? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return j.a(a0Var, function1, function2);
    }
}
