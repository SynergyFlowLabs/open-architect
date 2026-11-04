package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.collection.b3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class h extends Drawable implements androidx.vectordrawable.graphics.drawable.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final boolean f113229o = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f113230s = 500;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Property<h, Float> f113231t = new c(Float.class, "growFraction");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f113232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.material.progressindicator.c f113233b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ValueAnimator f113235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ValueAnimator f113236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f113237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f113238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f113239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b.a> f113240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.b.a f113241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f113242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f113243l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @g0(from = 0, to = b3.f12144d)
    private int f113245n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Paint f113244m = new Paint();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.google.android.material.progressindicator.a f113234c = new com.google.android.material.progressindicator.a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            h.this.h();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            h.super.setVisible(false, false);
            h.this.g();
        }
    }

    class c extends Property<h, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(h hVar) {
            return Float.valueOf(hVar.j());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(h hVar, Float f10) {
            hVar.p(f10.floatValue());
        }
    }

    h(@NonNull Context context, @NonNull com.google.android.material.progressindicator.c cVar) {
        this.f113232a = context;
        this.f113233b = cVar;
        setAlpha(255);
    }

    private void f(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f113242k;
        this.f113242k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f113242k = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        androidx.vectordrawable.graphics.drawable.b.a aVar = this.f113241j;
        if (aVar != null) {
            aVar.b(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f113240i;
        if (list != null && !this.f113242k) {
            Iterator<androidx.vectordrawable.graphics.drawable.b.a> it = list.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        androidx.vectordrawable.graphics.drawable.b.a aVar = this.f113241j;
        if (aVar != null) {
            aVar.c(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f113240i;
        if (list != null && !this.f113242k) {
            Iterator<androidx.vectordrawable.graphics.drawable.b.a> it = list.iterator();
            while (it.hasNext()) {
                it.next().c(this);
            }
        }
    }

    private void i(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f113242k;
        this.f113242k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f113242k = z10;
    }

    private void o() {
        if (this.f113235d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f113231t, 0.0f, 1.0f);
            this.f113235d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f113235d.setInterpolator(com.google.android.material.animation.b.f111044b);
            u(this.f113235d);
        }
        if (this.f113236e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f113231t, 1.0f, 0.0f);
            this.f113236e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f113236e.setInterpolator(com.google.android.material.animation.b.f111044b);
            q(this.f113236e);
        }
    }

    private void q(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f113236e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f113236e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void u(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f113235d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f113235d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public boolean b(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f113240i;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.f113240i.remove(aVar);
        if (!this.f113240i.isEmpty()) {
            return true;
        }
        this.f113240i = null;
        return true;
    }

    public void c(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        if (this.f113240i == null) {
            this.f113240i = new ArrayList();
        }
        if (this.f113240i.contains(aVar)) {
            return;
        }
        this.f113240i.add(aVar);
    }

    public void clearAnimationCallbacks() {
        this.f113240i.clear();
        this.f113240i = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f113245n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return n() || m();
    }

    float j() {
        if (!this.f113233b.b() && !this.f113233b.a()) {
            return 1.0f;
        }
        if (!this.f113238g && !this.f113237f) {
            return this.f113243l;
        }
        return this.f113239h;
    }

    @NonNull
    ValueAnimator k() {
        return this.f113236e;
    }

    public boolean l() {
        return v(false, false, false);
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.f113236e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f113238g;
    }

    public boolean n() {
        ValueAnimator valueAnimator = this.f113235d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f113237f;
    }

    void p(@x(from = 0.0d, to = 1.0d) float f10) {
        if (this.f113243l != f10) {
            this.f113243l = f10;
            invalidateSelf();
        }
    }

    void r(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        this.f113241j = aVar;
    }

    @l1
    void s(boolean z10, @x(from = 0.0d, to = 1.0d) float f10) {
        this.f113238g = z10;
        this.f113239h = f10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@g0(from = 0, to = b3.f12144d) int i10) {
        this.f113245n = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f113244m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return v(z10, z11, true);
    }

    public void start() {
        w(true, true, false);
    }

    public void stop() {
        w(false, true, false);
    }

    @l1
    void t(boolean z10, @x(from = 0.0d, to = 1.0d) float f10) {
        this.f113237f = z10;
        this.f113239h = f10;
    }

    public boolean v(boolean z10, boolean z11, boolean z12) {
        return w(z10, z11, z12 && this.f113234c.a(this.f113232a.getContentResolver()) > 0.0f);
    }

    boolean w(boolean z10, boolean z11, boolean z12) {
        o();
        int i10 = 4 | 0;
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f113235d : this.f113236e;
        ValueAnimator valueAnimator2 = z10 ? this.f113236e : this.f113235d;
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                f(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                i(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z13 = !z10 || super.setVisible(z10, false);
        if (!(z10 ? this.f113233b.b() : this.f113233b.a())) {
            i(valueAnimator);
            return z13;
        }
        if (z11 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z13;
        }
        valueAnimator.resume();
        return z13;
    }
}
