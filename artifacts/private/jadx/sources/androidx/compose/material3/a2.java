package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface a2 {
    static /* synthetic */ void c(a2 a2Var, Function0 function0, Function2 function2, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clickableItem");
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        a2Var.g(function0, function2, str, z10);
    }

    static /* synthetic */ void f(a2 a2Var, boolean z10, Function1 function1, Function2 function2, String str, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleableItem");
        }
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        a2Var.d(z10, function1, function2, str, z11);
    }

    void d(boolean z10, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull String str, boolean z11);

    void e(@NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull pj.n<? super p1, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar);

    void g(@NotNull Function0<Unit> function0, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull String str, boolean z10);
}
