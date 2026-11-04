package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;
import com.google.android.material.animation.i;
import com.google.android.material.animation.j;
import com.google.android.material.animation.k;
import com.google.android.material.circularreveal.g;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.planner5d.library.engine.input.f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f114449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RectF f114450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f114451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f114452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f114453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f114454k;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f114455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f114456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f114457c;

        a(boolean z10, View view, View view2) {
            this.f114455a = z10;
            this.f114456b = view;
            this.f114457c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f114455a) {
                this.f114456b.setVisibility(4);
                this.f114457c.setAlpha(1.0f);
                this.f114457c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f114455a) {
                this.f114456b.setVisibility(0);
                this.f114457c.setAlpha(0.0f);
                this.f114457c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114459a;

        b(View view) {
            this.f114459a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f114459a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f114461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f114462b;

        c(g gVar, Drawable drawable) {
            this.f114461a = gVar;
            this.f114462b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f114461a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f114461a.setCircularRevealOverlayDrawable(this.f114462b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f114464a;

        d(g gVar) {
            this.f114464a = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.e revealInfo = this.f114464a.getRevealInfo();
            revealInfo.f111947c = Float.MAX_VALUE;
            this.f114464a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public i f114466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f114467b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f114449f = new Rect();
        this.f114450g = new RectF();
        this.f114451h = new RectF();
        this.f114452i = new int[2];
    }

    @p0
    private ViewGroup U(@NonNull View view) {
        View viewFindViewById = view.findViewById(r6.a.h.f360747q3);
        if (viewFindViewById != null) {
            return p0(viewFindViewById);
        }
        return ((view instanceof com.google.android.material.transformation.b) || (view instanceof com.google.android.material.transformation.a)) ? p0(((ViewGroup) view).getChildAt(0)) : p0(view);
    }

    private void V(@NonNull View view, @NonNull e eVar, @NonNull j jVar, @NonNull j jVar2, float f10, float f11, float f12, float f13, @NonNull RectF rectF) {
        float fC0 = c0(eVar, jVar, f10, f12);
        float fC1 = c0(eVar, jVar2, f11, f13);
        Rect rect = this.f114449f;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f114450g;
        rectF2.set(rect);
        RectF rectF3 = this.f114451h;
        d0(view, rectF3);
        rectF3.offset(fC0, fC1);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void W(@NonNull View view, @NonNull RectF rectF) {
        d0(view, rectF);
        rectF.offset(this.f114453j, this.f114454k);
    }

    @NonNull
    private Pair<j, j> X(float f10, float f11, boolean z10, @NonNull e eVar) {
        j jVarH;
        j jVarH2;
        if (f10 == 0.0f || f11 == 0.0f) {
            jVarH = eVar.f114466a.h("translationXLinear");
            jVarH2 = eVar.f114466a.h("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            jVarH = eVar.f114466a.h("translationXCurveDownwards");
            jVarH2 = eVar.f114466a.h("translationYCurveDownwards");
        } else {
            jVarH = eVar.f114466a.h("translationXCurveUpwards");
            jVarH2 = eVar.f114466a.h("translationYCurveUpwards");
        }
        return new Pair<>(jVarH, jVarH2);
    }

    private float Y(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        RectF rectF = this.f114450g;
        RectF rectF2 = this.f114451h;
        W(view, rectF);
        d0(view2, rectF2);
        rectF2.offset(-a0(view, view2, kVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float Z(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        RectF rectF = this.f114450g;
        RectF rectF2 = this.f114451h;
        W(view, rectF);
        d0(view2, rectF2);
        rectF2.offset(0.0f, -b0(view, view2, kVar));
        return rectF.centerY() - rectF2.top;
    }

    private float a0(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f114450g;
        RectF rectF2 = this.f114451h;
        W(view, rectF);
        d0(view2, rectF2);
        int i10 = kVar.f111064a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i10 != 3) {
                if (i10 != 5) {
                    f10 = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f10 + kVar.f111065b;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + kVar.f111065b;
    }

    private float b0(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f114450g;
        RectF rectF2 = this.f114451h;
        W(view, rectF);
        d0(view2, rectF2);
        int i10 = kVar.f111064a & f.b.B;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i10 != 48) {
                if (i10 != 80) {
                    f10 = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f10 + kVar.f111066c;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + kVar.f111066c;
    }

    private float c0(@NonNull e eVar, @NonNull j jVar, float f10, float f11) {
        long jC = jVar.c();
        long jD = jVar.d();
        j jVarH = eVar.f114466a.h("expansion");
        return com.google.android.material.animation.b.a(f10, f11, jVar.e().getInterpolation((((jVarH.c() + jVarH.d()) + 17) - jC) / jD));
    }

    private void d0(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f114452i;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void e0(View view, View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupU;
        ObjectAnimator objectAnimatorOfFloat;
        if ((view2 instanceof ViewGroup) && !(((view2 instanceof g) && com.google.android.material.circularreveal.d.f111927o == 0) || (viewGroupU = U(view2)) == null)) {
            if (z10) {
                if (!z11) {
                    com.google.android.material.animation.e.f111049a.set(viewGroupU, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupU, com.google.android.material.animation.e.f111049a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupU, com.google.android.material.animation.e.f111049a, 0.0f);
            }
            eVar.f114466a.h("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f0(@NonNull View view, View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof g) {
            g gVar = (g) view2;
            int iN0 = n0(view);
            int i10 = 16777215 & iN0;
            if (z10) {
                if (!z11) {
                    gVar.setCircularRevealScrimColor(iN0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(gVar, g.d.f111943a, i10);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(gVar, g.d.f111943a, iN0);
            }
            objectAnimatorOfInt.setEvaluator(com.google.android.material.animation.d.b());
            eVar.f114466a.h("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void g0(@NonNull View view, @NonNull View view2, boolean z10, @NonNull e eVar, @NonNull List<Animator> list) {
        float fA0 = a0(view, view2, eVar.f114467b);
        float fB0 = b0(view, view2, eVar.f114467b);
        Pair<j, j> pairX = X(fA0, fB0, z10, eVar);
        j jVar = (j) pairX.first;
        j jVar2 = (j) pairX.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fA0 = this.f114453j;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fA0);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fB0 = this.f114454k;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fB0);
        jVar.a(objectAnimatorOfFloat);
        jVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @e.b(21)
    private void h0(View view, @NonNull View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fT = u1.T(view2) - u1.T(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-fT);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fT);
        }
        eVar.f114466a.h("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i0(@NonNull View view, View view2, boolean z10, boolean z11, @NonNull e eVar, float f10, float f11, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof g) {
            g gVar = (g) view2;
            float fY = Y(view, view2, eVar.f114467b);
            float fZ = Z(view, view2, eVar.f114467b);
            ((FloatingActionButton) view).k(this.f114449f);
            float fWidth = this.f114449f.width() / 2.0f;
            j jVarH = eVar.f114466a.h("expansion");
            if (z10) {
                if (!z11) {
                    gVar.setRevealInfo(new g.e(fY, fZ, fWidth));
                }
                if (z11) {
                    fWidth = gVar.getRevealInfo().f111947c;
                }
                animatorA = com.google.android.material.circularreveal.a.a(gVar, fY, fZ, y6.a.b(fY, fZ, 0.0f, 0.0f, f10, f11));
                animatorA.addListener(new d(gVar));
                l0(view2, jVarH.c(), (int) fY, (int) fZ, fWidth, list);
            } else {
                float f12 = gVar.getRevealInfo().f111947c;
                Animator animatorA2 = com.google.android.material.circularreveal.a.a(gVar, fY, fZ, fWidth);
                int i10 = (int) fY;
                int i11 = (int) fZ;
                l0(view2, jVarH.c(), i10, i11, f12, list);
                k0(view2, jVarH.c(), jVarH.d(), eVar.f114466a.i(), i10, i11, fWidth, list);
                animatorA = animatorA2;
            }
            jVarH.a(animatorA);
            list.add(animatorA);
            list2.add(com.google.android.material.circularreveal.a.c(gVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void j0(View view, View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof g) && (view instanceof ImageView)) {
            g gVar = (g) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z10) {
                    if (!z11) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, com.google.android.material.animation.f.f111050b, 0);
                } else {
                    objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, com.google.android.material.animation.f.f111050b, 255);
                }
                objectAnimatorOfInt.addUpdateListener(new b(view2));
                eVar.f114466a.h("iconFade").a(objectAnimatorOfInt);
                list.add(objectAnimatorOfInt);
                list2.add(new c(gVar, drawable));
            }
        }
    }

    private void k0(View view, long j10, long j11, long j12, int i10, int i11, float f10, @NonNull List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(j13);
            animatorCreateCircularReveal.setDuration(j12 - j13);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void l0(View view, long j10, int i10, int i11, float f10, @NonNull List<Animator> list) {
        if (j10 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j10);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void m0(@NonNull View view, @NonNull View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        j jVar;
        j jVar2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fA0 = a0(view, view2, eVar.f114467b);
        float fB0 = b0(view, view2, eVar.f114467b);
        Pair<j, j> pairX = X(fA0, fB0, z10, eVar);
        j jVar3 = (j) pairX.first;
        j jVar4 = (j) pairX.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fA0);
                view2.setTranslationY(-fB0);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            jVar = jVar4;
            jVar2 = jVar3;
            V(view2, eVar, jVar2, jVar, -fA0, -fB0, 0.0f, 0.0f, rectF);
        } else {
            jVar = jVar4;
            jVar2 = jVar3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fA0);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fB0);
        }
        jVar2.a(objectAnimatorOfFloat);
        jVar.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int n0(@NonNull View view) {
        ColorStateList colorStateListO = u1.O(view);
        if (colorStateListO != null) {
            return colorStateListO.getColorForState(view.getDrawableState(), colorStateListO.getDefaultColor());
        }
        return 0;
    }

    @p0
    private ViewGroup p0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    protected AnimatorSet T(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        e eVarO0 = o0(view2.getContext(), z10);
        if (z10) {
            this.f114453j = view.getTranslationX();
            this.f114454k = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        h0(view, view2, z10, z11, eVarO0, arrayList, arrayList2);
        RectF rectF = this.f114450g;
        m0(view, view2, z10, z11, eVarO0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        g0(view, view2, z10, eVarO0, arrayList);
        j0(view, view2, z10, z11, eVarO0, arrayList, arrayList2);
        i0(view, view2, z10, z11, eVarO0, fWidth, fHeight, arrayList, arrayList2);
        f0(view, view2, z10, z11, eVarO0, arrayList, arrayList2);
        e0(view, view2, z10, z11, eVarO0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @androidx.annotation.i
    public boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @androidx.annotation.i
    public void o(@NonNull CoordinatorLayout.g gVar) {
        if (gVar.f46855h == 0) {
            gVar.f46855h = 80;
        }
    }

    protected abstract e o0(Context context, boolean z10);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114449f = new Rect();
        this.f114450g = new RectF();
        this.f114451h = new RectF();
        this.f114452i = new int[2];
    }
}
