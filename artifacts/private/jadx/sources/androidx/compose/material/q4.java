package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q4 f24367a = new q4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> f24368b = androidx.compose.runtime.internal.w.c(937349512, false, c.f24373a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static Function2<androidx.compose.runtime.c0, Integer, Unit> f24369c = androidx.compose.runtime.internal.w.c(-505419337, false, a.f24371a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static Function2<androidx.compose.runtime.c0, Integer, Unit> f24370d = androidx.compose.runtime.internal.w.c(687232378, false, b.f24372a);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24371a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean z10;
            if ((i10 & 3) != 2) {
                z10 = true;
                int i11 = 3 & 1;
            } else {
                z10 = false;
            }
            if (!c0Var.h(z10, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-505419337, i10, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$-505419337.<anonymous> (BottomSheetScaffold.kt:473)");
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24372a = new b();

        b() {
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(687232378, i10, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$687232378.<anonymous> (BottomSheetScaffold.kt:476)");
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f24373a = new c();

        c() {
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
                int i11 = 0 ^ (-1);
                androidx.compose.runtime.m0.A0(937349512, i10, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$937349512.<anonymous> (BottomSheetScaffold.kt:324)");
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
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> a() {
        return f24369c;
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> b() {
        return f24370d;
    }

    @NotNull
    public final pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> c() {
        return f24368b;
    }
}
