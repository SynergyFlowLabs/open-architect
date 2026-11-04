package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@a0
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y0 f41451a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a1 f41452b = new m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41453c = 8;

    private y0() {
    }

    @NotNull
    public final StaticLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i10, int i11, int i12, @NotNull TextDirectionHeuristic textDirectionHeuristic, @NotNull Layout.Alignment alignment, @androidx.annotation.g0(from = 0) int i13, @Nullable TextUtils.TruncateAt truncateAt, @androidx.annotation.g0(from = 0) int i14, @androidx.annotation.x(from = 0.0d) float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return f41452b.a(new c1(charSequence, i11, i12, textPaint, i10, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2));
    }

    public final boolean c(@NotNull StaticLayout staticLayout, boolean z10) {
        return f41452b.b(staticLayout, z10);
    }
}
