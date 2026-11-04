package androidx.compose.foundation.selection;

import androidx.compose.runtime.k7;
import androidx.compose.ui.a0;
import androidx.compose.ui.semantics.b0;
import androidx.compose.ui.semantics.e0;
import androidx.compose.ui.semantics.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    @k7
    @NotNull
    public static final a0 b(@NotNull a0 a0Var) {
        return t.f(a0Var, false, new Function1() { // from class: androidx.compose.foundation.selection.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.c((e0) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(e0 e0Var) {
        b0.q1(e0Var);
        return Unit.f312394a;
    }
}
