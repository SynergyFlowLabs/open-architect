package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.t;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
class e extends d {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @p0
    private StateListAnimator f112695c0;

    static class a extends k {
        a(p pVar) {
            super(pVar);
        }

        @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    e(FloatingActionButton floatingActionButton, com.google.android.material.shadow.c cVar) {
        super(floatingActionButton, cVar);
    }

    @NonNull
    private StateListAnimator n0(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.W, o0(f10, f12));
        stateListAnimator.addState(d.X, o0(f10, f11));
        stateListAnimator.addState(d.Y, o0(f10, f11));
        stateListAnimator.addState(d.Z, o0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f112663w, "elevation", f10).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f112663w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.D);
        stateListAnimator.addState(d.f112639a0, animatorSet);
        stateListAnimator.addState(d.f112640b0, o0(0.0f, 0.0f));
        return stateListAnimator;
    }

    @NonNull
    private Animator o0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f112663w, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f112663w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(d.D);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void B() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void D() {
        j0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void F(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void G(float f10, float f11, float f12) {
        if (this.f112663w.getStateListAnimator() == this.f112695c0) {
            StateListAnimator stateListAnimatorN0 = n0(f10, f11, f12);
            this.f112695c0 = stateListAnimatorN0;
            this.f112663w.setStateListAnimator(stateListAnimatorN0);
        }
        if (d0()) {
            j0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean O() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void Z(@p0 ColorStateList colorStateList) {
        Drawable drawable = this.f112643c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(com.google.android.material.ripple.b.e(colorStateList));
        } else {
            super.Z(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean d0() {
        if (!this.f112664x.c() && f0()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void h0() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    @NonNull
    k l() {
        return new a((p) t.l(this.f112641a));
    }

    @NonNull
    c m0(int i10, ColorStateList colorStateList) {
        Context context = this.f112663w.getContext();
        c cVar = new c((p) t.l(this.f112641a));
        cVar.f(androidx.core.content.d.g(context, r6.a.e.E0), androidx.core.content.d.g(context, r6.a.e.D0), androidx.core.content.d.g(context, r6.a.e.B0), androidx.core.content.d.g(context, r6.a.e.C0));
        cVar.e(i10);
        cVar.d(colorStateList);
        return cVar;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public float n() {
        return this.f112663w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void s(@NonNull Rect rect) {
        if (this.f112664x.c()) {
            super.s(rect);
        } else if (f0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f112651k - this.f112663w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void y(ColorStateList colorStateList, @p0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        k kVarL = l();
        this.f112642b = kVarL;
        kVarL.setTintList(colorStateList);
        if (mode != null) {
            this.f112642b.setTintMode(mode);
        }
        this.f112642b.a0(this.f112663w.getContext());
        if (i10 > 0) {
            this.f112644d = m0(i10, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) t.l(this.f112644d), (Drawable) t.l(this.f112642b)});
        } else {
            this.f112644d = null;
            layerDrawable = this.f112642b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.e(colorStateList2), layerDrawable, null);
        this.f112643c = rippleDrawable;
        this.f112645e = rippleDrawable;
    }
}
