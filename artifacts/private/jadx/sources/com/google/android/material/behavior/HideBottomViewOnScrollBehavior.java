package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.motion.j;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f111292j = 225;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f111293k = 175;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f111294l = r6.a.c.Fd;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f111295m = r6.a.c.Ld;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f111296n = r6.a.c.Vd;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f111297o = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f111298s = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinkedHashSet<b> f111299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f111302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f111303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @c
    private int f111305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f111306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private ViewPropertyAnimator f111307i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f111307i = null;
        }
    }

    public interface b {
        void a(@NonNull View view, @c int i10);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public @interface c {
    }

    public HideBottomViewOnScrollBehavior() {
        this.f111299a = new LinkedHashSet<>();
        this.f111304f = 0;
        this.f111305g = 2;
        this.f111306h = 0;
    }

    private void P(@NonNull V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f111307i = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    private void Z(@NonNull V v10, @c int i10) {
        this.f111305g = i10;
        Iterator<b> it = this.f111299a.iterator();
        while (it.hasNext()) {
            it.next().a(v10, this.f111305g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (i11 > 0) {
            V(v10);
        } else if (i11 < 0) {
            X(v10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean I(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10, int i11) {
        return i10 == 2;
    }

    public void O(@NonNull b bVar) {
        this.f111299a.add(bVar);
    }

    public void Q() {
        this.f111299a.clear();
    }

    public boolean R() {
        return this.f111305g == 1;
    }

    public boolean S() {
        return this.f111305g == 2;
    }

    public void T(@NonNull b bVar) {
        this.f111299a.remove(bVar);
    }

    public void U(@NonNull V v10, @r int i10) {
        this.f111306h = i10;
        if (this.f111305g == 1) {
            v10.setTranslationY(this.f111304f + i10);
        }
    }

    public void V(@NonNull V v10) {
        W(v10, true);
    }

    public void W(@NonNull V v10, boolean z10) {
        if (R()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f111307i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        Z(v10, 1);
        int i10 = this.f111304f + this.f111306h;
        if (z10) {
            P(v10, i10, this.f111301c, this.f111303e);
        } else {
            v10.setTranslationY(i10);
        }
    }

    public void X(@NonNull V v10) {
        Y(v10, true);
    }

    public void Y(@NonNull V v10, boolean z10) {
        if (S()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f111307i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        Z(v10, 2);
        if (z10) {
            P(v10, 0, this.f111300b, this.f111302d);
        } else {
            v10.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        this.f111304f = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f111300b = j.f(v10.getContext(), f111294l, f111292j);
        this.f111301c = j.f(v10.getContext(), f111295m, f111293k);
        Context context = v10.getContext();
        int i11 = f111296n;
        this.f111302d = j.g(context, i11, com.google.android.material.animation.b.f111046d);
        this.f111303e = j.g(v10.getContext(), i11, com.google.android.material.animation.b.f111045c);
        return super.t(coordinatorLayout, v10, i10);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f111299a = new LinkedHashSet<>();
        this.f111304f = 0;
        this.f111305g = 2;
        this.f111306h = 0;
    }
}
