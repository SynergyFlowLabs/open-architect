package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.annotation.p0;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class n extends a<PointF, PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f88123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final PointF f88124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a<Float, Float> f88125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a<Float, Float> f88126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    protected com.airbnb.lottie.value.j<Float> f88127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    protected com.airbnb.lottie.value.j<Float> f88128n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.EMPTY_LIST);
        this.f88123i = new PointF();
        this.f88124j = new PointF();
        this.f88125k = aVar;
        this.f88126l = aVar2;
        n(f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void n(float f10) {
        this.f88125k.n(f10);
        this.f88126l.n(f10);
        this.f88123i.set(this.f88125k.h().floatValue(), this.f88126l.h().floatValue());
        for (int i10 = 0; i10 < this.f88081a.size(); i10++) {
            this.f88081a.get(i10).d();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f10) {
        float f11;
        Float fB;
        com.airbnb.lottie.value.a<Float> aVarB;
        com.airbnb.lottie.value.a<Float> aVarB2;
        Float fB2 = null;
        if (this.f88127m == null || (aVarB2 = this.f88125k.b()) == null) {
            f11 = f10;
            fB = null;
        } else {
            float fD = this.f88125k.d();
            Float f12 = aVarB2.f88875h;
            com.airbnb.lottie.value.j<Float> jVar = this.f88127m;
            float f13 = aVarB2.f88874g;
            f11 = f10;
            fB = jVar.b(f13, f12 == null ? f13 : f12.floatValue(), aVarB2.f88869b, aVarB2.f88870c, f10, f10, fD);
        }
        if (this.f88128n != null && (aVarB = this.f88126l.b()) != null) {
            float fD2 = this.f88126l.d();
            Float f14 = aVarB.f88875h;
            com.airbnb.lottie.value.j<Float> jVar2 = this.f88128n;
            float f15 = aVarB.f88874g;
            fB2 = jVar2.b(f15, f14 == null ? f15 : f14.floatValue(), aVarB.f88869b, aVarB.f88870c, f11, f11, fD2);
        }
        if (fB == null) {
            this.f88124j.set(this.f88123i.x, 0.0f);
        } else {
            this.f88124j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f88124j;
            pointF.set(pointF.x, this.f88123i.y);
        } else {
            PointF pointF2 = this.f88124j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f88124j;
    }

    public void s(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f88127m;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f88127m = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    public void t(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f88128n;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f88128n = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
