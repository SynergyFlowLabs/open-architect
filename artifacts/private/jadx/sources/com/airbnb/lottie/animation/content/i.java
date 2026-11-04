package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.p0;
import androidx.collection.b1;
import com.airbnb.lottie.w0;

/* JADX INFO: loaded from: classes3.dex */
public class i extends a {
    private static final int C = 32;
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> A;

    @p0
    private com.airbnb.lottie.animation.keyframe.q B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f87998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f87999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b1<LinearGradient> f88000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final b1<RadialGradient> f88001u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f88002v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.g f88003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f88004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f88005y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f88006z;

    public i(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.f fVar) {
        super(w0Var, bVar, fVar.b().l(), fVar.g().l(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f88000t = new b1<>();
        this.f88001u = new b1<>();
        this.f88002v = new RectF();
        this.f87998r = fVar.j();
        this.f88003w = fVar.f();
        this.f87999s = fVar.n();
        this.f88004x = (int) (w0Var.T().d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> aVarA = fVar.e().a();
        this.f88005y = aVarA;
        aVarA.a(this);
        bVar.i(aVarA);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarA2 = fVar.l().a();
        this.f88006z = aVarA2;
        aVarA2.a(this);
        bVar.i(aVarA2);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarA3 = fVar.d().a();
        this.A = aVarA3;
        aVarA3.a(this);
        bVar.i(aVarA3);
    }

    private int[] j(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.B;
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

    private int k() {
        int iRound = Math.round(this.f88006z.f() * this.f88004x);
        int iRound2 = Math.round(this.A.f() * this.f88004x);
        int iRound3 = Math.round(this.f88005y.f() * this.f88004x);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient l() {
        long jK = k();
        LinearGradient linearGradientG = this.f88000t.g(jK);
        if (linearGradientG != null) {
            return linearGradientG;
        }
        PointF pointFH = this.f88006z.h();
        PointF pointFH2 = this.A.h();
        com.airbnb.lottie.model.content.d dVarH = this.f88005y.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, j(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f88000t.n(jK, linearGradient);
        return linearGradient;
    }

    private RadialGradient m() {
        long jK = k();
        RadialGradient radialGradientG = this.f88001u.g(jK);
        if (radialGradientG != null) {
            return radialGradientG;
        }
        PointF pointFH = this.f88006z.h();
        PointF pointFH2 = this.A.h();
        com.airbnb.lottie.model.content.d dVarH = this.f88005y.h();
        int[] iArrJ = j(dVarH.d());
        float[] fArrE = dVarH.e();
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        RadialGradient radialGradient = new RadialGradient(f10, f11, (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11), iArrJ, fArrE, Shader.TileMode.CLAMP);
        this.f88001u.n(jK, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        if (this.f87999s) {
            return;
        }
        a(this.f88002v, matrix, false);
        Shader shaderL = this.f88003w == com.airbnb.lottie.model.content.g.LINEAR ? l() : m();
        shaderL.setLocalMatrix(matrix);
        this.f87931i.setShader(shaderL);
        super.c(canvas, matrix, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.g(t10, jVar);
        if (t10 == com.airbnb.lottie.b1.L) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.B;
            if (qVar != null) {
                this.f87928f.G(qVar);
            }
            if (jVar == null) {
                this.B = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.B = qVar2;
            qVar2.a(this);
            this.f87928f.i(this.B);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f87998r;
    }
}
