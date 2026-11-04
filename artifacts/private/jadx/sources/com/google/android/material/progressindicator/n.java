package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class n extends j<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f113272k = 1800;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f113273l = {533, 567, 850, 750};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f113274m = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Property<n, Float> f113275n = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f113276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f113277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Interpolator[] f113278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.progressindicator.c f113279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f113280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f113281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f113282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b.a f113283j;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            n nVar = n.this;
            nVar.f113280g = (nVar.f113280g + 1) % n.this.f113279f.f113186c.length;
            n.this.f113281h = true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            n.this.a();
            n nVar = n.this;
            androidx.vectordrawable.graphics.drawable.b.a aVar = nVar.f113283j;
            if (aVar != null) {
                aVar.b(nVar.f113253a);
            }
        }
    }

    class c extends Property<n, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(n nVar) {
            return Float.valueOf(nVar.p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(n nVar, Float f10) {
            nVar.h(f10.floatValue());
        }
    }

    public n(@NonNull Context context, @NonNull o oVar) {
        super(2);
        this.f113280g = 0;
        this.f113283j = null;
        this.f113279f = oVar;
        this.f113278e = new Interpolator[]{androidx.vectordrawable.graphics.drawable.d.b(context, r6.a.C2470a.D), androidx.vectordrawable.graphics.drawable.d.b(context, r6.a.C2470a.E), androidx.vectordrawable.graphics.drawable.d.b(context, r6.a.C2470a.F), androidx.vectordrawable.graphics.drawable.d.b(context, r6.a.C2470a.G)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f113282i;
    }

    private void q() {
        if (this.f113276c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f113275n, 0.0f, 1.0f);
            this.f113276c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f113276c.setInterpolator(null);
            this.f113276c.setRepeatCount(-1);
            this.f113276c.addListener(new a());
        }
        if (this.f113277d == null) {
            int i10 = 5 << 1;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f113275n, 1.0f);
            this.f113277d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f113277d.setInterpolator(null);
            this.f113277d.addListener(new b());
        }
    }

    private void r() {
        if (this.f113281h) {
            Iterator<i.a> it = this.f113254b.iterator();
            while (it.hasNext()) {
                it.next().f113251c = this.f113279f.f113186c[this.f113280g];
            }
            this.f113281h = false;
        }
    }

    private void s(int i10) {
        for (int i11 = 0; i11 < this.f113254b.size(); i11++) {
            i.a aVar = this.f113254b.get(i11);
            int[] iArr = f113274m;
            int i12 = i11 * 2;
            int i13 = iArr[i12];
            int[] iArr2 = f113273l;
            aVar.f113249a = n1.a.d(this.f113278e[i12].getInterpolation(b(i10, i13, iArr2[i12])), 0.0f, 1.0f);
            int i14 = i12 + 1;
            aVar.f113250b = n1.a.d(this.f113278e[i14].getInterpolation(b(i10, iArr[i14], iArr2[i14])), 0.0f, 1.0f);
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void a() {
        ObjectAnimator objectAnimator = this.f113276c;
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
        this.f113283j = aVar;
    }

    @Override // com.google.android.material.progressindicator.j
    public void f() {
        ObjectAnimator objectAnimator = this.f113277d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            a();
            if (this.f113253a.isVisible()) {
                this.f113277d.setFloatValues(this.f113282i, 1.0f);
                this.f113277d.setDuration((long) ((1.0f - this.f113282i) * 1800.0f));
                this.f113277d.start();
            }
        }
    }

    @Override // com.google.android.material.progressindicator.j
    @l1
    void g() {
        this.f113280g = 0;
        Iterator<i.a> it = this.f113254b.iterator();
        while (it.hasNext()) {
            it.next().f113251c = this.f113279f.f113186c[0];
        }
    }

    @Override // com.google.android.material.progressindicator.j
    @l1
    void h(float f10) {
        this.f113282i = f10;
        s((int) (f10 * 1800.0f));
        r();
        this.f113253a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.j
    public void i() {
        q();
        g();
        this.f113276c.start();
    }

    @Override // com.google.android.material.progressindicator.j
    public void j() {
        this.f113283j = null;
    }
}
