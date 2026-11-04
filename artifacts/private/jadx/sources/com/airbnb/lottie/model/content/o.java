package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.a> f88484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f88485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f88486c;

    public o(PointF pointF, boolean z10, List<com.airbnb.lottie.model.a> list) {
        this.f88485b = pointF;
        this.f88486c = z10;
        this.f88484a = new ArrayList(list);
    }

    public List<com.airbnb.lottie.model.a> a() {
        return this.f88484a;
    }

    public PointF b() {
        return this.f88485b;
    }

    public void c(o oVar, o oVar2, @x(from = 0.0d, to = 1.0d) float f10) {
        if (this.f88485b == null) {
            this.f88485b = new PointF();
        }
        this.f88486c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            com.airbnb.lottie.utils.d.e("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f88484a.size() < iMin) {
            for (int size = this.f88484a.size(); size < iMin; size++) {
                this.f88484a.add(new com.airbnb.lottie.model.a());
            }
        } else if (this.f88484a.size() > iMin) {
            for (int size2 = this.f88484a.size() - 1; size2 >= iMin; size2--) {
                List<com.airbnb.lottie.model.a> list = this.f88484a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(com.airbnb.lottie.utils.i.k(pointFB.x, pointFB2.x, f10), com.airbnb.lottie.utils.i.k(pointFB.y, pointFB2.y, f10));
        for (int size3 = this.f88484a.size() - 1; size3 >= 0; size3--) {
            com.airbnb.lottie.model.a aVar = oVar.a().get(size3);
            com.airbnb.lottie.model.a aVar2 = oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            this.f88484a.get(size3).d(com.airbnb.lottie.utils.i.k(pointFA.x, pointFA2.x, f10), com.airbnb.lottie.utils.i.k(pointFA.y, pointFA2.y, f10));
            this.f88484a.get(size3).e(com.airbnb.lottie.utils.i.k(pointFB3.x, pointFB4.x, f10), com.airbnb.lottie.utils.i.k(pointFB3.y, pointFB4.y, f10));
            this.f88484a.get(size3).g(com.airbnb.lottie.utils.i.k(pointFC.x, pointFC2.x, f10), com.airbnb.lottie.utils.i.k(pointFC.y, pointFC2.y, f10));
        }
    }

    public boolean d() {
        return this.f88486c;
    }

    public void e(boolean z10) {
        this.f88486c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f88485b == null) {
            this.f88485b = new PointF();
        }
        this.f88485b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f88484a.size() + "closed=" + this.f88486c + AbstractJsonLexerKt.END_OBJ;
    }

    public o() {
        this.f88484a = new ArrayList();
    }
}
