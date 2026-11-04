package e3;

import androidx.activity.compose.n;
import androidx.activity.d;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.i;
import okhttp3.internal.ws.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    @o
    public static final void b(final boolean z10, @NotNull final Function2<? super i<d>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        c0 c0VarR = c0Var.R(1818896922);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            if (m0.l0()) {
                m0.A0(1818896922, i12, -1, "androidx.navigation.compose.internal.PredictiveBackHandler (NavComposeUtils.android.kt:30)");
            }
            n.a(z10, function2, c0VarR, i12 & g.f334652s, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: e3.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b.c(z10, function2, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(boolean z10, Function2 function2, int i10, int i11, c0 c0Var, int i12) {
        b(z10, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @NotNull
    public static final String d() {
        return UUID.randomUUID().toString();
    }
}
