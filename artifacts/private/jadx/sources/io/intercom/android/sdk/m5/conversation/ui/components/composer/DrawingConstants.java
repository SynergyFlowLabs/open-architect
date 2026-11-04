package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
final class DrawingConstants {
    private final float amplitudeDeadZone;
    private final float amplitudeSmoothingFactor;
    private final float amplitudeThreshold;
    private final float barWidth;
    private final float dotRadius;
    private final float minBarHeight;

    public /* synthetic */ DrawingConstants(float f10, float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15);
    }

    /* JADX INFO: renamed from: copy-yajeYGU$default, reason: not valid java name */
    public static /* synthetic */ DrawingConstants m259copyyajeYGU$default(DrawingConstants drawingConstants, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = drawingConstants.barWidth;
        }
        if ((i10 & 2) != 0) {
            f11 = drawingConstants.dotRadius;
        }
        if ((i10 & 4) != 0) {
            f12 = drawingConstants.minBarHeight;
        }
        if ((i10 & 8) != 0) {
            f13 = drawingConstants.amplitudeThreshold;
        }
        if ((i10 & 16) != 0) {
            f14 = drawingConstants.amplitudeDeadZone;
        }
        if ((i10 & 32) != 0) {
            f15 = drawingConstants.amplitudeSmoothingFactor;
        }
        float f16 = f14;
        float f17 = f15;
        return drawingConstants.m263copyyajeYGU(f10, f11, f12, f13, f16, f17);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m260component1D9Ej5fM() {
        return this.barWidth;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m261component2D9Ej5fM() {
        return this.dotRadius;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m262component3D9Ej5fM() {
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
    /* JADX INFO: renamed from: copy-yajeYGU, reason: not valid java name */
    public final DrawingConstants m263copyyajeYGU(float f10, float f11, float f12, float f13, float f14, float f15) {
        return new DrawingConstants(f10, f11, f12, f13, f14, f15, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawingConstants)) {
            return false;
        }
        DrawingConstants drawingConstants = (DrawingConstants) obj;
        return androidx.compose.ui.unit.h.x(this.barWidth, drawingConstants.barWidth) && androidx.compose.ui.unit.h.x(this.dotRadius, drawingConstants.dotRadius) && androidx.compose.ui.unit.h.x(this.minBarHeight, drawingConstants.minBarHeight) && Float.compare(this.amplitudeThreshold, drawingConstants.amplitudeThreshold) == 0 && Float.compare(this.amplitudeDeadZone, drawingConstants.amplitudeDeadZone) == 0 && Float.compare(this.amplitudeSmoothingFactor, drawingConstants.amplitudeSmoothingFactor) == 0;
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

    /* JADX INFO: renamed from: getBarWidth-D9Ej5fM, reason: not valid java name */
    public final float m264getBarWidthD9Ej5fM() {
        return this.barWidth;
    }

    /* JADX INFO: renamed from: getDotRadius-D9Ej5fM, reason: not valid java name */
    public final float m265getDotRadiusD9Ej5fM() {
        return this.dotRadius;
    }

    /* JADX INFO: renamed from: getMinBarHeight-D9Ej5fM, reason: not valid java name */
    public final float m266getMinBarHeightD9Ej5fM() {
        return this.minBarHeight;
    }

    public int hashCode() {
        return (((((((((androidx.compose.ui.unit.h.D(this.barWidth) * 31) + androidx.compose.ui.unit.h.D(this.dotRadius)) * 31) + androidx.compose.ui.unit.h.D(this.minBarHeight)) * 31) + Float.hashCode(this.amplitudeThreshold)) * 31) + Float.hashCode(this.amplitudeDeadZone)) * 31) + Float.hashCode(this.amplitudeSmoothingFactor);
    }

    @NotNull
    public final DrawingConstantsPx toPx(float f10) {
        return new DrawingConstantsPx(this.barWidth * f10, this.dotRadius * f10, this.minBarHeight * f10, this.amplitudeThreshold, this.amplitudeDeadZone, this.amplitudeSmoothingFactor);
    }

    @NotNull
    public String toString() {
        return "DrawingConstants(barWidth=" + ((Object) androidx.compose.ui.unit.h.M(this.barWidth)) + ", dotRadius=" + ((Object) androidx.compose.ui.unit.h.M(this.dotRadius)) + ", minBarHeight=" + ((Object) androidx.compose.ui.unit.h.M(this.minBarHeight)) + ", amplitudeThreshold=" + this.amplitudeThreshold + ", amplitudeDeadZone=" + this.amplitudeDeadZone + ", amplitudeSmoothingFactor=" + this.amplitudeSmoothingFactor + ')';
    }

    private DrawingConstants(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.barWidth = f10;
        this.dotRadius = f11;
        this.minBarHeight = f12;
        this.amplitudeThreshold = f13;
        this.amplitudeDeadZone = f14;
        this.amplitudeSmoothingFactor = f15;
    }
}
