package com.google.firebase.inappmessaging.display.internal;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
@u8.a
public class c {

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f122301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f122302b;

        a(View view, Application application) {
            this.f122301a = view;
            this.f122302b = application;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f122301a.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(this.f122302b.getResources().getInteger(R.integer.config_longAnimTime)).setListener(null);
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f122304a;

        b(d dVar) {
            this.f122304a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f122304a.onComplete();
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.c$c, reason: collision with other inner class name */
    static /* synthetic */ class C1154c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122306a;

        static {
            int[] iArr = new int[e.values().length];
            f122306a = iArr;
            try {
                iArr[e.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122306a[e.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122306a[e.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122306a[e.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void onComplete();
    }

    public enum e {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM;

        /* JADX INFO: Access modifiers changed from: private */
        public static Point n(e eVar, View view) {
            view.measure(-2, -2);
            int i10 = C1154c.f122306a[eVar.ordinal()];
            if (i10 == 1) {
                return new Point(view.getMeasuredWidth() * (-1), 0);
            }
            if (i10 == 2) {
                return new Point(view.getMeasuredWidth(), 0);
            }
            if (i10 != 3 && i10 == 4) {
                return new Point(0, view.getMeasuredHeight());
            }
            return new Point(0, view.getMeasuredHeight() * (-1));
        }
    }

    @ij.a
    c() {
    }

    public void a(Application application, View view, e eVar) {
        view.setAlpha(0.0f);
        Point pointN = e.n(eVar, view);
        view.animate().translationX(pointN.x).translationY(pointN.y).setDuration(1L).setListener(new a(view, application));
    }

    public void b(Application application, View view, e eVar, d dVar) {
        Point pointN = e.n(eVar, view);
        view.animate().translationX(pointN.x).translationY(pointN.y).setDuration(application.getResources().getInteger(R.integer.config_longAnimTime)).setListener(new b(dVar));
    }
}
