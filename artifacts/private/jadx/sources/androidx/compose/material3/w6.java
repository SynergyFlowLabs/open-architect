package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w6 f34161a = new w6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static Function2<androidx.compose.runtime.c0, Integer, Unit> f34162b = androidx.compose.runtime.internal.w.c(1863131183, false, a.f34163a);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34163a = new a();

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
                androidx.compose.runtime.m0.A0(1863131183, i10, -1, "androidx.compose.material3.ComposableSingletons$SegmentedButtonKt.lambda$1863131183.<anonymous> (SegmentedButton.kt:633)");
            }
            iw.f29388a.c(c0Var, 6);
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
        return f34162b;
    }
}
