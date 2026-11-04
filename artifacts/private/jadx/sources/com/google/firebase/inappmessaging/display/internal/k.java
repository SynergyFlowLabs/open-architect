package com.google.firebase.inappmessaging.display.internal;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Float f122408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Float f122409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f122410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f122411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f122412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f122413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f122414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f122415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f122416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f122417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f122418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f122419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f122420m;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f122421a = new k();

        public k a() {
            return this.f122421a;
        }

        public a b(Boolean bool) {
            this.f122421a.f122419l = bool;
            return this;
        }

        public a c(Boolean bool) {
            this.f122421a.f122420m = bool;
            return this;
        }

        public a d(Boolean bool) {
            this.f122421a.f122418k = bool;
            return this;
        }

        public a e(Float f10) {
            this.f122421a.f122410c = f10;
            return this;
        }

        public a f(Float f10) {
            this.f122421a.f122411d = f10;
            return this;
        }

        public a g(Integer num) {
            this.f122421a.f122412e = num;
            return this;
        }

        public a h(Integer num) {
            this.f122421a.f122413f = num;
            return this;
        }

        public a i(Float f10) {
            this.f122421a.f122408a = f10;
            return this;
        }

        public a j(Float f10) {
            this.f122421a.f122409b = f10;
            return this;
        }

        public a k(Integer num) {
            this.f122421a.f122415h = num;
            return this;
        }

        public a l(Integer num) {
            this.f122421a.f122414g = num;
            return this;
        }

        public a m(Integer num) {
            this.f122421a.f122417j = num;
            return this;
        }

        public a n(Integer num) {
            this.f122421a.f122416i = num;
            return this;
        }
    }

    @NonNull
    public static a q() {
        return new a();
    }

    public Float A() {
        return this.f122409b;
    }

    public Integer B() {
        return this.f122415h;
    }

    public Integer C() {
        return this.f122414g;
    }

    public Integer D() {
        return this.f122417j;
    }

    public Integer E() {
        return this.f122416i;
    }

    public Boolean n() {
        return this.f122419l;
    }

    public Boolean o() {
        return this.f122420m;
    }

    public Boolean p() {
        return this.f122418k;
    }

    public int r() {
        return (int) (v().floatValue() * x().intValue());
    }

    public int s() {
        return (int) (w().floatValue() * y().intValue());
    }

    public int t() {
        return (int) (z().floatValue() * x().intValue());
    }

    public int u() {
        return (int) (A().floatValue() * y().intValue());
    }

    @p0
    public Float v() {
        return this.f122410c;
    }

    @p0
    public Float w() {
        return this.f122411d;
    }

    public Integer x() {
        return this.f122412e;
    }

    public Integer y() {
        return this.f122413f;
    }

    public Float z() {
        return this.f122408a;
    }
}
