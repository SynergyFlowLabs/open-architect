package androidx.compose.material3.internal;

import androidx.compose.runtime.k7;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f28796a = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";

    @k7
    @NotNull
    public static final <T> androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.foundation.gestures.b0<T> b0Var, @NotNull androidx.compose.foundation.gestures.q3 q3Var, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends androidx.compose.foundation.gestures.t2<T>, ? extends T>> function2) {
        return a0Var.B2(new DraggableAnchorsElementV2(b0Var, function2, q3Var));
    }
}
