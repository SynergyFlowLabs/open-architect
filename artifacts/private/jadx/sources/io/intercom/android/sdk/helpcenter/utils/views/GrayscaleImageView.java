package io.intercom.android.sdk.helpcenter.utils.views;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class GrayscaleImageView extends AppCompatImageView {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrayscaleImageView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
    }

    public final void setGrayscale(int i10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1 - (i10 / 100));
        setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }
}
