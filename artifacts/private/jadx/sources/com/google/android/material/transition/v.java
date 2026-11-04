package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.transition.g0;
import androidx.transition.s0;
import androidx.transition.y;

/* JADX INFO: loaded from: classes4.dex */
class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f114777a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.f
    static final int f114778b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f114779c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f114780d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final RectF f114781e = new RectF();

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f114782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RectF f114783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f114784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f114785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f114786e;

        a(RectF rectF, RectF rectF2, float f10, float f11, float f12) {
            this.f114782a = rectF;
            this.f114783b = rectF2;
            this.f114784c = f10;
            this.f114785d = f11;
            this.f114786e = f12;
        }

        @Override // com.google.android.material.transition.v.b
        @NonNull
        public com.google.android.material.shape.e a(@NonNull com.google.android.material.shape.e eVar, @NonNull com.google.android.material.shape.e eVar2) {
            return new com.google.android.material.shape.a(v.m(eVar.a(this.f114782a), eVar2.a(this.f114783b), this.f114784c, this.f114785d, this.f114786e));
        }
    }

    interface b {
        @NonNull
        com.google.android.material.shape.e a(@NonNull com.google.android.material.shape.e eVar, @NonNull com.google.android.material.shape.e eVar2);
    }

    private v() {
    }

    static float b(@NonNull RectF rectF) {
        return rectF.width() * rectF.height();
    }

    static com.google.android.material.shape.p c(com.google.android.material.shape.p pVar, final RectF rectF) {
        return pVar.y(new com.google.android.material.shape.p.c() { // from class: com.google.android.material.transition.u
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
        return (pVar.r().a(rectF) == 0.0f && pVar.t().a(rectF) == 0.0f && pVar.l().a(rectF) == 0.0f && pVar.j().a(rectF) == 0.0f) ? false : true;
    }

    static float l(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    static float m(float f10, float f11, @x(from = 0.0d, to = 1.0d) float f12, @x(from = 0.0d, to = 1.0d) float f13, @x(from = 0.0d, to = 1.0d) float f14) {
        return n(f10, f11, f12, f13, f14, false);
    }

    static float n(float f10, float f11, @x(from = 0.0d, to = 1.0d) float f12, @x(from = 0.0d, to = 1.0d) float f13, @x(from = 0.0d) float f14, boolean z10) {
        if (z10 && (f14 < 0.0f || f14 > 1.0f)) {
            return l(f10, f11, f14);
        }
        if (f14 < f12) {
            return f10;
        }
        return f14 > f13 ? f11 : l(f10, f11, (f14 - f12) / (f13 - f12));
    }

    static int o(int i10, int i11, @x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d, to = 1.0d) float f11, @x(from = 0.0d, to = 1.0d) float f12) {
        if (f12 < f10) {
            return i10;
        }
        return f12 > f11 ? i11 : (int) l(i10, i11, (f12 - f10) / (f11 - f10));
    }

    static com.google.android.material.shape.p p(com.google.android.material.shape.p pVar, com.google.android.material.shape.p pVar2, RectF rectF, RectF rectF2, @x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d, to = 1.0d) float f11, @x(from = 0.0d, to = 1.0d) float f12) {
        if (f12 < f10) {
            return pVar;
        }
        return f12 > f11 ? pVar2 : y(pVar, pVar2, rectF, new a(rectF, rectF2, f10, f11, f12));
    }

    static void q(s0 s0Var, @p0 g0 g0Var) {
        if (g0Var != null) {
            s0Var.S0(g0Var);
        }
    }

    static boolean r(g0 g0Var, Context context, @androidx.annotation.f int i10) {
        int iF;
        if (i10 == 0 || g0Var.K() != -1 || (iF = com.google.android.material.motion.j.f(context, i10, -1)) == -1) {
            return false;
        }
        g0Var.E0(iF);
        return true;
    }

    static boolean s(g0 g0Var, Context context, @androidx.annotation.f int i10, TimeInterpolator timeInterpolator) {
        if (i10 == 0 || g0Var.N() != null) {
            return false;
        }
        g0Var.G0(com.google.android.material.motion.j.g(context, i10, timeInterpolator));
        return true;
    }

    static boolean t(g0 g0Var, Context context, @androidx.annotation.f int i10) {
        androidx.transition.w wVarV;
        if (i10 == 0 || (wVarV = v(context, i10)) == null) {
            return false;
        }
        g0Var.I0(wVarV);
        return true;
    }

    static void u(s0 s0Var, @p0 g0 g0Var) {
        if (g0Var != null) {
            s0Var.d1(g0Var);
        }
    }

    @p0
    static androidx.transition.w v(Context context, @androidx.annotation.f int i10) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.type;
        if (i11 != 16) {
            if (i11 == 3) {
                return new y(androidx.core.graphics.o.e(String.valueOf(typedValue.string)));
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
        RectF rectF = f114781e;
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
