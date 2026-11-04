package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.text.p3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(34)
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f41853a = new d();

    private d() {
    }

    @oj.n
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull p3 p3Var, @NotNull n0.j jVar) {
        int iS;
        int iS2;
        if (!jVar.L() && (iS = p3Var.s(jVar.B())) <= (iS2 = p3Var.s(jVar.j()))) {
            while (true) {
                builder.addVisibleLineBounds(p3Var.t(iS), p3Var.w(iS), p3Var.u(iS), p3Var.n(iS));
                if (iS == iS2) {
                    break;
                }
                iS++;
            }
        }
        return builder;
    }
}
