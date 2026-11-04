package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.airbnb.lottie.b1;
import com.airbnb.lottie.w0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class p implements com.airbnb.lottie.animation.keyframe.a.b, k, n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f88037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f88038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w0 f88039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f88040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f88041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f88042h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f88045k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f88035a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f88036b = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f88043i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f88044j = null;

    public p(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.l lVar) {
        this.f88037c = lVar.c();
        this.f88038d = lVar.f();
        this.f88039e = w0Var;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarA = lVar.d().a();
        this.f88040f = aVarA;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarA2 = lVar.e().a();
        this.f88041g = aVarA2;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA3 = lVar.b().a();
        this.f88042h = aVarA3;
        bVar.i(aVarA);
        bVar.i(aVarA2);
        bVar.i(aVarA3);
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
    }

    private void b() {
        this.f88045k = false;
        this.f88039e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path S() {
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar;
        if (this.f88045k) {
            return this.f88035a;
        }
        this.f88035a.reset();
        if (this.f88038d) {
            this.f88045k = true;
            return this.f88035a;
        }
        PointF pointFH = this.f88041g.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f88042h;
        float fQ = aVar2 == null ? 0.0f : ((com.airbnb.lottie.animation.keyframe.d) aVar2).q();
        if (fQ == 0.0f && (aVar = this.f88044j) != null) {
            fQ = Math.min(aVar.h().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fQ > fMin) {
            fQ = fMin;
        }
        PointF pointFH2 = this.f88040f.h();
        this.f88035a.moveTo(pointFH2.x + f10, (pointFH2.y - f11) + fQ);
        this.f88035a.lineTo(pointFH2.x + f10, (pointFH2.y + f11) - fQ);
        if (fQ > 0.0f) {
            RectF rectF = this.f88036b;
            float f12 = pointFH2.x;
            float f13 = fQ * 2.0f;
            float f14 = pointFH2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f88035a.arcTo(this.f88036b, 0.0f, 90.0f, false);
        }
        this.f88035a.lineTo((pointFH2.x - f10) + fQ, pointFH2.y + f11);
        if (fQ > 0.0f) {
            RectF rectF2 = this.f88036b;
            float f15 = pointFH2.x;
            float f16 = pointFH2.y;
            float f17 = fQ * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f88035a.arcTo(this.f88036b, 90.0f, 90.0f, false);
        }
        this.f88035a.lineTo(pointFH2.x - f10, (pointFH2.y - f11) + fQ);
        if (fQ > 0.0f) {
            RectF rectF3 = this.f88036b;
            float f18 = pointFH2.x;
            float f19 = pointFH2.y;
            float f20 = fQ * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f88035a.arcTo(this.f88036b, 180.0f, 90.0f, false);
        }
        this.f88035a.lineTo((pointFH2.x + f10) - fQ, pointFH2.y - f11);
        if (fQ > 0.0f) {
            RectF rectF4 = this.f88036b;
            float f21 = pointFH2.x;
            float f22 = fQ * 2.0f;
            float f23 = pointFH2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f88035a.arcTo(this.f88036b, 270.0f, 90.0f, false);
        }
        this.f88035a.close();
        this.f88043i.b(this.f88035a);
        this.f88045k = true;
        return this.f88035a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0037 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == com.airbnb.lottie.model.content.t.a.SIMULTANEOUSLY) {
                    this.f88043i.a(vVar);
                    vVar.b(this);
                } else if (cVar instanceof r) {
                    this.f88044j = ((r) cVar).h();
                }
            } else if (cVar instanceof r) {
                this.f88044j = ((r) cVar).h();
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        if (t10 == b1.f88162l) {
            this.f88041g.o(jVar);
        } else if (t10 == b1.f88164n) {
            this.f88040f.o(jVar);
        } else {
            if (t10 == b1.f88163m) {
                this.f88042h.o(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f88037c;
    }

    @Override // com.airbnb.lottie.model.f
    public void h(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i10, list, eVar2, this);
    }
}
