package bb;

import androidx.compose.animation.core.p;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f77749a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f77750b = 0;

    private c() {
    }

    @o
    @NotNull
    public final n7<Float> a(boolean z10, @Nullable String str, @Nullable c0 c0Var, int i10, int i11) {
        c0Var.E(1360289304);
        if ((i11 & 2) != 0) {
            str = "TransitionAnimation";
        }
        String str2 = str;
        if (m0.l0()) {
            m0.A0(1360289304, i10, -1, "com.planner5d.library.compose.view.theme.Animation.animateTransitionAsFloatState (Animation.kt:22)");
        }
        n7<Float> n7VarF = androidx.compose.animation.core.f.f(z10 ? 1.0f : 0.0f, p.t(0, 0, null, 7, null), 0.0f, str2, null, c0Var, ((i10 << 6) & 7168) | 48, 20);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.A();
        return n7VarF;
    }
}
