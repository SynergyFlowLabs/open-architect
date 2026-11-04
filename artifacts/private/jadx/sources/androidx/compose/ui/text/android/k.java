package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nBoringLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoringLayoutFactory.android.kt\nandroidx/compose/ui/text/android/BoringLayoutFactory\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,208:1\n118#2,4:209\n118#2,4:213\n*S KotlinDebug\n*F\n+ 1 BoringLayoutFactory.android.kt\nandroidx/compose/ui/text/android/BoringLayoutFactory\n*L\n78#1:209,4\n79#1:213,4\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f41407a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41408b = 0;

    private k() {
    }

    @NotNull
    public final BoringLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i10, @NotNull BoringLayout.Metrics metrics, @NotNull Layout.Alignment alignment, boolean z10, boolean z11, @Nullable TextUtils.TruncateAt truncateAt, int i11) {
        if (!(i10 >= 0)) {
            x0.a.e("negative width");
        }
        if (!(i11 >= 0)) {
            x0.a.e("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT >= 33 ? j.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, z11, truncateAt, i11) : l.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
    }

    public final boolean c(@NotNull BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return j.d(boringLayout);
        }
        return false;
    }

    @Nullable
    public final BoringLayout.Metrics d(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? j.c(charSequence, textPaint, textDirectionHeuristic) : l.c(charSequence, textPaint, textDirectionHeuristic);
    }
}
