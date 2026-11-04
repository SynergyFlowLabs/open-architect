package io.codetail.animation;

import android.animation.Animator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes13.dex */
final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Animator f288269b;

    class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.a f288270a;

        a(b.a aVar) {
            this.f288270a = aVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f288270a.b();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f288270a.a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f288270a.d();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f288270a.c();
        }
    }

    c(Animator animator, io.codetail.animation.a aVar) {
        super(aVar);
        this.f288269b = animator;
    }

    @Override // io.codetail.animation.b
    public void a(b.a aVar) {
        if (aVar == null) {
            this.f288269b.addListener(null);
        } else {
            this.f288269b.addListener(new a(aVar));
        }
    }

    @Override // io.codetail.animation.b
    public void b() {
        this.f288269b.cancel();
    }

    @Override // io.codetail.animation.b
    public void c() {
        this.f288269b.end();
    }

    @Override // io.codetail.animation.b
    public Object d() {
        return this.f288269b;
    }

    @Override // io.codetail.animation.b
    public boolean e() {
        return true;
    }

    @Override // io.codetail.animation.b
    public boolean f() {
        return this.f288269b.isRunning();
    }

    @Override // io.codetail.animation.b
    public void h(int i10) {
        this.f288269b.setDuration(i10);
    }

    @Override // io.codetail.animation.b
    public void i(Interpolator interpolator) {
        this.f288269b.setInterpolator(interpolator);
    }

    @Override // io.codetail.animation.b
    public void j() {
        this.f288269b.setupEndValues();
    }

    @Override // io.codetail.animation.b
    public void k() {
        this.f288269b.setupStartValues();
    }

    @Override // io.codetail.animation.b
    public void l() {
        this.f288269b.start();
    }
}
