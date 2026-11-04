package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.graphics.painter.b bVar, boolean z10, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var) {
        return a0Var.B2(new PainterElement(bVar, z10, eVar, lVar, f10, r0Var));
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.painter.b bVar, boolean z10, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, r0 r0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            eVar = androidx.compose.ui.e.f37317a.i();
        }
        androidx.compose.ui.e eVar2 = eVar;
        if ((i10 & 8) != 0) {
            lVar = androidx.compose.ui.layout.l.f39405a.k();
        }
        androidx.compose.ui.layout.l lVar2 = lVar;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            r0Var = null;
        }
        return a(a0Var, bVar, z11, eVar2, lVar2, f11, r0Var);
    }
}
