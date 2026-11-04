package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a2 f18759a = new a2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> f18760b = androidx.compose.runtime.internal.w.c(559628295, false, a.f18761a);

    static final class a implements pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18761a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.p(scheme = "[0[0]]")
        public final void c(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.k0(function2) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(559628295, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda$559628295.<anonymous> (CoreTextField.kt:209)");
            }
            function2.invoke(c0Var, Integer.valueOf(i10 & 14));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit> function2, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(function2, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> a() {
        return f18760b;
    }
}
