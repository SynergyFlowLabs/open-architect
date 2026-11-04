package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRoundedCornersLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornersLayout.kt\ncom/planner5d/library/widget/RoundedCornersLayout\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n228#2:114\n1#3:115\n*S KotlinDebug\n*F\n+ 1 RoundedCornersLayout.kt\ncom/planner5d/library/widget/RoundedCornersLayout\n*L\n45#1:114\n45#1:115\n*E\n"})
public class RoundedCornersLayout extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f249503l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Path f249504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rect f249505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final RectF f249506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final RectF f249507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f249508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f249509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f249510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Paint f249511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f249512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f249513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f249514k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public RoundedCornersLayout(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void a(Canvas canvas) {
        canvas.getClipBounds(this.f249505b);
        if (this.f249506c.equals(this.f249505b)) {
            return;
        }
        this.f249507d.set(this.f249505b);
        Rect rect = this.f249505b;
        int i10 = this.f249509f;
        rect.inset(i10, i10);
        this.f249506c.set(this.f249505b);
        this.f249504a.reset();
        Path path = this.f249504a;
        RectF rectF = this.f249506c;
        float f10 = this.f249513j;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CCW);
    }

    private final void b() {
        this.f249513j = this.f249514k ? 0.0f : this.f249508e;
    }

    private final void setNoRoundedCorners(boolean z10) {
        if (this.f249514k == z10) {
            return;
        }
        this.f249514k = z10;
        b();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long j10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        a(canvas);
        RectF rectF = this.f249507d;
        float f10 = this.f249513j;
        canvas.drawRoundRect(rectF, f10, f10, this.f249511h);
        canvas.save();
        canvas.clipPath(this.f249504a);
        boolean zDrawChild = super.drawChild(canvas, child, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Paint paint = this.f249511h;
        ColorStateList colorStateList = this.f249510g;
        if (colorStateList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("borderColor");
            colorStateList = null;
        }
        paint.setColor(colorStateList.getColorForState(getDrawableState(), 0));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f249512i) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                setNoRoundedCorners(getMeasuredWidth() == view.getMeasuredWidth());
                this.f249506c.setEmpty();
            }
        }
    }

    public final void setBorderColor(@androidx.annotation.l int i10) {
        this.f249510g = ColorStateList.valueOf(i10);
    }

    public final void setBorderWidth(int i10) {
        this.f249509f = i10;
        invalidate();
    }

    public final void setCornerRadius(float f10) {
        this.f249508e = f10;
        b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public RoundedCornersLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public RoundedCornersLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoundedCornersLayout(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public RoundedCornersLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249504a = new Path();
        this.f249505b = new Rect();
        this.f249506c = new RectF();
        this.f249507d = new RectF();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(false);
        paint.setAntiAlias(true);
        this.f249511h = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.Aw, i10, i11);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c1.s.Bw, 0);
        this.f249508e = dimensionPixelSize;
        this.f249513j = dimensionPixelSize;
        this.f249509f = typedArrayObtainStyledAttributes.getDimensionPixelSize(c1.s.Ew, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.hasValue(c1.s.Dw) ? typedArrayObtainStyledAttributes.getColorStateList(c1.s.Dw) : null;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(colorStateList, "valueOf(...)");
        }
        this.f249510g = colorStateList;
        this.f249512i = typedArrayObtainStyledAttributes.getBoolean(c1.s.Cw, false);
        Unit unit = Unit.f312394a;
        typedArrayObtainStyledAttributes.recycle();
        setClipChildren(false);
    }
}
