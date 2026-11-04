package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.w0;

/* JADX INFO: loaded from: classes3.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f88387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f88388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f88389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f88390e;

    public b(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.f fVar, boolean z10, boolean z11) {
        this.f88386a = str;
        this.f88387b = mVar;
        this.f88388c = fVar;
        this.f88389d = z10;
        this.f88390e = z11;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.f(w0Var, bVar, this);
    }

    public String b() {
        return this.f88386a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> c() {
        return this.f88387b;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f88388c;
    }

    public boolean e() {
        return this.f88390e;
    }

    public boolean f() {
        return this.f88389d;
    }
}
