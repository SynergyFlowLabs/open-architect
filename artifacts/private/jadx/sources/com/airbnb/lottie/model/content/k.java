package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.w0;

/* JADX INFO: loaded from: classes3.dex */
public class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f88458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f88460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f88466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f88467k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f88471a;

        static {
            int i10 = 1 << 2;
        }

        a(int i10) {
            this.f88471a = i10;
        }

        public static a l(int i10) {
            for (a aVar : values()) {
                if (aVar.f88471a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4, com.airbnb.lottie.model.animatable.b bVar5, com.airbnb.lottie.model.animatable.b bVar6, boolean z10, boolean z11) {
        this.f88457a = str;
        this.f88458b = aVar;
        this.f88459c = bVar;
        this.f88460d = mVar;
        this.f88461e = bVar2;
        this.f88462f = bVar3;
        this.f88463g = bVar4;
        this.f88464h = bVar5;
        this.f88465i = bVar6;
        this.f88466j = z10;
        this.f88467k = z11;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.o(w0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f88462f;
    }

    public com.airbnb.lottie.model.animatable.b c() {
        return this.f88464h;
    }

    public String d() {
        return this.f88457a;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f88463g;
    }

    public com.airbnb.lottie.model.animatable.b f() {
        return this.f88465i;
    }

    public com.airbnb.lottie.model.animatable.b g() {
        return this.f88459c;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> h() {
        return this.f88460d;
    }

    public com.airbnb.lottie.model.animatable.b i() {
        return this.f88461e;
    }

    public a j() {
        return this.f88458b;
    }

    public boolean k() {
        return this.f88466j;
    }

    public boolean l() {
        return this.f88467k;
    }
}
