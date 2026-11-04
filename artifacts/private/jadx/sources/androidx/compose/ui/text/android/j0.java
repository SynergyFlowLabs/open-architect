package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(29)
final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j0 f41406a = new j0();

    private j0() {
    }

    @oj.n
    public static final void a(@NotNull Paint paint, @NotNull CharSequence charSequence, int i10, int i11, @NotNull Rect rect) {
        paint.getTextBounds(charSequence, i10, i11, rect);
    }
}
