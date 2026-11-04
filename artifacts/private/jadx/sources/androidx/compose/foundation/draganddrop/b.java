package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.b2;
import androidx.compose.ui.a0;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class b {
    @kotlin.l(message = "Replaced by overload with a callback for obtain a transfer data,start detection is performed by Compose itself", replaceWith = @b1(expression = "Modifier.dragAndDropSource(transferData)", imports = {}))
    @b2
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull Function2<? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return a0Var.B2(new LegacyDragAndDropSourceWithDefaultShadowElement(function2));
    }
}
