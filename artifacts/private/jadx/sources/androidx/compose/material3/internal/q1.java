package androidx.compose.material3.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {
    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.semantics.e0, Unit> function1) {
        return a0Var.B2(new ChildSemanticsNodeElement(function1));
    }

    public static /* synthetic */ androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.material3.internal.p1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q1.d((androidx.compose.ui.semantics.e0) obj2);
                }
            };
        }
        return b(a0Var, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(androidx.compose.ui.semantics.e0 e0Var) {
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.semantics.e0, Unit> function1) {
        return a0Var.B2(new ParentSemanticsNodeElement(function1));
    }
}
