package ab;

import androidx.compose.material.cl;
import androidx.compose.material.x9;
import androidx.compose.material.z9;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.text.y3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    @o
    @p(scheme = "[0[0]]")
    public static final void b(@NotNull final Function2<? super c0, ? super Integer, Unit> content, @Nullable c0 c0Var, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        c0 c0VarR = c0Var.R(-1506927389);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (m0.l0()) {
                m0.A0(-1506927389, i11, -1, "com.planner5d.library.compose.view.Planner5dTheme (Planner5dTheme.kt:33)");
            }
            x9 x9Var = x9.f25488a;
            int i12 = x9.f25489b;
            cl clVarC = x9Var.c(c0VarR, i12);
            y3 y3VarG = x9Var.c(c0VarR, i12).g();
            b bVar = b.f589a;
            z9.b(null, cl.b(clVarC, y3.m(y3VarG, 0L, 0L, null, null, null, bVar.a(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), y3.m(x9Var.c(c0VarR, i12).h(), 0L, 0L, null, null, null, bVar.a(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), null, null, null, null, y3.m(x9Var.c(c0VarR, i12).n(), 0L, 0L, null, null, null, bVar.a(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), y3.m(x9Var.c(c0VarR, i12).o(), 0L, 0L, null, null, null, bVar.a(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), y3.m(x9Var.c(c0VarR, i12).c(), 0L, 0L, null, null, null, bVar.a(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), y3.m(x9Var.c(c0VarR, i12).d(), 0L, 0L, null, null, null, bVar.a(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), y3.m(x9Var.c(c0VarR, i12).e(), 0L, 0L, null, null, null, bVar.a(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), null, null, 6204, null), null, content, c0VarR, (i11 << 9) & 7168, 5);
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: ab.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.c(content, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function2 function2, int i10, c0 c0Var, int i11) {
        b(function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
