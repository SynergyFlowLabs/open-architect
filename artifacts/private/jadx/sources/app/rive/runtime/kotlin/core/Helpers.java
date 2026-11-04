package app.rive.runtime.kotlin.core;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Helpers {

    @NotNull
    public static final Helpers INSTANCE = new Helpers();

    private Helpers() {
    }

    public static /* synthetic */ PointF convertToArtboardSpace$default(Helpers helpers, RectF rectF, PointF pointF, Fit fit, Alignment alignment, RectF rectF2, float f10, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            f10 = 1.0f;
        }
        return helpers.convertToArtboardSpace(rectF, pointF, fit, alignment, rectF2, f10);
    }

    private final native PointF cppConvertToArtboardSpace(RectF rectF, PointF pointF, Fit fit, Alignment alignment, RectF rectF2, float f10);

    @NotNull
    public final PointF convertToArtboardSpace(@NotNull RectF touchBounds, @NotNull PointF touchLocation, @NotNull Fit fit, @NotNull Alignment alignment, @NotNull RectF artboardBounds, float f10) {
        Intrinsics.checkNotNullParameter(touchBounds, "touchBounds");
        Intrinsics.checkNotNullParameter(touchLocation, "touchLocation");
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(artboardBounds, "artboardBounds");
        return cppConvertToArtboardSpace(touchBounds, touchLocation, fit, alignment, artboardBounds, f10);
    }
}
