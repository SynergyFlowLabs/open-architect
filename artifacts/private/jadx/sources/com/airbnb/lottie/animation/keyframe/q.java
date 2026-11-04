package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.p0;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class q<K, A> extends a<K, A> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A f88148i;

    public q(com.airbnb.lottie.value.j<A> jVar) {
        this(jVar, null);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    float c() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public A h() {
        com.airbnb.lottie.value.j<A> jVar = this.f88085e;
        A a10 = this.f88148i;
        return jVar.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    A i(com.airbnb.lottie.value.a<K> aVar, float f10) {
        return h();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void l() {
        if (this.f88085e != null) {
            super.l();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void n(float f10) {
        this.f88084d = f10;
    }

    public q(com.airbnb.lottie.value.j<A> jVar, @p0 A a10) {
        super(Collections.EMPTY_LIST);
        o(jVar);
        this.f88148i = a10;
    }
}
