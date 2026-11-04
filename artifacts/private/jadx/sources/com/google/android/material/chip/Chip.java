package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.h;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.accessibility.j;
import androidx.core.view.u1;
import com.google.android.material.animation.i;
import com.google.android.material.internal.g0;
import com.google.android.material.internal.o;
import com.google.android.material.resources.d;
import com.google.android.material.resources.f;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Chip extends AppCompatCheckBox implements com.google.android.material.chip.b.a, t, o<Chip> {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final String f111833g3 = "Chip";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final int f111835i3 = 0;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f111836j3 = 1;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final String f111840n3 = "http://schemas.android.com/apk/res/android";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f111841o3 = 48;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final String f111842p3 = "android.widget.Button";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final String f111843q3 = "android.widget.RadioButton";

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final String f111844r3 = "android.view.View";
    private final RectF H1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private com.google.android.material.chip.b f111845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private InsetDrawable f111846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private RippleDrawable f111847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private View.OnClickListener f111848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private CompoundButton.OnCheckedChangeListener f111849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private o.a<Chip> f111850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f111851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f111852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f111853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f111854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f111855o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f111856p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final Rect f111857p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final f f111858p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f111859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @r(unit = 1)
    private int f111860t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private CharSequence f111861v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    private final c f111862w;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f111834h3 = r6.a.n.Wi;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final Rect f111837k3 = new Rect();

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int[] f111838l3 = {R.attr.state_selected};

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int[] f111839m3 = {R.attr.state_checkable};

    class a extends f {
        a() {
        }

        @Override // com.google.android.material.resources.f
        public void a(int i10) {
        }

        @Override // com.google.android.material.resources.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f111845e.L3() ? Chip.this.f111845e.Q1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @e.b(21)
        public void getOutline(View view, @NonNull Outline outline) {
            if (Chip.this.f111845e != null) {
                Chip.this.f111845e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends androidx.customview.widget.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.a
        protected boolean C(int i10, int i11, Bundle bundle) {
            if (i11 == 16) {
                if (i10 == 0) {
                    return Chip.this.performClick();
                }
                if (i10 == 1) {
                    return Chip.this.y();
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.a
        protected void F(@NonNull j jVar) {
            jVar.h1(Chip.this.r());
            jVar.k1(Chip.this.isClickable());
            jVar.j1(Chip.this.getAccessibilityClassName());
            jVar.d2(Chip.this.getText());
        }

        @Override // androidx.customview.widget.a
        protected void G(int i10, @NonNull j jVar) {
            if (i10 != 1) {
                jVar.o1("");
                jVar.d1(Chip.f111837k3);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                jVar.o1(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                jVar.o1(Chip.this.getContext().getString(r6.a.m.Z0, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            jVar.d1(Chip.this.getCloseIconTouchBoundsInt());
            jVar.b(j.a.f48547j);
            jVar.u1(Chip.this.isEnabled());
        }

        @Override // androidx.customview.widget.a
        protected void H(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f111854n = z10;
                Chip.this.refreshDrawableState();
            }
        }

        @Override // androidx.customview.widget.a
        protected int r(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.a
        protected void s(@NonNull List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.x() && Chip.this.f111848h != null) {
                list.add(1);
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void B(@p0 com.google.android.material.chip.b bVar) {
        if (bVar != null) {
            bVar.l3(null);
        }
    }

    private void C() {
        if (n() && x() && this.f111848h != null) {
            u1.G1(this, this.f111862w);
            this.f111856p0 = true;
        } else {
            u1.G1(this, null);
            this.f111856p0 = false;
        }
    }

    private void D() {
        if (com.google.android.material.ripple.b.f113330a) {
            E();
            return;
        }
        this.f111845e.K3(true);
        u1.O1(this, getBackgroundDrawable());
        F();
        m();
    }

    private void E() {
        this.f111847g = new RippleDrawable(com.google.android.material.ripple.b.e(this.f111845e.O1()), getBackgroundDrawable(), null);
        this.f111845e.K3(false);
        u1.O1(this, this.f111847g);
        F();
    }

    private void F() {
        com.google.android.material.chip.b bVar;
        if (!TextUtils.isEmpty(getText()) && (bVar = this.f111845e) != null) {
            int iQ1 = (int) (bVar.q1() + this.f111845e.S1() + this.f111845e.W0());
            int iV1 = (int) (this.f111845e.v1() + this.f111845e.T1() + this.f111845e.S0());
            if (this.f111846f != null) {
                Rect rect = new Rect();
                this.f111846f.getPadding(rect);
                iV1 += rect.left;
                iQ1 += rect.right;
            }
            u1.m2(this, iV1, getPaddingTop(), iQ1, getPaddingBottom());
        }
    }

    private void G() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f111858p2);
        }
    }

    private void H(@p0 AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        attributeSet.getAttributeValue(f111840n3, "background");
        if (attributeSet.getAttributeValue(f111840n3, "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(f111840n3, "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(f111840n3, "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue(f111840n3, "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue(f111840n3, "singleLine", true) || attributeSet.getAttributeIntValue(f111840n3, "lines", 1) != 1 || attributeSet.getAttributeIntValue(f111840n3, "minLines", 1) != 1 || attributeSet.getAttributeIntValue(f111840n3, "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        attributeSet.getAttributeIntValue(f111840n3, "gravity", 8388627);
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z10) {
        o.a<Chip> aVar = chip.f111850j;
        if (aVar != null) {
            aVar.a(chip, z10);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f111849i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.H1.setEmpty();
        if (n() && this.f111848h != null) {
            this.f111845e.G1(this.H1);
        }
        return this.H1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f111857p1.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f111857p1;
    }

    @p0
    private d getTextAppearance() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.R1();
        }
        return null;
    }

    private void j(@NonNull com.google.android.material.chip.b bVar) {
        bVar.l3(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @NonNull
    private int[] k() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f111854n) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f111853m) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f111852l) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f111854n) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f111853m) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f111852l) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f111846f && this.f111845e.getCallback() == null) {
            this.f111845e.setCallback(this.f111846f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.b bVar = this.f111845e;
        return (bVar == null || bVar.z1() == null) ? false : true;
    }

    private void o(Context context, @p0 AttributeSet attributeSet, int i10) {
        TypedArray typedArrayK = g0.k(context, attributeSet, r6.a.o.f362040s6, i10, f111834h3, new int[0]);
        this.f111855o = typedArrayK.getBoolean(r6.a.o.Z6, false);
        this.f111860t = (int) Math.ceil(typedArrayK.getDimension(r6.a.o.N6, (float) Math.ceil(com.google.android.material.internal.p0.i(getContext(), 48))));
        typedArrayK.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f111846f = new InsetDrawable((Drawable) this.f111845e, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f111853m != z10) {
            this.f111853m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f111852l != z10) {
            this.f111852l = z10;
            refreshDrawableState();
        }
    }

    private void z() {
        if (this.f111846f != null) {
            this.f111846f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            D();
        }
    }

    public boolean A() {
        return this.f111855o;
    }

    @Override // com.google.android.material.chip.b.a
    public void a() {
        l(this.f111860t);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.f111856p0) {
            return this.f111862w.k(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f111856p0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f111862w.l(keyEvent) || this.f111862w.q() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.b bVar = this.f111845e;
        if ((bVar == null || !bVar.d2()) ? false : this.f111845e.g3(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f111861v)) {
            return this.f111861v;
        }
        if (!r()) {
            return isClickable() ? f111842p3 : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).l()) ? f111843q3 : f111842p3;
    }

    @p0
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f111846f;
        return insetDrawable == null ? this.f111845e : insetDrawable;
    }

    @p0
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.m1();
        }
        return null;
    }

    @p0
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.n1();
        }
        return null;
    }

    @p0
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.o1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return Math.max(0.0f, bVar.p1());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f111845e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.q1();
        }
        return 0.0f;
    }

    @p0
    public Drawable getChipIcon() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.r1();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.s1();
        }
        return 0.0f;
    }

    @p0
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.t1();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.u1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.v1();
        }
        return 0.0f;
    }

    @p0
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.w1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.x1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @p0
    public Drawable getCloseIcon() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.z1();
        }
        return null;
    }

    @p0
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.A1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.B1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.C1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.D1();
        }
        return 0.0f;
    }

    @p0
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.F1();
        }
        return null;
    }

    @Override // android.widget.TextView
    @p0
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.J1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.f111856p0 && (this.f111862w.q() == 1 || this.f111862w.m() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @p0
    public i getHideMotionSpec() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.K1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.L1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.M1();
        }
        return 0.0f;
    }

    @p0
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.O1();
        }
        return null;
    }

    @Override // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f111845e.getShapeAppearanceModel();
    }

    @p0
    public i getShowMotionSpec() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.P1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.S1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            return bVar.T1();
        }
        return 0.0f;
    }

    public boolean l(@r int i10) {
        this.f111860t = i10;
        if (!A()) {
            if (this.f111846f != null) {
                z();
            } else {
                D();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f111845e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f111845e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f111846f != null) {
                z();
            } else {
                D();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f111846f != null) {
            Rect rect = new Rect();
            this.f111846f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                D();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        D();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.f(this, this.f111845e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f111838l3);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f111839m3);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f111856p0) {
            this.f111862w.B(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            j.r2(accessibilityNodeInfo).m1(j.g.j(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.i(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @e.b(24)
    @p0
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    @e.b(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f111859s != i10) {
            this.f111859s = i10;
            F();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @e.a({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f111852l) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (this.f111852l) {
                    y();
                    z10 = true;
                }
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        com.google.android.material.chip.b bVar = this.f111845e;
        return bVar != null && bVar.X1();
    }

    @Deprecated
    public boolean s() {
        return t();
    }

    public void setAccessibilityClassName(@p0 CharSequence charSequence) {
        this.f111861v = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f111847g) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f111847g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@p0 ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@p0 PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.m2(z10);
        }
    }

    public void setCheckableResource(@h int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.n2(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar == null) {
            this.f111851k = z10;
        } else if (bVar.X1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(@p0 Drawable drawable) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.o2(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@h int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(@v int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.r2(i10);
        }
    }

    public void setCheckedIconTint(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.s2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.t2(i10);
        }
    }

    public void setCheckedIconVisible(@h int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.u2(i10);
        }
    }

    public void setChipBackgroundColor(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.w2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.x2(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.y2(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.z2(i10);
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.b bVar) {
        com.google.android.material.chip.b bVar2 = this.f111845e;
        if (bVar2 != bVar) {
            B(bVar2);
            this.f111845e = bVar;
            bVar.w3(false);
            j(this.f111845e);
            l(this.f111860t);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.A2(f10);
        }
    }

    public void setChipEndPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.B2(i10);
        }
    }

    public void setChipIcon(@p0 Drawable drawable) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.C2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(@h int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(@v int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.F2(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.G2(f10);
        }
    }

    public void setChipIconSizeResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.H2(i10);
        }
    }

    public void setChipIconTint(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.I2(colorStateList);
        }
    }

    public void setChipIconTintResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.J2(i10);
        }
    }

    public void setChipIconVisible(@h int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.K2(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.M2(f10);
        }
    }

    public void setChipMinHeightResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.N2(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.O2(f10);
        }
    }

    public void setChipStartPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.P2(i10);
        }
    }

    public void setChipStrokeColor(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.Q2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.R2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.S2(f10);
        }
    }

    public void setChipStrokeWidthResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.T2(i10);
        }
    }

    @Deprecated
    public void setChipText(@p0 CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@f1 int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(@p0 Drawable drawable) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.V2(drawable);
        }
        C();
    }

    public void setCloseIconContentDescription(@p0 CharSequence charSequence) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.W2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@h int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.Z2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.a3(i10);
        }
    }

    public void setCloseIconResource(@v int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.b3(i10);
        }
        C();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.c3(f10);
        }
    }

    public void setCloseIconSizeResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.d3(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.e3(f10);
        }
    }

    public void setCloseIconStartPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.f3(i10);
        }
    }

    public void setCloseIconTint(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.h3(colorStateList);
        }
    }

    public void setCloseIconTintResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.i3(i10);
        }
    }

    public void setCloseIconVisible(@h int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(@p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    @w0(17)
    public void setCompoundDrawablesRelative(@p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.o0(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f111845e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.m3(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f111855o = z10;
        l(this.f111860t);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            return;
        }
        super.setGravity(i10);
    }

    public void setHideMotionSpec(@p0 i iVar) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.n3(iVar);
        }
    }

    public void setHideMotionSpecResource(@androidx.annotation.b int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.o3(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.p3(f10);
        }
    }

    public void setIconEndPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.q3(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.r3(f10);
        }
    }

    public void setIconStartPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.s3(i10);
        }
    }

    @Override // com.google.android.material.internal.o
    @b1({b1.a.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@p0 o.a<Chip> aVar) {
        this.f111850j = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f111845e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@t0 int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.t3(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@p0 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f111849i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f111848h = onClickListener;
        C();
    }

    public void setRippleColor(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.u3(colorStateList);
        }
        if (this.f111845e.V1()) {
            return;
        }
        E();
    }

    public void setRippleColorResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.v3(i10);
            if (this.f111845e.V1()) {
                return;
            }
            E();
        }
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        this.f111845e.setShapeAppearanceModel(pVar);
    }

    public void setShowMotionSpec(@p0 i iVar) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.x3(iVar);
        }
    }

    public void setShowMotionSpecResource(@androidx.annotation.b int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.y3(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(bVar.L3() ? null : charSequence, bufferType);
        com.google.android.material.chip.b bVar2 = this.f111845e;
        if (bVar2 != null) {
            bVar2.z3(charSequence);
        }
    }

    public void setTextAppearance(@p0 d dVar) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.A3(dVar);
        }
        G();
    }

    public void setTextAppearanceResource(@g1 int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.E3(f10);
        }
    }

    public void setTextEndPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.F3(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.H3(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        G();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.I3(f10);
        }
    }

    public void setTextStartPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.J3(i10);
        }
    }

    public boolean t() {
        com.google.android.material.chip.b bVar = this.f111845e;
        return bVar != null && bVar.Z1();
    }

    @Deprecated
    public boolean u() {
        return v();
    }

    public boolean v() {
        com.google.android.material.chip.b bVar = this.f111845e;
        return bVar != null && bVar.b2();
    }

    @Deprecated
    public boolean w() {
        return x();
    }

    public boolean x() {
        com.google.android.material.chip.b bVar = this.f111845e;
        return bVar != null && bVar.e2();
    }

    @androidx.annotation.i
    public boolean y() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f111848h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f111856p0) {
            this.f111862w.N(1, 1);
        }
        return z10;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.I2);
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.k3(z10);
        }
        C();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f111834h3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f111857p1 = new Rect();
        this.H1 = new RectF();
        this.f111858p2 = new a();
        Context context2 = getContext();
        H(attributeSet);
        com.google.android.material.chip.b bVarB1 = com.google.android.material.chip.b.b1(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(bVarB1);
        bVarB1.o0(u1.T(this));
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.f362040s6, i10, i11, new int[0]);
        boolean zHasValue = typedArrayK.hasValue(r6.a.o.f361704e7);
        typedArrayK.recycle();
        this.f111862w = new c(this);
        C();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f111851k);
        setText(bVarB1.Q1());
        setEllipsize(bVarB1.J1());
        G();
        if (!this.f111845e.L3()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        F();
        if (A()) {
            setMinHeight(this.f111860t);
        }
        this.f111859s = u1.c0(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.google.android.material.chip.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip.b(this.f111878a, compoundButton, z10);
            }
        });
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.v2(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.L2(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.B3(i10);
        }
        G();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.b bVar = this.f111845e;
        if (bVar != null) {
            bVar.B3(i10);
        }
        G();
    }
}
