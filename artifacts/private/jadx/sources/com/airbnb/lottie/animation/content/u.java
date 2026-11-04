package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.p0;
import com.airbnb.lottie.b1;
import com.airbnb.lottie.w0;

/* JADX INFO: loaded from: classes3.dex */
public class u extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f88069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f88070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f88071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f88072u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f88073v;

    public u(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.s sVar) {
        super(w0Var, bVar, sVar.b().l(), sVar.e().l(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f88069r = bVar;
        this.f88070s = sVar.h();
        this.f88071t = sVar.k();
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarA = sVar.c().a();
        this.f88072u = aVarA;
        aVarA.a(this);
        bVar.i(aVarA);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        if (this.f88071t) {
            return;
        }
        this.f87931i.setColor(((com.airbnb.lottie.animation.keyframe.b) this.f88072u).q());
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f88073v;
        if (aVar != null) {
            this.f87931i.setColorFilter(aVar.h());
        }
        super.c(canvas, matrix, i10);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.g(t10, jVar);
        if (t10 == b1.f88152b) {
            this.f88072u.o(jVar);
            return;
        }
        if (t10 == b1.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f88073v;
            if (aVar != null) {
                this.f88069r.G(aVar);
            }
            if (jVar == null) {
                this.f88073v = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f88073v = qVar;
            qVar.a(this);
            this.f88069r.i(this.f88072u);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f88070s;
    }
}
