package com.airbnb.lottie.model.layer;

import androidx.annotation.p0;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.animatable.l;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.c> f88576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f88577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f88578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f88579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f88580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f88581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final String f88582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.i> f88583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f88584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f88585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f88586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f88587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f88588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f88589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f88590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f88591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.j f88592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.k f88593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.b f88594s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<Float>> f88595t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final b f88596u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f88597v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.content.a f88598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.parser.j f88599x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.h f88600y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<com.airbnb.lottie.model.content.c> list, k kVar, String str, long j10, a aVar, long j11, @p0 String str2, List<com.airbnb.lottie.model.content.i> list2, l lVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, @p0 com.airbnb.lottie.model.animatable.j jVar, @p0 com.airbnb.lottie.model.animatable.k kVar2, List<com.airbnb.lottie.value.a<Float>> list3, b bVar, @p0 com.airbnb.lottie.model.animatable.b bVar2, boolean z10, @p0 com.airbnb.lottie.model.content.a aVar2, @p0 com.airbnb.lottie.parser.j jVar2, com.airbnb.lottie.model.content.h hVar) {
        this.f88576a = list;
        this.f88577b = kVar;
        this.f88578c = str;
        this.f88579d = j10;
        this.f88580e = aVar;
        this.f88581f = j11;
        this.f88582g = str2;
        this.f88583h = list2;
        this.f88584i = lVar;
        this.f88585j = i10;
        this.f88586k = i11;
        this.f88587l = i12;
        this.f88588m = f10;
        this.f88589n = f11;
        this.f88590o = f12;
        this.f88591p = f13;
        this.f88592q = jVar;
        this.f88593r = kVar2;
        this.f88595t = list3;
        this.f88596u = bVar;
        this.f88594s = bVar2;
        this.f88597v = z10;
        this.f88598w = aVar2;
        this.f88599x = jVar2;
        this.f88600y = hVar;
    }

    @p0
    public com.airbnb.lottie.model.content.h a() {
        return this.f88600y;
    }

    @p0
    public com.airbnb.lottie.model.content.a b() {
        return this.f88598w;
    }

    k c() {
        return this.f88577b;
    }

    @p0
    public com.airbnb.lottie.parser.j d() {
        return this.f88599x;
    }

    public long e() {
        return this.f88579d;
    }

    List<com.airbnb.lottie.value.a<Float>> f() {
        return this.f88595t;
    }

    public a g() {
        return this.f88580e;
    }

    List<com.airbnb.lottie.model.content.i> h() {
        return this.f88583h;
    }

    b i() {
        return this.f88596u;
    }

    public String j() {
        return this.f88578c;
    }

    long k() {
        return this.f88581f;
    }

    float l() {
        return this.f88591p;
    }

    float m() {
        return this.f88590o;
    }

    @p0
    public String n() {
        return this.f88582g;
    }

    List<com.airbnb.lottie.model.content.c> o() {
        return this.f88576a;
    }

    int p() {
        return this.f88587l;
    }

    int q() {
        return this.f88586k;
    }

    int r() {
        return this.f88585j;
    }

    float s() {
        return this.f88589n / this.f88577b.e();
    }

    @p0
    com.airbnb.lottie.model.animatable.j t() {
        return this.f88592q;
    }

    public String toString() {
        return z("");
    }

    @p0
    com.airbnb.lottie.model.animatable.k u() {
        return this.f88593r;
    }

    @p0
    com.airbnb.lottie.model.animatable.b v() {
        return this.f88594s;
    }

    float w() {
        return this.f88588m;
    }

    l x() {
        return this.f88584i;
    }

    public boolean y() {
        return this.f88597v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        e eVarX = this.f88577b.x(k());
        if (eVarX != null) {
            sb2.append("\t\tParents: ");
            sb2.append(eVarX.j());
            e eVarX2 = this.f88577b.x(eVarX.k());
            while (eVarX2 != null) {
                sb2.append("->");
                sb2.append(eVarX2.j());
                eVarX2 = this.f88577b.x(eVarX2.k());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f88576a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.c cVar : this.f88576a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
