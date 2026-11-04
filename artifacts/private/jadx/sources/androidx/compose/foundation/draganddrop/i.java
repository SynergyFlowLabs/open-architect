package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class i {
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function1) {
        return a0Var.B2(new DragAndDropSourceWithDefaultShadowElement(g.f14153a.a(), function1));
    }

    @NotNull
    public static final a0 b(@NotNull a0 a0Var, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1, @NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function2) {
        return a0Var.B2(new DragAndDropSourceElement(function1, g.f14153a.a(), function2));
    }
}
