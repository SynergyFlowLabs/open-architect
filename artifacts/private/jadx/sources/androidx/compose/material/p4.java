package androidx.compose.material;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p4 f24161a = new p4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> f24162b = androidx.compose.runtime.internal.w.c(2057676608, false, a.f24163a);

    static final class a implements pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24163a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(ig igVar, androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.D(igVar) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2057676608, i10, -1, "androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.lambda$2057676608.<anonymous> (BackdropScaffold.kt:350)");
            }
            hg.f(igVar, null, null, c0Var, i10 & 14, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(ig igVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(igVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> a() {
        return f24162b;
    }
}
