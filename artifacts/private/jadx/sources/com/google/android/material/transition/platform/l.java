package com.google.android.material.transition.platform;

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
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.view.u1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
public final class l extends Transition {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f114619g3 = 1;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f114620h3 = 2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f114621i3 = 0;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f114622j3 = 1;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f114623k3 = 2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final int f114624l3 = 3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final int f114625m3 = 0;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final int f114626n3 = 1;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final int f114627o3 = 2;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f114628p2 = 0;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final String f114629p3 = "l";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final String f114630q3 = "materialContainerTransition:bounds";

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final String f114631r3 = "materialContainerTransition:shapeAppearance";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final String[] f114632s3 = {f114630q3, f114631r3};

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final f f114633t3 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final f f114634u3 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), null);

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final f f114635v3 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final f f114636w3 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), null);

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final float f114637x3 = -1.0f;
    private float H1;

    @p0
    private e X;

    @p0
    private e Y;

    @p0
    private e Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f114638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f114639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f114640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f114641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d0
    private int f114642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d0
    private int f114643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d0
    private int f114644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.l
    private int f114645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.l
    private int f114646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.l
    private int f114647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.l
    private int f114648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f114649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f114650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f114651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private View f114652o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f114653p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private float f114654p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private View f114655s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private com.google.android.material.shape.p f114656t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private com.google.android.material.shape.p f114657v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private e f114658w;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f114659a;

        a(h hVar) {
            this.f114659a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f114659a.o(valueAnimator.getAnimatedFraction());
        }
    }

    class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f114662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f114663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f114664d;

        b(View view, h hVar, View view2, View view3) {
            this.f114661a = view;
            this.f114662b = hVar;
            this.f114663c = view2;
            this.f114664d = view3;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            l.this.removeListener(this);
            if (l.this.f114639b) {
                return;
            }
            this.f114663c.setAlpha(1.0f);
            this.f114664d.setAlpha(1.0f);
            com.google.android.material.internal.p0.o(this.f114661a).a(this.f114662b);
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
            com.google.android.material.internal.p0.o(this.f114661a).b(this.f114662b);
            this.f114663c.setAlpha(0.0f);
            this.f114664d.setAlpha(0.0f);
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
        @androidx.annotation.x(from = 0.0d, to = 1.0d)
        private final float f114666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.x(from = 0.0d, to = 1.0d)
        private final float f114667b;

        public e(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11) {
            this.f114666a = f10;
            this.f114667b = f11;
        }

        @androidx.annotation.x(from = 0.0d, to = 1.0d)
        public float c() {
            return this.f114667b;
        }

        @androidx.annotation.x(from = 0.0d, to = 1.0d)
        public float d() {
            return this.f114666a;
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final e f114668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final e f114669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final e f114670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private final e f114671d;

        /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        private f(@NonNull e eVar, @NonNull e eVar2, @NonNull e eVar3, @NonNull e eVar4) {
            this.f114668a = eVar;
            this.f114669b = eVar2;
            this.f114670c = eVar3;
            this.f114671d = eVar4;
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
        private final com.google.android.material.transition.platform.a B;
        private final com.google.android.material.transition.platform.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private com.google.android.material.transition.platform.c G;
        private com.google.android.material.transition.platform.h H;
        private RectF I;
        private float J;
        private float K;
        private float L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f114672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RectF f114673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.material.shape.p f114674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f114675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f114676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final RectF f114677f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.google.android.material.shape.p f114678g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f114679h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Paint f114680i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Paint f114681j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Paint f114682k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Paint f114683l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Paint f114684m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j f114685n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final PathMeasure f114686o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final float f114687p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final float[] f114688q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f114689r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final float f114690s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float f114691t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f114692u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final com.google.android.material.shape.k f114693v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final RectF f114694w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f114695x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final RectF f114696y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final RectF f114697z;

        class a implements s6.a.InterfaceC2504a {
            a() {
            }

            @Override // s6.a.InterfaceC2504a
            public void a(Canvas canvas) {
                h.this.f114672a.draw(canvas);
            }
        }

        class b implements s6.a.InterfaceC2504a {
            b() {
            }

            @Override // s6.a.InterfaceC2504a
            public void a(Canvas canvas) {
                h.this.f114676e.draw(canvas);
            }
        }

        /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.p pVar, float f10, View view2, RectF rectF2, com.google.android.material.shape.p pVar2, float f11, int i10, int i11, int i12, int i13, boolean z10, boolean z11, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.f fVar, f fVar2, boolean z12, a aVar2) {
            this(pathMotion, view, rectF, pVar, f10, view2, rectF2, pVar2, f11, i10, i11, i12, i13, z10, z11, aVar, fVar, fVar2, z12);
        }

        private static float d(RectF rectF, float f10) {
            return ((rectF.centerX() / (f10 / 2.0f)) - 1.0f) * O;
        }

        private static float e(RectF rectF, float f10) {
            return (rectF.centerY() / f10) * P;
        }

        private void f(Canvas canvas, RectF rectF, Path path, @androidx.annotation.l int i10) {
            PointF pointFM = m(rectF);
            int i11 = 4 | 0;
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
            canvas.clipPath(this.f114685n.d(), Region.Op.DIFFERENCE);
            j(canvas);
            canvas.restore();
        }

        private void i(Canvas canvas) {
            com.google.android.material.shape.k kVar = this.f114693v;
            RectF rectF = this.I;
            kVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f114693v.o0(this.J);
            this.f114693v.C0((int) this.K);
            this.f114693v.setShapeAppearanceModel(this.f114685n.c());
            this.f114693v.draw(canvas);
        }

        private void j(Canvas canvas) {
            com.google.android.material.shape.p pVarC = this.f114685n.c();
            if (!pVarC.u(this.I)) {
                canvas.drawPath(this.f114685n.d(), this.f114683l);
            } else {
                float fA = pVarC.r().a(this.I);
                canvas.drawRoundRect(this.I, fA, fA, this.f114683l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f114682k);
            Rect bounds = getBounds();
            RectF rectF = this.f114696y;
            w.x(canvas, bounds, rectF.left, rectF.top, this.H.f114609b, this.G.f114587b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.f114681j);
            Rect bounds = getBounds();
            RectF rectF = this.f114694w;
            w.x(canvas, bounds, rectF.left, rectF.top, this.H.f114608a, this.G.f114586a, new a());
        }

        private static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
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
            this.f114684m.setAlpha((int) (this.f114689r ? w.l(0.0f, 255.0f, f10) : w.l(255.0f, 0.0f, f10)));
            this.f114686o.getPosTan(this.f114687p * f10, this.f114688q, null);
            float[] fArr = this.f114688q;
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
                this.f114686o.getPosTan(this.f114687p * f11, fArr, null);
                float[] fArr2 = this.f114688q;
                f13 += (f13 - fArr2[0]) * f12;
                f14 += (f14 - fArr2[1]) * f12;
            }
            float f15 = f13;
            float f16 = f14;
            com.google.android.material.transition.platform.h hVarA = this.C.a(f10, ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114669b.f114666a))).floatValue(), ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114669b.f114667b))).floatValue(), this.f114673b.width(), this.f114673b.height(), this.f114677f.width(), this.f114677f.height());
            this.H = hVarA;
            RectF rectF = this.f114694w;
            float f17 = hVarA.f114610c;
            rectF.set(f15 - (f17 / 2.0f), f16, (f17 / 2.0f) + f15, hVarA.f114611d + f16);
            RectF rectF2 = this.f114696y;
            com.google.android.material.transition.platform.h hVar = this.H;
            float f18 = hVar.f114612e;
            rectF2.set(f15 - (f18 / 2.0f), f16, f15 + (f18 / 2.0f), hVar.f114613f + f16);
            this.f114695x.set(this.f114694w);
            this.f114697z.set(this.f114696y);
            float fFloatValue = ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114670c.f114666a))).floatValue();
            float fFloatValue2 = ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114670c.f114667b))).floatValue();
            boolean zB = this.C.b(this.H);
            RectF rectF3 = zB ? this.f114695x : this.f114697z;
            float fM = w.m(0.0f, 1.0f, fFloatValue, fFloatValue2, f10);
            if (!zB) {
                fM = 1.0f - fM;
            }
            this.C.c(rectF3, fM, this.H);
            this.I = new RectF(Math.min(this.f114695x.left, this.f114697z.left), Math.min(this.f114695x.top, this.f114697z.top), Math.max(this.f114695x.right, this.f114697z.right), Math.max(this.f114695x.bottom, this.f114697z.bottom));
            this.f114685n.b(f10, this.f114674c, this.f114678g, this.f114694w, this.f114695x, this.f114697z, this.A.f114671d);
            this.J = w.l(this.f114675d, this.f114679h, f10);
            float fD = d(this.I, this.f114690s);
            float fE = e(this.I, this.f114691t);
            float f19 = this.J;
            float f20 = (int) (fE * f19);
            this.K = f20;
            this.f114683l.setShadowLayer(f19, (int) (fD * f19), f20, M);
            this.G = this.B.a(f10, ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114668a.f114666a))).floatValue(), ((Float) androidx.core.util.t.l(Float.valueOf(this.A.f114668a.f114667b))).floatValue(), 0.35f);
            if (this.f114681j.getColor() != 0) {
                this.f114681j.setAlpha(this.G.f114586a);
            }
            if (this.f114682k.getColor() != 0) {
                this.f114682k.setAlpha(this.G.f114587b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.f114684m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f114684m);
            }
            int iSave = this.D ? canvas.save() : -1;
            if (this.f114692u) {
                boolean z10 = false;
                if (this.J > 0.0f) {
                    h(canvas);
                }
            }
            this.f114685n.a(canvas);
            n(canvas, this.f114680i);
            if (this.G.f114588c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(iSave);
                f(canvas, this.f114694w, this.F, -65281);
                g(canvas, this.f114695x, -256);
                g(canvas, this.f114694w, -16711936);
                g(canvas, this.f114697z, -16711681);
                g(canvas, this.f114696y, -16776961);
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

        private h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.p pVar, float f10, View view2, RectF rectF2, com.google.android.material.shape.p pVar2, float f11, @androidx.annotation.l int i10, @androidx.annotation.l int i11, @androidx.annotation.l int i12, int i13, boolean z10, boolean z11, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.f fVar, f fVar2, boolean z12) {
            Paint paint = new Paint();
            this.f114680i = paint;
            Paint paint2 = new Paint();
            this.f114681j = paint2;
            Paint paint3 = new Paint();
            this.f114682k = paint3;
            this.f114683l = new Paint();
            Paint paint4 = new Paint();
            this.f114684m = paint4;
            this.f114685n = new j();
            this.f114688q = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            this.f114693v = kVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f114672a = view;
            this.f114673b = rectF;
            this.f114674c = pVar;
            this.f114675d = f10;
            this.f114676e = view2;
            this.f114677f = rectF2;
            this.f114678g = pVar2;
            this.f114679h = f11;
            this.f114689r = z10;
            this.f114692u = z11;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z12;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f114690s = displayMetrics.widthPixels;
            this.f114691t = displayMetrics.heightPixels;
            paint.setColor(i10);
            paint2.setColor(i11);
            paint3.setColor(i12);
            kVar.p0(ColorStateList.valueOf(0));
            kVar.y0(2);
            kVar.v0(false);
            kVar.w0(N);
            RectF rectF3 = new RectF(rectF);
            this.f114694w = rectF3;
            this.f114695x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f114696y = rectF4;
            this.f114697z = new RectF(rectF4);
            PointF pointFM = m(rectF);
            PointF pointFM2 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointFM.x, pointFM.y, pointFM2.x, pointFM2.y), false);
            this.f114686o = pathMeasure;
            this.f114687p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(w.d(i13));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    public l() {
        this.f114638a = false;
        this.f114639b = false;
        this.f114640c = false;
        this.f114641d = false;
        this.f114642e = R.id.content;
        this.f114643f = -1;
        this.f114644g = -1;
        this.f114645h = 0;
        this.f114646i = 0;
        this.f114647j = 0;
        this.f114648k = 1375731712;
        this.f114649l = 0;
        this.f114650m = 0;
        this.f114651n = 0;
        this.f114653p0 = true;
        this.f114654p1 = -1.0f;
        this.H1 = -1.0f;
    }

    private f C(boolean z10, f fVar, f fVar2) {
        if (!z10) {
            fVar = fVar2;
        }
        return new f((e) w.e(this.f114658w, fVar.f114668a), (e) w.e(this.X, fVar.f114669b), (e) w.e(this.Y, fVar.f114670c), (e) w.e(this.Z, fVar.f114671d), null);
    }

    @g1
    private static int E(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{r6.a.c.Kk});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean H(@NonNull RectF rectF, @NonNull RectF rectF2) {
        int i10 = this.f114649l;
        if (i10 == 0) {
            return w.b(rectF2) > w.b(rectF);
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f114649l);
    }

    private void J(Context context, boolean z10) {
        w.s(this, context, r6.a.c.Vd, com.google.android.material.animation.b.f111044b);
        w.r(this, context, z10 ? r6.a.c.Fd : r6.a.c.Ld);
        if (this.f114640c) {
            return;
        }
        w.t(this, context, r6.a.c.f359201de);
    }

    private f b(boolean z10) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof k)) ? C(z10, f114635v3, f114636w3) : C(z10, f114633t3, f114634u3);
    }

    private static RectF c(View view, @p0 View view2, float f10, float f11) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFH = w.h(view2);
        rectFH.offset(f10, f11);
        return rectFH;
    }

    private static com.google.android.material.shape.p d(@NonNull View view, @NonNull RectF rectF, @p0 com.google.android.material.shape.p pVar) {
        return w.c(u(view, pVar), rectF);
    }

    private static void e(@NonNull TransitionValues transitionValues, @p0 View view, @d0 int i10, @p0 com.google.android.material.shape.p pVar) {
        if (i10 != -1) {
            transitionValues.view = w.g(transitionValues.view, i10);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(r6.a.h.f360763s3) instanceof View) {
            View view2 = (View) transitionValues.view.getTag(r6.a.h.f360763s3);
            transitionValues.view.setTag(r6.a.h.f360763s3, null);
            transitionValues.view = view2;
        }
        View view3 = transitionValues.view;
        if (!u1.Y0(view3) && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        RectF rectFI = view3.getParent() == null ? w.i(view3) : w.h(view3);
        transitionValues.values.put(f114630q3, rectFI);
        transitionValues.values.put(f114631r3, d(view3, rectFI, pVar));
    }

    private static float h(float f10, View view) {
        return f10 != -1.0f ? f10 : u1.T(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.p u(@NonNull View view, @p0 com.google.android.material.shape.p pVar) {
        if (pVar != null) {
            return pVar;
        }
        if (view.getTag(r6.a.h.f360763s3) instanceof com.google.android.material.shape.p) {
            return (com.google.android.material.shape.p) view.getTag(r6.a.h.f360763s3);
        }
        Context context = view.getContext();
        int iE = E(context);
        if (iE != -1) {
            return com.google.android.material.shape.p.b(context, iE, 0).m();
        }
        return view instanceof com.google.android.material.shape.t ? ((com.google.android.material.shape.t) view).getShapeAppearanceModel() : com.google.android.material.shape.p.a().m();
    }

    @p0
    public View A() {
        return this.f114652o;
    }

    @d0
    public int B() {
        return this.f114643f;
    }

    public int D() {
        return this.f114649l;
    }

    public boolean F() {
        return this.f114638a;
    }

    public boolean G() {
        return this.f114653p0;
    }

    public boolean I() {
        return this.f114639b;
    }

    public void K(@androidx.annotation.l int i10) {
        this.f114645h = i10;
        this.f114646i = i10;
        this.f114647j = i10;
    }

    public void L(@androidx.annotation.l int i10) {
        this.f114645h = i10;
    }

    public void M(boolean z10) {
        this.f114638a = z10;
    }

    public void N(@d0 int i10) {
        this.f114642e = i10;
    }

    public void O(boolean z10) {
        this.f114653p0 = z10;
    }

    public void P(@androidx.annotation.l int i10) {
        this.f114647j = i10;
    }

    public void Q(float f10) {
        this.H1 = f10;
    }

    public void S(@p0 com.google.android.material.shape.p pVar) {
        this.f114657v = pVar;
    }

    public void T(@p0 View view) {
        this.f114655s = view;
    }

    public void U(@d0 int i10) {
        this.f114644g = i10;
    }

    public void V(int i10) {
        this.f114650m = i10;
    }

    public void W(@p0 e eVar) {
        this.f114658w = eVar;
    }

    public void X(int i10) {
        this.f114651n = i10;
    }

    public void Y(boolean z10) {
        this.f114639b = z10;
    }

    public void Z(@p0 e eVar) {
        this.Y = eVar;
    }

    public void a0(@p0 e eVar) {
        this.X = eVar;
    }

    public void b0(@androidx.annotation.l int i10) {
        this.f114648k = i10;
    }

    public void c0(@p0 e eVar) {
        this.Z = eVar;
    }

    @Override // android.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        e(transitionValues, this.f114655s, this.f114644g, this.f114657v);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        e(transitionValues, this.f114652o, this.f114643f, this.f114656t);
    }

    @Override // android.transition.Transition
    @p0
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @p0 TransitionValues transitionValues, @p0 TransitionValues transitionValues2) {
        View viewF;
        View view = null;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get(f114630q3);
            com.google.android.material.shape.p pVar = (com.google.android.material.shape.p) transitionValues.values.get(f114631r3);
            if (rectF != null && pVar != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get(f114630q3);
                com.google.android.material.shape.p pVar2 = (com.google.android.material.shape.p) transitionValues2.values.get(f114631r3);
                if (rectF2 != null && pVar2 != null) {
                    View view2 = transitionValues.view;
                    View view3 = transitionValues2.view;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.f114642e == view4.getId()) {
                        viewF = (View) view4.getParent();
                        view = view4;
                    } else {
                        viewF = w.f(view4, this.f114642e);
                    }
                    RectF rectFH = w.h(viewF);
                    float f10 = -rectFH.left;
                    float f11 = -rectFH.top;
                    RectF rectFC = c(viewF, view, f10, f11);
                    rectF.offset(f10, f11);
                    rectF2.offset(f10, f11);
                    boolean zH = H(rectF, rectF2);
                    if (!this.f114641d) {
                        J(view4.getContext(), zH);
                    }
                    h hVar = new h(getPathMotion(), view2, rectF, pVar, h(this.f114654p1, view2), view3, rectF2, pVar2, h(this.H1, view3), this.f114645h, this.f114646i, this.f114647j, this.f114648k, zH, this.f114653p0, com.google.android.material.transition.platform.b.a(this.f114650m, zH), com.google.android.material.transition.platform.g.a(this.f114651n, zH, rectF, rectF2), b(zH), this.f114638a, null);
                    hVar.setBounds(Math.round(rectFC.left), Math.round(rectFC.top), Math.round(rectFC.right), Math.round(rectFC.bottom));
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new a(hVar));
                    addListener(new b(viewF, hVar, view2, view3));
                    return valueAnimatorOfFloat;
                }
            }
        }
        return null;
    }

    public void d0(@androidx.annotation.l int i10) {
        this.f114646i = i10;
    }

    public void e0(float f10) {
        this.f114654p1 = f10;
    }

    @androidx.annotation.l
    public int f() {
        return this.f114645h;
    }

    public void f0(@p0 com.google.android.material.shape.p pVar) {
        this.f114656t = pVar;
    }

    @d0
    public int g() {
        return this.f114642e;
    }

    public void g0(@p0 View view) {
        this.f114652o = view;
    }

    @Override // android.transition.Transition
    @p0
    public String[] getTransitionProperties() {
        return f114632s3;
    }

    public void h0(@d0 int i10) {
        this.f114643f = i10;
    }

    @androidx.annotation.l
    public int i() {
        return this.f114647j;
    }

    public void i0(int i10) {
        this.f114649l = i10;
    }

    public float j() {
        return this.H1;
    }

    @p0
    public com.google.android.material.shape.p k() {
        return this.f114657v;
    }

    @p0
    public View l() {
        return this.f114655s;
    }

    @d0
    public int n() {
        return this.f114644g;
    }

    public int o() {
        return this.f114650m;
    }

    @p0
    public e p() {
        return this.f114658w;
    }

    public int q() {
        return this.f114651n;
    }

    @p0
    public e r() {
        return this.Y;
    }

    @p0
    public e s() {
        return this.X;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@p0 PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f114640c = true;
    }

    @androidx.annotation.l
    public int t() {
        return this.f114648k;
    }

    @p0
    public e v() {
        return this.Z;
    }

    @androidx.annotation.l
    public int w() {
        return this.f114646i;
    }

    public float x() {
        return this.f114654p1;
    }

    @p0
    public com.google.android.material.shape.p z() {
        return this.f114656t;
    }

    public l(@NonNull Context context, boolean z10) {
        this.f114638a = false;
        this.f114639b = false;
        this.f114640c = false;
        this.f114641d = false;
        this.f114642e = R.id.content;
        this.f114643f = -1;
        this.f114644g = -1;
        this.f114645h = 0;
        this.f114646i = 0;
        this.f114647j = 0;
        this.f114648k = 1375731712;
        this.f114649l = 0;
        this.f114650m = 0;
        this.f114651n = 0;
        this.f114653p0 = true;
        this.f114654p1 = -1.0f;
        this.H1 = -1.0f;
        J(context, z10);
        this.f114641d = true;
    }
}
