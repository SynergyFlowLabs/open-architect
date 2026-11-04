package io.intercom.android.sdk.utilities.coil;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q4.a;
import q4.c;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class RoundedCornersAnimatedTransformation implements a {
    public static final int $stable = 0;
    private final float radius;

    public RoundedCornersAnimatedTransformation(float f10) {
        this.radius = f10;
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // q4.a
    @NotNull
    public c transform(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = new Paint(3);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        float f10 = this.radius;
        path.addRoundRect(0.0f, 0.0f, width, height, f10, f10, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return c.TRANSLUCENT;
    }
}
