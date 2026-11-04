package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f48743a;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g2 f48744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f48745b;

        a(g2 g2Var, View view) {
            this.f48744a = g2Var;
            this.f48745b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f48744a.a(this.f48745b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f48744a.b(this.f48745b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f48744a.c(this.f48745b);
        }
    }

    @androidx.annotation.w0(21)
    static class b {
        private b() {
        }

        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.translationZ(f10);
        }

        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.translationZBy(f10);
        }

        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.z(f10);
        }

        static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.zBy(f10);
        }
    }

    f2(View view) {
        this.f48743a = new WeakReference<>(view);
    }

    private void u(View view, g2 g2Var) {
        if (g2Var != null) {
            view.animate().setListener(new a(g2Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    public f2 A(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    @NonNull
    public f2 B(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().translationYBy(f10);
        }
        return this;
    }

    @NonNull
    public f2 C(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            b.a(view.animate(), f10);
        }
        return this;
    }

    @NonNull
    public f2 D(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            b.b(view.animate(), f10);
        }
        return this;
    }

    @NonNull
    public f2 E(@NonNull Runnable runnable) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @NonNull
    @e.a({"WrongConstant"})
    public f2 F() {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    @NonNull
    public f2 G(@NonNull Runnable runnable) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    @NonNull
    public f2 H(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().x(f10);
        }
        return this;
    }

    @NonNull
    public f2 I(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().xBy(f10);
        }
        return this;
    }

    @NonNull
    public f2 J(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().y(f10);
        }
        return this;
    }

    @NonNull
    public f2 K(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().yBy(f10);
        }
        return this;
    }

    @NonNull
    public f2 L(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            b.c(view.animate(), f10);
        }
        return this;
    }

    @NonNull
    public f2 M(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            b.d(view.animate(), f10);
        }
        return this;
    }

    @NonNull
    public f2 b(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    @NonNull
    public f2 c(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().alphaBy(f10);
        }
        return this;
    }

    public void d() {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long e() {
        View view = this.f48743a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @androidx.annotation.p0
    public Interpolator f() {
        View view = this.f48743a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long g() {
        View view = this.f48743a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @NonNull
    public f2 h(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().rotation(f10);
        }
        return this;
    }

    @NonNull
    public f2 i(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().rotationBy(f10);
        }
        return this;
    }

    @NonNull
    public f2 j(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().rotationX(f10);
        }
        return this;
    }

    @NonNull
    public f2 k(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().rotationXBy(f10);
        }
        return this;
    }

    @NonNull
    public f2 l(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().rotationY(f10);
        }
        return this;
    }

    @NonNull
    public f2 m(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().rotationYBy(f10);
        }
        return this;
    }

    @NonNull
    public f2 n(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().scaleX(f10);
        }
        return this;
    }

    @NonNull
    public f2 o(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().scaleXBy(f10);
        }
        return this;
    }

    @NonNull
    public f2 p(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().scaleY(f10);
        }
        return this;
    }

    @NonNull
    public f2 q(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().scaleYBy(f10);
        }
        return this;
    }

    @NonNull
    public f2 r(long j10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    @NonNull
    public f2 s(@androidx.annotation.p0 Interpolator interpolator) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @NonNull
    public f2 t(@androidx.annotation.p0 g2 g2Var) {
        View view = this.f48743a.get();
        if (view != null) {
            u(view, g2Var);
        }
        return this;
    }

    @NonNull
    public f2 v(long j10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    @NonNull
    public f2 w(@androidx.annotation.p0 final i2 i2Var) {
        final View view = this.f48743a.get();
        if (view != null) {
            view.animate().setUpdateListener(i2Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.e2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    i2Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void x() {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    public f2 y(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().translationX(f10);
        }
        return this;
    }

    @NonNull
    public f2 z(float f10) {
        View view = this.f48743a.get();
        if (view != null) {
            view.animate().translationXBy(f10);
        }
        return this;
    }
}
