package androidx.compose.ui.platform;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class f1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.relocation.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private ViewGroup f40440s;

    public f1(@NotNull ViewGroup viewGroup) {
        this.f40440s = viewGroup;
    }

    @Override // androidx.compose.ui.relocation.a
    @Nullable
    public Object m6(@NotNull androidx.compose.ui.layout.g0 g0Var, @NotNull Function0<n0.j> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        long jF = androidx.compose.ui.layout.h0.f(g0Var);
        n0.j jVarInvoke = function0.invoke();
        n0.j jVarT = jVarInvoke != null ? jVarInvoke.T(jF) : null;
        if (jVarT != null) {
            this.f40440s.requestRectangleOnScreen(androidx.compose.ui.graphics.c3.b(jVarT), false);
        }
        return Unit.f312394a;
    }

    @NotNull
    public final ViewGroup v9() {
        return this.f40440s;
    }

    public final void w9(@NotNull ViewGroup viewGroup) {
        this.f40440s = viewGroup;
    }
}
