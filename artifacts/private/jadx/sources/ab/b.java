package ab;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.ui.text.font.j0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.font.z;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f589a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final y f590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f591c = 0;

    static {
        int i10 = e.h.f2580e;
        v0.a aVar = v0.f41742b;
        f590b = z.c(j0.f(i10, aVar.m(), 0, 0, 12, null), j0.f(e.h.f2579d, aVar.k(), 0, 0, 12, null), j0.f(e.h.f2577b, aVar.c(), 0, 0, 12, null));
    }

    private b() {
    }

    @NotNull
    public final y a() {
        return f590b;
    }

    @o
    @i(name = "getFontSizeBig")
    public final long b(@Nullable c0 c0Var, int i10) {
        c0Var.E(499666956);
        if (m0.l0()) {
            m0.A0(499666956, i10, -1, "com.planner5d.library.compose.view.Planner5dTheme.<get-fontSizeBig> (Planner5dTheme.kt:24)");
        }
        long jA = cb.a.f82538a.a(e.f.f1818b3, c0Var, 48);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.A();
        return jA;
    }

    @o
    @i(name = "getFontSizeSmall")
    public final long c(@Nullable c0 c0Var, int i10) {
        c0Var.E(-534189524);
        if (m0.l0()) {
            m0.A0(-534189524, i10, -1, "com.planner5d.library.compose.view.Planner5dTheme.<get-fontSizeSmall> (Planner5dTheme.kt:20)");
        }
        long jA = cb.a.f82538a.a(e.f.f1920h3, c0Var, 48);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.A();
        return jA;
    }

    @o
    @i(name = "getFontSizeVeryVeryVeryVeryBig")
    public final long d(@Nullable c0 c0Var, int i10) {
        c0Var.E(-418091764);
        if (m0.l0()) {
            m0.A0(-418091764, i10, -1, "com.planner5d.library.compose.view.Planner5dTheme.<get-fontSizeVeryVeryVeryVeryBig> (Planner5dTheme.kt:28)");
        }
        long jA = cb.a.f82538a.a(e.f.f2055p3, c0Var, 48);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.A();
        return jA;
    }
}
