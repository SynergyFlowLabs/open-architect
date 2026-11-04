package androidx.compose.ui.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 {
    @NotNull
    public static final androidx.compose.ui.node.v0 a(@NotNull androidx.compose.ui.node.v0 v0Var) {
        androidx.compose.ui.node.l0 l0VarI4 = v0Var.i4();
        while (true) {
            androidx.compose.ui.node.l0 l0VarJ0 = l0VarI4.J0();
            if ((l0VarJ0 != null ? l0VarJ0.t0() : null) == null) {
                androidx.compose.ui.node.v0 v0VarN4 = l0VarI4.F0().N4();
                Intrinsics.checkNotNull(v0VarN4);
                return v0VarN4;
            }
            androidx.compose.ui.node.l0 l0VarJ1 = l0VarI4.J0();
            androidx.compose.ui.node.l0 l0VarT0 = l0VarJ1 != null ? l0VarJ1.t0() : null;
            Intrinsics.checkNotNull(l0VarT0);
            if (l0VarT0.k1()) {
                l0VarI4 = l0VarI4.J0();
                Intrinsics.checkNotNull(l0VarI4);
            } else {
                androidx.compose.ui.node.l0 l0VarJ2 = l0VarI4.J0();
                Intrinsics.checkNotNull(l0VarJ2);
                l0VarI4 = l0VarJ2.t0();
                Intrinsics.checkNotNull(l0VarI4);
            }
        }
    }
}
