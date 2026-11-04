package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.l1;

/* JADX INFO: loaded from: classes4.dex */
final class e extends j<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f113197k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f113198l = 5400;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f113199m = 667;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f113200n = 667;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f113201o = 333;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f113202p = 333;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f113206t = -20;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f113207u = 250;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f113208v = 1520;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f113211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f113212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.interpolator.view.animation.b f113213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.progressindicator.c f113214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f113215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f113216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f113217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b.a f113218j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f113203q = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f113204r = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f113205s = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Property<e, Float> f113209w = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Property<e, Float> f113210x = new d(Float.class, "completeEndFraction");

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            e eVar = e.this;
            eVar.f113215g = (eVar.f113215g + 4) % e.this.f113214f.f113186c.length;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.this.a();
            e eVar = e.this;
            androidx.vectordrawable.graphics.drawable.b.a aVar = eVar.f113218j;
            if (aVar != null) {
                aVar.b(eVar.f113253a);
            }
        }
    }

    class c extends Property<e, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(eVar.q());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f10) {
            eVar.h(f10.floatValue());
        }
    }

    class d extends Property<e, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(eVar.r());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f10) {
            eVar.u(f10.floatValue());
        }
    }

    public e(@NonNull f fVar) {
        super(1);
        this.f113215g = 0;
        this.f113218j = null;
        this.f113214f = fVar;
        this.f113213e = new androidx.interpolator.view.animation.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float q() {
        return this.f113216h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float r() {
        return this.f113217i;
    }

    private void s() {
        if (this.f113211c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f113209w, 0.0f, 1.0f);
            this.f113211c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f113211c.setInterpolator(null);
            this.f113211c.setRepeatCount(-1);
            this.f113211c.addListener(new a());
        }
        if (this.f113212d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f113210x, 0.0f, 1.0f);
            this.f113212d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f113212d.setInterpolator(this.f113213e);
            this.f113212d.addListener(new b());
        }
    }

    private void t(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float fB = b(i10, f113205s[i11], 333);
            if (fB >= 0.0f && fB <= 1.0f) {
                int i12 = i11 + this.f113215g;
                int[] iArr = this.f113214f.f113186c;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i13 = iArr[length];
                int i14 = iArr[length2];
                this.f113254b.get(0).f113251c = com.google.android.material.animation.d.b().evaluate(this.f113213e.getInterpolation(fB), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(float f10) {
        this.f113217i = f10;
    }

    private void v(int i10) {
        i.a aVar = this.f113254b.get(0);
        float f10 = this.f113216h;
        aVar.f113249a = (f10 * 1520.0f) - 20.0f;
        aVar.f113250b = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            aVar.f113250b += this.f113213e.getInterpolation(b(i10, f113203q[i11], 667)) * 250.0f;
            aVar.f113249a += this.f113213e.getInterpolation(b(i10, f113204r[i11], 667)) * 250.0f;
        }
        float f11 = aVar.f113249a;
        float f12 = aVar.f113250b;
        aVar.f113249a = (f11 + ((f12 - f11) * this.f113217i)) / 360.0f;
        aVar.f113250b = f12 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.j
    void a() {
        ObjectAnimator objectAnimator = this.f113211c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void c() {
        g();
    }

    @Override // com.google.android.material.progressindicator.j
    public void d(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        this.f113218j = aVar;
    }

    @Override // com.google.android.material.progressindicator.j
    void f() {
        ObjectAnimator objectAnimator = this.f113212d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f113253a.isVisible()) {
                this.f113212d.start();
            } else {
                a();
            }
        }
    }

    @Override // com.google.android.material.progressindicator.j
    @l1
    void g() {
        this.f113215g = 0;
        this.f113254b.get(0).f113251c = this.f113214f.f113186c[0];
        int i10 = 3 ^ 0;
        this.f113217i = 0.0f;
    }

    @Override // com.google.android.material.progressindicator.j
    @l1
    void h(float f10) {
        this.f113216h = f10;
        int i10 = (int) (f10 * 5400.0f);
        v(i10);
        t(i10);
        this.f113253a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.j
    void i() {
        s();
        g();
        this.f113211c.start();
    }

    @Override // com.google.android.material.progressindicator.j
    public void j() {
        this.f113218j = null;
    }
}
