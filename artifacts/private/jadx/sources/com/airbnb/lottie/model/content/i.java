package com.airbnb.lottie.model.content;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f88439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f88440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f88441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f88442d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, com.airbnb.lottie.model.animatable.h hVar, com.airbnb.lottie.model.animatable.d dVar, boolean z10) {
        this.f88439a = aVar;
        this.f88440b = hVar;
        this.f88441c = dVar;
        this.f88442d = z10;
    }

    public a a() {
        return this.f88439a;
    }

    public com.airbnb.lottie.model.animatable.h b() {
        return this.f88440b;
    }

    public com.airbnb.lottie.model.animatable.d c() {
        return this.f88441c;
    }

    public boolean d() {
        return this.f88442d;
    }
}
