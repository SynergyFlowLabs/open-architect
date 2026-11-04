package com.planner5d.library.widget.tooltip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.services.utility.m1;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTooltipContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TooltipContainerView.kt\ncom/planner5d/library/widget/tooltip/TooltipContainerView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,119:1\n228#2:120\n1#3:121\n161#4,8:122\n161#4,8:130\n27#5,7:138\n*S KotlinDebug\n*F\n+ 1 TooltipContainerView.kt\ncom/planner5d/library/widget/tooltip/TooltipContainerView\n*L\n28#1:120\n28#1:121\n65#1:122,8\n35#1:130,8\n96#1:138,7\n*E\n"})
public final class TooltipContainerView extends ConstraintLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f258845f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.widget.tooltip.a f258846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Paint f258847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f258848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Path f258849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final RectF f258850e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f258851a;

        static {
            int[] iArr = new int[com.planner5d.library.widget.tooltip.a.values().length];
            try {
                iArr[com.planner5d.library.widget.tooltip.a.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.widget.tooltip.a.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f258851a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public TooltipContainerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float getBottomAdditionalPadding() {
        if (this.f258846a == com.planner5d.library.widget.tooltip.a.BOTTOM) {
            return getPointerHeight();
        }
        return 0.0f;
    }

    private final float getTopAdditionalPadding() {
        if (this.f258846a == com.planner5d.library.widget.tooltip.a.TOP) {
            return getPointerHeight();
        }
        return 0.0f;
    }

    public final float getPointerHeight() {
        return this.f258850e.height();
    }

    @NotNull
    public final com.planner5d.library.widget.tooltip.a getPointerPosition() {
        return this.f258846a;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float fFloor = (float) Math.floor(getTopAdditionalPadding());
        float width = getWidth();
        float height = getHeight() - ((float) Math.floor(getBottomAdditionalPadding()));
        float f10 = this.f258848c;
        canvas.drawRoundRect(0.0f, fFloor, width, height, f10, f10, this.f258847b);
        int iSave = canvas.save();
        try {
            int i10 = a.f258851a[this.f258846a.ordinal()];
            if (i10 == 1) {
                canvas.translate(canvas.getWidth(), 0.0f);
                canvas.rotate(180.0f);
                float f11 = 2;
                canvas.translate((canvas.getWidth() / f11) - (this.f258850e.width() / f11), -getPointerHeight());
            } else {
                if (i10 != 2) {
                    throw new k0();
                }
                float f12 = 2;
                canvas.translate((canvas.getWidth() / f12) - (this.f258850e.width() / f12), canvas.getHeight() - getPointerHeight());
            }
            canvas.drawPath(this.f258849d, this.f258847b);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        m1 m1Var = m1.f225329a;
        super.setPadding(i10, i11 + m1Var.a(getTopAdditionalPadding()), i12, i13 + m1Var.a(getBottomAdditionalPadding()));
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        m1 m1Var = m1.f225329a;
        super.setPaddingRelative(i10, i11 + m1Var.a(getTopAdditionalPadding()), i12, i13 + m1Var.a(getBottomAdditionalPadding()));
    }

    public final void setPointerPosition(@NotNull com.planner5d.library.widget.tooltip.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int paddingTop = getPaddingTop();
        m1 m1Var = m1.f225329a;
        int iA = paddingTop - m1Var.a(getTopAdditionalPadding());
        int paddingBottom = getPaddingBottom() - m1Var.a(getBottomAdditionalPadding());
        this.f258846a = value;
        setPadding(getPaddingLeft(), iA, getPaddingRight(), paddingBottom);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public TooltipContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TooltipContainerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public TooltipContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.CD);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        com.planner5d.library.widget.tooltip.a aVarA = com.planner5d.library.widget.tooltip.a.f258852b.a(typedArrayObtainStyledAttributes.getInt(c1.s.DD, com.planner5d.library.widget.tooltip.a.BOTTOM.l()));
        typedArrayObtainStyledAttributes.recycle();
        this.f258846a = aVarA;
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(c1.e.Fl));
        this.f258847b = paint;
        this.f258848c = getResources().getDimension(c1.f.Sc);
        Path path = new Path();
        float f10 = getResources().getDisplayMetrics().density;
        path.moveTo(0.0f, 0.0f);
        float f11 = 5.8787f * f10;
        path.lineTo(f11, f11);
        float f12 = 1.1716f * f10;
        path.rCubicTo(f12, f12, f10 * 3.071f, f12, f10 * 4.2426f, 0.0f);
        path.lineTo(f10 * 16.0f, 0.0f);
        path.close();
        this.f258849d = path;
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f258850e = rectF;
        setWillNotDraw(false);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
}
