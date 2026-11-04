package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.h2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    @NotNull
    public static final BlurMaskFilter a(float f10) {
        return new BlurMaskFilter(f10, BlurMaskFilter.Blur.NORMAL);
    }

    public static final void b(@NotNull h2 h2Var, @Nullable BlurMaskFilter blurMaskFilter) {
        h2Var.D().setMaskFilter(blurMaskFilter);
    }
}
