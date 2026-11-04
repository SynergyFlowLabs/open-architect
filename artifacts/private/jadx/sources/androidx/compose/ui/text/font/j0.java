package androidx.compose.ui.text.font;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 {
    @androidx.compose.ui.text.v
    @NotNull
    public static final x a(int i10, @NotNull v0 v0Var, int i11, int i12, @NotNull u0.e eVar) {
        return new l1(i10, v0Var, i11, eVar, i12, null);
    }

    public static /* synthetic */ x b(int i10, v0 v0Var, int i11, int i12, u0.e eVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            v0Var = v0.f41742b.m();
        }
        if ((i13 & 4) != 0) {
            i11 = q0.f41690b.c();
        }
        if ((i13 & 8) != 0) {
            i12 = o0.f41676b.b();
        }
        if ((i13 & 16) != 0) {
            eVar = u0.f41723a.b(v0Var, i11, new u0.a[0]);
        }
        return a(i10, v0Var, i11, i12, eVar);
    }

    @k7
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @kotlin.b1(expression = "Font(resId, weight, style)", imports = {}))
    public static final /* synthetic */ x c(int i10, v0 v0Var, int i11) {
        return new l1(i10, v0Var, i11, null, o0.f41676b.b(), 8, null);
    }

    public static /* synthetic */ x d(int i10, v0 v0Var, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            v0Var = v0.f41742b.m();
        }
        if ((i12 & 4) != 0) {
            i11 = q0.f41690b.c();
        }
        return c(i10, v0Var, i11);
    }

    @k7
    @NotNull
    public static final x e(int i10, @NotNull v0 v0Var, int i11, int i12) {
        return new l1(i10, v0Var, i11, new u0.e(new u0.a[0]), i12, null);
    }

    public static /* synthetic */ x f(int i10, v0 v0Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            v0Var = v0.f41742b.m();
        }
        if ((i13 & 4) != 0) {
            i11 = q0.f41690b.c();
        }
        if ((i13 & 8) != 0) {
            i12 = o0.f41676b.b();
        }
        return e(i10, v0Var, i11, i12);
    }

    @k7
    @NotNull
    public static final y g(@NotNull x xVar) {
        return z.c(xVar);
    }
}
