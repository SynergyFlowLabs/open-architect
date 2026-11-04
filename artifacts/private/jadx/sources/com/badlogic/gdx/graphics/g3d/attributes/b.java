package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class b extends com.badlogic.gdx.graphics.g3d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f94305e = "diffuseColor";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f94306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f94307g = "specularColor";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f94308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f94309i = "ambientColor";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f94310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f94311k = "emissiveColor";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f94312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f94313m = "reflectionColor";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f94314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f94315o = "ambientLightColor";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f94316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f94317t = "fogColor";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f94318v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static long f94319w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f94320d;

    static {
        long jP = com.badlogic.gdx.graphics.g3d.a.p(f94305e);
        f94306f = jP;
        long jP2 = com.badlogic.gdx.graphics.g3d.a.p(f94307g);
        f94308h = jP2;
        long jP3 = com.badlogic.gdx.graphics.g3d.a.p(f94309i);
        f94310j = jP3;
        long jP4 = com.badlogic.gdx.graphics.g3d.a.p(f94311k);
        f94312l = jP4;
        long jP5 = com.badlogic.gdx.graphics.g3d.a.p(f94313m);
        f94314n = jP5;
        long jP6 = com.badlogic.gdx.graphics.g3d.a.p(f94315o);
        f94316s = jP6;
        long jP7 = com.badlogic.gdx.graphics.g3d.a.p(f94317t);
        f94318v = jP7;
        f94319w = jP | jP3 | jP2 | jP4 | jP5 | jP6 | jP7;
    }

    public b(long j10) {
        super(j10);
        this.f94320d = new com.badlogic.gdx.graphics.b();
        if (!E(j10)) {
            throw new t("Invalid type specified");
        }
    }

    public static final b D(com.badlogic.gdx.graphics.b bVar) {
        return new b(f94308h, bVar);
    }

    public static final boolean E(long j10) {
        return (j10 & f94319w) != 0;
    }

    public static final b r(float f10, float f11, float f12, float f13) {
        return new b(f94310j, f10, f11, f12, f13);
    }

    public static final b s(com.badlogic.gdx.graphics.b bVar) {
        return new b(f94310j, bVar);
    }

    public static final b t(float f10, float f11, float f12, float f13) {
        return new b(f94306f, f10, f11, f12, f13);
    }

    public static final b v(com.badlogic.gdx.graphics.b bVar) {
        return new b(f94306f, bVar);
    }

    public static final b w(float f10, float f11, float f12, float f13) {
        return new b(f94314n, f10, f11, f12, f13);
    }

    public static final b x(com.badlogic.gdx.graphics.b bVar) {
        return new b(f94314n, bVar);
    }

    public static final b z(float f10, float f11, float f12, float f13) {
        return new b(f94308h, f10, f11, f12, f13);
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public int hashCode() {
        return (super.hashCode() * 953) + this.f94320d.J();
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public com.badlogic.gdx.graphics.g3d.a k() {
        return new b(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.badlogic.gdx.graphics.g3d.a aVar) {
        long j10 = this.f94297a;
        long j11 = aVar.f94297a;
        return j10 != j11 ? (int) (j10 - j11) : ((b) aVar).f94320d.J() - this.f94320d.J();
    }

    public b(long j10, com.badlogic.gdx.graphics.b bVar) {
        this(j10);
        if (bVar != null) {
            this.f94320d.D(bVar);
        }
    }

    public b(long j10, float f10, float f11, float f12, float f13) {
        this(j10);
        this.f94320d.B(f10, f11, f12, f13);
    }

    public b(b bVar) {
        this(bVar.f94297a, bVar.f94320d);
    }
}
