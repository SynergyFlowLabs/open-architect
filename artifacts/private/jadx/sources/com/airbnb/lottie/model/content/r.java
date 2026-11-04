package com.airbnb.lottie.model.content;

import com.airbnb.lottie.w0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class r implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f88497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f88498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f88499d;

    public r(String str, int i10, com.airbnb.lottie.model.animatable.h hVar, boolean z10) {
        this.f88496a = str;
        this.f88497b = i10;
        this.f88498c = hVar;
        this.f88499d = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.s(w0Var, bVar, this);
    }

    public String b() {
        return this.f88496a;
    }

    public com.airbnb.lottie.model.animatable.h c() {
        return this.f88498c;
    }

    public boolean d() {
        return this.f88499d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f88496a + ", index=" + this.f88497b + AbstractJsonLexerKt.END_OBJ;
    }
}
