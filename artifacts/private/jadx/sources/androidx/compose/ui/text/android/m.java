package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(23)
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f41410a = new m();

    private m() {
    }

    public final void a(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @NotNull Paint paint) {
        canvas.drawTextRun(charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    public final void b(@NotNull Canvas canvas, @NotNull char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @NotNull Paint paint) {
        canvas.drawTextRun(cArr, i10, i11, i12, i13, f10, f11, z10, paint);
    }
}
