package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.graphics.c3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(33)
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f41824a = new c();

    private c() {
    }

    @oj.n
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull n0.j jVar) {
        return builder.setEditorBoundsInfo(androidx.compose.foundation.text.input.internal.w0.a().setEditorBounds(c3.c(jVar)).setHandwritingBounds(c3.c(jVar)).build());
    }
}
