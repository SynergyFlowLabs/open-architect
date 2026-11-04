package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class w0 {
    private w0() {
    }

    @androidx.annotation.p0
    static Animator a(@NonNull View view, @NonNull u0 u0Var, int i10, int i11, float f10, float f11, float f12, float f13, @androidx.annotation.p0 TimeInterpolator timeInterpolator, @NonNull g0 g0Var) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) u0Var.f75776b.getTag(a0.a.f75503k);
        if (iArr != null) {
            f10 = (iArr[0] - i10) + translationX;
            f11 = (iArr[1] - i11) + translationY;
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        if (f10 == f12 && f11 == f13) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, f13));
        a aVar = new a(view, u0Var.f75776b, translationX, translationY);
        g0Var.c(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static class a extends AnimatorListenerAdapter implements g0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f75782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f75783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f75784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f75785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f75786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f75787f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f75788g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f75789h;

        a(View view, View view2, float f10, float f11) {
            this.f75783b = view;
            this.f75782a = view2;
            this.f75787f = f10;
            this.f75788g = f11;
            int[] iArr = (int[]) view2.getTag(a0.a.f75503k);
            this.f75784c = iArr;
            if (iArr != null) {
                int i10 = 3 & 0;
                view2.setTag(a0.a.f75503k, null);
            }
        }

        private void a() {
            if (this.f75784c == null) {
                this.f75784c = new int[2];
            }
            this.f75783b.getLocationOnScreen(this.f75784c);
            this.f75782a.setTag(a0.a.f75503k, this.f75784c);
        }

        @Override // androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
            this.f75783b.setTranslationX(this.f75785d);
            this.f75783b.setTranslationY(this.f75786e);
        }

        @Override // androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
            a();
            this.f75785d = this.f75783b.getTranslationX();
            this.f75786e = this.f75783b.getTranslationY();
            this.f75783b.setTranslationX(this.f75787f);
            this.f75783b.setTranslationY(this.f75788g);
        }

        @Override // androidx.transition.g0.j
        public void m(@NonNull g0 g0Var, boolean z10) {
            if (this.f75789h) {
                return;
            }
            this.f75782a.setTag(a0.a.f75503k, null);
        }

        @Override // androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            m(g0Var, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f75789h = true;
            this.f75783b.setTranslationX(this.f75787f);
            this.f75783b.setTranslationY(this.f75788g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (!z10) {
                this.f75783b.setTranslationX(this.f75787f);
                this.f75783b.setTranslationY(this.f75788g);
            }
        }

        @Override // androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
            this.f75789h = true;
            this.f75783b.setTranslationX(this.f75787f);
            this.f75783b.setTranslationY(this.f75788g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
