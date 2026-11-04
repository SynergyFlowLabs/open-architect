package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.g0;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialCardView extends CardView implements Checkable, t {
    public static final int H1 = 8388691;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f111673g3 = 8388693;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f111675p0 = "androidx.cardview.widget.CardView";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f111676p1 = 8388659;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f111677p2 = 8388661;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f111681w = "MaterialCardView";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.card.b f111682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f111683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f111684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f111685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f111686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f111674o = {R.attr.state_checkable};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f111678s = {R.attr.state_checked};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f111679t = {r6.a.c.f359204dh};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f111680v = r6.a.n.Ti;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f111682j.l().getBounds());
        return rectF;
    }

    private void j() {
        this.f111682j.k();
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f111682j.m();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f111682j.n();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    @p0
    public Drawable getCheckedIcon() {
        return this.f111682j.o();
    }

    public int getCheckedIconGravity() {
        return this.f111682j.p();
    }

    @r
    public int getCheckedIconMargin() {
        return this.f111682j.q();
    }

    @r
    public int getCheckedIconSize() {
        return this.f111682j.r();
    }

    @p0
    public ColorStateList getCheckedIconTint() {
        return this.f111682j.s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f111682j.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f111682j.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f111682j.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f111682j.C().top;
    }

    @x(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f111682j.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f111682j.u();
    }

    public ColorStateList getRippleColor() {
        return this.f111682j.x();
    }

    @Override // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f111682j.y();
    }

    @l
    @Deprecated
    public int getStrokeColor() {
        return this.f111682j.z();
    }

    @p0
    public ColorStateList getStrokeColorStateList() {
        return this.f111682j.A();
    }

    @r
    public int getStrokeWidth() {
        return this.f111682j.B();
    }

    @Override // androidx.cardview.widget.CardView
    public void h(int i10, int i11, int i12, int i13) {
        this.f111682j.b0(i10, i11, i12, i13);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f111684l;
    }

    public boolean k() {
        com.google.android.material.card.b bVar = this.f111682j;
        return bVar != null && bVar.F();
    }

    public boolean l() {
        return this.f111685m;
    }

    void m(int i10, int i11, int i12, int i13) {
        super.h(i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f111682j.f0();
        com.google.android.material.shape.l.f(this, this.f111682j.l());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (k()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f111674o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f111678s);
        }
        if (l()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f111679t);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f111675p0);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f111675p0);
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f111682j.J(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f111683k) {
            if (!this.f111682j.E()) {
                this.f111682j.K(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@l int i10) {
        this.f111682j.L(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f111682j.h0();
    }

    public void setCardForegroundColor(@p0 ColorStateList colorStateList) {
        this.f111682j.M(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f111682j.N(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f111684l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(@p0 Drawable drawable) {
        this.f111682j.Q(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f111682j.p() != i10) {
            this.f111682j.R(i10);
        }
    }

    public void setCheckedIconMargin(@r int i10) {
        this.f111682j.S(i10);
    }

    public void setCheckedIconMarginResource(@q int i10) {
        if (i10 != -1) {
            this.f111682j.S(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(@v int i10) {
        this.f111682j.Q(j.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(@r int i10) {
        this.f111682j.T(i10);
    }

    public void setCheckedIconSizeResource(@q int i10) {
        if (i10 != 0) {
            this.f111682j.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(@p0 ColorStateList colorStateList) {
        this.f111682j.U(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        com.google.android.material.card.b bVar = this.f111682j;
        if (bVar != null) {
            bVar.f0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f111685m != z10) {
            this.f111685m = z10;
            refreshDrawableState();
            j();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f111682j.j0();
    }

    public void setOnCheckedChangeListener(@p0 b bVar) {
        this.f111686n = bVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f111682j.j0();
        this.f111682j.g0();
    }

    public void setProgress(@x(from = 0.0d, to = 1.0d) float f10) {
        this.f111682j.W(f10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f111682j.V(f10);
    }

    public void setRippleColor(@p0 ColorStateList colorStateList) {
        this.f111682j.X(colorStateList);
    }

    public void setRippleColorResource(@n int i10) {
        this.f111682j.X(j.a.a(getContext(), i10));
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        setClipToOutline(pVar.u(getBoundsAsRectF()));
        this.f111682j.Y(pVar);
    }

    public void setStrokeColor(@l int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(@r int i10) {
        this.f111682j.a0(i10);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f111682j.j0();
        this.f111682j.g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (k() && isEnabled()) {
            this.f111684l = !this.f111684l;
            refreshDrawableState();
            j();
            this.f111682j.P(this.f111684l, true);
            b bVar = this.f111686n;
            if (bVar != null) {
                bVar.a(this, this.f111684l);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Gc);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@p0 ColorStateList colorStateList) {
        this.f111682j.L(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f111682j.Z(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f111680v;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f111684l = false;
        this.f111685m = false;
        this.f111683k = true;
        TypedArray typedArrayK = g0.k(getContext(), attributeSet, r6.a.o.fn, i10, i11, new int[0]);
        com.google.android.material.card.b bVar = new com.google.android.material.card.b(this, attributeSet, i10, i11);
        this.f111682j = bVar;
        bVar.L(super.getCardBackgroundColor());
        bVar.b0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.I(typedArrayK);
        typedArrayK.recycle();
    }
}
