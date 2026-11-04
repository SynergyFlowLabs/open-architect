package androidx.compose.material;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s4 f24892a = new s4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static pj.n<xf, androidx.compose.runtime.c0, Integer, Unit> f24893b = androidx.compose.runtime.internal.w.c(1890101041, false, a.f24894a);

    static final class a implements pj.n<xf, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24894a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(xf xfVar, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? c0Var.D(xfVar) : c0Var.k0(xfVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1890101041, i11, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda$1890101041.<anonymous> (SnackbarHost.kt:154)");
            }
            pg.k(xfVar, null, false, null, 0L, 0L, 0L, 0.0f, c0Var, i11 & 14, com.planner5d.library.engine.input.f.b.X1);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(xf xfVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(xfVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final pj.n<xf, androidx.compose.runtime.c0, Integer, Unit> a() {
        return f24893b;
    }
}
