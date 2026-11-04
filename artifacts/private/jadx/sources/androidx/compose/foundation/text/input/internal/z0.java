package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(34)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z0 f20212a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20213b = 0;

    private z0() {
    }

    @oj.n
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull androidx.compose.ui.text.p3 p3Var, @NotNull n0.j jVar) {
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
