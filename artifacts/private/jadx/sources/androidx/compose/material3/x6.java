package androidx.compose.material3;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x6 f34394a = new x6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static pj.n<u00, androidx.compose.runtime.c0, Integer, Unit> f34395b = androidx.compose.runtime.internal.w.c(-1548712596, false, a.f34396a);

    static final class a implements pj.n<u00, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34396a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(u00 u00Var, androidx.compose.runtime.c0 c0Var, int i10) {
            u00 u00Var2;
            int i11;
            if ((i10 & 6) == 0) {
                u00Var2 = u00Var;
                i11 = i10 | (c0Var.D(u00Var2) ? 4 : 2);
            } else {
                u00Var2 = u00Var;
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1548712596, i11, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda$-1548712596.<anonymous> (SnackbarHost.kt:219)");
            }
            l10.j(u00Var2, null, false, null, 0L, 0L, 0L, 0L, 0L, c0Var, i11 & 14, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(u00 u00Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(u00Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final pj.n<u00, androidx.compose.runtime.c0, Integer, Unit> a() {
        return f34395b;
    }
}
