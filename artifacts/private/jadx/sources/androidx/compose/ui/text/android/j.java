package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(33)
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f41405a = new j();

    private j() {
    }

    @oj.n
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i10, @NotNull Layout.Alignment alignment, float f10, float f11, @NotNull BoringLayout.Metrics metrics, boolean z10, boolean z11, @Nullable TextUtils.TruncateAt truncateAt, int i11) {
        return i.a(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11, z11);
    }

    @oj.n
    @Nullable
    public static final BoringLayout.Metrics c(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    @oj.n
    public static final boolean d(@NotNull BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
