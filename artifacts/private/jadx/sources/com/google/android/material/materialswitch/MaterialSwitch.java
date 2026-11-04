package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.j1;
import androidx.core.graphics.drawable.c;
import androidx.core.graphics.h;
import com.google.android.material.internal.g0;
import r6.a;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialSwitch extends SwitchCompat {
    private static final int Y3 = a.n.f361240jg;
    private static final int[] Z3 = {a.c.f359318ih};

    @p0
    private Drawable L3;

    @p0
    private Drawable M3;

    @t0
    private int N3;

    @p0
    private Drawable O3;

    @p0
    private Drawable P3;

    @p0
    private ColorStateList Q3;

    @p0
    private ColorStateList R3;

    @NonNull
    private PorterDuff.Mode S3;

    @p0
    private ColorStateList T3;

    @p0
    private ColorStateList U3;

    @NonNull
    private PorterDuff.Mode V3;
    private int[] W3;
    private int[] X3;

    public MaterialSwitch(@NonNull Context context) {
        this(context, null);
    }

    private void r() {
        this.L3 = com.google.android.material.drawable.a.c(this.L3, this.Q3, getThumbTintMode());
        this.M3 = com.google.android.material.drawable.a.c(this.M3, this.R3, this.S3);
        u();
        Drawable drawable = this.L3;
        Drawable drawable2 = this.M3;
        int i10 = this.N3;
        super.setThumbDrawable(com.google.android.material.drawable.a.b(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    private void s() {
        this.O3 = com.google.android.material.drawable.a.c(this.O3, this.T3, getTrackTintMode());
        this.P3 = com.google.android.material.drawable.a.c(this.P3, this.U3, this.V3);
        u();
        Drawable layerDrawable = this.O3;
        if (layerDrawable != null && this.P3 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.O3, this.P3});
        } else if (layerDrawable == null) {
            layerDrawable = this.P3;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private static void t(@p0 Drawable drawable, @p0 ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f10) {
        if (drawable != null && colorStateList != null) {
            c.n(drawable, h.j(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f10));
        }
    }

    private void u() {
        if (this.Q3 != null || this.R3 != null || this.T3 != null || this.U3 != null) {
            float thumbPosition = getThumbPosition();
            ColorStateList colorStateList = this.Q3;
            if (colorStateList != null) {
                t(this.L3, colorStateList, this.W3, this.X3, thumbPosition);
            }
            ColorStateList colorStateList2 = this.R3;
            if (colorStateList2 != null) {
                t(this.M3, colorStateList2, this.W3, this.X3, thumbPosition);
            }
            ColorStateList colorStateList3 = this.T3;
            if (colorStateList3 != null) {
                t(this.O3, colorStateList3, this.W3, this.X3, thumbPosition);
            }
            ColorStateList colorStateList4 = this.U3;
            if (colorStateList4 != null) {
                t(this.P3, colorStateList4, this.W3, this.X3, thumbPosition);
            }
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @p0
    public Drawable getThumbDrawable() {
        return this.L3;
    }

    @p0
    public Drawable getThumbIconDrawable() {
        return this.M3;
    }

    @t0
    public int getThumbIconSize() {
        return this.N3;
    }

    @p0
    public ColorStateList getThumbIconTintList() {
        return this.R3;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.S3;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @p0
    public ColorStateList getThumbTintList() {
        return this.Q3;
    }

    @p0
    public Drawable getTrackDecorationDrawable() {
        return this.P3;
    }

    @p0
    public ColorStateList getTrackDecorationTintList() {
        return this.U3;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.V3;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @p0
    public Drawable getTrackDrawable() {
        return this.O3;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @p0
    public ColorStateList getTrackTintList() {
        return this.T3;
    }

    @Override // android.view.View
    public void invalidate() {
        u();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.M3 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Z3);
        }
        this.W3 = com.google.android.material.drawable.a.j(iArrOnCreateDrawableState);
        this.X3 = com.google.android.material.drawable.a.f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@p0 Drawable drawable) {
        this.L3 = drawable;
        r();
    }

    public void setThumbIconDrawable(@p0 Drawable drawable) {
        this.M3 = drawable;
        r();
    }

    public void setThumbIconResource(@v int i10) {
        setThumbIconDrawable(j.a.b(getContext(), i10));
    }

    public void setThumbIconSize(@t0 int i10) {
        if (this.N3 != i10) {
            this.N3 = i10;
            r();
        }
    }

    public void setThumbIconTintList(@p0 ColorStateList colorStateList) {
        this.R3 = colorStateList;
        r();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.S3 = mode;
        r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@p0 ColorStateList colorStateList) {
        this.Q3 = colorStateList;
        r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@p0 PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        r();
    }

    public void setTrackDecorationDrawable(@p0 Drawable drawable) {
        this.P3 = drawable;
        s();
    }

    public void setTrackDecorationResource(@v int i10) {
        setTrackDecorationDrawable(j.a.b(getContext(), i10));
    }

    public void setTrackDecorationTintList(@p0 ColorStateList colorStateList) {
        this.U3 = colorStateList;
        s();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.V3 = mode;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@p0 Drawable drawable) {
        this.O3 = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@p0 ColorStateList colorStateList) {
        this.T3 = colorStateList;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@p0 PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        s();
    }

    public MaterialSwitch(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Vc);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = Y3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.N3 = -1;
        Context context2 = getContext();
        this.L3 = super.getThumbDrawable();
        this.Q3 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.O3 = super.getTrackDrawable();
        this.T3 = super.getTrackTintList();
        super.setTrackTintList(null);
        j1 j1VarL = g0.l(context2, attributeSet, a.o.Un, i10, i11, new int[0]);
        this.M3 = j1VarL.h(a.o.Vn);
        this.N3 = j1VarL.g(a.o.Wn, -1);
        this.R3 = j1VarL.d(a.o.Xn);
        int iO = j1VarL.o(a.o.Yn, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.S3 = com.google.android.material.internal.p0.t(iO, mode);
        this.P3 = j1VarL.h(a.o.Zn);
        this.U3 = j1VarL.d(a.o.ao);
        this.V3 = com.google.android.material.internal.p0.t(j1VarL.o(a.o.bo, -1), mode);
        j1VarL.I();
        setEnforceSwitchWidth(false);
        r();
        s();
    }
}
