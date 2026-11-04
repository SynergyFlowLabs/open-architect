package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.VectorDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVectorRatingBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorRatingBar.kt\ncom/planner5d/library/widget/VectorRatingBar\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 4 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,131:1\n51#2,9:132\n89#3:141\n89#3:143\n27#4:142\n27#4:144\n*S KotlinDebug\n*F\n+ 1 VectorRatingBar.kt\ncom/planner5d/library/widget/VectorRatingBar\n*L\n32#1:132,9\n103#1:141\n110#1:143\n106#1:142\n118#1:144\n*E\n"})
public final class VectorRatingBar extends androidx.appcompat.widget.b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f249538g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f249539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f249540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Bitmap f249541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final float[] f249542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final RoundRectShape f249543f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public VectorRatingBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final BitmapDrawable a(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth() + ((int) (this.f249539b * 2)), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i10 = 2 | 0;
        drawable.setBounds((int) this.f249539b, 0, canvas.getWidth() - ((int) this.f249539b), canvas.getHeight());
        drawable.draw(canvas);
        this.f249540c = true;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return new BitmapDrawable(resources, bitmapCreateBitmap);
    }

    private final Drawable b(BitmapDrawable bitmapDrawable, boolean z10) {
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (this.f249541d == null) {
            this.f249541d = bitmap;
        }
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        ShapeDrawable shapeDrawable = new ShapeDrawable(this.f249543f);
        shapeDrawable.getPaint().setShader(bitmapShader);
        shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
        return z10 ? new ClipDrawable(shapeDrawable, androidx.core.view.d0.f48643b, 1) : shapeDrawable;
    }

    private final Drawable c(DrawableWrapper drawableWrapper, boolean z10) {
        Drawable drawable = drawableWrapper.getDrawable();
        if (drawable != null) {
            drawableWrapper.setDrawable(e(drawable, z10));
        }
        return drawableWrapper;
    }

    private final Drawable d(LayerDrawable layerDrawable, boolean z10) {
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i10 = 0; i10 < numberOfLayers; i10++) {
            int id2 = layerDrawable.getId(i10);
            Drawable drawable = layerDrawable.getDrawable(i10);
            Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
            drawableArr[i10] = e(drawable, id2 == 16908301 || id2 == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i11 = 0; i11 < numberOfLayers; i11++) {
            layerDrawable2.setId(i11, layerDrawable.getId(i11));
        }
        return layerDrawable2;
    }

    private final Drawable e(Drawable drawable, boolean z10) {
        if (this.f249539b != 0.0f && !this.f249540c) {
            drawable = a(drawable);
        }
        if (drawable instanceof DrawableWrapper) {
            return c((DrawableWrapper) drawable, z10);
        }
        if (drawable instanceof LayerDrawable) {
            return d((LayerDrawable) drawable, z10);
        }
        if (drawable instanceof BitmapDrawable) {
            return b((BitmapDrawable) drawable, z10);
        }
        return drawable instanceof VectorDrawable ? e(f(drawable), z10) : drawable;
    }

    private final BitmapDrawable f(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return new BitmapDrawable(resources, bitmapCreateBitmap);
    }

    @Override // androidx.appcompat.widget.b0, android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(i10, i11);
            Bitmap bitmap = this.f249541d;
            if (bitmap != null) {
                int i12 = 1 >> 0;
                setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public VectorRatingBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VectorRatingBar(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public VectorRatingBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] VectorRatingBar = c1.s.nE;
        Intrinsics.checkNotNullExpressionValue(VectorRatingBar, "VectorRatingBar");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VectorRatingBar, 0, 0);
        this.f249539b = typedArrayObtainStyledAttributes.getDimension(c1.s.oE, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        Drawable progressDrawable = getProgressDrawable();
        Intrinsics.checkNotNullExpressionValue(progressDrawable, "getProgressDrawable(...)");
        setProgressDrawable(e(progressDrawable, false));
        float[] fArr = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
        this.f249542e = fArr;
        this.f249543f = new RoundRectShape(fArr, null, null);
    }
}
