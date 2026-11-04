package com.airbnb.lottie.model.content;

import androidx.annotation.p0;
import com.airbnb.lottie.w0;

/* JADX INFO: loaded from: classes3.dex */
public class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<Float, Float> f88483b;

    public n(String str, com.airbnb.lottie.model.animatable.m<Float, Float> mVar) {
        this.f88482a = str;
        this.f88483b = mVar;
    }

    @Override // com.airbnb.lottie.model.content.c
    @p0
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.r(w0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.m<Float, Float> b() {
        return this.f88483b;
    }

    public String c() {
        return this.f88482a;
    }
}
