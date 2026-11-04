package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.w0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f88473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f88474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f88476e;

    public l(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar2, com.airbnb.lottie.model.animatable.b bVar, boolean z10) {
        this.f88472a = str;
        this.f88473b = mVar;
        this.f88474c = mVar2;
        this.f88475d = bVar;
        this.f88476e = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.p(w0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f88475d;
    }

    public String c() {
        return this.f88472a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> d() {
        return this.f88473b;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> e() {
        return this.f88474c;
    }

    public boolean f() {
        return this.f88476e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f88473b + ", size=" + this.f88474c + AbstractJsonLexerKt.END_OBJ;
    }
}
