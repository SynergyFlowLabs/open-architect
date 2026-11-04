package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class k extends f1 {
    private static final String P3 = "android:fade:transitionAlpha";
    private static final String Q3 = "Fade";
    public static final int R3 = 1;
    public static final int S3 = 2;

    private static class a extends AnimatorListenerAdapter implements g0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f75710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f75711b = false;

        a(View view) {
            this.f75710a = view;
        }

        @Override // androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
            this.f75710a.setTag(a0.a.f75502j, null);
        }

        @Override // androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
            this.f75710a.setTag(a0.a.f75502j, Float.valueOf(this.f75710a.getVisibility() == 0 ? z0.b(this.f75710a) : 0.0f));
        }

        @Override // androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z0.f(this.f75710a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f75710a.hasOverlappingRendering() && this.f75710a.getLayerType() == 0) {
                this.f75711b = true;
                this.f75710a.setLayerType(2, null);
            }
        }

        @Override // androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void r(@NonNull g0 g0Var, boolean z10) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (this.f75711b) {
                this.f75710a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            z0.f(this.f75710a, 1.0f);
            z0.a(this.f75710a);
        }
    }

    public k(int i10) {
        V0(i10);
    }

    private Animator W0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        z0.f(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, z0.f75810c, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        T().c(aVar);
        return objectAnimatorOfFloat;
    }

    private static float X0(u0 u0Var, float f10) {
        Float f11;
        return (u0Var == null || (f11 = (Float) u0Var.f75775a.get(P3)) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.f1
    @androidx.annotation.p0
    public Animator R0(@NonNull ViewGroup viewGroup, @NonNull View view, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        z0.c(view);
        return W0(view, X0(u0Var, 0.0f), 1.0f);
    }

    @Override // androidx.transition.f1
    @androidx.annotation.p0
    public Animator T0(@NonNull ViewGroup viewGroup, @NonNull View view, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        z0.c(view);
        Animator animatorW0 = W0(view, X0(u0Var, 1.0f), 0.0f);
        if (animatorW0 == null) {
            z0.f(view, X0(u0Var2, 1.0f));
        }
        return animatorW0;
    }

    @Override // androidx.transition.g0
    public boolean e0() {
        return true;
    }

    @Override // androidx.transition.f1, androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        super.p(u0Var);
        Float fValueOf = (Float) u0Var.f75776b.getTag(a0.a.f75502j);
        if (fValueOf == null) {
            fValueOf = u0Var.f75776b.getVisibility() == 0 ? Float.valueOf(z0.b(u0Var.f75776b)) : Float.valueOf(0.0f);
        }
        u0Var.f75775a.put(P3, fValueOf);
    }

    public k() {
    }

    public k(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f75569f);
        V0(androidx.core.content.res.n.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, O0()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
