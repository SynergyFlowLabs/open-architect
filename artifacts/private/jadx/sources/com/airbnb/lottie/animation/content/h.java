package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.collection.b1;
import com.airbnb.lottie.w0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f87976v = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f87977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f87978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f87979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b1<LinearGradient> f87980d = new b1<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b1<RadialGradient> f87981e = new b1<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f87982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f87983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f87984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<n> f87985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.g f87986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f87987k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f87988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f87989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f87990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f87991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.q f87992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final w0 f87993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f87994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f87995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f87996t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.c f87997u;

    public h(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.e eVar) {
        Path path = new Path();
        this.f87982f = path;
        this.f87983g = new com.airbnb.lottie.animation.a(1);
        this.f87984h = new RectF();
        this.f87985i = new ArrayList();
        this.f87996t = 0.0f;
        this.f87979c = bVar;
        this.f87977a = eVar.f();
        this.f87978b = eVar.i();
        this.f87993q = w0Var;
        this.f87986j = eVar.e();
        path.setFillType(eVar.c());
        this.f87994r = (int) (kVar.d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> aVarA = eVar.d().a();
        this.f87987k = aVarA;
        aVarA.a(this);
        bVar.i(aVarA);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarA2 = eVar.g().a();
        this.f87988l = aVarA2;
        aVarA2.a(this);
        bVar.i(aVarA2);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarA3 = eVar.h().a();
        this.f87989m = aVarA3;
        aVarA3.a(this);
        bVar.i(aVarA3);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarA4 = eVar.b().a();
        this.f87990n = aVarA4;
        aVarA4.a(this);
        bVar.i(aVarA4);
        if (bVar.w() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA5 = bVar.w().a().a();
            this.f87995s = aVarA5;
            aVarA5.a(this);
            bVar.i(this.f87995s);
        }
        if (bVar.y() != null) {
            this.f87997u = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.y());
        }
    }

    private int[] b(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.f87992p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int iRound = Math.round(this.f87989m.f() * this.f87994r);
        int iRound2 = Math.round(this.f87990n.f() * this.f87994r);
        int iRound3 = Math.round(this.f87987k.f() * this.f87994r);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        if (iRound3 != 0) {
            i10 = i10 * 31 * iRound3;
        }
        return i10;
    }

    private LinearGradient j() {
        long jI = i();
        LinearGradient linearGradientG = this.f87980d.g(jI);
        if (linearGradientG != null) {
            return linearGradientG;
        }
        PointF pointFH = this.f87989m.h();
        PointF pointFH2 = this.f87990n.h();
        com.airbnb.lottie.model.content.d dVarH = this.f87987k.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, b(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f87980d.n(jI, linearGradient);
        return linearGradient;
    }

    private RadialGradient k() {
        long jI = i();
        RadialGradient radialGradientG = this.f87981e.g(jI);
        if (radialGradientG != null) {
            return radialGradientG;
        }
        PointF pointFH = this.f87989m.h();
        PointF pointFH2 = this.f87990n.h();
        com.airbnb.lottie.model.content.d dVarH = this.f87987k.h();
        int[] iArrB = b(dVarH.d());
        float[] fArrE = dVarH.e();
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f10, f11, fHypot, iArrB, fArrE, Shader.TileMode.CLAMP);
        this.f87981e.n(jI, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f87982f.reset();
        for (int i10 = 0; i10 < this.f87985i.size(); i10++) {
            this.f87982f.addPath(this.f87985i.get(i10).S(), matrix);
        }
        this.f87982f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        if (this.f87978b) {
            return;
        }
        com.airbnb.lottie.f.b("GradientFillContent#draw");
        this.f87982f.reset();
        for (int i11 = 0; i11 < this.f87985i.size(); i11++) {
            this.f87982f.addPath(this.f87985i.get(i11).S(), matrix);
        }
        this.f87982f.computeBounds(this.f87984h, false);
        Shader shaderJ = this.f87986j == com.airbnb.lottie.model.content.g.LINEAR ? j() : k();
        shaderJ.setLocalMatrix(matrix);
        this.f87983g.setShader(shaderJ);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f87991o;
        if (aVar != null) {
            this.f87983g.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f87995s;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f87983g.setMaskFilter(null);
            } else if (fFloatValue != this.f87996t) {
                this.f87983g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f87996t = fFloatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f87997u;
        if (cVar != null) {
            cVar.a(this.f87983g);
        }
        this.f87983g.setAlpha(com.airbnb.lottie.utils.i.d((int) ((((i10 / 255.0f) * this.f87988l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f87982f, this.f87983g);
        com.airbnb.lottie.f.c("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f87993q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof n) {
                this.f87985i.add((n) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t10 == com.airbnb.lottie.b1.f88154d) {
            this.f87988l.o(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f87991o;
            if (aVar != null) {
                this.f87979c.G(aVar);
            }
            if (jVar == null) {
                this.f87991o = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f87991o = qVar;
            qVar.a(this);
            this.f87979c.i(this.f87991o);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.L) {
            com.airbnb.lottie.animation.keyframe.q qVar2 = this.f87992p;
            if (qVar2 != null) {
                this.f87979c.G(qVar2);
            }
            if (jVar == null) {
                this.f87992p = null;
                return;
            }
            this.f87980d.b();
            this.f87981e.b();
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f87992p = qVar3;
            qVar3.a(this);
            this.f87979c.i(this.f87992p);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.f88160j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f87995s;
            if (aVar2 != null) {
                aVar2.o(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar4 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f87995s = qVar4;
            qVar4.a(this);
            this.f87979c.i(this.f87995s);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.f88155e && (cVar5 = this.f87997u) != null) {
            cVar5.b(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.G && (cVar4 = this.f87997u) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.H && (cVar3 = this.f87997u) != null) {
            cVar3.c(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.I && (cVar2 = this.f87997u) != null) {
            cVar2.e(jVar);
        } else {
            if (t10 != com.airbnb.lottie.b1.J || (cVar = this.f87997u) == null) {
                return;
            }
            cVar.g(jVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f87977a;
    }

    @Override // com.airbnb.lottie.model.f
    public void h(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i10, list, eVar2, this);
    }
}
