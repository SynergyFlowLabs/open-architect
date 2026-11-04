package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.p0;
import com.airbnb.lottie.w0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f88487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path.FillType f88488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f88489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.a f88490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.d f88491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f88492f;

    public p(String str, boolean z10, Path.FillType fillType, @p0 com.airbnb.lottie.model.animatable.a aVar, @p0 com.airbnb.lottie.model.animatable.d dVar, boolean z11) {
        this.f88489c = str;
        this.f88487a = z10;
        this.f88488b = fillType;
        this.f88490d = aVar;
        this.f88491e = dVar;
        this.f88492f = z11;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.g(w0Var, bVar, this);
    }

    @p0
    public com.airbnb.lottie.model.animatable.a b() {
        return this.f88490d;
    }

    public Path.FillType c() {
        return this.f88488b;
    }

    public String d() {
        return this.f88489c;
    }

    @p0
    public com.airbnb.lottie.model.animatable.d e() {
        return this.f88491e;
    }

    public boolean f() {
        return this.f88492f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f88487a + AbstractJsonLexerKt.END_OBJ;
    }
}
