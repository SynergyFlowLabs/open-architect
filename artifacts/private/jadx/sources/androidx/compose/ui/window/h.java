package androidx.compose.ui.window;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f42928a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static Function2<c0, Integer, Unit> f42929b = w.c(210148896, false, a.f42930a);

    static final class a extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42930a = new a();

        a() {
            super(2);
        }

        @androidx.compose.runtime.o
        public final void c(c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(210148896, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda$210148896.<anonymous> (AndroidDialog.android.kt:247)");
            }
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final Function2<c0, Integer, Unit> a() {
        return f42929b;
    }
}
