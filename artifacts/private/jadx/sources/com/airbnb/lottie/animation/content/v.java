package com.airbnb.lottie.animation.content;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v implements c, com.airbnb.lottie.animation.keyframe.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f88075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a.b> f88076c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.t.a f88077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f88078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f88079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f88080g;

    public v(com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.t tVar) {
        this.f88074a = tVar.c();
        this.f88075b = tVar.g();
        this.f88077d = tVar.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA = tVar.e().a();
        this.f88078e = aVarA;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA2 = tVar.b().a();
        this.f88079f = aVarA2;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA3 = tVar.d().a();
        this.f88080g = aVarA3;
        bVar.i(aVarA);
        bVar.i(aVarA2);
        bVar.i(aVarA3);
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
    }

    void b(com.airbnb.lottie.animation.keyframe.a.b bVar) {
        this.f88076c.add(bVar);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        for (int i10 = 0; i10 < this.f88076c.size(); i10++) {
            this.f88076c.get(i10).d();
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> g() {
        return this.f88079f;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f88074a;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> h() {
        return this.f88080g;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> i() {
        return this.f88078e;
    }

    com.airbnb.lottie.model.content.t.a j() {
        return this.f88077d;
    }

    public boolean k() {
        return this.f88075b;
    }
}
