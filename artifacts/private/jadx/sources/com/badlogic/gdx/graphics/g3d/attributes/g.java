package com.badlogic.gdx.graphics.g3d.attributes;

/* JADX INFO: loaded from: classes3.dex */
public class g extends com.badlogic.gdx.graphics.g3d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f94340e = "cullface";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f94341f = com.badlogic.gdx.graphics.g3d.a.p(f94340e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94342d;

    public g(long j10) {
        super(j10);
    }

    public static g r(int i10) {
        return new g(f94341f, i10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public int hashCode() {
        return (super.hashCode() * 983) + this.f94342d;
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public com.badlogic.gdx.graphics.g3d.a k() {
        return new g(this.f94297a, this.f94342d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.badlogic.gdx.graphics.g3d.a aVar) {
        long j10 = this.f94297a;
        long j11 = aVar.f94297a;
        return j10 != j11 ? (int) (j10 - j11) : this.f94342d - ((g) aVar).f94342d;
    }

    public g(long j10, int i10) {
        super(j10);
        this.f94342d = i10;
    }
}
