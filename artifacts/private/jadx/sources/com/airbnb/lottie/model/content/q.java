package com.airbnb.lottie.model.content;

import com.airbnb.lottie.w0;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f88494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f88495c;

    public q(String str, List<c> list, boolean z10) {
        this.f88493a = str;
        this.f88494b = list;
        this.f88495c = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.d(w0Var, bVar, this, kVar);
    }

    public List<c> b() {
        return this.f88494b;
    }

    public String c() {
        return this.f88493a;
    }

    public boolean d() {
        return this.f88495c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f88493a + "' Shapes: " + Arrays.toString(this.f88494b.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
