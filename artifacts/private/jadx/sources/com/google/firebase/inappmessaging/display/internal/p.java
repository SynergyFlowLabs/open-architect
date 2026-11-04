package com.google.firebase.inappmessaging.display.internal;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
public class p implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f122472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f122473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f122474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f122475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f122476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f122477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f122478g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f122479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f122480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f122481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f122482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f122483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private VelocityTracker f122484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f122485n;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.g();
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f122487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f122488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f122489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f122490d;

        b(float f10, float f11, float f12, float f13) {
            this.f122487a = f10;
            this.f122488b = f11;
            this.f122489c = f12;
            this.f122490d = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = this.f122487a + (valueAnimator.getAnimatedFraction() * this.f122488b);
            float animatedFraction2 = this.f122489c + (valueAnimator.getAnimatedFraction() * this.f122490d);
            p.this.i(animatedFraction);
            p.this.h(animatedFraction2);
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f122492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f122493b;

        c(ViewGroup.LayoutParams layoutParams, int i10) {
            this.f122492a = layoutParams;
            this.f122493b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.f122477f.a(p.this.f122476e, p.this.f122483l);
            p.this.f122476e.setAlpha(1.0f);
            p.this.f122476e.setTranslationX(0.0f);
            this.f122492a.height = this.f122493b;
            p.this.f122476e.setLayoutParams(this.f122492a);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f122495a;

        d(ViewGroup.LayoutParams layoutParams) {
            this.f122495a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f122495a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            p.this.f122476e.setLayoutParams(this.f122495a);
        }
    }

    public interface e {
        void a(View view, Object obj);

        boolean b(Object obj);
    }

    public p(View view, Object obj, e eVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f122472a = viewConfiguration.getScaledTouchSlop();
        this.f122473b = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f122474c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f122475d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f122476e = view;
        this.f122483l = obj;
        this.f122477f = eVar;
    }

    private void e(float f10, float f11, @p0 AnimatorListenerAdapter animatorListenerAdapter) {
        float f12 = f();
        float f13 = f10 - f12;
        float alpha = this.f122476e.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f122475d);
        valueAnimatorOfFloat.addUpdateListener(new b(f12, f13, alpha, f11 - alpha));
        if (animatorListenerAdapter != null) {
            valueAnimatorOfFloat.addListener(animatorListenerAdapter);
        }
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ViewGroup.LayoutParams layoutParams = this.f122476e.getLayoutParams();
        int height = this.f122476e.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.f122475d);
        duration.addListener(new c(layoutParams, height));
        duration.addUpdateListener(new d(layoutParams));
        duration.start();
    }

    protected float f() {
        return this.f122476e.getTranslationX();
    }

    protected void h(float f10) {
        this.f122476e.setAlpha(f10);
    }

    protected void i(float f10) {
        this.f122476e.setTranslationX(f10);
    }

    protected void j() {
        e(0.0f, 1.0f, null);
    }

    protected void k(boolean z10) {
        e(z10 ? this.f122478g : -this.f122478g, 0.0f, new a());
    }

    @Override // android.view.View.OnTouchListener
    @e.a({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        motionEvent.offsetLocation(this.f122485n, 0.0f);
        if (this.f122478g < 2) {
            this.f122478g = this.f122476e.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f122479h = motionEvent.getRawX();
            this.f122480i = motionEvent.getRawY();
            if (this.f122477f.b(this.f122483l)) {
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.f122484m = velocityTrackerObtain;
                velocityTrackerObtain.addMovement(motionEvent);
            }
            return false;
        }
        boolean z11 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.f122484m;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.f122479h;
                    float rawY = motionEvent.getRawY() - this.f122480i;
                    if (Math.abs(rawX) > this.f122472a && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.f122481j = true;
                        this.f122482k = rawX > 0.0f ? this.f122472a : -this.f122472a;
                        this.f122476e.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        this.f122476e.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (this.f122481j) {
                        this.f122485n = rawX;
                        i(rawX - this.f122482k);
                        h(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.f122478g))));
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.f122484m != null) {
                j();
                this.f122484m.recycle();
                this.f122484m = null;
                this.f122485n = 0.0f;
                this.f122479h = 0.0f;
                this.f122480i = 0.0f;
                this.f122481j = false;
            }
        } else if (this.f122484m != null) {
            float rawX2 = motionEvent.getRawX() - this.f122479h;
            this.f122484m.addMovement(motionEvent);
            this.f122484m.computeCurrentVelocity(1000);
            float xVelocity = this.f122484m.getXVelocity();
            float fAbs = Math.abs(xVelocity);
            float fAbs2 = Math.abs(this.f122484m.getYVelocity());
            if (Math.abs(rawX2) > this.f122478g / 2 && this.f122481j) {
                z10 = rawX2 > 0.0f;
            } else if (this.f122473b > fAbs || fAbs > this.f122474c || fAbs2 >= fAbs || fAbs2 >= fAbs || !this.f122481j) {
                z10 = false;
                z11 = false;
            } else {
                z11 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                z10 = this.f122484m.getXVelocity() > 0.0f;
            }
            if (z11) {
                k(z10);
            } else if (this.f122481j) {
                j();
            }
            VelocityTracker velocityTracker2 = this.f122484m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.f122484m = null;
            this.f122485n = 0.0f;
            this.f122479h = 0.0f;
            this.f122480i = 0.0f;
            this.f122481j = false;
        }
        return false;
    }
}
