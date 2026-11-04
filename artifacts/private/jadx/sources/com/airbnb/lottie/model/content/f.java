package com.airbnb.lottie.model.content;

import androidx.annotation.p0;
import com.airbnb.lottie.w0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f88404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f88405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f88406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f88407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f88408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s.b f88410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s.c f88411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f88412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f88413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.b f88414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f88415m;

    public f(String str, g gVar, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, s.b bVar2, s.c cVar2, float f10, List<com.airbnb.lottie.model.animatable.b> list, @p0 com.airbnb.lottie.model.animatable.b bVar3, boolean z10) {
        this.f88403a = str;
        this.f88404b = gVar;
        this.f88405c = cVar;
        this.f88406d = dVar;
        this.f88407e = fVar;
        this.f88408f = fVar2;
        this.f88409g = bVar;
        this.f88410h = bVar2;
        this.f88411i = cVar2;
        this.f88412j = f10;
        this.f88413k = list;
        this.f88414l = bVar3;
        this.f88415m = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.i(w0Var, bVar, this);
    }

    public s.b b() {
        return this.f88410h;
    }

    @p0
    public com.airbnb.lottie.model.animatable.b c() {
        return this.f88414l;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f88408f;
    }

    public com.airbnb.lottie.model.animatable.c e() {
        return this.f88405c;
    }

    public g f() {
        return this.f88404b;
    }

    public s.c g() {
        return this.f88411i;
    }

    public List<com.airbnb.lottie.model.animatable.b> h() {
        return this.f88413k;
    }

    public float i() {
        return this.f88412j;
    }

    public String j() {
        return this.f88403a;
    }

    public com.airbnb.lottie.model.animatable.d k() {
        return this.f88406d;
    }

    public com.airbnb.lottie.model.animatable.f l() {
        return this.f88407e;
    }

    public com.airbnb.lottie.model.animatable.b m() {
        return this.f88409g;
    }

    public boolean n() {
        return this.f88415m;
    }
}
