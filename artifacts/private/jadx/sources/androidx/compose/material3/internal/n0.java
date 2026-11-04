package androidx.compose.material3.internal;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    @androidx.compose.runtime.o
    public static final void c(final boolean z10, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1339183247);
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
            i12 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                z10 = true;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1339183247, i12, -1, "androidx.compose.material3.internal.BackHandler (BackHandler.android.kt:24)");
            }
            androidx.activity.compose.e.a(z10, function0, c0VarR, i12 & okhttp3.internal.ws.g.f334652s, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.d(z10, function0, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(boolean z10, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c(z10, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    public static final void e(final boolean z10, @NotNull final Function2<? super kotlinx.coroutines.flow.i<androidx.activity.d>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1437916225);
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
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                z10 = true;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1437916225, i12, -1, "androidx.compose.material3.internal.PredictiveBackHandler (BackHandler.android.kt:32)");
            }
            androidx.activity.compose.n.a(z10, function2, c0VarR, i12 & okhttp3.internal.ws.g.f334652s, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.f(z10, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(boolean z10, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(z10, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
