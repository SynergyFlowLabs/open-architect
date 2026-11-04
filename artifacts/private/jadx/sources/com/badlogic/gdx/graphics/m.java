package com.badlogic.gdx.graphics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f94829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f94830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f94831h;

    public m(int i10, int i11, String str) {
        this(i10, i11, str, 0);
    }

    public static m a() {
        return new m(256, 3, com.badlogic.gdx.graphics.glutils.j.f94730h3);
    }

    public static m b(int i10) {
        return new m(64, 2, "a_boneWeight" + i10, i10);
    }

    public static m c() {
        return new m(4, 4, 5121, true, com.badlogic.gdx.graphics.glutils.j.H1);
    }

    public static m d() {
        return new m(2, 4, 5126, false, com.badlogic.gdx.graphics.glutils.j.H1);
    }

    public static m e() {
        return new m(8, 3, com.badlogic.gdx.graphics.glutils.j.f94734p1);
    }

    public static m f() {
        return new m(1, 3, com.badlogic.gdx.graphics.glutils.j.f94733p0);
    }

    public static m g() {
        return new m(128, 3, com.badlogic.gdx.graphics.glutils.j.f94729g3);
    }

    public static m h(int i10) {
        return new m(16, 2, com.badlogic.gdx.graphics.glutils.j.f94735p2 + i10, i10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return i((m) obj);
        }
        return false;
    }

    public int hashCode() {
        return (((j() * com.rabbitmq.client.a.f264854y) + this.f94825b) * com.rabbitmq.client.a.f264854y) + this.f94829f.hashCode();
    }

    public boolean i(m mVar) {
        return mVar != null && this.f94824a == mVar.f94824a && this.f94825b == mVar.f94825b && this.f94829f.equals(mVar.f94829f) && this.f94830g == mVar.f94830g;
    }

    public int j() {
        return (this.f94831h << 8) + (this.f94830g & 255);
    }

    public m(int i10, int i11, String str, int i12) {
        this(i10, i11, i10 == 4 ? 5121 : 5126, i10 == 4, str, i12);
    }

    private m(int i10, int i11, int i12, boolean z10, String str) {
        this(i10, i11, i12, z10, str, 0);
    }

    private m(int i10, int i11, int i12, boolean z10, String str, int i13) {
        this.f94824a = i10;
        this.f94825b = i11;
        this.f94827d = i12;
        this.f94826c = z10;
        this.f94829f = str;
        this.f94830g = i13;
        this.f94831h = Integer.numberOfTrailingZeros(i10);
    }
}
