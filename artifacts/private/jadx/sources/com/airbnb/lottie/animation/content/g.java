package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.airbnb.lottie.b1;
import com.airbnb.lottie.w0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g implements e, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f87963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f87964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f87965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f87966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f87967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<n> f87968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f87969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f87970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f87971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w0 f87972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f87973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f87974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.c f87975m;

    public g(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.p pVar) {
        Path path = new Path();
        this.f87963a = path;
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f87964b = aVar;
        this.f87968f = new ArrayList();
        this.f87965c = bVar;
        this.f87966d = pVar.d();
        this.f87967e = pVar.f();
        this.f87972j = w0Var;
        if (bVar.w() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA = bVar.w().a().a();
            this.f87973k = aVarA;
            aVarA.a(this);
            bVar.i(this.f87973k);
        }
        if (bVar.y() != null) {
            this.f87975m = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.y());
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f87969g = null;
            this.f87970h = null;
            return;
        }
        androidx.core.graphics.l.c(aVar, bVar.v().l());
        path.setFillType(pVar.c());
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarA2 = pVar.b().a();
        this.f87969g = aVarA2;
        aVarA2.a(this);
        bVar.i(aVarA2);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarA3 = pVar.e().a();
        this.f87970h = aVarA3;
        aVarA3.a(this);
        bVar.i(aVarA3);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f87963a.reset();
        for (int i10 = 0; i10 < this.f87968f.size(); i10++) {
            this.f87963a.addPath(this.f87968f.get(i10).S(), matrix);
        }
        this.f87963a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        if (this.f87967e) {
            return;
        }
        com.airbnb.lottie.f.b("FillContent#draw");
        this.f87964b.setColor((com.airbnb.lottie.utils.i.d((int) ((((i10 / 255.0f) * this.f87970h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.airbnb.lottie.animation.keyframe.b) this.f87969g).q() & 16777215));
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f87971i;
        if (aVar != null) {
            this.f87964b.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f87973k;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f87964b.setMaskFilter(null);
            } else if (fFloatValue != this.f87974l) {
                this.f87964b.setMaskFilter(this.f87965c.x(fFloatValue));
            }
            this.f87974l = fFloatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f87975m;
        if (cVar != null) {
            cVar.a(this.f87964b);
        }
        this.f87963a.reset();
        for (int i11 = 0; i11 < this.f87968f.size(); i11++) {
            this.f87963a.addPath(this.f87968f.get(i11).S(), matrix);
        }
        canvas.drawPath(this.f87963a, this.f87964b);
        com.airbnb.lottie.f.c("FillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f87972j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof n) {
                this.f87968f.add((n) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t10 == b1.f88151a) {
            this.f87969g.o(jVar);
            return;
        }
        if (t10 == b1.f88154d) {
            this.f87970h.o(jVar);
            return;
        }
        if (t10 == b1.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f87971i;
            if (aVar != null) {
                this.f87965c.G(aVar);
            }
            if (jVar == null) {
                this.f87971i = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f87971i = qVar;
            qVar.a(this);
            this.f87965c.i(this.f87971i);
            return;
        }
        if (t10 == b1.f88160j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f87973k;
            if (aVar2 != null) {
                aVar2.o(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f87973k = qVar2;
            qVar2.a(this);
            this.f87965c.i(this.f87973k);
            return;
        }
        if (t10 == b1.f88155e && (cVar5 = this.f87975m) != null) {
            cVar5.b(jVar);
            return;
        }
        if (t10 == b1.G && (cVar4 = this.f87975m) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t10 == b1.H && (cVar3 = this.f87975m) != null) {
            cVar3.c(jVar);
            return;
        }
        if (t10 == b1.I && (cVar2 = this.f87975m) != null) {
            cVar2.e(jVar);
        } else {
            if (t10 != b1.J || (cVar = this.f87975m) == null) {
                return;
            }
            cVar.g(jVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f87966d;
    }

    @Override // com.airbnb.lottie.model.f
    public void h(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i10, list, eVar2, this);
    }
}
