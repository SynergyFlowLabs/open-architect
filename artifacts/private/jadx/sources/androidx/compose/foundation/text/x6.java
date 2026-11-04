package androidx.compose.foundation.text;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class x6 {
    public static final boolean a(@NotNull androidx.compose.ui.text.p3 p3Var, @NotNull androidx.compose.ui.text.f fVar, @NotNull androidx.compose.ui.text.y3 y3Var, @NotNull List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.v0>> list, int i10, boolean z10, int i11, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.text.font.y.b bVar, long j10) {
        androidx.compose.ui.text.o3 o3VarL = p3Var.l();
        if (p3Var.x().m().a()) {
            return false;
        }
        if (Intrinsics.areEqual(o3VarL.n(), fVar) && o3VarL.m().a0(y3Var) && Intrinsics.areEqual(o3VarL.i(), list) && o3VarL.g() == i10 && o3VarL.l() == z10 && androidx.compose.ui.text.style.v.i(o3VarL.h(), i11) && Intrinsics.areEqual(o3VarL.d(), dVar) && o3VarL.f() == wVar && Intrinsics.areEqual(o3VarL.e(), bVar)) {
            if (androidx.compose.ui.unit.b.r(j10) != androidx.compose.ui.unit.b.r(o3VarL.c())) {
                return false;
            }
            if (!z10 && !androidx.compose.ui.text.style.v.i(i11, androidx.compose.ui.text.style.v.f42256b.c())) {
                return true;
            }
            if (androidx.compose.ui.unit.b.p(j10) == androidx.compose.ui.unit.b.p(o3VarL.c()) && androidx.compose.ui.unit.b.o(j10) == androidx.compose.ui.unit.b.o(o3VarL.c())) {
                return true;
            }
        }
        return false;
    }

    public static final float b(@NotNull androidx.compose.ui.text.p3 p3Var, int i10) {
        if (i10 >= 0 && p3Var.l().n().length() != 0) {
            int iMin = Math.min(p3Var.x().t(i10), Math.min(p3Var.x().C() - 1, p3Var.x().q() - 1));
            if (i10 > androidx.compose.ui.text.f0.s(p3Var.x(), iMin, false, 2, null)) {
                return 0.0f;
            }
            return p3Var.x().v(iMin);
        }
        return 0.0f;
    }

    public static final boolean c(@NotNull androidx.compose.ui.text.p3 p3Var, long j10, @Nullable androidx.compose.ui.text.w3 w3Var) {
        if (w3Var == null || androidx.compose.ui.text.w3.h(w3Var.r())) {
            return false;
        }
        int iY = p3Var.y(j10);
        return d(w3Var, p3Var, j10, iY) || d(w3Var, p3Var, j10, iY - 1);
    }

    private static final boolean d(androidx.compose.ui.text.w3 w3Var, androidx.compose.ui.text.p3 p3Var, long j10, int i10) {
        return androidx.compose.ui.text.w3.e(w3Var.r(), i10) && p3Var.d(i10).f(j10);
    }
}
