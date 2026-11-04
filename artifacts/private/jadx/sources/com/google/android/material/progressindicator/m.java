package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class m extends j<ObjectAnimator> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f113262i = 667;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f113263j = 333;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Property<m, Float> f113264k = new b(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f113265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.interpolator.view.animation.b f113266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f113267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f113268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f113269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f113270h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            m mVar = m.this;
            mVar.f113268f = (mVar.f113268f + 1) % m.this.f113267e.f113186c.length;
            m.this.f113269g = true;
        }
    }

    class b extends Property<m, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(m mVar) {
            return Float.valueOf(mVar.p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(m mVar, Float f10) {
            mVar.h(f10.floatValue());
        }
    }

    public m(@NonNull o oVar) {
        super(3);
        this.f113268f = 1;
        this.f113267e = oVar;
        this.f113266d = new androidx.interpolator.view.animation.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f113270h;
    }

    private void q() {
        if (this.f113265c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f113264k, 0.0f, 1.0f);
            this.f113265c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f113265c.setInterpolator(null);
            this.f113265c.setRepeatCount(-1);
            this.f113265c.addListener(new a());
        }
    }

    private void r() {
        if (this.f113269g && this.f113254b.get(1).f113250b < 1.0f) {
            this.f113254b.get(2).f113251c = this.f113254b.get(1).f113251c;
            this.f113254b.get(1).f113251c = this.f113254b.get(0).f113251c;
            this.f113254b.get(0).f113251c = this.f113267e.f113186c[this.f113268f];
            this.f113269g = false;
        }
    }

    private void s(int i10) {
        this.f113254b.get(0).f113249a = 0.0f;
        float fB = b(i10, 0, f113262i);
        i.a aVar = this.f113254b.get(0);
        i.a aVar2 = this.f113254b.get(1);
        float interpolation = this.f113266d.getInterpolation(fB);
        aVar2.f113249a = interpolation;
        aVar.f113250b = interpolation;
        i.a aVar3 = this.f113254b.get(1);
        i.a aVar4 = this.f113254b.get(2);
        float interpolation2 = this.f113266d.getInterpolation(fB + 0.49925038f);
        aVar4.f113249a = interpolation2;
        aVar3.f113250b = interpolation2;
        this.f113254b.get(2).f113250b = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.j
    public void a() {
        ObjectAnimator objectAnimator = this.f113265c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void c() {
        g();
    }

    @Override // com.google.android.material.progressindicator.j
    public void d(@p0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
    }

    @Override // com.google.android.material.progressindicator.j
    public void f() {
    }

    @Override // com.google.android.material.progressindicator.j
    @l1
    void g() {
        this.f113269g = true;
        this.f113268f = 1;
        for (i.a aVar : this.f113254b) {
            c cVar = this.f113267e;
            aVar.f113251c = cVar.f113186c[0];
            aVar.f113252d = cVar.f113190g / 2;
        }
    }

    @Override // com.google.android.material.progressindicator.j
    @l1
    void h(float f10) {
        this.f113270h = f10;
        s((int) (f10 * 333.0f));
        r();
        this.f113253a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.j
    public void i() {
        q();
        g();
        this.f113265c.start();
    }

    @Override // com.google.android.material.progressindicator.j
    public void j() {
    }
}
