package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class i extends com.airbnb.lottie.value.a<PointF> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private Path f88109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.airbnb.lottie.value.a<PointF> f88110t;

    public i(com.airbnb.lottie.k kVar, com.airbnb.lottie.value.a<PointF> aVar) {
        super(kVar, aVar.f88869b, aVar.f88870c, aVar.f88871d, aVar.f88872e, aVar.f88873f, aVar.f88874g, aVar.f88875h);
        this.f88110t = aVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t10;
        T t11;
        T t12 = this.f88870c;
        boolean z10 = (t12 == 0 || (t11 = this.f88869b) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.f88869b;
        if (t13 == 0 || (t10 = this.f88870c) == 0 || z10) {
            return;
        }
        com.airbnb.lottie.value.a<PointF> aVar = this.f88110t;
        this.f88109s = com.airbnb.lottie.utils.j.d((PointF) t13, (PointF) t10, aVar.f88882o, aVar.f88883p);
    }

    @p0
    Path k() {
        return this.f88109s;
    }
}
