package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.a0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f18999a = "ToolbarRequester is not initialized.";

    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull o oVar, @Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function1<? super g0, n0.j> function3) {
        return a0Var.B2(new TextContextMenuToolbarHandlerElement(oVar, function1, function2, function3));
    }

    public static /* synthetic */ a0 b(a0 a0Var, o oVar, Function1 function1, Function1 function2, Function1 function3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        return a(a0Var, oVar, function1, function2, function3);
    }

    @NotNull
    public static final n0.j c(@NotNull n0.j jVar, @NotNull g0 g0Var, @NotNull g0 g0Var2) {
        if (!g0Var.I() || !g0Var2.I()) {
            return n0.j.f332705e.a();
        }
        return n0.k.c(g0Var2.r0(h0.d(g0Var), jVar.E()), jVar.z());
    }
}
