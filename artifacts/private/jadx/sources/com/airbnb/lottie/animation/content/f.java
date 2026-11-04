package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.p0;
import com.airbnb.lottie.b1;
import com.airbnb.lottie.w0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements n, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f87954i = 0.55228f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0 f87957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f87958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f87959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.b f87960f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f87962h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f87955a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f87961g = new b();

    public f(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.b bVar2) {
        this.f87956b = bVar2.b();
        this.f87957c = w0Var;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarA = bVar2.d().a();
        this.f87958d = aVarA;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarA2 = bVar2.c().a();
        this.f87959e = aVarA2;
        this.f87960f = bVar2;
        bVar.i(aVarA);
        bVar.i(aVarA2);
        aVarA.a(this);
        aVarA2.a(this);
    }

    private void b() {
        this.f87962h = false;
        this.f87957c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path S() {
        if (this.f87962h) {
            return this.f87955a;
        }
        this.f87955a.reset();
        if (this.f87960f.e()) {
            this.f87962h = true;
            return this.f87955a;
        }
        PointF pointFH = this.f87958d.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        float f12 = f10 * f87954i;
        float f13 = f87954i * f11;
        this.f87955a.reset();
        if (this.f87960f.f()) {
            float f14 = -f11;
            this.f87955a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f87955a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f87955a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f87955a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f87955a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f87955a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f87955a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f87955a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f87955a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f87955a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFH2 = this.f87959e.h();
        this.f87955a.offset(pointFH2.x, pointFH2.y);
        this.f87955a.close();
        this.f87961g.b(this.f87955a);
        this.f87962h = true;
        return this.f87955a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        b();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == com.airbnb.lottie.model.content.t.a.SIMULTANEOUSLY) {
                    this.f87961g.a(vVar);
                    vVar.b(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        if (t10 == b1.f88161k) {
            this.f87958d.o(jVar);
        } else if (t10 == b1.f88164n) {
            this.f87959e.o(jVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f87956b;
    }

    @Override // com.airbnb.lottie.model.f
    public void h(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i10, list, eVar2, this);
    }
}
