package androidx.compose.ui.layout;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {
    @Nullable
    public static final View a(@NotNull l0 l0Var) {
        Intrinsics.checkNotNull(l0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutNode");
        Object objI0 = ((androidx.compose.ui.node.l0) l0Var).I0();
        if (objI0 instanceof View) {
            return (View) objI0;
        }
        return null;
    }
}
