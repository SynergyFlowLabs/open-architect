package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.p0;
import com.airbnb.lottie.w0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f88393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path.FillType f88394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f88395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f88396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f88397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f88398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f88399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.b f88400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.b f88401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f88402j;

    public e(String str, g gVar, Path.FillType fillType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, boolean z10) {
        this.f88393a = gVar;
        this.f88394b = fillType;
        this.f88395c = cVar;
        this.f88396d = dVar;
        this.f88397e = fVar;
        this.f88398f = fVar2;
        this.f88399g = str;
        this.f88400h = bVar;
        this.f88401i = bVar2;
        this.f88402j = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.h(w0Var, kVar, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.f b() {
        return this.f88398f;
    }

    public Path.FillType c() {
        return this.f88394b;
    }

    public com.airbnb.lottie.model.animatable.c d() {
        return this.f88395c;
    }

    public g e() {
        return this.f88393a;
    }

    public String f() {
        return this.f88399g;
    }

    public com.airbnb.lottie.model.animatable.d g() {
        return this.f88396d;
    }

    public com.airbnb.lottie.model.animatable.f h() {
        return this.f88397e;
    }

    public boolean i() {
        return this.f88402j;
    }
}
