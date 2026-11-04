package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i implements m<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f88346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f88347b;

    public i(b bVar, b bVar2) {
        this.f88346a = bVar;
        this.f88347b = bVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        return new com.airbnb.lottie.animation.keyframe.n(this.f88346a.a(), this.f88347b.a());
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        return this.f88346a.c() && this.f88347b.c();
    }
}
