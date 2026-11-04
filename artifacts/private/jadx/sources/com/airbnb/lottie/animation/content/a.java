package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.airbnb.lottie.b1;
import com.airbnb.lottie.w0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements com.airbnb.lottie.animation.keyframe.a.b, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w0 f87927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final com.airbnb.lottie.model.layer.b f87928f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f87930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Paint f87931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f87932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Integer> f87933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, Float>> f87934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f87935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f87936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f87937o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f87938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.c f87939q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PathMeasure f87923a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f87924b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f87925c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f87926d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<b> f87929g = new ArrayList();

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<n> f87940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final v f87941b;

        private b(@p0 v vVar) {
            this.f87940a = new ArrayList();
            this.f87941b = vVar;
        }
    }

    a(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, Paint.Cap cap, Paint.Join join, float f10, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.b bVar3) {
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f87931i = aVar;
        this.f87938p = 0.0f;
        this.f87927e = w0Var;
        this.f87928f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f87933k = dVar.a();
        this.f87932j = bVar2.a();
        if (bVar3 == null) {
            this.f87935m = null;
        } else {
            this.f87935m = bVar3.a();
        }
        this.f87934l = new ArrayList(list.size());
        this.f87930h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f87934l.add(list.get(i10).a());
        }
        bVar.i(this.f87933k);
        bVar.i(this.f87932j);
        for (int i11 = 0; i11 < this.f87934l.size(); i11++) {
            bVar.i(this.f87934l.get(i11));
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f87935m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f87933k.a(this);
        this.f87932j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f87934l.get(i12).a(this);
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f87935m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.w() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA = bVar.w().a().a();
            this.f87937o = aVarA;
            aVarA.a(this);
            bVar.i(this.f87937o);
        }
        if (bVar.y() != null) {
            this.f87939q = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.y());
        }
    }

    private void b(Matrix matrix) {
        float fFloatValue;
        com.airbnb.lottie.f.b("StrokeContent#applyDashPattern");
        if (this.f87934l.isEmpty()) {
            com.airbnb.lottie.f.c("StrokeContent#applyDashPattern");
            return;
        }
        float fG = com.airbnb.lottie.utils.j.g(matrix);
        for (int i10 = 0; i10 < this.f87934l.size(); i10++) {
            this.f87930h[i10] = this.f87934l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f87930h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f87930h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.f87930h;
            fArr3[i10] = fArr3[i10] * fG;
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f87935m;
        if (aVar == null) {
            fFloatValue = 0.0f;
            int i11 = 4 << 0;
        } else {
            fFloatValue = fG * aVar.h().floatValue();
        }
        this.f87931i.setPathEffect(new DashPathEffect(this.f87930h, fFloatValue));
        com.airbnb.lottie.f.c("StrokeContent#applyDashPattern");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011c  */
    private void i(Canvas canvas, b bVar, Matrix matrix) {
        float f10;
        com.airbnb.lottie.f.b("StrokeContent#applyTrimPath");
        if (bVar.f87941b == null) {
            com.airbnb.lottie.f.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f87924b.reset();
        for (int size = bVar.f87940a.size() - 1; size >= 0; size--) {
            this.f87924b.addPath(((n) bVar.f87940a.get(size)).S(), matrix);
        }
        float fFloatValue = bVar.f87941b.i().h().floatValue() / 100.0f;
        float fFloatValue2 = bVar.f87941b.g().h().floatValue() / 100.0f;
        float fFloatValue3 = bVar.f87941b.h().h().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f87924b, this.f87931i);
            com.airbnb.lottie.f.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f87923a.setPath(this.f87924b, false);
        float length = this.f87923a.getLength();
        while (this.f87923a.nextContour()) {
            length += this.f87923a.getLength();
        }
        float f11 = fFloatValue3 * length;
        float f12 = (fFloatValue * length) + f11;
        float fMin = Math.min((fFloatValue2 * length) + f11, (f12 + length) - 1.0f);
        float f13 = 0.0f;
        for (int size2 = bVar.f87940a.size() - 1; size2 >= 0; size2--) {
            this.f87925c.set(((n) bVar.f87940a.get(size2)).S());
            this.f87925c.transform(matrix);
            this.f87923a.setPath(this.f87925c, false);
            float length2 = this.f87923a.getLength();
            if (fMin > length) {
                float f14 = fMin - length;
                if (f14 >= f13 + length2 || f13 >= f14) {
                    f10 = f13 + length2;
                    if (f10 < f12 && f13 <= fMin) {
                        if (f10 > fMin || f12 >= f13) {
                            com.airbnb.lottie.utils.j.a(this.f87925c, f12 < f13 ? 0.0f : (f12 - f13) / length2, fMin > f10 ? 1.0f : (fMin - f13) / length2, 0.0f);
                            canvas.drawPath(this.f87925c, this.f87931i);
                        } else {
                            canvas.drawPath(this.f87925c, this.f87931i);
                        }
                    }
                } else {
                    com.airbnb.lottie.utils.j.a(this.f87925c, f12 > length ? (f12 - length) / length2 : 0.0f, Math.min(f14 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f87925c, this.f87931i);
                }
            } else {
                f10 = f13 + length2;
                if (f10 < f12) {
                }
            }
            f13 += length2;
        }
        com.airbnb.lottie.f.c("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        com.airbnb.lottie.f.b("StrokeContent#getBounds");
        this.f87924b.reset();
        for (int i10 = 0; i10 < this.f87929g.size(); i10++) {
            b bVar = this.f87929g.get(i10);
            for (int i11 = 0; i11 < bVar.f87940a.size(); i11++) {
                this.f87924b.addPath(((n) bVar.f87940a.get(i11)).S(), matrix);
            }
        }
        this.f87924b.computeBounds(this.f87926d, false);
        float fQ = ((com.airbnb.lottie.animation.keyframe.d) this.f87932j).q();
        RectF rectF2 = this.f87926d;
        float f10 = fQ / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f87926d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.f.c("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        com.airbnb.lottie.f.b("StrokeContent#draw");
        if (com.airbnb.lottie.utils.j.h(matrix)) {
            com.airbnb.lottie.f.c("StrokeContent#draw");
            return;
        }
        this.f87931i.setAlpha(com.airbnb.lottie.utils.i.d((int) ((((i10 / 255.0f) * ((com.airbnb.lottie.animation.keyframe.f) this.f87933k).q()) / 100.0f) * 255.0f), 0, 255));
        this.f87931i.setStrokeWidth(((com.airbnb.lottie.animation.keyframe.d) this.f87932j).q() * com.airbnb.lottie.utils.j.g(matrix));
        if (this.f87931i.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.f.c("StrokeContent#draw");
            return;
        }
        b(matrix);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f87936n;
        if (aVar != null) {
            this.f87931i.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f87937o;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f87931i.setMaskFilter(null);
            } else if (fFloatValue != this.f87938p) {
                this.f87931i.setMaskFilter(this.f87928f.x(fFloatValue));
            }
            this.f87938p = fFloatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f87939q;
        if (cVar != null) {
            cVar.a(this.f87931i);
        }
        for (int i11 = 0; i11 < this.f87929g.size(); i11++) {
            b bVar = this.f87929g.get(i11);
            if (bVar.f87941b != null) {
                i(canvas, bVar, matrix);
            } else {
                com.airbnb.lottie.f.b("StrokeContent#buildPath");
                this.f87924b.reset();
                for (int size = bVar.f87940a.size() - 1; size >= 0; size--) {
                    this.f87924b.addPath(((n) bVar.f87940a.get(size)).S(), matrix);
                }
                com.airbnb.lottie.f.c("StrokeContent#buildPath");
                com.airbnb.lottie.f.b("StrokeContent#drawPath");
                canvas.drawPath(this.f87924b, this.f87931i);
                com.airbnb.lottie.f.c("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.f.c("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f87927e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        v vVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof v) {
                v vVar2 = (v) cVar;
                if (vVar2.j() == com.airbnb.lottie.model.content.t.a.INDIVIDUALLY) {
                    vVar = vVar2;
                }
            }
        }
        if (vVar != null) {
            vVar.b(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof v) {
                v vVar3 = (v) cVar2;
                if (vVar3.j() == com.airbnb.lottie.model.content.t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f87929g.add(bVar);
                    }
                    bVar = new b(vVar3);
                    vVar3.b(this);
                } else if (!(cVar2 instanceof n)) {
                    if (bVar == null) {
                        bVar = new b(vVar);
                    }
                    bVar.f87940a.add((n) cVar2);
                }
            } else if (!(cVar2 instanceof n)) {
                if (bVar == null) {
                    bVar = new b(vVar);
                }
                bVar.f87940a.add((n) cVar2);
            }
        }
        if (bVar != null) {
            this.f87929g.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    @androidx.annotation.i
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t10 == b1.f88154d) {
            this.f87933k.o(jVar);
            return;
        }
        if (t10 == b1.f88169s) {
            this.f87932j.o(jVar);
            return;
        }
        if (t10 == b1.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f87936n;
            if (aVar != null) {
                this.f87928f.G(aVar);
            }
            if (jVar == null) {
                this.f87936n = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f87936n = qVar;
            qVar.a(this);
            this.f87928f.i(this.f87936n);
            return;
        }
        if (t10 == b1.f88160j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f87937o;
            if (aVar2 != null) {
                aVar2.o(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f87937o = qVar2;
            qVar2.a(this);
            this.f87928f.i(this.f87937o);
            return;
        }
        if (t10 == b1.f88155e && (cVar5 = this.f87939q) != null) {
            cVar5.b(jVar);
            return;
        }
        if (t10 == b1.G && (cVar4 = this.f87939q) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t10 == b1.H && (cVar3 = this.f87939q) != null) {
            cVar3.c(jVar);
            return;
        }
        if (t10 == b1.I && (cVar2 = this.f87939q) != null) {
            cVar2.e(jVar);
        } else {
            if (t10 != b1.J || (cVar = this.f87939q) == null) {
                return;
            }
            cVar.g(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void h(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i10, list, eVar2, this);
    }
}
