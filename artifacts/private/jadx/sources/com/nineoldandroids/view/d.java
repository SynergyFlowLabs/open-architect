package com.nineoldandroids.view;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f131356c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<ViewPropertyAnimator> f131357b;

    class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.nineoldandroids.animation.a.InterfaceC1443a f131358a;

        a(com.nineoldandroids.animation.a.InterfaceC1443a interfaceC1443a) {
            this.f131358a = interfaceC1443a;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f131358a.d(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f131358a.b(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f131358a.a(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f131358a.e(null);
        }
    }

    d(View view) {
        this.f131357b = new WeakReference<>(view.animate());
    }

    @Override // com.nineoldandroids.view.b
    public b A(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.xBy(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b B(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.y(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b C(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.yBy(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b a(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alpha(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b b(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alphaBy(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public void d() {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // com.nineoldandroids.view.b
    public long e() {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            return viewPropertyAnimator.getDuration();
        }
        return -1L;
    }

    @Override // com.nineoldandroids.view.b
    public long f() {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            return viewPropertyAnimator.getStartDelay();
        }
        return -1L;
    }

    @Override // com.nineoldandroids.view.b
    public b g(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotation(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b h(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationBy(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b i(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationX(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b j(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationXBy(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b k(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationY(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b l(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationYBy(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b m(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleX(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b n(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleXBy(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b o(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleY(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b p(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleYBy(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b q(long j10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setDuration(j10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b r(Interpolator interpolator) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setInterpolator(interpolator);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b s(com.nineoldandroids.animation.a.InterfaceC1443a interfaceC1443a) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            if (interfaceC1443a == null) {
                viewPropertyAnimator.setListener(null);
                return this;
            }
            viewPropertyAnimator.setListener(new a(interfaceC1443a));
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b t(long j10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setStartDelay(j10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public void u() {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.start();
        }
    }

    @Override // com.nineoldandroids.view.b
    public b v(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationX(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b w(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationXBy(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b x(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationY(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b y(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationYBy(f10);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b z(float f10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f131357b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.x(f10);
        }
        return this;
    }
}
