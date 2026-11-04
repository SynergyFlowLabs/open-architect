package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q6 f32119a = new q6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static Function2<androidx.compose.runtime.c0, Integer, Unit> f32120b = androidx.compose.runtime.internal.w.c(1392012807, false, b.f32124a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static pj.n<f10, androidx.compose.runtime.c0, Integer, Unit> f32121c = androidx.compose.runtime.internal.w.c(1768941633, false, c.f32125a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static Function2<androidx.compose.runtime.c0, Integer, Unit> f32122d = androidx.compose.runtime.internal.w.c(-788244078, false, a.f32123a);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32123a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-788244078, i10, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$-788244078.<anonymous> (BottomSheetScaffold.kt:415)");
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
        public static final b f32124a = new b();

        b() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1392012807, i10, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$1392012807.<anonymous> (BottomSheetScaffold.kt:128)");
            }
            x2.f34346a.c(null, 0.0f, 0.0f, null, 0L, c0Var, androidx.profileinstaller.n.c.f73814m, 31);
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

    static final class c implements pj.n<f10, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32125a = new c();

        c() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(f10 f10Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.D(f10Var) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1768941633, i10, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$1768941633.<anonymous> (BottomSheetScaffold.kt:131)");
            }
            e10.f(f10Var, null, null, c0Var, i10 & 14, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(f10 f10Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(f10Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> a() {
        return f32122d;
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> b() {
        return f32120b;
    }

    @NotNull
    public final pj.n<f10, androidx.compose.runtime.c0, Integer, Unit> c() {
        return f32121c;
    }
}
