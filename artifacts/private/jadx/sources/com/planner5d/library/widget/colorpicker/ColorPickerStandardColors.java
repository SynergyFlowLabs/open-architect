package com.planner5d.library.widget.colorpicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nColorPickerStandardColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorPickerStandardColors.kt\ncom/planner5d/library/widget/colorpicker/ColorPickerStandardColors\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public final class ColorPickerStandardColors extends View {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f254223t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.github.danielnilsson9.colorpickerview.view.b.c f254224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Paint f254225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Paint f254226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Paint f254227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f254228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final RectF f254229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final RectF f254230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final RectF f254231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final RectF f254232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final RectF f254233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final RectF f254234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f254235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f254236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f254237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f254238o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private com.github.danielnilsson9.colorpickerview.view.b.InterfaceC0931b f254239s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPickerStandardColors(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int a(int i10, int i11) {
        if (View.MeasureSpec.getMode(i11) != 0) {
            i10 = Math.min(i10, View.MeasureSpec.getSize(i11));
        }
        return View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
    }

    public static /* synthetic */ void getListenerOnColorChanged$annotations() {
    }

    public final void b(@Nullable Integer num, @Nullable Integer num2) {
        if (num != null) {
            this.f254235l = num.intValue();
        }
        if (num2 != null) {
            this.f254236m = num2.intValue();
        }
        invalidate();
    }

    @Nullable
    public final com.github.danielnilsson9.colorpickerview.view.b.InterfaceC0931b getListenerOnColorChanged() {
        return this.f254239s;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f254225b.setColor(-1);
        RectF rectF = this.f254229f;
        float f10 = this.f254237n;
        canvas.drawRoundRect(rectF, f10, f10, this.f254225b);
        RectF rectF2 = this.f254229f;
        canvas.drawLine(rectF2.left, rectF2.bottom, rectF2.right, rectF2.top, this.f254227d);
        this.f254234k.set(this.f254229f);
        RectF rectF3 = this.f254234k;
        float f11 = this.f254228e;
        rectF3.inset(f11, f11);
        RectF rectF4 = this.f254234k;
        float f12 = this.f254237n;
        canvas.drawRoundRect(rectF4, f12, f12, this.f254226c);
        this.f254225b.setColor(this.f254236m);
        RectF rectF5 = this.f254230g;
        float f13 = this.f254237n;
        canvas.drawRoundRect(rectF5, f13, f13, this.f254225b);
        this.f254225b.setColor(this.f254235l);
        RectF rectF6 = this.f254231h;
        float f14 = this.f254237n;
        canvas.drawRoundRect(rectF6, f14, f14, this.f254225b);
        canvas.drawRect(this.f254232i, this.f254225b);
        this.f254234k.set(this.f254230g);
        RectF rectF7 = this.f254234k;
        float f15 = this.f254228e;
        rectF7.inset(f15, f15);
        RectF rectF8 = this.f254234k;
        float f16 = this.f254237n;
        canvas.drawRoundRect(rectF8, f16, f16, this.f254226c);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12 = this.f254238o;
        com.github.danielnilsson9.colorpickerview.view.b.c cVar = this.f254224a;
        setMeasuredDimension(a(i12 + cVar.f102953g + cVar.f102954h, i10), a(this.f254224a.f102954h, i11));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f254229f.set(i10 - i11, 0.0f, i10, i11);
        this.f254230g.set(this.f254229f);
        RectF rectF = this.f254230g;
        float f10 = rectF.left - this.f254224a.f102953g;
        rectF.right = f10;
        rectF.left = f10 - this.f254238o;
        this.f254231h.set(rectF);
        float f11 = 2;
        this.f254231h.right -= this.f254230g.width() / f11;
        this.f254232i.set(this.f254231h);
        RectF rectF2 = this.f254232i;
        rectF2.left += rectF2.width() / f11;
        this.f254233j.set(this.f254230g);
        this.f254233j.left += this.f254230g.width() / f11;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        int i10;
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f254231h.contains(motionEvent.getX(), motionEvent.getY())) {
            i10 = this.f254235l;
        } else if (this.f254233j.contains(motionEvent.getX(), motionEvent.getY())) {
            i10 = this.f254236m;
        } else {
            if (!this.f254229f.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
            i10 = -1;
        }
        com.github.danielnilsson9.colorpickerview.view.b.InterfaceC0931b interfaceC0931b = this.f254239s;
        if (interfaceC0931b != null) {
            interfaceC0931b.a(i10);
        }
        performClick();
        return true;
    }

    public final void setListenerOnColorChanged(@Nullable com.github.danielnilsson9.colorpickerview.view.b.InterfaceC0931b interfaceC0931b) {
        this.f254239s = interfaceC0931b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPickerStandardColors(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPickerStandardColors(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.f254225b = paint;
        Paint paint2 = new Paint(paint);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(570425344);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(c1.f.Jc));
        this.f254226c = paint2;
        Paint paint3 = new Paint(paint2);
        paint3.setColor(l1.a.f316127c);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint3.setStrokeWidth(paint3.getStrokeWidth() * 1.5f);
        this.f254227d = paint3;
        this.f254228e = paint2.getStrokeWidth() / 2.0f;
        this.f254229f = new RectF();
        this.f254230g = new RectF();
        this.f254231h = new RectF();
        this.f254232i = new RectF();
        this.f254233j = new RectF();
        this.f254234k = new RectF();
        this.f254235l = -1;
        this.f254236m = -16777216;
        com.github.danielnilsson9.colorpickerview.view.b.c cVar = new com.github.danielnilsson9.colorpickerview.view.b.c(context);
        this.f254224a = cVar;
        this.f254237n = cVar.f102952f;
        this.f254238o = context.getResources().getDimensionPixelSize(c1.f.Ld);
        setLayerType(1, null);
    }
}
