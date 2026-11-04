package com.canhub.cropper.core;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Animation implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ImageView f97756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CropOverlayView f97757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final float[] f97758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final float[] f97759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final RectF f97760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final RectF f97761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final float[] f97762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final float[] f97763h;

    public e(@NotNull ImageView imageView, @NotNull CropOverlayView cropOverlayView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(cropOverlayView, "cropOverlayView");
        this.f97756a = imageView;
        this.f97757b = cropOverlayView;
        this.f97758c = new float[8];
        this.f97759d = new float[8];
        this.f97760e = new RectF();
        this.f97761f = new RectF();
        this.f97762g = new float[9];
        this.f97763h = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void a(@NotNull float[] boundPoints, @NotNull Matrix imageMatrix) {
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        System.arraycopy(boundPoints, 0, this.f97759d, 0, 8);
        this.f97761f.set(this.f97757b.getCropWindowRect());
        imageMatrix.getValues(this.f97763h);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, @NotNull Transformation t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f97760e;
        float f11 = rectF2.left;
        RectF rectF3 = this.f97761f;
        rectF.left = f11 + ((rectF3.left - f11) * f10);
        float f12 = rectF2.top;
        rectF.top = f12 + ((rectF3.top - f12) * f10);
        float f13 = rectF2.right;
        rectF.right = f13 + ((rectF3.right - f13) * f10);
        float f14 = rectF2.bottom;
        rectF.bottom = f14 + ((rectF3.bottom - f14) * f10);
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            float f15 = this.f97758c[i10];
            fArr[i10] = f15 + ((this.f97759d[i10] - f15) * f10);
        }
        CropOverlayView cropOverlayView = this.f97757b;
        cropOverlayView.setCropWindowRect(rectF);
        cropOverlayView.w(fArr, this.f97756a.getWidth(), this.f97756a.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i11 = 0; i11 < 9; i11++) {
            float f16 = this.f97762g[i11];
            fArr2[i11] = f16 + ((this.f97763h[i11] - f16) * f10);
        }
        ImageView imageView = this.f97756a;
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    public final void b(@NotNull float[] boundPoints, @NotNull Matrix imageMatrix) {
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        reset();
        System.arraycopy(boundPoints, 0, this.f97758c, 0, 8);
        this.f97760e.set(this.f97757b.getCropWindowRect());
        imageMatrix.getValues(this.f97762g);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f97756a.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
