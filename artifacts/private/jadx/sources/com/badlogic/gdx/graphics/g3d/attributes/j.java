package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.graphics.g3d.utils.m;
import com.badlogic.gdx.math.s;
import com.badlogic.gdx.utils.h0;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class j extends com.badlogic.gdx.graphics.g3d.a {
    public static final String X = "emissiveTexture";
    public static final long Y;
    public static final String Z = "reflectionTexture";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f94349j = "diffuseTexture";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f94350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f94351l = "specularTexture";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f94352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f94353n = "bumpTexture";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f94354o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final long f94355p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected static long f94356p1 = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f94357s = "normalTexture";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f94358t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f94359v = "ambientTexture";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f94360w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m<com.badlogic.gdx.graphics.k> f94361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f94362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f94363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f94364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f94365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f94366i;

    static {
        long jP = com.badlogic.gdx.graphics.g3d.a.p(f94349j);
        f94350k = jP;
        long jP2 = com.badlogic.gdx.graphics.g3d.a.p(f94351l);
        f94352m = jP2;
        long jP3 = com.badlogic.gdx.graphics.g3d.a.p(f94353n);
        f94354o = jP3;
        long jP4 = com.badlogic.gdx.graphics.g3d.a.p(f94357s);
        f94358t = jP4;
        long jP5 = com.badlogic.gdx.graphics.g3d.a.p(f94359v);
        f94360w = jP5;
        long jP6 = com.badlogic.gdx.graphics.g3d.a.p(X);
        Y = jP6;
        long jP7 = com.badlogic.gdx.graphics.g3d.a.p(Z);
        f94355p0 = jP7;
        f94356p1 = jP | jP2 | jP3 | jP4 | jP5 | jP6 | jP7;
    }

    public j(long j10) {
        super(j10);
        this.f94362e = 0.0f;
        this.f94363f = 0.0f;
        this.f94364g = 1.0f;
        this.f94365h = 1.0f;
        this.f94366i = 0;
        if (!O(j10)) {
            throw new t("Invalid type specified");
        }
        this.f94361d = new m<>();
    }

    public static j D(com.badlogic.gdx.graphics.g2d.e eVar) {
        return new j(Y, eVar);
    }

    public static j E(com.badlogic.gdx.graphics.k kVar) {
        return new j(f94358t, kVar);
    }

    public static j H(com.badlogic.gdx.graphics.g2d.e eVar) {
        return new j(f94358t, eVar);
    }

    public static j I(com.badlogic.gdx.graphics.k kVar) {
        return new j(f94355p0, kVar);
    }

    public static j L(com.badlogic.gdx.graphics.g2d.e eVar) {
        return new j(f94355p0, eVar);
    }

    public static j M(com.badlogic.gdx.graphics.k kVar) {
        return new j(f94352m, kVar);
    }

    public static j N(com.badlogic.gdx.graphics.g2d.e eVar) {
        return new j(f94352m, eVar);
    }

    public static final boolean O(long j10) {
        return (j10 & f94356p1) != 0;
    }

    public static j r(com.badlogic.gdx.graphics.k kVar) {
        return new j(f94360w, kVar);
    }

    public static j s(com.badlogic.gdx.graphics.g2d.e eVar) {
        return new j(f94360w, eVar);
    }

    public static j t(com.badlogic.gdx.graphics.k kVar) {
        return new j(f94354o, kVar);
    }

    public static j v(com.badlogic.gdx.graphics.g2d.e eVar) {
        return new j(f94354o, eVar);
    }

    public static j w(com.badlogic.gdx.graphics.k kVar) {
        return new j(f94350k, kVar);
    }

    public static j x(com.badlogic.gdx.graphics.g2d.e eVar) {
        return new j(f94350k, eVar);
    }

    public static j z(com.badlogic.gdx.graphics.k kVar) {
        return new j(Y, kVar);
    }

    public void R(com.badlogic.gdx.graphics.g2d.e eVar) {
        this.f94361d.f94685a = eVar.f();
        this.f94362e = eVar.g();
        this.f94363f = eVar.i();
        this.f94364g = eVar.h() - this.f94362e;
        this.f94365h = eVar.j() - this.f94363f;
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public int hashCode() {
        return (((((((((((super.hashCode() * 991) + this.f94361d.hashCode()) * 991) + h0.d(this.f94362e)) * 991) + h0.d(this.f94363f)) * 991) + h0.d(this.f94364g)) * 991) + h0.d(this.f94365h)) * 991) + this.f94366i;
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public com.badlogic.gdx.graphics.g3d.a k() {
        return new j(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.badlogic.gdx.graphics.g3d.a aVar) {
        long j10 = this.f94297a;
        long j11 = aVar.f94297a;
        if (j10 != j11) {
            return j10 < j11 ? -1 : 1;
        }
        j jVar = (j) aVar;
        int iCompareTo = this.f94361d.compareTo(jVar.f94361d);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i10 = this.f94366i;
        int i11 = jVar.f94366i;
        if (i10 != i11) {
            return i10 - i11;
        }
        if (!s.m(this.f94362e, jVar.f94362e)) {
            return this.f94362e < jVar.f94362e ? 1 : -1;
        }
        if (!s.m(this.f94363f, jVar.f94363f)) {
            return this.f94363f < jVar.f94363f ? 1 : -1;
        }
        if (!s.m(this.f94364g, jVar.f94364g)) {
            return this.f94364g < jVar.f94364g ? 1 : -1;
        }
        if (s.m(this.f94365h, jVar.f94365h)) {
            return 0;
        }
        return this.f94365h < jVar.f94365h ? 1 : -1;
    }

    public <T extends com.badlogic.gdx.graphics.k> j(long j10, m<T> mVar) {
        this(j10);
        this.f94361d.d(mVar);
    }

    public <T extends com.badlogic.gdx.graphics.k> j(long j10, m<T> mVar, float f10, float f11, float f12, float f13, int i10) {
        this(j10, mVar);
        this.f94362e = f10;
        this.f94363f = f11;
        this.f94364g = f12;
        this.f94365h = f13;
        this.f94366i = i10;
    }

    public <T extends com.badlogic.gdx.graphics.k> j(long j10, m<T> mVar, float f10, float f11, float f12, float f13) {
        this(j10, mVar, f10, f11, f12, f13, 0);
    }

    public j(long j10, com.badlogic.gdx.graphics.k kVar) {
        this(j10);
        this.f94361d.f94685a = kVar;
    }

    public j(long j10, com.badlogic.gdx.graphics.g2d.e eVar) {
        this(j10);
        R(eVar);
    }

    public j(j jVar) {
        this(jVar.f94297a, jVar.f94361d, jVar.f94362e, jVar.f94363f, jVar.f94364g, jVar.f94365h, jVar.f94366i);
    }
}
