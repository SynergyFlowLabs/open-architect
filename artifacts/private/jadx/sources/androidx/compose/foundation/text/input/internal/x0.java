package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(33)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x0 f20196a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20197b = 0;

    private x0() {
    }

    @oj.n
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull n0.j jVar) {
        return builder.setEditorBoundsInfo(w0.a().setEditorBounds(androidx.compose.ui.graphics.c3.c(jVar)).setHandwritingBounds(androidx.compose.ui.graphics.c3.c(jVar)).build());
    }
}
