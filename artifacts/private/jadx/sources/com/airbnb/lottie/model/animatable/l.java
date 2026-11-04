package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.p0;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.w0;

/* JADX INFO: loaded from: classes3.dex */
public class l implements com.airbnb.lottie.animation.content.m, com.airbnb.lottie.model.content.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final e f88352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final m<PointF, PointF> f88353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final g f88354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final b f88355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final d f88356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final b f88357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final b f88358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private final b f88359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private final b f88360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f88361j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l() {
        this(null, null, null, null, null, null, null, null, null);
        int i10 = (5 ^ 0) & 0;
    }

    @Override // com.airbnb.lottie.model.content.c
    @p0
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return null;
    }

    public p b() {
        return new p(this);
    }

    @p0
    public e c() {
        return this.f88352a;
    }

    @p0
    public b d() {
        return this.f88360i;
    }

    @p0
    public d e() {
        return this.f88356e;
    }

    @p0
    public m<PointF, PointF> f() {
        return this.f88353b;
    }

    @p0
    public b g() {
        return this.f88355d;
    }

    @p0
    public g h() {
        return this.f88354c;
    }

    @p0
    public b i() {
        return this.f88357f;
    }

    @p0
    public b j() {
        return this.f88358g;
    }

    @p0
    public b k() {
        return this.f88359h;
    }

    public boolean l() {
        return this.f88361j;
    }

    public void m(boolean z10) {
        this.f88361j = z10;
    }

    public l(@p0 e eVar, @p0 m<PointF, PointF> mVar, @p0 g gVar, @p0 b bVar, @p0 d dVar, @p0 b bVar2, @p0 b bVar3, @p0 b bVar4, @p0 b bVar5) {
        this.f88361j = false;
        this.f88352a = eVar;
        this.f88353b = mVar;
        this.f88354c = gVar;
        this.f88355d = bVar;
        this.f88356e = dVar;
        this.f88359h = bVar2;
        this.f88360i = bVar3;
        this.f88357f = bVar4;
        this.f88358g = bVar5;
    }
}
