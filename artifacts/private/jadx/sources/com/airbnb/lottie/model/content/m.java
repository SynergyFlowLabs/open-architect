package com.airbnb.lottie.model.content;

import androidx.annotation.p0;
import com.airbnb.lottie.w0;

/* JADX INFO: loaded from: classes3.dex */
public class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.l f88480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f88481e;

    public m(String str, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.l lVar, boolean z10) {
        this.f88477a = str;
        this.f88478b = bVar;
        this.f88479c = bVar2;
        this.f88480d = lVar;
        this.f88481e = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    @p0
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.q(w0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f88478b;
    }

    public String c() {
        return this.f88477a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f88479c;
    }

    public com.airbnb.lottie.model.animatable.l e() {
        return this.f88480d;
    }

    public boolean f() {
        return this.f88481e;
    }
}
