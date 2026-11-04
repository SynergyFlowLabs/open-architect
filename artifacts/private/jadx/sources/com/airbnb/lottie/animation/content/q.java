package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.airbnb.lottie.b1;
import com.airbnb.lottie.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class q implements e, n, j, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f88046a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f88047b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0 f88048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f88049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f88050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f88051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f88052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f88053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.p f88054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f88055j;

    public q(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.m mVar) {
        this.f88048c = w0Var;
        this.f88049d = bVar;
        this.f88050e = mVar.c();
        this.f88051f = mVar.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA = mVar.b().a();
        this.f88052g = aVarA;
        bVar.i(aVarA);
        aVarA.a(this);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA2 = mVar.d().a();
        this.f88053h = aVarA2;
        bVar.i(aVarA2);
        aVarA2.a(this);
        com.airbnb.lottie.animation.keyframe.p pVarB = mVar.e().b();
        this.f88054i = pVarB;
        pVarB.a(bVar);
        pVarB.b(this);
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path S() {
        Path pathS = this.f88055j.S();
        this.f88047b.reset();
        float fFloatValue = this.f88052g.h().floatValue();
        float fFloatValue2 = this.f88053h.h().floatValue();
        int i10 = (int) fFloatValue;
        while (true) {
            i10--;
            if (i10 < 0) {
                return this.f88047b;
            }
            this.f88046a.set(this.f88054i.g(i10 + fFloatValue2));
            this.f88047b.addPath(pathS, this.f88046a);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f88055j.a(rectF, matrix, z10);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void b(ListIterator<c> listIterator) {
        if (this.f88055j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f88055j = new d(this.f88048c, this.f88049d, "Repeater", this.f88051f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = this.f88052g.h().floatValue();
        float fFloatValue2 = this.f88053h.h().floatValue();
        float fFloatValue3 = this.f88054i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.f88054i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f88046a.set(matrix);
            float f10 = i11;
            this.f88046a.preConcat(this.f88054i.g(f10 + fFloatValue2));
            this.f88055j.c(canvas, this.f88046a, (int) (i10 * com.airbnb.lottie.utils.i.k(fFloatValue3, fFloatValue4, f10 / fFloatValue)));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f88048c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        this.f88055j.e(list, list2);
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        if (this.f88054i.c(t10, jVar)) {
            return;
        }
        if (t10 == b1.f88171u) {
            this.f88052g.o(jVar);
        } else if (t10 == b1.f88172v) {
            this.f88053h.o(jVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f88050e;
    }

    @Override // com.airbnb.lottie.model.f
    public void h(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f88055j.j().size(); i11++) {
            c cVar = this.f88055j.j().get(i11);
            if (cVar instanceof k) {
                com.airbnb.lottie.utils.i.m(eVar, i10, list, eVar2, (k) cVar);
            }
        }
    }
}
