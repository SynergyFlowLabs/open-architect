package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.v;
import com.airbnb.lottie.w0;

/* JADX INFO: loaded from: classes3.dex */
public class t implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f88521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f88525f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a l(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public t(String str, a aVar, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, boolean z10) {
        this.f88520a = str;
        this.f88521b = aVar;
        this.f88522c = bVar;
        this.f88523d = bVar2;
        this.f88524e = bVar3;
        this.f88525f = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new v(bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f88523d;
    }

    public String c() {
        return this.f88520a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f88524e;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f88522c;
    }

    public a f() {
        return this.f88521b;
    }

    public boolean g() {
        return this.f88525f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f88522c + ", end: " + this.f88523d + ", offset: " + this.f88524e + "}";
    }
}
