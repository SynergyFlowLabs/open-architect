package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class bd implements ob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bd f26280a = new bd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f26281b = 0;

    private bd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(bd bdVar, pb0 pb0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        bdVar.a(pb0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.ob0
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void a(@NotNull final pb0 pb0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1829525426);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(pb0Var) : c0VarR.k0(pb0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1829525426, i11, -1, "androidx.compose.material3.DefaultWideNavigationRailOverride.WideNavigationRail (WideNavigationRail.kt:192)");
            }
            ib0.L(pb0Var.e(), false, wb0.b(pb0Var.g().c()), pb0Var.b(), pb0Var.f(), pb0Var.d(), pb0Var.h(), pb0Var.a(), pb0Var.c(), c0VarR, 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ad
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return bd.c(this.f26041a, pb0Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
