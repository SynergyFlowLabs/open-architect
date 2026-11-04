package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e implements m<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<PointF>> f88345a;

    public e(List<com.airbnb.lottie.value.a<PointF>> list) {
        this.f88345a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        return this.f88345a.get(0).i() ? new com.airbnb.lottie.animation.keyframe.k(this.f88345a) : new com.airbnb.lottie.animation.keyframe.j(this.f88345a);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> b() {
        return this.f88345a;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        return this.f88345a.size() == 1 && this.f88345a.get(0).i();
    }
}
