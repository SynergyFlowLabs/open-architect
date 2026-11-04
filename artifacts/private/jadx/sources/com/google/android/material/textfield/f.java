package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
class f extends s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f114134n = 100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f114135o = 150;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f114136p = 0.8f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f114137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f114138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f114139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f114140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private EditText f114141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f114142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f114143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatorSet f114144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f114145m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f114207b.f0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f114207b.f0(false);
        }
    }

    f(@NonNull r rVar) {
        super(rVar);
        this.f114142j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f114128a, view);
            }
        };
        this.f114143k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f fVar = this.f114130a;
                fVar.A(fVar.E());
            }
        };
        this.f114137e = com.google.android.material.motion.j.f(rVar.getContext(), r6.a.c.Od, 100);
        this.f114138f = com.google.android.material.motion.j.f(rVar.getContext(), r6.a.c.Od, 150);
        this.f114139g = com.google.android.material.motion.j.g(rVar.getContext(), r6.a.c.Xd, com.google.android.material.animation.b.f111043a);
        this.f114140h = com.google.android.material.motion.j.g(rVar.getContext(), r6.a.c.Vd, com.google.android.material.animation.b.f111046d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        boolean z11 = this.f114207b.I() == z10;
        if (z10 && !this.f114144l.isRunning()) {
            this.f114145m.cancel();
            this.f114144l.start();
            if (z11) {
                this.f114144l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f114144l.cancel();
        this.f114145m.start();
        if (z11) {
            this.f114145m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f114139g);
        valueAnimatorOfFloat.setDuration(this.f114137e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f114131a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f114140h);
        valueAnimatorOfFloat.setDuration(this.f114138f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f114133a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f114144l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f114144l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f114145m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    private boolean E() {
        EditText editText = this.f114141i;
        return editText != null && (editText.hasFocus() || this.f114209d.hasFocus()) && this.f114141i.getText().length() > 0;
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f114141i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f114209d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f114209d.setScaleX(fFloatValue);
        fVar.f114209d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.s
    void a(@NonNull Editable editable) {
        if (this.f114207b.y() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return r6.a.m.S;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return r6.a.g.T1;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f114143k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f114142j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.f114143k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(@p0 EditText editText) {
        this.f114141i = editText;
        this.f114206a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z10) {
        if (this.f114207b.y() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f114141i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114132a.A(true);
                }
            });
        }
    }
}
