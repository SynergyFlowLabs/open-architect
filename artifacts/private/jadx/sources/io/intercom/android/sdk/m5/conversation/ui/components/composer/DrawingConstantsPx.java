package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
final class DrawingConstantsPx {
    private final float amplitudeDeadZone;
    private final float amplitudeSmoothingFactor;
    private final float amplitudeThreshold;
    private final float barWidth;
    private final float dotRadius;
    private final float minBarHeight;

    public DrawingConstantsPx(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.barWidth = f10;
        this.dotRadius = f11;
        this.minBarHeight = f12;
        this.amplitudeThreshold = f13;
        this.amplitudeDeadZone = f14;
        this.amplitudeSmoothingFactor = f15;
    }

    public static /* synthetic */ DrawingConstantsPx copy$default(DrawingConstantsPx drawingConstantsPx, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = drawingConstantsPx.barWidth;
        }
        if ((i10 & 2) != 0) {
            f11 = drawingConstantsPx.dotRadius;
        }
        if ((i10 & 4) != 0) {
            f12 = drawingConstantsPx.minBarHeight;
        }
        if ((i10 & 8) != 0) {
            f13 = drawingConstantsPx.amplitudeThreshold;
        }
        if ((i10 & 16) != 0) {
            f14 = drawingConstantsPx.amplitudeDeadZone;
        }
        if ((i10 & 32) != 0) {
            f15 = drawingConstantsPx.amplitudeSmoothingFactor;
        }
        float f16 = f14;
        float f17 = f15;
        return drawingConstantsPx.copy(f10, f11, f12, f13, f16, f17);
    }

    public final float component1() {
        return this.barWidth;
    }

    public final float component2() {
        return this.dotRadius;
    }

    public final float component3() {
        return this.minBarHeight;
    }

    public final float component4() {
        return this.amplitudeThreshold;
    }

    public final float component5() {
        return this.amplitudeDeadZone;
    }

    public final float component6() {
        return this.amplitudeSmoothingFactor;
    }

    @NotNull
    public final DrawingConstantsPx copy(float f10, float f11, float f12, float f13, float f14, float f15) {
        return new DrawingConstantsPx(f10, f11, f12, f13, f14, f15);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawingConstantsPx)) {
            return false;
        }
        DrawingConstantsPx drawingConstantsPx = (DrawingConstantsPx) obj;
        return Float.compare(this.barWidth, drawingConstantsPx.barWidth) == 0 && Float.compare(this.dotRadius, drawingConstantsPx.dotRadius) == 0 && Float.compare(this.minBarHeight, drawingConstantsPx.minBarHeight) == 0 && Float.compare(this.amplitudeThreshold, drawingConstantsPx.amplitudeThreshold) == 0 && Float.compare(this.amplitudeDeadZone, drawingConstantsPx.amplitudeDeadZone) == 0 && Float.compare(this.amplitudeSmoothingFactor, drawingConstantsPx.amplitudeSmoothingFactor) == 0;
    }

    public final float getAmplitudeDeadZone() {
        return this.amplitudeDeadZone;
    }

    public final float getAmplitudeSmoothingFactor() {
        return this.amplitudeSmoothingFactor;
    }

    public final float getAmplitudeThreshold() {
        return this.amplitudeThreshold;
    }

    public final float getBarWidth() {
        return this.barWidth;
    }

    public final float getDotRadius() {
        return this.dotRadius;
    }

    public final float getMinBarHeight() {
        return this.minBarHeight;
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.barWidth) * 31) + Float.hashCode(this.dotRadius)) * 31) + Float.hashCode(this.minBarHeight)) * 31) + Float.hashCode(this.amplitudeThreshold)) * 31) + Float.hashCode(this.amplitudeDeadZone)) * 31) + Float.hashCode(this.amplitudeSmoothingFactor);
    }

    @NotNull
    public String toString() {
        return "DrawingConstantsPx(barWidth=" + this.barWidth + ", dotRadius=" + this.dotRadius + ", minBarHeight=" + this.minBarHeight + ", amplitudeThreshold=" + this.amplitudeThreshold + ", amplitudeDeadZone=" + this.amplitudeDeadZone + ", amplitudeSmoothingFactor=" + this.amplitudeSmoothingFactor + ')';
    }
}
