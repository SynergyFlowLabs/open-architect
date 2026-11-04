package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s6 f32739a = new s6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static Function2<androidx.compose.runtime.c0, Integer, Unit> f32740b = androidx.compose.runtime.internal.w.c(1121996006, false, b.f32744a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static Function2<androidx.compose.runtime.c0, Integer, Unit> f32741c = androidx.compose.runtime.internal.w.c(-655173438, false, a.f32743a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static Function2<androidx.compose.runtime.c0, Integer, Unit> f32742d = androidx.compose.runtime.internal.w.c(1716959002, false, c.f32745a);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32743a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-655173438, i10, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda$-655173438.<anonymous> (ModalBottomSheet.kt:232)");
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

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32744a = new b();

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
                androidx.compose.runtime.m0.A0(1121996006, i10, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda$1121996006.<anonymous> (ModalBottomSheet.kt:133)");
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

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32745a = new c();

        c() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1716959002, i10, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda$1716959002.<anonymous> (ModalBottomSheet.kt:269)");
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

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> a() {
        return f32741c;
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> b() {
        return f32740b;
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> c() {
        return f32742d;
    }
}
