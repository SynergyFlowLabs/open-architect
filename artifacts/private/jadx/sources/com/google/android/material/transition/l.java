package com.google.android.material.transition;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.view.u1;
import androidx.transition.g0;
import androidx.transition.u0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends g0 {

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final int f114515h4 = 0;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final int f114516i4 = 1;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final int f114517j4 = 2;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final int f114518k4 = 0;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final int f114519l4 = 1;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final int f114520m4 = 2;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final int f114521n4 = 3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final int f114522o4 = 0;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final int f114523p4 = 1;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final int f114524q4 = 2;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final String f114525r4 = "l";

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private static final String f114526s4 = "materialContainerTransition:bounds";

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final String f114527t4 = "materialContainerTransition:shapeAppearance";

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final String[] f114528u4 = {f114526s4, f114527t4};

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final f f114529v4 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private static final f f114530w4 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), null);

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private static final f f114531x4 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private static final f f114532y4 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), null);

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private static final float f114533z4 = -1.0f;
    private boolean I3;
    private boolean J3;
    private boolean K3;
    private boolean L3;

    @d0
    private int M3;

    @d0
    private int N3;

    @d0
    private int O3;

    @androidx.annotation.l
    private int P3;

    @androidx.annotation.l
    private int Q3;

    @androidx.annotation.l
    private int R3;

    @androidx.annotation.l
    private int S3;
    private int T3;
    private int U3;
    private int V3;

    @p0
    private View W3;

    @p0
    private View X3;

    @p0
    private com.google.android.material.shape.p Y3;

    @p0
    private com.google.android.material.shape.p Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    @p0
    private e f114534a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    @p0
    private e f114535b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    @p0
    private e f114536c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    @p0
    private e f114537d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private boolean f114538e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private float f114539f4;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private float f114540g4;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f114541a;

        a(h hVar) {
            this.f114541a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f114541a.o(valueAnimator.getAnimatedFraction());
        }
    }

    class b extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f114544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f114545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f114546d;

        b(View view, h hVar, View view2, View view3) {
            this.f114543a = view;
            this.f114544b = hVar;
            this.f114545c = view2;
            this.f114546d = view3;
        }

        @Override // com.google.android.material.transition.t, androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
            com.google.android.material.internal.p0.o(this.f114543a).b(this.f114544b);
            int i10 = 5 & 0;
            this.f114545c.setAlpha(0.0f);
            this.f114546d.setAlpha(0.0f);
        }

        @Override // com.google.android.material.transition.t, androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            l.this.u0(this);
            if (l.this.J3) {
                return;
            }
            this.f114545c.setAlpha(1.0f);
            this.f114546d.setAlpha(1.0f);
            com.google.android.material.internal.p0.o(this.f114543a).a(this.f114544b);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @x(from = 0.0d, to = 1.0d)
        private final float f114548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x(from = 0.0d, to = 1.0d)
        private final float f114549b;

        public e(@x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d, to = 1.0d) float f11) {
            this.f114548a = f10;
            this.f114549b = f11;
        }

        @x(from = 0.0d, to = 1.0d)
        public float c() {
            return this.f114549b;
        }

        @x(from = 0.0d, to = 1.0d)
        public float d() {
            return this.f114548a;
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final e f114550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final e f114551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final e f114552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private final e f114553d;

        /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        private f(@NonNull e eVar, @NonNull e eVar2, @NonNull e eVar3, @NonNull e eVar4) {
            this.f114550a = eVar;
            this.f114551b = eVar2;
            this.f114552c = eVar3;
            this.f114553d = eVar4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface g {
    }

    private static final class h extends Drawable {
        private static final int M = 754974720;
        private static final int N = -7829368;
        private static final float O = 0.3f;
        private static final float P = 1.5f;
        private final f A;
        private final com.google.android.material.transition.a B;
        private final com.google.android.material.transition.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private com.google.android.material.transition.c G;
        private com.google.android.material.transition.h H;
        private RectF I;
        private float J;
        private float K;
        private float L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f114554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RectF f114555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.material.shape.p f114556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f114557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f114558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final RectF f114559f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.google.android.material.shape.p f114560g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f114561h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Paint f114562i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Paint f114563j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Paint f114564k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Paint f114565l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Paint f114566m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j f114567n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final PathMeasure f114568o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final float f114569p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final float[] f114570q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f114571r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final float f114572s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float f114573t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f114574u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final com.google.android.material.shape.k f114575v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final RectF f114576w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f114577x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final RectF f114578y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final RectF f114579z;

        class a implements s6.a.InterfaceC2504a {
            a() {
            }

            @Override // s6.a.InterfaceC2504a
            public void a(Canvas canvas) {
                h.this.f114554a.draw(canvas);
            }
        }

        class b implements s6.a.InterfaceC2504a {
            b() {
            }

            @Override // s6.a.InterfaceC2504a
            public void a(Canvas canvas) {
                h.this.f114558e.draw(canvas);
            }
        }

        /* synthetic */ h(androidx.transition.w wVar, View view, RectF rectF, com.google.android.material.shape.p pVar, float f10, View view2, RectF rectF2, com.google.android.material.shape.p pVar2, float f11, int i10, int i11, int i12, int i13, boolean z10, boolean z11, com.google.android.material.transition.a aVar, com.google.android.material.transition.f fVar, f fVar2, boolean z12, a aVar2) {
            this(wVar, view, rectF, pVar, f10, view2, rectF2, pVar2, f11, i10, i11, i12, i13, z10, z11, aVar, fVar, fVar2, z12);
        }

        private static float d(RectF rectF, float f10) {
            return ((rectF.centerX() / (f10 / 2.0f)) - 1.0f) * O;
        }

        private static float e(RectF rectF, float f10) {
            return (rectF.centerY() / f10) * P;
        }

        private void f(Canvas canvas, RectF rectF, Path path, @androidx.annotation.l int i10) {
            PointF pointFM = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(pointFM.x, pointFM.y);
            } else {
                path.lineTo(pointFM.x, pointFM.y);
                this.E.setColor(i10);
                canvas.drawPath(path, this.E);
            }
        }

        private void g(Canvas canvas, RectF rectF, @androidx.annotation.l int i10) {
            this.E.setColor(i10);
            canvas.drawRect(rectF, this.E);
        }

        private void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f114567n.d(), Region.Op.DIFFERENCE);
            j(canvas);
            canvas.restore();
        }

        private void i(Canvas canvas) {
            com.google.android.material.shape.k kVar = this.f114575v;
            RectF rectF = this.I;
            kVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f114575v.o0(this.J);
            this.f114575v.C0((int) this.K);
            this.f114575v.setShapeAppearanceModel(this.f114567n.c());
            this.f114575v.draw(canvas);
        }

        private void j(Canvas canvas) {
            com.google.android.material.shape.p pVarC = this.f114567n.c();
            if (!pVarC.u(this.I)) {
                canvas.drawPath(this.f114567n.d(), this.f114565l);
            } else {
                float fA = pVarC.r().a(this.I);
                canvas.drawRoundRect(this.I, fA, fA, this.f114565l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f114564k);
            Rect bounds = getBounds();
            RectF rectF = this.f114578y;
            v.x(canvas, bounds, rectF.left, rectF.top, this.H.f114505b, this.G.f114483b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.f114563j);
            Rect bounds = getBounds();
            RectF rectF = this.f114576w;
            v.x(canvas, bounds, rectF.left, rectF.top, this.H.f114504a, this.G.f114482a, new a());
        }

        private static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void n(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(float f10) {
            if (this.L != f10) {
                p(f10);
            }
        }

        private void p(float f10) {
            float f11;
            float f12;
            this.L = f10;
            this.f114566m.setAlpha((int) (this.f114571r ? v.l(0.0f, 255.0f, f10) : v.l(255.0f, 0.0f, f10)));
            this.f114568o.getPosTan(this.f114569p * f10, this.f114570q, null);
            float[] fArr = this.f114570q;
            float f13 = fArr[0];
            float f14 = fArr[1];
            if (f10 > 1.0f || f10 < 0.0f) {
                if (f10 > 1.0f) {
                    f12 = (f10 - 1.0f) / 0.00999999f;
                    f11 = 0.99f;
                } else {
                    f11 = 0.01f;
                    f12 = (f10 / 0.01f) * (-1.0f);
                }
                this.f114568o.getPosTan(this.f114569p * f11, fArr, null);
                float[] fArr2 = this.f114570q;
                f13 += (f13 - fArr2[0]) * f12;
                f14 += (f14 - fArr2[1]) * f12;
            }
            float f15 = f13;
            float f16 = f14;
            com.google.android.material.transition.h hVarA = this.C.a(f10, ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114551b.f114548a))).floatValue(), ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114551b.f114549b))).floatValue(), this.f114555b.width(), this.f114555b.height(), this.f114559f.width(), this.f114559f.height());
            this.H = hVarA;
            RectF rectF = this.f114576w;
            float f17 = hVarA.f114506c;
            rectF.set(f15 - (f17 / 2.0f), f16, (f17 / 2.0f) + f15, hVarA.f114507d + f16);
            RectF rectF2 = this.f114578y;
            com.google.android.material.transition.h hVar = this.H;
            float f18 = hVar.f114508e;
            rectF2.set(f15 - (f18 / 2.0f), f16, f15 + (f18 / 2.0f), hVar.f114509f + f16);
            this.f114577x.set(this.f114576w);
            this.f114579z.set(this.f114578y);
            float fFloatValue = ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114552c.f114548a))).floatValue();
            float fFloatValue2 = ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114552c.f114549b))).floatValue();
            boolean zB = this.C.b(this.H);
            RectF rectF3 = zB ? this.f114577x : this.f114579z;
            float fM = v.m(0.0f, 1.0f, fFloatValue, fFloatValue2, f10);
            if (!zB) {
                fM = 1.0f - fM;
            }
            this.C.c(rectF3, fM, this.H);
            this.I = new RectF(Math.min(this.f114577x.left, this.f114579z.left), Math.min(this.f114577x.top, this.f114579z.top), Math.max(this.f114577x.right, this.f114579z.right), Math.max(this.f114577x.bottom, this.f114579z.bottom));
            this.f114567n.b(f10, this.f114556c, this.f114560g, this.f114576w, this.f114577x, this.f114579z, this.A.f114553d);
            this.J = v.l(this.f114557d, this.f114561h, f10);
            float fD = d(this.I, this.f114572s);
            float fE = e(this.I, this.f114573t);
            float f19 = this.J;
            float f20 = (int) (fE * f19);
            this.K = f20;
            this.f114565l.setShadowLayer(f19, (int) (fD * f19), f20, M);
            this.G = this.B.a(f10, ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114550a.f114548a))).floatValue(), ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114550a.f114549b))).floatValue(), 0.35f);
            if (this.f114563j.getColor() != 0) {
                this.f114563j.setAlpha(this.G.f114482a);
            }
            if (this.f114564k.getColor() != 0) {
                this.f114564k.setAlpha(this.G.f114483b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.f114566m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f114566m);
            }
            int iSave = this.D ? canvas.save() : -1;
            if (this.f114574u && this.J > 0.0f) {
                h(canvas);
            }
            this.f114567n.a(canvas);
            n(canvas, this.f114562i);
            if (this.G.f114484c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(iSave);
                f(canvas, this.f114576w, this.F, -65281);
                g(canvas, this.f114577x, -256);
                g(canvas, this.f114576w, -16711936);
                g(canvas, this.f114579z, -16711681);
                g(canvas, this.f114578y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@p0 ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        private h(androidx.transition.w wVar, View view, RectF rectF, com.google.android.material.shape.p pVar, float f10, View view2, RectF rectF2, com.google.android.material.shape.p pVar2, float f11, @androidx.annotation.l int i10, @androidx.annotation.l int i11, @androidx.annotation.l int i12, int i13, boolean z10, boolean z11, com.google.android.material.transition.a aVar, com.google.android.material.transition.f fVar, f fVar2, boolean z12) {
            Paint paint = new Paint();
            this.f114562i = paint;
            Paint paint2 = new Paint();
            this.f114563j = paint2;
            Paint paint3 = new Paint();
            this.f114564k = paint3;
            this.f114565l = new Paint();
            Paint paint4 = new Paint();
            this.f114566m = paint4;
            this.f114567n = new j();
            this.f114570q = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            this.f114575v = kVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f114554a = view;
            this.f114555b = rectF;
            this.f114556c = pVar;
            this.f114557d = f10;
            this.f114558e = view2;
            this.f114559f = rectF2;
            this.f114560g = pVar2;
            this.f114561h = f11;
            this.f114571r = z10;
            this.f114574u = z11;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z12;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f114572s = displayMetrics.widthPixels;
            this.f114573t = displayMetrics.heightPixels;
            paint.setColor(i10);
            paint2.setColor(i11);
            paint3.setColor(i12);
            kVar.p0(ColorStateList.valueOf(0));
            kVar.y0(2);
            kVar.v0(false);
            kVar.w0(N);
            RectF rectF3 = new RectF(rectF);
            this.f114576w = rectF3;
            this.f114577x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f114578y = rectF4;
            this.f114579z = new RectF(rectF4);
            PointF pointFM = m(rectF);
            PointF pointFM2 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(wVar.a(pointFM.x, pointFM.y, pointFM2.x, pointFM2.y), false);
            this.f114568o = pathMeasure;
            this.f114569p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(v.d(i13));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    public l() {
        this.I3 = false;
        this.J3 = false;
        this.K3 = false;
        this.L3 = false;
        this.M3 = R.id.content;
        this.N3 = -1;
        this.O3 = -1;
        this.P3 = 0;
        this.Q3 = 0;
        this.R3 = 0;
        this.S3 = 1375731712;
        this.T3 = 0;
        this.U3 = 0;
        this.V3 = 0;
        this.f114538e4 = true;
        this.f114539f4 = -1.0f;
        this.f114540g4 = -1.0f;
    }

    private f O0(boolean z10) {
        androidx.transition.w wVarQ = Q();
        return ((wVarQ instanceof androidx.transition.a) || (wVarQ instanceof k)) ? n1(z10, f114531x4, f114532y4) : n1(z10, f114529v4, f114530w4);
    }

    private static RectF P0(View view, @p0 View view2, float f10, float f11) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFH = v.h(view2);
        rectFH.offset(f10, f11);
        return rectFH;
    }

    private static com.google.android.material.shape.p Q0(@NonNull View view, @NonNull RectF rectF, @p0 com.google.android.material.shape.p pVar) {
        return v.c(g1(view, pVar), rectF);
    }

    private static void R0(@NonNull u0 u0Var, @p0 View view, @d0 int i10, @p0 com.google.android.material.shape.p pVar) {
        if (i10 != -1) {
            u0Var.f75776b = v.g(u0Var.f75776b, i10);
        } else if (view != null) {
            u0Var.f75776b = view;
        } else if (u0Var.f75776b.getTag(r6.a.h.f360763s3) instanceof View) {
            View view2 = (View) u0Var.f75776b.getTag(r6.a.h.f360763s3);
            u0Var.f75776b.setTag(r6.a.h.f360763s3, null);
            u0Var.f75776b = view2;
        }
        View view3 = u0Var.f75776b;
        if (!u1.Y0(view3) && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        RectF rectFI = view3.getParent() == null ? v.i(view3) : v.h(view3);
        u0Var.f75775a.put(f114526s4, rectFI);
        u0Var.f75775a.put(f114527t4, Q0(view3, rectFI, pVar));
    }

    private static float U0(float f10, View view) {
        return f10 != -1.0f ? f10 : u1.T(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.p g1(@NonNull View view, @p0 com.google.android.material.shape.p pVar) {
        if (pVar != null) {
            return pVar;
        }
        if (view.getTag(r6.a.h.f360763s3) instanceof com.google.android.material.shape.p) {
            return (com.google.android.material.shape.p) view.getTag(r6.a.h.f360763s3);
        }
        Context context = view.getContext();
        int iQ1 = q1(context);
        if (iQ1 != -1) {
            return com.google.android.material.shape.p.b(context, iQ1, 0).m();
        }
        return view instanceof com.google.android.material.shape.t ? ((com.google.android.material.shape.t) view).getShapeAppearanceModel() : com.google.android.material.shape.p.a().m();
    }

    private f n1(boolean z10, f fVar, f fVar2) {
        if (!z10) {
            fVar = fVar2;
        }
        int i10 = 4 << 0;
        return new f((e) v.e(this.f114534a4, fVar.f114550a), (e) v.e(this.f114535b4, fVar.f114551b), (e) v.e(this.f114536c4, fVar.f114552c), (e) v.e(this.f114537d4, fVar.f114553d), null);
    }

    @g1
    private static int q1(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{r6.a.c.Kk});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean t1(@NonNull RectF rectF, @NonNull RectF rectF2) {
        int i10 = this.T3;
        if (i10 == 0) {
            return v.b(rectF2) > v.b(rectF);
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.T3);
    }

    private void v1(Context context, boolean z10) {
        v.s(this, context, r6.a.c.Vd, com.google.android.material.animation.b.f111044b);
        v.r(this, context, z10 ? r6.a.c.Fd : r6.a.c.Ld);
        if (this.K3) {
            return;
        }
        v.t(this, context, r6.a.c.f359201de);
    }

    public void A1(boolean z10) {
        this.f114538e4 = z10;
    }

    public void C1(@androidx.annotation.l int i10) {
        this.R3 = i10;
    }

    public void D1(float f10) {
        this.f114540g4 = f10;
    }

    public void E1(@p0 com.google.android.material.shape.p pVar) {
        this.Z3 = pVar;
    }

    public void F1(@p0 View view) {
        this.X3 = view;
    }

    public void G1(@d0 int i10) {
        this.O3 = i10;
    }

    public void H1(int i10) {
        this.U3 = i10;
    }

    @Override // androidx.transition.g0
    public void I0(@p0 androidx.transition.w wVar) {
        super.I0(wVar);
        this.K3 = true;
    }

    public void I1(@p0 e eVar) {
        this.f114534a4 = eVar;
    }

    public void J1(int i10) {
        this.V3 = i10;
    }

    public void K1(boolean z10) {
        this.J3 = z10;
    }

    public void L1(@p0 e eVar) {
        this.f114536c4 = eVar;
    }

    public void M1(@p0 e eVar) {
        this.f114535b4 = eVar;
    }

    public void N1(@androidx.annotation.l int i10) {
        this.S3 = i10;
    }

    public void O1(@p0 e eVar) {
        this.f114537d4 = eVar;
    }

    public void P1(@androidx.annotation.l int i10) {
        this.Q3 = i10;
    }

    public void Q1(float f10) {
        this.f114539f4 = f10;
    }

    public void R1(@p0 com.google.android.material.shape.p pVar) {
        this.Y3 = pVar;
    }

    @androidx.annotation.l
    public int S0() {
        return this.P3;
    }

    public void S1(@p0 View view) {
        this.W3 = view;
    }

    @d0
    public int T0() {
        return this.M3;
    }

    public void T1(@d0 int i10) {
        this.N3 = i10;
    }

    public void U1(int i10) {
        this.T3 = i10;
    }

    @androidx.annotation.l
    public int V0() {
        return this.R3;
    }

    public float W0() {
        return this.f114540g4;
    }

    @p0
    public com.google.android.material.shape.p X0() {
        return this.Z3;
    }

    @p0
    public View Y0() {
        return this.X3;
    }

    @d0
    public int Z0() {
        return this.O3;
    }

    public int a1() {
        return this.U3;
    }

    @Override // androidx.transition.g0
    @p0
    public String[] b0() {
        return f114528u4;
    }

    @p0
    public e b1() {
        return this.f114534a4;
    }

    public int c1() {
        return this.V3;
    }

    @p0
    public e d1() {
        return this.f114536c4;
    }

    @p0
    public e e1() {
        return this.f114535b4;
    }

    @androidx.annotation.l
    public int f1() {
        return this.S3;
    }

    @p0
    public e h1() {
        return this.f114537d4;
    }

    @androidx.annotation.l
    public int i1() {
        return this.Q3;
    }

    public float j1() {
        return this.f114539f4;
    }

    @p0
    public com.google.android.material.shape.p k1() {
        return this.Y3;
    }

    @Override // androidx.transition.g0
    public void l(@NonNull u0 u0Var) {
        R0(u0Var, this.X3, this.O3, this.Z3);
    }

    @p0
    public View l1() {
        return this.W3;
    }

    @d0
    public int m1() {
        return this.N3;
    }

    @Override // androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        R0(u0Var, this.W3, this.N3, this.Y3);
    }

    public int p1() {
        return this.T3;
    }

    public boolean r1() {
        return this.I3;
    }

    public boolean s1() {
        return this.f114538e4;
    }

    @Override // androidx.transition.g0
    @p0
    public Animator t(@NonNull ViewGroup viewGroup, @p0 u0 u0Var, @p0 u0 u0Var2) {
        View viewF;
        View view = null;
        if (u0Var != null && u0Var2 != null) {
            RectF rectF = (RectF) u0Var.f75775a.get(f114526s4);
            com.google.android.material.shape.p pVar = (com.google.android.material.shape.p) u0Var.f75775a.get(f114527t4);
            if (rectF != null && pVar != null) {
                RectF rectF2 = (RectF) u0Var2.f75775a.get(f114526s4);
                com.google.android.material.shape.p pVar2 = (com.google.android.material.shape.p) u0Var2.f75775a.get(f114527t4);
                if (rectF2 != null && pVar2 != null) {
                    View view2 = u0Var.f75776b;
                    View view3 = u0Var2.f75776b;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.M3 == view4.getId()) {
                        viewF = (View) view4.getParent();
                        view = view4;
                    } else {
                        viewF = v.f(view4, this.M3);
                    }
                    RectF rectFH = v.h(viewF);
                    float f10 = -rectFH.left;
                    float f11 = -rectFH.top;
                    RectF rectFP0 = P0(viewF, view, f10, f11);
                    rectF.offset(f10, f11);
                    rectF2.offset(f10, f11);
                    boolean zT1 = t1(rectF, rectF2);
                    if (!this.L3) {
                        v1(view4.getContext(), zT1);
                    }
                    h hVar = new h(Q(), view2, rectF, pVar, U0(this.f114539f4, view2), view3, rectF2, pVar2, U0(this.f114540g4, view3), this.P3, this.Q3, this.R3, this.S3, zT1, this.f114538e4, com.google.android.material.transition.b.a(this.U3, zT1), com.google.android.material.transition.g.a(this.V3, zT1, rectF, rectF2), O0(zT1), this.I3, null);
                    hVar.setBounds(Math.round(rectFP0.left), Math.round(rectFP0.top), Math.round(rectFP0.right), Math.round(rectFP0.bottom));
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new a(hVar));
                    c(new b(viewF, hVar, view2, view3));
                    return valueAnimatorOfFloat;
                }
            }
        }
        return null;
    }

    public boolean u1() {
        return this.J3;
    }

    public void w1(@androidx.annotation.l int i10) {
        this.P3 = i10;
        this.Q3 = i10;
        this.R3 = i10;
    }

    public void x1(@androidx.annotation.l int i10) {
        this.P3 = i10;
    }

    public void y1(boolean z10) {
        this.I3 = z10;
    }

    public void z1(@d0 int i10) {
        this.M3 = i10;
    }

    public l(@NonNull Context context, boolean z10) {
        this.I3 = false;
        this.J3 = false;
        this.K3 = false;
        this.L3 = false;
        this.M3 = R.id.content;
        this.N3 = -1;
        this.O3 = -1;
        this.P3 = 0;
        this.Q3 = 0;
        this.R3 = 0;
        this.S3 = 1375731712;
        this.T3 = 0;
        this.U3 = 0;
        this.V3 = 0;
        this.f114538e4 = true;
        this.f114539f4 = -1.0f;
        this.f114540g4 = -1.0f;
        v1(context, z10);
        this.L3 = true;
    }
}
