package com.google.android.material.transition.platform;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f114750a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.f
    static final int f114751b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f114752c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f114753d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final RectF f114754e = new RectF();

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f114755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RectF f114756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f114757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f114758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f114759e;

        a(RectF rectF, RectF rectF2, float f10, float f11, float f12) {
            this.f114755a = rectF;
            this.f114756b = rectF2;
            this.f114757c = f10;
            this.f114758d = f11;
            this.f114759e = f12;
        }

        @Override // com.google.android.material.transition.platform.w.b
        @NonNull
        public com.google.android.material.shape.e a(@NonNull com.google.android.material.shape.e eVar, @NonNull com.google.android.material.shape.e eVar2) {
            return new com.google.android.material.shape.a(w.m(eVar.a(this.f114755a), eVar2.a(this.f114756b), this.f114757c, this.f114758d, this.f114759e));
        }
    }

    interface b {
        @NonNull
        com.google.android.material.shape.e a(@NonNull com.google.android.material.shape.e eVar, @NonNull com.google.android.material.shape.e eVar2);
    }

    private w() {
    }

    static float b(@NonNull RectF rectF) {
        return rectF.width() * rectF.height();
    }

    static com.google.android.material.shape.p c(com.google.android.material.shape.p pVar, final RectF rectF) {
        return pVar.y(new com.google.android.material.shape.p.c() { // from class: com.google.android.material.transition.platform.v
            @Override // com.google.android.material.shape.p.c
            public final com.google.android.material.shape.e a(com.google.android.material.shape.e eVar) {
                return com.google.android.material.shape.n.b(rectF, eVar);
            }
        });
    }

    static Shader d(@androidx.annotation.l int i10) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i10, i10, Shader.TileMode.CLAMP);
    }

    @NonNull
    static <T> T e(@p0 T t10, @NonNull T t11) {
        return t10 != null ? t10 : t11;
    }

    static View f(View view, @d0 int i10) {
        String resourceName = view.getResources().getResourceName(i10);
        while (view != null) {
            if (view.getId() != i10) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    static View g(View view, @d0 int i10) {
        View viewFindViewById = view.findViewById(i10);
        return viewFindViewById != null ? viewFindViewById : f(view, i10);
    }

    static RectF h(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return new RectF(i10, i11, view.getWidth() + i10, view.getHeight() + i11);
    }

    static RectF i(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static Rect j(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean k(com.google.android.material.shape.p pVar, RectF rectF) {
        if (pVar.r().a(rectF) == 0.0f && pVar.t().a(rectF) == 0.0f && pVar.l().a(rectF) == 0.0f && pVar.j().a(rectF) == 0.0f) {
            return false;
        }
        return true;
    }

    static float l(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    static float m(float f10, float f11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f12, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f13, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f14) {
        return n(f10, f11, f12, f13, f14, false);
    }

    static float n(float f10, float f11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f12, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f13, @androidx.annotation.x(from = 0.0d) float f14, boolean z10) {
        if (z10 && (f14 < 0.0f || f14 > 1.0f)) {
            return l(f10, f11, f14);
        }
        if (f14 < f12) {
            return f10;
        }
        return f14 > f13 ? f11 : l(f10, f11, (f14 - f12) / (f13 - f12));
    }

    static int o(int i10, int i11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f12) {
        if (f12 < f10) {
            return i10;
        }
        return f12 > f11 ? i11 : (int) l(i10, i11, (f12 - f10) / (f11 - f10));
    }

    static com.google.android.material.shape.p p(com.google.android.material.shape.p pVar, com.google.android.material.shape.p pVar2, RectF rectF, RectF rectF2, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f12) {
        if (f12 < f10) {
            return pVar;
        }
        return f12 > f11 ? pVar2 : y(pVar, pVar2, rectF, new a(rectF, rectF2, f10, f11, f12));
    }

    static void q(TransitionSet transitionSet, @p0 Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    static boolean r(Transition transition, Context context, @androidx.annotation.f int i10) {
        int iF;
        if (i10 == 0 || transition.getDuration() != -1 || (iF = com.google.android.material.motion.j.f(context, i10, -1)) == -1) {
            return false;
        }
        transition.setDuration(iF);
        return true;
    }

    static boolean s(Transition transition, Context context, @androidx.annotation.f int i10, TimeInterpolator timeInterpolator) {
        if (i10 == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(com.google.android.material.motion.j.g(context, i10, timeInterpolator));
        return true;
    }

    static boolean t(Transition transition, Context context, @androidx.annotation.f int i10) {
        PathMotion pathMotionV;
        if (i10 == 0 || (pathMotionV = v(context, i10)) == null) {
            return false;
        }
        transition.setPathMotion(pathMotionV);
        return true;
    }

    static void u(TransitionSet transitionSet, @p0 Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    @p0
    static PathMotion v(Context context, @androidx.annotation.f int i10) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.type;
        if (i11 != 16) {
            if (i11 == 3) {
                return new PatternPathMotion(androidx.core.graphics.o.e(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
        int i12 = typedValue.data;
        if (i12 == 0) {
            return null;
        }
        if (i12 == 1) {
            return new k();
        }
        throw new IllegalArgumentException("Invalid motion path type: " + i12);
    }

    private static int w(Canvas canvas, Rect rect, int i10) {
        RectF rectF = f114754e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i10);
    }

    static void x(Canvas canvas, Rect rect, float f10, float f11, float f12, int i10, s6.a.InterfaceC2504a interfaceC2504a) {
        if (i10 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        if (i10 < 255) {
            w(canvas, rect, i10);
        }
        interfaceC2504a.a(canvas);
        canvas.restoreToCount(iSave);
    }

    static com.google.android.material.shape.p y(com.google.android.material.shape.p pVar, com.google.android.material.shape.p pVar2, RectF rectF, b bVar) {
        return (k(pVar, rectF) ? pVar : pVar2).v().L(bVar.a(pVar.r(), pVar2.r())).Q(bVar.a(pVar.t(), pVar2.t())).y(bVar.a(pVar.j(), pVar2.j())).D(bVar.a(pVar.l(), pVar2.l())).m();
    }
}
