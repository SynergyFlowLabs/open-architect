package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y6 f34711a = new y6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static Function2<androidx.compose.runtime.c0, Integer, Unit> f34712b = androidx.compose.runtime.internal.w.c(984817901, false, a.f34713a);

    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/ComposableSingletons$SnackbarKt$lambda$984817901$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n*L\n1#1,445:1\n75#2:446\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/ComposableSingletons$SnackbarKt$lambda$984817901$1\n*L\n229#1:446\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34713a = new a();

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
                androidx.compose.runtime.m0.A0(984817901, i10, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda$984817901.<anonymous> (Snackbar.kt:226)");
            }
            androidx.compose.ui.graphics.vector.d dVarC = androidx.compose.material3.internal.p2.b.f29069a.c();
            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
            int i11 = 2 & 0;
            ni.p(dVarC, androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.R), c0Var, 0), null, 0L, c0Var, 0, 12);
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
        return f34712b;
    }
}
